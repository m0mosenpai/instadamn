package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30881dr extends AbstractC29011ae implements InterfaceC29491bQ {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1ds
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30881dr c30881dr = (C30881dr) obj;
            anonymousClass182.A0d();
            if (c30881dr.A03 != null) {
                C16V.A03(anonymousClass182, "shop_share");
                for (C910143t c910143t : c30881dr.A03) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str = c30881dr.A01;
            if (str != null) {
                anonymousClass182.A0S("link_id", str);
            }
            if (c30881dr.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c30881dr.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30881dr);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6Q.parseFromJson(c16l);
        }
    };

    @Deprecated
    public DirectForwardingParams A00;
    public String A01;
    public String A02;
    public List A03;

    @Override // X.C1OW
    public final String A02() {
        return "send_shop_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A03;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String str = ((C910143t) this.A03.get(0)).A13;
        String str2 = this.A02;
        if (str != null && str2 != null) {
            String A01 = C47842LBj.A00().A01(C2EY.A1c, new C45116Jxl(this.A01, str2, str, 13));
            return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
        }
        return null;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1c;
    }
}
