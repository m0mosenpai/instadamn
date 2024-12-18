package X;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* renamed from: X.CqB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28960CqB implements InterfaceC77833eB {
    public static final C28960CqB A00 = new Object();

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C51759Mti c51759Mti = (C51759Mti) obj2;
        AbstractC167007dF.A1D(view, 1, c51759Mti);
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) c51759Mti.A01;
        C14360o3.A0B(abstractC12990ll, 0);
        if (C18U.A06(C06090Tz.A06, abstractC12990ll, 36319209823738930L)) {
            C27074Bwy c27074Bwy = new C27074Bwy(c51759Mti, 4);
            if (view instanceof ComponentHost) {
                ComponentHost componentHost = (ComponentHost) view;
                componentHost.A0J = true;
                C3P9 c3p9 = new C3P9(view);
                c3p9.A04 = c27074Bwy;
                c3p9.A0B = true;
                c3p9.A08 = false;
                c3p9.A07 = false;
                c3p9.A02 = 0.99f;
                c3p9.A01 = 0.005d;
                c3p9.A00 = 0.005d;
                c3p9.A09 = true;
                C3PF A002 = c3p9.A00();
                componentHost.A0J = false;
                return A002;
            }
            C3P9 c3p92 = new C3P9(view);
            c3p92.A04 = c27074Bwy;
            c3p92.A0B = true;
            c3p92.A08 = false;
            c3p92.A07 = false;
            c3p92.A02 = 0.99f;
            c3p92.A01 = 0.005d;
            c3p92.A00 = 0.005d;
            c3p92.A09 = true;
            return c3p92.A00();
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C3PF c3pf = (C3PF) obj4;
        C14360o3.A0B(view, 1);
        if (view instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) view;
            componentHost.A0J = true;
            if (c3pf != null) {
                c3pf.A03();
            }
            componentHost.A0J = false;
            return;
        }
        if (c3pf == null) {
            return;
        }
        c3pf.A03();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
