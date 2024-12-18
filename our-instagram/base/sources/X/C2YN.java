package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2YN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YN {
    public String A00;
    public boolean A01;
    public final List A02 = new ArrayList();

    public final void A03(final InterfaceC16610sE interfaceC16610sE, Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        this.A02.add(new C77843eC(new C78043eW(new InterfaceC78033eV(this) { // from class: X.4mA
            public final int A00;
            public final String A01;

            @Override // X.InterfaceC78033eV
            public final C79773hS ADT(C2YO c2yo, Object obj, Object obj2) {
                C14360o3.A0B(c2yo, 0);
                C14360o3.A0B(obj, 1);
                return (C79773hS) interfaceC16610sE.invoke(c2yo, obj, obj2);
            }

            {
                this.A00 = this.A02.size();
                this.A01 = this.A00;
            }

            @Override // X.InterfaceC78033eV
            public final String getDescription() {
                Object obj = this.A01;
                if (obj == null) {
                    obj = Integer.valueOf(this.A00);
                }
                return String.valueOf(obj);
            }

            @Override // X.InterfaceC78033eV
            public final boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
                if (AbstractC78713fd.A02(obj3, obj4) && AbstractC78713fd.A02(obj, obj2)) {
                    return false;
                }
                return true;
            }
        }, null), objArr));
    }

    public final void A00(final Object obj, final Object obj2, final C0YS c0ys) {
        this.A02.add(new C77843eC(new C78043eW(new InterfaceC78033eV(this) { // from class: X.3ed
            public final int A00;
            public final String A01;

            @Override // X.InterfaceC78033eV
            public final C79773hS ADT(C2YO c2yo, Object obj3, Object obj4) {
                C14360o3.A0B(c2yo, 1);
                C14360o3.A0B(obj3, 1);
                C0YS c0ys2 = c0ys;
                ((InterfaceC16620sF) c0ys2).invoke(obj3, obj);
                return new C79773hS(new C9FP(7, obj3, c0ys2, obj2));
            }

            {
                this.A00 = this.A02.size();
                this.A01 = this.A00;
            }

            @Override // X.InterfaceC78033eV
            public final String getDescription() {
                Object obj3 = this.A01;
                if (obj3 == null) {
                    obj3 = Integer.valueOf(this.A00);
                }
                return String.valueOf(obj3);
            }

            @Override // X.InterfaceC78033eV
            public final boolean Ek2(Object obj3, Object obj4, Object obj5, Object obj6) {
                return !AbstractC78713fd.A02(obj3, obj4);
            }
        }, null), obj));
    }

    public final void A01(final Object obj, final C01D c01d) {
        this.A02.add(new C77843eC(new C78043eW(new InterfaceC78033eV(this) { // from class: X.4mB
            public final int A00;
            public final String A01;

            @Override // X.InterfaceC78033eV
            public final C79773hS ADT(C2YO c2yo, Object obj2, Object obj3) {
                C14360o3.A0B(c2yo, 1);
                C14360o3.A0B(obj2, 1);
                C01D c01d2 = c01d;
                c01d2.A02(obj2, obj);
                return new C79773hS(new C9FP(8, obj2, c01d2, (Object) null));
            }

            {
                this.A00 = this.A02.size();
                this.A01 = this.A00;
            }

            @Override // X.InterfaceC78033eV
            public final String getDescription() {
                Object obj2 = this.A01;
                if (obj2 == null) {
                    obj2 = Integer.valueOf(this.A00);
                }
                return String.valueOf(obj2);
            }

            @Override // X.InterfaceC78033eV
            public final boolean Ek2(Object obj2, Object obj3, Object obj4, Object obj5) {
                return !AbstractC78713fd.A02(obj2, obj3);
            }
        }, null), obj));
    }

    public final void A02(final InterfaceC16620sF interfaceC16620sF, Object[] objArr) {
        this.A02.add(new C77843eC(new C78043eW(new InterfaceC78033eV(this) { // from class: X.3eU
            public final int A00;
            public final String A01;

            @Override // X.InterfaceC78033eV
            public final C79773hS ADT(C2YO c2yo, Object obj, Object obj2) {
                C14360o3.A0B(c2yo, 1);
                C14360o3.A0B(obj, 1);
                return (C79773hS) interfaceC16620sF.invoke(c2yo, obj);
            }

            {
                this.A00 = this.A02.size();
                this.A01 = this.A00;
            }

            @Override // X.InterfaceC78033eV
            public final String getDescription() {
                Object obj = this.A01;
                if (obj == null) {
                    obj = Integer.valueOf(this.A00);
                }
                return String.valueOf(obj);
            }

            @Override // X.InterfaceC78033eV
            public final boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
                return !AbstractC78713fd.A02(obj, obj2);
            }
        }, null), objArr));
    }
}
