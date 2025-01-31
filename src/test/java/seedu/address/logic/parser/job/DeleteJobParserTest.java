package seedu.address.logic.parser.job;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_INDEX;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_JOB;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.job.DeleteJob;


class DeleteJobParserTest {
    private DeleteJobParser parser = new DeleteJobParser();

    @Test
    public void parse_validArgs_returnsDeleteJob() {
        assertParseSuccess(parser, "1", new DeleteJob(INDEX_FIRST_JOB));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a",
                String.format(MESSAGE_INVALID_INDEX, DeleteJob.MESSAGE_USAGE));
    }
}
