package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34331jX extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1jY
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34331jX parseFromJson = F5L.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34331jX c34331jX = (C34331jX) obj;
            anonymousClass182.A0d();
            if (c34331jX.A00 != null) {
                C16V.A03(anonymousClass182, "recommended_user_ids");
                List<String> list = c34331jX.A00;
                if (list != null) {
                    for (String str : list) {
                        if (str != null) {
                            anonymousClass182.A0u(str);
                        }
                    }
                    anonymousClass182.A0Z();
                    AbstractC47856LCb.A00(anonymousClass182, c34331jX);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("recommendedUserIds");
            throw C00O.createAndThrow();
        }
    };
    public List A00;

    @Override // X.C1OW
    public final String A02() {
        return "account_recs_from_friends";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0F;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
