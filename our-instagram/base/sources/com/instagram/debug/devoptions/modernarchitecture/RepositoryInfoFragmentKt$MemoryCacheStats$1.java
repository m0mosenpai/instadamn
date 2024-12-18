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
public final class RepositoryInfoFragmentKt$MemoryCacheStats$1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ RepositoryInfoViewModel.MemoryCacheStats $memoryCacheStats;
    public final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$MemoryCacheStats$1(RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats, Modifier modifier) {
        super(2);
        this.$memoryCacheStats = memoryCacheStats;
        this.$modifier = modifier;
    }

    public final void invoke(C5Tl c5Tl, int i) {
        if ((i & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
            return;
        }
        if (C0fH.A02()) {
            C0fH.A01(29644636, "com.instagram.debug.devoptions.modernarchitecture.MemoryCacheStats.<anonymous> (RepositoryInfoFragment.kt:114)");
        }
        String A0O = AnonymousClass001.A0O("Hit count: ", this.$memoryCacheStats.hitCount);
        C5WR.A06(c5Tl, AbstractC118175Wb.A0E(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), AbstractC25225BEi.A0Y(c5Tl), A0O);
        String A0O2 = AnonymousClass001.A0O("Miss count: ", this.$memoryCacheStats.missCount);
        C5WR.A06(c5Tl, AbstractC118175Wb.A0E(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), AbstractC25225BEi.A0Y(c5Tl), A0O2);
        String A0O3 = AnonymousClass001.A0O("Put count: ", this.$memoryCacheStats.putCount);
        C5WR.A06(c5Tl, AbstractC118175Wb.A0E(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), AbstractC25225BEi.A0Y(c5Tl), A0O3);
        String A0O4 = AnonymousClass001.A0O("Eviction count: ", this.$memoryCacheStats.evictionCount);
        C5WR.A06(c5Tl, AbstractC118175Wb.A0E(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), AbstractC25225BEi.A0Y(c5Tl), A0O4);
        if (!C0fH.A02()) {
            return;
        }
        C0fH.A00(-340472889);
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
        return C0eB.A00;
    }
}
