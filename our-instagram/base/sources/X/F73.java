package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes6.dex */
public abstract class F73 {
    public static void A00(C18920wW c18920wW, Integer num, String str, String str2, String str3, String str4, boolean z) {
        int i;
        String A00;
        C14360o3.A0B(str2, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(2742));
        if (A0f.isSampled()) {
            A0f.A8R(EnumC33476ErB.IMPRESSION, "event_name");
            A0f.AAP("message_id", str);
            A0f.A7v("is_forward", AbstractC31173DnH.A0e(A0f, "attachment_id", str3, false));
            AbstractC31171DnF.A1F(A0f, str2);
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    i = 6;
                    if (intValue != 2) {
                        i = 8;
                    }
                } else {
                    i = 19;
                }
            } else {
                i = 9;
            }
            AbstractC166997dE.A1N(A0f, "message_type", i);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, String.valueOf(str4));
            if (z) {
                A00 = "media_label";
            } else {
                A00 = AbstractC111324zv.A00(5585);
            }
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
            A0f.AAQ(c0Zx, "inform_treatment");
            A0f.Cht();
        }
    }
}
