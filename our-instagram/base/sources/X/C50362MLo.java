package X;

import com.facebook.forker.Process;
import go.Seq;
import java.util.List;

/* renamed from: X.MLo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50362MLo extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50362MLo(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x03f0, code lost:
    
        if (r1.A00 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0918, code lost:
    
        if (r6 != X.EnumC92974Es.A09) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x091e, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0920, code lost:
    
        if (r6 != r2) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0922, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0924, code lost:
    
        r5 = r4.A00;
        r4 = r4.A01;
        r3 = r0.A02;
        r2 = r0.A06;
        r1 = r0.A05;
        r0 = r0.A07;
        X.C14360o3.A0B(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0946, code lost:
    
        return new X.C45292K2u(r6, r3, r5, r4, r9, r16, r17, r18, r2, r1, r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x091c, code lost:
    
        if (r7 == false) goto L267;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 2790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50362MLo.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50362MLo(int i, List list, InterfaceC16660sJ interfaceC16660sJ) {
        super(1);
        this.A00 = i;
        switch (i) {
            case Process.SIGSTOP /* 19 */:
            case 37:
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
            case 47:
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
