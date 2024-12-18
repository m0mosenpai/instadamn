package X;

import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Events is no longer supported")
/* renamed from: X.1ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29001ad extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1ah
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C29001ad parseFromJson = AbstractC46939KpK.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C29001ad c29001ad = (C29001ad) obj;
            anonymousClass182.A0d();
            String str = c29001ad.A00;
            if (str != null) {
                anonymousClass182.A0S("event_id", str);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29001ad);
            anonymousClass182.A0a();
        }
    };
    public String A00;

    @Override // X.C1OW
    public final String A02() {
        return "event_share";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0o;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
