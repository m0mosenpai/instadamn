package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30401cv extends AbstractC29011ae implements InterfaceC29491bQ {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1cw
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30401cv c30401cv = (C30401cv) obj;
            anonymousClass182.A0d();
            if (c30401cv.A02 != null) {
                C16V.A03(anonymousClass182, "reels_audio_share");
                for (C910143t c910143t : c30401cv.A02) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c30401cv.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c30401cv.A00);
            }
            String str = c30401cv.A01;
            if (str != null) {
                anonymousClass182.A0S("audio_asset_id", str);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30401cv);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6N.parseFromJson(c16l);
        }
    };

    @Deprecated
    public DirectForwardingParams A00;
    public String A01;
    public List A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_reels_audio_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A02;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1U;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A1U, this.A01);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }
}
