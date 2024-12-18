package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.BUu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25632BUu implements C2JL {
    public final /* synthetic */ C6PT A00;
    public final /* synthetic */ AbstractC115825Lw A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        this.A01.DEB(this.A00, th);
    }

    public C25632BUu(C6PT c6pt, AbstractC115825Lw abstractC115825Lw, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = abstractC115825Lw;
        this.A00 = c6pt;
        this.A03 = z2;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C66199U3p c66199U3p = (C66199U3p) obj;
        if (c66199U3p == null) {
            onFailure(new C53401Njq(MSV.A00(76), null));
            return;
        }
        if (this.A02) {
            AbstractC115825Lw abstractC115825Lw = this.A01;
            Map map = abstractC115825Lw.A0O;
            C6PT c6pt = this.A00;
            map.put(c6pt, c66199U3p);
            C130015u6 c130015u6 = abstractC115825Lw.A0G;
            int size = map.size();
            Integer num = C05F.A00;
            C37416Gdw c37416Gdw = (C37416Gdw) c6pt;
            String str = c37416Gdw.A03;
            if (str == null) {
                str = "";
            }
            String str2 = c37416Gdw.A05;
            if (str2 == null) {
                str2 = "";
            }
            C57249PbX c57249PbX = new C57249PbX(size, 6, abstractC115825Lw);
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(str);
            A1E.add(str2);
            c130015u6.Chv(C6PA.A00(num, "cache", "carousel-window", A1E, AbstractC06930Yk.A0E(), c57249PbX));
        }
        if (!this.A03) {
            return;
        }
        this.A01.A04(this.A00, c66199U3p);
    }
}
