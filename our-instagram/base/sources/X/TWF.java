package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class TWF implements InterfaceC65460TkW {
    public final /* synthetic */ C60889Rax A00;

    public TWF(C60889Rax c60889Rax) {
        this.A00 = c60889Rax;
    }

    @Override // X.InterfaceC65460TkW
    public final /* bridge */ /* synthetic */ void CJA(Object obj, Object obj2) {
        Map map = (Map) obj2;
        C14360o3.A0B(map, 1);
        C60889Rax c60889Rax = this.A00;
        Object obj3 = c60889Rax.A02.get("cancelUrl");
        AbstractC25225BEi.A1S(obj3);
        C60889Rax.A00(c60889Rax, (String) obj3, map, false);
    }
}
