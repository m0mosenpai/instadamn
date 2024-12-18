package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.EKx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32310EKx extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ThreadDetailsDisappearingMessagesFragment";
    public FKM A00;
    public E70 A01;
    public RecyclerView A02;
    public Capabilities A03;
    public InterfaceC37169GZg A04;
    public InterfaceC83733oI A05;
    public EPV A06;
    public final C41761wQ A08 = AbstractC31173DnH.A0S();
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        if (X.AbstractC160497Hj.A02(r14, r9.A0D, r7, true, r11, r10, r20, r21).CPh(X.AbstractC166987dD.A0r(r6), r9) != true) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.E70 r25) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32310EKx.A00(X.E70):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "thread_details_disappearing_messages";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC31180DnO.A08(view);
        EPV epv = new EPV(requireContext(), null, null);
        this.A06 = epv;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setAdapter(epv);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            AbstractC31177DnL.A0s(requireContext(), recyclerView2);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r1 == r6.intValue()) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r11 = this;
            X.E70 r4 = r11.A01
            r9 = 0
            if (r4 == 0) goto L56
            X.52z r2 = r4.A0H
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L59
            X.0do r0 = r11.A07
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            X.E70 r0 = r11.A01
            if (r0 == 0) goto L57
            X.3kW r0 = r0.A0D
        L17:
            boolean r0 = X.C6X6.A0E(r1, r0)
            if (r0 == 0) goto L59
            java.lang.Integer r0 = r2.A00
            java.lang.Integer r6 = r2.A01
        L21:
            X.FKM r5 = r11.A00
            r8 = 1
            if (r5 == 0) goto L56
            boolean r3 = r5.A02
            boolean r2 = r2.A08
            if (r3 != r2) goto L40
            int r1 = r5.A00
            if (r0 == 0) goto L40
            int r0 = r0.intValue()
            if (r1 != r0) goto L40
            int r1 = r5.A01
            if (r6 == 0) goto L40
            int r0 = r6.intValue()
            if (r1 == r0) goto L56
        L40:
            if (r3 != 0) goto L5e
            if (r2 == 0) goto L56
            X.0do r0 = r11.A07
            com.instagram.common.session.UserSession r5 = X.AbstractC166987dD.A0r(r0)
            X.3oI r0 = r4.A0L
            java.lang.String r7 = X.AbstractC31171DnF.A0c(r0)
            X.3kW r6 = r4.A0D
            r10 = r9
            X.AbstractC31278Dp0.A08(r5, r6, r7, r8, r9, r10)
        L56:
            return r9
        L57:
            r0 = 0
            goto L17
        L59:
            java.lang.Integer r0 = r2.A02
            java.lang.Integer r6 = r2.A03
            goto L21
        L5e:
            X.0do r0 = r11.A07
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            X.3oI r0 = r4.A0L
            java.lang.String r2 = X.AbstractC31171DnF.A0c(r0)
            int r1 = r5.A00
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AbstractC31278Dp0.A0F(r3, r0, r2, r8, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32310EKx.onBackPressed():boolean");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131961103);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A0t;
        int i;
        String str;
        int A02 = C0f9.A02(-416406377);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A00 != null) {
            this.A05 = A00;
            Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            if (capabilities != null) {
                this.A03 = capabilities;
                UserSession A0r = AbstractC166987dD.A0r(this.A07);
                InterfaceC83733oI interfaceC83733oI = this.A05;
                if (interfaceC83733oI == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A03;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        InterfaceC37169GZg A01 = C7KH.A01(requireContext, A0r, capabilities2, interfaceC83733oI);
                        this.A04 = A01;
                        if (A01 == null) {
                            str = "clientInfra";
                        } else {
                            InterfaceC37279GbW.A01(A01);
                            C0f9.A09(-1266949552, A02);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A0t = AbstractC166987dD.A12("threadCapabilities can't be null");
            i = -2001483127;
        } else {
            A0t = AbstractC31172DnG.A0t();
            i = -1720961318;
        }
        C0f9.A09(i, A02);
        throw A0t;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-657599873);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_disappearing_messages_fragment, viewGroup, false);
        C0f9.A09(-1995792244, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1266309351);
        super.onDestroyView();
        this.A02 = null;
        this.A06 = null;
        C0f9.A09(-423070678, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(715033093);
        super.onPause();
        InterfaceC37169GZg interfaceC37169GZg = this.A04;
        if (interfaceC37169GZg == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        interfaceC37169GZg.BOE().stop();
        this.A08.A01();
        C0f9.A09(-1672591677, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1730009825);
        super.onResume();
        C41761wQ c41761wQ = this.A08;
        InterfaceC37169GZg interfaceC37169GZg = this.A04;
        if (interfaceC37169GZg != null) {
            GKK.A00(interfaceC37169GZg.BOE().APK(), c41761wQ, this, 0);
            InterfaceC37169GZg interfaceC37169GZg2 = this.A04;
            if (interfaceC37169GZg2 != null) {
                InterfaceC37279GbW.A01(interfaceC37169GZg2);
                InterfaceC37169GZg interfaceC37169GZg3 = this.A04;
                if (interfaceC37169GZg3 != null) {
                    InterfaceC37279GbW.A00(interfaceC37169GZg3);
                    C0f9.A09(1745858059, A02);
                    return;
                }
            }
        }
        C14360o3.A0F("clientInfra");
        throw C00O.createAndThrow();
    }
}
