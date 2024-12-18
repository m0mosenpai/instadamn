package X;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: X.WKv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class MenuItemOnMenuItemClickListenerC70224WKv implements MenuItem.OnMenuItemClickListener {
    public static final Class[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            Method method = this.A01;
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(this.A00, menuItem)).booleanValue();
            }
            method.invoke(this.A00, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MenuItemOnMenuItemClickListenerC70224WKv(Object obj, String str) {
        this.A00 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.A01 = cls.getMethod(str, A02);
        } catch (Exception e) {
            InflateException inflateException = new InflateException(AnonymousClass001.A0u("Couldn't resolve menu item onClick handler ", str, " in class ", cls.getName()));
            inflateException.initCause(e);
            throw inflateException;
        }
    }
}
