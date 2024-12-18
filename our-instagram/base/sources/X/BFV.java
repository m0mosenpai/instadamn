package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;

/* loaded from: classes5.dex */
public abstract class BFV {
    public static final NoteAudience A00(Integer num) {
        NoteAudience noteAudience = (NoteAudience) NoteAudience.A01.get(num);
        if (noteAudience == null) {
            return NoteAudience.A08;
        }
        return noteAudience;
    }
}
