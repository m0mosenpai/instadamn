package com.instagram.debug.devoptions.section.msys;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC25225BEi;
import X.AbstractC41841wY;
import X.AbstractC59962oe;
import X.C0f9;
import X.C1334460n;
import X.C140966Yy;
import X.C17280tP;
import X.C36731GHa;
import X.C9AT;
import X.C9AV;
import X.C9GR;
import X.GHY;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.facebook.advancedcryptotransport.AppInstallContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes4.dex */
public final class ArmadilloMsysOptions implements DeveloperOptionsSection {
    public static final ArmadilloMsysOptions INSTANCE = new Object();
    public static final String TAG = "ArmadilloMsysOptions";

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        C17280tP A0y = AbstractC166987dD.A0y();
        return AbstractC16960so.A1Q(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.msys.ArmadilloMsysOptions$getItems$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y2 = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y2, A0y2.A1f, C17280tP.A4G, 47, z);
            }
        }, "[msys] Armadillo Debug Overlay", AbstractC167017dG.A1b(A0y, A0y.A1f, C17280tP.A4G, 47)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.msys.ArmadilloMsysOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(371241516);
                boolean A00 = AbstractC41841wY.A00(UserSession.this).A00();
                FragmentActivity fragmentActivity2 = fragmentActivity;
                if (A00) {
                    C9GR.A09(fragmentActivity2, "Msys mailbox already initialized");
                } else {
                    C9GR.A09(fragmentActivity2, "Triggering msys mailbox initialization");
                    C9AT.A00(UserSession.this).A00("Triggered manual msys mailbox init from dev settings");
                    C9AV.A00(UserSession.this).A02("Triggered manual msys mailbox init from dev settings");
                    C1334460n.A01(UserSession.this, ArmadilloMsysOptions.TAG).A02(ArmadilloMsysOptions.TAG);
                }
                C0f9.A0C(1633278837, A05);
            }
        }, "[msys] Trigger msys mailbox initialization"), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.msys.ArmadilloMsysOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1605668885);
                C140966Yy A0r = AbstractC25225BEi.A0r(FragmentActivity.this, userSession);
                A0r.A0D(new MsysDecouplingViewSettingsFragment());
                A0r.A04();
                C0f9.A0C(267002738, A05);
            }
        }, "[msys] Show Mailbox Decoupling Settings"), new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.msys.ArmadilloMsysOptions$getItems$4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AppInstallContext.sShouldFailSendWithEmptyDeviceListEncryptionError = z;
                if (z) {
                    C9AT.A00(UserSession.this).A00("Enabled next send fail with empty device list error from dev settings");
                }
            }
        }, "[msys] Fail next send with empty device list error", AppInstallContext.sShouldFailSendWithEmptyDeviceListEncryptionError));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131957827;
    }
}
