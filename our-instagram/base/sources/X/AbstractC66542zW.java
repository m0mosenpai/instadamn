package X;

/* renamed from: X.2zW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC66542zW {
    public abstract int A02();

    public abstract int A03();

    public boolean A04(int i, int i2) {
        C66532zV c66532zV = (C66532zV) this;
        InterfaceC66492zQ interfaceC66492zQ = (InterfaceC66492zQ) c66532zV.A01.get(i);
        Object obj = c66532zV.A00.get(i2);
        interfaceC66492zQ.getClass();
        obj.getClass();
        if (interfaceC66492zQ.getClass().equals(obj.getClass()) && interfaceC66492zQ.isContentSame(obj)) {
            return true;
        }
        return false;
    }

    public boolean A05(int i, int i2) {
        C66532zV c66532zV = (C66532zV) this;
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) c66532zV.A01.get(i);
        InterfaceC66482zP interfaceC66482zP2 = (InterfaceC66482zP) c66532zV.A00.get(i2);
        if (interfaceC66482zP == interfaceC66482zP2 || (interfaceC66482zP != null && interfaceC66482zP2 != null && interfaceC66482zP.getKey() != null && interfaceC66482zP2.getKey() != null && interfaceC66482zP.getClass().equals(interfaceC66482zP2.getClass()) && interfaceC66482zP.getKey().equals(interfaceC66482zP2.getKey()))) {
            return true;
        }
        return false;
    }

    public Object A01(int i, int i2) {
        if (this instanceof C3HH) {
            C3HE c3he = ((C3HH) this).A00;
            Object obj = c3he.A04.get(i);
            Object obj2 = c3he.A03.get(i2);
            if (obj != null && obj2 != null) {
                return null;
            }
            throw new AssertionError();
        }
        return null;
    }
}
