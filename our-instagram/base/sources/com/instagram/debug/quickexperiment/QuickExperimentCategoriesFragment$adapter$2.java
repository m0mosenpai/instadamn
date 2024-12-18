package com.instagram.debug.quickexperiment;

import X.AbstractC167007dF;
import X.C0YY;
import X.InterfaceC16820sZ;
import android.content.Context;

/* loaded from: classes11.dex */
public final class QuickExperimentCategoriesFragment$adapter$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickExperimentCategoriesFragment$adapter$2(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        super(0);
        this.this$0 = quickExperimentCategoriesFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final QuickExperimentCategoriesAdapter invoke() {
        Context requireContext = this.this$0.requireContext();
        QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = this.this$0;
        return new QuickExperimentCategoriesAdapter(requireContext, quickExperimentCategoriesFragment, true, Boolean.valueOf(AbstractC167007dF.A1Z(quickExperimentCategoriesFragment.isInTestRigMode$delegate)));
    }
}
