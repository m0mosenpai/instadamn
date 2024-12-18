package X;

import com.instagram.user.model.Product;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HG4 extends C1P1 {
    public final /* synthetic */ InterfaceC43442JHg A00;
    public final /* synthetic */ C1563470e A01;
    public final /* synthetic */ Product A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public HG4(InterfaceC43442JHg interfaceC43442JHg, C1563470e c1563470e, Product product, String str, List list) {
        this.A01 = c1563470e;
        this.A03 = str;
        this.A04 = list;
        this.A02 = product;
        this.A00 = interfaceC43442JHg;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1224804280);
        C1563470e c1563470e = this.A01;
        c1563470e.A0E(EnumC39539HdB.A02, this.A03);
        c1563470e.A04.E4s(new C42253Ind(this.A02, C05F.A01));
        InterfaceC43442JHg interfaceC43442JHg = this.A00;
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = null;
        }
        interfaceC43442JHg.DVJ(str);
        C0f9.A0A(2053661711, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        int A03 = C0f9.A03(-1429029338);
        C38888HAk c38888HAk = (C38888HAk) obj;
        int A032 = C0f9.A03(-590407295);
        C14360o3.A0B(c38888HAk, 0);
        C1563470e c1563470e = this.A01;
        String str = this.A03;
        c1563470e.A0E(EnumC39539HdB.A03, str);
        List A19 = AbstractC31172DnG.A19(c38888HAk.A03);
        boolean A1b = AbstractC166987dD.A1b(A19);
        Iterator it = this.A04.iterator();
        if (A1b) {
            while (it.hasNext()) {
                c1563470e.A0A(str).remove(it.next());
            }
        } else {
            while (it.hasNext()) {
                ((C41229IMu) it.next()).A00 = EnumC39537Hd9.A02;
            }
        }
        C1563470e.A03(c1563470e, c38888HAk.A02, c38888HAk.A01);
        INR A06 = c1563470e.A06(str);
        if (A06 != null) {
            c1563470e.A07.D2c(A06, str);
        }
        if (c1563470e.A0F.contains(str) && C1563470e.A04(c1563470e, str) && !C1563470e.A05(c1563470e, str)) {
            c1563470e.A0B();
        }
        if (A06 != null) {
            String str2 = this.A02.A0H;
            C14360o3.A0B(str2, 0);
            obj2 = A06.A01.get(str2);
        } else {
            obj2 = null;
        }
        boolean A1b2 = AbstractC166987dD.A1b(A19);
        C25671My c25671My = c1563470e.A04;
        Product product = this.A02;
        if (A1b2) {
            c25671My.E4s(new C42253Ind(product, C05F.A01));
            this.A00.Dxo(A19);
        } else if (obj2 != null) {
            c25671My.E4s(new C42253Ind(product, C05F.A00));
            this.A00.onSuccess(obj2);
        } else {
            c25671My.E4s(new C42253Ind(product, C05F.A01));
            this.A00.DVJ(null);
        }
        C0f9.A0A(-2087476043, A032);
        C0f9.A0A(-709909209, A03);
    }
}
