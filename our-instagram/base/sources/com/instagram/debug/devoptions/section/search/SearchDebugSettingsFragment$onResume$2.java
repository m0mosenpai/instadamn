package com.instagram.debug.devoptions.section.search;

import X.C03E;
import X.C0eB;
import X.C14360o3;
import X.C51621MrE;
import X.InterfaceC16660sJ;

/* loaded from: classes11.dex */
public final /* synthetic */ class SearchDebugSettingsFragment$onResume$2 extends C03E implements InterfaceC16660sJ {
    public SearchDebugSettingsFragment$onResume$2(Object obj) {
        super(1, obj, SearchDebugSettingsFragment.class, "updateItems", "updateItems(Lcom/instagram/preferences/user/SearchDebugPreferences$SearchDebugSettings;)V", 0);
    }

    public final void invoke(C51621MrE c51621MrE) {
        C14360o3.A0B(c51621MrE, 0);
        ((SearchDebugSettingsFragment) this.receiver).updateItems(c51621MrE);
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C51621MrE) obj);
        return C0eB.A00;
    }
}
