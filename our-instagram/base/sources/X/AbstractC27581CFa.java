package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;

/* renamed from: X.CFa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27581CFa {
    public static final void A00(C5Tl c5Tl, MediaType mediaType, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        C2DC A0d;
        AbstractC167007dF.A1E(str, 0, interfaceC16820sZ);
        c5Tl.Enr(-139339070);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, mediaType);
        }
        if ((i2 & 896) == 0) {
            i3 |= AbstractC25236BEt.A03(c5Tl, i);
        }
        if ((i2 & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1257222552, "com.instagram.comments.mvvm.view.compose.AvatarSticker (AvatarSticker.kt:29)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            if (mediaType == MediaType.A04) {
                c5Tl.Eno(-795732587);
                UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
                A0d = C5Y9.A00(C74N.A02(A0K, A0u, str, AbstractC13690mv.A01(A0K, i), AbstractC13690mv.A01(A0K, i), AbstractC47041Kqy.A00(A0u)), c5Tl);
            } else {
                c5Tl.Eno(-795431143);
                A0d = AbstractC25235BEs.A0d(c5Tl, str);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0C = AbstractC118185Wd.A0C(c1130158n, i);
            AbstractC12990ll A0d2 = AbstractC25229BEm.A0d(c5Tl);
            if (C18U.A06(AbstractC25225BEi.A0j(A0d2, 0), A0d2, 36320322219352426L)) {
                A0C = A0C.Eq3(C5XR.A06(c1130158n, interfaceC16820sZ));
            }
            C6LQ.A0C(c5Tl, A0C, A0d, C5YD.A00(c5Tl, 2131953534), 8);
            if (C0fH.A02()) {
                C0fH.A00(1489718233);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30222DTb(mediaType, interfaceC16820sZ, str, i, i2, 2);
        }
    }
}
