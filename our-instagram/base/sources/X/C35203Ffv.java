package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.List;

/* renamed from: X.Ffv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35203Ffv {
    public static final C35203Ffv A00 = new Object();

    public static final void A01(AbstractC12990ll abstractC12990ll, String str) {
        A00(abstractC12990ll, null, null, null, str, null);
    }

    public final void A02(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, String str) {
        AbstractC167017dG.A1N(abstractC12990ll, str);
        A00(abstractC12990ll, null, enumC33445EqI, null, str, null);
    }

    public static final void A00(AbstractC12990ll abstractC12990ll, C35161Ff3 c35161Ff3, EnumC33445EqI enumC33445EqI, Integer num, String str, String str2) {
        String str3;
        String str4;
        String str5;
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        Context A06 = abstractC12990ll.getDeviceSession().A06();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), AbstractC111324zv.A00(3131));
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, A01, A002);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.A7v("is_facebook_app_installed", Boolean.valueOf(AbstractC14490oL.A0B(A06)));
        A0f.A7v("messenger_installed", Boolean.valueOf(AbstractC14490oL.A0H(A06, "com.facebook.orca")));
        A0f.A7v("whatsapp_installed", Boolean.valueOf(AbstractC14490oL.A0G(A06)));
        A0f.A7v("fb_lite_installed", Boolean.valueOf(AbstractC13180m4.A03("com.facebook.lite")));
        AbstractC35274Fh9.A0A(A0f, abstractC12990ll);
        List list = null;
        if (enumC33445EqI != null) {
            str3 = enumC33445EqI.A00;
        } else {
            str3 = null;
        }
        AbstractC31171DnF.A19(A0f, str3);
        if (num != null) {
            str4 = AbstractC31178DnM.A0f(AbstractC34293FAn.A00(num));
        } else {
            str4 = null;
        }
        A0f.AAP("cp_type_given", str4);
        if (c35161Ff3 != null) {
            str5 = c35161Ff3.A00.getString(AbstractC31176DnK.A0r(EnumC33320EoF.A06));
        } else {
            str5 = null;
        }
        A0f.AAP("cp_type_given", str5);
        if (str2 != null) {
            list = AbstractC166987dD.A1J(str2);
        }
        A0f.AAk(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, list);
        A0f.Cht();
    }
}
