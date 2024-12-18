package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30841dn extends AbstractC29011ae implements InterfaceC29491bQ {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1do
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30841dn c30841dn = (C30841dn) obj;
            anonymousClass182.A0d();
            if (c30841dn.A05 != null) {
                C16V.A03(anonymousClass182, "shops_collection_share");
                for (C910143t c910143t : c30841dn.A05) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str = c30841dn.A04;
            if (str != null) {
                anonymousClass182.A0S("link_id", str);
            }
            String str2 = c30841dn.A02;
            if (str2 != null) {
                anonymousClass182.A0S("collection_id", str2);
            }
            if (c30841dn.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c30841dn.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30841dn);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6R.parseFromJson(c16l);
        }
    };

    @Deprecated
    public DirectForwardingParams A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;

    @Override // X.C1OW
    public final String A02() {
        return "send_shops_collection_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A05;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String str = ((C910143t) this.A05.get(0)).A13;
        String str2 = this.A02;
        if (str != null && str2 != null) {
            String A01 = C47842LBj.A00().A01(C2EY.A1b, new C26069Bfx(str, this.A01, str2, this.A03, 10));
            return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
        }
        return null;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1b;
    }
}
