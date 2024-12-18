package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33231hl extends AbstractC29011ae {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1hm
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33231hl parseFromJson = AbstractC46960Kpf.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33231hl c33231hl = (C33231hl) obj;
            anonymousClass182.A0d();
            if (c33231hl.A02 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c33231hl.A02;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c33231hl.A04;
                    if (str2 != null) {
                        anonymousClass182.A0S("sticker_id", str2);
                        if (c33231hl.A03 != null) {
                            anonymousClass182.A0r("sticker_image_url");
                            ExtendedImageUrl extendedImageUrl = c33231hl.A03;
                            if (extendedImageUrl != null) {
                                C17Y.A00(anonymousClass182, extendedImageUrl);
                                if (c33231hl.A01 != null) {
                                    anonymousClass182.A0r("replied_to_message");
                                    AbstractC43642JSa.A01(anonymousClass182, c33231hl.A01);
                                }
                                AbstractC47856LCb.A00(anonymousClass182, c33231hl);
                                anonymousClass182.A0a();
                                return;
                            }
                        }
                        str = "stickerImageUrl";
                    } else {
                        str = "stickerId";
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
    public AnonymousClass442 A01;
    public DirectThreadKey A02;
    public ExtendedImageUrl A03;
    public String A04;

    @Override // X.C1OW
    public final String A02() {
        return "send_cutout_sticker";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A01;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2 = this.A04;
        if (str2 != null) {
            ExtendedImageUrl extendedImageUrl = this.A03;
            if (extendedImageUrl != null) {
                List singletonList = Collections.singletonList(AbstractC47996LLi.A02(EnumC910243u.SINGLE, null, extendedImageUrl, null, false, true, false, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false));
                C14360o3.A07(singletonList);
                return singletonList;
            }
            str = "stickerImageUrl";
        } else {
            str = "stickerId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }
}
