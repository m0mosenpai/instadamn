package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8XV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XV implements InterfaceC60072op, C8HL {
    public C8Y1 A00;
    public C188798Xv A01;
    public boolean A02;
    public boolean A03;
    public final UserSession A04;
    public final C1810981l A05;
    public final C89F A06;
    public final C8RZ A07;
    public final C8LZ A08;
    public final C8TN A09;
    public final C183688Ct A0A;
    public final C8HI A0B;
    public final C1821786b A0C;
    public final AnonymousClass840 A0D;
    public final C88D A0E;
    public final C81J A0F;
    public final C1813582n A0G;
    public final C8XA A0H;
    public final C8JI A0I;
    public final C172047lZ A0J;
    public final C8GE A0K;
    public final InterfaceC1810081c A0L;
    public final C8JU A0M;
    public final ViewOnTouchListenerC1829389o A0N;
    public final Activity A0O;
    public final AbstractC59962oe A0P;
    public final C85E A0Q;
    public final C8TT A0R;
    public final C187198Rm A0S;
    public final C184418Gf A0T;
    public final C8XU A0U;
    public final C188598Wy A0V;
    public final C8C0 A0W;
    public final C8FG A0X;
    public final C8FE A0Y;
    public final C8XH A0Z;
    public final C184918Ig A0a;
    public final C8HD A0b;
    public final C1814382v A0c;
    public final C184858Ia A0d;
    public final C184898Ie A0e;
    public final C184878Ic A0f;
    public final C187058Qy A0g;
    public final C1828989k A0h;
    public final C8CS A0i;
    public final C8HB A0j;

    public final void A04(C183978Ee c183978Ee) {
        Activity activity;
        UserSession userSession;
        Medium A03;
        C8HF c8hf;
        C88X A0D;
        boolean z;
        C8JL c8jl;
        C8JN c8jn;
        this.A0K.A00().Cns(c183978Ee);
        if (this.A05.A08.A00 instanceof C208509Kk) {
            C8JI c8ji = this.A0I;
            C8HI c8hi = this.A0B;
            C174757qB c174757qB = c8hi.A06;
            if (c174757qB != null) {
                z = c174757qB.A0U();
            } else {
                z = false;
            }
            InterfaceC25209BDh interfaceC25209BDh = c8ji.A01;
            C8JL c8jl2 = null;
            if (interfaceC25209BDh != null) {
                c8jl = interfaceC25209BDh.BNn();
            } else {
                c8jl = null;
            }
            if (c8jl instanceof C8JN) {
                if (interfaceC25209BDh != null) {
                    c8jl2 = interfaceC25209BDh.BNn();
                }
                if ((c8jl2 instanceof C8JN) && (c8jn = (C8JN) c8jl2) != null) {
                    UserSession userSession2 = c8jn.A08;
                    Context context = c8jn.A07;
                    if (AbstractC195888lY.A01(context.getApplicationContext(), userSession2)) {
                        C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession2, new Am7(c8jn, z), "GlassesStoryViewListener_SEND_STREAM_ENDING_LIFECYCLE_EVENT_ON_VIDEO_END_CALLBACK");
                    }
                }
            }
            C174757qB c174757qB2 = c8hi.A06;
            if (c174757qB2 != null && c174757qB2.A0U()) {
                c183978Ee.A01().A03 = "com.facebook.hammerhead.story_camera";
            }
        }
        C81J c81j = this.A0F;
        boolean z2 = false;
        if (c81j.A3R) {
            this.A0V.A02(this.A0i, c183978Ee);
        } else {
            C184858Ia c184858Ia = this.A0d;
            if (c184858Ia.A08.A0W(C81W.A0p)) {
                C184858Ia.A02(new C198308pf(c183978Ee), c184858Ia);
            } else {
                C184878Ic c184878Ic = this.A0f;
                if (c184878Ic.A0B) {
                    C184878Ic.A00(new C198308pf(c183978Ee), c184878Ic);
                } else {
                    C184898Ie c184898Ie = this.A0e;
                    if (c184898Ie.A09) {
                        String A06 = c183978Ee.A06();
                        int i = (int) c184898Ie.A03;
                        Bitmap A0G = C1NC.A0G(A06, i, i, i, i, c183978Ee.A07, c183978Ee.A14);
                        if (A0G != null) {
                            activity = c184898Ie.A04;
                            C14360o3.A06(activity);
                            File file = new File(c183978Ee.A06());
                            C14360o3.A0B(file, 0);
                            C202728xq c202728xq = new C202728xq(activity, A0G, C8IU.A03(file, 1, 0), null, C8OK.A0B, null, i, i, true, false, false, false);
                            c184898Ie.A06.A0h(c202728xq, C5GJ.ASSET_PICKER, new C8FC((C8D0) new C183748Cz(0.5f, 0.0f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(AbstractC16960so.A1Q(Float.valueOf(0.0f), Float.valueOf(activity.getResources().getDimension(R.dimen.birthday_selfie_preview_margin_top)))), 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0, false, true, false, false, true, false, false, false, false, true, true, false, false, false), "rollcall_v2_photo_sticker", AbstractC16960so.A1N("rollcall_v2_photo_sticker"));
                            CircularImageView circularImageView = new CircularImageView(activity, null, 0);
                            c184898Ie.A08.addView(circularImageView);
                            ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
                            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.setMargins(0, C184898Ie.A00(activity, R.dimen.birthday_selfie_preview_margin_top), 0, 0);
                            ((ViewGroup.LayoutParams) layoutParams2).width = C184898Ie.A00(activity, R.dimen.birthday_selfie_preview_size);
                            ((ViewGroup.LayoutParams) layoutParams2).height = C184898Ie.A00(activity, R.dimen.birthday_selfie_preview_size);
                            layoutParams2.gravity = 1;
                            AbstractC73003Pb.A00(activity, circularImageView);
                            AbstractC73003Pb.A01(circularImageView.getDrawable());
                            c184898Ie.A00 = c202728xq;
                            File file2 = new File(C50472Tr.A01(), c183978Ee.A03().getName());
                            c184898Ie.A02 = file2;
                            C1NC.A0M(A0G, file2);
                            userSession = c184898Ie.A05;
                            C14360o3.A06(userSession);
                            File file3 = c184898Ie.A02;
                            if (file3 != null) {
                                A03 = C8IU.A03(file3, 1, 0);
                                c8hf = c184898Ie.A07;
                                LBX.A00(activity, A03, userSession, c8hf);
                            }
                            C14360o3.A0F("photoBitmapFile");
                            throw C00O.createAndThrow();
                        }
                    } else if (c81j.A3m) {
                        C184918Ig c184918Ig = this.A0a;
                        String A062 = c183978Ee.A06();
                        int i2 = (int) c184918Ig.A03;
                        Bitmap A0G2 = C1NC.A0G(A062, i2, i2, i2, i2, c183978Ee.A07, c183978Ee.A14);
                        if (A0G2 != null) {
                            activity = c184918Ig.A04;
                            C14360o3.A06(activity);
                            File file4 = new File(c183978Ee.A06());
                            C14360o3.A0B(file4, 0);
                            C202728xq c202728xq2 = new C202728xq(activity, A0G2, C8IU.A03(file4, 1, 0), null, C8OK.A04, null, i2, i2, true, false, false, false);
                            C183688Ct c183688Ct = c184918Ig.A06;
                            String A00 = AbstractC111324zv.A00(2417);
                            c183688Ct.A0h(c202728xq2, C5GJ.ASSET_PICKER, new C8FC((C8D0) new C183748Cz(0.5f, 0.0f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(AbstractC16960so.A1Q(Float.valueOf(0.0f), Float.valueOf(activity.getResources().getDimension(R.dimen.effect_mini_gallery_saved_state_subtitle_margin_top)))), 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0, false, true, false, false, true, false, false, false, false, true, true, false, false, false), A00, AbstractC16960so.A1N(A00));
                            c184918Ig.A00 = c202728xq2;
                            File file5 = new File(C50472Tr.A01(), c183978Ee.A03().getName());
                            c184918Ig.A02 = file5;
                            C1NC.A0M(A0G2, file5);
                            userSession = c184918Ig.A05;
                            C14360o3.A06(userSession);
                            File file6 = c184918Ig.A02;
                            if (file6 != null) {
                                A03 = C8IU.A03(file6, 1, 0);
                                c8hf = c184918Ig.A07;
                                LBX.A00(activity, A03, userSession, c8hf);
                            }
                            C14360o3.A0F("photoBitmapFile");
                            throw C00O.createAndThrow();
                        }
                    } else if (c81j.A3Z) {
                        C8HD c8hd = this.A0b;
                        String A063 = c183978Ee.A06();
                        int i3 = (int) c8hd.A03;
                        Bitmap A0G3 = C1NC.A0G(A063, i3, i3, i3, i3, c183978Ee.A07, c183978Ee.A14);
                        if (A0G3 != null) {
                            activity = c8hd.A04;
                            C14360o3.A06(activity);
                            File file7 = new File(c183978Ee.A06());
                            C14360o3.A0B(file7, 0);
                            C202728xq c202728xq3 = new C202728xq(activity, A0G3, C8IU.A03(file7, 1, 0), null, C8OK.A09, null, i3, i3, true, false, false, false);
                            C183688Ct c183688Ct2 = c8hd.A07;
                            String A002 = AbstractC111324zv.A00(2418);
                            c183688Ct2.A0h(c202728xq3, C5GJ.ASSET_PICKER, new C8FC((C8D0) new C183748Cz(0.5f, 0.0f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(AbstractC16960so.A1Q(Float.valueOf(0.0f), Float.valueOf(activity.getResources().getDimension(R.dimen.clips_editor_stacked_timeline_reorder_mode_thumbnail_height)))), 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0, false, true, false, false, true, false, false, false, false, true, true, false, false, false), A002, AbstractC16960so.A1N(A002));
                            c8hd.A00 = c202728xq3;
                            File file8 = new File(C50472Tr.A01(), c183978Ee.A03().getName());
                            c8hd.A02 = file8;
                            C1NC.A0M(A0G3, file8);
                            userSession = c8hd.A05;
                            C14360o3.A06(userSession);
                            File file9 = c8hd.A02;
                            if (file9 != null) {
                                A03 = C8IU.A03(file9, 1, 0);
                                c8hf = c8hd.A08;
                                LBX.A00(activity, A03, userSession, c8hf);
                            }
                            C14360o3.A0F("photoBitmapFile");
                            throw C00O.createAndThrow();
                        }
                    } else {
                        C8HB c8hb = this.A0j;
                        if (c8hb.A06.A08.A00 == C81R.A00) {
                            int A003 = ((C191068d2) c8hb.A0D.getValue()).A00();
                            c8hb.A01(C1NC.A0G(c183978Ee.A06(), A003, A003, A003, A003, c183978Ee.A07, c183978Ee.A14));
                        } else {
                            this.A0V.A03(c183978Ee, false);
                        }
                    }
                }
            }
        }
        int i4 = c183978Ee.A07;
        int i5 = c183978Ee.A09;
        int i6 = c183978Ee.A06;
        String str = c183978Ee.A0a;
        int i7 = i4 % 90;
        int i8 = i6;
        if (i7 != 0) {
            i8 = i5;
            i5 = i6;
        }
        float f = i8 / i5;
        if (f != 0.5625f) {
            String format = String.format("Camera position: %s, %dx%d - %f ", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i5), Float.valueOf(f)}, 4));
            C14360o3.A07(format);
            AbstractC12120kG.A07(AnonymousClass001.A0R("CameraAspectRatioUtil", "_capture_aspect_ratio"), format, null);
        }
        C1816783z c1816783z = this.A0D.A02;
        if (c1816783z.A0F()) {
            AbstractC43821JZj.A01(new C23590Ack(this), this.A04, "remix_compose", "tap", "remix_reply_pre_capture");
        }
        if (c1816783z.A01.A0T) {
            C8FG c8fg = this.A0X;
            if (c8fg != null && (A0D = c8fg.A0D()) != null && A0D.A04 != C88Z.A0G) {
                z2 = true;
            }
            AbstractC43821JZj.A00(new C23590Ack(this), this.A04, null, "selfie_reply_compose", "tap", "selfie_reply_pre_capture", null, Collections.singletonMap("effect_used", String.valueOf(z2)));
        }
    }

    public final void A06(C195868lW c195868lW) {
        C88X A0D;
        C199008r1 A00;
        AGy aGy = AGy.A00;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerStart(51249153);
        aGy.A01(CacheBehaviorLogger.SOURCE, "camera");
        int i = c195868lW.A07;
        C006802i c006802i2 = C006802i.A0p;
        C14360o3.A07(c006802i2);
        c006802i2.markerAnnotate(51249153, "video_duration", i);
        C1810981l c1810981l = this.A05;
        Object obj = c1810981l.A08.A00;
        if (obj instanceof C81V) {
            this.A0M.Dyr(c195868lW);
            return;
        }
        boolean z = true;
        if (obj instanceof C208509Kk) {
            C174757qB c174757qB = this.A0B.A06;
            if (c174757qB != null && c174757qB.A0A) {
                c195868lW.A02().A03 = "com.facebook.hammerhead.story_camera";
            }
        } else {
            C184858Ia c184858Ia = this.A0d;
            if (c184858Ia.A08.A0W(C81W.A0p)) {
                this.A0L.E4u(new Object());
                C184858Ia.A02(new C198308pf(c195868lW), c184858Ia);
                return;
            }
            C8HI c8hi = this.A0B;
            if (c8hi.A0W()) {
                this.A0K.A00().Dyr(c195868lW);
                return;
            }
            if (c8hi.A18.A00().CWR()) {
                this.A0K.A00().Dyr(c195868lW);
            } else {
                C184878Ic c184878Ic = this.A0f;
                if (c184878Ic.A0B) {
                    C8FG c8fg = this.A0X;
                    if (c8fg == null || (A0D = c8fg.A0D()) == null || A0D.A04 == C88Z.A0G) {
                        z = false;
                    }
                    AbstractC43821JZj.A00(new C23590Ack(this), this.A04, Long.valueOf(c195868lW.A07 / 1000), "selfie_reply_compose", "tap_and_hold", "selfie_reply_pre_capture", null, Collections.singletonMap("effect_used", String.valueOf(z)));
                    C184878Ic.A00(new C198308pf(c195868lW), c184878Ic);
                    this.A0L.E4u(new Object());
                    return;
                }
            }
        }
        InterfaceC1810081c interfaceC1810081c = this.A0L;
        EnumC1810381f AuH = interfaceC1810081c.AuH();
        EnumC1810381f enumC1810381f = EnumC1810381f.A02;
        if (AuH == enumC1810381f && c1810981l.A0W(C81W.A0B)) {
            if (C6PX.A00(this.A0P.requireContext())) {
                C8RZ c8rz = this.A07;
                String A07 = c195868lW.A07();
                C14360o3.A0B(A07, 0);
                if (c8rz.A03) {
                    EnumC198268pb A01 = c8rz.A0F.A02.A01();
                    int ordinal = A01.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            A00 = new C199008r1(c8rz.A0B.A0R(), null, c8rz.A0D.A00(), c8rz.A0I.ELg(), true);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown captured media type ");
                            sb.append(A01);
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    } else {
                        A00 = AbstractC209539Oo.A00(c8rz.A0B.A0R(), c8rz.A0A.A0G(), c8rz.A0I.ELg());
                    }
                    C187108Rd c187108Rd = c8rz.A0H;
                    C14360o3.A0B(A00, 1);
                    c187108Rd.A00.put(A07, A00);
                }
            }
            this.A0R.A06(new C198308pf(c195868lW));
            return;
        }
        if (interfaceC1810081c.AuH() == enumC1810381f && c1810981l.A0W(C81W.A0D)) {
            this.A0R.A06(new C198308pf(c195868lW));
        }
        this.A0V.A04(c195868lW);
        if (!this.A0D.A02.A0F()) {
            return;
        }
        AbstractC43821JZj.A00(new C23590Ack(this), this.A04, Long.valueOf(c195868lW.A07 / 1000), "remix_compose", "tap_and_hold", "remix_reply_pre_capture", null, null);
    }

    public static final C194648jP A00(C8XV c8xv) {
        C188798Xv c188798Xv = c8xv.A01;
        if (c188798Xv == null) {
            C14360o3.A0F("creationGallerySurfaceControllerProvider");
            throw C00O.createAndThrow();
        }
        return c188798Xv.A00().A01;
    }

    private final boolean A01() {
        C194648jP A00;
        if ((this.A05.A08.A00 instanceof C208509Kk) && (A00 = A00(this)) != null && A00.A00 == 0.0f) {
            UserSession userSession = this.A04;
            if (AbstractC1822686m.A00(this.A0G.A00.A01, userSession) == C05F.A00 && C18U.A06(C06090Tz.A05, userSession, 36330591485969319L)) {
                C194648jP A002 = A00(this);
                if (A002 != null) {
                    A002.A02(true);
                }
                return true;
            }
        }
        return false;
    }

    public final void A03() {
        C88X A0D;
        C1810981l c1810981l = this.A05;
        if (c1810981l.A08.A00 instanceof C81V) {
            this.A0M.Dzg();
            C89F.A01(this.A06);
        }
        C8TN c8tn = this.A09;
        if (c8tn.A02) {
            c8tn.A0N.E4u(new Object());
            c8tn.A02 = false;
        }
        C1821786b c1821786b = this.A0C;
        c1821786b.A0K = false;
        C1821786b.A06(c1821786b);
        this.A0I.A08(false);
        C8FG c8fg = this.A0X;
        if (c8fg != null && (A0D = c8fg.A0D()) != null && A0D.A04 != C88Z.A0G) {
            this.A0W.A0C(false);
            ((C8JA) this.A0Y.A00.A00()).EkB(true, true);
            return;
        }
        boolean A0W = c1810981l.A0W(C81W.A0B);
        C8C0 c8c0 = this.A0W;
        if (A0W) {
            c8c0.A0C(false);
        } else {
            c8c0.A0B(false);
        }
    }

    public final void A05(C183978Ee c183978Ee) {
        this.A0D.A02.A07(new C198308pf(c183978Ee));
        C8RZ c8rz = this.A07;
        c8rz.A0E(false);
        C8LZ c8lz = this.A08;
        c8lz.A0H();
        c8lz.A0I(c8rz);
    }

    public final boolean A07() {
        if (this.A0H.A00().A02 != 3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01eb, code lost:
    
        if (r0 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ed, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0220, code lost:
    
        if (r10.A0P() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x030f, code lost:
    
        if (r4 != 58) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x038f, code lost:
    
        if (r1 == r0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
    
        if ((r3 instanceof X.C81T) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        if (r2 != X.EnumC1810181d.A11) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0167  */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8XV.onBackPressed():boolean");
    }

    public final void A02() {
        if (!A01()) {
            this.A03 = true;
            Integer A0N = this.A0B.A0N();
            int i = 1;
            if (A0N == null || A0N.intValue() != 1) {
                i = 2;
            }
            UserSession userSession = this.A04;
            C448324n c448324n = AnonymousClass229.A01(userSession).A0B;
            C22M c22m = c448324n.A04;
            if (c22m.A0L == null) {
                AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", "logTapCameraExitButton() cameraSession is null", null);
            } else {
                C18920wW c18920wW = c448324n.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_navigation");
                if (A00.isSampled()) {
                    A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "CAMERA_EXIT_BUTTON");
                    A00.AAP("legacy_falco_event_name", "IG_CAMERA_TAP_CAMERA_EXIT_BUTTON");
                    String str = c22m.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("camera_session_id", str);
                    A00.A8p("camera_position", Integer.valueOf(i));
                    A00.A8R(c448324n.A0I(), "capture_type");
                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A00.A8p("event_type", 2);
                    A00.A8R(c22m.A0A, "media_type");
                    A00.AAP("module", C22F.A08.getModuleName());
                    EnumC50631MWs enumC50631MWs = c22m.A0B;
                    if (enumC50631MWs == null) {
                        enumC50631MWs = EnumC50631MWs.A0J;
                    }
                    A00.A8R(enumC50631MWs, "surface");
                    A00.A9K("capture_format_index", 0L);
                    A00.AAP("discovery_session_id", c22m.A0O);
                    A00.AAP("search_session_id", c22m.A0P);
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.Cht();
                }
            }
            if (this.A05.A08.A00 instanceof C81V) {
                AbstractC226999zv.A00(userSession).A00(this.A0O, userSession, C05F.A00);
            }
            if (this.A0F.A0b != null) {
                new C55101ObE(userSession, this.A0O).A03();
            }
            this.A0O.onBackPressed();
        }
    }

    @Override // X.C8HL
    public final void D1Z() {
        C194648jP A00 = A00(this);
        if (A00 != null) {
            A00.A0E.A0A(A00);
        }
        C188798Xv c188798Xv = this.A01;
        if (c188798Xv == null) {
            C14360o3.A0F("creationGallerySurfaceControllerProvider");
            throw C00O.createAndThrow();
        }
        C193838i4 c193838i4 = c188798Xv.A00().A02;
        if (c193838i4 != null) {
            c193838i4.A0W();
        }
        C8TT c8tt = this.A0R;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.requestLocationUpdates(c8tt.A09, c8tt.A0h, "CaptureStateCoordinator");
            this.A0T.A02.Egh(true);
            this.A0c.A00().EkM(this.A0F.A3D);
            this.A0W.A0P.setVisibility(0);
            this.A0M.D1Z();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C8XV(C85E c85e, C1810981l c1810981l, C89F c89f, C8TT c8tt, C8RZ c8rz, C187198Rm c187198Rm, C8LZ c8lz, C8TN c8tn, C183688Ct c183688Ct, C8HI c8hi, C1821786b c1821786b, AnonymousClass840 anonymousClass840, C184418Gf c184418Gf, C88D c88d, C81J c81j, C8XU c8xu, C1813582n c1813582n, C188598Wy c188598Wy, C8XA c8xa, C8C0 c8c0, C8FG c8fg, C8FE c8fe, C8XH c8xh, C8JI c8ji, C172047lZ c172047lZ, C8GE c8ge, C184918Ig c184918Ig, C8HD c8hd, C1814382v c1814382v, C184858Ia c184858Ia, C184898Ie c184898Ie, C184878Ic c184878Ic, InterfaceC1810081c interfaceC1810081c, C8JU c8ju, C187058Qy c187058Qy, ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, C1828989k c1828989k, C8CS c8cs, C8HB c8hb) {
        C14360o3.A0B(c1810981l, 22);
        C14360o3.A0B(c8cs, 35);
        C14360o3.A0B(c1828989k, 36);
        this.A0R = c8tt;
        this.A0T = c184418Gf;
        this.A0c = c1814382v;
        this.A0F = c81j;
        this.A0W = c8c0;
        this.A0M = c8ju;
        this.A0E = c88d;
        this.A0d = c184858Ia;
        this.A0B = c8hi;
        this.A0H = c8xa;
        this.A0g = c187058Qy;
        this.A0Z = c8xh;
        this.A0S = c187198Rm;
        this.A0A = c183688Ct;
        this.A0G = c1813582n;
        this.A0Q = c85e;
        this.A0L = interfaceC1810081c;
        this.A0K = c8ge;
        this.A0J = c172047lZ;
        this.A0I = c8ji;
        this.A0D = anonymousClass840;
        this.A05 = c1810981l;
        this.A0N = viewOnTouchListenerC1829389o;
        this.A06 = c89f;
        this.A09 = c8tn;
        this.A0C = c1821786b;
        this.A0X = c8fg;
        this.A0Y = c8fe;
        this.A0V = c188598Wy;
        this.A07 = c8rz;
        this.A08 = c8lz;
        this.A0f = c184878Ic;
        this.A0e = c184898Ie;
        this.A0b = c8hd;
        this.A0i = c8cs;
        this.A0h = c1828989k;
        this.A0U = c8xu;
        this.A0a = c184918Ig;
        this.A0j = c8hb;
        UserSession userSession = c81j.A0S;
        C14360o3.A07(userSession);
        this.A04 = userSession;
        Activity activity = c81j.A05;
        C14360o3.A07(activity);
        this.A0O = activity;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        C14360o3.A07(abstractC59962oe);
        this.A0P = abstractC59962oe;
    }
}
