package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2uF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63322uF implements PopupWindow.OnDismissListener {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final C63282u6 A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final List A07;
    public final InterfaceC09390do A08;

    public C63322uF(Context context, UserSession userSession, C63282u6 c63282u6, List list) {
        C14360o3.A0B(c63282u6, 4);
        this.A02 = context;
        this.A03 = userSession;
        this.A07 = list;
        this.A04 = c63282u6;
        this.A08 = AbstractC09440dt.A01(new C9EA(this, 10));
        this.A06 = new ArrayList();
        this.A05 = new ArrayList();
        this.A01 = true;
    }

    public final void A00(Integer num) {
        C14360o3.A0B(num, 0);
        if (num != this.A04.A01 || num == C05F.A15) {
            Iterator it = this.A05.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                ((C63272u5) next).A00(num);
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
    }

    public final void A01(boolean z) {
        this.A00 = z;
        UserSession userSession = this.A03;
        ((C74863Yb) userSession.A01(C74863Yb.class, new C29889DGd(userSession, 6))).A02.Egh(Boolean.valueOf(z));
    }
}
