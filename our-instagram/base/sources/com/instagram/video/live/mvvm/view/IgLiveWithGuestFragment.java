package com.instagram.video.live.mvvm.view;

import X.AbstractC141776au;
import X.AbstractC147746kz;
import X.AbstractC147826l7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC174697q4;
import X.AbstractC18680vv;
import X.AbstractC195888lY;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC37301Gc2;
import X.AbstractC43592JPx;
import X.AbstractC50522MSa;
import X.AbstractC50523MSb;
import X.AbstractC52821NZe;
import X.AbstractC52865NaM;
import X.AbstractC52922bZ;
import X.AbstractC54269Nyp;
import X.AbstractC55102ObF;
import X.AbstractC55113ObX;
import X.AbstractC56160OwS;
import X.AbstractC56402iY;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AnonymousClass195;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C105824pt;
import X.C14360o3;
import X.C147756l0;
import X.C147836l8;
import X.C147896lL;
import X.C16930sl;
import X.C17060sy;
import X.C1815383g;
import X.C18A;
import X.C199898st;
import X.C1CM;
import X.C1OU;
import X.C22985ABk;
import X.C25531Mh;
import X.C25671My;
import X.C27601Vn;
import X.C2OG;
import X.C3KW;
import X.C41022IEr;
import X.C43210J8h;
import X.C50971Mfe;
import X.C51020MgS;
import X.C52818NZb;
import X.C52827NZk;
import X.C52833NZq;
import X.C52838NZv;
import X.C52862NaJ;
import X.C53020Ncs;
import X.C54497O5z;
import X.C54724OFb;
import X.C55064OaK;
import X.C55085Oah;
import X.C55852Or2;
import X.C56162OwU;
import X.C56163OwV;
import X.C56178Owl;
import X.C56179Owm;
import X.C56180Own;
import X.C56790PIh;
import X.C56792PIj;
import X.C56794PIl;
import X.C56804PIv;
import X.C57167PZl;
import X.C57228PbC;
import X.C57312k6;
import X.C57532Pg6;
import X.C57540PgE;
import X.C57541PgF;
import X.C57547PgL;
import X.C57746PjZ;
import X.EnumC09460dv;
import X.EnumC142806cg;
import X.InterfaceC09390do;
import X.InterfaceC147626kn;
import X.InterfaceC147726kx;
import X.InterfaceC174767qC;
import X.InterfaceC53712dA;
import X.InterfaceC58002Pnm;
import X.InterfaceC58003Pnn;
import X.InterfaceC58005Pnp;
import X.InterfaceC60072op;
import X.MSX;
import X.MSY;
import X.NXR;
import X.NYQ;
import X.NYW;
import X.OB4;
import X.OBF;
import X.ODS;
import X.OE8;
import X.OJp;
import X.OL3;
import X.OMQ;
import X.OMc;
import X.OyE;
import X.PH6;
import X.PI5;
import X.PZE;
import X.RunnableC57016PRh;
import X.SurfaceHolderCallbackC55353OiF;
import X.ViewOnTouchListenerC50780Mbm;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class IgLiveWithGuestFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC147726kx, InterfaceC58002Pnm, InterfaceC58003Pnn, InterfaceC58005Pnp {
    public InterfaceC174767qC A00;
    public C105824pt A01;
    public User A02;
    public C22985ABk A03;
    public C55852Or2 A04;
    public C56804PIv A05;
    public C56179Owm A06;
    public OMc A07;
    public C53020Ncs A08;
    public String A09;
    public AnonymousClass195 A0A;
    public boolean A0B;
    public NYQ A0C;
    public String A0D;
    public final InterfaceC147626kn A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);
    public final Set A0H = AbstractC166987dD.A1H();
    public NXR bottomsheetManagerView;
    public OE8 broadcastStatsView;
    public ViewOnTouchListenerC50780Mbm cameraZoomView;
    public OBF cobroadcastView;
    public C52818NZb commentsView;
    public C56162OwU composerView;
    public C56178Owl donationBarView;
    public OyE faceFilterView;
    public C52827NZk headerView;
    public C56180Own layoutManagerView;
    public OMQ likesView;
    public C52833NZq mediaButtonsView;
    public OJp mentionView;
    public C55064OaK optionsDialogView;
    public C54724OFb overlayVisibilityView;
    public ODS scaleMediaView;
    public C52838NZv stateView;
    public C56163OwV ufiView;

    @Override // X.InterfaceC147726kx
    public final boolean CPP() {
        return false;
    }

    @Override // X.InterfaceC147726kx
    public final void Ch6() {
    }

    @Override // X.InterfaceC58005Pnp
    public final /* synthetic */ void DCi(long j) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_cobroadcast";
    }

    /* JADX WARN: Type inference failed for: r3v26, types: [X.NZe, X.NZb] */
    /* JADX WARN: Type inference failed for: r7v10, types: [X.NZk, X.OwS] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        String str;
        View A0L;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        Context context2 = getContext();
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (AbstractC195888lY.A01(context, A0r) && AbstractC166987dD.A0y().A0f()) {
            AbstractC195888lY.A00().A01(AbstractC166997dE.A0L(view), AbstractC166987dD.A0r(interfaceC09390do), new PH6(view, this), "sup:IgLiveWithGuestFragment");
        }
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.iglive_surface_view_frame);
        NYQ nyq = new NYQ((ConstraintLayout) A0C, this, this, AbstractC166987dD.A0r(interfaceC09390do), this.A01, this, new C57228PbC(this, 18), false);
        this.A0C = nyq;
        C53020Ncs c53020Ncs = this.A08;
        if (c53020Ncs != null) {
            String str2 = this.A0D;
            if (str2 == null) {
                str = "broadcasterId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            Map map = ((OL3) nyq).A05;
            if (map.get(str2) == null) {
                nyq.A02(new Space(((OL3) nyq).A02), str2, null);
            }
            Iterator it = this.A0H.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                if (!C14360o3.A0K(A15.getId(), AbstractC31173DnH.A0t(interfaceC09390do))) {
                    String id = A15.getId();
                    if (map.get(id) == null) {
                        Space space = new Space(((OL3) nyq).A02);
                        nyq.A02(space, id, null);
                        AbstractC167007dF.A0J().postDelayed(new RunnableC57016PRh(space, nyq), 10000L);
                    }
                }
            }
            c53020Ncs.A06 = nyq;
            ConstraintLayout constraintLayout = ((OL3) nyq).A03;
            ((AbstractC55102ObF) c53020Ncs).A01 = constraintLayout.getWidth();
            ((AbstractC55102ObF) c53020Ncs).A00 = constraintLayout.getHeight();
            Context context3 = ((AbstractC55102ObF) c53020Ncs).A05;
            OB4 ob4 = new OB4(new SurfaceView(context3));
            nyq.A02(ob4.A01, ((AbstractC55102ObF) c53020Ncs).A07.userId, context3.getString(2131965380));
            PI5 pi5 = new PI5(nyq, c53020Ncs);
            SurfaceHolderCallbackC55353OiF surfaceHolderCallbackC55353OiF = new SurfaceHolderCallbackC55353OiF(pi5, ob4);
            Map map2 = ob4.A02;
            C14360o3.A06(map2);
            map2.put(pi5, surfaceHolderCallbackC55353OiF);
            ob4.A00.getHolder().addCallback(surfaceHolderCallbackC55353OiF);
            C14360o3.A0B(A0C, 0);
            ((AbstractC55102ObF) c53020Ncs).A08.A05 = A0C;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        List stringArrayList = requireArguments().getStringArrayList("args.tagged_business_partner_ids");
        if (stringArrayList == null) {
            stringArrayList = C16930sl.A00;
        }
        Iterator it2 = stringArrayList.iterator();
        while (it2.hasNext()) {
            User A02 = AbstractC31176DnK.A0h(interfaceC09390do).A02(AbstractC166987dD.A1B(it2));
            if (A02 != null) {
                A1E.add(new BrandedContentTag(A02));
            }
        }
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        User A0g = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
        InterfaceC147626kn interfaceC147626kn = this.A0E;
        EnumC142806cg enumC142806cg = EnumC142806cg.A04;
        this.A07 = AbstractC54269Nyp.A00(this, A0r2, A0g, interfaceC147626kn, enumC142806cg, AbstractC147826l7.A0K.A00(AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg));
        InterfaceC09390do interfaceC09390do2 = this.A0F;
        C147896lL c147896lL = (C147896lL) interfaceC09390do2.getValue();
        String str3 = this.A09;
        str = "broadcastId";
        if (str3 != null) {
            c147896lL.A03(interfaceC147626kn, str3);
            C147896lL c147896lL2 = (C147896lL) interfaceC09390do2.getValue();
            String str4 = this.A09;
            if (str4 != null) {
                c147896lL2.A04(str4);
                SlideContentLayout slideContentLayout = (SlideContentLayout) AbstractC166997dE.A0S(view, R.id.interactivity_question_sticker_container);
                C27601Vn c27601Vn = C27601Vn.A00;
                if (c27601Vn != null) {
                    C55852Or2 A00 = c27601Vn.A00(this, AbstractC166987dD.A0r(interfaceC09390do), slideContentLayout, interfaceC147626kn, C05F.A0C);
                    A00.A00.Ebz(new C56792PIj(this));
                    this.A04 = A00;
                    AbstractC37301Gc2.A0w(this, ((C147896lL) interfaceC09390do2.getValue()).A00, new C57746PjZ(this, 49), 17);
                    FragmentActivity requireActivity = requireActivity();
                    AbstractC31171DnF.A1O(requireActivity);
                    View requireView = requireView();
                    AbstractC43592JPx.A1T(requireView);
                    ViewGroup viewGroup = (ViewGroup) requireView;
                    InterfaceC174767qC interfaceC174767qC = this.A00;
                    if (interfaceC174767qC != null) {
                        OMc oMc = this.A07;
                        if (oMc == null) {
                            str = "reactionsPresenter";
                        } else {
                            C53020Ncs c53020Ncs2 = this.A08;
                            C14360o3.A0C(c53020Ncs2, "null cannot be cast to non-null type com.instagram.video.live.streaming.common.IgLiveStreamingBaseController");
                            C56804PIv c56804PIv = this.A05;
                            if (c56804PIv != null) {
                                C22985ABk c22985ABk = this.A03;
                                if (c22985ABk == null) {
                                    str = "liveMediaPipeline";
                                } else {
                                    C56179Owm c56179Owm = new C56179Owm(requireActivity, viewGroup, interfaceC174767qC, AbstractC166987dD.A0r(interfaceC09390do), c22985ABk, c56804PIv, oMc, c53020Ncs2, C57541PgF.A01(this, 15), C57541PgF.A01(this, 16));
                                    this.A06 = c56179Owm;
                                    c56179Owm.A00 = this;
                                    NYQ nyq2 = this.A0C;
                                    C147896lL c147896lL3 = (C147896lL) interfaceC09390do2.getValue();
                                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                    String str5 = this.A09;
                                    if (str5 != null) {
                                        this.stateView = new C52838NZv(this, A0r3, str5);
                                        this.ufiView = new C56163OwV(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg, R.layout.iglive_broadcaster_buttons_container);
                                        UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                                        View requireView2 = requireView();
                                        C56163OwV c56163OwV = this.ufiView;
                                        if (c56163OwV == null) {
                                            str = "ufiView";
                                        } else {
                                            this.composerView = new C56162OwU(requireView2, c56163OwV.A02, this, A0r4, enumC142806cg);
                                            this.bottomsheetManagerView = new NXR(this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg, null, c147896lL3);
                                            this.broadcastStatsView = new OE8(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                            UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do);
                                            InterfaceC174767qC interfaceC174767qC2 = this.A00;
                                            if (interfaceC174767qC2 != null) {
                                                C56179Owm c56179Owm2 = this.A06;
                                                if (c56179Owm2 == null) {
                                                    str = "captureController";
                                                } else {
                                                    GestureDetector gestureDetector = c56179Owm2.A03;
                                                    C22985ABk c22985ABk2 = this.A03;
                                                    str = "liveMediaPipeline";
                                                    if (c22985ABk2 != null) {
                                                        ViewOnTouchListenerC50780Mbm viewOnTouchListenerC50780Mbm = new ViewOnTouchListenerC50780Mbm(gestureDetector, this, interfaceC174767qC2, c22985ABk2.A01, A0r5);
                                                        requireView().setOnTouchListener(viewOnTouchListenerC50780Mbm);
                                                        this.cameraZoomView = viewOnTouchListenerC50780Mbm;
                                                        UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do);
                                                        C56804PIv c56804PIv2 = this.A05;
                                                        if (c56804PIv2 != null) {
                                                            this.cobroadcastView = new OBF(this, A0r6, nyq2, c56804PIv2, new C54497O5z(this), requireArguments().getString("args.server_info", null));
                                                            UserSession A0r7 = AbstractC166987dD.A0r(interfaceC09390do);
                                                            View requireView3 = requireView();
                                                            C105824pt c105824pt = this.A01;
                                                            C14360o3.A0B(A0r7, 2);
                                                            C43210J8h c43210J8h = new C43210J8h(37, A0r7, this, c105824pt);
                                                            C57547PgL c57547PgL = new C57547PgL(this, 5);
                                                            EnumC09460dv enumC09460dv = EnumC09460dv.A02;
                                                            InterfaceC09390do A01 = C57547PgL.A01(c57547PgL, enumC09460dv, 6);
                                                            AbstractC52865NaM abstractC52865NaM = (AbstractC52865NaM) MSY.A0c(new C57547PgL(A01, 7), c43210J8h, C57532Pg6.A00(null, A01, 26), AbstractC25225BEi.A1D(C52862NaJ.class));
                                                            C14360o3.A0B(abstractC52865NaM, 4);
                                                            ?? abstractC52821NZe = new AbstractC52821NZe(requireView3, this, A0r7, enumC142806cg, abstractC52865NaM);
                                                            abstractC52821NZe.A06();
                                                            this.commentsView = abstractC52821NZe;
                                                            this.donationBarView = new C56178Owl(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                            UserSession A0r8 = AbstractC166987dD.A0r(interfaceC09390do);
                                                            C22985ABk c22985ABk3 = this.A03;
                                                            if (c22985ABk3 != null) {
                                                                this.faceFilterView = new OyE(this, A0r8, c22985ABk3, enumC142806cg);
                                                                UserSession A0r9 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                View requireView4 = requireView();
                                                                C105824pt c105824pt2 = this.A01;
                                                                C14360o3.A0B(A0r9, 2);
                                                                C57532Pg6 A002 = C57532Pg6.A00(c105824pt2, A0r9, 36);
                                                                InterfaceC09390do A012 = C57540PgE.A01(new C57540PgE(this, 3), enumC09460dv, 4);
                                                                C50971Mfe c50971Mfe = (C50971Mfe) MSY.A0c(new C57540PgE(A012, 5), A002, C57532Pg6.A00(null, A012, 37), AbstractC25225BEi.A1D(C50971Mfe.class));
                                                                ?? abstractC56160OwS = new AbstractC56160OwS(requireView4, this, A0r9, c50971Mfe);
                                                                c50971Mfe.A00.A06(getViewLifecycleOwner(), abstractC56160OwS.A0D);
                                                                this.headerView = abstractC56160OwS;
                                                                this.layoutManagerView = new C56180Own(this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                this.likesView = new OMQ(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                this.mentionView = new OJp(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                this.optionsDialogView = new C55064OaK(this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                C54724OFb c54724OFb = new C54724OFb(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), null, enumC142806cg, R.id.iglive_header_layout);
                                                                C52833NZq c52833NZq = this.mediaButtonsView;
                                                                if (c52833NZq != null && (A0L = AbstractC167007dF.A0L(c52833NZq.A09)) != null) {
                                                                    c54724OFb.A00 = A0L;
                                                                }
                                                                this.overlayVisibilityView = c54724OFb;
                                                                this.scaleMediaView = new ODS(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str = "liveWithGuestWaterfall";
                        }
                    }
                    str = "cameraDeviceController";
                } else {
                    str = "instance";
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC147726kx
    public final boolean CPQ() {
        C53020Ncs c53020Ncs = this.A08;
        if (c53020Ncs != null && c53020Ncs.A0C && !c53020Ncs.A0F && !c53020Ncs.A0B && !c53020Ncs.A0E) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58003Pnn
    public final void DOK(int i, boolean z) {
        C55852Or2 c55852Or2 = this.A04;
        if (i > 0) {
            if (c55852Or2 != null) {
                c55852Or2.A00.CgZ();
                return;
            }
        } else if (c55852Or2 != null) {
            c55852Or2.A00.CgY();
            return;
        }
        C14360o3.A0F("igLiveQuestionsController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58002Pnm
    public final void DOe(boolean z, boolean z2) {
        OMc oMc = this.A07;
        if (oMc == null) {
            C14360o3.A0F("reactionsPresenter");
            throw C00O.createAndThrow();
        }
        oMc.A04(z2);
    }

    @Override // X.InterfaceC147726kx
    public final boolean Ejd(String str) {
        if (this.A09 == null) {
            C14360o3.A0F("broadcastId");
            throw C00O.createAndThrow();
        }
        return !r0.equals(str);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0B) {
            return false;
        }
        OBF obf = this.cobroadcastView;
        if (obf == null) {
            C14360o3.A0F("cobroadcastView");
            throw C00O.createAndThrow();
        }
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(obf.A02);
        PZE.A02(A0Z, AbstractC141776au.A00(A0Z), 38);
        return true;
    }

    public IgLiveWithGuestFragment() {
        C57541PgF A01 = C57541PgF.A01(this, 14);
        InterfaceC09390do A00 = C57541PgF.A00(C57541PgF.A01(this, 17), EnumC09460dv.A02, 18);
        this.A0F = AbstractC25225BEi.A0a(C57541PgF.A01(A00, 19), A01, C57532Pg6.A00(null, A00, 12), AbstractC25225BEi.A1D(C147896lL.class));
        this.A0E = new C56794PIl();
    }

    @Override // X.InterfaceC147726kx
    public final Integer BeW(String str) {
        if (Ejd(str)) {
            return C05F.A0N;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Set<User> A06;
        int A02 = C0f9.A02(-1671163225);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 0);
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        EnumC142806cg enumC142806cg = EnumC142806cg.A04;
        c147836l8.A01(A0r, enumC142806cg);
        UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
        C147756l0 c147756l0 = AbstractC147746kz.A0A;
        c147756l0.A01(A0K, enumC142806cg);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("args.broadcaster_id");
            C14360o3.A0A(string);
            this.A0D = string;
            String string2 = bundle2.getString("args.broadcast_id");
            C14360o3.A0A(string2);
            this.A09 = string2;
        }
        ReelStore A04 = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do));
        String str4 = this.A09;
        String str5 = "broadcastId";
        if (str4 != null) {
            Reel A0M = A04.A0M(str4);
            if (A0M != null) {
                C105824pt c105824pt = A0M.A0H;
                if (c105824pt != null) {
                    User user = c105824pt.A09;
                    user.getClass();
                    this.A02 = user;
                } else {
                    c105824pt = null;
                }
                this.A01 = c105824pt;
            }
            Context requireContext = requireContext();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = bundle3.getString("IgLiveCapture.ARGUMENTS_KEY_EXTRA_FACE_EFFECT_ID");
            } else {
                str = null;
            }
            this.A03 = new C22985ABk(requireContext, A0r2, new C56790PIh(this), str);
            this.A00 = AbstractC174697q4.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), "live_with_guest");
            C105824pt c105824pt2 = this.A01;
            if (c105824pt2 != null && (A06 = c105824pt2.A06()) != null) {
                for (User user2 : A06) {
                    Set set = this.A0H;
                    C14360o3.A0A(user2);
                    set.add(user2);
                    AbstractC31176DnK.A0h(interfaceC09390do).A01(user2, true, false);
                }
            }
            Set set2 = this.A0H;
            set2.add(AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do));
            Context requireContext2 = requireContext();
            C1CM c1cm = new C1CM(requireContext());
            String str6 = this.A09;
            if (str6 != null) {
                String str7 = this.A0D;
                str5 = "broadcasterId";
                if (str7 != null) {
                    String string3 = requireArguments().getString("args.media_id");
                    if (string3 == null) {
                        string3 = "";
                    }
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 == null || (str2 = bundle4.getString("args.tracking_token")) == null) {
                        str2 = "";
                    }
                    Bundle bundle5 = this.mArguments;
                    if (bundle5 == null || (str3 = bundle5.getString("args.invite_type")) == null) {
                        str3 = "";
                    }
                    this.A05 = new C56804PIv(requireContext2, AbstractC31176DnK.A0M(this, interfaceC09390do), this, c1cm, str6, str7, string3, str2, str3, set2);
                    AbstractC147746kz A00 = c147756l0.A00(this, AbstractC31175DnJ.A0K(interfaceC09390do, 0), enumC142806cg);
                    C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.logger.store.IgLiveParticipantLoggerStore");
                    NYW nyw = (NYW) A00;
                    C56804PIv c56804PIv = this.A05;
                    String str8 = "liveWithGuestWaterfall";
                    if (c56804PIv != null) {
                        nyw.A01 = c56804PIv;
                        if (this.A02 == null) {
                            c56804PIv.A0A("invalid_broadcaster", "failed to retrieve from reel store");
                            C18A A0h = AbstractC31176DnK.A0h(interfaceC09390do);
                            String str9 = this.A0D;
                            if (str9 != null) {
                                User A022 = A0h.A02(str9);
                                this.A02 = A022;
                                if (A022 == null) {
                                    C56804PIv c56804PIv2 = this.A05;
                                    if (c56804PIv2 != null) {
                                        c56804PIv2.A0A("invalid_broadcaster", "failed to retrieve from user cache");
                                    }
                                }
                            }
                        }
                        C56804PIv c56804PIv3 = this.A05;
                        if (c56804PIv3 != null) {
                            InterfaceC174767qC interfaceC174767qC = this.A00;
                            if (interfaceC174767qC == null) {
                                str8 = "cameraDeviceController";
                            } else {
                                c56804PIv3.A02 = MSX.A0Y(interfaceC174767qC.CR9() ? 1 : 0);
                                C3KW.A01(requireContext(), AbstractC166987dD.A0r(interfaceC09390do)).A02 = this;
                                C56804PIv c56804PIv4 = this.A05;
                                if (c56804PIv4 != null) {
                                    Integer num = c56804PIv4.A03;
                                    Integer num2 = C05F.A00;
                                    if (num == num2) {
                                        C25531Mh A03 = C56804PIv.A03(c56804PIv4, num2);
                                        AbstractC55113ObX.A01(c56804PIv4.A09, A03);
                                        A03.Cht();
                                        c56804PIv4.A03 = C05F.A01;
                                    } else {
                                        C56804PIv.A07(c56804PIv4, num2, "entering guest screen");
                                    }
                                    C0f9.A09(1886662836, A02);
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str8);
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str5);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        String str;
        C41022IEr c41022IEr;
        int A02 = C0f9.A02(132597672);
        C14360o3.A0B(layoutInflater, 0);
        C105824pt c105824pt = this.A01;
        if (c105824pt != null && (c41022IEr = c105824pt.A08) != null) {
            i = c41022IEr.A00;
            i2 = c41022IEr.A01;
        } else {
            i = 0;
            i2 = 0;
        }
        Context A0O = AbstractC166987dD.A0O(requireContext());
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str2 = this.A09;
        if (str2 == null) {
            str = "broadcastId";
        } else {
            C57312k6 A0S = AbstractC25235BEs.A0S(this);
            InterfaceC174767qC interfaceC174767qC = this.A00;
            if (interfaceC174767qC == null) {
                str = "cameraDeviceController";
            } else {
                C22985ABk c22985ABk = this.A03;
                if (c22985ABk == null) {
                    str = "liveMediaPipeline";
                } else {
                    C1815383g c1815383g = c22985ABk.A01;
                    C56804PIv c56804PIv = this.A05;
                    if (c56804PIv == null) {
                        str = "liveWithGuestWaterfall";
                    } else {
                        C55085Oah c55085Oah = new C55085Oah(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
                        Bundle bundle2 = this.mArguments;
                        C14360o3.A0A(bundle2);
                        boolean z = bundle2.getBoolean("args.camera_front_facing", true);
                        String string = requireArguments().getString("args.server_info", null);
                        requireArguments().getString("args.video_call_id", null);
                        C53020Ncs c53020Ncs = new C53020Ncs(A0O, interfaceC174767qC, c1815383g, this, A0r, c55085Oah, c56804PIv, this, str2, string, A0S, i, i2, z);
                        this.A08 = c53020Ncs;
                        c53020Ncs.A0G = requireArguments().getBoolean("args.live_trace_enabled", false);
                        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_iglive_livewith, false);
                        C0f9.A09(-411326300, A02);
                        return A0R;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(916481787);
        super.onDestroy();
        C53020Ncs c53020Ncs = this.A08;
        if (c53020Ncs != null) {
            c53020Ncs.A0D();
        }
        C52838NZv c52838NZv = this.stateView;
        if (c52838NZv == null) {
            C14360o3.A0F("stateView");
            throw C00O.createAndThrow();
        }
        c52838NZv.A01();
        AbstractC147826l7.A0K.A01(AbstractC31180DnO.A0M(this.A0G), EnumC142806cg.A04);
        C0f9.A09(-1616070020, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-774921778);
        super.onDestroyView();
        C56179Owm c56179Owm = this.A06;
        if (c56179Owm == null) {
            str = "captureController";
        } else {
            c56179Owm.A04.setOnTouchListener(null);
            c56179Owm.A00 = null;
            C22985ABk c22985ABk = c56179Owm.A06;
            c22985ABk.A00 = null;
            C25671My c25671My = c22985ABk.A02;
            if (c25671My != null) {
                c25671My.A02(c22985ABk.A03, C199898st.class);
            }
            c22985ABk.A01.A03();
            Window window = AbstractC31172DnG.A04(this).getWindow();
            C14360o3.A07(window);
            AbstractC56402iY.A07(this.mView, window, true);
            C55852Or2 c55852Or2 = this.A04;
            if (c55852Or2 == null) {
                str = "igLiveQuestionsController";
            } else {
                c55852Or2.destroy();
                ((C147896lL) this.A0F.getValue()).A02();
                this.A0C = null;
                C3KW.A01(requireContext(), AbstractC166987dD.A0r(this.A0G)).A02 = null;
                C0f9.A09(190875149, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(219327594);
        super.onPause();
        C56804PIv c56804PIv = this.A05;
        String str = "liveWithGuestWaterfall";
        if (c56804PIv != null) {
            c56804PIv.A0A.removeCallbacks(c56804PIv.A0G);
            if (this.A06 == null) {
                str = "captureController";
            } else {
                C2OG.A01();
                C53020Ncs c53020Ncs = this.A08;
                if (c53020Ncs != null) {
                    c53020Ncs.A0J();
                }
                AnonymousClass195 anonymousClass195 = this.A0A;
                if (anonymousClass195 != null) {
                    anonymousClass195.AGH(null);
                }
                this.A0A = null;
                C52838NZv c52838NZv = this.stateView;
                if (c52838NZv == null) {
                    str = "stateView";
                } else {
                    C51020MgS A00 = c52838NZv.A00();
                    AnonymousClass195 anonymousClass1952 = A00.A00;
                    if (anonymousClass1952 != null) {
                        anonymousClass1952.AGH(null);
                    }
                    A00.A00 = null;
                    OMQ omq = this.likesView;
                    if (omq == null) {
                        str = "likesView";
                    } else {
                        omq.A03();
                        C52818NZb c52818NZb = this.commentsView;
                        if (c52818NZb == null) {
                            str = "commentsView";
                        } else {
                            c52818NZb.A07();
                            C55064OaK c55064OaK = this.optionsDialogView;
                            if (c55064OaK == null) {
                                str = "optionsDialogView";
                            } else {
                                AnonymousClass195 anonymousClass1953 = c55064OaK.A00;
                                if (anonymousClass1953 != null) {
                                    anonymousClass1953.AGH(null);
                                }
                                c55064OaK.A00 = null;
                                C56804PIv c56804PIv2 = this.A05;
                                if (c56804PIv2 != null) {
                                    C25531Mh A03 = C56804PIv.A03(c56804PIv2, C05F.A0j);
                                    A03.A0R("reason", "user_initiated");
                                    A03.Cht();
                                    C0f9.A09(2099586336, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(429081936);
        super.onResume();
        Window window = AbstractC31172DnG.A04(this).getWindow();
        C14360o3.A07(window);
        AbstractC56402iY.A07(this.mView, window, false);
        C56804PIv c56804PIv = this.A05;
        String str = "liveWithGuestWaterfall";
        if (c56804PIv != null) {
            c56804PIv.A0F.A04();
            if (c56804PIv.A07) {
                AbstractC50523MSb.A0j(c56804PIv.A0A, c56804PIv.A0G);
            }
            if (this.A06 == null) {
                str = "captureController";
            } else {
                C2OG.A01();
                C53020Ncs c53020Ncs = this.A08;
                if (c53020Ncs != null) {
                    c53020Ncs.A0F = false;
                    if (!c53020Ncs.A0B) {
                        if (c53020Ncs.A04 != null) {
                            C53020Ncs.A02(c53020Ncs);
                        }
                        c53020Ncs.A0M.A00();
                    }
                }
                this.A0A = AbstractC50522MSa.A0s(this, C57167PZl.A01(this, null, 7), AbstractC147826l7.A0K.A00(AbstractC166987dD.A0r(this.A0G), EnumC142806cg.A04).A03().A00);
                C52838NZv c52838NZv = this.stateView;
                if (c52838NZv == null) {
                    str = "stateView";
                } else {
                    C51020MgS.A00(c52838NZv.A00());
                    OMQ omq = this.likesView;
                    if (omq == null) {
                        str = "likesView";
                    } else {
                        omq.A02().A06();
                        C52818NZb c52818NZb = this.commentsView;
                        if (c52818NZb == null) {
                            str = "commentsView";
                        } else {
                            c52818NZb.A08();
                            C55064OaK c55064OaK = this.optionsDialogView;
                            if (c55064OaK == null) {
                                str = "optionsDialogView";
                            } else {
                                c55064OaK.A02();
                                C56804PIv c56804PIv2 = this.A05;
                                if (c56804PIv2 != null) {
                                    if (c56804PIv2.A03 == C05F.A0C) {
                                        C25531Mh A03 = C56804PIv.A03(c56804PIv2, C05F.A0u);
                                        A03.A0R("reason", "user_initiated");
                                        A03.Cht();
                                    }
                                    C0f9.A09(-1362669190, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC53712dA interfaceC53712dA;
        String str;
        int A02 = C0f9.A02(-453565877);
        super.onStart();
        C56162OwU c56162OwU = this.composerView;
        if (c56162OwU == null) {
            str = "composerView";
        } else {
            MSX.A17(c56162OwU.A08, c56162OwU.A0A);
            C56180Own c56180Own = this.layoutManagerView;
            if (c56180Own == null) {
                str = "layoutManagerView";
            } else {
                MSX.A17(c56180Own.A01, c56180Own.A03);
                C56163OwV c56163OwV = this.ufiView;
                if (c56163OwV == null) {
                    str = "ufiView";
                } else {
                    MSX.A17(c56163OwV.A03, c56163OwV.A05);
                    C56179Owm c56179Owm = this.A06;
                    if (c56179Owm == null) {
                        str = "captureController";
                    } else {
                        c56179Owm.A05.Dnr(c56179Owm.A02);
                        ComponentCallbacks2 rootActivity = getRootActivity();
                        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
                            interfaceC53712dA.EfL(8);
                        }
                        C0f9.A09(152218628, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC53712dA interfaceC53712dA;
        String str;
        int A02 = C0f9.A02(-874941369);
        super.onStop();
        C56162OwU c56162OwU = this.composerView;
        if (c56162OwU == null) {
            str = "composerView";
        } else {
            c56162OwU.A0A.onStop();
            C56180Own c56180Own = this.layoutManagerView;
            if (c56180Own == null) {
                str = "layoutManagerView";
            } else {
                c56180Own.A03.onStop();
                C56163OwV c56163OwV = this.ufiView;
                if (c56163OwV == null) {
                    str = "ufiView";
                } else {
                    c56163OwV.A05.onStop();
                    C56179Owm c56179Owm = this.A06;
                    if (c56179Owm == null) {
                        str = "captureController";
                    } else {
                        c56179Owm.A05.onStop();
                        ComponentCallbacks2 rootActivity = getRootActivity();
                        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
                            interfaceC53712dA.EfL(0);
                        }
                        C0f9.A09(-1986668189, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
