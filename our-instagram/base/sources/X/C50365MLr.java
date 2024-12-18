package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.logging.LoggingContext;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

/* renamed from: X.MLr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50365MLr extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50365MLr(LoggingContext loggingContext, Long l, String str, Map map, int i) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
                this.A02 = loggingContext;
                this.A04 = str;
                this.A03 = l;
                this.A01 = map;
                break;
            case 5:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                this.A03 = loggingContext;
                this.A04 = str;
                this.A01 = l;
                this.A02 = map;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (X.C14360o3.A0K(r2, "add_shipping_info") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0243, code lost:
    
        if (X.C63406Sjd.A0G(r11) != false) goto L63;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50365MLr.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50365MLr(Object obj, Object obj2, Object obj3, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }
}
