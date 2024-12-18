package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.6hQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145676hQ implements InterfaceC144936gD {
    public C145826hf A00;
    public C148636mY A01;
    public C148586mT A02;
    public C148666mb A03;
    public C148626mX A04;
    public C148646mZ A05;
    public C148656ma A06;
    public C147596kk A07;
    public final InterfaceC1118853a A08;
    public final InterfaceC144586fe A09;
    public final WeakReference A0A;

    @Override // X.InterfaceC144956gF
    public final void Cif(C45213Jzt c45213Jzt) {
        StoryTrendingPromptSubType storyTrendingPromptSubType;
        long j;
        C147596kk c147596kk = this.A07;
        if (c147596kk == null) {
            C14360o3.A0F("trendingPromptController");
            throw C00O.createAndThrow();
        }
        LEX lex = (LEX) c147596kk.A08.getValue();
        StoryPromptTappableData storyPromptTappableData = c45213Jzt.A01;
        String str = storyPromptTappableData.A0M;
        int i = c45213Jzt.A00;
        H6G h6g = c45213Jzt.A02;
        if (h6g != null) {
            storyTrendingPromptSubType = h6g.A00;
        } else {
            storyTrendingPromptSubType = null;
        }
        String sessionId = c147596kk.A05.A0E.getSessionId();
        String str2 = storyPromptTappableData.A0N;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(sessionId, 3);
        String str3 = C1QM.A00.A02.A00;
        if (str3 != null) {
            C18920wW c18920wW = (C18920wW) lex.A02.getValue();
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_trending_prompts");
            A00.AAP("nav_chain", str3);
            A00.AAP("event_type", "trending_prompts_netego_prompt_impression");
            A00.AAP(AbstractC43591JPw.A00(96), sessionId);
            A00.AAP("feed_type", "trending");
            A00.AAP(AbstractC43591JPw.A00(862), str);
            A00.AAP(AbstractC43591JPw.A00(864), String.valueOf(storyTrendingPromptSubType));
            A00.AAP("component_type", "story");
            A00.A9K(AbstractC43591JPw.A00(863), Long.valueOf(i));
            if (str2 != null) {
                j = 1;
            } else {
                j = 0;
            }
            A00.A9K(AbstractC43591JPw.A00(1217), Long.valueOf(j));
            A00.Cht();
        }
    }

    @Override // X.InterfaceC144936gD
    public final void Cua(C22P c22p, C41181vS c41181vS) {
        C14360o3.A0B(c22p, 1);
        C145176gc c145176gc = (C145176gc) this.A09;
        InterfaceC147266kB interfaceC147266kB = ((ReelViewerFragment) c145176gc.A18).mViewPager;
        if (interfaceC147266kB != null && interfaceC147266kB.isIdle()) {
            c145176gc.CJE(c22p, c41181vS, null, C2Fb.A3f);
        }
    }

    @Override // X.InterfaceC144936gD
    public final void CwO(C41551w4 c41551w4) {
        this.A09.DKf(c41551w4, false);
    }

    @Override // X.InterfaceC144946gE
    public final void DGU(H6G h6g, Reel reel, InterfaceC58290Psi interfaceC58290Psi, List list, int i) {
    }

    @Override // X.InterfaceC144616fh
    public final boolean DQr(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A09.DQr(motionEvent);
    }

    @Override // X.InterfaceC144946gE
    public final void Dc8(H6G h6g, PromptStickerModel promptStickerModel, int i) {
        C105864px c105864px;
        C14360o3.A0B(promptStickerModel, 0);
        C147596kk c147596kk = this.A07;
        if (c147596kk == null) {
            C14360o3.A0F("trendingPromptController");
            throw C00O.createAndThrow();
        }
        FragmentActivity fragmentActivity = c147596kk.A00;
        UserSession userSession = c147596kk.A02;
        LHI.A00(fragmentActivity, C22P.A0E, userSession, promptStickerModel);
        C41181vS AuU = c147596kk.A06.AuU();
        if (AuU != null && (c105864px = AuU.A07) != null) {
            String str = c105864px.A03.A08;
            if (str == null) {
                str = "";
            }
            String str2 = AuU.A0j;
            C14360o3.A07(str2);
            AbstractC59962oe abstractC59962oe = c147596kk.A01;
            C18920wW A01 = AbstractC12220kQ.A01(abstractC59962oe, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_netego_secondary_click");
            if (A00.isSampled()) {
                A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "trending_prompts_in_story");
                A00.AAP("action", "cta_secondary_click");
                A00.AAP("container_module", abstractC59962oe.getModuleName());
                A00.A9K("ig_userid", Long.valueOf(Long.parseLong(userSession.userId)));
                A00.AAP("netego_id", str2);
                A00.AAP("tracking_token", str);
                A00.Cht();
            }
        }
        LEX.A00((LEX) c147596kk.A08.getValue(), "cta_tap");
    }

    @Override // X.InterfaceC144946gE
    public final void Dc9(H6G h6g, PromptStickerModel promptStickerModel, int i) {
        C14360o3.A0B(promptStickerModel, 0);
        C147596kk c147596kk = this.A07;
        if (c147596kk == null) {
            C14360o3.A0F("trendingPromptController");
            throw C00O.createAndThrow();
        }
        InterfaceC1118853a interfaceC1118853a = c147596kk.A06;
        interfaceC1118853a.EJ8(false);
        interfaceC1118853a.CMc();
        interfaceC1118853a.EJE("tapped");
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null) {
            FragmentActivity fragmentActivity = c147596kk.A00;
            AbstractC59962oe abstractC59962oe = c147596kk.A01;
            UserSession userSession = c147596kk.A02;
            AbstractC54892OPn.A00(fragmentActivity, C22P.A0F, abstractC59962oe, userSession, null, null, null, interfaceC1118853a, promptStickerModel, null, promptStickerModel.A05(), c147596kk.A07, c147596kk.A05.A0E.getSessionId(), C16930sl.A00);
            C105864px c105864px = AuU.A07;
            if (c105864px != null) {
                String str = c105864px.A03.A08;
                if (str == null) {
                    str = "";
                }
                String str2 = AuU.A0j;
                C14360o3.A07(str2);
                C3R6.A05(abstractC59962oe, userSession, null, "trending_prompts_in_story", str2, "cta_primary_click", str);
            }
        }
        LEX.A00((LEX) c147596kk.A08.getValue(), "sticker_tap");
    }

    @Override // X.InterfaceC144616fh
    public final boolean Ddl(C84823qW c84823qW, int i, int i2) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144936gD
    public final void Dqp(SparseArray sparseArray, View view, ImageUrl imageUrl, String str, String str2, int i, int i2) {
        C41181vS c41181vS;
        C14360o3.A0B(view, 5);
        C14360o3.A0B(sparseArray, 6);
        C148586mT c148586mT = this.A02;
        if (c148586mT == null) {
            C14360o3.A0F("suggestedUsersController");
            throw C00O.createAndThrow();
        }
        View AuA = c148586mT.A04.AuA();
        if (AuA != null && (AuA.getTag() instanceof C38080Gp9)) {
            c41181vS = ((C38080Gp9) AuA.getTag()).A06;
        } else {
            c41181vS = null;
        }
        C147196jv c147196jv = c148586mT.A06;
        ViewGroup viewGroup = ((C147256kA) c148586mT.A05).A02;
        c147196jv.A00(false, true);
        c147196jv.A08 = str;
        c147196jv.A07 = "reel_viewer_netego_suggested_user";
        c147196jv.A00 = sparseArray;
        c147196jv.A03 = null;
        c147196jv.A02 = c41181vS;
        c147196jv.A04 = null;
        c147196jv.A06 = null;
        c147196jv.A01 = view;
        L5J A00 = LHF.A00(viewGroup, c147196jv.A0A);
        A00.A02 = EnumC46122KbM.A01;
        A00.A03 = Integer.valueOf(R.color.baseline_neutral_80);
        C51622Yk c51622Yk = new C51622Yk(A00);
        c147196jv.A05 = c51622Yk;
        c51622Yk.A03 = c147196jv;
        LHF.A02(c147196jv.A09, imageUrl, c51622Yk, str2, 2131970227, false);
        c147196jv.A05.A02(view, 0, i2, false);
        this.A08.EJE("tapped");
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent, 0);
        C14360o3.A0B(motionEvent2, 1);
        return this.A09.Drb(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.InterfaceC144936gD
    public final void Clq(C41551w4 c41551w4, String str, String str2, float f, float f2, int i) {
        C145826hf c145826hf = this.A00;
        if (c145826hf == null) {
            C14360o3.A0F("reelViewerLogger");
            throw C00O.createAndThrow();
        }
        c145826hf.A0P(c41551w4, str2, f, f2, i);
    }

    @Override // X.InterfaceC144936gD, X.InterfaceC144966gG
    public final void CuX(C41181vS c41181vS) {
        this.A09.CuX(c41181vS);
    }

    @Override // X.InterfaceC144936gD
    public final void D6L(Context context, InterfaceC11380iw interfaceC11380iw, float f, float f2) {
        C148646mZ c148646mZ = this.A05;
        if (c148646mZ == null) {
            C14360o3.A0F("shareCommentToStoryController");
            throw C00O.createAndThrow();
        }
        C51622Yk c51622Yk = c148646mZ.A00;
        if (c51622Yk != null) {
            c51622Yk.A03(true);
            c148646mZ.A00 = null;
            return;
        }
        UserSession userSession = c148646mZ.A04;
        View view = c148646mZ.A03;
        L5J A00 = LHF.A00(view, userSession);
        A00.A02 = EnumC46122KbM.A01;
        A00.A03 = Integer.valueOf(AbstractC53242c7.A0H(c148646mZ.A02, R.attr.igds_color_creation_tools_grey_03));
        C51622Yk c51622Yk2 = new C51622Yk(A00);
        c51622Yk2.A03 = new PIJ(context, c148646mZ);
        String string = context.getResources().getString(2131952398);
        C14360o3.A07(string);
        LHF.A02(interfaceC11380iw, null, c51622Yk2, string, 2131955936, false);
        c51622Yk2.A02(view, ((int) f) - (view.getWidth() / 2), ((int) f2) - (view.getHeight() / 2), false);
        c148646mZ.A00 = c51622Yk2;
        c148646mZ.A05.EJE("tapped");
    }

    @Override // X.InterfaceC144616fh
    public final void DBc(float f) {
        this.A09.DBc(f);
    }

    @Override // X.InterfaceC144936gD
    public final void DHm() {
        ReelViewerFragment.A0I((ReelViewerFragment) this.A08, false);
    }

    @Override // X.InterfaceC144936gD
    public final void DHn(boolean z) {
        C148586mT c148586mT = this.A02;
        if (c148586mT == null) {
            C14360o3.A0F("suggestedUsersController");
            throw C00O.createAndThrow();
        }
        c148586mT.A06.A00(true, z);
        if (z) {
            this.A08.EJE("tapped");
        }
    }

    @Override // X.InterfaceC144616fh
    public final void DQV(float f, float f2) {
        this.A09.DQV(f, f2);
    }

    @Override // X.InterfaceC144936gD
    public final void DSm(View view, C41181vS c41181vS, C41551w4 c41551w4) {
        this.A09.DSm(view, c41181vS, c41551w4);
    }

    @Override // X.InterfaceC144936gD
    public final void DTW(Context context, InterfaceC11380iw interfaceC11380iw, C41181vS c41181vS, float f, float f2) {
        String str;
        C51622Yk c51622Yk;
        String str2;
        C148666mb c148666mb = this.A03;
        if (c148666mb != null) {
            UserSession userSession = c148666mb.A04;
            String str3 = c41181vS.A0j;
            C14360o3.A07(str3);
            C105804pr c105804pr = c41181vS.A0C;
            if (c105804pr != null) {
                str = c105804pr.A07;
            } else {
                str = null;
            }
            C3R6.A05(interfaceC11380iw, userSession, null, "meta_gallery_stories_netego", str3, "cta_primary_click", str);
            C148666mb c148666mb2 = this.A03;
            if (c148666mb2 != null) {
                if (c148666mb2.A00 != null) {
                    ReelViewerFragment.A0I((ReelViewerFragment) c148666mb2.A05, false);
                    c51622Yk = null;
                    C51622Yk c51622Yk2 = c148666mb2.A00;
                    if (c51622Yk2 != null) {
                        c51622Yk2.A03(true);
                    }
                } else {
                    c148666mb2.A05.EJE("tapped");
                    UserSession userSession2 = c148666mb2.A04;
                    View view = c148666mb2.A02;
                    L5J A00 = LHF.A00(view, userSession2);
                    A00.A02 = EnumC46122KbM.A01;
                    A00.A03 = Integer.valueOf(R.color.direct_light_mode_glyph_color_tertiary);
                    c51622Yk = new C51622Yk(A00);
                    c51622Yk.A03 = new PII(interfaceC11380iw, c148666mb2);
                    if (c105804pr != null && (str2 = c105804pr.A06) != null) {
                        LHF.A02(interfaceC11380iw, null, c51622Yk, str2, 2131966611, false);
                        c51622Yk.A02(view, ((int) f) - (view.getWidth() / 2), ((int) f2) - (view.getHeight() / 2), false);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                c148666mb2.A00 = c51622Yk;
                return;
            }
        }
        C14360o3.A0F("metaGalleryNetegoController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144936gD
    public final void DVI(C41181vS c41181vS, C41551w4 c41551w4, C38080Gp9 c38080Gp9, boolean z) {
        InterfaceC1118853a interfaceC1118853a = this.A08;
        if (C14360o3.A0K(((ReelViewerFragment) interfaceC1118853a).A0a, c41551w4) || z) {
            interfaceC1118853a.D8u(c41181vS, c38080Gp9);
            if (c41181vS.A0f != null) {
                C6SD c6sd = c38080Gp9.A0N;
                if (c6sd.A05 != null) {
                    View view = c6sd.A01;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    throw new IllegalStateException("ad4ad view is null when it needs to be animated");
                }
                throw new IllegalStateException("reelItemState expected to be not null");
            }
        }
    }

    @Override // X.InterfaceC144956gF
    public final void DeR(View view, C59062n7 c59062n7) {
        C147596kk c147596kk = this.A07;
        if (c147596kk == null) {
            C14360o3.A0F("trendingPromptController");
            throw C00O.createAndThrow();
        }
        c147596kk.A04.A05(view, c59062n7);
    }

    @Override // X.InterfaceC144936gD
    public final void DeS(View view, C59062n7 c59062n7) {
        C148656ma c148656ma = this.A06;
        if (c148656ma == null) {
            C14360o3.A0F("threadsInStoriesController");
            throw C00O.createAndThrow();
        }
        c148656ma.A05.A05(view, c59062n7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if ((r4.getTag() instanceof X.C38080Gp9) == false) goto L8;
     */
    @Override // X.InterfaceC144936gD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dqt(X.C41551w4 r8) {
        /*
            r7 = this;
            X.6mT r6 = r7.A02
            java.lang.String r5 = "suggestedUsersController"
            if (r6 == 0) goto L5a
            X.53a r0 = r6.A04
            android.view.View r4 = r0.AuA()
            X.1vS r3 = r0.AuU()
            r2 = 0
            if (r4 == 0) goto L1c
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof X.C38080Gp9
            r1 = 1
            if (r0 != 0) goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r3 == 0) goto L26
            boolean r0 = r3.A1V()
            if (r0 == 0) goto L26
            r2 = 1
        L26:
            if (r1 == 0) goto L52
            if (r2 == 0) goto L52
            r4.getClass()
            java.lang.Object r4 = r4.getTag()
            r4.getClass()
            X.Gp9 r4 = (X.C38080Gp9) r4
            X.6ac r3 = r4.A08
            r3.getClass()
            boolean r0 = r3.A0s
            if (r0 != 0) goto L52
            boolean r0 = r3.A0g
            if (r0 != 0) goto L52
            com.instagram.common.session.UserSession r2 = r6.A02
            X.1GL r1 = r6.A03
            X.1vS r0 = r4.A06
            r0.getClass()
            X.C148586mT.A00(r2, r1, r0, r3, r4)
            r0 = 1
            r3.A0g = r0
        L52:
            X.6mT r0 = r7.A02
            if (r0 == 0) goto L5a
            r0.A03()
            return
        L5a:
            X.C14360o3.A0F(r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145676hQ.Dqt(X.1w4):void");
    }

    @Override // X.InterfaceC144936gD
    public final void Dqu() {
        C148586mT c148586mT = this.A02;
        if (c148586mT == null) {
            C14360o3.A0F("suggestedUsersController");
            throw C00O.createAndThrow();
        }
        C145876hk c145876hk = c148586mT.A07;
        C140966Yy c140966Yy = new C140966Yy(c145876hk.A00, c145876hk.A02);
        c140966Yy.A0F = true;
        c140966Yy.A0B(null, AbstractC35067Fce.A00().A00().A01("su_in_stories", null));
        c140966Yy.A04();
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return this.A09.DrS(f, f2);
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return this.A09.DrU();
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return this.A09.DrW();
    }

    @Override // X.InterfaceC144616fh
    public final void DsB(float f, float f2) {
        this.A09.DsB(f, f2);
    }

    @Override // X.InterfaceC144936gD
    public final void Dsu(Context context, InterfaceC11380iw interfaceC11380iw, String str, float f, float f2, int i) {
        C148656ma c148656ma = this.A06;
        if (c148656ma == null) {
            C14360o3.A0F("threadsInStoriesController");
            throw C00O.createAndThrow();
        }
        C51622Yk c51622Yk = c148656ma.A00;
        if (c51622Yk != null) {
            c51622Yk.A03(true);
            c148656ma.A00 = null;
            return;
        }
        UserSession userSession = c148656ma.A04;
        View view = c148656ma.A03;
        L5J A00 = LHF.A00(view, userSession);
        A00.A02 = EnumC46122KbM.A01;
        C51622Yk c51622Yk2 = new C51622Yk(A00);
        c51622Yk2.A03 = new PIK(context, interfaceC11380iw, c148656ma, str, i);
        InterfaceC1118853a interfaceC1118853a = c148656ma.A06;
        LHF.A01(view, interfaceC1118853a.Auc(), c51622Yk2);
        String string = context.getResources().getString(2131976865);
        C14360o3.A07(string);
        LHF.A02(interfaceC11380iw, null, c51622Yk2, string, 2131955936, false);
        c51622Yk2.A02(view, ((int) f) - (view.getWidth() / 2), ((int) f2) - (view.getHeight() / 2), false);
        c148656ma.A00 = c51622Yk2;
        interfaceC1118853a.EJE("tapped");
    }

    @Override // X.InterfaceC144936gD
    public final void Dsv(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS) {
        String str;
        Long l;
        List BQh;
        List BQh2;
        C148656ma c148656ma = this.A06;
        if (c148656ma == null) {
            C14360o3.A0F("threadsInStoriesController");
            throw C00O.createAndThrow();
        }
        UserSession userSession2 = c148656ma.A04;
        Activity activity = c148656ma.A02;
        C14360o3.A0C(activity, MSV.A00(0));
        C35265Fh0.A02((FragmentActivity) activity, userSession2, "tisu");
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_threads_in_stories_unit_header_tap");
        C105794pq c105794pq = c41181vS.A0D;
        C18C.A07(c105794pq, "Threads in stories unit netego unit is missing Threads in stories unit model.");
        int i = 0;
        if (c105794pq != null && (BQh2 = c105794pq.A00.BQh()) != null && BQh2.size() > 1) {
            str = "three_media";
        } else {
            str = "one_media";
        }
        if (A00.isSampled()) {
            A00.AAP("container_module", MSV.A00(477));
            C18C.A07(c105794pq, "Threads in stories unit netego unit is missing Threads in stories unit model.");
            if (c105794pq != null && (BQh = c105794pq.A00.BQh()) != null) {
                i = BQh.size();
            }
            A00.A8p("total_num_candidates", Integer.valueOf(i));
            Long l2 = null;
            A00.A8p("media_index", null);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            C18C.A07(c105794pq, "Threads in stories unit netego unit is missing Threads in stories unit model.");
            if (c105794pq != null) {
                String Bjj = c105794pq.A00.Bjj();
                if (Bjj == null) {
                    Bjj = "";
                }
                l = AbstractC003100w.A0k(10, Bjj);
            } else {
                l = null;
            }
            A00.A9K("quick_promotion_id", l);
            C18C.A07(c105794pq, "Threads in stories unit netego unit is missing Threads in stories unit model.");
            if (c105794pq != null) {
                l2 = AbstractC003100w.A0k(10, c105794pq.getId());
            }
            A00.A9K("netego_id", l2);
            A00.AAP("displayed_card_type", str);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC144616fh
    public final void Dwo(boolean z) {
        this.A09.Dwo(z);
    }

    @Override // X.InterfaceC144936gD
    public final void E13(C41181vS c41181vS) {
        this.A09.E13(c41181vS);
    }

    @Override // X.InterfaceC144936gD
    public final void E15(C41181vS c41181vS, C141596ac c141596ac, boolean z) {
        this.A09.E15(c41181vS, c141596ac, z);
    }

    public C145676hQ(InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, WeakReference weakReference) {
        this.A0A = weakReference;
        this.A09 = interfaceC144586fe;
        this.A08 = interfaceC1118853a;
    }
}
