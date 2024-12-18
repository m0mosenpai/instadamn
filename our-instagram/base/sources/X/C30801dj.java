package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30801dj extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1dk
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30801dj c30801dj = (C30801dj) obj;
            anonymousClass182.A0d();
            if (c30801dj.A00 != null) {
                anonymousClass182.A0r("product_share");
                C51755Mte c51755Mte = c30801dj.A00;
                anonymousClass182.A0d();
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) c51755Mte.A00;
                if (productDetailsProductItemDict != null) {
                    anonymousClass182.A0r("product");
                    AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                }
                anonymousClass182.A0a();
            }
            if (c30801dj.A01 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c30801dj.A01);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30801dj);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6K.parseFromJson(c16l);
        }
    };
    public C51755Mte A00;

    @Deprecated
    public DirectForwardingParams A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_product_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1a;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A21;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A1a, this.A00.A00);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A1a, this.A00.A00));
    }
}
