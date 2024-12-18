package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75443aB implements InterfaceC75453aC {
    public final Fragment A00;
    public final AbstractC10360h2 A01;
    public final C684436h A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC65282xQ A05;
    public final C81063jb A06;
    public final C1M1 A07;
    public final String A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final C5Gi A0B;
    public final InterfaceC114745Gf A0C;
    public final InterfaceC686136y A0D;
    public final C24461Hp A0E;
    public final C33P A0F;
    public final C75473aE A0G;
    public final C38E A0H;
    public final InterfaceC61432r6 A0I;
    public final String A0J;

    public C75443aB(Fragment fragment, AbstractC10360h2 abstractC10360h2, C684436h c684436h, UserSession userSession, C5Gi c5Gi, InterfaceC114745Gf interfaceC114745Gf, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C33P c33p, C81063jb c81063jb, C38E c38e, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1, String str, String str2) {
        C14360o3.A0B(c1m1, 8);
        C14360o3.A0B(c38e, 11);
        this.A0D = interfaceC686136y;
        this.A03 = userSession;
        this.A00 = fragment;
        this.A02 = c684436h;
        this.A04 = interfaceC60442pS;
        this.A01 = abstractC10360h2;
        this.A0I = interfaceC61432r6;
        this.A07 = c1m1;
        this.A08 = str;
        this.A0H = c38e;
        this.A0J = str2;
        this.A05 = interfaceC65282xQ;
        this.A0C = interfaceC114745Gf;
        this.A0B = c5Gi;
        this.A06 = c81063jb;
        this.A0F = c33p;
        this.A0A = AbstractC09440dt.A01(new C207019Eg(this, 2));
        this.A09 = AbstractC09440dt.A01(C75463aD.A00);
        this.A0E = AbstractC24451Ho.A00(userSession);
        this.A0G = (C75473aE) userSession.A01(C75473aE.class, new C57526Pg0(userSession, 35));
    }

    public static final void A01(C75443aB c75443aB, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        C3G2 c3g2;
        ArrayList A1N = AbstractC16960so.A1N(reel);
        if (c75113Zb.A0o == AnonymousClass341.A0U) {
            c3g2 = C3G2.A1q;
        } else {
            c3g2 = C3G2.A0t;
        }
        UserSession userSession = c75443aB.A03;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327932901407707L);
        List A0U = C1OU.A04(userSession).A0U(true);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0U) {
            Reel reel2 = (Reel) obj;
            if (!reel2.A16(userSession) && !reel2.A0f() && !reel2.A0e() && !A1N.contains(reel2)) {
                arrayList.add(obj);
            }
        }
        if (A06 && arrayList.size() >= 5) {
            Reel reel3 = new Reel(C05F.A0N, (List) null, arrayList);
            reel3.A1B = false;
            A1N.add(reel3);
            A1N.addAll(arrayList);
        }
        C38E c38e = c75443aB.A0H;
        c38e.A0C = c75443aB.A0J;
        c38e.A05 = new C31559Dtj(c75443aB.A00.getActivity(), c3Ow.Aek(), new C42789IwR(c75443aB));
        c38e.A06(reel, c3g2, c3Ow, A1N, A1N, A1N);
    }

    @Override // X.InterfaceC75453aC
    public final void Coc(View view, String str) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str, 1);
        if (!AbstractC23021Ah.A00(this.A03).A01.getBoolean(AbstractC111324zv.A00(430), false)) {
            FragmentActivity requireActivity = this.A00.requireActivity();
            String string = view.getResources().getString(2131956257, str);
            C14360o3.A07(string);
            C5SU c5su = new C5SU(requireActivity, new C149686oL(string));
            c5su.A03(view);
            c5su.A06(EnumC58132lV.A03);
            c5su.A00 = 5000;
            c5su.A0A = true;
            c5su.A04 = new C33H() { // from class: X.9oO
                @Override // X.C33H, X.C33I
                public final void Dtt(C5SW c5sw) {
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(C75443aB.this.A03));
                    A0w.E77(AbstractC111324zv.A00(430), true);
                    A0w.apply();
                }
            };
            view.postDelayed(new RunnableC24466Asl(c5su.A00()), 500L);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void Cop(View view, String str) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC151756sL.A00().A01().A01(activity, view, this.A03, str);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void Cvh(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, String str, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(num, 3);
        this.A0D.BZ3().Cvi(c38321qM, c75113Zb, num, str, z, false);
    }

    @Override // X.InterfaceC75453aC
    public final void CyL(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        ArrayList arrayList = new ArrayList();
        User CDj = c38321qM.A0C.CDj();
        if (CDj != null) {
            arrayList.add(CDj);
        }
        List Ab8 = c38321qM.A0C.Ab8();
        if (Ab8 != null) {
            arrayList.addAll(Ab8);
        }
        Fragment fragment = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A03;
        String string = fragment.getString(2131975630);
        C14360o3.A07(string);
        AbstractC55229Oez.A0C(fragment, userSession, c38321qM, interfaceC60442pS, string, arrayList);
    }

    @Override // X.InterfaceC75453aC
    public final void CzQ(C76623c7 c76623c7, C75113Zb c75113Zb) {
        C5Gi c5Gi;
        String str;
        C14360o3.A0B(c76623c7, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (AbstractC80003hp.A00(c76623c7) && (c5Gi = this.A0B) != null) {
            C40971v4 c40971v4 = (C40971v4) c5Gi.A01.BUP(c75113Zb.getPosition());
            if (c40971v4 == null) {
                C0f5 A00 = C18950wb.A00("An injected ad is missing in sponsored content injector.", 817898950, true);
                A00.ABW("ig_host_profile_id", c5Gi.A02);
                A00.ABU(AbstractC111324zv.A00(717), c75113Zb.getPosition());
                A00.ABW("module_name", c5Gi.A03);
                A00.report();
                return;
            }
            C41571w7 A002 = AbstractC41561w6.A00(c5Gi.A00);
            C40971v4 A003 = A002.A00(c40971v4.A0K);
            if (A003 != null && (str = A003.A0c) != null) {
                String str2 = c40971v4.A0c;
                if (!str.equals(str2)) {
                    C0f5 A004 = C18950wb.A00("ad locator host_profile_id overwrite", 817896121, true);
                    A004.ABW(AbstractC111324zv.A00(2813), str);
                    A004.ABW(AbstractC111324zv.A00(2750), str2);
                    A004.ABW("module_name", c5Gi.A03);
                    A004.report();
                }
            }
            A002.A01(c40971v4);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void CzS(C38321qM c38321qM, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c38321qM, 1);
        C147776l2 c147776l2 = (C147776l2) this.A0A.getValue();
        User A2E = c38321qM.A2E(this.A03);
        if (A2E != null) {
            String id = A2E.getId();
            String id2 = c38321qM.getId();
            if (id2 != null) {
                C18920wW c18920wW = c147776l2.A08;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_feed_ring_impression");
                A00.AAK(new C4SX(Long.valueOf(Long.parseLong(id))), "a_pk");
                A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str)));
                A00.AAP("m_pk", id2);
                A00.AAP("container_module", c147776l2.A07.getModuleName());
                A00.AAP("view_mode", "viewer");
                A00.AAk(AbstractC111324zv.A00(4225), AbstractC001800i.A0a(c147776l2.A06));
                A00.Cht();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    @Override // X.InterfaceC75453aC
    public final void D3Y(C38321qM c38321qM, C75113Zb c75113Zb, User user, int i) {
        C14360o3.A0B(user, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        UserSession userSession = this.A03;
        C5SE c5se = new C5SE(userSession, c38321qM, c75113Zb.A06());
        c5se.A06 = user.getId();
        InterfaceC60442pS interfaceC60442pS = this.A04;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            boolean A2N = A2E.A2N();
            C32U.A0K(userSession, c5se, C65.BRAND, c38321qM, interfaceC60442pS, this.A07, Integer.valueOf(c75113Zb.A03), "sponsor_above_caption", A2N);
            A03(c38321qM);
            if (user.A2N()) {
                String A07 = AbstractC41071vF.A07(userSession, c38321qM);
                if (A07 != null) {
                    FragmentActivity activity = this.A00.getActivity();
                    if (activity != null) {
                        C140966Yy c140966Yy = new C140966Yy(activity, userSession);
                        c140966Yy.A08();
                        String id = c38321qM.getId();
                        if (id != null) {
                            String id2 = user.getId();
                            int position = c75113Zb.getPosition();
                            int i2 = c75113Zb.A03;
                            ?? obj = new Object();
                            obj.A06 = id;
                            obj.A02 = position;
                            obj.A00 = i2;
                            obj.A08 = id2;
                            c140966Yy.A0B(null, AbstractC86593tX.A0A(obj, A07, false));
                            c140966Yy.A04();
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    return;
                }
                A04(c38321qM, c75113Zb);
                return;
            }
            A05(c38321qM, c75113Zb, null, user.getId(), "sponsor_above_caption", i, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC75453aC
    public final void D3Z(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A03;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC41689IdI.A00(activity, IGAdTransparencyDisclaimerPlacement.A04, userSession, c38321qM, EnumC39562HdY.A03, B8A.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC75453aC
    public final void D3a(User user) {
        C14360o3.A0B(user, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && !(!C06P.A01(this.A01))) {
            AbstractC35094Fd5.A02(activity, C22P.A31, this.A03, new PendingRecipient(user), false, false);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D3e(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            boolean A5P = c38321qM.A5P();
            String str = null;
            String A00 = AbstractC111324zv.A00(4441);
            UserSession userSession = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            User A2E = c38321qM.A2E(userSession);
            if (A5P) {
                if (A2E != null) {
                    str = A2E.getId();
                }
                AbstractC151386rg.A00(interfaceC60442pS, userSession, c38321qM, A00, str, AbstractC14490oL.A0A(activity));
            } else {
                if (A2E != null) {
                    str = A2E.getId();
                }
                AbstractC151386rg.A01(interfaceC60442pS, userSession, c38321qM, A00, str, AbstractC14490oL.A0A(activity));
            }
            C35265Fh0.A05(activity, userSession, interfaceC60442pS.getModuleName(), c38321qM.A0C.AdE(), A00, !c38321qM.A5P());
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D3f(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        User A2D = c38321qM.A2D();
        if (A2D != null) {
            D3Y(c38321qM, c75113Zb, A2D, i);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC75453aC
    public final void D3h(C38321qM c38321qM) {
        C9C1 AuC;
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A03;
        AbstractC37670Gi3.A0D(BQL.A1Q, userSession, c38321qM, this.A04, AbstractC111324zv.A00(399), true);
        if (AbstractC75373a4.A09(userSession, c38321qM)) {
            FragmentActivity activity = this.A00.getActivity();
            if (activity != null) {
                String id = c38321qM.getId();
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1K, userSession);
                c116875Qr.A1D = id;
                c116875Qr.A1b = true;
                c116875Qr.A1C = userSession.userId;
                c116875Qr.A1d = false;
                AbstractC86593tX.A0X(activity, c116875Qr.A00(), userSession);
                return;
            }
            return;
        }
        C30E c30e = this.A0F.A0G;
        if (c30e == null) {
            return;
        }
        Fragment fragment = this.A00;
        Context requireContext = fragment.requireContext();
        C4QW c4qw = c30e.A05;
        if (c4qw != null && (AuC = c4qw.AuC()) != null) {
            boolean z = AuC.A03;
            FragmentActivity requireActivity = fragment.requireActivity();
            C38943HCs c38943HCs = new C38943HCs();
            Bundle bundle = new Bundle();
            bundle.putBoolean(AbstractC111324zv.A00(1040), z);
            c38943HCs.setArguments(bundle);
            c38943HCs.A00 = new ViewOnClickListenerC41992IjN(requireActivity, requireContext, userSession, c38321qM, c30e);
            new C189448aO(userSession).A00().A03(requireContext, c38943HCs);
            return;
        }
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0D = requireContext.getString(2131954811);
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }

    @Override // X.InterfaceC75453aC
    public final void D3k(C38321qM c38321qM, C75113Zb c75113Zb, int i, boolean z) {
        String A00;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (!c38321qM.A58() && !AbstractC41071vF.A0Q(this.A03, c38321qM)) {
            A00 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        } else {
            A00 = AbstractC111324zv.A00(2536);
        }
        A06(c38321qM, c75113Zb, A00, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D3l(C38321qM c38321qM, C75113Zb c75113Zb, int i, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        A06(c38321qM, c75113Zb, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D3q(C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C193328hC c193328hC = new C193328hC((Activity) activity);
            c193328hC.A0j(activity.getDrawable(R.drawable.ig_illustrations_qp_star_refresh));
            c193328hC.A0A(2131962227);
            c193328hC.A09(2131962228);
            c193328hC.A0K(new DialogInterfaceOnClickListenerC35348FiP(activity, this, c38321qM, c75113Zb), 2131961588);
            c193328hC.A0I(new DialogInterfaceOnClickListenerC35336FiD(this, c38321qM, c75113Zb), 2131961124);
            C0fJ.A00(c193328hC.A02());
            C127085om A00 = AbstractC127075ol.A00(this.A03);
            String moduleName = this.A04.getModuleName();
            String sessionId = this.A07.getSessionId();
            UserSession userSession = A00.A00;
            C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(moduleName), userSession);
            InterfaceC02590Ai A002 = A01.A00(A01.A00, "instagram_feed_favorite_pin_tap");
            if (A002.isSampled()) {
                A002.AAP("module", moduleName);
                String A38 = c38321qM.A38();
                A38.getClass();
                A002.A9K("ig_media_id", Long.valueOf(Long.parseLong(A38)));
                if (c38321qM.A0C.BJN() != null) {
                    str = c38321qM.A0C.BJN();
                } else {
                    str = "";
                }
                A002.AAP("inventory_source", str);
                A002.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
                User A2E = c38321qM.A2E(userSession);
                A2E.getClass();
                A002.A9K("media_author_id", Long.valueOf(Long.parseLong(A2E.getId())));
                A002.A9K("m_ix", Long.valueOf(c75113Zb.getPosition()));
                A002.A9K("recs_ix", Long.valueOf(c75113Zb.A0W));
                A002.AAP("ranking_session_id", sessionId);
                A002.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
                A002.Cht();
            }
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D3v(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        InterfaceC114745Gf interfaceC114745Gf = this.A0C;
        if (interfaceC114745Gf != null) {
            interfaceC114745Gf.D3N(c38321qM, c75113Zb);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D3y(C38321qM c38321qM) {
        EnumC124565kK enumC124565kK;
        EnumC124565kK enumC124565kK2;
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        String moduleName = interfaceC60442pS.getModuleName();
        String A2u = c38321qM.A2u();
        if (c38321qM.A5P()) {
            enumC124565kK = EnumC124565kK.REEL;
        } else {
            enumC124565kK = EnumC124565kK.POST;
        }
        AbstractC86593tX.A0e(enumC124565kK, c38321qM.A1J(), userSession, null, moduleName, AbstractC111324zv.A00(420), A2u);
        Context requireContext = this.A00.requireContext();
        String moduleName2 = interfaceC60442pS.getModuleName();
        String A2u2 = c38321qM.A2u();
        if (c38321qM.A5P()) {
            enumC124565kK2 = EnumC124565kK.REEL;
        } else {
            enumC124565kK2 = EnumC124565kK.POST;
        }
        C124575kL.A00(requireContext, enumC124565kK2, c38321qM.A1J(), userSession, moduleName2, A2u2, false);
    }

    @Override // X.InterfaceC75453aC
    public final void D41(C38321qM c38321qM, C75113Zb c75113Zb, Hashtag hashtag, int i) {
        FragmentActivity activity;
        C14360o3.A0B(hashtag, 1);
        if (!(!C06P.A01(this.A01)) && (activity = this.A00.getActivity()) != null) {
            UserSession userSession = this.A03;
            C140966Yy c140966Yy = new C140966Yy(activity, userSession);
            c140966Yy.A08();
            String moduleName = this.A04.getModuleName();
            Fragment A01 = WE2.A01(userSession);
            A01.setArguments(WE2.A00(hashtag, moduleName, "feed_story_media"));
            c140966Yy.A0D(A01);
            c140966Yy.A0B = "media_header_hashtag";
            c140966Yy.A04();
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D43(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            CMF.A00.A00(activity, EnumC223429tZ.FEED_ATTRIBUTION, C8JW.A0L, this.A03, c38321qM.getId(), this.A04.getModuleName());
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D46(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C454227b c454227b = AbstractC454327d.A00;
        A03(c38321qM);
        if (c38321qM.A2Q().intValue() != 2) {
            if (c454227b != null) {
                c454227b.A02(this.A00.requireContext(), c38321qM, this.A04);
            }
        } else if (c454227b != null) {
            c454227b.A03(this.A00.requireActivity(), c38321qM, this.A04);
        }
        C55782hJ A00 = C55772hI.A00(this.A03);
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            A00.A0A = A2u;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC75453aC
    public final void D47(String str) {
        C14360o3.A0B(str, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A03;
            IgFragmentFactoryImpl.A00();
            C35028Fc1 c35028Fc1 = new C35028Fc1();
            c35028Fc1.A0B = str;
            c35028Fc1.A0E = this.A04.getModuleName();
            c35028Fc1.A0N = true;
            C6XJ c6xj = new C6XJ(activity, c35028Fc1.A01(), userSession, ModalActivity.class, AbstractC111324zv.A00(525));
            c6xj.A08();
            c6xj.A0C(activity);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D48(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A0D.BRv().D48(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D49(C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A03;
        long position = c75113Zb.getPosition();
        C1M1 c1m1 = this.A07;
        if (c1m1 instanceof InterfaceC43589JPu) {
            str = ((InterfaceC43589JPu) c1m1).CGJ();
        } else {
            str = "";
        }
        AbstractC37670Gi3.A0l(userSession, c38321qM, interfaceC60442pS, str, c1m1.getSessionId(), position);
        C37855Gl9.A05(this.A00, userSession, c38321qM, interfaceC60442pS, c1m1.getSessionId(), this.A08);
    }

    @Override // X.InterfaceC75453aC
    public final void D4C(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A03;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            List singletonList = Collections.singletonList(new PendingRecipient(A2E));
            C14360o3.A07(singletonList);
            C122145g6 c122145g6 = new C122145g6(singletonList);
            if (C18U.A06(C06090Tz.A05, userSession, 36325209892074372L)) {
                C32324ELs c32324ELs = new C32324ELs();
                C140966Yy c140966Yy = new C140966Yy(this.A00.requireActivity(), userSession);
                c140966Yy.A08();
                String str2 = str;
                if (str == null) {
                    str2 = "feed";
                }
                c140966Yy.A0A = str2;
                c140966Yy.A0B(null, c32324ELs);
                c140966Yy.A04();
            } else {
                String id = c38321qM.getId();
                if (id != null) {
                    FragmentActivity activity = this.A00.getActivity();
                    if (activity != null) {
                        C36881nl A01 = C36881nl.A01(activity, this.A04, userSession, "feed_ufi");
                        A01.A0B = c122145g6;
                        A01.A0f = id;
                        A01.A0u = true;
                        A01.A06();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C18920wW A012 = AbstractC12220kQ.A01(this.A04, userSession);
            InterfaceC02590Ai A00 = A012.A00(A012.A00, AbstractC111324zv.A00(881));
            if (str == null) {
                str = "feed";
            }
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A00.AAP("author_id", AbstractC76433bn.A00(A2E));
            A00.AAP("media_type", c38321qM.BRp().name());
            A00.AAP("open_thread_id", null);
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC75453aC
    public final void D4G(C38321qM c38321qM, C75113Zb c75113Zb, Boolean bool, int i, boolean z) {
        C65 c65;
        int i2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (Systrace.A0E(1L)) {
            C0fO.A01("DefaultMediaHeaderViewBinderDelegateImpl.onClickProfilePicture", -703048709);
        }
        try {
            if (!c38321qM.A58() && !AbstractC41071vF.A0Q(this.A03, c38321qM)) {
                c65 = C65.BRAND;
            } else {
                c65 = C65.INFLUENCER;
            }
            InterfaceC61432r6 interfaceC61432r6 = this.A0I;
            AnonymousClass317 anonymousClass317 = AnonymousClass317.A0J;
            UserSession userSession = this.A03;
            interfaceC61432r6.DVi(new C6T6(null, null, null, c38321qM.A2F(userSession).A02), anonymousClass317, c38321qM, c75113Zb);
            if (!c38321qM.CdW()) {
                this.A0E.A06(c38321qM.getId());
            }
            A03(c38321qM);
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                C81063jb c81063jb = this.A06;
                if (c81063jb != null) {
                    c81063jb.A05(c38321qM);
                }
                if (c38321qM.CdW() && ((c38321qM.A58() || AbstractC41071vF.A0Q(userSession, c38321qM)) && A2E.A2N())) {
                    A06(c38321qM, c75113Zb, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, z);
                } else {
                    if (c38321qM.A4j() && AbstractC100604fP.A03(userSession, c38321qM)) {
                        AbstractC55229Oez.A09(this.A00, userSession, c38321qM, this.A04, null, null, true, false);
                        if (Systrace.A0E(1L)) {
                            i2 = -1121515506;
                            C0fO.A00(i2);
                            return;
                        }
                        return;
                    }
                    A02(new C5SE(userSession, c38321qM, c75113Zb.A06()), c65, c38321qM, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c75113Zb.A03, z);
                    A05(c38321qM, c75113Zb, bool, A2E.getId(), PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i, z);
                }
                if (Systrace.A0E(1L)) {
                    i2 = 494280940;
                    C0fO.A00(i2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(851783824);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D4I(C38321qM c38321qM, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(c3Ow, 3);
        UserSession userSession = this.A03;
        String id = reel.getId();
        C14360o3.A07(id);
        C1ON A05 = AbstractC55182Odn.A05(userSession, id, true);
        A05.A00 = new HBV(userSession, this, c38321qM, c75113Zb, reel, c3Ow);
        C1GJ.A03(A05);
    }

    @Override // X.InterfaceC75453aC
    public final void D4L(C38321qM c38321qM, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        Integer num;
        String organicTrackingToken;
        InterfaceC38831rF interfaceC38831rF;
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(c3Ow, 3);
        int position = c75113Zb.getPosition();
        if (c38321qM.A5M()) {
            num = Integer.valueOf(c75113Zb.A03);
        } else {
            num = null;
        }
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "profile_story_tap");
        if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
            organicTrackingToken = AbstractC41071vF.A0F(this.A03, c38321qM);
        } else {
            organicTrackingToken = c38321qM.A0C.getOrganicTrackingToken();
        }
        A04.A7Q = organicTrackingToken;
        A04.A61 = c38321qM.getId();
        A04.A70 = this.A07.getSessionId();
        A04.A09(position);
        String BJN = c38321qM.A0C.BJN();
        if (BJN != null) {
            A04.A5t = BJN;
        }
        String str = c38321qM.A0R;
        if (str != null) {
            A04.A72 = str;
        }
        List list = c38321qM.A0e;
        if (!list.isEmpty()) {
            String A00 = AbstractC77343dK.A00(list);
            if (A00 != null) {
                A04.A57 = A00;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (c38321qM.A5M() && num != null) {
            int intValue = num.intValue();
            C38321qM A1e = c38321qM.A1e(intValue);
            if (A1e != null) {
                A04.A08(intValue);
                A04.A4l = A1e.getId();
                C38321qM A1e2 = c38321qM.A1e(0);
                if (A1e2 != null) {
                    A04.A4k = A1e2.getId();
                    A04.A60 = c38321qM.A0C.BPW();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (c38321qM.A5M()) {
            C38321qM A1e3 = c38321qM.A1e(0);
            if (A1e3 != null) {
                interfaceC38831rF = A1e3.A0C;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            interfaceC38831rF = c38321qM.A0C;
        }
        String AZ3 = interfaceC38831rF.AZ3();
        if (AZ3 != null) {
            A04.A4P = AZ3;
        }
        UserSession userSession = this.A03;
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null) {
            A04.A4T = A07;
        }
        if (reel.A0e != null) {
            A04.A4B = Long.valueOf(r0.intValue());
        }
        C32U.A0C(userSession, A04, c38321qM, interfaceC60442pS, null);
        C81063jb c81063jb = this.A06;
        if (c81063jb != null) {
            c81063jb.A05(c38321qM);
        }
        A01(this, c75113Zb, reel, c3Ow);
    }

    @Override // X.InterfaceC75453aC
    public final void D4M(C38321qM c38321qM) {
        String str;
        boolean z;
        String str2;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC43580JMo CHL = c38321qM.A0C.CHL();
        if (CHL != null) {
            User BdV = CHL.BdV();
            FragmentActivity requireActivity = this.A00.requireActivity();
            UserSession userSession = this.A03;
            String BdW = CHL.BdW();
            ImageUrl imageUrl = null;
            if (BdV != null) {
                str = BdV.getUsername();
                z = BdV.isVerified();
            } else {
                str = null;
                z = false;
            }
            String BdS = CHL.BdS();
            String BdU = CHL.BdU();
            if (BdV != null) {
                imageUrl = BdV.Bhu();
                str2 = BdV.getId();
            } else {
                str2 = null;
            }
            CLI.A00(requireActivity, userSession, imageUrl, c38321qM, BdW, str, BdS, BdU, str2, c38321qM.getId(), "feed", z);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D4X(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (c38321qM.A3Z().size() == 2) {
            AbstractC55229Oez.A0A(this.A00, this.A03, c38321qM, this.A04, null);
            return;
        }
        User user = (User) AbstractC001800i.A0J(c38321qM.A3Z());
        if (user == null) {
            return;
        }
        String id = user.getId();
        C5SE c5se = new C5SE(this.A03, c38321qM, c75113Zb.A06());
        c5se.A06 = id;
        C65 c65 = C65.BRAND;
        int i2 = c75113Zb.A03;
        String A00 = AbstractC111324zv.A00(3126);
        A02(c5se, c65, c38321qM, A00, i2, false);
        A03(c38321qM);
        A05(c38321qM, c75113Zb, null, id, A00, i, false);
    }

    @Override // X.InterfaceC75453aC
    public final void D4Z(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        UserSession userSession = this.A03;
        C32U.A0Q(userSession, c38321qM, this.A04, null, null, null, "sponsored_label", c75113Zb.A03);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            D4g(c38321qM, c75113Zb, A2E.getId(), c75113Zb.getPosition(), z);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC75453aC
    public final void D4e(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            if (c38321qM.A10() == 1) {
                AbstractC55229Oez.A0B(fragment, this.A03, c38321qM, this.A04, this.A08);
            } else {
                AbstractC55229Oez.A09(fragment, this.A03, c38321qM, this.A04, null, null, z, false);
            }
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D4g(C38321qM c38321qM, C75113Zb c75113Zb, String str, int i, boolean z) {
        C65 c65;
        String A00;
        User CDj;
        C60662pp c60662pp;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(str, 2);
        if (!c38321qM.A58() && !AbstractC41071vF.A0Q(this.A03, c38321qM)) {
            c65 = C65.BRAND;
        } else {
            c65 = C65.INFLUENCER;
        }
        if (!c38321qM.A58() && !AbstractC41071vF.A0Q(this.A03, c38321qM)) {
            A00 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        } else {
            A00 = AbstractC111324zv.A00(2536);
        }
        C81063jb c81063jb = this.A06;
        if (c81063jb != null && c81063jb.A08(c38321qM, false)) {
            String id = c38321qM.getId();
            if (id != null) {
                C81063jb.A01(c81063jb, id, true);
            }
            if (c81063jb.A0K.A00() && (c60662pp = c81063jb.A06) != null) {
                c60662pp.A0V(true);
            }
        }
        if (c38321qM.CdW() && (CDj = c38321qM.A0C.CDj()) != null && CDj.A2N()) {
            A06(c38321qM, c75113Zb, A00, z);
            return;
        }
        UserSession userSession = this.A03;
        A02(new C5SE(userSession, c38321qM, c75113Zb.A06()), c65, c38321qM, A00, c75113Zb.A03, z);
        this.A0I.DVi(new C6T6(null, null, null, c38321qM.A2F(userSession).A02), AnonymousClass317.A0J, c38321qM, c75113Zb);
        if (!c38321qM.CdW()) {
            this.A0E.A06(c38321qM.getId());
        }
        A03(c38321qM);
        A05(c38321qM, c75113Zb, null, str, A00, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4h(User user) {
        C14360o3.A0B(user, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            String str = this.A08;
            String A00 = AbstractC76433bn.A00(user);
            if (A00 != null) {
                c1xj.A0N(activity, user.A03.Bt7(), userSession, interfaceC60442pS, str, null, "feed_media_header_cta", A00, user.A03.getUsername()).A05();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D4i(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        Fragment fragment = this.A00;
        if (fragment instanceof AbstractC59962oe) {
            C41721Ids.A01(fragment, this.A03, c38321qM, this.A04, C05F.A0C, String.valueOf(i), String.valueOf(c75113Zb.A0W), this.A07.getSessionId());
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D4j(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC27715CKi.A00(activity, Nj6.POSTS, this.A03, c38321qM);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (X.AbstractC117245Sj.A00(r38) != com.instagram.api.schemas.OriginalAudioSubtype.A06) goto L42;
     */
    @Override // X.InterfaceC75453aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D4x(X.C8JW r37, X.C3x9 r38, X.C38321qM r39, X.C75113Zb r40) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75443aB.D4x(X.8JW, X.3x9, X.1qM, X.3Zb):void");
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener D4y(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Context context = this.A00.getContext();
        if (context == null) {
            return null;
        }
        return new C105174oX(context, this.A03, c38321qM, C05F.A00, this.A04.getModuleName());
    }

    @Override // X.InterfaceC75453aC
    public final void D4z(C38321qM c38321qM, boolean z) {
        MusicMuteAudioReason musicMuteAudioReason;
        Boolean bool;
        String str;
        MusicConsumptionModel BVa;
        OriginalSoundConsumptionInfoIntf AqX;
        C14360o3.A0B(c38321qM, 0);
        OriginalSoundDataIntf A1K = c38321qM.A1K();
        Long l = null;
        if (A1K == null || (AqX = A1K.AqX()) == null || (musicMuteAudioReason = AqX.BvC()) == null) {
            C88543xC A1Q = c38321qM.A1Q();
            if (A1Q != null) {
                musicMuteAudioReason = A1Q.BvC();
            } else {
                musicMuteAudioReason = null;
            }
        }
        C88543xC A1Q2 = c38321qM.A1Q();
        if (A1Q2 != null && (BVa = A1Q2.A00.BVa()) != null) {
            bool = BVa.Buu();
        } else {
            bool = null;
        }
        C75473aE c75473aE = this.A0G;
        c75473aE.A01 = Boolean.valueOf(z);
        if (z) {
            if (musicMuteAudioReason != null) {
                str = musicMuteAudioReason.A00;
            } else {
                str = null;
            }
            c75473aE.A02 = str;
            c75473aE.A00 = bool;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            UserSession userSession = this.A03;
            String A38 = c38321qM.A38();
            if (A38 != null) {
                Long A0k = AbstractC003100w.A0k(10, A38);
                String A09 = AbstractC76643c9.A09(c38321qM);
                if (A09 != null) {
                    l = AbstractC003100w.A0k(10, A09);
                }
                IRT.A01(interfaceC60442pS, userSession, A0k, l);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        c75473aE.A02 = null;
        c75473aE.A00 = null;
    }

    @Override // X.InterfaceC75453aC
    public final void D5K(C38321qM c38321qM) {
        String str;
        InterfaceC84163p3 BPh;
        C4GI BZr;
        User CDj;
        C14360o3.A0B(c38321qM, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            InterfaceC60442pS interfaceC60442pS = this.A04;
            UserSession userSession = this.A03;
            Bundle bundle = new Bundle();
            String obj = C0HM.A00().toString();
            C14360o3.A07(obj);
            bundle.putString("media_id", c38321qM.getId());
            bundle.putSerializable("media_type", c38321qM.BRp());
            bundle.putString("prior_module", interfaceC60442pS.getModuleName());
            bundle.putString(MSV.A00(186), obj);
            bundle.putString(MSV.A00(185), MSV.A00(85));
            ArrayList A05 = C76263bW.A00.A05(userSession, c38321qM);
            bundle.putString(MSV.A00(29), AnonymousClass001.A0R("feed_header_mashup_content_clips", "_bottom_sheet"));
            bundle.putParcelableArrayList(MSV.A00(121), A05);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
            String str2 = null;
            if (clipsMetadata != null && (BPh = clipsMetadata.BPh()) != null && (BZr = BPh.BZr()) != null && (CDj = BZr.CDj()) != null) {
                str = CDj.getId();
            } else {
                str = null;
            }
            String A00 = AbstractC43591JPw.A00(49);
            bundle.putString(A00, str);
            User A01 = C76263bW.A01(c38321qM);
            if (A01 != null) {
                str2 = A01.getId();
            }
            bundle.putString(A00, str2);
            String string = fragment.getString(2131975627);
            C14360o3.A07(string);
            AbstractC55229Oez.A07(bundle, fragment, userSession, interfaceC60442pS, null, string);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D5R(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            InterfaceC60442pS interfaceC60442pS = this.A04;
            UserSession userSession = this.A03;
            AbstractC55229Oez.A0C(fragment, userSession, c38321qM, interfaceC60442pS, fragment.getString(2131975629), c38321qM.A3u(userSession));
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D5Z(String str) {
        Fragment fragment;
        FragmentActivity activity;
        C684436h c684436h;
        C14360o3.A0B(str, 0);
        C1DW c1dw = C1DX.A03;
        UserSession userSession = this.A03;
        C38321qM A01 = c1dw.A01(userSession, "DefaultFeedListAdapterDelegate", str);
        if (A01 != null && (activity = (fragment = this.A00).getActivity()) != null && (c684436h = this.A02) != null) {
            new FRV(activity, c684436h, userSession).A02(null, fragment, EnumC33409Epg.CLIPS_VIEWER, new C55885OrZ(userSession, A01), new C35936Ftu(activity, this), this.A04);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r10.A52() != false) goto L6;
     */
    @Override // X.InterfaceC75453aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5k(X.C38321qM r10) {
        /*
            r9 = this;
            r8 = 0
            r3 = r10
            X.C14360o3.A0B(r10, r8)
            androidx.fragment.app.Fragment r1 = r9.A00
            X.2pS r4 = r9.A04
            com.instagram.common.session.UserSession r2 = r9.A03
            boolean r0 = r10.A4j()
            if (r0 != 0) goto L18
            boolean r0 = r10.A52()
            r7 = 0
            if (r0 == 0) goto L19
        L18:
            r7 = 1
        L19:
            r5 = 0
            java.lang.String r6 = "collab_post_follow_button_from_feed_surface"
            X.AbstractC55229Oez.A09(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75443aB.D5k(X.1qM):void");
    }

    @Override // X.InterfaceC75453aC
    public final void DS6(View view, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(view, 1);
        this.A0D.BRv().DS6(view, c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void DWZ(String str) {
        FragmentActivity activity;
        C14360o3.A0B(str, 0);
        C1DW c1dw = C1DX.A03;
        UserSession userSession = this.A03;
        C38321qM A01 = c1dw.A01(userSession, "DefaultFeedListAdapterDelegate", str);
        if (A01 != null && (activity = this.A00.getActivity()) != null && AbstractC151756sL.A01() && AbstractC151756sL.A00().A04(userSession)) {
            AbstractC151756sL.A00().A01();
            AbstractC34278F9y.A00(activity, null, userSession, A01);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void DX5(C38321qM c38321qM) {
        String str;
        User CDj;
        C14360o3.A0B(c38321qM, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            InterfaceC60442pS interfaceC60442pS = this.A04;
            UserSession userSession = this.A03;
            Bundle bundle = new Bundle();
            String obj = C0HM.A00().toString();
            C14360o3.A07(obj);
            bundle.putString("media_id", c38321qM.getId());
            bundle.putSerializable("media_type", c38321qM.BRp());
            bundle.putString("prior_module", interfaceC60442pS.getModuleName());
            bundle.putString(MSV.A00(186), obj);
            bundle.putString(MSV.A00(185), MSV.A00(85));
            ArrayList A04 = C76263bW.A00.A04(userSession, c38321qM);
            bundle.putString(MSV.A00(29), AnonymousClass001.A0R("feed_header_original_content_clips", "_bottom_sheet"));
            bundle.putParcelableArrayList(MSV.A00(121), A04);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            OriginalitySourceMediaInfo A00 = C76263bW.A00(c38321qM);
            if (A00 != null && (CDj = A00.CDj()) != null) {
                str = CDj.getId();
            } else {
                str = null;
            }
            bundle.putString(AbstractC43591JPw.A00(49), str);
            String string = fragment.getString(2131975627);
            C14360o3.A07(string);
            AbstractC55229Oez.A07(bundle, fragment, userSession, interfaceC60442pS, null, string);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void DX6(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A03;
            AbstractC37670Gi3.A0V(null, userSession, this.A04, Integer.valueOf(c75113Zb.getPosition()), c38321qM.A2u(), true);
            C76263bW.A00.A06(activity, userSession, c38321qM);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void Dcz(C38321qM c38321qM) {
        WearablesAppAttributionType wearablesAppAttributionType;
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A03;
        C8i c8i = C8i.ATTRIBUTE_IMPRESSION;
        InterfaceC43580JMo CHL = c38321qM.A0C.CHL();
        if (CHL != null) {
            wearablesAppAttributionType = CHL.AdN();
        } else {
            wearablesAppAttributionType = null;
        }
        CZH.A01(c8i, wearablesAppAttributionType, userSession, c38321qM.getId(), "feed");
    }

    @Override // X.InterfaceC75453aC
    public final void Dvc(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A03;
        AnonymousClass730 anonymousClass730 = new AnonymousClass730(userSession);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            Fragment fragment = this.A00;
            Context context = fragment.getContext();
            if (context != null && (fragment instanceof AbstractC59962oe)) {
                String CAl = A2E.A03.CAl();
                if (CAl != null) {
                    String id = A2E.getId();
                    Rie rie = Rie.FEED;
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        anonymousClass730.A00(rie, id, CAl, A2u, true);
                        AbstractC76693cH.A01(context, rie, userSession, A2E.getId(), CAl);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C75443aB c75443aB, C38321qM c38321qM, Boolean bool, String str) {
        C147776l2 c147776l2 = (C147776l2) c75443aB.A0A.getValue();
        User A2E = c38321qM.A2E(c75443aB.A03);
        if (A2E != null) {
            String id = A2E.getId();
            String id2 = c38321qM.getId();
            if (id2 != null) {
                C18920wW c18920wW = c147776l2.A08;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_viewer_entry");
                A00.AAK(new C4SX(Long.valueOf(Long.parseLong(id))), "a_pk");
                A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str)));
                A00.AAP("m_pk", id2);
                A00.AAP("container_module", c147776l2.A07.getModuleName());
                A00.AAP("view_mode", "viewer");
                A00.AAP("method", "feed_ring");
                A00.A7v("is_currently_live", bool);
                A00.Cht();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02(C5SE c5se, C65 c65, C38321qM c38321qM, String str, int i, boolean z) {
        Integer num;
        boolean z2;
        UserSession userSession = this.A03;
        User A2E = c38321qM.A2E(userSession);
        if (C87153uY.A0A(userSession, c38321qM)) {
            num = c38321qM.A0I;
        } else {
            num = null;
        }
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C42542IsL c42542IsL = new C42542IsL(c5se, A2E);
        if (A2E != null) {
            z2 = A2E.A2N();
        } else {
            z2 = false;
        }
        C32U.A0J(userSession, c42542IsL, c65, c38321qM, interfaceC60442pS, this.A07, null, null, Integer.valueOf(i), num, str, null, null, null, 0, z2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A03(C38321qM c38321qM) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            C55782hJ A00 = C55772hI.A00(this.A03);
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) fragment;
            String id = c38321qM.getId();
            if (id != null) {
                A00.A08(activity, interfaceC11380iw, AbstractC111324zv.A00(3307), id);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A04(C38321qM c38321qM, C75113Zb c75113Zb) {
        User A2E = c38321qM.A2E(this.A03);
        if (A2E != null) {
            if (A2E.A2N() && AbstractC75103Za.A0Q(c38321qM, c75113Zb.A03)) {
                c75113Zb.A0m(!c75113Zb.A28, true);
                if (c75113Zb.A28) {
                    c75113Zb.A1K = "pbia_profile_tap";
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105 A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:5:0x0010, B:15:0x001e, B:17:0x002a, B:19:0x0030, B:21:0x003c, B:24:0x0050, B:25:0x0062, B:30:0x0078, B:32:0x0099, B:34:0x00a9, B:37:0x00b5, B:38:0x00b9, B:40:0x00c5, B:42:0x00d5, B:43:0x00db, B:45:0x00e1, B:47:0x00e7, B:50:0x00ef, B:51:0x00f4, B:53:0x0105, B:54:0x010f, B:56:0x011c, B:57:0x0120, B:62:0x0149, B:65:0x0151, B:67:0x015c, B:68:0x00cd, B:69:0x017a, B:70:0x0181), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:5:0x0010, B:15:0x001e, B:17:0x002a, B:19:0x0030, B:21:0x003c, B:24:0x0050, B:25:0x0062, B:30:0x0078, B:32:0x0099, B:34:0x00a9, B:37:0x00b5, B:38:0x00b9, B:40:0x00c5, B:42:0x00d5, B:43:0x00db, B:45:0x00e1, B:47:0x00e7, B:50:0x00ef, B:51:0x00f4, B:53:0x0105, B:54:0x010f, B:56:0x011c, B:57:0x0120, B:62:0x0149, B:65:0x0151, B:67:0x015c, B:68:0x00cd, B:69:0x017a, B:70:0x0181), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(X.C38321qM r20, X.C75113Zb r21, java.lang.Boolean r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75443aB.A05(X.1qM, X.3Zb, java.lang.Boolean, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (X.AbstractC41071vF.A0Q(r15, r21) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06(X.C38321qM r21, X.C75113Zb r22, java.lang.String r23, boolean r24) {
        /*
            r20 = this;
            r11 = r21
            boolean r0 = r11.A58()
            r8 = r20
            if (r0 != 0) goto Lb6
            com.instagram.common.session.UserSession r0 = r8.A03
            boolean r0 = X.AbstractC41071vF.A0Q(r0, r11)
            if (r0 != 0) goto Lb6
            X.C65 r10 = X.C65.BRAND
        L14:
            boolean r0 = r11.A58()
            r2 = 0
            if (r0 != 0) goto L23
            com.instagram.common.session.UserSession r15 = r8.A03
            boolean r0 = X.AbstractC41071vF.A0Q(r15, r11)
            if (r0 == 0) goto Lb3
        L23:
            com.instagram.common.session.UserSession r15 = r8.A03
            com.instagram.user.model.User r0 = r11.A2E(r15)
            if (r0 == 0) goto Lb3
            java.lang.String r7 = r0.getId()
        L2f:
            java.lang.String r6 = X.AbstractC41071vF.A07(r15, r11)
            r1 = r22
            r12 = r23
            if (r6 == 0) goto Lc6
            com.instagram.user.model.User r0 = r11.A2E(r15)
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto Lc0
            int r5 = r0.A01()
            r4 = 31
            X.GyJ r0 = r1.A06()
            X.5SE r9 = new X.5SE
            r9.<init>(r15, r11, r0)
            int r13 = r1.A03
            if (r5 != r4) goto L7a
            r14 = 0
            r8.A02(r9, r10, r11, r12, r13, r14)
            X.Iaw r13 = X.C41607Iaw.A00
            androidx.fragment.app.Fragment r0 = r8.A00
            androidx.fragment.app.FragmentActivity r14 = r0.requireActivity()
            X.1rF r0 = r11.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L6e
            java.lang.String r19 = r0.AZR()
            if (r19 != 0) goto L70
        L6e:
            java.lang.String r19 = ""
        L70:
            r16 = r11
            r17 = r1
            r18 = r2
            r13.A00(r14, r15, r16, r17, r18, r19)
        L79:
            return
        L7a:
            r14 = r24
            r8.A02(r9, r10, r11, r12, r13, r14)
            androidx.fragment.app.Fragment r0 = r8.A00
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L79
            X.6Yy r5 = new X.6Yy
            r5.<init>(r0, r15)
            r5.A08()
            java.lang.String r4 = r11.getId()
            if (r4 == 0) goto Lba
            int r3 = r1.getPosition()
            int r1 = r1.A03
            com.instagram.sponsored.analytics.SourceModelInfoParams r0 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r0.<init>()
            r0.A06 = r4
            r0.A02 = r3
            r0.A00 = r1
            r0.A08 = r7
            X.HD4 r0 = X.AbstractC86593tX.A0A(r0, r6, r14)
            r5.A0B(r2, r0)
            r5.A04()
            return
        Lb3:
            r7 = r2
            goto L2f
        Lb6:
            X.C65 r10 = X.C65.INFLUENCER
            goto L14
        Lba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        Lc6:
            X.GyJ r0 = r1.A06()
            X.5SE r9 = new X.5SE
            r9.<init>(r15, r11, r0)
            int r13 = r1.A03
            r14 = 0
            r8.A02(r9, r10, r11, r12, r13, r14)
            r8.A04(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75443aB.A06(X.1qM, X.3Zb, java.lang.String, boolean):void");
    }

    @Override // X.C37A
    public final InterfaceC690038m BDf() {
        return this.A0D.BDf();
    }

    @Override // X.InterfaceC75453aC
    public final void D4D() {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC27614CGk.A00(activity, this.A03);
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D4Y(C38321qM c38321qM, C75113Zb c75113Zb) {
        HashMap hashMap = new HashMap();
        hashMap.put("entrypoint", AbstractC111324zv.A00(3914));
        hashMap.put(AbstractC111324zv.A00(2745), "CLOSE");
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C66277U6x.A01("com.bloks.www.fxcal.settings.ads.basic_ads", hashMap).A05(activity, new IgBloksScreenConfig(this.A03));
        }
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuE(C38321qM c38321qM, String str, String str2) {
        return ViewOnTouchListenerC89503yq.A00;
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuF(C38321qM c38321qM, String str, String str2) {
        return ATV.A00;
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuM(C38321qM c38321qM, String str, String str2) {
        return ViewOnTouchListenerC77653dp.A00;
    }
}
