package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* renamed from: X.SZl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62968SZl {
    public static final C0B5 A04 = new C0B5("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M");
    public final C0B5 A00;
    public final java.util.Set A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    public final boolean A00(Context context) {
        if (!((C08610cP) this.A03.getValue()).A03(context, null, null) && Binder.getCallingPid() != Process.myPid()) {
            return false;
        }
        return true;
    }

    public C62968SZl(C0B5 c0b5, java.util.Set set) {
        AbstractC167017dG.A1P(c0b5, set);
        this.A00 = c0b5;
        this.A01 = set;
        this.A02 = AbstractC09440dt.A01(new X2w(this, 28));
        this.A03 = AbstractC09440dt.A01(new X2w(this, 29));
    }

    public final boolean A01(Context context, Intent intent) {
        if (Binder.getCallingPid() != Process.myPid() && !((C08610cP) this.A03.getValue()).A03(context, intent, null)) {
            return false;
        }
        return true;
    }
}
