package X;

import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "CANNOT REMOVE DUE TO DynamicDispatchAdapter")
/* renamed from: X.1b2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29251b2 extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1b3
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C29251b2 parseFromJson = AbstractC34157F5h.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C29251b2 c29251b2 = (C29251b2) obj;
            anonymousClass182.A0d();
            String str = c29251b2.A00;
            if (str != null) {
                anonymousClass182.A0S("group_profile_id", str);
            }
            String str2 = c29251b2.A01;
            if (str2 != null) {
                anonymousClass182.A0S("profile_share_type", str2);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29251b2);
            anonymousClass182.A0a();
        }
    };
    public String A00;
    public String A01;

    @Override // X.C1OW
    public final String A02() {
        return "group_profile_invite";
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
