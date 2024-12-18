package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Fiy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35383Fiy implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EnumC1579076z A01;
    public final /* synthetic */ EnumC33464Eqz A02;
    public final /* synthetic */ C18920wW A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C189478aR A05;
    public final /* synthetic */ C189448aO A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ InterfaceC37213GaO A08;
    public final /* synthetic */ EnumC33371Ep4 A09;
    public final /* synthetic */ JSONObject A0A;

    public DialogInterfaceOnClickListenerC35383Fiy(Context context, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, C18920wW c18920wW, UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, User user, InterfaceC37213GaO interfaceC37213GaO, EnumC33371Ep4 enumC33371Ep4, JSONObject jSONObject) {
        this.A03 = c18920wW;
        this.A09 = enumC33371Ep4;
        this.A07 = user;
        this.A01 = enumC1579076z;
        this.A02 = enumC33464Eqz;
        this.A04 = userSession;
        this.A0A = jSONObject;
        this.A05 = c189478aR;
        this.A06 = c189448aO;
        this.A00 = context;
        this.A08 = interfaceC37213GaO;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C189448aO c189448aO;
        C14360o3.A0B(dialogInterface, 0);
        C18920wW c18920wW = this.A03;
        EnumC33371Ep4 enumC33371Ep4 = this.A09;
        User user = this.A07;
        C75R.A02(c18920wW, this.A01, this.A02, enumC33371Ep4, "click", "optimistic_restrict_learn_more_button", user.getId());
        dialogInterface.dismiss();
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt != null) {
            C34699FQk c34699FQk = (C34699FQk) c28151Xt.A00.getValue();
            UserSession userSession = this.A04;
            C32345EMr A01 = c34699FQk.A01(userSession, user.Bhu(), enumC33371Ep4, user.getId(), user.getUsername(), this.A0A, true, false);
            C189478aR c189478aR = this.A05;
            if (c189478aR != null && (c189448aO = this.A06) != null) {
                c189448aO.A0T = A01;
                c189478aR.A0F(A01, c189448aO);
            } else {
                AbstractC31178DnM.A0l(this.A00, A01, userSession, new GH5(this.A08, 19));
            }
        }
    }
}
