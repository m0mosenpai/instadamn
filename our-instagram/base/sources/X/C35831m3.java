package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35831m3 extends AbstractC29011ae {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1m4
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35831m3 parseFromJson = AbstractC46967Kpm.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35831m3 c35831m3 = (C35831m3) obj;
            anonymousClass182.A0d();
            if (c35831m3.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c35831m3.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c35831m3.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("music_id", str2);
                        String str3 = c35831m3.A04;
                        str = DialogModule.KEY_TITLE;
                        if (str3 != null) {
                            anonymousClass182.A0S(DialogModule.KEY_TITLE, str3);
                            String str4 = c35831m3.A03;
                            str = "subtitle";
                            if (str4 != null) {
                                anonymousClass182.A0S("subtitle", str4);
                                String str5 = c35831m3.A05;
                                str = "url";
                                if (str5 != null) {
                                    anonymousClass182.A0S("url", str5);
                                    if (c35831m3.A01 != null) {
                                        anonymousClass182.A0r("cover_thumbnail_url");
                                        ExtendedImageUrl extendedImageUrl = c35831m3.A01;
                                        if (extendedImageUrl != null) {
                                            C17Y.A00(anonymousClass182, extendedImageUrl);
                                            AbstractC47856LCb.A00(anonymousClass182, c35831m3);
                                            anonymousClass182.A0a();
                                            return;
                                        }
                                    }
                                    str = "coverThumbnail";
                                }
                            }
                        }
                    } else {
                        str = "musicId";
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
    public DirectThreadKey A00;
    public ExtendedImageUrl A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.C1OW
    public final String A02() {
        return "send_direct_music_sticker";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2 = this.A02;
        if (str2 != null) {
            ExtendedImageUrl extendedImageUrl = this.A01;
            if (extendedImageUrl != null) {
                String str3 = this.A04;
                if (str3 != null) {
                    String str4 = this.A03;
                    if (str4 != null) {
                        String str5 = this.A05;
                        if (str5 != null) {
                            List singletonList = Collections.singletonList(AbstractC47996LLi.A02(EnumC910243u.SINGLE, null, extendedImageUrl, null, false, false, false, null, null, null, null, null, null, null, null, str2, null, null, str3, str4, null, str5, null, null, null, null, null, 0, 0, 0, false));
                            C14360o3.A07(singletonList);
                            return singletonList;
                        }
                        str = "url";
                    } else {
                        str = "subtitle";
                    }
                } else {
                    str = DialogModule.KEY_TITLE;
                }
            } else {
                str = "coverThumbnail";
            }
        } else {
            str = "musicId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0j;
    }
}
