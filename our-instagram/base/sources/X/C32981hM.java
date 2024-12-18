package X;

import com.instagram.direct.model.DirectForwardingParams;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* renamed from: X.1hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32981hM extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1hN
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C32981hM c32981hM = (C32981hM) obj;
            anonymousClass182.A0d();
            if (c32981hM.A01 != null) {
                anonymousClass182.A0r("forward_media");
                C38321qM c38321qM = c32981hM.A01;
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                C38801rC.A07(anonymousClass182, c38321qM);
            }
            if (c32981hM.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c32981hM.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c32981hM);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34155F5f.parseFromJson(c16l);
        }
    };
    public DirectForwardingParams A00;
    public C38321qM A01;

    @Override // X.C1OW
    public final String A02() {
        return "forward_media_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A01;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1C;
    }
}
