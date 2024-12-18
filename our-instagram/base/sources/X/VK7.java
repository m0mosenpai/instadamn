package X;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes11.dex */
public abstract class VK7 {
    public Object A00;
    public boolean A01;

    public final void A00() {
        if (this instanceof UDD) {
            UDD udd = (UDD) this;
            if (!udd.A05) {
                udd.A05 = true;
                udd.A01.D9v(udd);
                return;
            }
            return;
        }
        UDE ude = (UDE) this;
        UD8 ud8 = ude.A04;
        if (ud8.A04 != ude) {
            return;
        }
        if (ud8.A0F) {
            ud8.A06 = ude;
            ud8.A05 = ude.A00;
        } else {
            ude.A00.D9v(ude);
        }
        ude.A00 = null;
        ud8.A0L(false);
        ActionBarContextView actionBarContextView = ud8.A09;
        if (actionBarContextView.A01 == null) {
            actionBarContextView.A04();
        }
        ud8.A0A.setHideOnContentScrollEnabled(ud8.A0G);
        ud8.A04 = null;
    }

    public final void A01() {
        if (this instanceof UDD) {
            UDD udd = (UDD) this;
            udd.A01.DaH(udd.A02, udd);
            return;
        }
        UDE ude = (UDE) this;
        if (ude.A04.A04 != ude) {
            return;
        }
        WQH wqh = ude.A03;
        wqh.A06();
        try {
            ude.A00.DaH(wqh, ude);
        } finally {
            wqh.A05();
        }
    }
}
