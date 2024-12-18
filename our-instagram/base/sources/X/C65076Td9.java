package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.Td9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65076Td9 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static Object A00(Object obj, C65076Td9 c65076Td9) {
        C14360o3.A0B(obj, 0);
        return c65076Td9.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65076Td9(SYG syg, List list, int i) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 31:
            case 32:
            case 33:
                this.A02 = syg;
                this.A01 = list;
                break;
            default:
                this.A01 = syg;
                this.A02 = list;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x05c2, code lost:
    
        if (r1.equals(r4.A0E.A04()) != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x080b, code lost:
    
        if (r0 == 0) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x098d, code lost:
    
        if (r5 == X.EnumC61204Rh4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0a88, code lost:
    
        if (java.lang.Integer.valueOf(r3) != null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0a8d, code lost:
    
        if (r11 != null) goto L366;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0992  */
    /* JADX WARN: Type inference failed for: r1v47, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v18, types: [X.QEC] */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 3000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65076Td9.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65076Td9(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65076Td9(Fragment fragment, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(1);
        this.A00 = i;
        if (40 - i != 0) {
            this.A02 = interfaceC16660sJ;
            this.A01 = fragment;
        } else {
            this.A01 = interfaceC16660sJ;
            this.A02 = fragment;
        }
    }
}
