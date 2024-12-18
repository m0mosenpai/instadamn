package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33191hh extends AbstractC29011ae {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1hi
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33191hh parseFromJson = AbstractC46954KpZ.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33191hh c33191hh = (C33191hh) obj;
            anonymousClass182.A0d();
            if (c33191hh.A03 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c33191hh.A03;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c33191hh.A04;
                    if (str2 != null) {
                        anonymousClass182.A0S("query_string", str2);
                        String str3 = c33191hh.A05;
                        if (str3 != null) {
                            anonymousClass182.A0S("sticker_id", str3);
                            if (c33191hh.A01 != null) {
                                anonymousClass182.A0r("sticker_image_url");
                                ImageUrl imageUrl = c33191hh.A01;
                                if (imageUrl != null) {
                                    AbstractC222616c.A01(anonymousClass182, imageUrl);
                                    if (c33191hh.A02 != null) {
                                        anonymousClass182.A0r("replied_to_message");
                                        AbstractC43642JSa.A01(anonymousClass182, c33191hh.A02);
                                    }
                                    AbstractC47856LCb.A00(anonymousClass182, c33191hh);
                                    anonymousClass182.A0a();
                                    return;
                                }
                            }
                            str = "stickerImageUrl";
                        } else {
                            str = "stickerId";
                        }
                    } else {
                        str = "queryString";
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "threadKey";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public UserSession A00;
    public ImageUrl A01;
    public AnonymousClass442 A02;
    public DirectThreadKey A03;
    public String A04;
    public String A05;

    @Override // X.C1OW
    public final String A02() {
        return "send_ai_sticker";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A02;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        ImageUrl imageUrl = this.A01;
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            List singletonList = Collections.singletonList(AbstractC47996LLi.A0A(new ExtendedImageUrl(url, 124, 124), "instagram://generated_sticker_action"));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        C14360o3.A0F("stickerImageUrl");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }
}
