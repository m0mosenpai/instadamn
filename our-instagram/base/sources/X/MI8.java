package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MI8 extends C0YY implements InterfaceC16660sJ {
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI8(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, Map map, long j) {
        super(1);
        this.A03 = loggingContext;
        this.A00 = j;
        this.A01 = enumC72407Xcu;
        this.A02 = map;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25531Mh c25531Mh = (C25531Mh) obj;
        C0Zx c0Zx = new C0Zx();
        LoggingContext loggingContext = (LoggingContext) this.A03;
        AbstractC43594JPz.A1E(c0Zx, loggingContext);
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A05("credential_id", Long.valueOf(this.A00));
        JQ1.A0e(c0Zx2, c0Zx, this.A01);
        AbstractC43593JPy.A1L(c0Zx, loggingContext);
        AbstractC43592JPx.A1N(c0Zx, "checkout");
        AbstractC43592JPx.A1M(c25531Mh, c0Zx);
        AbstractC43593JPy.A1M(c25531Mh, this.A02);
        return c25531Mh;
    }
}
