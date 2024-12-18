package X;

import com.instagram.api.schemas.RankingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.H9g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38858H9g extends AbstractC72023La implements InterfaceC124295jj, InterfaceC74303Vl {
    public C74433Vz A02;
    public C38647Gyo A03;
    public RankingInfo A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public String A09;
    public HashMap A0A;
    public List A0C;
    public List A0D;
    public long A01 = -1;
    public long A00 = -1;
    public List A0B = C16930sl.A00;
    public C111074zO A04 = AbstractC37302Gc3.A0D(InterfaceC111084zP.A00, false);

    @Override // X.InterfaceC124295jj
    public final String Bb1() {
        return null;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.AbstractC72023La, X.InterfaceC55612h1
    public final void EQh(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // X.InterfaceC124295jj
    public final List Ahw() {
        return this.A0D;
    }

    @Override // X.InterfaceC124295jj
    public final HashMap Ahz() {
        return this.A0A;
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01;
    }

    @Override // X.InterfaceC124295jj
    public final List AoM() {
        List<C38688GzT> list = this.A0C;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C38688GzT c38688GzT : list) {
                C14360o3.A0B(c38688GzT, 0);
                C120985dq A03 = AbstractC128065qa.A03(AbstractC128065qa.A01(c38688GzT));
                if (A03 != null) {
                    A1E.add(A03);
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC124295jj
    public final List AoN() {
        List list = this.A0C;
        if (list == null) {
            return C16930sl.A00;
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC128065qa.A01((C38688GzT) it.next()));
        }
        return A0q;
    }

    @Override // X.InterfaceC124295jj
    public final List AoP() {
        List<C38601Gy4> list = this.A0B;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C38601Gy4 c38601Gy4 : list) {
            C14360o3.A0B(c38601Gy4, 0);
            A0q.add(AbstractC128065qa.A02(new C111034zF(c38601Gy4.A00, c38601Gy4.A01)));
        }
        return A0q;
    }

    @Override // X.InterfaceC124295jj
    public final InterfaceC111084zP BbA() {
        return this.A04;
    }

    @Override // X.InterfaceC124295jj
    public final String Boh() {
        return this.A09;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        if (this.A04.A01) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1)));
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C38647Gyo c38647Gyo = this.A03;
        if (c38647Gyo == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        return c38647Gyo;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A04.A00;
    }

    @Override // X.InterfaceC124295jj
    public final boolean Cew() {
        return AbstractC166997dE.A0b().equals(this.A07);
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A01 = j;
    }
}
