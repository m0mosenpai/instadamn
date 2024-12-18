package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.IjE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41983IjE implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C123675ig A01;
    public final /* synthetic */ C38525Gwl A02;
    public final /* synthetic */ C42664IuL A03;
    public final /* synthetic */ EnumC114405Eh A04;

    public ViewOnClickListenerC41983IjE(UserSession userSession, C123675ig c123675ig, C38525Gwl c38525Gwl, C42664IuL c42664IuL, EnumC114405Eh enumC114405Eh) {
        this.A04 = enumC114405Eh;
        this.A01 = c123675ig;
        this.A03 = c42664IuL;
        this.A00 = userSession;
        this.A02 = c38525Gwl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(850268959);
        "business_conversion_netego_selected_reason".getClass();
        C19280xC A01 = C19280xC.A01("business_conversion_netego_selected_reason", null);
        EnumC114405Eh enumC114405Eh = this.A04;
        EnumC114405Eh enumC114405Eh2 = EnumC114405Eh.A05;
        if (enumC114405Eh == enumC114405Eh2 || enumC114405Eh == (enumC114405Eh2 = EnumC114405Eh.A06)) {
            A01.A0C("reason", enumC114405Eh2.toString());
        }
        C123675ig c123675ig = this.A01;
        A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c123675ig.getId());
        A01.A0C("tracking_token", c123675ig.CAR());
        A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC111324zv.A00(4042));
        C42664IuL c42664IuL = this.A03;
        A01.A0C(AbstractC37307Gc9.A00(), c42664IuL.A04);
        AbstractC31173DnH.A1S(A01, this.A00);
        c42664IuL.EVm(EnumC114405Eh.A03);
        C693539v.A06(this.A02);
        C0f9.A0C(1896317302, A05);
    }
}
