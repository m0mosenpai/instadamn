package com.instagram.debug.devoptions.section.showreel;

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

/* loaded from: classes5.dex */
public final class ShowreelOptions implements DeveloperOptionsSection {
    public static final ShowreelOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        C19700xy c19700xy = C17280tP.A4E;
        C36731GHa c36731GHa = new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.showreel.ShowreelOptions$getItems$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A1o, C17280tP.A4G, 36, z);
            }
        }, 2131958440, c19700xy.A00().A0e());
        C36731GHa c36731GHa2 = new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.showreel.ShowreelOptions$getItems$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A1m, C17280tP.A4G, 39, z);
            }
        }, 2131958437, c19700xy.A00().A0d());
        C17280tP A00 = c19700xy.A00();
        InterfaceC16530ry interfaceC16530ry = A00.A1l;
        C0YR[] c0yrArr = C17280tP.A4G;
        C36731GHa c36731GHa3 = new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.showreel.ShowreelOptions$getItems$3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A1l, C17280tP.A4G, 37, z);
            }
        }, 2131958436, AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 37));
        C17280tP A002 = c19700xy.A00();
        return AbstractC16960so.A1Q(c36731GHa, c36731GHa2, c36731GHa3, new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.showreel.ShowreelOptions$getItems$4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A1n, C17280tP.A4G, 38, z);
            }
        }, 2131958439, AbstractC167017dG.A1b(A002, A002.A1n, c0yrArr, 38)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958438;
    }
}
