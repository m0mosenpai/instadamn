package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C0YY;
import X.C0eB;
import X.C5Tl;
import X.InterfaceC16620sF;
import androidx.compose.ui.Modifier;
import java.util.List;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragmentKt$RepositoryList$2 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ List $repositoriesInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryList$2(List list, Modifier modifier, int i, int i2) {
        super(2);
        this.$repositoriesInfo = list;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C5Tl c5Tl, int i) {
        RepositoryInfoFragmentKt.RepositoryList(this.$repositoriesInfo, this.$modifier, c5Tl, AbstractC25225BEi.A04(this.$$changed), this.$$default);
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
        return C0eB.A00;
    }
}