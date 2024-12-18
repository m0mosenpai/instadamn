package com.instagram.debug.quickexperiment;

import X.AbstractC001800i;
import X.AbstractC111324zv;
import X.C0YY;
import X.C16930sl;
import X.C17280tP;
import X.InterfaceC16820sZ;
import android.os.Bundle;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes11.dex */
public final class QuickExperimentCategoriesFragment$testRigParameterNames$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickExperimentCategoriesFragment$testRigParameterNames$2(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        super(0);
        this.this$0 = quickExperimentCategoriesFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final Set invoke() {
        Iterable iterable;
        Bundle bundle = this.this$0.mArguments;
        if (bundle == null || (iterable = bundle.getStringArrayList(AbstractC111324zv.A00(4824))) == null) {
            iterable = C16930sl.A00;
        }
        Set A0j = AbstractC001800i.A0j(iterable);
        C17280tP A00 = C17280tP.A4E.A00();
        A0j.addAll((Collection) A00.A25.CES(A00, C17280tP.A4G[253]));
        return A0j;
    }
}
