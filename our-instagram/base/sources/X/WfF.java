package X;

import java.util.LinkedList;

/* loaded from: classes11.dex */
public final class WfF implements InterfaceC126005ms {
    public InterfaceC103384lE A00;
    public final String A01;

    @Override // X.InterfaceC126005ms
    public final boolean FDk(C102884kP c102884kP) {
        LinkedList<Q02> linkedList = c102884kP.A09;
        if (linkedList != null) {
            for (Q02 q02 : linkedList) {
                String str = this.A01;
                String str2 = q02.A03;
                if (str2 != null && str2.equals(str)) {
                    this.A00 = q02.A02;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public WfF(String str) {
        this.A01 = str;
    }
}
