package X;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.9D2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9D2 extends AbstractC23611Dp implements InterfaceC16610sE {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D2(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4;
        int i2;
        C9D2 c9d2;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (this.A02) {
            case 0:
                obj4 = this.A00;
                i2 = 0;
                c9d2 = new C9D2(obj4, interfaceC23621Ds, i2);
                break;
            case 1:
                obj4 = this.A00;
                i2 = 1;
                c9d2 = new C9D2(obj4, interfaceC23621Ds, i2);
                break;
            case 2:
                obj4 = this.A00;
                i2 = 2;
                c9d2 = new C9D2(obj4, interfaceC23621Ds, i2);
                break;
            case 3:
                i = 3;
                c9d2 = new C9D2(i, interfaceC23621Ds);
                c9d2.A00 = obj;
                break;
            case 4:
                i = 4;
                c9d2 = new C9D2(i, interfaceC23621Ds);
                c9d2.A00 = obj;
                break;
            case 5:
                i = 5;
                c9d2 = new C9D2(i, interfaceC23621Ds);
                c9d2.A00 = obj;
                break;
            default:
                i = 6;
                c9d2 = new C9D2(i, interfaceC23621Ds);
                c9d2.A00 = obj;
                break;
        }
        c9d2.A01 = obj2;
        return c9d2.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C006802i c006802i;
        int A00;
        int i;
        switch (this.A02) {
            case 0:
                AbstractC09560e7.A00(obj);
                Object obj3 = this.A01;
                if (obj3 != null && (obj3 instanceof CancellationException)) {
                    C172787mo c172787mo = (C172787mo) this.A00;
                    c006802i = c172787mo.A02;
                    A00 = c172787mo.A00;
                    i = 17635885;
                    c006802i.markerEnd(i, A00, (short) 4);
                }
                return C0eB.A00;
            case 1:
                AbstractC09560e7.A00(obj);
                Object obj4 = this.A01;
                if (obj4 != null && (obj4 instanceof CancellationException)) {
                    C172767mm c172767mm = (C172767mm) this.A00;
                    c006802i = C006802i.A0p;
                    A00 = C172767mm.A00(c172767mm);
                    i = 17640585;
                    c006802i.markerEnd(i, A00, (short) 4);
                }
                return C0eB.A00;
            case 2:
                AbstractC09560e7.A00(obj);
                Object obj5 = this.A01;
                if (obj5 != null && (obj5 instanceof CancellationException)) {
                    C172897n3 c172897n3 = (C172897n3) this.A00;
                    c006802i = C006802i.A0p;
                    C14360o3.A07(c006802i);
                    A00 = C172897n3.A00(c172897n3);
                    i = 17631244;
                    c006802i.markerEnd(i, A00, (short) 4);
                }
                return C0eB.A00;
            case 3:
            case 5:
            default:
                AbstractC09560e7.A00(obj);
                return new C09530e4(this.A00, this.A01);
            case 4:
                AbstractC09560e7.A00(obj);
                Map map = (Map) this.A00;
                Object obj6 = this.A01;
                if (obj6 != null) {
                    return map.get(obj6);
                }
                return new C195478kn(null, null, C16910sj.A00, false);
            case 6:
                AbstractC09560e7.A00(obj);
                C09530e4 c09530e4 = (C09530e4) this.A00;
                Object obj7 = this.A01;
                if (c09530e4 != null) {
                    obj2 = c09530e4.A01;
                } else {
                    obj2 = null;
                }
                return new C09530e4(obj2, obj7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D2(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
    }
}
