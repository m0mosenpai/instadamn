package X;

import android.os.Binder;
import com.facebook.common.binderhooker.BinderHook;

/* renamed from: X.0Dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03290Dn {
    public final Binder A00;
    public final C03300Dp A01;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[CurrentHookedData ");
        sb.append("Hooked Binder: ");
        sb.append(BinderHook.hookBinderToString(this.A00));
        sb.append("Hooked Data: ");
        C03300Dp c03300Dp = this.A01;
        if (c03300Dp != null) {
            str = "Have";
        } else {
            str = "Don't have - ";
        }
        sb.append(str);
        sb.append(c03300Dp);
        sb.append(" ]");
        return sb.toString();
    }

    public /* synthetic */ C03290Dn(Binder binder, long j) {
        C03300Dp c03300Dp;
        this.A00 = binder;
        if (j != 0) {
            c03300Dp = new C03300Dp(j);
        } else {
            c03300Dp = null;
        }
        this.A01 = c03300Dp;
    }
}
