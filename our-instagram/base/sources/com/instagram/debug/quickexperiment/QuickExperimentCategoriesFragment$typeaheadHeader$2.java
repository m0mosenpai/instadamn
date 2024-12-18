package com.instagram.debug.quickexperiment;

import X.C0YY;
import X.InterfaceC16820sZ;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;

/* loaded from: classes11.dex */
public final class QuickExperimentCategoriesFragment$typeaheadHeader$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickExperimentCategoriesFragment$typeaheadHeader$2(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        super(0);
        this.this$0 = quickExperimentCategoriesFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final TypeaheadHeader invoke() {
        return new TypeaheadHeader(this.this$0.requireContext());
    }
}
