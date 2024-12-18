package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8DN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DN {
    public final /* synthetic */ C183688Ct A00;

    public C8DN(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }

    public static C8Y8 A00(C8DN c8dn) {
        return (C8Y8) c8dn.A00.A1z.get();
    }

    public static void A01(final C8DN c8dn, final String str) {
        C183688Ct c183688Ct = c8dn.A00;
        UserSession userSession = c183688Ct.A0w;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean z = false;
        if (C18U.A06(c06090Tz, userSession, 36318913470077711L) && C18U.A06(c06090Tz, userSession, 36318913470143248L) && c183688Ct.A19.A3f) {
            C1810981l c1810981l = c183688Ct.A0x;
            if (c1810981l.A08.A00 == C208509Kk.A00 && !c1810981l.A0W(C81W.A0o, C81W.A0p)) {
                C1816783z c1816783z = c183688Ct.A15;
                if (c1816783z.A01.A0n.size() == 1 && AbstractC199158rI.A00(c1816783z, ((C8NW) c183688Ct.A1h.get()).A16())) {
                    InterfaceC16660sJ interfaceC16660sJ = new InterfaceC16660sJ() { // from class: X.B3m
                        @Override // X.InterfaceC16660sJ
                        public final Object invoke(Object obj) {
                            C8DN c8dn2 = C8DN.this;
                            String str2 = str;
                            String str3 = (String) obj;
                            C8Y8 A00 = C8DN.A00(c8dn2);
                            if (A00 != null) {
                                A00.A0G(str2, str3);
                                return null;
                            }
                            return null;
                        }
                    };
                    C8Y6 c8y6 = (C8Y6) c183688Ct.A1x.get();
                    if (c8y6 != null) {
                        StoryDraftsCreationViewModel storyDraftsCreationViewModel = c183688Ct.A1R;
                        AnonymousClass840 anonymousClass840 = c183688Ct.A14;
                        C199008r1 A04 = c8y6.A08.A04();
                        Bitmap A05 = c8y6.A05();
                        TargetViewSizeProvider targetViewSizeProvider = c183688Ct.A10;
                        Context context = c183688Ct.A0p.getContext();
                        CameraSpec A00 = c8y6.A0Q.A00();
                        if (c1816783z.A01() == EnumC198268pb.A07) {
                            z = true;
                        }
                        storyDraftsCreationViewModel.A01(context, A05, targetViewSizeProvider, anonymousClass840, A00, A04, interfaceC16660sJ, false, z);
                        return;
                    }
                    return;
                }
            }
        }
        C8Y8 c8y8 = (C8Y8) c183688Ct.A1z.get();
        if (c8y8 == null) {
            return;
        }
        c8y8.A0G(str, null);
    }

    public final void A02() {
        EnumC114925Hg enumC114925Hg;
        Object obj;
        C183688Ct c183688Ct = this.A00;
        UserSession userSession = c183688Ct.A0w;
        C22C A01 = AnonymousClass229.A01(userSession);
        if (c183688Ct.A15.A01.A0h == C5JK.A06) {
            enumC114925Hg = EnumC114925Hg.FEED;
        } else {
            enumC114925Hg = null;
        }
        Boolean valueOf = Boolean.valueOf(c183688Ct.A1E.A03.A0G);
        C448724r c448724r = A01.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (c448724r.A0P() && A00.isSampled()) {
            if (enumC114925Hg == null) {
                enumC114925Hg = c448724r.A0J();
            }
            A00.A8R(C81X.A0O, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_TAP_AR_EFFECT_BUTTON");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(enumC114925Hg, "camera_destination");
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.A7v(MSV.A00(43), valueOf);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
            A00.Cht();
        }
        C1811981v c1811981v = c183688Ct.A0x.A08;
        boolean z = c1811981v.A00 instanceof C81V;
        InterfaceC1810081c interfaceC1810081c = c183688Ct.A1N;
        if (z) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        interfaceC1810081c.E4u(obj);
        if ((c1811981v.A00 instanceof C208509Kk) && C17060sy.A01.A01(userSession).A2I() && C18U.A06(C06090Tz.A05, userSession, 36319115333475269L)) {
            boolean z2 = false;
            boolean z3 = false;
            if (System.currentTimeMillis() - AbstractC23021Ah.A00(userSession).A01.getLong("time_last_seen_boost_story_effects_toast", 0L) > TimeUnit.HOURS.toMillis(24L)) {
                z3 = true;
            }
            int i2 = AbstractC23021Ah.A00(userSession).A01.getInt("boost_story_effects_toast_view_count", 0);
            if (i2 < 3) {
                z2 = true;
            }
            if (z3 && z2) {
                C9GR.A08(c183688Ct.A0o, 2131961694, 1);
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = A002.A01.ARD();
                ARD.E7G("time_last_seen_boost_story_effects_toast", currentTimeMillis);
                ARD.apply();
                InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                ARD2.E7D("boost_story_effects_toast_view_count", i2 + 1);
                ARD2.apply();
                AnonymousClass229.A01(userSession).A1b((C55U) c1811981v.A00);
            }
        }
    }

    public final void A03() {
        C183688Ct c183688Ct = this.A00;
        InterfaceC1810081c interfaceC1810081c = c183688Ct.A1N;
        if (interfaceC1810081c.Cae()) {
            C1815483h c1815483h = c183688Ct.A15.A01;
            if (c1815483h.A02() != null && c1815483h.A02().A09 != null) {
                InterfaceC19610xo ARD = AbstractC23021Ah.A00(c183688Ct.A0w).A01.ARD();
                ARD.E77("has_tapped_on_template_sticker_tooltip", true);
                ARD.apply();
            }
        }
        interfaceC1810081c.E4u(new Object());
    }

    public final void A04() {
        C183688Ct c183688Ct = this.A00;
        C1816783z c1816783z = c183688Ct.A15;
        if (c1816783z.A0E()) {
            c183688Ct.A0q(false);
            return;
        }
        if (c1816783z.A01.A0T) {
            UserSession userSession = c183688Ct.A0w;
            InterfaceC11380iw interfaceC11380iw = c183688Ct.A0v;
            String str = c183688Ct.A19.A2l;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(interfaceC11380iw, 1);
            AbstractC43821JZj.A00(interfaceC11380iw, userSession, null, "selfie_reply_sound", "tap", "selfie_reply_post_capture", str, null);
        }
        c183688Ct.A12.A02();
    }

    public final void A05() {
        C8Y6 c8y6 = (C8Y6) this.A00.A1x.get();
        if (c8y6 != null) {
            c8y6.A06();
        }
    }

    public final void A06() {
        C8NW c8nw = (C8NW) this.A00.A1h.get();
        c8nw.A1E(c8nw.A0z());
    }

    public final void A07() {
        BEd A00;
        C183688Ct c183688Ct = this.A00;
        InteractiveDrawableContainer interactiveDrawableContainer = c183688Ct.A1t;
        ArrayList A0T = interactiveDrawableContainer.A0T(C8P7.class);
        C14360o3.A0B(A0T, 0);
        Drawable drawable = (Drawable) AbstractC001800i.A0J(A0T);
        if (drawable != null && !c183688Ct.A1P.A08() && (A00 = InteractiveDrawableContainer.A00(drawable, interactiveDrawableContainer)) != null) {
            C9LJ c9lj = (C9LJ) A00;
            if (!c9lj.A0V) {
                AnimatorSet animatorSet = new AnimatorSet();
                float f = c9lj.A03;
                float f2 = (-8.0f) + f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(c9lj, "rotateDelta", f, f2, 8.0f + f, f2, f).setDuration(600L);
                C14360o3.A07(duration);
                AnimatorSet.Builder play = animatorSet.play(duration);
                float f3 = c9lj.A04 * c9lj.A00;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(c9lj, "scaleFactor", f3, f3 + 0.1f, f3).setDuration(600L);
                C14360o3.A07(duration2);
                play.with(duration2);
                animatorSet.addListener(new AN4(c9lj));
                animatorSet.addListener(new AN3(c9lj));
                animatorSet.start();
            }
        }
        if (((C8NW) c183688Ct.A1h.get()).A1U()) {
            LKV.A01(c183688Ct.A0o, ((NineSixteenLayoutConfigImpl) c183688Ct.A10).A0G);
        }
    }

    public final void A08() {
        C183688Ct c183688Ct = this.A00;
        C83C c83c = c183688Ct.A16;
        if (c83c != null) {
            c83c.A00().A04(false);
            c83c.A00().A01();
        }
        c183688Ct.A1t.A0t(new InterfaceC28041Xi() { // from class: X.Abj
            @Override // X.InterfaceC28041Xi
            public final boolean apply(Object obj) {
                if (obj != null && obj.equals("drawing_sticker")) {
                    return true;
                }
                return false;
            }
        });
        ((C8PR) c183688Ct.A1d.get()).A0C();
    }

    public final void A09() {
        EnumC60792q3 enumC60792q3;
        C183688Ct c183688Ct = this.A00;
        UserSession userSession = c183688Ct.A0w;
        if (AbstractC43840Ja3.A00(userSession)) {
            enumC60792q3 = EnumC60792q3.A03;
        } else {
            enumC60792q3 = EnumC60792q3.A02;
        }
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = true;
        c189448aO.A03 = 0.9f;
        Activity activity = c183688Ct.A0o;
        c189448aO.A0d = activity.getString(2131963050);
        c189448aO.A0O = enumC60792q3;
        c189448aO.A0U = new C24101Amm(c183688Ct);
        final C189478aR A00 = c189448aO.A00();
        final C8NW c8nw = (C8NW) c183688Ct.A1h.get();
        int width = c183688Ct.A1t.getWidth();
        InterfaceC186138Nh interfaceC186138Nh = new InterfaceC186138Nh() { // from class: X.Aeu
            @Override // X.InterfaceC186138Nh
            public final void DIz(Medium medium, boolean z) {
                C8NW c8nw2 = C8NW.this;
                C189478aR c189478aR = A00;
                c8nw2.DIz(medium, z);
                c189478aR.A0L(null);
            }
        };
        C23722Aev c23722Aev = new C23722Aev(c183688Ct);
        C214919fT c214919fT = new C214919fT();
        Bundle bundle = new Bundle();
        bundle.putInt("container_width", width);
        c214919fT.setArguments(bundle);
        c214919fT.A00 = interfaceC186138Nh;
        c214919fT.A01 = c23722Aev;
        A00.A02(activity, c214919fT);
        if (c183688Ct.A22) {
            MYZ A01 = MX1.A01(userSession);
            C18920wW c18920wW = A01.A0D;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_camera_start_gallery_session");
            A002.AAP("camera_session_id", AbstractC193278h7.A00(A01.A0E).A00());
            A002.A8R(EnumC114925Hg.FEED, "camera_destination");
            A002.AAk("camera_tools", C16930sl.A00);
            A002.AAP("gallery_entry_point", "POST_CAPTURE_ACTION_BAR");
            A002.Cht();
        }
    }

    public final void A0A() {
        C183688Ct c183688Ct = this.A00;
        C150286pc c150286pc = c183688Ct.A1b;
        if (c150286pc != null) {
            C191478dz c191478dz = (C191478dz) c150286pc.get();
            String A0L = c191478dz.A0s.A0L();
            if (A0L != null) {
                AKk.A03(c191478dz.A0S, A0L);
                AnonymousClass229.A01(c191478dz.A0b).A0e();
                return;
            }
        }
        C187128Rf c187128Rf = (C187128Rf) c183688Ct.A1y.get();
        if (c187128Rf == null) {
            return;
        }
        c187128Rf.A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        if (X.AbstractC23021Ah.A00(r5).A1i() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() {
        /*
            r19 = this;
            r3 = r19
            X.8Ct r1 = r3.A00
            com.instagram.common.session.UserSession r5 = r1.A0w
            X.22C r0 = X.AnonymousClass229.A01(r5)
            X.24l r2 = r0.A09
            X.0wW r0 = r2.A01
            X.1Mh r4 = X.C25531Mh.A08(r0)
            X.0Ai r0 = r4.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L53
            java.lang.String r0 = "IG_CAMERA_ENTITY_TAP"
            r4.A0s(r0)
            java.lang.String r0 = "INVISIBLE_MENTIONS_USER_SELECTION_BUTTON"
            r4.A0q(r0)
            X.C448124l.A00(r4, r2)
            X.5Hg r0 = X.EnumC114925Hg.STORY
            r4.A0a(r0)
            X.22M r2 = r2.A04
            X.22P r0 = r2.A09
            r4.A0b(r0)
            r4.A0T()
            r4.A0U()
            X.0iw r0 = X.C22F.A08
            java.lang.String r0 = r0.getModuleName()
            r4.A0m(r0)
            X.249 r0 = r2.A0A
            r4.A0c(r0)
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r0 = r0.A00
            r4.A0t(r0)
            r4.Cht()
        L53:
            X.8Px r4 = X.AbstractC186788Pv.A00(r5)
            X.AlF r8 = new X.AlF
            r8.<init>()
            boolean r3 = X.C2TN.A01(r5)
            X.840 r0 = r1.A14
            X.83z r0 = r0.A02
            X.83h r0 = r0.A01
            X.83k r2 = r0.A04
            r0 = 0
            if (r2 == 0) goto L6c
            r0 = 1
        L6c:
            if (r3 == 0) goto L72
            r16 = 1
            if (r0 == 0) goto L78
        L72:
            r16 = 0
            if (r0 != 0) goto Le0
            if (r3 == 0) goto L82
        L78:
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            boolean r0 = r0.A1i()
            if (r0 == 0) goto Le0
        L82:
            r17 = 1
        L84:
            X.83z r3 = r1.A15
            X.83h r0 = r3.A01
            java.lang.String r11 = r0.A0F
            X.C14360o3.A07(r11)
            X.6pc r0 = r1.A1h
            java.lang.Object r0 = r0.get()
            X.8NW r0 = (X.C8NW) r0
            java.util.List r13 = r0.BA2()
            java.util.HashMap r0 = r4.A00
            java.lang.Object r0 = r0.get(r11)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r0 == 0) goto Lb0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            r14.removeAll(r13)
        Lb0:
            android.app.Activity r1 = r1.A0o
            X.3DO r0 = X.C3DN.A00
            X.3DN r2 = r0.A00(r1)
            if (r2 == 0) goto Ldf
            X.8pb r0 = r3.A01()
            java.lang.String r10 = r0.toString()
            X.EpQ r7 = X.EnumC33393EpQ.A05
            java.lang.String r9 = ""
            r15 = 0
            X.C14360o3.A0B(r5, r15)
            r0 = 8
            X.C14360o3.A0B(r10, r0)
            r6 = 0
            r18 = 1
            r12 = r6
            X.EMc r1 = X.AbstractC34280FAa.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnG r0 = new X.AnG
            r0.<init>()
            r2.A0N(r1, r0)
        Ldf:
            return
        Le0:
            r17 = 0
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8DN.A0B():void");
    }

    public final void A0C() {
        C183688Ct c183688Ct = this.A00;
        if (!c183688Ct.A22 && ((C8NW) c183688Ct.A1h.get()).A0D == C05F.A00) {
            return;
        }
        c183688Ct.A1N.E4u(new Object());
    }

    public final void A0D(View view) {
        C183688Ct c183688Ct = this.A00;
        if (c183688Ct.A12.A01() == C05F.A01) {
            c183688Ct.A1Y.A00().A01(c183688Ct.A1t, view, EnumC199188rL.A16);
        }
    }

    public final void A0E(View view) {
        C183688Ct c183688Ct = this.A00;
        if (c183688Ct.A0x.A08.A00 instanceof C81V) {
            c183688Ct.A1Y.A00().A01(c183688Ct.A1t, view, EnumC199188rL.A0v);
        }
    }

    public final void A0F(EnumC193878i8 enumC193878i8, Integer num) {
        C183688Ct.A0C(this.A00, enumC193878i8, num, new Object());
    }

    public final void A0G(C183978Ee c183978Ee, boolean z) {
        int i;
        String str = c183978Ee.A0f;
        String str2 = "";
        String str3 = "";
        if (str != null) {
            str3 = str;
        }
        String str4 = c183978Ee.A0g;
        String str5 = "";
        if (str4 != null) {
            str5 = str4;
        }
        String str6 = c183978Ee.A0l;
        String str7 = "";
        if (str6 != null) {
            str7 = str6;
        }
        String str8 = c183978Ee.A0m;
        if (str8 != null) {
            str2 = str8;
        }
        C183688Ct c183688Ct = this.A00;
        Application application = c183688Ct.A0o.getApplication();
        UserSession userSession = c183688Ct.A0w;
        C14360o3.A0B(application, 0);
        C14360o3.A0B(userSession, 1);
        if (z) {
            i = 543;
        } else {
            i = 542;
        }
        String A00 = AbstractC43591JPw.A00(i);
        C19K A02 = AbstractC24771Iv.A02(1329138747, 3);
        C71766X2c c71766X2c = new C71766X2c(application, userSession, str3, str5, A00, "IMAGINE", null, 2);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c71766X2c, A02);
        AbstractC23641Du.A05(anonymousClass191, new C71766X2c(application, userSession, str7, str2, A00, "PROMPT_SUMMARIZATION", null, 2), AbstractC24771Iv.A02(1329138747, 3));
    }

    public final void A0H(String str, boolean z) {
        C8Y8 c8y8 = (C8Y8) this.A00.A1z.get();
        if (c8y8 != null) {
            C8Y8.A09(c8y8, str, z);
        }
    }
}
