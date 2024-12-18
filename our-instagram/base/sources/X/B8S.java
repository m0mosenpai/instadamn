package X;

import android.content.res.Resources;

/* loaded from: classes4.dex */
public final class B8S extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8S(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new B8S(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (r11 != false) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0394  */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.fragment.app.Fragment, X.2oe, X.51D] */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8S.invoke():java.lang.Object");
    }

    public static void A01(Resources resources, C9S6 c9s6, C6RB c6rb, int i) {
        c6rb.A0A(resources.getDimension(i));
        c6rb.A0F(c9s6.A0B);
        c6rb.A0D(5.0f, 0.0f, 0.0f, c9s6.A0C);
    }
}
