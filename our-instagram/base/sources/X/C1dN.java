package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1dN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1dN extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1dP
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C1dN c1dN = (C1dN) obj;
            anonymousClass182.A0d();
            if (c1dN.A01 != null) {
                anonymousClass182.A0r("profile");
                User user = c1dN.A01;
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user);
            }
            if (c1dN.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c1dN.A00);
            }
            anonymousClass182.A0T("is_x_transport_forward", c1dN.A02);
            AbstractC47856LCb.A00(anonymousClass182, c1dN);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6L.parseFromJson(c16l);
        }
    };

    @Deprecated
    public DirectForwardingParams A00;
    public User A01;
    public boolean A02 = false;

    @Override // X.C1OW
    public final String A02() {
        if (this.A01.A03.Aah() != null) {
            return "send_ai_agent_profile_share_message";
        }
        return "send_profile_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A01;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1Q;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A1y;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A1y, this.A01);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A1Q, this.A01));
    }
}
