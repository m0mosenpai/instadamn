package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;

/* renamed from: X.Fie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35363Fie implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public DialogInterfaceOnClickListenerC35363Fie(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C75R.A0A((C18920wW) this.A01, (User) this.A02, "approval_page_cancel", this.A03, this.A05, this.A04);
                return;
            case 1:
                C162337Ov.A0R((InterfaceC11380iw) this.A01, (UserSession) this.A02, "unsupported_dialog_ok_click", this.A03, this.A04, this.A05);
                return;
            case 2:
                String str = this.A03;
                boolean equalsIgnoreCase = "report_problem".equalsIgnoreCase(str);
                if (!"open_challenge".equalsIgnoreCase(str) && !equalsIgnoreCase) {
                    boolean equalsIgnoreCase2 = "open_request_form".equalsIgnoreCase(str);
                    C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                    Context A06 = AbstractC31172DnG.A06(this.A02);
                    C14360o3.A0A(A06);
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                    SXK A0R = AbstractC31171DnF.A0R(this.A05);
                    if (!equalsIgnoreCase2) {
                        A0R.A02 = this.A04;
                    }
                    c35133Fea.A02(A06, abstractC12990ll, new SimpleWebViewConfig(A0R));
                    return;
                }
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A01;
                String str2 = this.A05;
                C25621Ms A0c = AbstractC167017dG.A0c(abstractC12990ll2);
                A0c.A0B(str2);
                A0c.A0P(null, C40781ul.class, C55702hA.class, false);
                C1GJ.A03(AbstractC31176DnK.A0P(A0c));
                if (!equalsIgnoreCase) {
                    return;
                }
                C9GR.A01(AbstractC31172DnG.A06(this.A02), null, 2131962534, 0);
                return;
            default:
                dialogInterface.dismiss();
                EVQ evq = (EVQ) this.A01;
                CallerContext callerContext = EVQ.A0B;
                evq.A0A(C4JK.A00, AbstractC31174DnI.A0J("login_continue_button"), evq.A08, this.A04, this.A03, this.A05, ((FM7) this.A02).A01);
                return;
        }
    }
}
