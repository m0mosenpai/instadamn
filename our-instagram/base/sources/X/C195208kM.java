package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.8kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195208kM implements InterfaceC60152ox {
    public float A00;
    public int A01;
    public View A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C3I9 A07;
    public final InterfaceC195198kL A08;
    public final Context A09;

    public static final void A00(C195208kM c195208kM, int i) {
        int i2;
        float f;
        if (c195208kM.A02 != null) {
            if (c195208kM.A04 && i == 0) {
                return;
            }
            int A09 = AbstractC13880nE.A09(c195208kM.A09);
            if (c195208kM.A05 && i == 0) {
                f = c195208kM.A00;
            } else {
                A09 -= i;
                View view = c195208kM.A02;
                int i3 = 0;
                if (view != null) {
                    i2 = view.getHeight();
                } else {
                    i2 = 0;
                }
                int i4 = (A09 - i2) / 2;
                View view2 = c195208kM.A02;
                if (view2 != null) {
                    i3 = view2.getTop();
                }
                f = i4 - i3;
            }
            boolean z = c195208kM.A03;
            View view3 = c195208kM.A02;
            if (z) {
                if (view3 == null) {
                    return;
                }
                AbstractC125325le A00 = AbstractC125325le.A00(view3);
                A00.A0G();
                A00.A0K(f);
                A00.A05 = new C24095Amg(c195208kM, f, A09);
                A00.A0H();
                return;
            }
            if (view3 != null) {
                view3.setTranslationY(f);
            }
            c195208kM.A08.E0p((int) f, A09);
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (i == 0) {
            this.A08.DOI();
            if (!this.A06) {
                return;
            }
        } else {
            this.A01 = i;
        }
        A00(this, i);
    }

    public C195208kM(Context context, C3I9 c3i9, InterfaceC195198kL interfaceC195198kL) {
        this.A09 = context;
        this.A07 = c3i9;
        this.A08 = interfaceC195198kL;
    }
}
