package X;

import com.instagram.api.schemas.FileCandidate;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HnI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39927HnI {
    public static Map A00(FileCandidate fileCandidate) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (fileCandidate.B4U() != null) {
            A1I.put(AbstractC43591JPw.A00(155), fileCandidate.B4U());
        }
        if (fileCandidate.B6C() != null) {
            A1I.put("file_extension", fileCandidate.B6C());
        }
        if (fileCandidate.B6G() != null) {
            A1I.put("file_size", fileCandidate.B6G());
        }
        if (fileCandidate.Bdq() != null) {
            A1I.put("playable_url", fileCandidate.Bdq());
        }
        if (fileCandidate.Bdr() != null) {
            A1I.put("playable_url_expiration_timestamp_ms", fileCandidate.Bdr());
        }
        if (fileCandidate.Bds() != null) {
            A1I.put("playable_url_fallback", fileCandidate.Bds());
        }
        if (fileCandidate.C93() != null) {
            A1I.put("title_text", fileCandidate.C93());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
