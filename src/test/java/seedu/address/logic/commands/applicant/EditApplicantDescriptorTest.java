package seedu.address.logic.commands.applicant;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.DESC_CHARLIE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.applicant.EditApplicant.EditApplicantDescriptor;
import seedu.address.testutil.EditApplicantDescriptorBuilder;

class EditApplicantDescriptorTest {
    @Test
    public void equals() {
        // same values -> returns true
        EditApplicantDescriptor descriptorWithSameValues = new EditApplicantDescriptor(DESC_CHARLIE);
        assertTrue(DESC_CHARLIE.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(DESC_CHARLIE.equals(DESC_CHARLIE));

        // null -> returns false
        assertFalse(DESC_CHARLIE.equals(null));

        // different types -> returns false
        assertFalse(DESC_CHARLIE.equals(5));

        // different values -> returns false
        assertFalse(DESC_CHARLIE.equals(DESC_BOB));

        // different name -> returns false
        EditApplicant.EditApplicantDescriptor editedCharlie = new EditApplicantDescriptorBuilder(DESC_CHARLIE)
                .withName(VALID_NAME_BOB).build();
        assertFalse(DESC_CHARLIE.equals(editedCharlie));

        // different phone -> returns false
        editedCharlie = new EditApplicantDescriptorBuilder(DESC_CHARLIE).withPhone(VALID_PHONE_BOB).build();
        assertFalse(DESC_CHARLIE.equals(editedCharlie));

        // different email -> returns false
        editedCharlie = new EditApplicantDescriptorBuilder(DESC_CHARLIE).withEmail(VALID_EMAIL_BOB).build();
        assertFalse(DESC_AMY.equals(editedCharlie));

        // different address -> returns false
        editedCharlie = new EditApplicantDescriptorBuilder(DESC_CHARLIE).withAddress(VALID_ADDRESS_BOB).build();
        assertFalse(DESC_AMY.equals(editedCharlie));

        // different tags -> returns false
        editedCharlie = new EditApplicantDescriptorBuilder(DESC_CHARLIE).withTags(VALID_TAG_HUSBAND).build();
        assertFalse(DESC_AMY.equals(editedCharlie));
    }

}
