package X;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class T6I implements InterfaceC65418Tjp {
    @Override // X.InterfaceC65418Tjp
    public final Object FFd(Object obj) {
        zzr zzrVar = (zzr) obj;
        List A01 = SSX.A01(zzrVar.A01);
        String str = zzrVar.A03;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        Rect A00 = SSX.A00(A01);
        String str2 = zzrVar.A04;
        if (str2 == null || str2.isEmpty()) {
            str2 = "und";
        }
        return new AbstractC62588SHo(A00, str, str2, A01);
    }
}
