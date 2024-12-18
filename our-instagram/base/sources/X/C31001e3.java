package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31001e3 extends AbstractC29011ae {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1e4
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C31001e3 parseFromJson = AbstractC46980Kpz.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C31001e3 c31001e3 = (C31001e3) obj;
            anonymousClass182.A0d();
            String str2 = c31001e3.A02;
            if (str2 != null) {
                anonymousClass182.A0S("creator_igid", str2);
                if (c31001e3.A01 != null) {
                    anonymousClass182.A0r("profile_pic_url");
                    ImageUrl imageUrl = c31001e3.A01;
                    if (imageUrl != null) {
                        AbstractC222616c.A01(anonymousClass182, imageUrl);
                        if (c31001e3.A00 != null) {
                            anonymousClass182.A0r("crown_icon");
                            ImageUrl imageUrl2 = c31001e3.A00;
                            if (imageUrl2 != null) {
                                AbstractC222616c.A01(anonymousClass182, imageUrl2);
                                String str3 = c31001e3.A05;
                                if (str3 != null) {
                                    anonymousClass182.A0S("header_text", str3);
                                    String str4 = c31001e3.A04;
                                    if (str4 != null) {
                                        anonymousClass182.A0S("header_subtitle", str4);
                                        String str5 = c31001e3.A03;
                                        if (str5 != null) {
                                            anonymousClass182.A0S("cta_text", str5);
                                            AbstractC47856LCb.A00(anonymousClass182, c31001e3);
                                            anonymousClass182.A0a();
                                            return;
                                        }
                                        str = "ctaText";
                                    } else {
                                        str = "subtitleText";
                                    }
                                } else {
                                    str = "titleText";
                                }
                            }
                        }
                        str = "crownIcon";
                    }
                }
                str = "headerIcon";
            } else {
                str = "creatorId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public ImageUrl A00;
    public ImageUrl A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.C1OW
    public final String A02() {
        return "send_subscription_share_message";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1h;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2 = this.A02;
        if (str2 != null) {
            String A0R = AnonymousClass001.A0R("instagram://subscriptions_fan_onboarding?origin=fan_referral_dm&creator_id=", str2);
            String str3 = this.A05;
            if (str3 != null) {
                String str4 = this.A04;
                if (str4 != null) {
                    ImageUrl imageUrl = this.A00;
                    if (imageUrl != null) {
                        ImageUrl imageUrl2 = this.A01;
                        if (imageUrl2 != null) {
                            List A1Q = AbstractC16960so.A1Q(imageUrl, imageUrl2);
                            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A1Q, 10));
                            Iterator it = A1Q.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new ExtendedImageUrl((ImageUrl) it.next()));
                            }
                            String str5 = this.A03;
                            if (str5 != null) {
                                List singletonList = Collections.singletonList(new C9CP(str5, "xma_ig_subs_referral_detail", A0R));
                                C14360o3.A07(singletonList);
                                List singletonList2 = Collections.singletonList(AbstractC47996LLi.A02(EnumC910243u.SINGLE, null, null, null, false, false, null, null, null, null, 2, null, null, null, null, null, str3, str4, null, null, null, null, null, null, null, arrayList, singletonList, 0, 0, 0, false));
                                C14360o3.A07(singletonList2);
                                return singletonList2;
                            }
                            str = "ctaText";
                        } else {
                            str = "headerIcon";
                        }
                    } else {
                        str = "crownIcon";
                    }
                } else {
                    str = "subtitleText";
                }
            } else {
                str = "titleText";
            }
        } else {
            str = "creatorId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
