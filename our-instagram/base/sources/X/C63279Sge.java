package X;

import android.os.Handler;
import android.view.ViewGroup;
import com.facebook.secure.securewebview.SecureWebView;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sge, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63279Sge {
    public long A00;
    public ViewGroup A01;
    public boolean A02;
    public final Handler A03;
    public final C0JO A04;
    public final Map A05;
    public final java.util.Set A06;
    public final UserSession A07;
    public final List A08;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0JO, java.lang.Object] */
    public C63279Sge(UserSession userSession, List list) {
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A08 = list;
        this.A04 = new Object();
        this.A06 = AbstractC166987dD.A1H();
        this.A05 = AbstractC166987dD.A1G();
        this.A03 = AbstractC167007dF.A0J();
    }

    public static final synchronized void A01(C63279Sge c63279Sge, String str) {
        synchronized (c63279Sge) {
            C68961Vez c68961Vez = (C68961Vez) c63279Sge.A05.get(str);
            if (c68961Vez != null) {
                c68961Vez.A00 = C05F.A01;
            }
        }
    }

    public static final SecureWebView A00(C63279Sge c63279Sge, String str) {
        ViewGroup viewGroup = c63279Sge.A01;
        if (viewGroup == null) {
            return null;
        }
        SecureWebView secureWebView = new SecureWebView(viewGroup.getContext().getApplicationContext());
        secureWebView.setWebViewClient(new C58715Q4n(c63279Sge, str));
        AbstractC62806SSa.A01(secureWebView, c63279Sge.A07, c63279Sge.A08);
        secureWebView.setTag(-1309867116, str);
        viewGroup.addView(secureWebView);
        return secureWebView;
    }

    public static final boolean A02(C63279Sge c63279Sge, String str) {
        ViewGroup viewGroup = c63279Sge.A01;
        if (viewGroup != null) {
            Iterable A0C = C17s.A0C(0, viewGroup.getChildCount());
            if (!(A0C instanceof Collection) || !((Collection) A0C).isEmpty()) {
                Iterator it = A0C.iterator();
                while (it.hasNext()) {
                    Object tag = viewGroup.getChildAt(((AbstractC16880sg) it).A00()).getTag(-1309867116);
                    AbstractC25225BEi.A1S(tag);
                    if (C14360o3.A0K(tag, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
