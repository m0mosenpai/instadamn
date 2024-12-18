package X;

import java.io.BufferedReader;

/* loaded from: classes10.dex */
public final class TG2 implements InterfaceC25601Mq {
    public final int A00;

    public TG2(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        InterfaceC26481Qd A00 = ((C3JY) obj).A00();
        A00.getClass();
        BufferedReader A0h = AbstractC58320PtC.A0h(A00.AjT());
        StringBuilder A1C = AbstractC166987dD.A1C();
        while (true) {
            String readLine = A0h.readLine();
            if (readLine != null) {
                A1C.append(readLine);
                A1C.append('\n');
            } else {
                A0h.close();
                C45554KEt c45554KEt = new C45554KEt(AbstractC58318PtA.A17(A1C.toString()).getString("token"));
                c45554KEt.mStatusCode = 200;
                return c45554KEt;
            }
        }
    }
}
