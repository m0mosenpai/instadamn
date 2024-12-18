package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29841bz extends AbstractC29011ae {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1c1
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C29841bz parseFromJson = F6T.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C29841bz c29841bz = (C29841bz) obj;
            anonymousClass182.A0d();
            String str2 = c29841bz.A01;
            if (str2 != null) {
                anonymousClass182.A0S("business_name", str2);
                String str3 = c29841bz.A03;
                if (str3 != null) {
                    anonymousClass182.A0S("whatsapp_display_number", str3);
                    if (c29841bz.A00 != null) {
                        anonymousClass182.A0r("profile_picture_url");
                        ExtendedImageUrl extendedImageUrl = c29841bz.A00;
                        if (extendedImageUrl != null) {
                            C17Y.A00(anonymousClass182, extendedImageUrl);
                            String str4 = c29841bz.A02;
                            if (str4 != null) {
                                anonymousClass182.A0S("cta_title", str4);
                                AbstractC47856LCb.A00(anonymousClass182, c29841bz);
                                anonymousClass182.A0a();
                                return;
                            }
                            str = "ctaTitle";
                        }
                    }
                    str = "profilePictureUrl";
                } else {
                    str = "whatsappDisplayNumber";
                }
            } else {
                str = "businessName";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public ExtendedImageUrl A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // X.C1OW
    public final String A02() {
        return "whatsapp_contact_share";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2 = this.A01;
        if (str2 != null) {
            String str3 = this.A03;
            if (str3 != null) {
                ExtendedImageUrl extendedImageUrl = this.A00;
                if (extendedImageUrl != null) {
                    String str4 = this.A02;
                    if (str4 != null) {
                        List singletonList = Collections.singletonList(new C9CP(str4, "open_url", ""));
                        C14360o3.A07(singletonList);
                        List singletonList2 = Collections.singletonList(AbstractC47996LLi.A03(null, null, extendedImageUrl, null, null, str2, str3, "", singletonList, 0, 0));
                        C14360o3.A07(singletonList2);
                        return singletonList2;
                    }
                    str = "ctaTitle";
                } else {
                    str = "profilePictureUrl";
                }
            } else {
                str = "whatsappDisplayNumber";
            }
        } else {
            str = "businessName";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }
}
