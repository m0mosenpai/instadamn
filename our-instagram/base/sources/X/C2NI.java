package X;

import android.os.Build;

/* renamed from: X.2NI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2NI extends C2NB {
    @Override // X.C2NB
    public final int A00() {
        return 7;
    }

    @Override // X.C2NB
    public final boolean A01(C48412Ki c48412Ki) {
        C14360o3.A0B(c48412Ki, 0);
        Integer num = c48412Ki.A0B.A02;
        if (num != C05F.A0C) {
            if (Build.VERSION.SDK_INT >= 30 && num == C05F.A0j) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C2NB
    public final /* bridge */ /* synthetic */ boolean A02(Object obj) {
        C50Y c50y = (C50Y) obj;
        C14360o3.A0B(c50y, 0);
        if (c50y.A00 && !c50y.A01) {
            return false;
        }
        return true;
    }
}
