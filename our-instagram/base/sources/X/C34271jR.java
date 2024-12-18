package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1jR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34271jR extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1jS
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34271jR parseFromJson = F6F.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34271jR c34271jR = (C34271jR) obj;
            anonymousClass182.A0d();
            String str = c34271jR.A00;
            if (str != null) {
                anonymousClass182.A0S("media_kit_id", str);
                AbstractC47856LCb.A00(anonymousClass182, c34271jR);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("mediaKitId");
            throw C00O.createAndThrow();
        }
    };
    public String A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_mediakit_share_message";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1D;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
