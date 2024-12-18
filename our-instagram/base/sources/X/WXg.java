package X;

import android.content.Context;
import com.facebook.litho.ComponentHost;

/* loaded from: classes11.dex */
public final class WXg implements C2Wm {
    public final C51152Wl A00;

    @Override // X.C2Wm
    public final boolean EE6(Object obj) {
        C51152Wl c51152Wl = this.A00;
        if (c51152Wl == null || ((ComponentHost) obj).A0E) {
            return false;
        }
        return c51152Wl.EE6(obj);
    }

    @Override // X.C2Wm
    public final Object A7I(InterfaceC50822Vd interfaceC50822Vd) {
        C51152Wl c51152Wl = this.A00;
        if (c51152Wl != null) {
            return c51152Wl.A7I(interfaceC50822Vd);
        }
        return null;
    }

    @Override // X.C2Wm
    public final boolean CoK(Context context, InterfaceC50822Vd interfaceC50822Vd) {
        C51152Wl c51152Wl = this.A00;
        if (c51152Wl != null) {
            return c51152Wl.CoK(context, interfaceC50822Vd);
        }
        return false;
    }

    public WXg(int i, boolean z) {
        C51152Wl c51152Wl;
        if (z) {
            c51152Wl = new C51152Wl(ComponentHost.class, i);
        } else {
            c51152Wl = null;
        }
        this.A00 = c51152Wl;
    }
}
