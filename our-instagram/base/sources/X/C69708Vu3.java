package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Vu3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69708Vu3 {
    public Interpolator A01;
    public C04F A02;
    public boolean A03;
    public long A00 = -1;
    public final AbstractC17900uT A05 = new UEU(this);
    public final ArrayList A04 = new ArrayList();

    public final void A00() {
        if (this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((C04E) it.next()).A00();
            }
            this.A03 = false;
        }
    }

    public final void A01() {
        if (!this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                C04E c04e = (C04E) it.next();
                long j = this.A00;
                if (j >= 0) {
                    c04e.A04(j);
                }
                Interpolator interpolator = this.A01;
                if (interpolator != null) {
                    c04e.A06(interpolator);
                }
                if (this.A02 != null) {
                    c04e.A07(this.A05);
                }
                c04e.A01();
            }
            this.A03 = true;
        }
    }
}
