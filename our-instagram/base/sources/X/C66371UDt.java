package X;

import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.UDt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66371UDt extends WPW implements InterfaceC71937XBm {
    public static Method A01;
    public InterfaceC71937XBm A00;

    public final void A01() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A01;
            if (method != null) {
                try {
                    method.invoke(this.A09, false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        VKO.A00(this.A09);
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // X.InterfaceC71937XBm
    public final void DNU(MenuItem menuItem, WQH wqh) {
        InterfaceC71937XBm interfaceC71937XBm = this.A00;
        if (interfaceC71937XBm != null) {
            interfaceC71937XBm.DNU(menuItem, wqh);
        }
    }

    @Override // X.InterfaceC71937XBm
    public final void DNV(MenuItem menuItem, WQH wqh) {
        InterfaceC71937XBm interfaceC71937XBm = this.A00;
        if (interfaceC71937XBm != null) {
            interfaceC71937XBm.DNV(menuItem, wqh);
        }
    }
}
