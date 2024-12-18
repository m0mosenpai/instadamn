package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC118175Wb;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AnonymousClass001;
import X.C0YY;
import X.C0eB;
import X.C0fH;
import X.C5Tl;
import X.C5WR;
import X.InterfaceC16620sF;
import androidx.compose.ui.Modifier;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragmentKt$RepositoryItem$1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ RepositoryInfoViewModel.RepositoryInfo $repositoryInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryItem$1(RepositoryInfoViewModel.RepositoryInfo repositoryInfo, Modifier modifier) {
        super(2);
        this.$repositoryInfo = repositoryInfo;
        this.$modifier = modifier;
    }

    public final void invoke(C5Tl c5Tl, int i) {
        if ((i & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
            return;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1106345473, "com.instagram.debug.devoptions.modernarchitecture.RepositoryItem.<anonymous> (RepositoryInfoFragment.kt:101)");
        }
        String A0R = AnonymousClass001.A0R("Feature: ", this.$repositoryInfo.featureTag);
        C5WR.A06(c5Tl, AbstractC118175Wb.A0E(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), AbstractC25225BEi.A0Y(c5Tl), A0R);
        RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats = this.$repositoryInfo.memoryCacheStats;
        if (memoryCacheStats != null) {
            RepositoryInfoFragmentKt.MemoryCacheStats(memoryCacheStats, null, c5Tl, 0, 2);
        }
        if (!C0fH.A02()) {
            return;
        }
        C0fH.A00(-1284727678);
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
        return C0eB.A00;
    }
}
