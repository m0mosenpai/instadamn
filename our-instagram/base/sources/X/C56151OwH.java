package X;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/* renamed from: X.OwH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56151OwH implements InterfaceC25601Mq {
    public static final N3Q A00(C3JY c3jy) {
        C14360o3.A0B(c3jy, 0);
        InterfaceC26481Qd A00 = c3jy.A00();
        if (A00 != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(A00.AjT()));
            StringBuilder A1C = AbstractC166987dD.A1C();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    A1C.append(readLine);
                } else {
                    bufferedReader.close();
                    int i = c3jy.A02;
                    String A19 = AbstractC166987dD.A19(A1C);
                    String str = c3jy.A03;
                    List list = c3jy.A04;
                    Object[] array = list.toArray(new C23781El[list.size()]);
                    C14360o3.A07(array);
                    return new N3Q(i, A19, str, AbstractC009903n.A0J(array));
                }
            }
        } else {
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        return A00((C3JY) obj);
    }
}
