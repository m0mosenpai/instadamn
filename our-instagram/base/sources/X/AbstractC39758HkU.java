package X;

import com.instagram.api.schemas.AudioNoteResponseInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HkU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39758HkU {
    public static Map A00(AudioNoteResponseInfoIntf audioNoteResponseInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (audioNoteResponseInfoIntf.Adt() != null) {
            A1I.put("audio_info", audioNoteResponseInfoIntf.Adt().F7o());
        }
        if (audioNoteResponseInfoIntf.BOp() != null) {
            A1I.put("logging_id", audioNoteResponseInfoIntf.BOp());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
