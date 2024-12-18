package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.33L, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C33L {
    public static final View A00(View view, UserSession userSession, Integer num) {
        C06090Tz c06090Tz;
        long j;
        boolean A06;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(num, 2);
        switch (num.intValue()) {
            case 2:
                c06090Tz = C06090Tz.A05;
                j = 36315297107676304L;
                A06 = C18U.A06(c06090Tz, userSession, j);
                break;
            case 3:
            default:
                A06 = false;
                break;
            case 4:
            case 5:
            case 6:
                c06090Tz = C06090Tz.A05;
                j = 36315297107479695L;
                A06 = C18U.A06(c06090Tz, userSession, j);
                break;
        }
        if (A06) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.swiperefreshlayout_stub);
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.findViewById(R.id.refreshable_container);
            if (refreshableNestedScrollingParent != null) {
                refreshableNestedScrollingParent.A0A = true;
            }
        } else {
            ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.refreshable_container_stub);
            if (viewStub2 != null) {
                View inflate = viewStub2.inflate();
                C14360o3.A07(inflate);
                return inflate;
            }
        }
        return view;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36315297107479695L);
    }
}
