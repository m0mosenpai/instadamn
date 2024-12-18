package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MusicStatusStyleResponseInfo;
import com.instagram.api.schemas.MusicStatusStyleResponseInfoImpl;
import com.instagram.api.schemas.StatusStyleResponseInfoImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class LCE {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.L93] */
    public static L93 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reply".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else {
                    if ("reply_type".equals(A0s)) {
                        String A1Q = c16l.A1Q();
                        for (Integer num : C05F.A00(3)) {
                            if (AbstractC46857Knq.A00(num).equals(A1Q)) {
                                obj.A03 = num;
                            }
                        }
                        throw AbstractC166987dD.A18(AnonymousClass001.A0R("Invalid server value for reply_type: ", A1Q));
                    }
                    if ("reaction".equals(A0s)) {
                        obj.A04 = AbstractC167017dG.A0m(c16l);
                    } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                        obj.A00 = AbstractC46858Knr.parseFromJson(c16l);
                    } else if ("animated_media".equals(A0s)) {
                        obj.A02 = C54V.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, L93 l93) {
        anonymousClass182.A0d();
        String str = l93.A05;
        if (str != null) {
            anonymousClass182.A0S("reply", str);
        }
        Integer num = l93.A03;
        if (num != null) {
            anonymousClass182.A0S("reply_type", AbstractC46857Knq.A00(num));
        }
        String str2 = l93.A04;
        if (str2 != null) {
            anonymousClass182.A0S("reaction", str2);
        }
        if (l93.A00 != null) {
            anonymousClass182.A0r(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            L3Y l3y = l93.A00;
            anonymousClass182.A0d();
            anonymousClass182.A0S("emoji", l3y.A01);
            anonymousClass182.A0S("text", l3y.A04);
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l3y.A02);
            anonymousClass182.A0S("status_key", l3y.A03);
            StatusStyleResponseInfoImpl statusStyleResponseInfoImpl = l3y.A00;
            if (statusStyleResponseInfoImpl != null) {
                anonymousClass182.A0r("style_response_info");
                anonymousClass182.A0d();
                MusicStatusStyleResponseInfo musicStatusStyleResponseInfo = statusStyleResponseInfoImpl.A00;
                if (musicStatusStyleResponseInfo != null) {
                    anonymousClass182.A0r("music_response_info");
                    MusicStatusStyleResponseInfoImpl Ex3 = musicStatusStyleResponseInfo.Ex3();
                    anonymousClass182.A0d();
                    String str3 = Ex3.A00;
                    if (str3 != null) {
                        anonymousClass182.A0S("audio_cluster_id", str3);
                    }
                    String str4 = Ex3.A01;
                    if (str4 != null) {
                        anonymousClass182.A0S("display_artist", str4);
                    }
                    String str5 = Ex3.A02;
                    if (str5 != null) {
                        anonymousClass182.A0S("music_title", str5);
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (l93.A02 != null) {
            anonymousClass182.A0r("animated_media");
            C54V.A00(anonymousClass182, l93.A02);
        }
        anonymousClass182.A0a();
    }
}
