package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30101cQ extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1cR
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30101cQ c30101cQ = (C30101cQ) obj;
            anonymousClass182.A0d();
            if (c30101cQ.A00 != null) {
                anonymousClass182.A0r("igtv_share");
                FUU.A00(c30101cQ.A00, anonymousClass182);
            }
            if (c30101cQ.A01 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c30101cQ.A01);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30101cQ);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6A.parseFromJson(c16l);
        }
    };
    public C206409Bx A00;

    @Deprecated
    public DirectForwardingParams A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_igtv_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        if (((C38321qM) this.A00.A00).A2f() != null) {
            String A01 = C47842LBj.A00().A01(C2EY.A0t, this.A00);
            return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
        }
        return null;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0t;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A1t;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A0t, this.A00));
    }
}
