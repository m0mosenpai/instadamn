package com.instagram.debug.devoptions.section.storyorganicdebug;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC59962oe;
import X.C0YR;
import X.C17280tP;
import X.C19700xy;
import X.C36731GHa;
import X.InterfaceC16530ry;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class StoryOrganicDebugOptions implements DeveloperOptionsSection {
    public static final StoryOrganicDebugOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        C19700xy c19700xy = C17280tP.A4E;
        C17280tP A00 = c19700xy.A00();
        InterfaceC16530ry interfaceC16530ry = A00.A2J;
        C0YR[] c0yrArr = C17280tP.A4G;
        C36731GHa A02 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.storyorganicdebug.StoryOrganicDebugOptions$getItems$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A2J, C17280tP.A4G, 41, z);
            }
        }, 2131958548, AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 41));
        C17280tP A002 = c19700xy.A00();
        C36731GHa A022 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.storyorganicdebug.StoryOrganicDebugOptions$getItems$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A2I, C17280tP.A4G, 42, z);
            }
        }, 2131958547, AbstractC167017dG.A1b(A002, A002.A2I, c0yrArr, 42));
        C17280tP A003 = c19700xy.A00();
        return AbstractC16960so.A1Q(A02, A022, C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.storyorganicdebug.StoryOrganicDebugOptions$getItems$3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A2H, C17280tP.A4G, 43, z);
            }
        }, 2131958546, AbstractC167017dG.A1b(A003, A003.A2H, c0yrArr, 43)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958513;
    }
}
