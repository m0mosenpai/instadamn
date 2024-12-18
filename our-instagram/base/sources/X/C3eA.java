package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3eA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3eA implements InterfaceC77833eB {
    public static final C3eA A00 = new Object();

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        return !obj.equals(obj2);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        C79623hD c79623hD;
        View view = (View) obj;
        C206299Bm c206299Bm = (C206299Bm) obj2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c206299Bm, 2);
        C38321qM c38321qM = (C38321qM) c206299Bm.A03;
        UserSession userSession = (UserSession) c206299Bm.A06;
        C71313Hs c71313Hs = (C71313Hs) c206299Bm.A02;
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) c206299Bm.A01;
        Object obj4 = c206299Bm.A05;
        Integer num = (Integer) c206299Bm.A04;
        boolean z = c206299Bm.A08;
        boolean z2 = c206299Bm.A07;
        c71313Hs.A04(view);
        view.hashCode();
        if (obj4 != null) {
            c71313Hs.A08(view, new C71353Hw(num, obj4, null, null));
        }
        String str = null;
        if (z) {
            C75113Zb c75113Zb = new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
            if (c38321qM.A4m() && num != null) {
                c75113Zb.A0B(num.intValue() + 1);
            }
            C86933u7 c86933u7 = new C86933u7(context, c75113Zb, userSession, c38321qM);
            if (z2) {
                str = "in_app_browser_v2";
            }
            c79623hD = new C79623hD(c86933u7, userSession, c38321qM, interfaceC60442pS, str, C16910sj.A00);
        } else {
            c79623hD = new C79623hD(null, userSession, c38321qM, interfaceC60442pS);
        }
        c71313Hs.A0A(view, c79623hD);
        return C0eB.A00;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C206299Bm c206299Bm = (C206299Bm) obj2;
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c206299Bm, 2);
        view.hashCode();
        ((C71313Hs) c206299Bm.A02).A04(view);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }
}
