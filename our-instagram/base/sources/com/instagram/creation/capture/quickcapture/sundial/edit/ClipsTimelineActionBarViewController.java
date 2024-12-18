package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23641Du;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC56952jT;
import X.AbstractC59962oe;
import X.AnonymousClass191;
import X.AnonymousClass229;
import X.B4Z;
import X.C00O;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0fQ;
import X.C110964z8;
import X.C14360o3;
import X.C187358Sd;
import X.C187418Sj;
import X.C22C;
import X.C22F;
import X.C22M;
import X.C50811Mcd;
import X.C50869Me0;
import X.C51155Miy;
import X.C57160PZe;
import X.C57228PbC;
import X.C57312k6;
import X.C81X;
import X.EnumC151036r4;
import X.EnumC151046r5;
import X.EnumC53132Nel;
import X.EnumC53257Ngv;
import X.EnumC53325Ni3;
import X.InterfaceC02590Ai;
import X.InterfaceC23621Ds;
import X.InterfaceC60602pj;
import X.MSW;
import X.MSX;
import X.MSZ;
import X.NM8;
import X.O7M;
import X.PM0;
import X.ViewOnClickListenerC23249ASk;
import X.ViewOnClickListenerC55460OkF;
import X.ViewOnClickListenerC55464OkJ;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.actionbar.ClipsTimelineActionBarRecyclerView;
import com.instagram.creation.capture.quickcapture.sundial.edit.views.ClipsTimelineConstraintLayout;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.EnumMap;

/* loaded from: classes9.dex */
public final class ClipsTimelineActionBarViewController implements InterfaceC60602pj {
    public O7M A00;
    public Integer A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final ClipsCreationViewModel A04;
    public final C50869Me0 A05;
    public final C187418Sj A06;
    public final C187358Sd A07;
    public final Runnable A08;
    public final EnumMap A09;
    public final EnumMap A0A;
    public final int A0B;
    public final boolean A0C;
    public ClipsTimelineConstraintLayout actionBarContainer;
    public ClipsTimelineActionBarRecyclerView actionBarRecyclerView;
    public C51155Miy adapter;
    public IgdsMediaButton addGifButton;
    public ViewGroup backButton;
    public IgdsMediaButton cancelButton;
    public IgdsMediaButton creationDoneButton;
    public ViewGroup discardButton;
    public IgdsMediaButton doneButton;
    public LinearLayoutManager linearLayoutManager;
    public IgdsMediaButton reorderDoneButton;

    public ClipsTimelineActionBarViewController(AbstractC59962oe abstractC59962oe, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C50869Me0 c50869Me0, C187418Sj c187418Sj, C187358Sd c187358Sd, int i, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A0B = i;
        this.A0C = z;
        this.A04 = clipsCreationViewModel;
        this.A07 = c187358Sd;
        this.A06 = c187418Sj;
        this.A05 = c50869Me0;
        this.A09 = new EnumMap(EnumC53325Ni3.class);
        this.A0A = new EnumMap(EnumC53325Ni3.class);
        this.A08 = new PM0(this);
    }

    public static final IgdsMediaButton A00(Context context) {
        IgdsMediaButton igdsMediaButton = new IgdsMediaButton(context, null, 0);
        igdsMediaButton.setSize(EnumC151046r5.A04);
        igdsMediaButton.setButtonStyle(EnumC151036r4.A03);
        AbstractC43593JPy.A1B(igdsMediaButton, -2);
        igdsMediaButton.setVisibility(8);
        return igdsMediaButton;
    }

    public static final void A02(ClipsTimelineActionBarViewController clipsTimelineActionBarViewController, EnumC53132Nel enumC53132Nel, int i) {
        int A01;
        int i2;
        int i3;
        ClipsTimelineConstraintLayout clipsTimelineConstraintLayout = clipsTimelineActionBarViewController.actionBarContainer;
        if (clipsTimelineConstraintLayout != null) {
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(clipsTimelineConstraintLayout);
            if (i == R.id.action_bar_recycler_view) {
                A01 = 0;
            } else {
                A01 = MSX.A01(AbstractC166997dE.A0L(clipsTimelineConstraintLayout));
            }
            int ordinal = enumC53132Nel.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c110964z8.A0D(i, 6, R.id.action_bar_container, 6);
                        c110964z8.A0D(i, 7, R.id.action_bar_container, 7);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    i2 = 7;
                    c110964z8.A0E(i, 7, R.id.action_bar_container, 7, A01);
                    if (i != R.id.action_bar_recycler_view) {
                        i3 = 6;
                        c110964z8.A09(i, i3);
                        c110964z8.A0E(R.id.action_bar_recycler_view, i2, i, i3, AbstractC166987dD.A0C(AbstractC166997dE.A0L(clipsTimelineConstraintLayout), 3));
                    }
                }
            } else {
                i2 = 6;
                c110964z8.A0E(i, 6, R.id.action_bar_container, 6, A01);
                if (i != R.id.action_bar_recycler_view) {
                    i3 = 7;
                    c110964z8.A09(i, i3);
                    c110964z8.A0E(R.id.action_bar_recycler_view, i2, i, i3, AbstractC166987dD.A0C(AbstractC166997dE.A0L(clipsTimelineConstraintLayout), 3));
                }
            }
            c110964z8.A0G(clipsTimelineActionBarViewController.actionBarContainer);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.O7M, java.lang.Object] */
    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.actionBarContainer = (ClipsTimelineConstraintLayout) view.requireViewById(R.id.action_bar_container);
        this.actionBarRecyclerView = (ClipsTimelineActionBarRecyclerView) view.requireViewById(R.id.action_bar_recycler_view);
        Context context = view.getContext();
        if (AbstractC13620mo.A02(context)) {
            ClipsTimelineConstraintLayout clipsTimelineConstraintLayout = this.actionBarContainer;
            if (clipsTimelineConstraintLayout != null) {
                clipsTimelineConstraintLayout.setLayoutDirection(0);
            }
            ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView = this.actionBarRecyclerView;
            if (clipsTimelineActionBarRecyclerView != null) {
                clipsTimelineActionBarRecyclerView.setLayoutDirection(0);
            }
        }
        C14360o3.A07(context);
        AbstractC59962oe abstractC59962oe = this.A02;
        FragmentActivity activity = abstractC59962oe.getActivity();
        UserSession userSession = this.A03;
        int i = this.A0B;
        boolean z = this.A0C;
        this.adapter = new C51155Miy(context, activity, userSession, MSW.A1E(this, 7), MSW.A1E(this, 8), new C57228PbC(this, 4), i, z);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.linearLayoutManager = linearLayoutManager;
        ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView2 = this.actionBarRecyclerView;
        if (clipsTimelineActionBarRecyclerView2 != null) {
            clipsTimelineActionBarRecyclerView2.setLayoutManager(linearLayoutManager);
        }
        ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView3 = this.actionBarRecyclerView;
        if (clipsTimelineActionBarRecyclerView3 != null) {
            clipsTimelineActionBarRecyclerView3.setAdapter(this.adapter);
        }
        ClipsTimelineConstraintLayout clipsTimelineConstraintLayout2 = this.actionBarContainer;
        if (clipsTimelineConstraintLayout2 != null) {
            clipsTimelineConstraintLayout2.setVisibility(0);
        }
        ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView4 = this.actionBarRecyclerView;
        if (clipsTimelineActionBarRecyclerView4 != null) {
            clipsTimelineActionBarRecyclerView4.setVisibility(0);
        }
        this.A00 = new Object();
        IgdsMediaButton A00 = A00(context);
        A00.setLabel(A00.getResources().getText(2131955488));
        this.addGifButton = A00;
        C22C A01 = AnonymousClass229.A01(userSession);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_camera_tool_impression");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "event_type", 1);
            AbstractC166997dE.A1N(A0f, "entity_type", 7);
            AbstractC167007dF.A10(A0f, A01);
            C22M c22m = ((C22F) A01).A04;
            AbstractC166987dD.A1S(A0f, c22m.A0L);
            A0f.A8R(C81X.A2v, "camera_tool");
            MSZ.A1E(A0f, c22m, "composition_str_id", c22m.A0M);
            MSX.A1C(A0f);
            AbstractC31171DnF.A1D(A0f, "giphy_clips_grid");
            AbstractC167017dG.A1C(A0f);
        }
        A01(new ViewOnClickListenerC55460OkF(this, 4), EnumC53325Ni3.A07, this);
        IgdsMediaButton A002 = A00(context);
        A002.setId(R.id.clips_action_bar_cancel_button);
        A002.setLabel(A002.getResources().getText(2131954754));
        this.cancelButton = A002;
        NM8 nm8 = new NM8(context);
        nm8.setId(R.id.clips_action_bar_creation_done_button);
        nm8.setSize(EnumC151046r5.A04);
        EnumC151036r4 enumC151036r4 = EnumC151036r4.A0D;
        nm8.setButtonStyle(enumC151036r4);
        nm8.setLabel(nm8.getResources().getText(2131961124));
        this.creationDoneButton = nm8;
        C50811Mcd c50811Mcd = new C50811Mcd(context, EnumC53257Ngv.A09);
        c50811Mcd.setId(R.id.clips_action_bar_discard_button);
        c50811Mcd.setButtonStyle(EnumC151036r4.A08);
        c50811Mcd.setIconResId(R.drawable.instagram_delete_pano_filled_24);
        c50811Mcd.setLabel(c50811Mcd.getResources().getText(2131960921));
        AbstractC43592JPx.A1H(c50811Mcd, -2, -1);
        c50811Mcd.A02();
        this.discardButton = c50811Mcd;
        IgdsMediaButton A003 = A00(context);
        A003.setButtonStyle(enumC151036r4);
        A003.setLabel(A003.getResources().getText(2131961124));
        this.doneButton = A003;
        C0fQ.A00(new ViewOnClickListenerC55464OkJ(54, this, new ViewOnClickListenerC23249ASk(this, 41)), A003);
        C50811Mcd c50811Mcd2 = new C50811Mcd(context, EnumC53257Ngv.A05);
        c50811Mcd2.setId(R.id.clips_action_bar_back_button);
        c50811Mcd2.setButtonStyle(EnumC151036r4.A03);
        c50811Mcd2.A01();
        c50811Mcd2.setGravity(16);
        AbstractC43592JPx.A1H(c50811Mcd2, -2, -1);
        Context A0L = AbstractC166997dE.A0L(c50811Mcd2);
        int A0C = AbstractC166987dD.A0C(A0L, 2);
        AbstractC13880nE.A0j(c50811Mcd2, A0C, A0C);
        int A0C2 = AbstractC166987dD.A0C(A0L, 4);
        AbstractC13880nE.A0i(c50811Mcd2, A0C2, A0C2);
        C50811Mcd.A00(c50811Mcd2);
        this.backButton = c50811Mcd2;
        c50811Mcd2.setContentDescription(context.getResources().getText(2131955972));
        ViewGroup viewGroup = this.backButton;
        if (viewGroup != null) {
            AbstractC56952jT.A01(viewGroup);
        }
        IgdsMediaButton A004 = A00(context);
        A004.setLabel(A004.getResources().getText(2131961124));
        A004.setButtonStyle(enumC151036r4);
        this.reorderDoneButton = A004;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A005 = C07Y.A00(viewLifecycleOwner);
        C57160PZe c57160PZe = new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 20);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, c57160PZe, A005);
        AbstractC23641Du.A05(anonymousClass191, new C57160PZe(A0K, c07s, this, (InterfaceC23621Ds) null, 21), C07Y.A00(A0K));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A01(View.OnClickListener onClickListener, EnumC53325Ni3 enumC53325Ni3, ClipsTimelineActionBarViewController clipsTimelineActionBarViewController) {
        clipsTimelineActionBarViewController.A09.put((EnumMap) enumC53325Ni3, (EnumC53325Ni3) new ViewOnClickListenerC55464OkJ(49, clipsTimelineActionBarViewController, onClickListener));
    }

    public final ViewGroup A03() {
        ViewGroup viewGroup = this.discardButton;
        if (viewGroup != null) {
            return viewGroup;
        }
        C14360o3.A0F("discardButton");
        throw C00O.createAndThrow();
    }

    public final IgdsMediaButton A04() {
        IgdsMediaButton igdsMediaButton = this.creationDoneButton;
        if (igdsMediaButton != null) {
            return igdsMediaButton;
        }
        C14360o3.A0F("creationDoneButton");
        throw C00O.createAndThrow();
    }
}
