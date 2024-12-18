package X;

import com.instagram.direct.model.DirectForwardingParams;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "This should be retained for a while to support any pending persisted mutations.")
/* renamed from: X.1hQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33021hQ extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1hR
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33021hQ parseFromJson = AbstractC34156F5g.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33021hQ c33021hQ = (C33021hQ) obj;
            anonymousClass182.A0d();
            C16V.A03(anonymousClass182, "forward_music");
            for (C910143t c910143t : c33021hQ.A01) {
                if (c910143t != null) {
                    AbstractC910043s.A00(anonymousClass182, c910143t);
                }
            }
            anonymousClass182.A0Z();
            if (c33021hQ.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c33021hQ.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c33021hQ);
            anonymousClass182.A0a();
        }
    };
    public DirectForwardingParams A00;
    public List A01 = C16930sl.A00;

    @Override // X.C1OW
    public final String A02() {
        return "forward_music_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List unmodifiableList = Collections.unmodifiableList(this.A01);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1G;
    }
}
