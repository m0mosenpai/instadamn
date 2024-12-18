package X;

import android.view.View;

/* renamed from: X.3Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70743Fm {
    public int A00;
    public int A01;
    public AbstractC70763Fo A02;
    public boolean A03;
    public boolean A04;

    public final void A00() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A03 = false;
        this.A04 = false;
    }

    public final void A01(View view, int i) {
        int min;
        int A0D;
        int A01 = this.A02.A01();
        if (A01 >= 0) {
            boolean z = this.A03;
            AbstractC70763Fo abstractC70763Fo = this.A02;
            if (z) {
                A0D = abstractC70763Fo.A08(view) + this.A02.A01();
            } else {
                A0D = abstractC70763Fo.A0D(view);
            }
            this.A00 = A0D;
            this.A01 = i;
            return;
        }
        this.A01 = i;
        boolean z2 = this.A03;
        AbstractC70763Fo abstractC70763Fo2 = this.A02;
        if (z2) {
            int A03 = (abstractC70763Fo2.A03() - A01) - this.A02.A08(view);
            this.A00 = this.A02.A03() - A03;
            if (A03 <= 0) {
                return;
            }
            int A0B = this.A00 - this.A02.A0B(view);
            int A06 = this.A02.A06();
            int min2 = A0B - (A06 + Math.min(this.A02.A0D(view) - A06, 0));
            if (min2 >= 0) {
                return;
            } else {
                min = this.A00 + Math.min(A03, -min2);
            }
        } else {
            int A0D2 = abstractC70763Fo2.A0D(view);
            int A062 = A0D2 - this.A02.A06();
            this.A00 = A0D2;
            if (A062 <= 0) {
                return;
            }
            int A032 = (this.A02.A03() - Math.min(0, (this.A02.A03() - A01) - this.A02.A08(view))) - (A0D2 + this.A02.A0B(view));
            if (A032 >= 0) {
                return;
            } else {
                min = this.A00 - Math.min(A062, -A032);
            }
        }
        this.A00 = min;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1499));
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1431));
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(1432));
        sb.append(this.A03);
        sb.append(AbstractC111324zv.A00(1433));
        sb.append(this.A04);
        sb.append('}');
        return sb.toString();
    }

    public C70743Fm() {
        A00();
    }
}
