package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34451jj extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1jk
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34451jj parseFromJson = AbstractC34168F5s.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34451jj c34451jj = (C34451jj) obj;
            anonymousClass182.A0d();
            String str = c34451jj.A00;
            if (str != null) {
                anonymousClass182.A0S("boost_access_token_id", str);
            }
            AbstractC47856LCb.A00(anonymousClass182, c34451jj);
            anonymousClass182.A0a();
        }
    };
    public String A00;

    @Override // X.C1OW
    public final String A02() {
        return "partnership_ad_code";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1M;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
