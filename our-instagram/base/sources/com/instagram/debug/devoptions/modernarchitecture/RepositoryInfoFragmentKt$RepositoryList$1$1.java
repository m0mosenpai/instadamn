package com.instagram.debug.devoptions.modernarchitecture;

import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.C5UA;
import X.C6Nu;
import X.InterfaceC16660sJ;
import java.util.List;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragmentKt$RepositoryList$1$1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ List $repositoriesInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryList$1$1(List list) {
        super(1);
        this.$repositoriesInfo = list;
    }

    public final void invoke(C6Nu c6Nu) {
        C14360o3.A0B(c6Nu, 0);
        List list = this.$repositoriesInfo;
        RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$1 repositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$1 = RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$1.INSTANCE;
        c6Nu.CgN(null, new RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$3(repositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$1, list), C5UA.A02(new RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$4(list)), list.size());
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C6Nu) obj);
        return C0eB.A00;
    }
}
