package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.V2k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67920V2k extends C2US {
    public C67933V2y A00;
    public C67934V2z A01;
    public KEJ A02;
    public C67930V2u A03;
    public C67931V2v A04;
    public V34 A05;
    public EQX A06;
    public V2w A07;
    public C32432EQk A08;
    public C168737g7 A09;
    public final C67926V2q A0A;

    public C67920V2k(Context context, InterfaceC71976XDj interfaceC71976XDj, V16 v16, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C168737g7 c168737g7 = new C168737g7(context);
        this.A09 = c168737g7;
        C32432EQk c32432EQk = new C32432EQk(context);
        this.A08 = c32432EQk;
        C67931V2v c67931V2v = new C67931V2v(context, interfaceC11380iw);
        this.A04 = c67931V2v;
        KEJ kej = new KEJ(context);
        this.A02 = kej;
        EQX eqx = new EQX(context);
        this.A06 = eqx;
        V34 v34 = new V34(context, interfaceC71976XDj, interfaceC11380iw, userSession);
        this.A05 = v34;
        C67926V2q c67926V2q = new C67926V2q(context);
        this.A0A = c67926V2q;
        C67933V2y c67933V2y = new C67933V2y(context, v16, interfaceC11380iw);
        this.A00 = c67933V2y;
        V2w v2w = new V2w(userSession, context);
        this.A07 = v2w;
        C67934V2z c67934V2z = new C67934V2z(context, interfaceC11380iw, userSession);
        this.A01 = c67934V2z;
        init(c168737g7, c32432EQk, c67931V2v, kej, eqx, v34, c67926V2q, c67933V2y, v2w, c67934V2z);
    }

    public final void A00(List list) {
        InterfaceC65642y0 interfaceC65642y0;
        C14360o3.A0B(list, 0);
        clear();
        for (Object obj : list) {
            if (obj instanceof C68249VJl) {
                interfaceC65642y0 = this.A00;
                if (interfaceC65642y0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (obj instanceof C69792VvX) {
                interfaceC65642y0 = this.A07;
                if (interfaceC65642y0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (obj instanceof C31335Dq0) {
                Object obj2 = new Object();
                C168737g7 c168737g7 = this.A09;
                if (c168737g7 != null) {
                    addModel(obj, obj2, c168737g7);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (obj instanceof C35200Ffs) {
                interfaceC65642y0 = this.A08;
                if (interfaceC65642y0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (obj instanceof C69340Vlm) {
                interfaceC65642y0 = this.A04;
                if (interfaceC65642y0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (obj instanceof C47524Kyr) {
                interfaceC65642y0 = this.A02;
                if (interfaceC65642y0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (obj instanceof C35246Fgf) {
                interfaceC65642y0 = this.A06;
                if (interfaceC65642y0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (obj instanceof InterfaceC72003XEr) {
                interfaceC65642y0 = this.A05;
            } else if (obj instanceof VRQ) {
                interfaceC65642y0 = this.A0A;
            } else if (C45125Jxu.A00(obj, 4)) {
                interfaceC65642y0 = this.A01;
            } else if (obj instanceof WeH) {
                interfaceC65642y0 = this.A03;
            }
            addModel(obj, interfaceC65642y0);
        }
        notifyDataSetChanged();
    }

    public C67920V2k(Context context, InterfaceC71976XDj interfaceC71976XDj, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        V34 v34 = new V34(context, interfaceC71976XDj, interfaceC11380iw, userSession);
        this.A05 = v34;
        C67926V2q c67926V2q = new C67926V2q(context);
        this.A0A = c67926V2q;
        C67931V2v c67931V2v = new C67931V2v(context, interfaceC11380iw);
        this.A04 = c67931V2v;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A09 = c168737g7;
        init(v34, c67926V2q, c67931V2v, c168737g7);
    }

    public C67920V2k(Context context, InterfaceC11380iw interfaceC11380iw) {
        C67926V2q c67926V2q = new C67926V2q(context);
        this.A0A = c67926V2q;
        C67930V2u c67930V2u = new C67930V2u(context, interfaceC11380iw);
        this.A03 = c67930V2u;
        C67931V2v c67931V2v = new C67931V2v(context, interfaceC11380iw);
        this.A04 = c67931V2v;
        init(c67926V2q, c67930V2u, c67931V2v);
    }
}
