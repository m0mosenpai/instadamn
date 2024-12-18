package X;

import com.instagram.api.schemas.MessagingOffPlatformShareType;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34491jn extends AbstractC29011ae {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1jo
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34491jn parseFromJson = AbstractC34171F5v.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34491jn c34491jn = (C34491jn) obj;
            anonymousClass182.A0d();
            String str = c34491jn.A01;
            if (str != null) {
                anonymousClass182.A0S("prompt_id", str);
                String str2 = c34491jn.A02;
                if (str2 != null) {
                    anonymousClass182.A0S("submission_id", str2);
                }
                MessagingOffPlatformShareType messagingOffPlatformShareType = c34491jn.A00;
                if (messagingOffPlatformShareType != null) {
                    anonymousClass182.A0S("share_type", messagingOffPlatformShareType.A00);
                }
                AbstractC47856LCb.A00(anonymousClass182, c34491jn);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("promptId");
            throw C00O.createAndThrow();
        }
    };
    public MessagingOffPlatformShareType A00;
    public String A01;
    public String A02;

    @Override // X.C1OW
    public final String A02() {
        return "prompt_v2_share";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
