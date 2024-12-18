package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.73u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1571573u {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.70y, java.lang.Object] */
    public static final InterfaceC70513Em A00(View view, UserSession userSession, final InterfaceC70493Ek interfaceC70493Ek) {
        C71094Wnq c71094Wnq;
        C14360o3.A0B(userSession, 0);
        if (C33L.A01(userSession)) {
            c71094Wnq = new C71094Wnq(view, interfaceC70493Ek);
        } else {
            final ?? obj = new Object();
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.refreshablelistview_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            View findViewById = view.findViewById(android.R.id.list);
            C18C.A07(findViewById, AnonymousClass001.A0R("RefreshableListView not found in view: ", view.getClass().getSimpleName()));
            RefreshableListView refreshableListView = (RefreshableListView) findViewById;
            obj.A00 = refreshableListView;
            refreshableListView.setupAndEnableRefresh(new View.OnClickListener() { // from class: X.70z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int A05 = C0f9.A05(-1190256740);
                    interfaceC70493Ek.DeM();
                    C0f9.A0C(-2081621232, A05);
                }
            });
            c71094Wnq = obj;
        }
        return c71094Wnq;
    }

    public static final InterfaceC70513Em A01(View view, UserSession userSession, InterfaceC70493Ek interfaceC70493Ek) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(view, 1);
        return A02(view, userSession, interfaceC70493Ek, C05F.A0u);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3El, java.lang.Object] */
    public static final InterfaceC70513Em A02(View view, UserSession userSession, InterfaceC70493Ek interfaceC70493Ek, Integer num) {
        boolean A06;
        C71094Wnq c71094Wnq;
        C14360o3.A0B(userSession, 0);
        if (2 - num.intValue() != 0) {
            A06 = C33L.A01(userSession);
        } else {
            A06 = C18U.A06(C06090Tz.A05, userSession, 36315297107676304L);
        }
        if (A06) {
            c71094Wnq = new C71094Wnq(view, interfaceC70493Ek);
        } else {
            ?? obj = new Object();
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.refreshable_container_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.findViewById(R.id.refreshable_container);
            obj.A00 = refreshableNestedScrollingParent;
            C18C.A07(refreshableNestedScrollingParent, AnonymousClass001.A0R("RefreshableContainer not found in view: ", view.getClass().getSimpleName()));
            obj.A00.A07 = new C38054Goh(obj, interfaceC70493Ek);
            c71094Wnq = obj;
        }
        return c71094Wnq;
    }
}
