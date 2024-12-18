package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30061cM extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1cN
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30061cM c30061cM = (C30061cM) obj;
            anonymousClass182.A0d();
            if (c30061cM.A00 != null) {
                anonymousClass182.A0r("direct_media_share");
                FUV.A00(c30061cM.A00, anonymousClass182);
            }
            if (c30061cM.A01 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c30061cM.A01);
            }
            anonymousClass182.A0T("is_x_transport_forward", c30061cM.A03);
            anonymousClass182.A0T("send_as_quoted_reply", c30061cM.A04);
            String str = c30061cM.A02;
            if (str != null) {
                anonymousClass182.A0S("social_context_share_type", str);
            }
            anonymousClass182.A0T("should_skip_genai_eval", c30061cM.A05);
            AbstractC47856LCb.A00(anonymousClass182, c30061cM);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6I.parseFromJson(c16l);
        }
    };
    public C9CL A00;
    public DirectForwardingParams A01;
    public String A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;

    @Override // X.C1OW
    public final String A02() {
        if (SocialContextType.A0C.A00.equals(this.A02)) {
            return "send_friendly_feed_message";
        }
        return "send_media_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1F;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A1x;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A00 = C47842LBj.A00().A00(new C47308KvJ(false), C2EY.A1x, this.A00.A00);
        return new C29481bP(new C206409Bx(A00), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A1F, this.A00));
    }
}
