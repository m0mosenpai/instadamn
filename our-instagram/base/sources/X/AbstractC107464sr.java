package X;

import android.view.animation.Interpolator;

/* renamed from: X.4sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107464sr extends AbstractC107474ss {
    public final C107534sy A00;

    public void A0C(C42Q c42q) {
        C107534sy c107534sy;
        String str;
        C107454sq c107454sq = (C107454sq) this;
        C107604t5 c107604t5 = new C107604t5(c107454sq.A00);
        C107444sp c107444sp = c107454sq.A02;
        C107434so c107434so = c107444sp.A01;
        C107624t7 c107624t7 = new C107624t7(c42q.Aur(c107434so));
        C107624t7 c107624t72 = new C107624t7(c107444sp.A00);
        AbstractC107574t2 abstractC107574t2 = new AbstractC107574t2();
        Interpolator interpolator = c107454sq.A01;
        if (interpolator != null) {
            C107644t9 c107644t9 = new C107644t9(interpolator);
            c107534sy = ((AbstractC107464sr) c107454sq).A00;
            str = "default_input";
            c107534sy.A01(c107604t5, c107644t9, "default_input");
            c107534sy.A01(c107644t9, abstractC107574t2, "default_input");
        } else {
            c107534sy = ((AbstractC107464sr) c107454sq).A00;
            str = "default_input";
            c107534sy.A01(c107604t5, abstractC107574t2, "default_input");
        }
        c107534sy.A01(c107624t7, abstractC107574t2, "initial");
        c107534sy.A01(c107624t72, abstractC107574t2, "end");
        c107534sy.A01(abstractC107574t2, c42q.Abp(c107434so), str);
    }

    public AbstractC107464sr() {
        C107484st c107484st = C107484st.A08;
        if (c107484st == null) {
            C107494su c107494su = new C107494su();
            c107484st = new C107484st(c107494su);
            C107484st.A08 = c107484st;
            c107494su.A01 = c107484st;
        }
        C107534sy c107534sy = new C107534sy(c107484st);
        this.A00 = c107534sy;
        C107554t0 c107554t0 = new C107554t0(this);
        if (c107534sy.A00 != null) {
            throw new RuntimeException("Overriding existing listener!");
        }
        c107534sy.A00 = c107554t0;
    }
}
