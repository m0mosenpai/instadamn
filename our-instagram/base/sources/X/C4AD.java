package X;

import com.facebook.common.dextricks.Constants;
import java.lang.ref.WeakReference;

/* renamed from: X.4AD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AD {
    public int A00;
    public int A01;
    public int A02;
    public WeakReference A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C75363a3 A07;
    public final String A08;

    public C4AD(C75363a3 c75363a3, String str) {
        C14360o3.A0B(c75363a3, 1);
        C14360o3.A0B(str, 2);
        this.A07 = c75363a3;
        this.A08 = str;
        this.A02 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        this.A01 = -1;
    }

    public final C4AF A00() {
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            return (C4AF) weakReference.get();
        }
        return null;
    }

    public final void A01(C4AF c4af, int i) {
        this.A03 = new WeakReference(c4af);
        this.A00 = i;
    }
}
