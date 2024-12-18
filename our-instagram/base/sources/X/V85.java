package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: classes11.dex */
public final class V85 extends C3CI {
    public final C67972V4m A00;
    public final ReboundViewPager A01;
    public final UBD A02;

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        C47O c47o;
        C14360o3.A0B(c3ab, 0);
        UBD ubd = this.A02;
        C14360o3.A0B(ubd, 0);
        Object item = ubd.getItem(i);
        if (item instanceof C47L) {
            C47L c47l = (C47L) item;
            if (c47l.A07 == C47R.A0A) {
                c47o = c47l.A00();
            } else {
                return;
            }
        } else {
            c47o = (C47O) item;
        }
        if (c47o != null) {
            ReboundViewPager reboundViewPager = this.A01;
            if (VTJ.A00(reboundViewPager, 0.75d) && VTJ.A00(reboundViewPager.A0D(i), 0.5d)) {
                c3ab.FDn(c47o.getId(), c47o, i);
            }
        }
    }

    @Override // X.C36Z
    public final Class CAO() {
        return C47O.class;
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtG(Object obj) {
        C47O c47o = (C47O) obj;
        C14360o3.A0B(c47o, 0);
        C67972V4m.A00(this.A00, c47o.getId(), true);
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtI(Object obj, int i) {
        C47O c47o = (C47O) obj;
        C14360o3.A0B(c47o, 0);
        C67972V4m c67972V4m = this.A00;
        c67972V4m.A00.put(c47o.getId(), new C69352Vly(c67972V4m, c47o.A08, c47o.A04, c47o.A05, i, System.currentTimeMillis()));
    }

    public V85(ReboundViewPager reboundViewPager, C67972V4m c67972V4m, UBD ubd) {
        this.A01 = reboundViewPager;
        this.A02 = ubd;
        this.A00 = c67972V4m;
    }
}
