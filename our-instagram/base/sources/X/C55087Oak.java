package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Oak, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55087Oak {
    public ValueAnimator A00;
    public final ViewGroup A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final TargetViewSizeProvider A04;
    public final C88I A05;
    public final C1813982r A06;
    public final C1814382v A07;
    public final C8HB A08;
    public final C191068d2 A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;

    public C55087Oak(ViewGroup viewGroup, TargetViewSizeProvider targetViewSizeProvider, C88I c88i, C81J c81j, C1813982r c1813982r, C1814382v c1814382v, C8HB c8hb, C191068d2 c191068d2) {
        C14360o3.A0B(c81j, 1);
        AbstractC25234BEr.A0k(4, c191068d2, c1814382v, c1813982r, c88i);
        this.A01 = viewGroup;
        this.A04 = targetViewSizeProvider;
        this.A09 = c191068d2;
        this.A07 = c1814382v;
        this.A06 = c1813982r;
        this.A05 = c88i;
        this.A08 = c8hb;
        AbstractC59962oe A0M = c81j.A0M();
        C14360o3.A07(A0M);
        this.A02 = A0M;
        UserSession userSession = c81j.A0S;
        C14360o3.A07(userSession);
        this.A03 = userSession;
        this.A0N = C57519Pft.A00(this, 37);
        this.A0M = C57519Pft.A00(this, 36);
        this.A0L = C57519Pft.A00(this, 35);
        this.A0E = C57519Pft.A00(this, 27);
        this.A0O = C57519Pft.A00(this, 38);
        this.A0C = C57519Pft.A00(this, 25);
        this.A0A = C57519Pft.A00(this, 23);
        this.A0B = C57519Pft.A00(this, 24);
        this.A0D = C57519Pft.A00(this, 26);
        this.A0H = C57519Pft.A00(this, 30);
        this.A0I = C57519Pft.A00(this, 31);
        this.A0G = C57519Pft.A00(this, 29);
        this.A0F = C57519Pft.A00(this, 28);
        this.A0K = C57519Pft.A00(this, 33);
        this.A0J = C57519Pft.A00(this, 32);
        this.A0P = C57519Pft.A00(this, 39);
    }

    public final View A02() {
        C174757qB c174757qB = this.A06.A02;
        if (c174757qB != null) {
            return c174757qB.A0F;
        }
        return null;
    }

    public final View A03() {
        return AbstractC167007dF.A0L(this.A0M);
    }

    public static final void A00(C55087Oak c55087Oak) {
        View A02 = c55087Oak.A02();
        if (A02 != null) {
            AbstractC167007dF.A0L(c55087Oak.A0M).setY(A02.getY());
        }
        View A022 = c55087Oak.A02();
        if (A022 != null) {
            AbstractC167007dF.A0L(c55087Oak.A0M).setX(A022.getX());
        }
        AbstractC167007dF.A0L(c55087Oak.A0M).requestLayout();
    }

    public static final void A01(C55087Oak c55087Oak, C26044BfX c26044BfX) {
        View A02 = c55087Oak.A02();
        if (A02 != null) {
            A02.setTag(c26044BfX);
            boolean z = c26044BfX.A05;
            C29900DGo c29900DGo = new C29900DGo(43, c26044BfX, c55087Oak, A02);
            C174757qB c174757qB = c55087Oak.A06.A02;
            if (c174757qB != null) {
                View A00 = c174757qB.A0H.A00();
                if (z) {
                    A00.setVisibility(8);
                }
                c29900DGo.invoke();
                if (z) {
                    C11T.A04(new PRE(A00, c55087Oak), 170L);
                } else {
                    A00(c55087Oak);
                }
            }
        }
    }
}
