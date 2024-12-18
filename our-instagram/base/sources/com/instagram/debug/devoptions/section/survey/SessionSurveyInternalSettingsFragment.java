package com.instagram.debug.devoptions.section.survey;

import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC33235ElU;
import X.AbstractC60492pY;
import X.AnonymousClass001;
import X.C14360o3;
import X.C34H;
import X.C35246Fgf;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class SessionSurveyInternalSettingsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131958420);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "session_survey_debug_settings";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) C34H.A00);
        ArrayList A10 = AbstractC31174DnI.A10(copyOf);
        if (copyOf.isEmpty()) {
            A10.add(new C35246Fgf(2131958421));
        } else {
            Iterator it = copyOf.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                A10.add(new C35246Fgf(AnonymousClass001.A0g(AbstractC31172DnG.A17(A1K), " = ", (String) A1K.getValue())));
            }
        }
        setItems(A10);
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
