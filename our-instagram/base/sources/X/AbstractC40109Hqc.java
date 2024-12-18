package X;

import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.api.schemas.NoteReactionType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hqc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40109Hqc {
    public static Map A00(NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (noteEmojiReactionInfoIntf.getEmoji() != null) {
            A1I.put("emoji", noteEmojiReactionInfoIntf.getEmoji());
        }
        if (noteEmojiReactionInfoIntf.Cf9() != null) {
            A1I.put("is_unseen", noteEmojiReactionInfoIntf.Cf9());
        }
        String str = null;
        if (noteEmojiReactionInfoIntf.Bkj() != null) {
            NoteReactionType Bkj = noteEmojiReactionInfoIntf.Bkj();
            if (Bkj != null) {
                str = Bkj.A00;
            }
            A1I.put("reaction_type", str);
        }
        AbstractC37302Gc3.A1T(noteEmojiReactionInfoIntf.CDj(), A1I);
        return AbstractC06930Yk.A0B(A1I);
    }
}
