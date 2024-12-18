package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes6.dex */
public abstract class FD0 {
    public static final void A00(AbstractC12990ll abstractC12990ll, Integer num, Integer num2) {
        String str;
        String str2;
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "lightweight_connections_share_profile";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_lightweight_connections");
        if (!A0f.isSampled()) {
            return;
        }
        switch (num.intValue()) {
            case 0:
                str = "entered";
                break;
            case 1:
                str = "share_clicked";
                break;
            case 2:
                str = "next_clicked";
                break;
            case 3:
                str = "exit_clicked";
                break;
            case 4:
                str = "avatar_plus_clicked";
                break;
            default:
                str = "avatar_updated";
                break;
        }
        AbstractC31171DnF.A1B(A0f, str);
        switch (num2.intValue()) {
            case 1:
                str2 = "qp_full";
                break;
            case 2:
                str2 = "qp_lite";
                break;
            default:
                str2 = "nux";
                break;
        }
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        A0f.Cht();
    }
}
