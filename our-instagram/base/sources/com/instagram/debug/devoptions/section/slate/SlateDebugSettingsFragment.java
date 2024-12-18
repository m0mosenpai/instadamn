package com.instagram.debug.devoptions.section.slate;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC33235ElU;
import X.C00O;
import X.C023409i;
import X.C0f9;
import X.C14360o3;
import X.C17280tP;
import X.C36731GHa;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class SlateDebugSettingsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public AbstractC18680vv session;

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "SLATE Debug Settings");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "slate_debug_settings";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        final C17280tP A0y = AbstractC166987dD.A0y();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.slate.SlateDebugSettingsFragment$onViewCreated$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP c17280tP = C17280tP.this;
                AbstractC167007dF.A1L(c17280tP, c17280tP.A0p, C17280tP.A4G, 251, z);
            }
        }, "Included images overlay", AbstractC167017dG.A1b(A0y, A0y.A0p, C17280tP.A4G, 251)));
        setItems(A1E);
    }

    public void setSession(AbstractC18680vv abstractC18680vv) {
        C14360o3.A0B(abstractC18680vv, 0);
        this.session = abstractC18680vv;
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.session;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(814721217);
        super.onCreate(bundle);
        setSession(C023409i.A0A.A04(requireArguments()));
        C0f9.A09(753369747, A02);
    }
}
