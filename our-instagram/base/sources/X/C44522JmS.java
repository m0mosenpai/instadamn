package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.JmS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44522JmS extends AbstractC52922bZ {
    public String A00;
    public AnonymousClass195 A01;
    public boolean A02;
    public final UserSession A03;
    public final String A04;
    public final ArrayList A05;
    public final C05A A06;
    public final C0UO A07;

    public /* synthetic */ C44522JmS(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = str;
        this.A05 = AbstractC166987dD.A1E();
        this.A01 = new AnonymousClass197(null);
        C008002u A00 = C10E.A00(C49565LvK.A00);
        this.A06 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        A00(null);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0oO, java.lang.Object] */
    public final void A00(String str) {
        boolean z;
        C15370ps A1F = AbstractC25225BEi.A1F();
        A1F.A00 = "0";
        ?? obj = new Object();
        InterfaceC50400MNc interfaceC50400MNc = (InterfaceC50400MNc) this.A07.getValue();
        C14360o3.A0B(interfaceC50400MNc, 0);
        boolean z2 = interfaceC50400MNc instanceof C45297K2z;
        if ((z2 && C14360o3.A0K(str, ((C45297K2z) interfaceC50400MNc).A00)) || ((interfaceC50400MNc instanceof C45296K2y) && str == null)) {
            obj.A00 = true;
            if (z2) {
                C45297K2z c45297K2z = (C45297K2z) interfaceC50400MNc;
                A1F.A00 = c45297K2z.A01;
                z = c45297K2z.A03;
            } else if (interfaceC50400MNc instanceof C45296K2y) {
                C45296K2y c45296K2y = (C45296K2y) interfaceC50400MNc;
                A1F.A00 = c45296K2y.A00;
                z = c45296K2y.A02;
            }
            if (!z) {
                return;
            }
        }
        if (A1F.A00 != null) {
            C141796aw A00 = AbstractC141776au.A00(this);
            if (this.A01.isCancelled()) {
                this.A01 = new AnonymousClass197(null);
            }
            AbstractC23641Du.A05(this.A01, new MVR(A1F, this, (Object) obj, str, (InterfaceC23621Ds) null, 20), A00);
        }
    }
}
