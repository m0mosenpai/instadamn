package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30711da extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1db
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30711da parseFromJson = AbstractC40591HzB.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30711da c30711da = (C30711da) obj;
            anonymousClass182.A0d();
            String str = c30711da.A00;
            if (str != null) {
                anonymousClass182.A0S("repost_id", str);
                AbstractC47856LCb.A00(anonymousClass182, c30711da);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("repostId");
            throw C00O.createAndThrow();
        }
    };
    public String A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_repost_reply_message";
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
