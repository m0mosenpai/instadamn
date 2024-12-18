package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Pa2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57177Pa2 extends AbstractC23611Dp implements InterfaceC16610sE {
    public float A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57177Pa2(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        int i2 = this.A02;
        float A09 = AbstractC166987dD.A09(obj2);
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (i2) {
            case 0:
                obj4 = this.A03;
                i = 0;
                break;
            case 1:
                obj4 = this.A03;
                i = 1;
                break;
            case 2:
                obj4 = this.A03;
                i = 2;
                break;
            case 3:
                obj4 = this.A03;
                i = 3;
                break;
            default:
                obj4 = this.A03;
                i = 4;
                break;
        }
        C57177Pa2 c57177Pa2 = new C57177Pa2(obj4, interfaceC23621Ds, i);
        c57177Pa2.A01 = obj;
        c57177Pa2.A00 = A09;
        return c57177Pa2.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String string;
        float A01;
        O2A o2a;
        C19L c19l;
        float f;
        InterfaceC23621Ds interfaceC23621Ds;
        Object obj2;
        int i;
        int i2 = this.A02;
        AbstractC09560e7.A00(obj);
        switch (i2) {
            case 0:
                List list = (List) this.A01;
                float f2 = this.A00;
                if (AbstractC166987dD.A1b(list)) {
                    string = ((Context) this.A03).getString(2131955346);
                    A01 = AbstractC54867OOc.A01(f2);
                    o2a = NII.A00;
                    break;
                } else {
                    return null;
                }
            case 1:
                List list2 = (List) this.A01;
                float f3 = this.A00;
                if (AbstractC166987dD.A1b(list2)) {
                    string = ((Context) this.A03).getString(2131955347);
                    A01 = AbstractC54867OOc.A01(f3);
                    o2a = NIJ.A00;
                    break;
                } else {
                    return null;
                }
            case 2:
                List list3 = (List) this.A01;
                float f4 = this.A00;
                if (AbstractC166987dD.A1b(list3)) {
                    string = ((Context) this.A03).getString(2131956236);
                    A01 = AbstractC54867OOc.A01(f4);
                    o2a = NIL.A00;
                    break;
                } else {
                    return null;
                }
            case 3:
                c19l = (C19L) this.A01;
                f = this.A00;
                interfaceC23621Ds = null;
                obj2 = this.A03;
                i = 15;
                AbstractC166987dD.A1Z(new PYa(obj2, interfaceC23621Ds, f, i), c19l);
                return C0eB.A00;
            default:
                c19l = (C19L) this.A01;
                f = this.A00;
                interfaceC23621Ds = null;
                obj2 = this.A03;
                i = 16;
                AbstractC166987dD.A1Z(new PYa(obj2, interfaceC23621Ds, f, i), c19l);
                return C0eB.A00;
        }
        return new C51631MrO(null, o2a, null, null, string, null, null, A01, true);
    }
}
