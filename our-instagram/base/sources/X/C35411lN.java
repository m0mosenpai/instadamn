package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35411lN extends AbstractC29011ae {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1lO
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35411lN parseFromJson = F6B.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35411lN c35411lN = (C35411lN) obj;
            anonymousClass182.A0d();
            if (c35411lN.A02 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c35411lN.A02;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    anonymousClass182.A0R("generation_id", c35411lN.A00);
                    Long l = c35411lN.A03;
                    if (l != null) {
                        anonymousClass182.A0R("media_id", l.longValue());
                    }
                    String str = c35411lN.A04;
                    if (str != null) {
                        anonymousClass182.A0S("preview_url", str);
                    }
                    String str2 = c35411lN.A05;
                    if (str2 != null) {
                        anonymousClass182.A0S(TraceFieldType.ContentType, str2);
                    }
                    AbstractC47856LCb.A00(anonymousClass182, c35411lN);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
    };
    public long A00;
    public UserSession A01;
    public DirectThreadKey A02;
    public Long A03;
    public String A04;
    public String A05;

    @Override // X.C1OW
    public final String A02() {
        return "send_ify_content";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        ExtendedImageUrl extendedImageUrl;
        String valueOf = String.valueOf(this.A03);
        String str = this.A04;
        if (str != null) {
            extendedImageUrl = new ExtendedImageUrl(str, -1, -1);
        } else {
            extendedImageUrl = null;
        }
        List singletonList = Collections.singletonList(AbstractC47996LLi.A05(null, extendedImageUrl, false, null, null, null, valueOf, null, null, null, null, null, 0));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }
}
