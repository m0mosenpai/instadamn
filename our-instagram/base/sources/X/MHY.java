package X;

import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;

/* loaded from: classes8.dex */
public final class MHY extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHY(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = obj3;
        this.A05 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHY.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHY(C58853QCo c58853QCo, LoggingContext loggingContext, OtcInput otcInput, int i) {
        super(0);
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = loggingContext;
            this.A04 = "DELETE";
            this.A05 = true;
            this.A03 = c58853QCo;
            this.A02 = otcInput;
        } else {
            this.A02 = loggingContext;
            this.A04 = "DELETE";
            this.A05 = true;
            this.A01 = c58853QCo;
            this.A03 = otcInput;
        }
    }
}
