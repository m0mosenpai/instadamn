package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MXB {
    public Dialog A00;
    public C31727DwY A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final Context A06;
    public final MXV A07;
    public final UserSession A08;
    public final InterfaceC189648aj A09;

    private final Dialog A02(Integer num) {
        DialogInterfaceOnClickListenerC55321Ogj A00 = DialogInterfaceOnClickListenerC55321Ogj.A00(num, this, 7);
        C193328hC A0H = AbstractC31171DnF.A0H(this.A05);
        A0H.A09(2131972722);
        A0H.A0I(A00, 2131958587);
        A0H.A0J(A00, 2131958590);
        A0H.A0A(2131972723);
        DialogInterfaceOnCancelListenerC55251OfP.A00(A0H, this, 0);
        return A0H.A02();
    }

    public final boolean A0A(DialogInterface.OnClickListener onClickListener, Integer num) {
        C14360o3.A0B(num, 0);
        Integer num2 = this.A02;
        if (this.A03 || (num2 != null && (OXm.A01(num) < OXm.A01(num2) || num == num2))) {
            return false;
        }
        if (A09() && num2 != null) {
            A08(num2);
        }
        for (Integer num3 : C05F.A00(26)) {
            if (OXm.A01(num3) < OXm.A01(num)) {
                this.A07.removeMessages(OXm.A00(num3));
            }
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.A07.post(new PSK(onClickListener, this, num));
            return true;
        }
        A04(onClickListener, this, num);
        return true;
    }

    private final Dialog A00(int i) {
        C193328hC A0I = AbstractC31171DnF.A0I(this.A06);
        A0I.A09(i);
        A0I.A06();
        A0I.A0A(2131960934);
        DialogInterfaceOnClickListenerC55319Ogh.A01(A0I, this, 19, 2131958587);
        return A0I.A02();
    }

    private final Dialog A01(DialogInterface.OnClickListener onClickListener, Integer num) {
        Integer num2 = C05F.A00;
        Activity activity = this.A05;
        int i = 2131976620;
        if (num == num2) {
            i = 2131969575;
        }
        String A0r = AbstractC166997dE.A0r(activity.getResources(), AbstractC167007dF.A0h(AbstractC166997dE.A0p(activity, i)), 2131972261);
        C14360o3.A07(A0r);
        C193328hC A0I = AbstractC31171DnF.A0I(this.A06);
        A0I.A05 = A0r;
        A0I.A0M(onClickListener, 2131972171);
        A0I.A06();
        return A0I.A02();
    }

    private final Dialog A03(Integer num) {
        C193328hC A0H = AbstractC31171DnF.A0H(this.A05);
        A0H.A0A(2131974381);
        A0H.A09(2131974380);
        A0H.A0L(DialogInterfaceOnClickListenerC55319Ogh.A00(this, 17), 2131958591);
        A0H.A0I(DialogInterfaceOnClickListenerC55319Ogh.A00(this, 18), 2131958589);
        A0H.A0P(DialogInterfaceOnClickListenerC55321Ogj.A00(num, this, 8), EnumC193348hE.A04, 2131958590);
        DialogInterfaceOnCancelListenerC55251OfP.A00(A0H, this, 1);
        return A0H.A02();
    }

    public static final void A05(MXB mxb) {
        UserSession userSession = mxb.A08;
        AbstractC50666MYj.A00(userSession);
        AnonymousClass229.A01(userSession).A1m("EXIT_DIALOG_START_OVER");
        mxb.A04 = true;
        mxb.A05.onBackPressed();
        mxb.A04 = false;
    }

    public static final void A07(MXB mxb, Integer num) {
        UserSession userSession = mxb.A08;
        AnonymousClass229.A01(userSession).A1E(EnumC203578zI.DIALOG, null, AbstractC166997dE.A0t(userSession), null, null, null, false);
        if (num == C05F.A00 || num == C05F.A01) {
            C6WI.A01().A07(userSession, "gallery", AbstractC167007dF.A1X(num, C05F.A01));
        }
        AbstractC50666MYj.A00(userSession);
        AnonymousClass229.A01(userSession).A1m("EXIT_DIALOG_SAVE_DRAFT");
        mxb.A09.ELe(false);
    }

    public final void A08(Integer num) {
        if (!this.A03) {
            MXV mxv = this.A07;
            mxv.removeMessages(OXm.A00(num));
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                mxv.post(new RunnableC56982PPx(this, num));
            } else {
                A06(this, num);
            }
        }
    }

    public final boolean A09() {
        Dialog dialog = this.A00;
        if ((dialog == null || !dialog.isShowing()) && this.A01 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0B(Integer num) {
        if (this.A02 == num && A09()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context] */
    public MXB(Activity activity, UserSession userSession, InterfaceC189648aj interfaceC189648aj) {
        AbstractC167017dG.A1P(activity, userSession);
        this.A05 = activity;
        this.A08 = userSession;
        this.A09 = interfaceC189648aj;
        this.A07 = new MXV(Looper.getMainLooper(), this, 0);
        this.A06 = AbstractC43840Ja3.A00(userSession) ? AbstractC53172bz.A01(activity) : activity;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(android.content.DialogInterface.OnClickListener r6, X.MXB r7, java.lang.Integer r8) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MXB.A04(android.content.DialogInterface$OnClickListener, X.MXB, java.lang.Integer):void");
    }

    public static final void A06(MXB mxb, Integer num) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            if (mxb.A02 == num) {
                Dialog dialog = mxb.A00;
                if (dialog != null) {
                    dialog.dismiss();
                }
                mxb.A00 = null;
                C31727DwY c31727DwY = mxb.A01;
                if (c31727DwY != null) {
                    c31727DwY.A04();
                }
                mxb.A01 = null;
                mxb.A02 = null;
                return;
            }
            return;
        }
        throw AbstractC166987dD.A18("hideOnUiThread is not called on UI thread");
    }
}
