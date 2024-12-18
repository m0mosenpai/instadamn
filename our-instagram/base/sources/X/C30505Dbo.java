package X;

import java.util.Iterator;

/* renamed from: X.Dbo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30505Dbo extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30505Dbo(Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C30505Dbo A02(C5Tl c5Tl, Object obj, int i) {
        C30505Dbo c30505Dbo = new C30505Dbo(obj, i);
        c5Tl.FBy(c30505Dbo);
        return c30505Dbo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1006:0x1982, code lost:
    
        if (r4.A08 != true) goto L1002;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1010:0x1992, code lost:
    
        if (r4.A04 != true) goto L1007;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1034:0x1a4e, code lost:
    
        if (r4.A07 != true) goto L1037;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1072:0x1ae9, code lost:
    
        if (r1.A08 != true) goto L1067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1076:0x1af9, code lost:
    
        if (r1.A04 != true) goto L1072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1100:0x1ba3, code lost:
    
        if (r1.A07 != true) goto L1102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x126a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0259  */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v84, types: [X.UFU] */
    /* JADX WARN: Type inference failed for: r5v91, types: [X.UFU] */
    /* JADX WARN: Type inference failed for: r5v94, types: [X.UFU] */
    @Override // X.InterfaceC16620sF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 8344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30505Dbo.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static MUW A00(Object obj, Object obj2, Iterator it) {
        MUW muw = (MUW) it.next();
        Object obj3 = muw.A01;
        if (obj3 == obj) {
            return new MUW(obj3, obj2, muw.A03, muw.A02, 1);
        }
        return muw;
    }

    public static C26072Bg1 A01(InterfaceC74963Ym interfaceC74963Ym) {
        return (C26072Bg1) interfaceC74963Ym.getValue();
    }
}
