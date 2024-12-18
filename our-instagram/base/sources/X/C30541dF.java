package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30541dF extends AbstractC29011ae implements InterfaceC29491bQ {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1dG
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30541dF c30541dF = (C30541dF) obj;
            anonymousClass182.A0d();
            if (c30541dF.A02 != null) {
                C16V.A03(anonymousClass182, "info_center_share");
                for (C910143t c910143t : c30541dF.A02) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            Integer num = c30541dF.A01;
            if (num != null) {
                anonymousClass182.A0S("info_center_type", AbstractC47055KrC.A00(num));
            }
            AbstractC47856LCb.A00(anonymousClass182, c30541dF);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46962Kph.parseFromJson(c16l);
        }
    };
    public InfoCenterShareInfoIntf A00;
    public Integer A01;
    public List A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_info_center_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A02;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A14;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A14, this.A00);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }
}
