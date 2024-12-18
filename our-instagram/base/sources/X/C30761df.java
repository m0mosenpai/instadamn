package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30761df extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1dg
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30761df c30761df = (C30761df) obj;
            anonymousClass182.A0d();
            if (c30761df.A00 != null) {
                anonymousClass182.A0r("ar_effect");
                LC6.A00(anonymousClass182, c30761df.A00);
            }
            if (c30761df.A01 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c30761df.A01);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30761df);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46955Kpa.parseFromJson(c16l);
        }
    };
    public DirectAREffectShare A00;

    @Deprecated
    public DirectForwardingParams A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_ar_effect_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0M;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A1q;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A0M, this.A00);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A0M, this.A00));
    }
}
