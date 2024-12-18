package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.CEa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27555CEa {
    public static final C136946Hx A00(C5Tl c5Tl, C136936Hw c136936Hw, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, int i2, boolean z) {
        InterfaceC16820sZ interfaceC16820sZ5 = interfaceC16820sZ;
        InterfaceC16820sZ interfaceC16820sZ6 = interfaceC16820sZ2;
        InterfaceC16820sZ interfaceC16820sZ7 = interfaceC16820sZ3;
        InterfaceC16820sZ interfaceC16820sZ8 = interfaceC16820sZ4;
        C14360o3.A0B(c136936Hw, 0);
        c5Tl.Eno(-2038631347);
        if ((i2 & 4) != 0) {
            i = 0;
        }
        boolean A1U = AbstractC25226BEj.A1U(i2 & 8, z);
        if ((i2 & 16) != 0) {
            interfaceC16820sZ5 = null;
        }
        if ((i2 & 32) != 0) {
            interfaceC16820sZ6 = null;
        }
        if ((i2 & 64) != 0) {
            interfaceC16820sZ7 = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC16820sZ8 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1722081965, "com.instagram.barcelona.feed.post.video.rememberPostVideoState (PostVideoState.kt:47)");
        }
        Context A0K = AbstractC25228BEl.A0K(c5Tl);
        UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) c5Tl.AJX(AbstractC117915Vb.A00);
        Object A0q = AbstractC25227BEk.A0q(c5Tl, 263649822);
        if (A0q == C5UI.A00) {
            A0q = new C136946Hx(A0K, AbstractC25230BEn.A0U(Integer.valueOf(i)), c136936Hw, A0u, interfaceC60442pS, str, A1U);
            c5Tl.FBy(A0q);
        }
        C136946Hx c136946Hx = (C136946Hx) A0q;
        C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
        c136946Hx.A05.Egh(interfaceC16820sZ5);
        c136946Hx.A07.Egh(interfaceC16820sZ6);
        c136946Hx.A08.Egh(interfaceC16820sZ7);
        c136946Hx.A06.Egh(interfaceC16820sZ8);
        if (C0fH.A02()) {
            C0fH.A00(-809587184);
        }
        C117505Tk.A0I(A0J);
        return c136946Hx;
    }
}
