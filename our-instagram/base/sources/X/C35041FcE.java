package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FcE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35041FcE {
    public ViewGroup A00;
    public ViewGroup A01;
    public EnumC33392EpP A02;
    public C7IK A03;
    public C34498FIk A04;
    public List A05;
    public final Activity A06;
    public final LayoutInflater A07;
    public final View A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;
    public final FQ0 A0B;
    public final User A0C;
    public final String A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC16610sE A0G;
    public final boolean A0H;

    public C35041FcE(Activity activity, LayoutInflater layoutInflater, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str, InterfaceC16610sE interfaceC16610sE, boolean z) {
        String str2;
        AbstractC167007dF.A1F(layoutInflater, 3, userSession);
        AbstractC167007dF.A1J(interfaceC11380iw, 7, interfaceC16610sE);
        this.A06 = activity;
        this.A08 = view;
        this.A07 = layoutInflater;
        this.A0A = userSession;
        this.A0C = user;
        this.A09 = interfaceC11380iw;
        this.A0H = z;
        this.A0G = interfaceC16610sE;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.A0D = str2;
        this.A0B = new FQ0(interfaceC11380iw, userSession, str, AbstractC25231BEo.A0t(user));
        this.A0F = C1XM.A00(new MHM(this, 48));
        this.A0E = C1XM.A00(new MHM(this, 47));
    }

    public static final boolean A00(List list) {
        if (list == null) {
            return false;
        }
        C35884Fsy c35884Fsy = C35884Fsy.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!c35884Fsy.apply(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A01() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.A00 = null;
        }
        ViewGroup viewGroup2 = this.A01;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
    }

    public final void A03(C7IK c7ik, boolean z) {
        if (c7ik != null) {
            this.A03 = c7ik;
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                if (z) {
                    viewGroup.setBackgroundColor(c7ik.A02);
                }
                C12500ku c12500ku = new C12500ku(viewGroup);
                while (c12500ku.hasNext()) {
                    View view = (View) c12500ku.next();
                    if (view instanceof RoundedCornerLinearLayout) {
                        view.setBackgroundColor(c7ik.A04);
                    }
                }
            }
        }
    }

    public final void A04(boolean z, boolean z2) {
        C34498FIk c34498FIk = this.A04;
        if (c34498FIk != null) {
            this.A0B.A00("welcome_message_thread_first_message_sent", z, AbstractC167007dF.A1W(c34498FIk.A00), z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x034c, code lost:
    
        if (r41 != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r36.A0k != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x010f, code lost:
    
        if (r10.isEmpty() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x01c0, code lost:
    
        if (r6 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0074, code lost:
    
        if (r41 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021e, code lost:
    
        if (X.AbstractC167007dF.A1Z(r33.A0F) == false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[Catch: NotFoundException -> 0x01ef, TryCatch #4 {NotFoundException -> 0x01ef, blocks: (B:57:0x011c, B:60:0x0131, B:55:0x013a, B:56:0x013e), top: B:53:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c A[Catch: NotFoundException -> 0x01ef, TRY_ENTER, TryCatch #4 {NotFoundException -> 0x01ef, blocks: (B:57:0x011c, B:60:0x0131, B:55:0x013a, B:56:0x013e), top: B:53:0x00f1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C9BW r34, X.C34498FIk r35, X.C83403nh r36, java.util.List r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35041FcE.A02(X.9BW, X.FIk, X.3nh, java.util.List, boolean, boolean, boolean, boolean, boolean):void");
    }
}
