package com.instagram.debug.devoptions.section.search;

import X.C0YY;
import X.InterfaceC16820sZ;
import X.MZJ;

/* loaded from: classes11.dex */
public final class SearchDebugSettingsFragment$searchDebugPreferences$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDebugSettingsFragment$searchDebugPreferences$2(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        super(0);
        this.this$0 = searchDebugSettingsFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final MZJ invoke() {
        return MZJ.A05.A00(this.this$0.getSession());
    }
}
