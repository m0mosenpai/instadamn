package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC25230BEn;
import X.AbstractC25232BEp;
import X.C0YY;
import X.C0eB;
import X.C0fH;
import X.C5Tl;
import X.C6IV;
import X.InterfaceC16600sD;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;
import java.util.List;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$4 extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$4(List list) {
        super(4);
        this.$items = list;
    }

    public final void invoke(C6IV c6iv, int i, C5Tl c5Tl, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c6iv) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
            return;
        }
        if (C0fH.A02()) {
            AbstractC25225BEi.A1J(591454503);
        }
        RepositoryInfoViewModel.RepositoryInfo repositoryInfo = (RepositoryInfoViewModel.RepositoryInfo) this.$items.get(i);
        c5Tl.Eno(-2022757231);
        RepositoryInfoFragmentKt.RepositoryItem(repositoryInfo, null, c5Tl, ((i3 & 14) >> 3) & 14, 2);
        if (!AbstractC25230BEn.A1Y(c5Tl)) {
            return;
        }
        C0fH.A00(1337357822);
    }

    @Override // X.InterfaceC16600sD
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C6IV) obj, AbstractC166987dD.A0H(obj2), (C5Tl) obj3, AbstractC166987dD.A0H(obj4));
        return C0eB.A00;
    }
}
