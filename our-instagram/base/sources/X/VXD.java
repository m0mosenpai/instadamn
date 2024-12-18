package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* loaded from: classes11.dex */
public abstract class VXD {
    public static final void A00(AnonymousClass182 anonymousClass182, UPU upu) {
        C14360o3.A0B(upu, 1);
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, upu.A07);
        anonymousClass182.A0S(AbstractC65709Tsi.A01(), upu.A09);
        String str = upu.A06;
        if (str != null) {
            anonymousClass182.A0S("full_name", str);
        }
        C26068Bfw c26068Bfw = upu.A00;
        if (c26068Bfw != null) {
            anonymousClass182.A0r(AbstractC58317Pt9.A00(104));
            anonymousClass182.A0d();
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c26068Bfw.A00);
            anonymousClass182.A0S("url", c26068Bfw.A02);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c26068Bfw.A01);
            anonymousClass182.A0a();
        }
        String str2 = upu.A08;
        if (str2 != null) {
            anonymousClass182.A0S("profile_pic_url", str2);
        }
        Boolean bool = upu.A04;
        if (bool != null) {
            anonymousClass182.A0T("is_verified", bool.booleanValue());
        }
        Boolean bool2 = upu.A03;
        if (bool2 != null) {
            anonymousClass182.A0T("is_private", bool2.booleanValue());
        }
        String str3 = upu.A05;
        if (str3 != null) {
            anonymousClass182.A0S("charity_id", str3);
        }
        Boolean bool3 = upu.A01;
        if (bool3 != null) {
            anonymousClass182.A0T("is_facebook_onboarded_charity", bool3.booleanValue());
        }
        Boolean bool4 = upu.A02;
        if (bool4 != null) {
            anonymousClass182.A0T(AbstractC111324zv.A00(2614), bool4.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
