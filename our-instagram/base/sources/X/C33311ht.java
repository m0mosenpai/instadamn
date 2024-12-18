package X;

import com.facebook.tigon.tigonhuc.HucClient;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33311ht extends AbstractC29011ae {
    public static final C1OZ A0B = new C1OZ() { // from class: X.1hu
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33311ht parseFromJson = AbstractC46957Kpc.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33311ht c33311ht = (C33311ht) obj;
            anonymousClass182.A0d();
            if (c33311ht.A05 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c33311ht.A05;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c33311ht.A08;
                    if (str2 != null) {
                        anonymousClass182.A0S("sticker_template", str2);
                        String str3 = c33311ht.A07;
                        if (str3 != null) {
                            anonymousClass182.A0S("sticker_id", str3);
                            if (c33311ht.A01 != null) {
                                anonymousClass182.A0r("sticker_image_url");
                                AbstractC222616c.A01(anonymousClass182, c33311ht.A01);
                            }
                            anonymousClass182.A0T("should_send_silently", c33311ht.A0A);
                            anonymousClass182.A0T("is_animated", c33311ht.A09);
                            if (c33311ht.A04 != null) {
                                anonymousClass182.A0r("pending_media");
                                AbstractC47865LCl.A00(anonymousClass182, c33311ht.A04);
                            }
                            if (c33311ht.A02 != null) {
                                anonymousClass182.A0r("static_sticker_item");
                                AbstractC201088uq.A00(anonymousClass182, c33311ht.A02);
                            }
                            Integer num = c33311ht.A06;
                            if (num != null) {
                                anonymousClass182.A0Q("nux_type", num.intValue());
                            }
                            if (c33311ht.A03 != null) {
                                anonymousClass182.A0r("replied_to_message");
                                AbstractC43642JSa.A01(anonymousClass182, c33311ht.A03);
                            }
                            AbstractC47856LCb.A00(anonymousClass182, c33311ht);
                            anonymousClass182.A0a();
                            return;
                        }
                        str = "stickerId";
                    } else {
                        str = "stickerTemplate";
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
    public C148286ly A02;
    public AnonymousClass442 A03;
    public C7Q4 A04;
    public DirectThreadKey A05;
    public Integer A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33311ht(UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, JTa jTa, C7Q4 c7q4, DirectThreadKey directThreadKey, Integer num, Long l, long j, boolean z) {
        super(jTa, directThreadKey, l, j);
        C14360o3.A0B(jTa, 1);
        this.A05 = directThreadKey;
        String str = c148286ly.A0a;
        C14360o3.A0B(str, 0);
        this.A08 = str;
        String str2 = c148286ly.A0S;
        C14360o3.A07(str2);
        this.A07 = AbstractC001900j.A0F("bloks_tappable_avatar_sticker_id_", str2);
        this.A01 = c148286ly.A0H;
        this.A00 = userSession;
        this.A09 = c148286ly.A04() == C05F.A0N;
        this.A0A = z;
        this.A03 = anonymousClass442;
        this.A04 = c7q4;
        this.A02 = c148286ly;
        this.A06 = num;
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_avatar_sticker";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A03;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2;
        ImmutableList A02;
        C7Q4 c7q4 = this.A04;
        if (c7q4 != null) {
            str = c7q4.A02();
        } else {
            str = null;
        }
        C148286ly c148286ly = this.A02;
        if (c148286ly != null && (A02 = c148286ly.A02()) != null && !A02.isEmpty() && str != null) {
            str2 = android.net.Uri.fromFile(new File(str)).toString();
            C14360o3.A0A(str2);
        } else {
            ImageUrl imageUrl = this.A01;
            if (imageUrl == null || (str2 = imageUrl.getUrl()) == null) {
                str2 = "";
            }
        }
        List singletonList = Collections.singletonList(AbstractC47996LLi.A02(EnumC910243u.SINGLE, null, new ExtendedImageUrl(str2, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), null, true, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        if (this.A09) {
            return C2EY.A0J;
        }
        return C2EY.A0O;
    }

    public C33311ht() {
    }
}
