package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MjM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51178MjM extends C3F1 {
    public final TimeInterpolator A00;
    public final OmniGridLayoutManager A02;
    public final List A03 = AbstractC166987dD.A1E();
    public final List A01 = AbstractC166987dD.A1E();

    @Override // X.C3F1
    public final boolean A0D(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo) {
        return A01(c3oo, false);
    }

    @Override // X.C3F1
    public final boolean A0E(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo) {
        return A01(c3oo, false);
    }

    @Override // X.C3F1
    public final boolean A0F(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo) {
        return A01(c3oo, true);
    }

    @Override // X.C3F1
    public final boolean A0G(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo, C3OO c3oo2) {
        return A01(c3oo, false);
    }

    @Override // X.C3F1
    public final boolean A0H(C3OO c3oo) {
        return true;
    }

    private final void A00(OBW obw) {
        AbstractC51368MmT abstractC51368MmT;
        MVN mvn = obw.A03;
        C3OO c3oo = obw.A02;
        View A06 = AbstractC31171DnF.A06(c3oo);
        if (mvn.A07) {
            A06.setElevation(0.0f);
        }
        mvn.A01(A06, true);
        if ((c3oo instanceof AbstractC51368MmT) && (abstractC51368MmT = (AbstractC51368MmT) c3oo) != null) {
            abstractC51368MmT.A01(C05F.A01);
        }
        A0C(c3oo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a1, code lost:
    
        if (r2 <= 1.618d) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01(X.C3OO r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51178MjM.A01(X.3OO, boolean):boolean");
    }

    @Override // X.C3F1
    public final void A0I() {
        List list = this.A03;
        Iterator it = AbstractC001800i.A0a(list).iterator();
        while (it.hasNext()) {
            A00((OBW) it.next());
        }
        list.clear();
        List list2 = this.A01;
        Iterator it2 = AbstractC001800i.A0a(list2).iterator();
        while (it2.hasNext()) {
            MSX.A10(((OBW) it2.next()).A02.itemView);
        }
        list2.clear();
        A0A();
    }

    @Override // X.C3F1
    public final void A0J() {
        List<OBW> list = this.A03;
        for (OBW obw : list) {
            C3OO c3oo = obw.A02;
            MVN mvn = obw.A03;
            ViewPropertyAnimator animate = AbstractC31171DnF.A06(c3oo).animate();
            this.A01.add(obw);
            C26076Bg5 c26076Bg5 = (C26076Bg5) mvn.A02;
            if (c26076Bg5 != null) {
                animate.setDuration(c26076Bg5.A00);
                animate.setStartDelay(0L);
                TimeInterpolator timeInterpolator = (TimeInterpolator) c26076Bg5.A01;
                if (timeInterpolator != null) {
                    animate.setInterpolator(timeInterpolator);
                }
            } else {
                animate.setDuration(obw.A01);
                animate.setStartDelay(obw.A00);
            }
            boolean z = mvn.A07;
            Number number = (Number) mvn.A05;
            float f = 0.0f;
            if (number != null) {
                float floatValue = number.floatValue();
                if (z) {
                    floatValue = 0.0f;
                }
                animate.translationX(floatValue);
            }
            Number number2 = (Number) mvn.A06;
            if (number2 != null) {
                float floatValue2 = number2.floatValue();
                if (!z) {
                    f = floatValue2;
                }
                animate.translationY(f);
            }
            Number number3 = (Number) mvn.A03;
            float f2 = 1.0f;
            if (number3 != null) {
                float floatValue3 = number3.floatValue();
                if (z) {
                    floatValue3 = 1.0f;
                }
                animate.scaleX(floatValue3);
            }
            Number number4 = (Number) mvn.A04;
            if (number4 != null) {
                float floatValue4 = number4.floatValue();
                if (z) {
                    floatValue4 = 1.0f;
                }
                animate.scaleY(floatValue4);
            }
            Number number5 = (Number) mvn.A01;
            if (number5 != null) {
                float floatValue5 = number5.floatValue();
                if (!z) {
                    f2 = floatValue5;
                }
                animate.alpha(f2);
            }
            animate.setListener(new MaY(0, animate, c3oo, mvn, obw, this)).start();
        }
        list.clear();
    }

    @Override // X.C3F1
    public final void A0K(C3OO c3oo) {
        MSX.A10(c3oo.itemView);
        List list = this.A03;
        for (OBW obw : AbstractC001800i.A0a(list)) {
            if (c3oo.equals(obw.A02)) {
                A00(obw);
                list.remove(obw);
            }
        }
        if (!A0L()) {
            A0A();
        }
    }

    @Override // X.C3F1
    public final boolean A0L() {
        if ((!this.A03.isEmpty()) && AbstractC166987dD.A1b(this.A01)) {
            return true;
        }
        return false;
    }

    public C51178MjM(OmniGridLayoutManager omniGridLayoutManager) {
        this.A02 = omniGridLayoutManager;
        TimeInterpolator interpolator = new ValueAnimator().getInterpolator();
        C14360o3.A07(interpolator);
        this.A00 = interpolator;
    }
}
