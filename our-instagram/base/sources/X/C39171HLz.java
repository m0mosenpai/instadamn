package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.HLz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39171HLz extends C1I2 {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C39171HLz(C38947HCw c38947HCw) {
        this.A01 = 1;
        this.A02 = c38947HCw;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        View AnW;
        int bottom;
        View view;
        int computeVerticalScrollOffset;
        switch (this.A01) {
            case 0:
                A03 = C0f9.A03(-1093489814);
                i6 = 159020039;
                C0f9.A0A(i6, A03);
                return;
            case 1:
                A03 = C0f9.A03(453560980);
                C14360o3.A0B(c3fq, 0);
                boolean z = false;
                if (c3fq.B6q() != 0 || (AnW = c3fq.AnW(0)) == null || AnW.getTop() != c3fq.CFj().getPaddingTop()) {
                    z = true;
                }
                C41168IKh c41168IKh = ((C38947HCw) this.A02).A01;
                if (c41168IKh == null) {
                    C14360o3.A0F("viewHolder");
                    throw C00O.createAndThrow();
                }
                View view2 = c41168IKh.A01;
                int i7 = 8;
                if (z) {
                    i7 = 0;
                }
                view2.setVisibility(i7);
                i6 = -829250330;
                C0f9.A0A(i6, A03);
                return;
            default:
                A03 = C0f9.A03(-260637430);
                C14360o3.A0B(c3fq, 0);
                IEO ieo = (IEO) ((C37628GhN) this.A02).A0O.getValue();
                View view3 = (View) this.A00;
                if (i3 > 1) {
                    Integer num = ieo.A01;
                    if (num != null) {
                        bottom = num.intValue();
                    } else {
                        Object parent = view3.getParent();
                        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                            bottom = view.getBottom();
                        } else {
                            bottom = view3.getBottom() * 2;
                        }
                        ieo.A01 = Integer.valueOf(bottom);
                    }
                    if (!(c3fq instanceof C3FO) && !(c3fq instanceof C3FP)) {
                        computeVerticalScrollOffset = 0;
                    } else {
                        computeVerticalScrollOffset = ((C3FP) c3fq).A03.computeVerticalScrollOffset();
                    }
                    float f = -C17s.A03(computeVerticalScrollOffset, 0, bottom);
                    if (f != ieo.A00) {
                        view3.setY(f);
                        ieo.A00 = f;
                    }
                }
                i6 = -1137809280;
                C0f9.A0A(i6, A03);
                return;
        }
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03;
        int i2;
        C114775Gk c114775Gk;
        switch (this.A01) {
            case 0:
                A03 = C0f9.A03(356951997);
                if (i != 0 && (c114775Gk = (C114775Gk) this.A00) != null) {
                    c114775Gk.A00();
                }
                ((C61342qw) this.A02).F9f(this);
                i2 = -2066078785;
                break;
            case 1:
                A03 = C0f9.A03(381113554);
                i2 = -1672424093;
                break;
            default:
                super.onScrollStateChanged(c3fq, i);
                return;
        }
        C0f9.A0A(i2, A03);
    }

    public C39171HLz(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }
}
