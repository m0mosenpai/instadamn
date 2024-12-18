package X;

import com.facebook.common.dextricks.JITProfilePQR;
import java.util.List;

/* renamed from: X.DRo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30183DRo extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30183DRo(int i, List list, InterfaceC16660sJ interfaceC16660sJ) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 3:
            case 8:
            case 14:
            case 35:
            case 37:
            case 39:
            case 44:
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

    public static C30183DRo A00(C5Tl c5Tl, Object obj, Object obj2, int i) {
        C30183DRo c30183DRo = new C30183DRo(i, obj, obj2);
        c5Tl.FBy(c30183DRo);
        return c30183DRo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0319, code lost:
    
        if (X.C14360o3.A0K(r0.A02, "ai_terms_link") != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04da, code lost:
    
        if (X.AbstractC166997dE.A1Z(((X.C45124Jxt) r5.A07.getValue()).A03, true) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05ce, code lost:
    
        if (r3.equals("learn_more_link") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05f8, code lost:
    
        r0 = X.AbstractC111324zv.A00(438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0605, code lost:
    
        if (r3.equals("ai_terms_link") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05f6, code lost:
    
        if (X.C14360o3.A0K(r1, "learn_more_link") != false) goto L207;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30183DRo.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30183DRo(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
