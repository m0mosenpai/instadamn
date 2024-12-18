package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.newsfeed.model.PillsFilterCategory;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PbO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57240PbO extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57240PbO(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [X.2wZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.FNu, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        MUI mui;
        boolean z;
        String str;
        String str2;
        InterfaceC58122Ppl p6c;
        Object A1D;
        C27961Xa A00;
        UserSession A0r;
        QuickPromotionSlot quickPromotionSlot;
        C54922fr A0S;
        long j;
        Number number;
        InterfaceC09390do interfaceC09390do;
        boolean z2;
        boolean z3;
        Bundle A04;
        String str3;
        boolean z4;
        int i;
        String str4;
        NewsfeedFragment newsfeedFragment;
        NewsfeedFragment newsfeedFragment2;
        switch (this.A00) {
            case 0:
                A00 = AbstractC54912fq.A00();
                C26777Bry c26777Bry = (C26777Bry) this.A01;
                A0r = AbstractC166987dD.A0r(c26777Bry.A07);
                quickPromotionSlot = QuickPromotionSlot.A0T;
                A0S = AbstractC31175DnJ.A0S();
                A0S.A04 = new P72(c26777Bry, 7);
                A0S.A0B = AbstractC166997dE.A0a();
                i = 5;
                newsfeedFragment2 = c26777Bry;
                A0S.A08 = new MUU(newsfeedFragment2, i);
                newsfeedFragment = newsfeedFragment2;
                return AbstractC31175DnJ.A0T(newsfeedFragment, A0r, A0S, A00, quickPromotionSlot);
            case 1:
            case Process.SIGSTOP /* 19 */:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return this.A01;
            case 2:
            case 20:
            case 30:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case 21:
            case 31:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 4:
                C26777Bry c26777Bry2 = (C26777Bry) this.A01;
                Bundle requireArguments = c26777Bry2.requireArguments();
                InterfaceC09390do interfaceC09390do2 = c26777Bry2.A07;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                InterfaceC11380iw interfaceC11380iw = c26777Bry2.A01;
                return new C52330NDt(AbstractC25231BEo.A0L(c26777Bry2), interfaceC11380iw, A0r2, (O8I) c26777Bry2.A03.getValue(), (N2B) c26777Bry2.A04.getValue(), C167997eu.A00(AbstractC25231BEo.A0L(c26777Bry2), AbstractC166987dD.A0r(interfaceC09390do2), interfaceC11380iw.getModuleName()), (C34698FQj) c26777Bry2.A05.getValue(), requireArguments.getBoolean("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS"), requireArguments.getBoolean("ARG_HIDE_APPROVE_BUTTON"), C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do2), 36316014367084406L), requireArguments.getBoolean("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER"), requireArguments.getBoolean("ARG_SHOW_SUGGESTED_USERS"), false, C35266Fh1.A00.A08(AbstractC166987dD.A0r(interfaceC09390do2)));
            case 5:
                C1571273r c1571273r = new C1571273r();
                c1571273r.A02 = R.drawable.loadmore_icon_refresh_compound;
                return c1571273r;
            case 6:
                C26872BtZ c26872BtZ = (C26872BtZ) this.A01;
                C152996uT c152996uT = new C152996uT(c26872BtZ.requireContext());
                C66692zm c66692zm = new C66692zm(c26872BtZ.requireContext());
                Context requireContext = c26872BtZ.requireContext();
                InterfaceC09390do interfaceC09390do3 = c26872BtZ.A0C;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do3);
                InterfaceC09390do interfaceC09390do4 = c26872BtZ.A02;
                C31369DqY c31369DqY = new C31369DqY(requireContext, (InterfaceC11380iw) interfaceC09390do4.getValue(), A0r3, c26872BtZ, (C31253Dob) c26872BtZ.A0B.getValue(), AbstractC31178DnM.A1a(c26872BtZ.A0D), true, false);
                V3S v3s = new V3S(c26872BtZ.requireContext(), (InterfaceC11380iw) interfaceC09390do4.getValue(), AbstractC166987dD.A0r(interfaceC09390do3), c26872BtZ, c26872BtZ.requireArguments().getBoolean("ARG_HIDE_APPROVE_BUTTON"), c26872BtZ.requireArguments().getBoolean("ARG_SHOW_OVERFLOW_MENU"), false);
                C32435EQn c32435EQn = new C32435EQn(c26872BtZ.requireContext());
                C168737g7 c168737g7 = new C168737g7(c26872BtZ.requireContext());
                ERD erd = new ERD(c26872BtZ.requireContext(), c26872BtZ);
                C27961Xa A002 = AbstractC54912fq.A00();
                c26872BtZ.requireContext();
                C66132yp A042 = A002.A04((InterfaceC11380iw) interfaceC09390do4.getValue(), AbstractC166987dD.A0r(interfaceC09390do3), (AbstractC55352ga) c26872BtZ.A0A.getValue());
                C31335Dq0 c31335Dq0 = new C31335Dq0(2131974883);
                C35246Fgf c35246Fgf = new C35246Fgf(2131968500);
                C32473ERz c32473ERz = new C32473ERz(c26872BtZ.requireContext(), null);
                Context requireContext2 = c26872BtZ.requireContext();
                boolean A1Z = AbstractC167007dF.A1Z(c26872BtZ.A0F);
                ?? obj = new Object();
                Resources resources = requireContext2.getResources();
                obj.A01 = Integer.valueOf(R.drawable.empty_state_follow_avatar);
                int i2 = 2131962720;
                if (A1Z) {
                    i2 = 2131962717;
                }
                try {
                    obj.A04 = resources.getString(i2);
                    int i3 = 2131962719;
                    if (A1Z) {
                        i3 = 2131962716;
                    }
                    obj.A03 = resources.getString(i3);
                } catch (Resources.NotFoundException unused) {
                }
                C32436EQo c32436EQo = new C32436EQo(c26872BtZ.requireContext());
                return new C52195N8k((View.OnClickListener) c26872BtZ.A0G.getValue(), new ES0(c26872BtZ.requireContext(), (InterfaceC11380iw) interfaceC09390do4.getValue(), AbstractC166987dD.A0r(interfaceC09390do3)), c31369DqY, erd, A042, c152996uT, c32473ERz, obj, c66692zm, c31335Dq0, c32435EQn, c168737g7, c32436EQo, c35246Fgf, v3s);
            case 7:
                if (AbstractC167007dF.A1Z(((C26872BtZ) this.A01).A0E)) {
                    str4 = "follow_requests_with_overflow";
                } else {
                    str4 = "follow_requests";
                }
                return new C55900Oro(str4);
            case 8:
                Fragment fragment = (Fragment) this.A01;
                return new C47609L0u(fragment.requireView(), MSW.A1F(fragment, 27));
            case 9:
                int i4 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C26872BtZ c26872BtZ2 = (C26872BtZ) this.A01;
                return new C62882tR(c26872BtZ2.requireActivity(), (InterfaceC11380iw) c26872BtZ2.A02.getValue(), AbstractC166987dD.A0r(c26872BtZ2.A0C), 23598336);
            case 10:
                C26872BtZ c26872BtZ3 = (C26872BtZ) this.A01;
                return C62862tP.A02(c26872BtZ3, (InterfaceC11380iw) c26872BtZ3.A02.getValue(), AbstractC166987dD.A0o(c26872BtZ3.A0C), null);
            case 11:
                C26872BtZ c26872BtZ4 = (C26872BtZ) this.A01;
                return new O8I((InterfaceC11380iw) c26872BtZ4.A02.getValue(), AbstractC166987dD.A0r(c26872BtZ4.A0C));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new N2B(AbstractC166987dD.A0r(((C26872BtZ) this.A01).A0C));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00 = AbstractC54912fq.A00();
                C26872BtZ c26872BtZ5 = (C26872BtZ) this.A01;
                A0r = AbstractC166987dD.A0r(c26872BtZ5.A0C);
                quickPromotionSlot = QuickPromotionSlot.A0T;
                A0S = AbstractC31175DnJ.A0S();
                A0S.A04 = new P72(c26872BtZ5, 8);
                A0S.A02 = new P70(c26872BtZ5, 0);
                A0S.A00 = new C56500P6y(c26872BtZ5, 4);
                A0S.A0B = false;
                i = 6;
                newsfeedFragment2 = c26872BtZ5;
                A0S.A08 = new MUU(newsfeedFragment2, i);
                newsfeedFragment = newsfeedFragment2;
                return AbstractC31175DnJ.A0T(newsfeedFragment, A0r, A0S, A00, quickPromotionSlot);
            case 14:
                C26872BtZ c26872BtZ6 = (C26872BtZ) this.A01;
                return new Ef1(c26872BtZ6.requireActivity(), (InterfaceC11380iw) c26872BtZ6.A02.getValue(), AbstractC166987dD.A0r(c26872BtZ6.A0C), c26872BtZ6);
            case Process.SIGTERM /* 15 */:
                interfaceC09390do = ((C26872BtZ) this.A01).A0C;
                z4 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36316014367084406L);
                return Boolean.valueOf(z4);
            case 16:
                A04 = AbstractC31179DnN.A04(this.A01);
                str3 = "ARG_SHOW_OVERFLOW_MENU";
                z4 = A04.getBoolean(str3);
                return Boolean.valueOf(z4);
            case 17:
                A04 = AbstractC31179DnN.A04(this.A01);
                str3 = "ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER";
                z4 = A04.getBoolean(str3);
                return Boolean.valueOf(z4);
            case 18:
                return new ViewOnClickListenerC28666ClE(this.A01, 10);
            case 22:
                C26872BtZ c26872BtZ7 = (C26872BtZ) this.A01;
                Bundle requireArguments2 = c26872BtZ7.requireArguments();
                InterfaceC09390do interfaceC09390do5 = c26872BtZ7.A0C;
                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do5);
                InterfaceC09390do interfaceC09390do6 = c26872BtZ7.A02;
                return new C52330NDt(AbstractC25231BEo.A0L(c26872BtZ7), (InterfaceC11380iw) interfaceC09390do6.getValue(), A0r4, (O8I) c26872BtZ7.A07.getValue(), (N2B) c26872BtZ7.A08.getValue(), C167997eu.A00(AbstractC25231BEo.A0L(c26872BtZ7), AbstractC166987dD.A0r(interfaceC09390do5), ((InterfaceC11380iw) interfaceC09390do6.getValue()).getModuleName()), (C34698FQj) c26872BtZ7.A09.getValue(), requireArguments2.getBoolean("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS"), requireArguments2.getBoolean("ARG_HIDE_APPROVE_BUTTON"), AbstractC31178DnM.A1a(c26872BtZ7.A0D), requireArguments2.getBoolean("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER"), requireArguments2.getBoolean("ARG_SHOW_SUGGESTED_USERS"), false, C35266Fh1.A00.A08(AbstractC166987dD.A0r(interfaceC09390do5)));
            case 23:
                C26871BtY c26871BtY = (C26871BtY) this.A01;
                boolean z5 = c26871BtY.requireArguments().getBoolean("ARG_SPAM_FOLLOWER_SETTING_ENABLED");
                Context requireContext3 = c26871BtY.requireContext();
                C1571273r c1571273r2 = new C1571273r();
                try {
                    if (z5) {
                        Resources resources2 = requireContext3.getResources();
                        android.net.Uri A0B = AbstractC25227BEk.A0B(AbstractC63260SgI.A01(c26871BtY.requireContext(), "https://help.instagram.com/1542122179895279"));
                        String A0q = AbstractC166997dE.A0q(resources2, 2131965052);
                        Boolean A0J = AbstractC166997dE.A0Y(AbstractC166987dD.A0r(c26871BtY.A07)).A0J();
                        if (A0J != null) {
                            z3 = A0J.booleanValue();
                        } else {
                            z3 = false;
                        }
                        c1571273r2.A0D = resources2.getString(2131974305);
                        int i5 = 2131974303;
                        if (z3) {
                            i5 = 2131974304;
                        }
                        z2 = true;
                        c1571273r2.A07 = AnonymousClass773.A00(A0B, A0q, resources2.getString(i5, A0q));
                    } else {
                        Resources resources3 = requireContext3.getResources();
                        c1571273r2.A0D = resources3.getString(2131974302);
                        c1571273r2.A07 = resources3.getString(2131974301);
                        c1571273r2.A0C = resources3.getString(2131974309);
                        c1571273r2.A06 = new GHN(c26871BtY, 2);
                        z2 = true;
                    }
                    c1571273r2.A0L = z2;
                } catch (Resources.NotFoundException unused2) {
                }
                C152996uT c152996uT2 = new C152996uT(c26871BtY.requireContext());
                V3S v3s2 = new V3S(c26871BtY.requireContext(), (InterfaceC11380iw) c26871BtY.A01.getValue(), AbstractC166987dD.A0r(c26871BtY.A07), c26871BtY, false, false, true);
                return new C52194N8j(new C54435O3p(c26871BtY), c1571273r2, c152996uT2, new C32435EQn(c26871BtY.requireContext()), new C168737g7(c26871BtY.requireContext()), new C31544DtU(c26871BtY.requireContext()), v3s2);
            case 24:
                Fragment fragment2 = (Fragment) this.A01;
                return new C47609L0u(fragment2.requireView(), MSW.A1F(fragment2, 28));
            case 25:
                int i6 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C26871BtY c26871BtY2 = (C26871BtY) this.A01;
                return new C62882tR(c26871BtY2.requireActivity(), (InterfaceC11380iw) c26871BtY2.A01.getValue(), AbstractC166987dD.A0r(c26871BtY2.A07), 23598336);
            case 26:
                C26871BtY c26871BtY3 = (C26871BtY) this.A01;
                return new O8I((InterfaceC11380iw) c26871BtY3.A01.getValue(), AbstractC166987dD.A0r(c26871BtY3.A07));
            case 27:
                return new N2B(AbstractC166987dD.A0r(((C26871BtY) this.A01).A07));
            case 28:
                interfaceC09390do = ((C26871BtY) this.A01).A07;
                z4 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36316014367084406L);
                return Boolean.valueOf(z4);
            case 32:
                C26871BtY c26871BtY4 = (C26871BtY) this.A01;
                InterfaceC09390do interfaceC09390do7 = c26871BtY4.A07;
                UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do7);
                InterfaceC09390do interfaceC09390do8 = c26871BtY4.A01;
                return new C52330NDt(AbstractC25231BEo.A0L(c26871BtY4), (InterfaceC11380iw) interfaceC09390do8.getValue(), A0r5, (O8I) c26871BtY4.A04.getValue(), (N2B) c26871BtY4.A05.getValue(), C167997eu.A00(AbstractC25231BEo.A0L(c26871BtY4), AbstractC166987dD.A0r(interfaceC09390do7), ((InterfaceC11380iw) interfaceC09390do8.getValue()).getModuleName()), (C34698FQj) c26871BtY4.A06.getValue(), false, false, AbstractC31178DnM.A1a(c26871BtY4.A08), false, false, true, false);
            case 33:
                OEX oex = (OEX) this.A01;
                InterfaceC19630xq interfaceC19630xq = oex.A02;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                long A0E = MSZ.A0E(oex.A06) - 86400000;
                Iterator A15 = AbstractC166997dE.A15(interfaceC19630xq.getAll());
                long j2 = 0;
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object value = A1K.getValue();
                    if ((value instanceof Long) && (number = (Number) value) != null) {
                        j = number.longValue();
                    } else {
                        j = 0;
                    }
                    if (j > A0E) {
                        j2++;
                    } else {
                        ARD.EEj(AbstractC31172DnG.A17(A1K));
                    }
                }
                ARD.apply();
                return Long.valueOf(j2);
            case 34:
                AbstractC54912fq.A00();
                ?? obj2 = new Object();
                A00 = AbstractC54912fq.A00();
                NewsfeedFragment newsfeedFragment3 = (NewsfeedFragment) this.A01;
                A0r = AbstractC166987dD.A0r(newsfeedFragment3.A0A);
                quickPromotionSlot = QuickPromotionSlot.A05;
                A0S = AbstractC31175DnJ.A0S();
                A0S.A0B = AbstractC166997dE.A0a();
                A0S.A02 = new P70(newsfeedFragment3, 1);
                A0S.A00 = new C56501P6z(newsfeedFragment3, obj2);
                newsfeedFragment = newsfeedFragment3;
                return AbstractC31175DnJ.A0T(newsfeedFragment, A0r, A0S, A00, quickPromotionSlot);
            case 35:
                InterfaceC09390do interfaceC09390do9 = ((NewsfeedFragment) this.A01).A0A;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do9);
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, A0o, 36325063863186101L);
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do9);
                if (A06) {
                    p6c = new C50587MUx(C18U.A01(c06090Tz, A0o2, 36606538840020443L));
                } else {
                    p6c = new P6C(C18U.A01(c06090Tz, A0o2, 36606538839823833L));
                }
                InterfaceC58122Ppl interfaceC58122Ppl = p6c;
                try {
                    A1D = C18U.A04(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do9), 36888013816791844L);
                } catch (Throwable th) {
                    A1D = MSW.A1D(th);
                }
                if (A1D instanceof C09540e5) {
                    A1D = "";
                }
                return new OEX(interfaceC58122Ppl, AbstractC19750y3.A01("newstab"), AbstractC19750y3.A01("nf_reachability_upsell_limits"), (String) A1D, C50586MUw.A00, AbstractC25225BEi.A07(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do9), 36606538839954906L));
            case 36:
                if (((MUI) this.A01).A0J.getValue() != null) {
                    str2 = "ig_comment_insights_hub";
                } else {
                    str2 = "newsfeed_you";
                }
                return AbstractC31171DnF.A0D(str2);
            case 37:
                MUI mui2 = (MUI) this.A01;
                return new C31340Dq5(AbstractC31172DnG.A04(mui2), mui2, (C19270xB) mui2.A05.getValue(), mui2.getSession());
            case 38:
                MUI mui3 = (MUI) this.A01;
                return new OI1((C31250DoY) mui3.A0B.getValue(), (InterfaceC31118Dm0) mui3.A0C.getValue());
            case 39:
                MSX.A0S((MUI) this.A01).A0F();
                return C0eB.A00;
            case 40:
                return new MTJ(((MUI) this.A01).getSession(), "feed", 31784970);
            case Seq.NULL_REFNUM /* 41 */:
                MUI mui4 = (MUI) this.A01;
                return new BJK(mui4.requireActivity(), mui4.getSession(), mui4);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return MUH.A01((MUI) this.A01).A01;
            case 43:
                MUI mui5 = (MUI) this.A01;
                C57240PbO c57240PbO = new C57240PbO(mui5, 42);
                InterfaceC09390do interfaceC09390do10 = mui5.A0D;
                if (interfaceC09390do10.getValue() == null) {
                    if (C18U.A06(C06090Tz.A06, mui5.getSession(), 36321924241958804L)) {
                        str = "all";
                        return new MUM(str, c57240PbO);
                    }
                }
                PillsFilterCategory pillsFilterCategory = (PillsFilterCategory) interfaceC09390do10.getValue();
                if (pillsFilterCategory != null) {
                    str = pillsFilterCategory.A01;
                } else {
                    str = null;
                }
                return new MUM(str, c57240PbO);
            case 44:
                MUI mui6 = (MUI) this.A01;
                FragmentActivity requireActivity = mui6.requireActivity();
                UserSession session = mui6.getSession();
                AbstractC10360h2 childFragmentManager = mui6.getChildFragmentManager();
                InterfaceC09390do interfaceC09390do11 = mui6.A05;
                C19270xB c19270xB = (C19270xB) interfaceC09390do11.getValue();
                C60962qK A01 = AbstractC60952qJ.A01(mui6.getModuleName(), true, false);
                int i7 = C31338Dq3.A0A;
                UserSession session2 = mui6.getSession();
                C19270xB c19270xB2 = (C19270xB) interfaceC09390do11.getValue();
                C18920wW A012 = AbstractC12220kQ.A01((C19270xB) interfaceC09390do11.getValue(), mui6.getSession());
                C50582MUr c50582MUr = new C50582MUr(mui6);
                InterfaceC09390do interfaceC09390do12 = mui6.A0A;
                return new C31250DoY(requireActivity, childFragmentManager, mui6, c19270xB, session, A01, new MUs(mui6), (GZI) interfaceC09390do12.getValue(), new C31338Dq3(mui6, c19270xB2, A012, session2, (GZI) interfaceC09390do12.getValue(), c50582MUr), new C31339Dq4(mui6));
            case 45:
                MUI mui7 = (MUI) this.A01;
                UserSession session3 = mui7.getSession();
                ActivityFeedViewModel A0S2 = MSX.A0S(mui7);
                C31251DoZ c31251DoZ = (C31251DoZ) mui7.A0G.getValue();
                C31250DoY c31250DoY = (C31250DoY) mui7.A0B.getValue();
                FJM fjm = new FJM((C19270xB) mui7.A05.getValue(), mui7.getSession());
                C2UY c2uy = C2UY.A01;
                C14360o3.A07(c2uy);
                return new GAK(session3, c31250DoY, fjm, A0S2, c31251DoZ, c2uy);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                mui = (MUI) this.A01;
                z = false;
                mui.A04(z);
                return C0eB.A00;
            case 47:
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((MUI) this.A01).A0L);
                PZG.A01(A0Z, AbstractC141776au.A00(A0Z), 2);
                return C0eB.A00;
            case 48:
                mui = (MUI) this.A01;
                z = true;
                mui.A04(z);
                return C0eB.A00;
            case 49:
                ((MTJ) ((MUI) this.A01).A08.getValue()).A00.A01();
                return C0eB.A00;
        }
    }
}
