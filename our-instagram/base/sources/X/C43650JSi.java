package X;

import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.instagram.common.session.UserSession;

/* renamed from: X.JSi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43650JSi extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43650JSi(InterfaceC74953Yl interfaceC74953Yl, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        super(1);
        this.A00 = i;
        if (9 - i != 0) {
            this.A02 = userSession;
            this.A04 = str;
            this.A05 = z;
            this.A01 = interfaceC16660sJ;
            this.A03 = interfaceC74953Yl;
        } else {
            this.A03 = userSession;
            this.A04 = str;
            this.A05 = z;
            this.A02 = interfaceC16660sJ;
            this.A01 = interfaceC74953Yl;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r4), r4, 2342166105982643163L) != false) goto L139;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43650JSi.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43650JSi(C58853QCo c58853QCo, LoggingContext loggingContext, OtcInput otcInput, int i) {
        super(1);
        this.A00 = i;
        if (4 - i != 0) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43650JSi(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A05 = z;
        this.A02 = obj3;
    }
}
