package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

/* renamed from: X.N6e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52154N6e extends AbstractC59962oe implements InterfaceC60072op, InterfaceC58002Pnm {
    public static final String __redex_internal_original_name = "IgLiveCaptureFragment";
    public C54845OMq A00;
    public InterfaceC174767qC A01;
    public C22985ABk A02;
    public OL4 A03;
    public PJC A04;
    public C56806PIx A05;
    public OW8 A06;
    public C56179Owm A07;
    public OMc A08;
    public C53021Nct A09;
    public AnonymousClass195 A0A;
    public NYQ A0B;
    public C147896lL A0C;
    public NXR bottomsheetManagerView;
    public OE8 broadcastStatsView;
    public ViewOnTouchListenerC50780Mbm cameraZoomView;
    public C56159OwR capturePrepareView;
    public OBG cobroadcastView;
    public C52820NZd commentsView;
    public C56162OwU composerView;
    public C56178Owl donationBarView;
    public OyQ drawingView;
    public OBH endView;
    public C56256Oy3 eyedropperColorPickerView;
    public OyE faceFilterView;
    public C52829NZm headerView;
    public ODT hostModerationView;
    public C54980OTo hostOptionsView;
    public OBI inviteToJoinView;
    public C56180Own layoutManagerView;
    public OMQ likesView;
    public C52833NZq mediaButtonsView;
    public OJp mentionView;
    public OUY nuxTutorialView;
    public C55064OaK optionsDialogView;
    public OFH overlayBurnInView;
    public C54724OFb overlayVisibilityView;
    public ODS scaleMediaView;
    public O9B ssiSheetView;
    public C52839NZw stateView;
    public OyP textStickersView;
    public O9A timeWarningView;
    public C52840NZx ufiView;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0D = C57541PgF.A00(this, EnumC09460dv.A02, 7);
    public final InterfaceC147636ko A0F = new C56795PIm(this);

    @Override // X.InterfaceC58002Pnm
    public final void DOe(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_broadcast";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        PJC pjc = this.A04;
        if (pjc != null) {
            bundle.putInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, pjc.A05.ordinal());
            bundle.putString("media_id", pjc.A0A);
            bundle.putString(TraceFieldType.BroadcastId, pjc.A09);
            bundle.putString("saved_video_file_path", pjc.A0C);
            super.onSaveInstanceState(bundle);
        }
    }

    public static final UserSession A00(C52154N6e c52154N6e) {
        return AbstractC166987dD.A0r(c52154N6e.A0E);
    }

    public static final void A01(Bundle bundle, C52154N6e c52154N6e, boolean z) {
        PJC pjc = c52154N6e.A04;
        if (pjc != null) {
            pjc.A01(EnumC53324Ni1.A0B);
        }
        Intent intent = null;
        if (bundle != null) {
            intent = AbstractC31171DnF.A04();
            intent.putExtras(bundle);
        }
        FragmentActivity activity = c52154N6e.getActivity();
        if (activity != null) {
            int i = 0;
            if (z) {
                i = -1;
            }
            activity.setResult(i, intent);
            activity.finish();
            return;
        }
        C0w9.A03("IgLiveCaptureFragment.closeFragment", AnonymousClass001.A1D("Activity is null: success=", z));
    }

    public static final void A02(C52154N6e c52154N6e, String str) {
        C142846ck A0d = AbstractC31172DnG.A0d(c52154N6e.A0D);
        PJC pjc = c52154N6e.A04;
        String str2 = null;
        if (pjc != null) {
            str2 = pjc.A0A;
        }
        C190308bo c190308bo = C190298bn.A03;
        A0d.A0X(str2, ((C3PO) AbstractC50523MSb.A0M(c190308bo, c52154N6e).A0A.getValue()).A01, (String) AbstractC50523MSb.A0M(c190308bo, c52154N6e).A0I.getValue(), true);
        OL4 ol4 = c52154N6e.A03;
        if (ol4 == null) {
            C14360o3.A0F("supLiveDelegate");
            throw C00O.createAndThrow();
        }
        UserSession userSession = ol4.A06;
        Context context = ol4.A03;
        if (MSY.A1T(context, userSession)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, PH3.A00, "sup:SupDelegate|SupLiveDelegate_REMOVE_CB");
        }
        PJC pjc2 = c52154N6e.A04;
        if (pjc2 != null) {
            pjc2.A02(C05F.A01, str, true);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0E);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (MSZ.A1a(AbstractC147826l7.A0K.A00(AbstractC166987dD.A0r(this.A0E), EnumC142806cg.A03).A02().A0m)) {
            OUY ouy = this.nuxTutorialView;
            if (ouy != null) {
                OLC olc = ((C50938Mf7) ouy.A08.getValue()).A04;
                olc.A0N.Egh(false);
                olc.A0M.Egh(false);
            }
        } else {
            C56806PIx c56806PIx = this.A05;
            if (c56806PIx != null) {
                PJC pjc = c56806PIx.A0C;
                EnumC53324Ni1 enumC53324Ni1 = pjc.A05;
                if (enumC53324Ni1.A00()) {
                    if (!AbstractC25231BEo.A1b(c56806PIx.A0G)) {
                        if (!AbstractC109224vo.A04(c56806PIx.A06)) {
                            c56806PIx.A0E.A01 = true;
                            c56806PIx.A0D.A01(pjc);
                        }
                        PYu.A01(c56806PIx, AbstractC25235BEs.A0S(c56806PIx.A05), 10);
                    }
                } else {
                    if (!enumC53324Ni1.A01()) {
                        pjc.A02(C05F.A01, "onBackPressed", false);
                        OL4 ol4 = c56806PIx.A09;
                        UserSession userSession = ol4.A06;
                        Context context = ol4.A03;
                        if (!MSY.A1T(context, userSession)) {
                            return false;
                        }
                        C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, PH4.A00, "sup:SupLiveDelegate");
                        return false;
                    }
                    c56806PIx.A0I.invoke(true, null);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v46, types: [X.O3e, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C174757qB c174757qB;
        String str;
        String str2;
        NewFundraiserInfo newFundraiserInfo;
        View A0L;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0c = AbstractC166987dD.A0c(view, R.id.iglive_surface_view_frame_container);
        ViewGroup viewGroup = (ViewGroup) AbstractC166987dD.A0c(view, R.id.iglive_surface_view_frame);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        InterfaceC09390do interfaceC09390do = this.A0E;
        C54801OJv c54801OJv = null;
        FundraiserDisplayInfoModel fundraiserDisplayInfoModel = null;
        this.A0B = new NYQ(constraintLayout, this, this, AbstractC166987dD.A0r(interfaceC09390do), null, this, new C57228PbC(this, 16), true);
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        EnumC142806cg enumC142806cg = EnumC142806cg.A03;
        this.A0C = (C147896lL) MSW.A0F(new C52306NCv(this, A0r, enumC142806cg), requireActivity).A00(C147896lL.class);
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC174767qC interfaceC174767qC = this.A01;
        String str3 = "cameraDeviceController";
        if (interfaceC174767qC != null) {
            if (interfaceC174767qC instanceof C174757qB) {
                c174757qB = (C174757qB) interfaceC174767qC;
            } else {
                c174757qB = null;
            }
            OL4 ol4 = new OL4(requireContext(), this, c174757qB, A0r2);
            this.A03 = ol4;
            C54845OMq c54845OMq = this.A00;
            C19700xy c19700xy = C17280tP.A4E;
            boolean A0f = c19700xy.A00().A0f();
            UserSession userSession = ol4.A06;
            if (MSY.A1T(ol4.A03, userSession)) {
                AbstractC195888lY.A00().A01(AbstractC166997dE.A0L(view), userSession, new PH8(view, c54845OMq, ol4, A0f), "sup:SupLiveDelegate:setupGlassesErrorOverlay");
            }
            C54845OMq c54845OMq2 = this.A00;
            if (c54845OMq2 != null) {
                C17280tP A00 = c19700xy.A00();
                c54845OMq2.A0B.ARp(AbstractC167017dG.A1b(A00, A00.A1t, C17280tP.A4G, 227));
            }
            Context requireContext = requireContext();
            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
            C08790ch A002 = AbstractC018607g.A00(this);
            C57312k6 A0S = AbstractC25235BEs.A0S(this);
            C56805PIw A003 = OQX.A00(this);
            NYV A01 = OQX.A01(this, AbstractC166987dD.A0r(interfaceC09390do));
            Context requireContext2 = requireContext();
            C55085Oah c55085Oah = ((NYW) A01).A00;
            if (c55085Oah == null) {
                c55085Oah = new C55085Oah(requireContext2, ((AbstractC147746kz) A01).A00, ((AbstractC147746kz) A01).A01);
                ((NYW) A01).A00 = c55085Oah;
            }
            Integer num = C05F.A00;
            C190308bo c190308bo = C190298bn.A03;
            Object value = AbstractC50523MSb.A0M(c190308bo, this).A0A.getValue();
            C3PO c3po = C3PO.A06;
            boolean A1X = AbstractC167007dF.A1X(value, c3po);
            UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
            C06090Tz A0j = AbstractC25225BEi.A0j(A0r4, 0);
            if (C18U.A06(A0j, A0r4, 36310873291096413L) && AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do)).A25("reel")) {
                java.util.Set A0k = AbstractC001800i.A0k(AbstractC001800i.A0X(AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0I("reel")));
                ?? obj = new Object();
                obj.A00 = A0k;
                try {
                    StringWriter A0O = AbstractC37300Gc1.A0O();
                    C17z A0O2 = MSW.A0O(A0O);
                    OPP.A00(A0O2, obj);
                    str = MSX.A0e(A0O2, A0O);
                } catch (IOException e) {
                    C0w9.A06("IgLive.EndBroadcastProblem", e.toString(), e);
                    str = "";
                }
            } else {
                str = "";
            }
            OTn oTn = (OTn) AbstractC50523MSb.A0M(c190308bo, this).A0C.getValue();
            if (oTn != null) {
                str2 = oTn.A02;
            } else {
                str2 = null;
            }
            OTn oTn2 = (OTn) AbstractC50523MSb.A0M(c190308bo, this).A0C.getValue();
            if (oTn2 != null) {
                newFundraiserInfo = oTn2.A01;
            } else {
                newFundraiserInfo = null;
            }
            OTn oTn3 = (OTn) AbstractC50523MSb.A0M(c190308bo, this).A0C.getValue();
            if (oTn3 != null) {
                fundraiserDisplayInfoModel = oTn3.A00;
            }
            boolean A1a = MSZ.A1a(AbstractC50523MSb.A0M(c190308bo, this).A0E);
            String str4 = (String) AbstractC50523MSb.A0M(c190308bo, this).A0J.getValue();
            String str5 = (String) AbstractC50523MSb.A0M(c190308bo, this).A0D.getValue();
            List list = (List) AbstractC50523MSb.A0M(c190308bo, this).A0B.getValue();
            C3PO c3po2 = (C3PO) AbstractC50523MSb.A0M(c190308bo, this).A0A.getValue();
            boolean A1a2 = MSZ.A1a(AbstractC50523MSb.A0M(c190308bo, this).A0H);
            OL4 ol42 = this.A03;
            if (ol42 != null) {
                C54732OFj c54732OFj = new C54732OFj(fundraiserDisplayInfoModel, newFundraiserInfo, c3po2, str, str2, str4, str5, (String) AbstractC50523MSb.A0M(c190308bo, this).A0I.getValue(), list, AbstractC25232BEp.A0t((Number) AbstractC50523MSb.A0M(c190308bo, this).A0F.getValue()), A1X, A1a, A1a2, ol42.A01());
                InterfaceC174767qC interfaceC174767qC2 = this.A01;
                if (interfaceC174767qC2 != null) {
                    C22985ABk c22985ABk = this.A02;
                    if (c22985ABk != null) {
                        C1815383g c1815383g = c22985ABk.A01;
                        boolean A0S2 = c19700xy.A00().A0S();
                        C54845OMq c54845OMq3 = this.A00;
                        OL4 ol43 = this.A03;
                        if (ol43 != null) {
                            this.A09 = new C53021Nct(requireContext, A002, c54845OMq3, interfaceC174767qC2, c1815383g, this, A0r3, ol43, A003, c55085Oah, c54732OFj, new C57746PjZ(this, 47), new C30750Dfn(this, 24), A0S, A0S2);
                            FragmentActivity requireActivity2 = requireActivity();
                            UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do);
                            C53021Nct c53021Nct = this.A09;
                            String str6 = "liveStreamController";
                            if (c53021Nct != null) {
                                InterfaceC174767qC interfaceC174767qC3 = this.A01;
                                if (interfaceC174767qC3 != null) {
                                    OL4 ol44 = this.A03;
                                    if (ol44 != null) {
                                        String str7 = (String) AbstractC50523MSb.A0M(c190308bo, this).A0J.getValue();
                                        List list2 = (List) AbstractC50523MSb.A0M(c190308bo, this).A0B.getValue();
                                        C147896lL c147896lL = this.A0C;
                                        if (c147896lL != null) {
                                            C147836l8 c147836l8 = AbstractC147826l7.A0K;
                                            AbstractC147826l7 A004 = c147836l8.A00(AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                            NYV A012 = OQX.A01(this, AbstractC166987dD.A0r(interfaceC09390do));
                                            AbstractC167007dF.A1I(A0r5, 2, list2);
                                            C14360o3.A0B(A004, 10);
                                            C14360o3.A0B(A012, 11);
                                            NYV A013 = OQX.A01(this, A0r5);
                                            Context baseContext = requireActivity2.getBaseContext();
                                            C14360o3.A07(baseContext);
                                            C56805PIw A014 = A013.A01(baseContext);
                                            NYV A015 = OQX.A01(this, A0r5);
                                            Context baseContext2 = requireActivity2.getBaseContext();
                                            C14360o3.A07(baseContext2);
                                            C55085Oah c55085Oah2 = ((NYW) A015).A00;
                                            if (c55085Oah2 == null) {
                                                c55085Oah2 = new C55085Oah(baseContext2, ((AbstractC147746kz) A015).A00, ((AbstractC147746kz) A015).A01);
                                                ((NYW) A015).A00 = c55085Oah2;
                                            }
                                            this.A04 = new PJC(requireActivity2, interfaceC174767qC3, this, AbstractC25651Mw.A00(A0r5), A0r5, c19700xy.A00(), AbstractC23021Ah.A00(A0r5), ol44, A014, c55085Oah2, A012, A004, c147896lL, c53021Nct, str7, list2);
                                            UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do);
                                            User A016 = C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do));
                                            InterfaceC147636ko interfaceC147636ko = this.A0F;
                                            OMc A005 = AbstractC54269Nyp.A00(this, A0r6, A016, interfaceC147636ko, enumC142806cg, c147836l8.A00(AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg));
                                            this.A08 = A005;
                                            A005.A01 = new C54496O5y(this);
                                            FragmentActivity requireActivity3 = requireActivity();
                                            ViewGroup viewGroup2 = (ViewGroup) view;
                                            InterfaceC174767qC interfaceC174767qC4 = this.A01;
                                            if (interfaceC174767qC4 != null) {
                                                OMc oMc = this.A08;
                                                if (oMc != null) {
                                                    C53021Nct c53021Nct2 = this.A09;
                                                    if (c53021Nct2 != null) {
                                                        C56805PIw A006 = OQX.A00(this);
                                                        C22985ABk c22985ABk2 = this.A02;
                                                        if (c22985ABk2 != null) {
                                                            this.A07 = new C56179Owm(requireActivity3, viewGroup2, interfaceC174767qC4, AbstractC166987dD.A0r(interfaceC09390do), c22985ABk2, A006, oMc, c53021Nct2, C57541PgF.A01(this, 10), C57541PgF.A01(this, 11));
                                                            PJC pjc = this.A04;
                                                            if (pjc != null) {
                                                                UserSession A0r7 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                C3PO c3po3 = (C3PO) AbstractC50523MSb.A0M(c190308bo, this).A0A.getValue();
                                                                String str8 = pjc.A0A;
                                                                String str9 = (String) AbstractC50523MSb.A0M(c190308bo, this).A0I.getValue();
                                                                OL4 ol45 = this.A03;
                                                                if (ol45 != null) {
                                                                    this.A06 = new OW8(view, A0c, this, A0r7, ol45, c3po3, str8, str9);
                                                                    if (MSZ.A1a(AbstractC50523MSb.A0M(c190308bo, this).A0E)) {
                                                                        c54801OJv = new C54801OJv(requireContext(), view, this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg, new C57746PjZ(pjc, 48));
                                                                    }
                                                                    Context requireContext3 = requireContext();
                                                                    UserSession A0r8 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                    boolean A1X2 = AbstractC167007dF.A1X(AbstractC50523MSb.A0M(c190308bo, this).A0A.getValue(), c3po);
                                                                    C3PO c3po4 = (C3PO) AbstractC50523MSb.A0M(c190308bo, this).A0A.getValue();
                                                                    OL4 ol46 = this.A03;
                                                                    if (ol46 != null) {
                                                                        C57228PbC c57228PbC = new C57228PbC(this, 17);
                                                                        OMc oMc2 = this.A08;
                                                                        if (oMc2 != null) {
                                                                            C56179Owm c56179Owm = this.A07;
                                                                            if (c56179Owm == null) {
                                                                                str6 = "captureController";
                                                                            } else {
                                                                                OW8 ow8 = this.A06;
                                                                                if (ow8 != null) {
                                                                                    C27601Vn c27601Vn = C27601Vn.A00;
                                                                                    if (c27601Vn != null) {
                                                                                        UserSession A0r9 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                        C14360o3.A0B(interfaceC147636ko, 0);
                                                                                        C55852Or2 A007 = c27601Vn.A00(this, A0r9, (SlideContentLayout) AbstractC166987dD.A0c(view, R.id.interactivity_question_sticker_container), new C147906lM(interfaceC147636ko), num);
                                                                                        C147896lL c147896lL2 = this.A0C;
                                                                                        if (c147896lL2 != null) {
                                                                                            C56806PIx c56806PIx = new C56806PIx(requireContext3, this, A0r8, A007, new C147906lM(interfaceC147636ko), ol46, c3po4, c147896lL2, pjc, ow8, c56179Owm, oMc2, c54801OJv, C57541PgF.A01(this, 12), C57541PgF.A01(this, 13), c57228PbC, new C30482DbR(this, 20), A1X2);
                                                                                            NYQ nyq = this.A0B;
                                                                                            if (nyq != null) {
                                                                                                nyq.A00 = c56806PIx;
                                                                                                this.A05 = c56806PIx;
                                                                                                C53021Nct c53021Nct3 = this.A09;
                                                                                                if (c53021Nct3 != null) {
                                                                                                    C14360o3.A0B(viewGroup, 0);
                                                                                                    ((AbstractC55102ObF) c53021Nct3).A08.A05 = viewGroup;
                                                                                                    C3KW.A01(requireContext(), AbstractC166987dD.A0r(interfaceC09390do)).A02 = this.A05;
                                                                                                    EnumC53324Ni1 enumC53324Ni1 = pjc.A05;
                                                                                                    if (bundle != null) {
                                                                                                        enumC53324Ni1 = EnumC53324Ni1.values()[bundle.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)];
                                                                                                        String string = bundle.getString(TraceFieldType.BroadcastId);
                                                                                                        if (string != null) {
                                                                                                            pjc.A09 = string;
                                                                                                        }
                                                                                                        pjc.A0A = bundle.getString("media_id");
                                                                                                        pjc.A0C = bundle.getString("saved_video_file_path");
                                                                                                    }
                                                                                                    pjc.A01(enumC53324Ni1);
                                                                                                    C142846ck A0d = AbstractC31172DnG.A0d(this.A0D);
                                                                                                    String str10 = (String) AbstractC50523MSb.A0M(c190308bo, this).A0I.getValue();
                                                                                                    String str11 = pjc.A0A;
                                                                                                    String str12 = ((C3PO) AbstractC50523MSb.A0M(c190308bo, this).A0A.getValue()).A01;
                                                                                                    C14360o3.A0B(str12, 2);
                                                                                                    C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                                                                                                    if (AbstractC25226BEj.A1Z(A0I) && str10 != null) {
                                                                                                        AbstractC31175DnJ.A1B(A0I, A0d);
                                                                                                        AbstractC31174DnI.A1I(A0I, "live_stream_start");
                                                                                                        A0I.A0o("start_live_button");
                                                                                                        AbstractC50523MSb.A1B(A0I, "live_stream_view", str10);
                                                                                                        A0I.A0u(A0d.A01);
                                                                                                        A0I.A0v(AbstractC25233BEq.A0p("audience", str12, AbstractC166987dD.A1L("live_id", str11)));
                                                                                                        A0I.Cht();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            C14360o3.A0F("gridPreviewProvider");
                                                                                            throw C00O.createAndThrow();
                                                                                        }
                                                                                    } else {
                                                                                        str3 = "instance";
                                                                                    }
                                                                                } else {
                                                                                    str6 = "endScreenController";
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            NYQ nyq2 = this.A0B;
                                                            if (nyq2 != null) {
                                                                OL4 ol47 = this.A03;
                                                                if (ol47 != null) {
                                                                    C147896lL c147896lL3 = this.A0C;
                                                                    if (c147896lL3 != null) {
                                                                        C53021Nct c53021Nct4 = this.A09;
                                                                        if (c53021Nct4 != null) {
                                                                            C56806PIx c56806PIx2 = this.A05;
                                                                            this.stateView = new C52839NZw(this, AbstractC166987dD.A0r(interfaceC09390do), (C3PO) AbstractC50523MSb.A0M(c190308bo, this).A0A.getValue(), (String) AbstractC50523MSb.A0M(c190308bo, this).A0J.getValue(), (List) AbstractC50523MSb.A0M(c190308bo, this).A0B.getValue(), MSZ.A1a(AbstractC50523MSb.A0M(c190308bo, this).A0E));
                                                                            this.ufiView = new C52840NZx(view, this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                            UserSession A0r10 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                            C52840NZx c52840NZx = this.ufiView;
                                                                            if (c52840NZx == null) {
                                                                                str3 = "ufiView";
                                                                            } else {
                                                                                this.composerView = new C56162OwU(view, ((C56163OwV) c52840NZx).A02, this, A0r10, enumC142806cg);
                                                                                this.bottomsheetManagerView = new NXR(this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg, c56806PIx2, c147896lL3);
                                                                                UserSession A0r11 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                NXR nxr = this.bottomsheetManagerView;
                                                                                if (nxr == null) {
                                                                                    str3 = "bottomsheetManagerView";
                                                                                } else {
                                                                                    this.hostOptionsView = new C54980OTo(this, A0r11, nxr);
                                                                                    this.broadcastStatsView = new OE8(view, this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                                    UserSession A0r12 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                    InterfaceC174767qC interfaceC174767qC5 = this.A01;
                                                                                    if (interfaceC174767qC5 != null) {
                                                                                        C56179Owm c56179Owm2 = this.A07;
                                                                                        if (c56179Owm2 == null) {
                                                                                            str3 = "captureController";
                                                                                        } else {
                                                                                            GestureDetector gestureDetector = c56179Owm2.A03;
                                                                                            C22985ABk c22985ABk3 = this.A02;
                                                                                            str3 = "liveMediaPipeline";
                                                                                            if (c22985ABk3 != null) {
                                                                                                ViewOnTouchListenerC50780Mbm viewOnTouchListenerC50780Mbm = new ViewOnTouchListenerC50780Mbm(gestureDetector, this, interfaceC174767qC5, c22985ABk3.A01, A0r12);
                                                                                                requireView().setOnTouchListener(viewOnTouchListenerC50780Mbm);
                                                                                                this.cameraZoomView = viewOnTouchListenerC50780Mbm;
                                                                                                this.capturePrepareView = new C56159OwR(view, this, AbstractC166987dD.A0r(interfaceC09390do), new C54495O5x(this));
                                                                                                this.cobroadcastView = new OBG(this, AbstractC166987dD.A0r(interfaceC09390do), nyq2, c53021Nct4);
                                                                                                this.commentsView = new C52820NZd(view, this, AbstractC166987dD.A0r(interfaceC09390do), MSZ.A1a(AbstractC50523MSb.A0M(c190308bo, this).A0E));
                                                                                                this.donationBarView = new C56178Owl(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                                                this.endView = new OBH(this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                this.headerView = new C52829NZm(view, this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                this.hostModerationView = new ODT(this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                this.inviteToJoinView = new OBI(view, this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                this.layoutManagerView = new C56180Own(this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                                                this.likesView = new OMQ(view, this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                                                this.mentionView = new OJp(view, this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                                                this.nuxTutorialView = new OUY(view, this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                this.optionsDialogView = new C55064OaK(this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                                                C54724OFb c54724OFb = new C54724OFb(view, this, AbstractC166987dD.A0r(interfaceC09390do), ol47, enumC142806cg, R.id.iglive_broadcaster_header_layout);
                                                                                                C52833NZq c52833NZq = this.mediaButtonsView;
                                                                                                if (c52833NZq != null && (A0L = AbstractC167007dF.A0L(c52833NZq.A09)) != null) {
                                                                                                    c54724OFb.A00 = A0L;
                                                                                                }
                                                                                                this.overlayVisibilityView = c54724OFb;
                                                                                                this.scaleMediaView = new ODS(requireView(), this, AbstractC166987dD.A0r(interfaceC09390do), enumC142806cg);
                                                                                                this.ssiSheetView = new O9B(this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                this.timeWarningView = new O9A(view, this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                UserSession A0r13 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                                C22985ABk c22985ABk4 = this.A02;
                                                                                                if (c22985ABk4 != null) {
                                                                                                    this.faceFilterView = new OyE(this, A0r13, c22985ABk4, enumC142806cg);
                                                                                                    UserSession A0r14 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                                    C14360o3.A0B(A0r14, 0);
                                                                                                    if (C18U.A06(A0j, A0r14, 36325613618934986L)) {
                                                                                                        this.drawingView = new OyQ(view, this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                    }
                                                                                                    UserSession A0r15 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                                    C14360o3.A0B(A0r15, 0);
                                                                                                    if (C18U.A06(A0j, A0r15, 36325613618869449L)) {
                                                                                                        this.textStickersView = new OyP(view, this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                    }
                                                                                                    UserSession A0r16 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                                    C14360o3.A0B(A0r16, 0);
                                                                                                    if (C18U.A06(A0j, A0r16, 36325613618869449L) || C18U.A06(A0j, A0r16, 36325613618934986L)) {
                                                                                                        this.eyedropperColorPickerView = new C56256Oy3(view, this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                        UserSession A0r17 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                                        C22985ABk c22985ABk5 = this.A02;
                                                                                                        if (c22985ABk5 != null) {
                                                                                                            this.overlayBurnInView = new OFH(this, A0r17, c22985ABk5, this.drawingView, this.textStickersView);
                                                                                                        }
                                                                                                    }
                                                                                                    C53021Nct c53021Nct5 = this.A09;
                                                                                                    if (c53021Nct5 != null) {
                                                                                                        NYQ nyq3 = this.A0B;
                                                                                                        if (nyq3 != null) {
                                                                                                            c53021Nct5.A0C = nyq3;
                                                                                                            ConstraintLayout constraintLayout2 = ((OL3) nyq3).A03;
                                                                                                            ((AbstractC55102ObF) c53021Nct5).A01 = constraintLayout2.getWidth();
                                                                                                            ((AbstractC55102ObF) c53021Nct5).A00 = constraintLayout2.getHeight();
                                                                                                            Context context = ((AbstractC55102ObF) c53021Nct5).A05;
                                                                                                            OB4 ob4 = new OB4(new SurfaceView(context));
                                                                                                            nyq3.A02(ob4.A01, ((AbstractC55102ObF) c53021Nct5).A07.userId, context.getString(2131965360));
                                                                                                            PI6 pi6 = new PI6(ob4, nyq3, c53021Nct5);
                                                                                                            SurfaceHolderCallbackC55353OiF surfaceHolderCallbackC55353OiF = new SurfaceHolderCallbackC55353OiF(pi6, ob4);
                                                                                                            Map map = ob4.A02;
                                                                                                            C14360o3.A06(map);
                                                                                                            map.put(pi6, surfaceHolderCallbackC55353OiF);
                                                                                                            ob4.A00.getHolder().addCallback(surfaceHolderCallbackC55353OiF);
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
                                                                    }
                                                                }
                                                            }
                                                            C14360o3.A0F("gridPreviewProvider");
                                                            throw C00O.createAndThrow();
                                                        }
                                                    }
                                                }
                                                C14360o3.A0F("reactionsPresenter");
                                                throw C00O.createAndThrow();
                                            }
                                        }
                                        C14360o3.A0F("questionViewModel");
                                        throw C00O.createAndThrow();
                                    }
                                }
                            }
                            C14360o3.A0F(str6);
                            throw C00O.createAndThrow();
                        }
                    }
                    C14360o3.A0F("liveMediaPipeline");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F("supLiveDelegate");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BaseFragmentActivity baseFragmentActivity;
        BaseFragmentActivity baseFragmentActivity2;
        int A02 = C0f9.A02(-780746300);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        Context context = null;
        if ((requireActivity instanceof BaseFragmentActivity) && (baseFragmentActivity2 = (BaseFragmentActivity) requireActivity) != null) {
            baseFragmentActivity2.A0l(false);
        }
        FragmentActivity requireActivity2 = requireActivity();
        if ((requireActivity2 instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) requireActivity2) != null) {
            baseFragmentActivity.A05 = true;
        }
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0E;
        this.A02 = new C22985ABk(requireContext, AbstractC166987dD.A0r(interfaceC09390do), new C56789PIg(this), (String) AbstractC50523MSb.A0M(C190298bn.A03, this).A0G.getValue());
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        Context context2 = getContext();
        if (context2 != null) {
            context = context2.getApplicationContext();
        }
        if (AbstractC195888lY.A01(context, A0r)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new PH0(this, 4), __redex_internal_original_name);
        }
        InterfaceC174767qC A00 = AbstractC174697q4.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), "live_base");
        if (A00 instanceof C174757qB) {
            C174757qB c174757qB = (C174757qB) A00;
            C54845OMq c54845OMq = this.A00;
            if (c54845OMq != null) {
                LIV liv = (LIV) OYB.A02(AbstractC166987dD.A0r(interfaceC09390do)).A0F.getValue();
                c54845OMq.A0G = liv;
                c54845OMq.A0B.ETw(liv);
                C54845OMq.A00(c54845OMq);
                c174757qB.A04 = new C55873OrN(c174757qB, this);
            }
        }
        this.A01 = A00;
        C0f9.A09(1658610346, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1265071196);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.layout_iglive_capture, false);
        C0f9.A09(-1286829562, A02);
        return A07;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        BaseFragmentActivity baseFragmentActivity;
        BaseFragmentActivity baseFragmentActivity2;
        int A02 = C0f9.A02(-941864863);
        super.onDestroy();
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            baseFragmentActivity = (BaseFragmentActivity) requireActivity;
        } else {
            baseFragmentActivity = null;
        }
        if (baseFragmentActivity != null) {
            baseFragmentActivity.A0l(true);
        }
        FragmentActivity requireActivity2 = requireActivity();
        if ((requireActivity2 instanceof BaseFragmentActivity) && (baseFragmentActivity2 = (BaseFragmentActivity) requireActivity2) != null) {
            baseFragmentActivity2.A05 = false;
        }
        C54845OMq c54845OMq = this.A00;
        if (c54845OMq != null) {
            InterfaceC58276PsU interfaceC58276PsU = c54845OMq.A0B;
            if (interfaceC58276PsU.isConnected()) {
                interfaceC58276PsU.disconnect();
            }
        }
        InterfaceC09390do interfaceC09390do = this.A0E;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 0);
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        EnumC142806cg enumC142806cg = EnumC142806cg.A03;
        c147836l8.A01(A0r, enumC142806cg);
        C190298bn.A03.A02(AbstractC166987dD.A0r(interfaceC09390do));
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r2, 0);
        AbstractC147746kz.A0A.A01(A0r2, enumC142806cg);
        C0f9.A09(-286159300, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1039162592);
        super.onDestroyView();
        C56806PIx c56806PIx = this.A05;
        if (c56806PIx != null) {
            c56806PIx.A0B.A02();
            OMc oMc = c56806PIx.A0F;
            oMc.A01();
            OW8 ow8 = c56806PIx.A0D;
            AbstractC31174DnI.A1N(new NAR(ow8));
            PJC pjc = c56806PIx.A0C;
            pjc.A06 = null;
            pjc.A07 = null;
            pjc.A08 = null;
            ow8.A06 = null;
            C56179Owm c56179Owm = c56806PIx.A0E;
            c56179Owm.A00 = null;
            if (!pjc.A05.A01()) {
                pjc.A0X.A0K();
            }
            C53021Nct c53021Nct = pjc.A0X;
            ((AbstractC55102ObF) c53021Nct).A02 = null;
            c53021Nct.A0E = null;
            c53021Nct.A0D();
            AbstractC25651Mw.A00(pjc.A0R).A02(pjc.A0Q, AbstractC55960Oss.class);
            C22985ABk c22985ABk = c56179Owm.A06;
            c22985ABk.A00 = null;
            C25671My c25671My = c22985ABk.A02;
            if (c25671My != null) {
                c25671My.A02(c22985ABk.A03, C199898st.class);
            }
            c22985ABk.A01.A03();
            oMc.A01 = null;
            oMc.A02 = true;
            c56806PIx.A07.destroy();
        }
        this.A05 = null;
        this.A04 = null;
        Window window = AbstractC31172DnG.A04(this).getWindow();
        C14360o3.A07(window);
        AbstractC56402iY.A07(this.mView, window, true);
        C3KW.A01(requireContext(), AbstractC166987dD.A0r(this.A0E)).A02 = null;
        C54845OMq c54845OMq = this.A00;
        if (c54845OMq != null && c54845OMq.A0J) {
            c54845OMq.A07(false);
        }
        C54845OMq c54845OMq2 = this.A00;
        if (c54845OMq2 != null) {
            c54845OMq2.A06(__redex_internal_original_name);
        }
        C56159OwR c56159OwR = this.capturePrepareView;
        if (c56159OwR == null) {
            str = "capturePrepareView";
        } else {
            MSX.A10(AbstractC167007dF.A0L(c56159OwR.A0B));
            ((C50981Mfo) c56159OwR.A0C.getValue()).A00();
            C52839NZw c52839NZw = this.stateView;
            if (c52839NZw == null) {
                str = "stateView";
            } else {
                c52839NZw.A01();
                C0f9.A09(-629414804, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C56806PIx c56806PIx;
        String str;
        int A02 = C0f9.A02(2127614974);
        super.onPause();
        C54845OMq c54845OMq = this.A00;
        if ((c54845OMq == null || !c54845OMq.A0B.isStreaming()) && (c56806PIx = this.A05) != null) {
            PJC pjc = c56806PIx.A0C;
            if (pjc.A05 == EnumC53324Ni1.A05) {
                pjc.A00();
                c56806PIx.A0I.invoke(AbstractC166997dE.A0a(), null);
            }
            C53021Nct c53021Nct = pjc.A0X;
            c53021Nct.A0a.A0F("onPause");
            c53021Nct.A0O = true;
            if (c53021Nct.A0K != C05F.A0N) {
                C53021Nct.A03(null, c53021Nct, C05F.A01, null, true);
                C53021Nct.A08(c53021Nct);
                OJW ojw = c53021Nct.A0d;
                ojw.A02.removeCallbacks(ojw.A04);
            }
            C2OG.A01();
        }
        AnonymousClass195 anonymousClass195 = this.A0A;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A0A = null;
        C52839NZw c52839NZw = this.stateView;
        if (c52839NZw == null) {
            str = "stateView";
        } else {
            C51020MgS A00 = c52839NZw.A00();
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
                C52820NZd c52820NZd = this.commentsView;
                if (c52820NZd == null) {
                    str = "commentsView";
                } else {
                    c52820NZd.A07();
                    C55064OaK c55064OaK = this.optionsDialogView;
                    if (c55064OaK == null) {
                        str = "optionsDialogView";
                    } else {
                        AnonymousClass195 anonymousClass1953 = c55064OaK.A00;
                        if (anonymousClass1953 != null) {
                            anonymousClass1953.AGH(null);
                        }
                        c55064OaK.A00 = null;
                        C0f9.A09(-1828728549, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        C174757qB c174757qB;
        int A02 = C0f9.A02(-632880762);
        super.onResume();
        Window window = AbstractC31172DnG.A04(this).getWindow();
        C14360o3.A07(window);
        AbstractC56402iY.A07(this.mView, window, false);
        C56806PIx c56806PIx = this.A05;
        if (c56806PIx != null) {
            C53021Nct c53021Nct = c56806PIx.A0C.A0X;
            c53021Nct.A0a.A0F("onResume");
            c53021Nct.A0O = false;
            if (c53021Nct.A0K != C05F.A0N) {
                if (c53021Nct.A0R) {
                    C11T.A02(new RunnableC57021PRm(c53021Nct.A0D, c53021Nct));
                    c53021Nct.A0R = false;
                } else if (c53021Nct.A09 != null) {
                    C53021Nct.A07(c53021Nct);
                }
                c53021Nct.A0d.A00();
            }
            C2OG.A01();
            C56806PIx.A01(c56806PIx, true);
        }
        C54845OMq c54845OMq = this.A00;
        if (c54845OMq != null && c54845OMq.A0B.isStreaming()) {
            InterfaceC174767qC interfaceC174767qC = this.A01;
            if (interfaceC174767qC == null) {
                str = "cameraDeviceController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if ((interfaceC174767qC instanceof C174757qB) && (c174757qB = (C174757qB) interfaceC174767qC) != null) {
                c174757qB.A0C();
                c174757qB.A0P(null, "sup_media_stream");
                c174757qB.EJk(true);
            }
        }
        C15370ps A1F = AbstractC25225BEi.A1F();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, c07s, A1F, this, null, 33), C07Y.A00(viewLifecycleOwner));
        C52839NZw c52839NZw = this.stateView;
        if (c52839NZw == null) {
            str = "stateView";
        } else {
            C51020MgS.A00(c52839NZw.A00());
            OMQ omq = this.likesView;
            if (omq == null) {
                str = "likesView";
            } else {
                omq.A02().A06();
                C52820NZd c52820NZd = this.commentsView;
                if (c52820NZd == null) {
                    str = "commentsView";
                } else {
                    c52820NZd.A08();
                    C55064OaK c55064OaK = this.optionsDialogView;
                    if (c55064OaK == null) {
                        str = "optionsDialogView";
                    } else {
                        c55064OaK.A02();
                        this.A0A = AbstractC50522MSa.A0s(this, C57167PZl.A01(this, null, 6), AbstractC147826l7.A0K.A00(AbstractC166987dD.A0r(this.A0E), EnumC142806cg.A03).A03().A00);
                        C0f9.A09(257433397, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        int A02 = C0f9.A02(-2053450924);
        super.onStart();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) rootActivity).EfL(8);
        }
        C56806PIx c56806PIx = this.A05;
        if (c56806PIx != null) {
            C56179Owm c56179Owm = c56806PIx.A0E;
            c56179Owm.A05.Dnr(c56179Owm.A02);
            C56806PIx.A01(c56806PIx, true);
        }
        C54845OMq c54845OMq = this.A00;
        if (c54845OMq != null && c54845OMq.A0B.isStreaming()) {
            C56805PIw A00 = OQX.A00(this);
            C56805PIw.A0B(A00, C05F.A0Q);
            A00.A04 = 1L;
            C25531Mh A022 = C56805PIw.A02(A00, C05F.A0S);
            A022.A0Q("sup_state", 1L);
            A022.Cht();
        }
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
                C52840NZx c52840NZx = this.ufiView;
                if (c52840NZx == null) {
                    str = "ufiView";
                } else {
                    MSX.A17(c52840NZx.A03, c52840NZx.A05);
                    OyP oyP = this.textStickersView;
                    if (oyP != null) {
                        MSX.A16(oyP.A05, oyP.A07);
                    }
                    C0f9.A09(604498711, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C174757qB c174757qB;
        String str;
        int A02 = C0f9.A02(-2080951857);
        super.onStop();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) rootActivity).EfL(0);
        }
        C54845OMq c54845OMq = this.A00;
        if (c54845OMq == null || !c54845OMq.A0B.isStreaming()) {
            InterfaceC174767qC interfaceC174767qC = this.A01;
            if (interfaceC174767qC == null) {
                str = "cameraDeviceController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if ((interfaceC174767qC instanceof C174757qB) && (c174757qB = (C174757qB) interfaceC174767qC) != null) {
                C174757qB.A05(EnumC222819sM.A03, c174757qB);
            }
            C56806PIx c56806PIx = this.A05;
            if (c56806PIx != null) {
                c56806PIx.A0E.A05.onStop();
                C56806PIx.A01(c56806PIx, false);
            }
        }
        C54845OMq c54845OMq2 = this.A00;
        if (c54845OMq2 != null) {
            c54845OMq2.A04(new N1N(c54845OMq2, 3), "sup:IgLiveCaptureFragment_DISCONNECT_ON_STREAM_ENDED");
        }
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
                C52840NZx c52840NZx = this.ufiView;
                if (c52840NZx == null) {
                    str = "ufiView";
                } else {
                    c52840NZx.A05.onStop();
                    OyP oyP = this.textStickersView;
                    if (oyP != null) {
                        oyP.A07.onStop();
                    }
                    C0f9.A09(1488415532, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
