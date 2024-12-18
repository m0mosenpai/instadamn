package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oqh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55831Oqh implements InterfaceC149556o7, InterfaceC61322qu {
    public final int A00;
    public final Object A01;

    public C55831Oqh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC149556o7
    public final void DKs(boolean z) {
        if (this.A00 == 0) {
            C32350EMx.A01((C32350EMx) this.A01, true);
        }
    }

    @Override // X.InterfaceC149556o7
    public final void DKu(C3LZ c3lz, List list, boolean z) {
        int i = this.A00;
        C14360o3.A0B(list, 2);
        switch (i) {
            case 0:
                C32350EMx c32350EMx = (C32350EMx) this.A01;
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    Reel reel = (Reel) obj;
                    HighlightReelTypeStr highlightReelTypeStr = reel.A09;
                    if (highlightReelTypeStr != HighlightReelTypeStr.A05 && highlightReelTypeStr != HighlightReelTypeStr.A06 && !reel.A0l()) {
                        A1E.add(obj);
                    }
                }
                c32350EMx.A05 = A1E;
                C32350EMx.A01(c32350EMx, false);
                C3DN A0m = AbstractC25230BEn.A0m(c32350EMx);
                if (A0m != null) {
                    A0m.A0W(true);
                    return;
                }
                return;
            case 1:
                C54672OCy c54672OCy = (C54672OCy) this.A01;
                C51149Mis c51149Mis = c54672OCy.A03;
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj2 : list) {
                    AbstractC25228BEl.A1Q(obj2, A1E2, ((Reel) obj2).A0l() ? 1 : 0);
                }
                List list2 = c51149Mis.A02;
                list2.clear();
                int size = A1E2.size();
                int i2 = 5;
                if (5 > size) {
                    i2 = size;
                }
                list2.addAll(AbstractC001800i.A0d(A1E2, i2));
                c51149Mis.notifyDataSetChanged();
                C52364NFc.A00(c54672OCy.A04.A00);
                return;
            default:
                N7H n7h = (N7H) this.A01;
                ArrayList A1E3 = AbstractC166987dD.A1E();
                for (Object obj3 : list) {
                    AbstractC25228BEl.A1Q(obj3, A1E3, ((Reel) obj3).A0l() ? 1 : 0);
                }
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                ArrayList A0q = AbstractC167017dG.A0q(A1E3);
                Iterator it = A1E3.iterator();
                while (it.hasNext()) {
                    A0q.add(new C56082Ouz((Reel) it.next()));
                }
                A0E.A01(A0q);
                ((C66362zD) AbstractC166987dD.A17(n7h.A04)).A05(A0E);
                return;
        }
    }

    @Override // X.InterfaceC61322qu
    public final /* synthetic */ void DXf(long j, int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC61322qu
    public final /* synthetic */ void DXg(long j) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC149556o7
    public final /* synthetic */ void DKr(boolean z) {
    }

    @Override // X.InterfaceC149556o7
    public final /* synthetic */ void DKt(boolean z) {
    }
}
