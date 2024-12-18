package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.39w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC693639w implements View.OnClickListener {
    public C123675ig A00;
    public String A01;
    public final UserSession A02;
    public final C685736u A03;

    public ViewOnClickListenerC693639w(UserSession userSession, C685736u c685736u) {
        this.A02 = userSession;
        this.A03 = c685736u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1675409204);
        C685736u c685736u = this.A03;
        C60662pp c60662pp = c685736u.A0O;
        c60662pp.A0A().A0o();
        C685736u.A01(c685736u, c60662pp.A0A().A0o().A0U.A00);
        this.A00.getClass();
        "business_conversion_netego_click_convert_button".getClass();
        C19280xC A01 = C19280xC.A01("business_conversion_netego_click_convert_button", null);
        c60662pp.A0A().A0o();
        A01.A08(Integer.valueOf(c60662pp.A0A().A0o().A0U.A00), AbstractC111324zv.A00(917));
        A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00.getId());
        A01.A0C("tracking_token", this.A00.CAR());
        A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "business_conversion");
        A01.A0C(AbstractC58358Pty.A00(), this.A01);
        AbstractC11060iN.A00(this.A02).EHW(A01);
        C0f9.A0C(53589809, A05);
    }
}
