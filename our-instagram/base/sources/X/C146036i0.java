package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146036i0 implements InterfaceC145136gY, InterfaceC144756fv, InterfaceC146046i1 {
    public StoriesTemplateParticipationViewModel A00;
    public C150286pc A01;
    public C150286pc A02;
    public C148076ld A03;
    public boolean A04 = false;
    public C64972wv A05;
    public final Context A06;
    public final FragmentActivity A07;
    public final AbstractC59962oe A08;
    public final UserSession A09;
    public final C146136iC A0A;
    public final C149566o8 A0B;
    public final ReelViewerConfig A0C;
    public final C145826hf A0D;
    public final AbstractC149546o6 A0E;
    public final InterfaceC1118853a A0F;
    public final C145126gX A0G;
    public final String A0H;
    public final C146176iG A0I;
    public final InterfaceC60442pS A0J;
    public final C3G2 A0K;
    public final C146096i7 A0L;
    public final C146076i5 A0M;
    public final UpcomingEventReminderRepository A0N;

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DXv(String str) {
    }

    @Override // X.InterfaceC144826g2
    public final void Dcn(InterfaceC41201vU interfaceC41201vU, AlD alD) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DhB() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroyView() {
    }

    public C146036i0(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C145826hf c145826hf, AbstractC149546o6 abstractC149546o6, InterfaceC1118853a interfaceC1118853a, C145126gX c145126gX, String str) {
        this.A06 = context;
        this.A07 = fragmentActivity;
        this.A09 = userSession;
        this.A08 = abstractC59962oe;
        this.A0J = interfaceC60442pS;
        this.A0K = c3g2;
        this.A0D = c145826hf;
        this.A0F = interfaceC1118853a;
        this.A0C = reelViewerConfig;
        this.A0E = abstractC149546o6;
        this.A0G = c145126gX;
        this.A0H = str;
        this.A0B = new C149566o8(context, userSession);
        this.A0N = new UpcomingEventReminderRepository(userSession, interfaceC60442pS, abstractC59962oe.getModuleName());
        this.A0L = new C146096i7(context, null);
        this.A0M = new C146076i5(interfaceC60442pS, userSession, abstractC59962oe.getModuleName());
        this.A00 = (StoriesTemplateParticipationViewModel) new C52942bb(new C146116i9(userSession), fragmentActivity).A00(StoriesTemplateParticipationViewModel.class);
        if (C1XJ.A00 != null) {
            this.A05 = AbstractC64962wu.A00(context, fragmentActivity, null, userSession, interfaceC60442pS, null, null, null, null, null, null, c3g2.toString(), null, null, null, false, false);
        }
        this.A0A = new C146136iC(fragmentActivity, C22P.A47, userSession, new InterfaceC16820sZ() { // from class: X.6iB
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                ReelViewerFragment.A0I((ReelViewerFragment) C146036i0.this.A0F, false);
                return C0eB.A00;
            }
        }, new InterfaceC16820sZ() { // from class: X.6bO
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                List BlY;
                C146036i0 c146036i0 = C146036i0.this;
                InterfaceC1118853a interfaceC1118853a2 = c146036i0.A0F;
                C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a2).A0a;
                C41181vS AuU = interfaceC1118853a2.AuU();
                if (c41551w4 != null && AuU != null && (BlY = AuU.BlY(EnumC75383a5.A09)) != null) {
                    Object obj = BlY.get(0);
                    obj.getClass();
                    C102134ij c102134ij = ((C84823qW) obj).A0C;
                    if (c102134ij != null) {
                        c146036i0.A0E.A05(c146036i0.A06, c102134ij, c41551w4, new C49566LvL(c146036i0), "ig_stories_consumption_attribution_bottom_sheet", false, true);
                    }
                }
                return C0eB.A00;
            }
        });
        this.A0I = new C146176iG(fragmentActivity, userSession, new InterfaceC16820sZ() { // from class: X.6bP
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                ReelViewerFragment.A0I((ReelViewerFragment) C146036i0.this.A0F, false);
                return C0eB.A00;
            }
        });
        this.A00.A04.A06(this.A08, new InterfaceC58362lv() { // from class: X.6bQ
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C146036i0 c146036i0 = C146036i0.this;
                AbstractC142046bN abstractC142046bN = (AbstractC142046bN) obj;
                if (abstractC142046bN instanceof C143486dn) {
                    InterfaceC16820sZ interfaceC16820sZ = c146036i0.A0A.A0G;
                    if (interfaceC16820sZ != null) {
                        interfaceC16820sZ.invoke();
                    }
                } else if (abstractC142046bN instanceof C143496do) {
                    C143496do c143496do = (C143496do) abstractC142046bN;
                    c146036i0.A0A.A04(c143496do.A00, c143496do.A01, c143496do.A02, c143496do.A03);
                } else if (!(abstractC142046bN instanceof C143506dp)) {
                    return;
                } else {
                    c146036i0.A0A.A05(null, null);
                }
                c146036i0.A00.A05.Egh(C142036bM.A00);
            }
        });
    }

    public static int A00(C146036i0 c146036i0) {
        C41551w4 c41551w4 = ((ReelViewerFragment) c146036i0.A0F).A0a;
        if (c41551w4 != null) {
            return (int) c41551w4.A0H.A04;
        }
        return -1;
    }

    private String A01() {
        C38321qM c38321qM;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        if (interfaceC1118853a.AuU() != null && interfaceC1118853a.AuU().A0b != null) {
            if (interfaceC1118853a.AuU() != null) {
                c38321qM = interfaceC1118853a.AuU().A0b;
            } else {
                c38321qM = null;
            }
            return c38321qM.getId();
        }
        return null;
    }

    private void A02() {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (c41551w4 != null && AuU != null) {
            this.A0D.A07(c41551w4.A0H, AuU, "quick_captions", "", c41551w4.A01);
        }
    }

    public final void A03() {
        EditText editText;
        C150286pc c150286pc = this.A02;
        if (c150286pc != null) {
            ViewOnFocusChangeListenerC207579Gl viewOnFocusChangeListenerC207579Gl = (ViewOnFocusChangeListenerC207579Gl) c150286pc.get();
            if (viewOnFocusChangeListenerC207579Gl.A01 != null && (editText = viewOnFocusChangeListenerC207579Gl.A04) != null) {
                editText.setText("");
            }
        }
        C150286pc c150286pc2 = this.A01;
        if (c150286pc2 != null) {
            ViewOnFocusChangeListenerC207619Gp viewOnFocusChangeListenerC207619Gp = (ViewOnFocusChangeListenerC207619Gp) c150286pc2.get();
            if (viewOnFocusChangeListenerC207619Gp.A01 != null) {
                EditText editText2 = viewOnFocusChangeListenerC207619Gp.A05;
                if (editText2 == null) {
                    C14360o3.A0F("stickerAnswerView");
                    throw C00O.createAndThrow();
                }
                editText2.setText("");
            }
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC144816g1
    public final void CzU(UpcomingEvent upcomingEvent, String str, boolean z) {
        if (z) {
            this.A0M.A04(upcomingEvent, str, "upcoming_event_consumption_impression", "cta_story_sticker");
        }
    }

    @Override // X.InterfaceC97664a1
    public final void D0e(List list) {
        LHI.A01(this.A07, this.A09, list);
    }

    @Override // X.InterfaceC144776fx
    public final void D27() {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        ReelViewerFragment.A0I((ReelViewerFragment) interfaceC1118853a, false);
        A02();
    }

    @Override // X.InterfaceC144776fx
    public final void D29() {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.CMc();
        interfaceC1118853a.EJE("tapped");
        A02();
    }

    @Override // X.InterfaceC144776fx
    public final void D2C(C84823qW c84823qW, int i, int i2) {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.CMc();
        interfaceC1118853a.EJE("tapped");
        InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
        if (Av7 != null && Av7.BRC() != null) {
            int[] iArr = {0, 0};
            Av7.BRC().getLocationOnScreen(iArr);
            i -= iArr[0];
            i2 -= iArr[1];
        }
        C148536mO c148536mO = ((ReelViewerFragment) interfaceC1118853a).mReelInteractiveController;
        if (c148536mO != null) {
            c148536mO.A05(c84823qW, i, i2);
        }
    }

    @Override // X.InterfaceC144836g3
    public final void D2p(C38321qM c38321qM, InterfaceC144306fC interfaceC144306fC, C144296fB c144296fB, C84823qW c84823qW) {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.CMc();
        C24012Akq A0A = c84823qW.A0A();
        A0A.getClass();
        if (A0A.A07()) {
            UserSession userSession = this.A09;
            if (C18U.A06(C06090Tz.A05, userSession, 36329912881136200L)) {
                InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
                FragmentActivity fragmentActivity = this.A07;
                String A02 = A0A.A02();
                C66645URj c66645URj = A0A.A00;
                String str = c66645URj.A0L;
                StoryJoinChatStatus storyJoinChatStatus = c66645URj.A02;
                if (storyJoinChatStatus == null) {
                    storyJoinChatStatus = StoryJoinChatStatus.A07;
                }
                int A00 = A0A.A00();
                InterfaceC60442pS interfaceC60442pS = this.A0J;
                if (Av7 != null) {
                    roundedCornerFrameLayout = Av7.BRC();
                } else {
                    roundedCornerFrameLayout = null;
                }
                AbstractC34874FYj.A01(roundedCornerFrameLayout, fragmentActivity, storyJoinChatStatus, userSession, c38321qM, interfaceC60442pS, interfaceC144306fC, new IE9(interfaceC1118853a), A02, str, A00);
                C145826hf c145826hf = this.A0D;
                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
                C41551w4 c41551w4 = reelViewerFragment.A0a;
                c41551w4.getClass();
                Reel reel = c41551w4.A0H;
                C41181vS AuU = interfaceC1118853a.AuU();
                AuU.getClass();
                c145826hf.A07(reel, AuU, "chat", "join_chat_sticker_default_id", reelViewerFragment.A0a.A01);
            }
        }
        interfaceC1118853a.EJE("tapped");
        FragmentActivity fragmentActivity2 = this.A07;
        UserSession userSession2 = this.A09;
        String A2u = c38321qM.A2u();
        String A022 = A0A.A02();
        ChatStickerChannelType chatStickerChannelType = A0A.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.A07;
        }
        FAV.A00(fragmentActivity2, userSession2, c144296fB, A2u, A022, chatStickerChannelType.A00, new InterfaceC16820sZ() { // from class: X.B3I
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C146036i0.this.A0F.EJJ();
                return C0eB.A00;
            }
        }, A0A.A00(), false);
        C145826hf c145826hf2 = this.A0D;
        ReelViewerFragment reelViewerFragment2 = (ReelViewerFragment) interfaceC1118853a;
        C41551w4 c41551w42 = reelViewerFragment2.A0a;
        c41551w42.getClass();
        Reel reel2 = c41551w42.A0H;
        C41181vS AuU2 = interfaceC1118853a.AuU();
        AuU2.getClass();
        c145826hf2.A07(reel2, AuU2, "chat", "join_chat_sticker_default_id", reelViewerFragment2.A0a.A01);
    }

    @Override // X.InterfaceC144786fy
    public final void D7u(C41181vS c41181vS, AlC alC) {
        User A2E;
        Long A0k;
        String str;
        int i;
        Long A0k2;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.EJE("tapped");
        if (AbstractC141456aO.A03(alC)) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A09).A01.ARD();
            ARD.E77("has_ever_tapped_on_story_countdown", true);
            ARD.apply();
        }
        C38944HCt c38944HCt = new C38944HCt();
        if (c41181vS.CdW()) {
            C145826hf c145826hf = this.A0D;
            String str2 = alC.A00.A06;
            str2.getClass();
            InterfaceC60442pS interfaceC60442pS = this.A0J;
            String str3 = this.A0K.A00;
            C14360o3.A0B(str3, 3);
            if (c41181vS.CY4()) {
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    C37948Gmq c37948Gmq = (C37948Gmq) c145826hf.A0I.get(c41181vS.CGe());
                    if (c37948Gmq != null) {
                        UserSession userSession = c145826hf.A06;
                        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
                        C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "instagram_ad_countdown_attempt"), 283);
                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled() && (A2E = c38321qM.A2E(userSession)) != null && (A0k = AbstractC003100w.A0k(10, A2E.getId())) != null) {
                            c25531Mh.A0Q("a_pk", A0k);
                            String id = c38321qM.getId();
                            if (id != null) {
                                c25531Mh.A0l(id);
                                User A2E2 = c38321qM.A2E(userSession);
                                String str4 = "";
                                if (A2E2 == null || (str = A2E2.B7L().name()) == null) {
                                    str = "";
                                }
                                c25531Mh.A0R("follow_status", str);
                                c25531Mh.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                                long j = 0;
                                c25531Mh.A0Q("m_ts", 0L);
                                c25531Mh.A0R("source_of_action", str3);
                                String A33 = c38321qM.A33();
                                if (A33 != null) {
                                    str4 = A33;
                                }
                                c25531Mh.A0R("tracking_token", str4);
                                String A0V = c41181vS.A0V(userSession);
                                if (A0V != null && (A0k2 = AbstractC003100w.A0k(10, A0V)) != null) {
                                    j = A0k2.longValue();
                                }
                                c25531Mh.A0Q("ad_id", Long.valueOf(j));
                                String id2 = c37948Gmq.A02.getId();
                                C14360o3.A07(id2);
                                c25531Mh.A0R("reel_id", id2);
                                c25531Mh.A0Q("reel_size", Long.valueOf(r12.A0O(c37948Gmq.A01).size()));
                                c25531Mh.A0Q("session_reel_counter", Long.valueOf(c37948Gmq.A00));
                                c25531Mh.A0R("tray_session_id", c145826hf.A0H);
                                c25531Mh.A0R("viewer_session_id", c145826hf.A0E.getSessionId());
                                c25531Mh.A0R("reel_type", null);
                                c25531Mh.A0P("time_elapsed", null);
                                c25531Mh.A0R("from", str3);
                                C41551w4 c41551w4 = c37948Gmq.A04;
                                if (c41551w4.A0L) {
                                    i = 0;
                                } else {
                                    i = c41551w4.A00;
                                }
                                c25531Mh.A0Q("reel_start_position", Long.valueOf(i));
                                c25531Mh.A0Q("reel_viewer_position", Long.valueOf(c37948Gmq.A05.A0I));
                                c25531Mh.A0Q("ad_position_from_server", null);
                                c25531Mh.A0R("story_ranking_token", c145826hf.A0G);
                                c25531Mh.A0j("countdown_attempt");
                                c25531Mh.A0P("elapsed_time_since_last_item", null);
                                c25531Mh.A0O("production_build", null);
                                c25531Mh.A0R("countdown_id", str2);
                                c25531Mh.A0Q("sticker_id", null);
                                c25531Mh.Cht();
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        c38944HCt.A02 = new IGA(alC, this);
        Bundle bundle = new Bundle();
        try {
            URL url = alC.A00;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC69879Vx4.A00(A0A, url, true);
            A0A.close();
            bundle.putString("countdown_sticker_model_json", stringWriter.toString());
            UserSession userSession2 = this.A09;
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.token);
            User user = c41181vS.A0i;
            user.getClass();
            bundle.putString("countdown_sticker_story_creator_user_id", user.getId());
            C38321qM c38321qM2 = c41181vS.A0b;
            if (c38321qM2 != null) {
                bundle.putString("story_media_id", c38321qM2.A2u());
                bundle.putBoolean("is_story_sponsored", c38321qM2.CdW());
            }
            c38944HCt.setArguments(bundle);
            C189448aO c189448aO = new C189448aO(userSession2);
            c189448aO.A0a = false;
            c189448aO.A0T = c38944HCt;
            c189448aO.A0X = new AbstractC86353t7() { // from class: X.9pv
                @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                public final void DB6() {
                    C146036i0.this.A0F.EJJ();
                }
            };
            c189448aO.A00().A02(this.A07, c38944HCt);
        } catch (IOException unused) {
            ReelViewerFragment.A0I((ReelViewerFragment) interfaceC1118853a, false);
            C0w9.A03("ReelViewerInteractiveController", "Could not json serialize CountdownStickerModel for the countdown consumption sheet.");
        }
    }

    @Override // X.InterfaceC144916gB
    public final void DIm(C41181vS c41181vS, AlB alB, C144186f0 c144186f0) {
        UserSession userSession = this.A09;
        AbstractC59962oe abstractC59962oe = this.A08;
        C189138Ze c189138Ze = alB.A00;
        String str = c189138Ze.A08;
        C18920wW A01 = AbstractC12220kQ.A01(abstractC59962oe, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_cg_click_sticker");
        A00.A9K("sticker_id", Long.valueOf(Long.parseLong(str)));
        A00.Cht();
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.EJE("tapped");
        V00 v00 = new V00();
        v00.A06 = new C42783IwL(c144186f0, this);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putSerializable("fundraiser_entrypoint", EnumC68135VCu.STICKER);
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AEH.A00(A0A, c189138Ze, true);
            A0A.close();
            bundle.putString("fundraiser_sticker_model_json", stringWriter.toString());
            v00.setArguments(bundle);
            User user = c189138Ze.A02;
            user.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(user.getUsername());
            if (user.isVerified()) {
                C85963sQ.A08(this.A06, spannableStringBuilder, true);
            }
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0a = false;
            c189448aO.A0d = spannableStringBuilder;
            c189448aO.A0X = new C39391Hab(this);
            c189448aO.A00().A02(this.A07, v00);
        } catch (IOException unused) {
            ReelViewerFragment.A0I((ReelViewerFragment) interfaceC1118853a, false);
            C0w9.A03("ReelViewerInteractiveController", "Could not json serialize FundraiserStickerModel for the fundraiser consumption sheet.");
        }
    }

    @Override // X.InterfaceC144846g4
    public final void DJm(C217859kI c217859kI) {
        A2D.A00(this.A07, C22P.A30, this.A09, c217859kI);
    }

    @Override // X.InterfaceC144856g5
    public final void DJo(C41181vS c41181vS, C217859kI c217859kI) {
        C145826hf c145826hf = this.A0D;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        C41551w4 c41551w4 = reelViewerFragment.A0a;
        c41551w4.getClass();
        Reel reel = c41551w4.A0H;
        C41181vS AuU = interfaceC1118853a.AuU();
        AuU.getClass();
        c145826hf.A07(reel, AuU, "group_mention", c217859kI.A04, reelViewerFragment.A0a.A01);
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.CMc();
        interfaceC1118853a.EJE("tapped");
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A09;
        C14360o3.A0B(userSession, 2);
        AbstractC33579Esr.A00 = false;
        List list = c217859kI.A05;
        boolean contains = list.contains(C08730cb.A00(userSession).A00());
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putParcelable("group_mention_sticker_model", c217859kI.A00());
        bundle.putString("group_mention_base_reel_id", c41181vS.A0k);
        bundle.putString("group_mention_base_reel_item_id", c41181vS.A0j);
        bundle.putParcelable("group_mention_base_reel_owner", c41181vS.A0i);
        EMP emp = new EMP();
        emp.setArguments(bundle);
        C189448aO c189448aO = new C189448aO(userSession);
        String str = c217859kI.A00.A03;
        if (str == null || str.length() == 0) {
            str = fragmentActivity.getString(2131963340);
        }
        c189448aO.A0d = str;
        if (contains) {
            c189448aO.A0g = fragmentActivity.getString(2131963355);
            c189448aO.A0K = new ARF(emp);
        }
        c189448aO.A0w = true;
        if (C18U.A06(C06090Tz.A05, userSession, 36317427411522717L) && list.size() > 2 && contains) {
            C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
            c189458aP.A02 = R.drawable.instagram_more_vertical_pano_outline_24;
            c189458aP.A0A = true;
            c189458aP.A05 = new ViewOnClickListenerC35530FmL(fragmentActivity);
            c189448aO.A07(c189458aP.A00());
        }
        c189448aO.A0U = new GH1(fragmentActivity, userSession, interfaceC1118853a, emp, c217859kI);
        C189478aR A00 = c189448aO.A00();
        A00.A0Q(false);
        A00.A02(fragmentActivity, emp);
    }

    @Override // X.InterfaceC97664a1
    public final void DLj(PromptStickerModel promptStickerModel) {
        Integer num;
        C38321qM c38321qM;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJE("tapped");
        UserSession userSession = this.A09;
        String str = null;
        OUO.A00(new OUO(this.A08, userSession, promptStickerModel, A01(), this.A0H, this.A0D.A0E.getSessionId()), "memu_cta_click", null);
        C42400Iq1 c42400Iq1 = new C42400Iq1(this);
        FragmentActivity fragmentActivity = this.A07;
        if (promptStickerModel.A0I()) {
            num = C05F.A0Y;
        } else {
            num = C05F.A1I;
        }
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && (c38321qM = AuU.A0b) != null) {
            str = c38321qM.getId();
        }
        LHI.A02(fragmentActivity, userSession, c42400Iq1, promptStickerModel, num, str, new InterfaceC16820sZ() { // from class: X.B3L
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C146036i0.this.A0F.EJJ();
                return C0eB.A00;
            }
        }, false);
    }

    @Override // X.InterfaceC97664a1
    public final void DLk(PromptStickerModel promptStickerModel) {
        String str;
        String Bid;
        C38321qM c38321qM;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJE("tapped");
        UserSession userSession = this.A09;
        AbstractC59962oe abstractC59962oe = this.A08;
        String A01 = A01();
        String str2 = this.A0H;
        C145826hf c145826hf = this.A0D;
        String str3 = null;
        OUO.A00(new OUO(abstractC59962oe, userSession, promptStickerModel, A01, str2, c145826hf.A0E.getSessionId()), "imagine_cta_click", null);
        FragmentActivity fragmentActivity = this.A07;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && (c38321qM = AuU.A0b) != null) {
            str3 = c38321qM.getId();
        }
        C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.B3K
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C146036i0.this.A0F.EJJ();
                return C0eB.A00;
            }
        };
        C14360o3.A0B(userSession, 1);
        C42401Iq2 c42401Iq2 = new C42401Iq2(c41551w4, c145826hf);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        if (C6PX.A00(context)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36327172694358401L) && C47966LHm.A00(userSession, C9H2.A02)) {
                GenAIToolInfoDictIntf B9Z = promptStickerModel.A00.B9Z();
                if (B9Z != null && (Bid = B9Z.Bid()) != null) {
                    str = AbstractC001900j.A0B(AbstractC001900j.A0F("Imagine", Bid)).toString();
                } else {
                    str = null;
                }
                C57527Pg1 c57527Pg1 = new C57527Pg1(interfaceC16820sZ, 34);
                EnumC27378C6h enumC27378C6h = EnumC27378C6h.A04;
                Integer num = C05F.A15;
                String obj = UUID.randomUUID().toString();
                C14360o3.A07(obj);
                if (!C18U.A06(c06090Tz, userSession, 36327172695013770L)) {
                    str = null;
                }
                LBW.A00(fragmentActivity, userSession, enumC27378C6h, null, num, obj, str, null, MF3.A00, MF4.A00, c57527Pg1, null, false, false);
                return;
            }
        }
        CYA.A00(fragmentActivity, userSession, c42401Iq2, promptStickerModel, str3);
    }

    @Override // X.InterfaceC144796fz
    public final void DTK(C38321qM c38321qM, InterfaceC144306fC interfaceC144306fC, C84823qW c84823qW) {
        C66645URj c66645URj;
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
        interfaceC1118853a.EJE("tapped");
        C8F9 c8f9 = c84823qW.A14;
        if (c8f9 != null && (c66645URj = c8f9.A0E) != null) {
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A09;
            String str = c66645URj.A0K;
            str.getClass();
            C66645URj c66645URj2 = c8f9.A0E;
            String str2 = c66645URj2.A0L;
            StoryJoinChatStatus storyJoinChatStatus = c66645URj2.A02;
            int A00 = c8f9.A00();
            InterfaceC60442pS interfaceC60442pS = this.A0J;
            if (Av7 != null) {
                roundedCornerFrameLayout = Av7.BRC();
            } else {
                roundedCornerFrameLayout = null;
            }
            AbstractC34874FYj.A01(roundedCornerFrameLayout, fragmentActivity, storyJoinChatStatus, userSession, c38321qM, interfaceC60442pS, interfaceC144306fC, new IE9(interfaceC1118853a), str, str2, A00);
        }
    }

    @Override // X.InterfaceC144806g0
    public final void DUQ(MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel) {
        this.A0F.EJE("launching_music_pick_template");
        this.A0I.A01(C22P.A3Y, musicPickReelTag, musicPickStickerModel);
    }

    @Override // X.InterfaceC144806g0
    public final void DUR(C41181vS c41181vS, MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel, String str) {
        FragmentActivity fragmentActivity = this.A07;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        UserSession userSession = this.A09;
        C14360o3.A0B(userSession, 2);
        interfaceC1118853a.EJE("single_tap_paused");
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_music_pick_model", musicPickStickerModel);
        bundle.putParcelable("arg_music_pick_reel_tag", musicPickReelTag);
        N7L n7l = new N7L();
        n7l.setArguments(bundle);
        n7l.A02 = c41181vS;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0d = fragmentActivity.getString(2131968003);
        c189448aO.A0T = n7l;
        c189448aO.A0U = new C24109Amu(interfaceC1118853a);
        c189448aO.A1C = true;
        c189448aO.A0g = fragmentActivity.getString(2131968002);
        c189448aO.A0K = new ViewOnClickListenerC55377Oin(fragmentActivity, n7l);
        C189478aR A00 = c189448aO.A00();
        A00.A0Q(true);
        A00.A02(fragmentActivity, n7l);
        C145826hf c145826hf = this.A0D;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        C41551w4 c41551w4 = reelViewerFragment.A0a;
        c41551w4.getClass();
        Reel reel = c41551w4.A0H;
        C41181vS AuU = interfaceC1118853a.AuU();
        AuU.getClass();
        c145826hf.A07(reel, AuU, "music_pick", str, reelViewerFragment.A0a.A01);
    }

    @Override // X.InterfaceC144906gA
    public final void DYh(String str) {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJE("tapped");
        UserSession userSession = this.A09;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = true;
        c189448aO.A03 = 0.7f;
        c189448aO.A0U = new C24111Amw(this);
        C189478aR A00 = c189448aO.A00();
        if (interfaceC1118853a.AuU() != null && interfaceC1118853a.AuU().A0i != null) {
            String username = interfaceC1118853a.AuU().A0i.getUsername();
            FragmentActivity fragmentActivity = this.A07;
            L2B l2b = new L2B(A00, this, str);
            C14360o3.A0B(userSession, 0);
            KDA kda = new KDA();
            Bundle bundle = new Bundle();
            bundle.putString("ReelPicsPleaseMediaSelectionFragment_storyAuthorUsername", username);
            AbstractC60492pY.A04(bundle, userSession);
            kda.setArguments(bundle);
            kda.A02 = l2b;
            A00.A02(fragmentActivity, kda);
        }
    }

    @Override // X.InterfaceC144926gC
    public final void DZT(InterfaceC41201vU interfaceC41201vU, C144506fW c144506fW) {
        final InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJE("animation");
        InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
        if (Av7 instanceof C143556du) {
            ((C143556du) Av7).A1m.A00(true);
        }
        c144506fW.A00(interfaceC41201vU.BQN(), this.A0J, new InterfaceC30951Dj8() { // from class: X.Cww
            @Override // X.InterfaceC30951Dj8
            public final void CwT() {
                InterfaceC1118853a.this.EJJ();
            }
        }, true);
    }

    @Override // X.InterfaceC97544Zo
    public final void DZX() {
        ((ReelViewerFragment) this.A0F).A3H.A0C();
    }

    @Override // X.InterfaceC97544Zo
    public final void DZY(InterfaceC41201vU interfaceC41201vU, C101394gx c101394gx, InterfaceC97554Zq interfaceC97554Zq, String str, String str2, float f, int i) {
        String str3;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
        if (c41551w4 != null && c41551w4.A0D) {
            return;
        }
        str.getClass();
        str2.getClass();
        boolean equals = Boolean.TRUE.equals(c101394gx.A04);
        UserSession userSession = this.A09;
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        if (equals) {
            str3 = "has_ever_voted_on_story_poll_v2";
        } else {
            str3 = "has_ever_voted_on_story_poll";
        }
        ARD.E77(str3, true);
        ARD.apply();
        interfaceC1118853a.EJE("tapped");
        AbstractC140306Wi.A01(this.A06, userSession, c101394gx, null, Integer.valueOf(i), str, this.A08.getModuleName(), str2, this.A0H, A00(this), false);
        interfaceC97554Zq.EoG(userSession, new Runnable() { // from class: X.M2h
            @Override // java.lang.Runnable
            public final void run() {
                C146036i0 c146036i0 = C146036i0.this;
                c146036i0.A0G.A01(true, true);
                c146036i0.A0F.EJJ();
            }
        });
        if (interfaceC41201vU == null || !interfaceC41201vU.CdW()) {
            return;
        }
        C145826hf c145826hf = this.A0D;
        String A00 = AbstractC37865GlK.A00(c101394gx);
        String valueOf = String.valueOf(i);
        C145836hg A002 = C145826hf.A00(interfaceC41201vU, c145826hf);
        UserSession userSession2 = c145826hf.A06;
        C82713mZ A003 = AbstractC37955Gmx.A00(userSession2, interfaceC41201vU, A002, "interact");
        A003.A6k = A00;
        A003.A6m = "poll";
        A003.A6l = valueOf;
        A003.A04 = f;
        C145826hf.A04(A003, (C37948Gmq) c145826hf.A0I.get(interfaceC41201vU.CGe()), c145826hf);
        C32U.A0H(userSession2, A003, c145826hf.A0A);
    }

    @Override // X.InterfaceC97664a1
    public final void DcA(PromptStickerModel promptStickerModel) {
        String str;
        CameraTool cameraTool;
        C22P c22p;
        UserSession userSession = this.A09;
        OUO ouo = new OUO(this.A08, userSession, promptStickerModel, A01(), this.A0H, this.A0D.A0E.getSessionId());
        int ordinal = promptStickerModel.A03().ordinal();
        if (ordinal != 9) {
            if (ordinal != 8) {
                if (ordinal != 7) {
                    str = "";
                } else {
                    str = "magicmod_backdrop_cta_click";
                }
            } else {
                str = "magicmod_wand_cta_click";
            }
        } else {
            str = "magicmod_restyle_cta_click";
        }
        OUO.A00(ouo, str, null);
        this.A0F.EJE("tapped");
        FragmentActivity fragmentActivity = this.A07;
        String A01 = A01();
        C14360o3.A0B(userSession, 1);
        int ordinal2 = promptStickerModel.A03().ordinal();
        if (ordinal2 != 7 && ordinal2 != 6) {
            if (ordinal2 == 9) {
                cameraTool = CameraTool.A26;
            } else {
                return;
            }
        } else {
            cameraTool = CameraTool.A0L;
        }
        int ordinal3 = promptStickerModel.A03().ordinal();
        if (ordinal3 != 7) {
            if (ordinal3 != 6) {
                if (ordinal3 != 9) {
                    return;
                }
            } else {
                c22p = C22P.A0H;
                C28196Cbq c28196Cbq = C28196Cbq.A00;
                String text = promptStickerModel.A00.getText();
                PromptStickerModel A04 = promptStickerModel.A04();
                A04.A08(C08730cb.A00(userSession).A00());
                c28196Cbq.A00(fragmentActivity, c22p, cameraTool, userSession, A04, A01, text);
            }
        }
        c22p = C22P.A4j;
        C28196Cbq c28196Cbq2 = C28196Cbq.A00;
        String text2 = promptStickerModel.A00.getText();
        PromptStickerModel A042 = promptStickerModel.A04();
        A042.A08(C08730cb.A00(userSession).A00());
        c28196Cbq2.A00(fragmentActivity, c22p, cameraTool, userSession, A042, A01, text2);
    }

    @Override // X.InterfaceC97664a1
    public final void DcG(C38321qM c38321qM, PromptStickerModel promptStickerModel) {
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A09;
        C22P c22p = C22P.A47;
        C14360o3.A0B(userSession, 1);
        LHI.A00(fragmentActivity, c22p, userSession, promptStickerModel);
        OUO.A00(new OUO(this.A08, userSession, promptStickerModel, A01(), this.A0H, this.A0D.A0E.getSessionId()), "cta_tap", null);
    }

    @Override // X.InterfaceC97664a1
    public final void DcH(C8JW c8jw, C38321qM c38321qM, PromptStickerModel promptStickerModel, C8FC c8fc, List list) {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.CMc();
        interfaceC1118853a.EJE("tapped");
        FragmentActivity fragmentActivity = this.A07;
        AbstractC59962oe abstractC59962oe = this.A08;
        UserSession userSession = this.A09;
        String A01 = A01();
        String str = this.A0H;
        C145826hf c145826hf = this.A0D;
        AbstractC54892OPn.A00(fragmentActivity, C22P.A47, abstractC59962oe, userSession, interfaceC1118853a.AuU(), c145826hf, this.A0E, interfaceC1118853a, promptStickerModel, c8fc, A01, str, c145826hf.A0E.getSessionId(), list);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0397  */
    @Override // X.InterfaceC144826g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dcm(X.InterfaceC41201vU r18, X.AlD r19, X.JFZ r20) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146036i0.Dcm(X.1vU, X.AlD, X.JFZ):void");
    }

    @Override // X.InterfaceC144896g9
    public final void Dd4(C84823qW c84823qW) {
        C38321qM c38321qM;
        String A01;
        C106074qN c106074qN = c84823qW.A17;
        c106074qN.getClass();
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        if (interfaceC1118853a.AuU() != null) {
            c38321qM = interfaceC1118853a.AuU().A0b;
            if (c38321qM != null && c38321qM.A0C.CDj() != null && C2TN.A05(this.A09, c38321qM.A0C.CDj().getId())) {
                return;
            }
        } else {
            c38321qM = null;
        }
        if (this.A03 != null) {
            interfaceC1118853a.EJE("animation");
            this.A03.A02(new MPI() { // from class: X.LwZ
                @Override // X.MPI
                public final void Dd0() {
                    C146036i0.this.A0F.EJJ();
                }
            }, c106074qN.A00);
        }
        if (!c106074qN.A01 && (A01 = A01()) != null && c38321qM != null) {
            AbstractC59962oe abstractC59962oe = this.A08;
            UserSession userSession = this.A09;
            String moduleName = abstractC59962oe.getModuleName();
            String A00 = AbstractC86623ta.A00(c38321qM.A2P());
            int A002 = A00(this);
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            c25621Ms.A0B("story_interactions/reaction_sticker/react/");
            c25621Ms.A9s("media_id", A01);
            c25621Ms.A9s("container_module", moduleName);
            c25621Ms.A9s("delivery_class", A00);
            c25621Ms.A0D("tray_position", A002);
            c25621Ms.A0S(C40781ul.class, C55702hA.class);
            c25621Ms.A0R = true;
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C39023HFz(c84823qW, c106074qN, this);
            abstractC59962oe.schedule(A0N);
        }
        c84823qW.A17 = new C106074qN(c106074qN.A00, true);
    }

    @Override // X.InterfaceC144766fw
    public final void Djf() {
        this.A0F.E63(false);
    }

    @Override // X.InterfaceC144766fw
    public final void Djg(InterfaceC41201vU interfaceC41201vU) {
        String str;
        Long A0k;
        String str2;
        C41551w4 Aun;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A0F;
        C41181vS AuU = reelViewerFragment.AuU();
        if (AuU != null && (str2 = AuU.A0j) != null && (Aun = reelViewerFragment.Aun(str2)) != null) {
            reelViewerFragment.A3H.E2Z(AuU, Aun, C05F.A0C, false);
        }
        C38321qM BQN = interfaceC41201vU.BQN();
        if (BQN != null) {
            UserSession userSession = this.A09;
            InterfaceC60442pS interfaceC60442pS = this.A0J;
            C14360o3.A0B(userSession, 0);
            C25531Mh A0I = C25531Mh.A0I(AbstractC12220kQ.A01(interfaceC60442pS, userSession));
            User A2E = BQN.A2E(userSession);
            long j = 0;
            if (A2E != null && (A0k = AbstractC003100w.A0k(10, A2E.getId())) != null) {
                j = A0k.longValue();
            }
            A0I.A0Q("a_pk", Long.valueOf(j));
            User A2E2 = BQN.A2E(userSession);
            if (A2E2 == null || (str = A2E2.B7L().name()) == null) {
                str = "";
            }
            A0I.A0R("follow_status", str);
            A0I.A0R("is_coming_from", "");
            A0I.A0O("is_context_sheet", false);
            String id = BQN.getId();
            if (id != null) {
                A0I.A0l(id);
                A0I.A0Q("m_t", Long.valueOf(BQN.BRp().A00));
                A0I.A0R("pigeon_reserved_keyword_module", "");
                A0I.A0Q("post_id", 0L);
                A0I.A0R("reel_id", "");
                A0I.A0Q("reel_position", 0L);
                A0I.A0Q("reel_size", 0L);
                A0I.A0R("reel_type", "");
                A0I.A0Q("session_reel_counter", 0L);
                A0I.A0R("source_of_action", interfaceC60442pS.getModuleName());
                A0I.A0R("sticker_id", "secret_sticker_bundle_id");
                A0I.A0R("sticker_type", "secret_stories");
                A0I.A0R("story_ranking_token", "");
                Double valueOf = Double.valueOf(0.0d);
                A0I.A0P("time_elapsed", valueOf);
                A0I.A0P("time_remaining", valueOf);
                A0I.A0Q("tray_pos_excl_own_story", 0L);
                A0I.A0Q("tray_position", 0L);
                A0I.A0R("tray_session_id", "");
                A0I.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
                A0I.A0R("viewer_session_id", "");
                A0I.Cht();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC144766fw
    public final void Djh() {
        this.A0F.Csv(false);
    }

    @Override // X.InterfaceC144766fw
    public final void Dji() {
        ReelViewerFragment.A0I((ReelViewerFragment) this.A0F, false);
    }

    @Override // X.InterfaceC144766fw
    public final void Djj() {
        this.A0F.EJE("tapped");
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn0(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, boolean z) {
        if (z) {
            C145126gX c145126gX = this.A0G;
            C38Z c38z = c145126gX.A03;
            if (c38z != null) {
                if (c145126gX.A00 == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                viewOnTouchListenerC97504Zk.A06.post(new RunnableC71513WvI(viewOnTouchListenerC97504Zk, c38z));
                return;
            }
            return;
        }
        ReelViewerFragment.A0I((ReelViewerFragment) this.A0F, false);
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn1() {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.EJE("tapped");
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn2(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, C41160IJz c41160IJz) {
        AbstractC140316Wj.A01(this.A09, this.A08, c41160IJz);
        C145126gX c145126gX = this.A0G;
        C38Z c38z = c145126gX.A03;
        if (c38z != null) {
            if (c145126gX.A00 == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            viewOnTouchListenerC97504Zk.A06.post(new RunnableC71513WvI(viewOnTouchListenerC97504Zk, c38z));
        }
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn3() {
        this.A0F.EJE("tapped");
    }

    @Override // X.InterfaceC144886g8
    public final void Dn8(C41181vS c41181vS, C41629IbK c41629IbK) {
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.EJE("tapped");
        UserSession userSession = this.A09;
        User A00 = c41629IbK.A00();
        C18C.A07(A00, "in story viewer, the user object from server should not be null");
        boolean A05 = C2TN.A05(userSession, A00.getId());
        Integer A01 = c41629IbK.A01();
        A01.getClass();
        InterfaceC60442pS interfaceC60442pS = this.A0J;
        String str = c41181vS.A0j;
        String str2 = c41629IbK.A00.A0A;
        String id = c41629IbK.A00().getId();
        SMBSupportStickerDict sMBSupportStickerDict = c41629IbK.A00;
        String str3 = sMBSupportStickerDict.A09;
        String str4 = sMBSupportStickerDict.A06;
        C14360o3.A0B(userSession, 0);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "instagram_smb_partner_flow_consumer");
        A002.A9K("igid", Long.valueOf(AMW.A00(userSession)));
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "story_support_sticker");
        A002.AAP("action", "tap");
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        A002.AAP(AbstractC37316GcI.A00(0, 10, 12), obj);
        A002.A7v("is_profile_owner", Boolean.valueOf(A05));
        A002.A9K("profile_owner_id", Long.valueOf(AMW.A01(id)));
        A002.AAP("partner_name", str3);
        A002.AAP("url", str4);
        A002.AAP("service_type", AbstractC40773I5b.A00(A01));
        A002.AAP("sticker_id", str2);
        A002.AAP("reel_item_id", str);
        A002.Cht();
        if (A01.equals(C05F.A0C)) {
            AnonymousClass001.A0R("ReelViewerInteractiveController", ".BACK_STACK");
            C35226FgJ.A01(this.A07, userSession, EnumC53251Ngp.A06, c41629IbK.A00());
            return;
        }
        if (A05) {
            if (c41629IbK.A01().equals(C05F.A01)) {
                FragmentActivity fragmentActivity = this.A07;
                str4.getClass();
                if (AbstractC1566171j.A04(fragmentActivity, null, SMBPartnerType.A06, str4)) {
                    AMW.A04(interfaceC60442pS, userSession, c41629IbK.A01(), str, str2, c41629IbK.A00().getId(), str3, str4);
                    return;
                }
            }
            FragmentActivity fragmentActivity2 = this.A07;
            str4.getClass();
            C63397SjR c63397SjR = new C63397SjR(fragmentActivity2, userSession, C2Fb.A3W, str4);
            c63397SjR.A0S = this.A08.getModuleName();
            c63397SjR.A0A();
            return;
        }
        C38940HCp c38940HCp = new C38940HCp();
        c38940HCp.A01 = c41181vS;
        c38940HCp.A02 = c41629IbK;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = false;
        c189448aO.A0T = c38940HCp;
        c38940HCp.A00 = c189448aO.A00().A02(this.A07, c38940HCp);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r2.A00 != null) goto L33;
     */
    @Override // X.InterfaceC144786fy, X.InterfaceC144866g6, X.InterfaceC144876g7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dok(android.view.View r5, X.C41181vS r6, X.C84823qW r7) {
        /*
            r4 = this;
            X.6o8 r3 = r4.A0B
            com.instagram.common.session.UserSession r2 = r4.A09
            r0 = 2
            X.C14360o3.A0B(r2, r0)
            X.3a5 r0 = r7.A12
            int r1 = r0.ordinal()
            r0 = 8
            if (r1 == r0) goto L85
            r0 = 14
            if (r1 != r0) goto L50
            java.util.List r1 = r6.A0c()
            X.3a5 r0 = X.EnumC75383a5.A0b
            X.3qW r0 = X.AbstractC120715dH.A00(r0, r1)
            if (r0 != 0) goto L80
            r1 = 0
        L23:
            X.ABF r0 = X.AbstractC22743A1n.A00(r2)
            boolean r0 = r0.A00(r1)
        L2b:
            if (r0 == 0) goto L50
            r0 = 0
            X.3a5 r1 = r7.A12
            int r2 = r1.ordinal()
            r1 = 30
            if (r2 == r1) goto L51
            r1 = 37
            if (r2 != r1) goto L49
            X.H7m r0 = r7.A0p
            if (r0 == 0) goto L48
            com.instagram.model.shopping.drops.DropsLaunchAnimation r2 = r0.A01
            if (r2 == 0) goto L48
            java.lang.Boolean r0 = r2.A00
            if (r0 != 0) goto L74
        L48:
            r0 = 0
        L49:
            r2 = 1
            r1 = r0 ^ 1
            r0 = 0
            r3.A04(r0, r5, r2, r1)
        L50:
            return
        L51:
            com.instagram.model.shopping.reels.ProductSticker r0 = r7.A0r
            if (r0 == 0) goto L48
            com.instagram.model.shopping.drops.DropsLaunchAnimation r2 = r0.A02
            r1 = r2
            if (r2 != 0) goto L64
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.instagram.model.shopping.drops.DropsLaunchAnimation r1 = new com.instagram.model.shopping.drops.DropsLaunchAnimation
            r1.<init>(r0)
        L64:
            java.lang.Boolean r0 = r1.A00
            if (r0 == 0) goto L48
            if (r2 != 0) goto L74
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.instagram.model.shopping.drops.DropsLaunchAnimation r2 = new com.instagram.model.shopping.drops.DropsLaunchAnimation
            r2.<init>(r0)
        L74:
            java.lang.Boolean r0 = r2.A00
            X.C14360o3.A0A(r0)
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            goto L49
        L80:
            X.AlB r1 = r0.A0B()
            goto L23
        L85:
            X.AlC r0 = X.AbstractC141456aO.A00(r6)
            boolean r0 = X.AbstractC141456aO.A01(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146036i0.Dok(android.view.View, X.1vS, X.3qW):void");
    }

    @Override // X.InterfaceC97664a1
    public final void DpF(final CreativeConfigIntf creativeConfigIntf, final PromptStickerModel promptStickerModel, final C8FC c8fc) {
        UserSession userSession = this.A09;
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("stories_template_add_yours_clicked", true);
        ARD.apply();
        this.A0F.EJE("launching_stories_template");
        if (promptStickerModel.A00.BbZ() != null) {
            AbstractC54892OPn.A01(this.A07, userSession, promptStickerModel, new InterfaceC16820sZ() { // from class: X.M9A
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C146036i0 c146036i0 = this;
                    PromptStickerModel promptStickerModel2 = promptStickerModel;
                    C8FC c8fc2 = c8fc;
                    c146036i0.A00.A01(creativeConfigIntf, promptStickerModel2, c8fc2, false);
                    return C0eB.A00;
                }
            }, new InterfaceC16820sZ() { // from class: X.B3J
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C146036i0.this.A0F.EJJ();
                    return C0eB.A00;
                }
            });
        } else {
            this.A00.A01(creativeConfigIntf, promptStickerModel, c8fc, false);
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final boolean DsD() {
        C41181vS AuU;
        C38321qM c38321qM;
        InterfaceC1118853a interfaceC1118853a = this.A0F;
        InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
        if ((Av7 instanceof C143556du) && ((C143556du) Av7).A17.A04 && (AuU = interfaceC1118853a.AuU()) != null && (c38321qM = AuU.A0b) != null) {
            AbstractC25651Mw.A00(this.A09).E4s(new C72243Lx(c38321qM, true));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC144816g1
    public final void Dww(IJ3 ij3, UpcomingEvent upcomingEvent, String str) {
        C43036J1c c43036J1c = new C43036J1c(ij3, this);
        this.A0F.EJE("tapped");
        AbstractC22762A2g.A00();
        Context context = this.A06;
        UserSession userSession = this.A09;
        InterfaceC60442pS interfaceC60442pS = this.A0J;
        String moduleName = this.A08.getModuleName();
        C24112Amx c24112Amx = new C24112Amx(this);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(moduleName, 4);
        C28341Yv.A00(context, userSession, interfaceC60442pS, c24112Amx, c43036J1c, upcomingEvent, str, moduleName, "story_sticker_bottom_sheet", true, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0.A5n() != false) goto L6;
     */
    @Override // X.InterfaceC145136gY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8t(X.C41181vS r3, X.C41551w4 r4, X.InterfaceC143576dw r5, X.C141596ac r6) {
        /*
            r2 = this;
            boolean r0 = r3.CY4()
            if (r0 == 0) goto L11
            X.1qM r0 = r3.A0b
            r0.getClass()
            boolean r0 = r0.A5n()
            if (r0 == 0) goto L17
        L11:
            boolean r0 = r3.A13()
            if (r0 == 0) goto L29
        L17:
            boolean r0 = r5 instanceof X.C143556du
            if (r0 == 0) goto L29
            X.6du r5 = (X.C143556du) r5
            X.6o8 r1 = r2.A0B
            r1.A06(r3)
            android.widget.ImageView r0 = r5.A05
            if (r0 == 0) goto L29
            r1.A05(r0, r3)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146036i0.D8t(X.1vS, X.1w4, X.6dw, X.6ac):void");
    }

    @Override // X.InterfaceC97614Zw
    public final void Dct(InterfaceC41201vU interfaceC41201vU, C97624Zx c97624Zx, Wm1 wm1, int i) {
        C38321qM BQN = interfaceC41201vU.BQN();
        if (BQN != null) {
            AbstractC97594Zu.A02(this.A09, wm1, BQN.A38(), this.A08.getModuleName(), AbstractC86623ta.A00(BQN.A2P()), this.A0H, i);
        }
        C41779Iev c41779Iev = new C41779Iev(c97624Zx, wm1, this, i);
        int A00 = wm1.A00();
        C149566o8 c149566o8 = this.A0B;
        View view = c97624Zx.A01;
        view.getClass();
        if (i == A00) {
            c149566o8.A04(c41779Iev, view, false, true);
        } else {
            c149566o8.A03(c41779Iev, view);
        }
        c97624Zx.A01(i);
    }
}
