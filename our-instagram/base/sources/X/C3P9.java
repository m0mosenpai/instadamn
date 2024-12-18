package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3P9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3P9 {
    public static final C55942hf A0G = C55942hf.A03(10.0d, 20.0d);
    public double A00;
    public double A01;
    public float A02;
    public C55942hf A03;
    public C3PE A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final View A0E;
    public final List A0F;

    public C3P9(View view) {
        C14360o3.A0B(view, 1);
        this.A0E = view;
        this.A0F = new ArrayList();
        this.A03 = A0G;
        this.A08 = true;
        this.A06 = true;
        this.A01 = 0.01d;
        this.A00 = 0.01d;
        this.A02 = 0.9f;
        A01(view);
    }

    public final void A01(View view) {
        C14360o3.A0B(view, 0);
        List list = this.A0F;
        list.clear();
        list.add(new C3PA(view));
    }

    public final void A02(View... viewArr) {
        C14360o3.A0B(viewArr, 0);
        List list = this.A0F;
        list.clear();
        for (View view : viewArr) {
            if (view != null) {
                list.add(new C3PA(view));
            }
        }
    }

    public final C3PF A00() {
        if (!this.A0F.isEmpty()) {
            return new C3PF(this);
        }
        throw new IllegalStateException("Bouncy object(s) should be defined");
    }
}
