package X;

import android.view.View;
import java.util.List;

/* renamed from: X.AlJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24026AlJ implements BE3 {
    public int A00;
    public C70993Wm9 A01;
    public W9A A02;
    public boolean A03;
    public int A04;
    public final View A05;
    public final InterfaceC189998bI A06;
    public final boolean A07;

    @Override // X.BE3
    public final void CO5(List list, int i, int i2, int i3) {
        this.A03 = true;
        this.A04 = i3;
        A01(this);
    }

    @Override // X.BE3
    public final void DUm(int i) {
        A00(i, true);
    }

    @Override // X.BE3
    public final void DnB(int i) {
    }

    private final void A00(int i, boolean z) {
        C70993Wm9 c70993Wm9 = this.A01;
        if (c70993Wm9 != null) {
            if (this.A02 != null) {
                int AYr = c70993Wm9.AYr(i);
                if (AYr != this.A00) {
                    if (AYr != -1) {
                        W9A w9a = this.A02;
                        if (w9a != null) {
                            if (!w9a.A05.isLaidOut()) {
                                w9a.A02 = new RunnableC24801AyN(w9a, AYr, z);
                            } else {
                                W9A.A01(w9a, AYr, z);
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    this.A00 = AYr;
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A01(C24026AlJ c24026AlJ) {
        if (c24026AlJ.A01 != null && c24026AlJ.A03) {
            W9A w9a = c24026AlJ.A02;
            if (w9a != null) {
                w9a.A00 = null;
                View view = w9a.A05;
                view.setBackground(null);
                view.setOnTouchListener(null);
            }
            View view2 = c24026AlJ.A05;
            C70993Wm9 c70993Wm9 = c24026AlJ.A01;
            if (c70993Wm9 != null) {
                c24026AlJ.A02 = new W9A(view2, c70993Wm9, new C68829Vck(c24026AlJ), c24026AlJ.A07);
                c24026AlJ.A00(c24026AlJ.A04, false);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.BE3
    public final void DnC(int i) {
        this.A04 = i;
        A00(i, true);
    }

    public C24026AlJ(View view, C190018bK c190018bK, boolean z) {
        AbstractC167017dG.A1P(view, c190018bK);
        this.A05 = view;
        this.A07 = z;
        c190018bK.A02.add(this);
        this.A06 = new C24027AlK(c190018bK);
        this.A00 = -1;
    }
}
