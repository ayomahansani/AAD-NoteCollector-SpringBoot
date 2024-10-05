package lk.ijse.notecollectorspringboot.customStatusCodes;

import lk.ijse.notecollectorspringboot.dto.NoteStatus;
import lk.ijse.notecollectorspringboot.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserAndNoteErrorStatus implements UserStatus, NoteStatus {
    private int statusCode;
    private String statusMessage;
}
