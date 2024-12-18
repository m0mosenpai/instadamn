package X;

import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HkP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39753HkP {
    public static Map A00(AudioFilterInfoIntf audioFilterInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (audioFilterInfoIntf.B6T() != null) {
            AudioFilterType B6T = audioFilterInfoIntf.B6T();
            C14360o3.A0B(B6T, 0);
            A1I.put("filter_type", B6T.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
