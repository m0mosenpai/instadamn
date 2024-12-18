package X;

import com.facebook.common.dextricks.JITProfilePQR;
import java.util.List;

/* renamed from: X.MLx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50370MLx extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50370MLx(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0696, code lost:
    
        if (r0 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x06fd, code lost:
    
        if (r1 != false) goto L185;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.0pQ, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 2120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50370MLx.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50370MLx(C5Hc c5Hc, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(1);
        this.A00 = i;
        if (47 - i != 0) {
            this.A02 = c5Hc;
            this.A01 = interfaceC16660sJ;
        } else {
            this.A01 = c5Hc;
            this.A02 = interfaceC16660sJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50370MLx(int i, List list, InterfaceC16660sJ interfaceC16660sJ) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 0:
            case 3:
            case 5:
            case 8:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 48:
                this.A01 = interfaceC16660sJ;
                this.A02 = list;
                break;
            default:
                this.A02 = interfaceC16660sJ;
                this.A01 = list;
                break;
        }
    }
}
