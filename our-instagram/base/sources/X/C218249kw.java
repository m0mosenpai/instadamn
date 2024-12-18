package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.Iterator;

/* renamed from: X.9kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218249kw extends C8J9 implements C8FJ {
    public final C23790Ag1 A00;
    public final C218199kr A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.8JE, X.9kr] */
    public C218249kw(Context context, C8C0 c8c0, C23790Ag1 c23790Ag1) {
        super(c8c0);
        C14360o3.A0B(c8c0, 2);
        this.A00 = c23790Ag1;
        ?? c8je = new C8JE(context, this, this, false, true, false, false);
        this.A01 = c8je;
        super.A00 = c8je;
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DDC(InterfaceC120325cX interfaceC120325cX, String str, int i, boolean z) {
        EnumC172837mv enumC172837mv = (EnumC172837mv) interfaceC120325cX;
        C14360o3.A0B(enumC172837mv, 0);
        C23790Ag1 c23790Ag1 = this.A00;
        if (c23790Ag1.A0D.CRB(EnumC1810181d.A10)) {
            c23790Ag1.A01 = enumC172837mv;
            GridLayoutManager gridLayoutManager = c23790Ag1.A04;
            gridLayoutManager.A1v(enumC172837mv.A00);
            AbstractC154146wP abstractC154146wP = c23790Ag1.A01.A04;
            if (abstractC154146wP == null) {
                abstractC154146wP = new AbstractC154146wP();
            }
            gridLayoutManager.A01 = abstractC154146wP;
            UH0 uh0 = c23790Ag1.A0C;
            Iterator it = uh0.A05.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                C22919A8p c22919A8p = (C22919A8p) it.next();
                C210089Qx c210089Qx = c23790Ag1.A0B;
                C56302iJ A03 = c210089Qx.A03(c23790Ag1.A01, i2);
                if (A03 != null) {
                    c22919A8p.A00 = A03;
                    C22918A8o A04 = c210089Qx.A04(c23790Ag1.A01, i2);
                    C14360o3.A0B(A04, 0);
                    c22919A8p.A01 = A04;
                    i2 = i3;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            uh0.notifyDataSetChanged();
        }
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
        throw C00O.createAndThrow();
    }
}
