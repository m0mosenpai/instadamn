package com.instagram.debug.devoptions.section.search;

import X.AbstractC58232lf;
import X.AnonymousClass191;
import X.C0YY;
import X.C2GT;
import X.InterfaceC16820sZ;
import X.InterfaceC19390xP;
import X.MZJ;

/* loaded from: classes11.dex */
public final class SearchDebugSettingsFragment$settingsModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDebugSettingsFragment$settingsModel$2(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        super(0);
        this.this$0 = searchDebugSettingsFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final C2GT invoke() {
        MZJ searchDebugPreferences;
        searchDebugPreferences = this.this$0.getSearchDebugPreferences();
        return AbstractC58232lf.A00(AnonymousClass191.A00, (InterfaceC19390xP) searchDebugPreferences.A02.getValue());
    }
}
