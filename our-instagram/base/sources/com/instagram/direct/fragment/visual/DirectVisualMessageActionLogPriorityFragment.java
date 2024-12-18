package com.instagram.direct.fragment.visual;

import X.AbstractC111324zv;
import X.AbstractC1345466e;
import X.AbstractC147226jy;
import X.AbstractC153636vY;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC35077Fco;
import X.AbstractC43591JPw;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C06090Tz;
import X.C0f9;
import X.C11R;
import X.C14360o3;
import X.C18U;
import X.C31871Dzd;
import X.C37058GUs;
import X.C3T1;
import X.C3o9;
import X.G3R;
import X.G3S;
import X.G3T;
import X.InterfaceC09390do;
import X.InterfaceC37170GZh;
import X.InterfaceC83733oI;
import X.JRE;
import X.ViewOnClickListenerC35680FpF;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* loaded from: classes6.dex */
public final class DirectVisualMessageActionLogPriorityFragment extends AbstractC59962oe {
    public InterfaceC37170GZh A00;
    public C31871Dzd A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03 = C37058GUs.A01(this, 12);
    public SpinnerImageView spinner;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_story_action_log_priority_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0D = AbstractC31178DnM.A0D(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        linearLayoutManager.A12(true);
        A0D.setLayoutManager(linearLayoutManager);
        C31871Dzd c31871Dzd = this.A01;
        if (c31871Dzd == null) {
            str = "adapter";
        } else {
            A0D.setAdapter(c31871Dzd);
            SpinnerImageView spinnerImageView = (SpinnerImageView) view.requireViewById(R.id.direct_recycler_view_spinner);
            C14360o3.A0B(spinnerImageView, 0);
            this.spinner = spinnerImageView;
            ViewOnClickListenerC35680FpF.A00(view.requireViewById(R.id.header_done_button), 38, this);
            InterfaceC37170GZh interfaceC37170GZh = this.A00;
            if (interfaceC37170GZh == null) {
                str = "controller";
            } else {
                C11R EnM = interfaceC37170GZh.EnM();
                if (EnM != null) {
                    schedule(EnM);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A00(List list) {
        String str;
        SpinnerImageView spinnerImageView = this.spinner;
        if (spinnerImageView != null) {
            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            C31871Dzd c31871Dzd = this.A01;
            if (c31871Dzd == null) {
                str = "adapter";
            } else {
                AbstractC31175DnJ.A0x(c31871Dzd, list, c31871Dzd.A02);
                return;
            }
        } else {
            str = "spinner";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        InterfaceC37170GZh g3s;
        int A02 = C0f9.A02(-1684508102);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            InterfaceC83733oI A00 = AbstractC35077Fco.A00(bundle2, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A00 != null) {
                C3o9 A05 = AbstractC1345466e.A05(A00);
                Boolean A002 = AbstractC147226jy.A00(bundle2, "is_instamadillo");
                String string = bundle2.getString(AbstractC111324zv.A00(41));
                long j = bundle2.getLong(AbstractC43591JPw.A00(579));
                boolean z = A05 instanceof MsysThreadId;
                String A003 = AbstractC43591JPw.A00(580);
                if (z) {
                    Context requireContext = requireContext();
                    UserSession A0r = AbstractC166987dD.A0r(this.A02);
                    if (string != null) {
                        g3s = new G3T(requireContext, A0r, string, AbstractC153636vY.A02(bundle2, PendingRecipient.class, A003), j);
                        this.A00 = g3s;
                        g3s.ET9(this);
                        this.A01 = new C31871Dzd(this, this);
                        C0f9.A09(2013313547, A02);
                        return;
                    }
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 1292056723;
                } else {
                    if (AbstractC31177DnL.A1b(A002)) {
                        InterfaceC09390do interfaceC09390do = this.A02;
                        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36320485429027375L)) {
                            Context requireContext2 = requireContext();
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            if (string != null) {
                                g3s = new G3R(requireContext2, A0r2, JRE.A01(A05), string);
                                this.A00 = g3s;
                                g3s.ET9(this);
                                this.A01 = new C31871Dzd(this, this);
                                C0f9.A09(2013313547, A02);
                                return;
                            }
                            A14 = AbstractC166987dD.A14("Required value was null.");
                            i = 1959784119;
                        }
                    }
                    Context requireContext3 = requireContext();
                    UserSession A0r3 = AbstractC166987dD.A0r(this.A02);
                    String A15 = AbstractC31172DnG.A15(A05);
                    if (A15 != null) {
                        if (string != null) {
                            g3s = new G3S(requireContext3, A0r3, A15, string, bundle2.getString(AbstractC43591JPw.A00(585)), AbstractC153636vY.A02(bundle2, PendingRecipient.class, A003));
                            this.A00 = g3s;
                            g3s.ET9(this);
                            this.A01 = new C31871Dzd(this, this);
                            C0f9.A09(2013313547, A02);
                            return;
                        }
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = 642070981;
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = -826394971;
                    }
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -839736377;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -531196968;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1685277967);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_recycler_view_with_header, false);
        C0f9.A09(2110200656, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1042420617);
        super.onDestroyView();
        this.spinner = null;
        InterfaceC37170GZh interfaceC37170GZh = this.A00;
        if (interfaceC37170GZh == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        interfaceC37170GZh.cleanup();
        C0f9.A09(-1676227200, A02);
    }
}
