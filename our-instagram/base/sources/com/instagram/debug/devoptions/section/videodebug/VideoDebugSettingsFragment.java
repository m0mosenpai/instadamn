package com.instagram.debug.devoptions.section.videodebug;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC33235ElU;
import X.AbstractC43591JPw;
import X.AbstractC60492pY;
import X.C0YR;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C17280tP;
import X.C19700xy;
import X.C31335Dq0;
import X.C36731GHa;
import X.GHY;
import X.InterfaceC09390do;
import X.InterfaceC16530ry;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

/* loaded from: classes6.dex */
public final class VideoDebugSettingsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A01(this);

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131958461);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return AbstractC43591JPw.A00(1395);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C19700xy c19700xy = C17280tP.A4E;
        C36731GHa A02 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A2t, C17280tP.A4G, 7, z);
            }
        }, 2131958261, c19700xy.A00().A0Z());
        C17280tP A00 = c19700xy.A00();
        InterfaceC16530ry interfaceC16530ry = A00.A2u;
        C0YR[] c0yrArr = C17280tP.A4G;
        C36731GHa A022 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A2u, C17280tP.A4G, 90, z);
            }
        }, 2131958262, AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 90));
        C36731GHa A023 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$3
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            
                if (r5 == false) goto L10;
             */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCheckedChanged(android.widget.CompoundButton r7, boolean r8) {
                /*
                    r6 = this;
                    com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment r0 = com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment.this
                    android.content.Context r0 = r0.requireContext()
                    boolean r5 = android.provider.Settings.canDrawOverlays(r0)
                    if (r8 == 0) goto L1a
                    if (r5 != 0) goto L1a
                    com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment r0 = com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment.this
                    androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
                    java.lang.String r1 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
                    r0 = 0
                    X.WGH.A07(r2, r0, r1)
                L1a:
                    X.0tP r4 = X.AbstractC166987dD.A0y()
                    if (r8 == 0) goto L23
                    r3 = 1
                    if (r5 != 0) goto L24
                L23:
                    r3 = 0
                L24:
                    X.0ry r2 = r4.A2s
                    X.0YR[] r1 = X.C17280tP.A4G
                    r0 = 6
                    X.AbstractC167007dF.A1L(r4, r2, r1, r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$3.onCheckedChanged(android.widget.CompoundButton, boolean):void");
            }
        }, 2131958259, c19700xy.A00().A0Y());
        C17280tP A002 = c19700xy.A00();
        C36731GHa A024 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$4
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            
                if (r5 == false) goto L10;
             */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCheckedChanged(android.widget.CompoundButton r7, boolean r8) {
                /*
                    r6 = this;
                    com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment r0 = com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment.this
                    android.content.Context r0 = r0.requireContext()
                    boolean r5 = android.provider.Settings.canDrawOverlays(r0)
                    if (r8 == 0) goto L1a
                    if (r5 != 0) goto L1a
                    com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment r0 = com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment.this
                    androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
                    java.lang.String r1 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
                    r0 = 0
                    X.WGH.A07(r2, r0, r1)
                L1a:
                    X.0tP r4 = X.AbstractC166987dD.A0y()
                    if (r8 == 0) goto L23
                    r3 = 1
                    if (r5 != 0) goto L24
                L23:
                    r3 = 0
                L24:
                    X.0ry r2 = r4.A2z
                    X.0YR[] r1 = X.C17280tP.A4G
                    r0 = 91
                    X.AbstractC167007dF.A1L(r4, r2, r1, r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$4.onCheckedChanged(android.widget.CompoundButton, boolean):void");
            }
        }, 2131958422, AbstractC167017dG.A1b(A002, A002.A2z, c0yrArr, 91));
        C17280tP A003 = c19700xy.A00();
        C36731GHa A025 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A31, C17280tP.A4G, 92, z);
            }
        }, 2131958464, AbstractC167017dG.A1b(A003, A003.A31, c0yrArr, 92));
        C36731GHa A026 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A13, C17280tP.A4G, 63, z);
            }
        }, 2131958009, c19700xy.A00().A0M());
        C17280tP A004 = c19700xy.A00();
        C36731GHa A027 = C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A12, C17280tP.A4G, 12, z);
            }
        }, 2131958463, AbstractC167017dG.A1b(A004, A004.A12, c0yrArr, 12));
        C31335Dq0 A005 = C31335Dq0.A00(2131958190);
        C17280tP A006 = c19700xy.A00();
        setItems(AbstractC16960so.A1Q(A02, A022, A023, A024, A025, A026, A027, A005, C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A19, C17280tP.A4G, 11, z);
            }
        }, 2131958011, AbstractC167017dG.A1b(A006, A006.A19, c0yrArr, 11)), GHY.A00(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugSettingsFragment$onViewCreated$items$9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int A05 = C0f9.A05(1671582006);
                AbstractC25229BEm.A18(VideoUtilityFragment.Companion.newInstance(VideoDebugSettingsFragment.this.getSession().getToken()), new C140966Yy(VideoDebugSettingsFragment.this.requireActivity(), VideoDebugSettingsFragment.this.getSession()));
                C0f9.A0C(1112559567, A05);
            }
        }, 2131958462)));
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.session$delegate);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1592498825);
        super.onCreate(bundle);
        C0f9.A09(-1172533848, A02);
    }
}
