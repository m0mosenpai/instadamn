package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HxN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40483HxN {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.1vN] */
    public static final Object A00(C6FQ c6fq) {
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        EnumC37328GcW enumC37328GcW = EnumC37328GcW.A04;
        C37327GcV.A00(A0W, enumC37328GcW).EEw(enumC37328GcW);
        C19270xB A0D = AbstractC31171DnF.A0D("digital_reset_clear_client_caches_action");
        C14360o3.A0B(A0W, 0);
        C5R5 A01 = C77453dV.A01(AbstractC116865Qp.A00(A0D), A0W, A0D.getModuleName());
        if (A01 instanceof C5R4) {
            ((C5R4) A01).AHy(A0W);
        }
        C1EW.A02(A0W).A07();
        C1P3 A00 = C1P2.A00(AbstractC58562mF.A00(A0W).A01);
        synchronized (A00) {
            C14360o3.A0B("explore_prefetch", 0);
            A00.A00.remove("explore_prefetch");
        }
        AbstractC25651Mw.A00(A0W).E4s(new Object());
        return null;
    }
}
