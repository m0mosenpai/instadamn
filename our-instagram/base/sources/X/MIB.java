package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MIB extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ LoggingContext A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIB(LoggingContext loggingContext, String str, String str2, Map map, boolean z) {
        super(1);
        this.A00 = loggingContext;
        this.A02 = str;
        this.A04 = z;
        this.A01 = str2;
        this.A03 = map;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25531Mh c25531Mh = (C25531Mh) obj;
        C0Zx c0Zx = new C0Zx();
        AbstractC43594JPz.A1E(c0Zx, this.A00);
        String str = this.A02;
        if (str == null) {
            str = "";
        }
        c0Zx.A06("receiver_id", str);
        c0Zx.A03("is_ecp_available", Boolean.valueOf(this.A04));
        AbstractC43592JPx.A1N(c0Zx, "checkout_setup_mutation");
        String str2 = this.A01;
        if (str2 != null) {
            c0Zx.A05("order_id", AbstractC166997dE.A0j(str2));
        }
        AbstractC43592JPx.A1M(c25531Mh, c0Zx);
        c25531Mh.A0w(this.A03);
        return c25531Mh;
    }
}
