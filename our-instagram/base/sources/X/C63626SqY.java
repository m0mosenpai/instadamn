package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.SqY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63626SqY implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C63626SqY(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 14:
            case Process.SIGTERM /* 15 */:
                this.A03 = interfaceC103384lE;
                this.A01 = c6fq;
                this.A02 = interfaceC103384lE2;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A01 = c6fq;
                this.A03 = interfaceC103384lE;
                this.A02 = interfaceC103384lE2;
                break;
            default:
                this.A01 = c6fq;
                this.A02 = interfaceC103384lE;
                this.A03 = interfaceC103384lE2;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05bc  */
    @Override // X.InterfaceC58362lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63626SqY.onChanged(java.lang.Object):void");
    }

    public C63626SqY(C58252li c58252li, C63019Saj c63019Saj, LoggingContext loggingContext, int i) {
        this.A00 = i;
        this.A01 = c63019Saj;
        if (2 - i != 0) {
            this.A03 = c58252li;
            this.A02 = loggingContext;
        } else {
            this.A02 = c58252li;
            this.A03 = loggingContext;
        }
    }

    public C63626SqY(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
