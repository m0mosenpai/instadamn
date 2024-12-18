package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FoG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35625FoG implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C72q A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;

    public ViewOnClickListenerC35625FoG(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C72q c72q, User user, String str) {
        this.A05 = str;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c72q;
        this.A04 = user;
        this.A00 = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GBV A02;
        int A05 = C0f9.A05(-116786744);
        String str = this.A05;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        FAI.A00(interfaceC11380iw, userSession, "click", AbstractC111324zv.A00(4007), "viewer", "ig_profile", str, null);
        C72q c72q = this.A03;
        if (c72q != null && (A02 = c72q.A02()) != null) {
            User user = this.A04;
            Context context = this.A00;
            UserSession userSession2 = A02.A02;
            String A022 = A02.A07.A02();
            FL7 fl7 = new FL7(context, interfaceC11380iw, A02);
            Bundle A0E = AbstractC31174DnI.A0E(A022, 1);
            C32339EMl c32339EMl = new C32339EMl();
            AbstractC31173DnH.A1C(A0E, userSession2);
            A0E.putString("ProfileMultipleAddressesBottomsheetFragment.USER_ID", A022);
            c32339EMl.setArguments(A0E);
            c32339EMl.A00 = fl7;
            int A0I = ((AbstractC25231BEo.A0I(user.A03.AZk()) + 1) * 66) + 110;
            if (C3BQ.A00(userSession2).booleanValue() && C18U.A06(C06090Tz.A05, userSession2, 2342172050216927211L)) {
                A0I += 156;
            }
            float f = A0I / (r3.heightPixels / Resources.getSystem().getDisplayMetrics().density);
            if (f > 1.0f) {
                f = 1.0f;
            }
            C189448aO A0y = AbstractC25225BEi.A0y(userSession2);
            A0y.A0a = true;
            A0y.A1O = true;
            A0y.A0x = true;
            A0y.A03 = f;
            A0y.A0Z = true;
            A0y.A00().A02(A02.A00, c32339EMl);
        }
        C0f9.A0C(388507509, A05);
    }
}
