package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.VQt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68437VQt {
    public static final Object A00(C6FW c6fw) {
        InterfaceC08430c6 interfaceC08430c6;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        FragmentActivity A03 = C6BQ.A03((C6FG) A00);
        AbstractC167017dG.A1N(A03, A0d);
        WGI wgi = WGI.A00;
        List A032 = C66224U4u.A03(C66224U4u.A00(A03));
        if (A032 != null && !A032.isEmpty()) {
            interfaceC08430c6 = WGI.A00(wgi, A0d, A032);
        } else {
            interfaceC08430c6 = null;
        }
        InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) interfaceC08430c6;
        if (interfaceC72040XGi == null) {
            AbstractC25241Le.A02("CDSBloksBottomSheetController", "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID");
            return null;
        }
        interfaceC72040XGi.EEk(A0d);
        return null;
    }
}
