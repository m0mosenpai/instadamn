package X;

import android.animation.Animator;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class BR2 extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Animator A03;
    public final C206209Bd A04;
    public final C25547BRj A05;
    public final C2XI A06;
    public final C2XI A07;
    public final C2XI A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C2XI c2xi;
        C2XI c2xi2;
        C2XI c2xi3;
        Animator animator;
        C206209Bd c206209Bd;
        String str;
        C14360o3.A0B(c76223bS, 0);
        C75933ay c75933ay = C51722Yv.A02;
        C25547BRj c25547BRj = this.A05;
        C51722Yv c51722Yv = null;
        C51722Yv A00 = C9CV.A00(AbstractC25233BEq.A0Q(AbstractC25234BEr.A0L(null, C05F.A00, 0, AbstractC25225BEi.A09(c25547BRj.A00)), this.A00), C05F.A0j, 4, 0);
        boolean z = this.A0D;
        if (z && this.A0E && (c2xi3 = this.A08) != null && (animator = this.A03) != null && (c206209Bd = this.A04) != null && (str = this.A0B) != null) {
            A00 = A00.A00(C25537BQz.A00.A01(animator, c206209Bd, c2xi3, this.A0A, str, z));
        }
        if (this.A0C && (c2xi = this.A06) != null && (c2xi2 = this.A07) != null) {
            A00 = A00.A00(AbstractC25231BEo.A0X(c2xi2, AbstractC25231BEo.A0X(c2xi, null, C05F.A0u), C05F.A15));
        }
        int i = this.A02;
        if (i > 0) {
            C9CT A0m = AbstractC25225BEi.A0m(C05F.A0C, 0.0f, 1);
            if (A00 != c75933ay) {
                c51722Yv = A00;
            }
            A00 = AbstractC25225BEi.A0h(c51722Yv, A0m);
        }
        return new C77973eP(A00, this.A09, (ImageUrl) c25547BRj.A01, null, AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A04(c76223bS.A05.A0C)), i, this.A01, false, true, false);
    }

    public BR2(Animator animator, C206209Bd c206209Bd, C25547BRj c25547BRj, C2XI c2xi, C2XI c2xi2, C2XI c2xi3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A13(userSession, c25547BRj, interfaceC11380iw);
        this.A0A = userSession;
        this.A05 = c25547BRj;
        this.A09 = interfaceC11380iw;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A0D = z;
        this.A0C = z2;
        this.A0E = z3;
        this.A08 = c2xi;
        this.A03 = animator;
        this.A04 = c206209Bd;
        this.A0B = str;
        this.A06 = c2xi2;
        this.A07 = c2xi3;
    }
}
