package X;

import com.facebookpay.logging.LoggingContext;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DIA extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIA(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A06 = z;
        this.A01 = obj2;
        this.A05 = str;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C14360o3.A0B(obj, 0);
            if (this.A06) {
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A04;
                if (interfaceC74953Yl.getValue() == null) {
                    interfaceC74953Yl.Egh(this.A05);
                    ((InterfaceC16620sF) this.A02).invoke(this.A01, obj);
                }
            } else {
                ((InterfaceC16660sJ) this.A03).invoke(this.A01);
            }
            return C0eB.A00;
        }
        C25531Mh c25531Mh = (C25531Mh) obj;
        C0Zx c0Zx = new C0Zx();
        LoggingContext loggingContext = (LoggingContext) this.A04;
        c0Zx.A05("product_id", Long.valueOf(loggingContext.A00));
        c0Zx.A03("perform_validation", Boolean.valueOf(this.A06));
        c0Zx.A07(AbstractC43591JPw.A00(287), (List) this.A01);
        c0Zx.A02(AbstractC63059Sbg.A00(loggingContext), "logging_policy");
        c0Zx.A06("view_name", this.A05);
        RiH riH = (RiH) this.A02;
        if (riH != null) {
            c0Zx.A01(riH, "account_mutation_failure_step");
        }
        c25531Mh.A0N(c0Zx, "event_payload");
        Map map = (Map) this.A03;
        if (map == null) {
            return c25531Mh;
        }
        c25531Mh.A0w(map);
        return c25531Mh;
    }
}
