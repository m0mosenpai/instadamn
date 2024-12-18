package X;

import com.instagram.api.schemas.LocationNoteResponseInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hpb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40049Hpb {
    public static Map A00(LocationNoteResponseInfo locationNoteResponseInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (locationNoteResponseInfo.BOO() != null) {
            A1I.put("location_id", locationNoteResponseInfo.BOO());
        }
        if (locationNoteResponseInfo.BOP() != null) {
            A1I.put("location_name", locationNoteResponseInfo.BOP());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
