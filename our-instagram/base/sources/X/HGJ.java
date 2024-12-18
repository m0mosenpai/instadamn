package X;

import java.util.Collection;

/* loaded from: classes7.dex */
public final class HGJ extends C1P1 {
    public final /* synthetic */ C38333GtS A00;

    public HGJ(C38333GtS c38333GtS) {
        this.A00 = c38333GtS;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object value;
        C37838Gks c37838Gks;
        int A03 = C0f9.A03(1935765184);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A032 = C0f9.A03(-1255575899);
        C14360o3.A0B(c74293Vk, 0);
        C38321qM A0x = AbstractC25225BEi.A0x(c74293Vk.A06, 0);
        if (A0x != null) {
            C38333GtS c38333GtS = this.A00;
            C1DW.A00(c38333GtS.A01).A03(A0x);
            c38333GtS.A00 += AbstractC25227BEk.A06(C41D.A00(A0x), 0);
            C05A c05a = c38333GtS.A04;
            do {
                value = c05a.getValue();
                c37838Gks = (C37838Gks) value;
            } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, A0x, null, null, AbstractC001800i.A0T(C42562Isg.A00, (Collection) c37838Gks.A02), null, null, null, 124)));
        }
        C0f9.A0A(1598450533, A032);
        C0f9.A0A(-564125300, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C0f9.A0A(75816988, C0f9.A03(1573874556));
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(332682148, C0f9.A03(397985629));
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(-1840703689, C0f9.A03(-1774090054));
    }
}
