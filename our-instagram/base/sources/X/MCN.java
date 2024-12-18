package X;

import android.graphics.Rect;
import com.instagram.direct.store.impl.sqlite.DirectThreadsParser;
import java.util.List;

/* loaded from: classes8.dex */
public final class MCN extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCN(C5XO c5xo, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A04 = 2;
        this.A06 = c5xo;
        this.A00 = i;
        this.A05 = i2;
        this.A02 = interfaceC16660sJ;
    }

    public static C50112Sa A00(Object obj, Object obj2, C19L c19l, int i) {
        return AbstractC23641Du.A02(AnonymousClass191.A00, new MC4(obj, obj2, null, i), c19l);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        DirectThreadsParser directThreadsParser;
        int i;
        List list;
        int i2;
        MCN mcn;
        Object obj2;
        Object obj3;
        int i3;
        int i4;
        int i5;
        Object obj4;
        Object obj5;
        int i6;
        int i7;
        Object obj6;
        int i8;
        switch (this.A04) {
            case 0:
                obj4 = this.A06;
                obj5 = this.A02;
                i6 = this.A00;
                i7 = this.A05;
                obj6 = this.A03;
                i8 = 0;
                return new MCN(obj5, obj6, obj4, interfaceC23621Ds, i6, i7, i8);
            case 1:
                return new MCN((Rect) this.A06, (C55601Omh) this.A03, interfaceC23621Ds, (byte[]) this.A02, this.A00, this.A05, this.A01);
            case 2:
                MCN mcn2 = new MCN((C5XO) this.A06, interfaceC23621Ds, (InterfaceC16660sJ) this.A02, this.A00, this.A05);
                mcn2.A03 = obj;
                return mcn2;
            case 3:
                obj2 = this.A03;
                obj3 = this.A06;
                i3 = this.A00;
                i4 = this.A05;
                i5 = 3;
                mcn = new MCN(obj2, obj3, interfaceC23621Ds, i3, i4, i5);
                mcn.A02 = obj;
                return mcn;
            case 4:
                obj2 = this.A03;
                obj3 = this.A06;
                i3 = this.A00;
                i4 = this.A05;
                i5 = 4;
                mcn = new MCN(obj2, obj3, interfaceC23621Ds, i3, i4, i5);
                mcn.A02 = obj;
                return mcn;
            case 5:
                directThreadsParser = (DirectThreadsParser) this.A03;
                i = this.A05;
                list = (List) this.A06;
                i2 = 5;
                mcn = new MCN(directThreadsParser, list, interfaceC23621Ds, i, i2);
                mcn.A02 = obj;
                return mcn;
            case 6:
                directThreadsParser = (DirectThreadsParser) this.A03;
                i = this.A05;
                list = (List) this.A06;
                i2 = 6;
                mcn = new MCN(directThreadsParser, list, interfaceC23621Ds, i, i2);
                mcn.A02 = obj;
                return mcn;
            default:
                obj5 = this.A02;
                i6 = this.A00;
                i7 = this.A05;
                obj6 = this.A03;
                obj4 = this.A06;
                i8 = 7;
                return new MCN(obj5, obj6, obj4, interfaceC23621Ds, i6, i7, i8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x041a, code lost:
    
        if (X.AbstractC166987dD.A1a(r2) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0416, code lost:
    
        if (r2 == r1) goto L172;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x030b A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MCN) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCN(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A04 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A05 = i2;
        this.A03 = obj2;
        this.A06 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCN(Rect rect, C55601Omh c55601Omh, InterfaceC23621Ds interfaceC23621Ds, byte[] bArr, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A04 = 1;
        this.A03 = c55601Omh;
        this.A02 = bArr;
        this.A00 = i;
        this.A05 = i2;
        this.A06 = rect;
        this.A01 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCN(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A04 = i3;
        this.A03 = obj;
        this.A06 = obj2;
        this.A00 = i;
        this.A05 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCN(DirectThreadsParser directThreadsParser, List list, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A04 = i2;
        this.A03 = directThreadsParser;
        this.A05 = i;
        this.A06 = list;
    }
}
