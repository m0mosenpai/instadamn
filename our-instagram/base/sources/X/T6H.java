package X;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class T6H implements InterfaceC65418Tjp {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Tjp] */
    @Override // X.InterfaceC65418Tjp
    public final Object FFd(Object obj) {
        zzl zzlVar = (zzl) obj;
        List A01 = SSX.A01(zzlVar.A04);
        String str = zzlVar.A07;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        Rect A00 = SSX.A00(A01);
        String str2 = zzlVar.A08;
        if (str2 == null || str2.isEmpty()) {
            str2 = "und";
        }
        return new RW9(A00, str, str2, A01, AbstractC62212S2h.A00(new Object(), Arrays.asList(zzlVar.A0A)));
    }
}