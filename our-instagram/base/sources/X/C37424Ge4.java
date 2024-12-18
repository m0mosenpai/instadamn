package X;

import java.util.Map;

/* renamed from: X.Ge4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37424Ge4 extends C1P1 {
    public final /* synthetic */ C57782kr A00;
    public final /* synthetic */ String A01;

    public C37424Ge4(C57782kr c57782kr, String str) {
        this.A00 = c57782kr;
        this.A01 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1026062643);
        int A032 = C0f9.A03(-1246648426);
        C57782kr c57782kr = this.A00;
        Map map = c57782kr.A03;
        String str = this.A01;
        C57802kt c57802kt = (C57802kt) map.get(str);
        if (c57802kt != null) {
            c57782kr.A04.addAll(c57802kt.A02);
        }
        map.remove(str);
        if (c57782kr.A00 != c57782kr.A0L().size()) {
            c57782kr.A0A();
        }
        C0f9.A0A(-615892211, A032);
        C0f9.A0A(351919844, A03);
    }
}
