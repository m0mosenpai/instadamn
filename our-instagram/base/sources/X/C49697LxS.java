package X;

import java.util.Map;

/* renamed from: X.LxS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49697LxS implements InterfaceC42241xE {
    public final /* synthetic */ JR2 A00;

    public C49697LxS(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Map map = (Map) obj;
        C14360o3.A0B(map, 0);
        C125575m3 c125575m3 = C125575m3.A00;
        if (map.containsKey(c125575m3)) {
            Object obj2 = map.get(c125575m3);
            if (obj2 != null) {
                int A0H = AbstractC166987dD.A0H(obj2);
                JR2 jr2 = this.A00;
                jr2.A14(A0H);
                jr2.A17(Integer.valueOf(A0H));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
