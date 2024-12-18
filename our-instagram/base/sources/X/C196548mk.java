package X;

import android.graphics.Rect;

/* renamed from: X.8mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196548mk {
    public Rect A00;
    public boolean A02;
    public static final C196558ml A09 = new C196558ml(1);
    public static final C196558ml A05 = new C196558ml(2);
    public static final C196558ml A08 = new C196558ml(3);
    public static final C196558ml A07 = new C196558ml(4);
    public static final C196558ml A06 = new C196558ml(5);
    public boolean A01 = false;
    public boolean A04 = true;
    public boolean A03 = false;

    public final Object A00(C196558ml c196558ml) {
        boolean z;
        int i = c196558ml.A00;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        z = this.A03;
                    } else {
                        z = this.A02;
                    }
                } else {
                    z = this.A04;
                }
            } else {
                z = this.A01;
            }
            return Boolean.valueOf(z);
        }
        return this.A00;
    }

    public final void A01(C196558ml c196558ml, Object obj) {
        int i = c196558ml.A00;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Boolean bool = (Boolean) obj;
                    if (i != 4) {
                        this.A03 = bool.booleanValue();
                        return;
                    } else {
                        this.A02 = bool.booleanValue();
                        return;
                    }
                }
                this.A04 = ((Boolean) obj).booleanValue();
                return;
            }
            this.A01 = ((Boolean) obj).booleanValue();
            return;
        }
        this.A00 = (Rect) obj;
    }
}
