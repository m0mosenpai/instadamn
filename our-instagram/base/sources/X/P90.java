package X;

import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P90 implements InterfaceC64002vL {
    public final /* synthetic */ ArchiveReelHighlightsFragment A00;

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void DSa() {
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De6(Reel reel, C70873Fz c70873Fz, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        C38E c38e;
        C14360o3.A0B(str, 0);
        ArchiveReelHighlightsFragment archiveReelHighlightsFragment = this.A00;
        C38E c38e2 = archiveReelHighlightsFragment.A01;
        if (c38e2 != null) {
            c38e2.A03();
        }
        P2X p2x = archiveReelHighlightsFragment.A00;
        if (p2x == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        List list2 = p2x.A0A;
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0q.add(((C56113OvY) it.next()).A01);
        }
        Reel A0G = AbstractC50523MSb.A0G(str, archiveReelHighlightsFragment.A05);
        if (A0G != null && (c38e = archiveReelHighlightsFragment.A01) != null) {
            c38e.A06(A0G, C3G2.A12, null, A0q, A0q, A0q);
        }
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeC(List list, int i, String str) {
        C14360o3.A0B(str, 0);
        ArchiveReelHighlightsFragment archiveReelHighlightsFragment = this.A00;
        InterfaceC09390do interfaceC09390do = archiveReelHighlightsFragment.A05;
        Reel A0G = AbstractC50523MSb.A0G(str, interfaceC09390do);
        if (A0G != null && A0G.A0W != null) {
            new C55173Odc(archiveReelHighlightsFragment.requireActivity(), archiveReelHighlightsFragment, archiveReelHighlightsFragment, AbstractC166987dD.A0r(interfaceC09390do), A0G).A04(new C55848Oqy(archiveReelHighlightsFragment, str), C05F.A0C);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
    }

    public P90(ArchiveReelHighlightsFragment archiveReelHighlightsFragment) {
        this.A00 = archiveReelHighlightsFragment;
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ int C9u() {
        return 0;
    }
}
