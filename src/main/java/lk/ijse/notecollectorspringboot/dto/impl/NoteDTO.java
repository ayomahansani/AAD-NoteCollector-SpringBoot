package lk.ijse.notecollectorspringboot.dto.impl;

import lk.ijse.notecollectorspringboot.dto.NoteStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class NoteDTO implements NoteStatus {
   private String noteId;
   private String noteTitle;
   private String noteDesc;
   private String createdDate;
   private String priorityLevel;
   private String userId;
}
