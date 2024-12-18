package X;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.81Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81Z {
    public C22P A01;
    public C55U A02;
    public TargetViewSizeProvider A03;
    public ClipsAssetHubViewModel A04;
    public C23480Aat A05;
    public boolean A07;
    public final int A08;
    public final Activity A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final AnonymousClass845 A0D;
    public final InterfaceC1819385d A0E;
    public final C85Z A0F;
    public final C1825387s A0G;
    public final C1824787m A0H;
    public final AnonymousClass858 A0I;
    public final AbstractC59962oe A0J;
    public final C8Y5 A0K;
    public final AnonymousClass857 A0L;
    public final C1815283f A0M;
    public final C85E A0N;
    public final InterfaceC41501vz A0O;
    public final InterfaceC60022ok A0P;
    public final UserSession A0Q;
    public final C3I9 A0R;
    public final MultiListenerTextureView A0S;
    public final TouchInterceptorFrameLayout A0T;
    public final C57012jc A0U;
    public final C1810981l A0V;
    public final C89F A0W;
    public final C8LJ A0X;
    public final C8TT A0Y;
    public final C8RZ A0Z;
    public final C187198Rm A0a;
    public final C8LZ A0b;
    public final C8TN A0c;
    public final C183688Ct A0d;
    public final C8MV A0e;
    public final C185948Mo A0f;
    public final C8NU A0g;
    public final TargetViewSizeProvider A0h;
    public final AnonymousClass874 A0i;
    public final AnonymousClass874 A0j;
    public final C8HI A0k;
    public final C8XV A0l;
    public final C1821786b A0m;
    public final AnonymousClass840 A0n;
    public final C83C A0o;
    public final C8GG A0p;
    public final C184418Gf A0q;
    public final C88D A0r;
    public final C88I A0s;
    public final C183618Cm A0t;
    public final C81J A0u;
    public final C82C A0v;
    public final C82E A0w;
    public final C1813582n A0x;
    public final C82D A0z;
    public final C1812682c A10;
    public final C8Y1 A11;
    public final MagicMediaRemixEditController A12;
    public final C188598Wy A13;
    public final C187128Rf A14;
    public final InterfaceC188718Xl A15;
    public final C8X5 A16;
    public final C8XA A17;
    public final AnonymousClass880 A18;
    public final C1828889j A19;
    public final C184518Gr A1A;
    public final C8Y6 A1B;
    public final C8Y8 A1C;
    public final C82F A1D;
    public final C8C0 A1E;
    public final C8FR A1F;
    public final C1820485o A1G;
    public final C8FG A1H;
    public final C8FE A1I;
    public final C1824987o A1J;
    public final AnonymousClass860 A1K;
    public final C8A0 A1L;
    public final C188798Xv A1M;
    public final C86S A1N;
    public final C8TI A1O;
    public final C1813982r A1P;
    public final InterfaceC1829689r A1Q;
    public final C172047lZ A1R;
    public final C8Y3 A1S;
    public final C8YJ A1T;
    public final AnonymousClass877 A1U;
    public final C8GE A1V;
    public final InterfaceC1818984z A1W;
    public final AnonymousClass853 A1X;
    public final C8LC A1Y;
    public final C1814382v A1Z;
    public final C184858Ia A1a;
    public final C8AD A1b;
    public final C184878Ic A1c;
    public final C8GF A1d;
    public final InterfaceC1810081c A1e;
    public final C8FA A1f;
    public final StoryDraftsCreationViewModel A1g;
    public final ClipsAudioMixingDrawerController A1h;
    public final C8JU A1i;
    public final ClipsTimelineEditorDrawerController A1j;
    public final C8YK A1k;
    public final C1829289n A1l;
    public final ClipsCreationViewModel A1m;
    public final C89P A1n;
    public final ClipsCreationDraftViewModel A1o;
    public final C83E A1p;
    public final C89E A1q;
    public final C87P A1r;
    public final C183428Bp A1s;
    public final C183468Bt A1t;
    public final AnonymousClass856 A1u;
    public final C8FB A1v;
    public final C150286pc A1w;
    public final C150286pc A1x;
    public final C150286pc A1y;
    public final AnonymousClass825 A1z;
    public final C183608Cl A20;
    public final ViewOnTouchListenerC1829389o A21;
    public final C1828789i A22;
    public final C1828989k A23;
    public final C75E A24;
    public final C8CS A25;
    public final AnonymousClass844 A26;
    public final C8HB A27;
    public final C82J A28;
    public final ShareToFriendsStoryDrawerController A29;
    public final C86X A2A;
    public final InteractiveDrawableContainer A2B;
    public final InterfaceC09390do A2D;
    public final InterfaceC09390do A2E;
    public final boolean A2F;
    public final boolean A2G;
    public final C1809881a A0y = new C1809881a();
    public final Map A2C = new HashMap();
    public float A00 = 0.55f;
    public Runnable A06 = null;

    private ViewOnTouchListenerC1829389o A00(ViewGroup viewGroup, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C47542KzA c47542KzA, C1816283r c1816283r, ImageInfo imageInfo, String str, String str2) {
        AbstractC219819nT c219809nS;
        String str3;
        boolean z = c1816283r == null;
        A8A a8a = new A8A(this, c47542KzA, z);
        Activity activity = this.A09;
        if (z) {
            c219809nS = new C219799nR(activity, this.A1e, new C23684AeJ(activity, this.A22, imageInfo));
        } else {
            C23683AeI c23683AeI = new C23683AeI(activity, this.A22);
            UserSession userSession = this.A0Q;
            C55U c55u = (C55U) this.A0V.A08.A00;
            c1816283r.getClass();
            str2.getClass();
            c219809nS = new C219809nS(activity, userSession, c55u, this.A0W, this.A0h, c23683AeI, c1816283r, str2, str);
        }
        InteractiveDrawableContainer interactiveDrawableContainer = this.A2B;
        C89F c89f = this.A0W;
        C81J c81j = this.A0u;
        C23480Aat c23480Aat = new C23480Aat(c89f, c219809nS, c81j.A18, interactiveDrawableContainer);
        if (c1816283r != null) {
            if (c1816283r.A00 != EnumC189548aZ.A06) {
                this.A0n.A02.A01.A06 = c219809nS.A02();
            }
            str3 = c1816283r.A01.A01;
        } else {
            str3 = null;
        }
        ExtendedImageUrl A01 = AbstractC40161tk.A01(activity, imageInfo);
        A01.getClass();
        this.A05 = c23480Aat;
        AbstractC59962oe abstractC59962oe = this.A0J;
        C1814382v c1814382v = this.A1Z;
        TargetViewSizeProvider targetViewSizeProvider = this.A0h;
        C1810981l c1810981l = this.A0V;
        C1829289n c1829289n = this.A1l;
        A5P a5p = new A5P(this);
        UserSession userSession2 = this.A0Q;
        String moduleName = this.A10.getModuleName();
        boolean z2 = false;
        if (this.A01 == C22P.A53) {
            z2 = true;
        }
        return new ViewOnTouchListenerC1829389o(activity, viewGroup, abstractC59962oe, userSession2, A01, touchInterceptorFrameLayout, c1810981l, c89f, targetViewSizeProvider, a8a, a5p, c1814382v, c1829289n, c23480Aat, c219809nS, c1816283r, interactiveDrawableContainer, str2, str3, str, moduleName, z2, c81j.A3V);
    }

    public static void A01(View view, TargetViewSizeProvider targetViewSizeProvider, C81J c81j, boolean z) {
        View inflate;
        int i;
        if (c81j.A3m) {
            ((ViewStub) view.requireViewById(R.id.video_pog_in_note_selfie_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.video_pog_in_note_selfie_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.video_pog_in_note_selfie_post_capture_texture_view_container_stub;
        } else if ("story_selfie_reply".equals(c81j.A2q)) {
            ((ViewStub) view.requireViewById(R.id.direct_selfie_sticker_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.direct_selfie_sticker_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.direct_selfie_sticker_post_capture_texture_view_container_stub;
        } else if (c81j.A3E) {
            ((ViewStub) view.requireViewById(R.id.birthday_selfie_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.birthday_selfie_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.birthday_selfie_post_capture_texture_view_container_stub;
        } else if (c81j.A3Z) {
            ((ViewStub) view.requireViewById(R.id.potato_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.potato_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.potato_post_capture_texture_view_container_stub;
        } else {
            View requireViewById = view.requireViewById(R.id.default_post_capture_texture_view_container_stub);
            C14360o3.A07(requireViewById);
            ((ViewStub) requireViewById).inflate();
            if (z) {
                return;
            }
            int i2 = 0;
            SparseArray sparseArray = C1812982h.A01;
            int size = sparseArray.size();
            while (i2 < size) {
                try {
                    View requireViewById2 = view.requireViewById(sparseArray.keyAt(i2));
                    C14360o3.A07(requireViewById2);
                    InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
                    AbstractC13880nE.A0g(requireViewById2, interfaceC1812882f.getWidth());
                    AbstractC13880nE.A0W(requireViewById2, interfaceC1812882f.getHeight());
                    AbstractC13880nE.A0X(requireViewById2, 1);
                    i2++;
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(AnonymousClass001.A0R("View id not found: R.id.", (String) sparseArray.valueAt(i2)), e);
                }
            }
            return;
        }
        ((ViewStub) inflate.requireViewById(i)).inflate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x03d5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36331068227339414L) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03f4, code lost:
    
        if (r6.contains(X.C81W.A0B) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0415, code lost:
    
        if (r16 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x026a, code lost:
    
        if (r12.A07 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0320, code lost:
    
        if (r16 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x036c, code lost:
    
        if (r5 == X.C81R.A00) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.view.ViewGroup r30, com.instagram.creation.base.ui.grid.GridLinesView r31, com.instagram.creation.cameraconfiguration.CameraConfiguration r32, X.C81Z r33, com.instagram.creation.photo.crop.CropHighlightView r34) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81Z.A02(android.view.ViewGroup, com.instagram.creation.base.ui.grid.GridLinesView, com.instagram.creation.cameraconfiguration.CameraConfiguration, X.81Z, com.instagram.creation.photo.crop.CropHighlightView):void");
    }

    public static void A03(C81Z c81z) {
        C193838i4 c193838i4 = c81z.A1M.A00().A02;
        if (c193838i4 != null) {
            c193838i4.A0d(c81z.A01);
        }
        C1814382v c1814382v = c81z.A1Z;
        c1814382v.A00().AAw(c81z.A01, c81z.A0Q, c81z.A02, c81z.A1i.CLf());
        if (c81z.A05()) {
            c1814382v.A00().CMf();
            c81z.A18.A00().Eex(true);
        }
        if ("story_selfie_reply".equals(c81z.A0u.A2q)) {
            c1814382v.A00().CMf();
        }
    }

    public static void A04(C81Z c81z) {
        AnonymousClass858 anonymousClass858 = c81z.A0I;
        anonymousClass858.A00.Egh(new C189118Zc(C85B.A09, "389287015265096", "reels_camera", null, null, null, null, -1, false));
        c81z.A0V.A0L(C81W.A0K);
        AnonymousClass860 anonymousClass860 = c81z.A1K;
        anonymousClass860.getClass();
        anonymousClass860.A0Y.Egh(true);
        anonymousClass860.A0Z.Egh(true);
    }

    private boolean A05() {
        AbstractC172157lk abstractC172157lk;
        C1829289n c1829289n = this.A1l;
        if (c1829289n != null && ((Ah1) c1829289n.A00.A00()).A03() && (abstractC172157lk = this.A0n.A02.A01.A06) != null && (abstractC172157lk instanceof C171757l5) && ((C171757l5) abstractC172157lk).A00.equals(EnumC171747l4.A04)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0859, code lost:
    
        if (r197.A3E != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0886, code lost:
    
        if (r4.A00 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0a01, code lost:
    
        if (r5.A00 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0fef, code lost:
    
        if (r2 != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0ff5, code lost:
    
        if (r2.isEmpty() == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x1003, code lost:
    
        r4 = new X.ME5(20, r85, r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x100c, code lost:
    
        r11 = new X.C183468Bt(r7, r4);
        r196.A1t = r11;
        r4 = new X.C183498Bw(r197, r196);
        r5 = java.lang.Boolean.valueOf(X.C18U.A06(r108, r196.A0Q, 2342169486120990609L)).booleanValue();
        r3 = r196.A1X.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x1034, code lost:
    
        if (r5 == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x1036, code lost:
    
        r2 = (android.view.ViewStub) r3.findViewById(com.facebook.R.id.post_capture_floating_button_picker_stub);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x103c, code lost:
    
        if (r2 == null) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x103e, code lost:
    
        r111 = r2.inflate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x1042, code lost:
    
        r151 = false;
        r2 = null;
        r82 = new X.C8C0(r196.A1X.A00.getContext(), r111, r196.A0J.getViewLifecycleOwner(), null, r196.A0Q, null, r18, r4, null, new X.C183508By(r196), null, r4, com.facebook.R.drawable.floating_button_background, false, true, false);
        r82.A0P.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x1091, code lost:
    
        if (((java.util.Set) r196.A0V.A07.A00).size() != 1) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x1093, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x10a2, code lost:
    
        if (((java.util.Set) r196.A0V.A07.A00).contains(X.C81T.A00) != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x10ab, code lost:
    
        if (X.C6PX.A00(r196.A09) == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x10ad, code lost:
    
        if (r5 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x10b1, code lost:
    
        if (r197.A3k != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x10bb, code lost:
    
        if ("story_selfie_reply".equals(r197.A2q) != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x10bd, code lost:
    
        r151 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x10bf, code lost:
    
        r23 = r4.getContext();
        r8 = r196.A0Q;
        r138 = r196.A0J.getViewLifecycleOwner();
        r137 = r4.requireViewById(com.facebook.R.id.floating_button_picker_stub);
        r164 = true;
        r7 = r196.A0V;
        r5 = r196.A1K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x10da, code lost:
    
        if (r151 == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x10dc, code lost:
    
        r2 = new X.C9KH(r196);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x10e1, code lost:
    
        r75 = new X.C8C0(r23, r137, r138, r104, r8, r7, r18, r4, r2, new X.C8CC(r196), r5, r4, com.facebook.R.drawable.floating_button_background, true, true, r151);
        r196.A1E = r75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x110b, code lost:
    
        if (r4 == null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x110d, code lost:
    
        r165 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x1113, code lost:
    
        if (r4.A0A != false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x1117, code lost:
    
        r7 = r196.A0J;
        r2 = (com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel) new X.C52942bb(new X.C8CG(r7.requireContext(), r197.A0O, r196.A0Q), r7).A00(com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel.class);
        r196.A1g = r2;
        r5 = r197.A1g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x113b, code lost:
    
        if (r5 == null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x113d, code lost:
    
        r196.A0n.A02.A01.A09 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x1145, code lost:
    
        r3 = r197.A1h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x1147, code lost:
    
        if (r3 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x1149, code lost:
    
        r196.A0n.A02.A01.A09 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x1151, code lost:
    
        r2 = r196.A09;
        r2 = (X.C8CS) new X.C52942bb(new X.C8CR(r2.getApplication(), r196.A0Q), (X.InterfaceC018407e) r2).A00(X.C8CS.class);
        r196.A25 = r2;
        r9 = r196.A0Q;
        r8 = r196.A0J;
        r7 = r196.A09;
        r2 = r196.A0y;
        r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) new X.C52942bb(new X.C183538Cb((androidx.fragment.app.FragmentActivity) r7, r9, new X.C183528Ca(r2)), r8).A00(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.class);
        r2.A0A.A06(r8, new X.C151846sU(new X.C183588Ci(r7)));
        r2.A0G.A02.A06(r8, new X.C8Cj(r9));
        r196.A1o = r2;
        r4 = r196.A0Q;
        X.C14360o3.A0B(r4, 0);
        r2 = (X.C183608Cl) r4.A01(X.C183608Cl.class, X.C183598Ck.A00);
        r196.A20 = r2;
        r3 = r196.A0J.getViewModelStore();
        r2 = r37.A02.A01.A0c;
        X.C14360o3.A07(r2);
        r4 = new X.C183618Cm(r3, r2);
        r196.A0t = r4;
        r2 = r196.A09;
        r163 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x11ee, code lost:
    
        if (r4 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x11f0, code lost:
    
        r163 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x11f2, code lost:
    
        r2 = r196.A1e;
        r2 = r196.A0Q;
        r114 = X.AbstractC018607g.A00(r196.A0J);
        r2 = r196.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x1202, code lost:
    
        if (r2 == 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x1204, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x1206, code lost:
    
        r2 = r196.A1X.A00;
        r2 = r196.A2B;
        r2 = r196.A0R;
        r2 = r196.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x1218, code lost:
    
        if (r4 != null) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x121a, code lost:
    
        r164 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x121c, code lost:
    
        r166 = "story_selfie_reply".equals(r197.A2q);
        r2 = r197.A1I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x1226, code lost:
    
        if (r2 == null) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x1228, code lost:
    
        r10 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x122a, code lost:
    
        r2 = r196.A0V;
        r2 = r196.A10;
        r9 = new X.C183648Cp(r196);
        r8 = new X.C183658Cq(r196);
        r2 = r196.A0h;
        r2 = r196.A01;
        r2 = r196.A0x;
        r2 = r196.A0o;
        r2 = r197.A2z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x124e, code lost:
    
        if (r2 == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x1250, code lost:
    
        r158 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x1254, code lost:
    
        r3 = new X.C183688Ct(r2, r22, r2, r32, r114, r2, r2, r94, r2, r2, r2, r29, r2, r49, r2, r89, r24, r37, r2, r4, r197, r2, r69, r82, r134, r26, r4, r2, r2, r2, r66, r2, r85, r34, r11, r47, r68, r12, r20, r2, r4, r2, r10, r40, r38, r5, r2, r197.A29, r158, r9, r8, new X.C183668Cr(r196), new X.C183678Cs(r196), r163, r164, r165, r166, r196.A2G, r197.A3e);
        r196.A0d = r3;
        r179 = new X.C184048Et((android.view.ViewStub) r196.A1X.A00.requireViewById(com.facebook.R.id.post_capture_video_trimmer_stub), r196.A0J, r196.A0Q, r3, r196.A1e, r196.A10.getModuleName());
        r2 = (X.C184108Ez) new X.C52942bb((X.InterfaceC52932ba) new java.lang.Object(), (X.InterfaceC018407e) r196.A09).A00(X.C184108Ez.class);
        r4 = new X.C8F0(r197, r196);
        r2 = r3.A1v;
        r2.add(r4);
        r4 = r197.A1C;
        r2 = r197.A00;
        r3.A0F = r4;
        r3.A00 = r2;
        r4 = r197.A1t;
        r2 = r197.A1M;
        r3.A0N = r4;
        r3.A0I = r2;
        r3.A0L = r197.A1r;
        r3.A0M = r197.A1s;
        r3.A0f = r197.A3o;
        r3.A0H = r197.A1G;
        r3.A0G = r197.A1F;
        r3.A0P = r197.A1x;
        r3.A0J = r197.A1T;
        r7 = r197.A1D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x1351, code lost:
    
        if (r7 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x1353, code lost:
    
        r3.A0A = new X.C22920A8q(r3.A0p.getContext(), r3.A0w, r7);
        ((X.C8NW) r3.A1h.get()).A06 = r3.A0A;
        r3.A15.A01.A08 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x1374, code lost:
    
        r3.A0K = r197.A1e;
        r7 = r197.A1y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x137a, code lost:
    
        if (r7 == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x137c, code lost:
    
        r3.A0Q = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x137e, code lost:
    
        r10 = r196.A10;
        r8 = r196.A1e;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x1387, code lost:
    
        if (r197.A1i == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1389, code lost:
    
        r9 = r197.A05;
        X.C14360o3.A07(r9);
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r7 = r197.A1i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x1395, code lost:
    
        if (r7 == null) goto L860;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x1397, code lost:
    
        r4 = r3.A10;
        X.C14360o3.A07(r4);
        r2 = new X.C218779ln(r9, r8, r3, r4, r40, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x13af, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x13b1, code lost:
    
        r196.A1f = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x13b5, code lost:
    
        if (r197.A1V == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x13b9, code lost:
    
        if ((r2 instanceof X.C218719lh) == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x13bb, code lost:
    
        r3.A08 = (X.C218719lh) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x13c0, code lost:
    
        r58 = new X.C8FB(r196.A09, r196.A0Q, r3, r196.A2B);
        r196.A1v = r58;
        r11 = r196.A10;
        r10 = r196.A0V;
        r9 = r196.A1e;
        r8 = r196.A0M;
        r7 = r196.A0Q;
        X.C14360o3.A0B(r23, 0);
        X.C14360o3.A0B(r10, 2);
        X.C14360o3.A0B(r7, 6);
        r59 = new X.C8FE(r9, new X.C50245MHa(0, r23, r11, r10, r9, r75, r8, r7));
        r196.A1I = r59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x1409, code lost:
    
        if (r197.A36 == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x140b, code lost:
    
        r14 = r196.A1e;
        r13 = r196.A0V;
        r12 = r88.A06;
        r11 = r196.A0Q;
        r10 = r196.A09;
        r9 = r196.A1K;
        r9.getClass();
        r4 = new X.C8FG(r10, r4, r196.A0J, r12, X.AbstractC13560mi.A00(), r46, r42, r11, r13, r45, r86, r74, r9, r169, r14, r196.A1z, "reel_composer_camera", true);
        r196.A1H = r4;
        r4 = r4.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x144f, code lost:
    
        if (r4 == null) goto L858;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x1451, code lost:
    
        r196.A1F = r4.AcW();
        r4.A0F.A06(r196.A0J, new X.C184318Fv(r196));
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x1466, code lost:
    
        r10 = r196.A1e;
        r9 = r196.A0V;
        X.C14360o3.A0B(r9, 1);
        r65 = new X.C184328Fw(r10, new X.C50151MDe(r9, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x1481, code lost:
    
        if ((r2 instanceof X.C8G2) == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x1483, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x1484, code lost:
    
        r14 = r196.A1e;
        r13 = r196.A0J;
        r12 = r196.A1Z.A00().BVl();
        r117 = r196.A1Z.A00().BVS();
        r11 = r196.A0Q;
        r7 = r196.A0M;
        r7 = r196.A26;
        r7 = r197.A1N;
        r125 = r45.A00().Bd6();
        r10 = r196.A0V;
        r9 = new X.C8GB(r196);
        r15 = r196.A0h;
        r7 = r197.A12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x14bd, code lost:
    
        if (r7 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x14bf, code lost:
    
        r8 = r7.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x14c1, code lost:
    
        if (r4 == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x14c3, code lost:
    
        r17 = ((X.C8G2) r4).A01.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x14d3, code lost:
    
        if (r17.hasNext() == false) goto L923;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x14d5, code lost:
    
        r7 = r17.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x14db, code lost:
    
        if ((r7 instanceof X.BEc) == false) goto L925;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x14dd, code lost:
    
        r7 = (android.graphics.drawable.Drawable) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x14df, code lost:
    
        X.C14360o3.A0B(r13, 2);
        X.C14360o3.A0B(r12, 3);
        X.C14360o3.A0B(r11, 5);
        X.C14360o3.A0B(r10, 12);
        r72 = new X.C8GE(r14, new X.C8GC(r7, r4, r13, r7, r11, r10, r15, r117, r12, r9, r47, r7, r7, r38, r8, r125));
        r196.A1V = r72;
        r11 = r196.A0Q;
        r10 = r196.A1e;
        r9 = r196.A1Z;
        X.C14360o3.A0B(r11, 0);
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x152b, code lost:
    
        if (r197.A3d == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x152d, code lost:
    
        r8 = r197.A1p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x152f, code lost:
    
        if (r8 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x1531, code lost:
    
        r22 = new X.C8GF(r10, new X.ME5(21, r8, r11, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x153f, code lost:
    
        r196.A1d = r22;
        r11 = r196.A0Q;
        r10 = r197.A3G;
        r9 = r196.A0V;
        r8 = r196.A1e;
        X.C14360o3.A0B(r11, 0);
        X.C14360o3.A0B(r9, 3);
        X.C14360o3.A0B(r2, 5);
        r56 = new X.C8GG(r8, new X.BUN(0, r11, r4, r9, r8, r2, r4, r10));
        r196.A0p = r56;
        r56.A00().A03(new X.C184368Ga(r196), X.C81W.A04);
        r56.A00().A03(new X.C184378Gb(r196), X.C81W.A0x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x1595, code lost:
    
        if (r4 == null) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x1597, code lost:
    
        r56.A00().A02(new X.C23635AdU(r196), X.C81W.A0l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x15a5, code lost:
    
        r7 = r56.A00();
        r8 = X.C81W.A0G;
        r7.A02(new X.C184388Gc(r196), r8);
        r56.A00().A02(new X.C184398Gd(r196), X.C81W.A0K);
        r11 = r196.A09.getApplicationContext();
        r9 = r196.A0J;
        r10 = r196.A1e;
        X.C14360o3.A0B(r4, 0);
        r4 = (X.C184418Gf) new X.C52942bb(new X.C184408Ge(r4), r9).A00(X.C184418Gf.class);
        r4.A00(r10).A06(r9, new X.C184438Gh(r56));
        r4.A02.Egh(java.lang.Boolean.valueOf(X.AbstractC184448Gi.A00(r11)));
        r196.A0q = r4;
        r196.A1Z.A00().B8l().setOnOptionSelectedListener(new X.C184478Gm(r196));
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x161f, code lost:
    
        if (X.AnonymousClass836.A00(r196.A0Q) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x1621, code lost:
    
        r14 = new X.C184958Ik(r56);
        r14.A00 = r196.A0o;
        r11 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu) ((android.view.ViewStub) r4.requireViewById(com.facebook.R.id.camera_pre_capture_utility_menu_stub)).inflate().requireViewById(com.facebook.R.id.camera_pre_capture_utility_menu_view);
        r9 = r196.A0Q;
        r7 = r56.A00();
        X.C14360o3.A0B(r9, 0);
        X.C14360o3.A0B(r7, 1);
        r11.A00 = r9;
        r11.A01 = r7;
        r11.A03 = new X.C172287lx(r11, r9, r7, r11, true);
        r11.setUtilityMenuCameraTools(r14.A04);
        r11.setUtilityMenuDelegateListener(r14);
        r9 = new X.C23636AdV(r196);
        r7 = r14.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x167c, code lost:
    
        if (r7.containsKey(r8) != false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x167e, code lost:
    
        r7.put(r8, new java.util.HashSet());
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x1686, code lost:
    
        r4 = (java.util.Set) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x168c, code lost:
    
        if (r4 == null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x168e, code lost:
    
        r4.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x1691, code lost:
    
        r7 = new X.C184498Go(r196.A0Q, r11);
        r4.A00(r196.A1e).A06(r196.A0J, r7);
        r196.A0V.A0H(r7.A02);
        r4 = r197.A0X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x16ae, code lost:
    
        if (r4 == null) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x16b0, code lost:
    
        r8 = r196.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x16c0, code lost:
    
        if (r8.A0U((X.C55U) r8.A08.A00, r4) == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x16c2, code lost:
    
        r196.A0V.A0L(r197.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x16c9, code lost:
    
        r7 = r56.A00().A04;
        X.C14360o3.A0B(r7, 0);
        r79.A0Z.add(r7);
        r4 = r197.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x16db, code lost:
    
        if (r4 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x16e3, code lost:
    
        if (r4.ordinal() != 4) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x16ef, code lost:
    
        if (X.AbstractC184448Gi.A00(r196.A09.getApplicationContext()) == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x16f5, code lost:
    
        if (r196.A1p.A01 == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x16f7, code lost:
    
        A04(r196);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x16fa, code lost:
    
        r13 = r196.A1e;
        r12 = r196.A0Q;
        r10 = r196.A09;
        r9 = r196.A0V;
        r8 = r196.A2B;
        r7 = r196.A0h;
        X.C14360o3.A0B(r12, 1);
        X.C14360o3.A0B(r10, 2);
        X.C14360o3.A0B(r9, 3);
        X.C14360o3.A0B(r8, 6);
        X.C14360o3.A0B(r7, 8);
        r62 = new X.C184518Gr(r13, new X.C57273Pbv(1, r10, r12, r9, r4, r3, r8, r49, r7));
        r196.A1A = r62;
        r119 = X.C1GJ.A01();
        r10 = r196.A1e;
        r8 = r196.A0J;
        r7 = ((X.C1809981b) r10).A01;
        X.C14360o3.A0B(r8, 3);
        X.C14360o3.A0B(r7, 4);
        ((X.C8H2) new X.C184588Gz(r10, new X.ME5(18, new X.C184578Gy(r8, r2, r7), r4, r2)).A00.A00()).EDv();
        r54 = new X.C8HB(r4, r196.A0R, r196.A0V, r196.A0h, r92, r197, new X.C8HA(r196), r196.A1P, r196.A1Z);
        r196.A27 = r54;
        r52 = new X.C8HD(r4, r196.A0V, r3, r196.A0h, r197, r196.A1P, r196.A1Z, r196.A2B);
        r12 = r196.A1e;
        r10 = r196.A09;
        r9 = r196.A0Q;
        X.C14360o3.A0B(r10, 1);
        X.C14360o3.A0B(r9, 2);
        r17 = new X.C8HG(r12, new X.ME5(22, r10, r9, r4));
        r63 = new X.C8HI(r4, r196.A0D, r196.A0M, r196.A0N, r119, r196.A0V, r78, r196.A0h, r65, r79, r196.A0n, r196.A0o, r11, r56, r197, r196.A0x, r62, r75, r83, r196.A1H, r59, r74, r2, r104, r196.A1P, r72, r196.A1Z, r22, r17, r196.A1e, r93, r47, r196.A1z, r196.A21, r54);
        r196.A0k = r63;
        X.AbstractC58232lf.A00(r103, r4.A00).A06(r196.A0J, new X.C8IZ(r196));
        r50 = new X.C184858Ia(r196.A0V, r49, r3, r196.A0h, r197, r196.A1e, r196.A2B);
        r196.A1a = r50;
        r48 = new X.C184878Ic(r49, r3, r197, r196.A2B);
        r196.A1c = r48;
        r47 = new X.C184898Ie(r3, r197, r196.A2B);
        r46 = new X.C184918Ig(r3, r197, r196.A2B);
        r79.A06 = r63;
        r8 = r196.A1P;
        r8.A04 = new X.C184938Ii(r196);
        r8.A03 = new X.C184948Ij(r14, r196, r90);
        ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r196.A0h).A0K.getWidth();
        ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r196.A0h).A0K.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x18db, code lost:
    
        if (X.C6PX.A00(r196.A09) == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x18dd, code lost:
    
        r15 = r196.A0V;
        r13 = r196.A09;
        r12 = r196.A0Q;
        r10 = r63.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x18e7, code lost:
    
        if (r10 != null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x18e9, code lost:
    
        r10 = new X.C8HV(r63);
        r63.A09 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x18f0, code lost:
    
        r11 = r196.A1e;
        r9 = r196.A1X.A00;
        r8 = r196.A1P;
        r7 = r196.A0h;
        r196.A10.getModuleName();
        r4 = new X.C184978Im(r13, r9, r12, r15, r7, r10, r82, r83, r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x191a, code lost:
    
        r88.A06.A06(r196.A0J, new X.C8J7(r4, r196));
        r4.A07 = r3;
        r196.A1P.A04(r4);
        r63.A08 = r4;
        r196.A1P.A04(r63);
        ((X.C8JA) r59.A00.A00()).EYG(r63);
        r7 = r196.A1Z.A00();
        r9 = r196.A09;
        r8 = r196.A0M.A00();
        r7 = r7.AhT();
        X.AbstractC13880nE.A0r(r7, new X.C8JH(r9, r7, r8));
        r37 = new X.C8JI(r196.A0J, r196.A0Q, r196.A0V, r63, r45, r196.A1H, r196.A1P);
        r4 = r196.A0C;
        X.C14360o3.A0B(r4, 0);
        r11 = r37.A09;
        r10 = r37.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x1995, code lost:
    
        if (X.AbstractC195888lY.A01(r10.getApplicationContext(), r11) == false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x1997, code lost:
    
        r9 = new X.C24070AmD(r4, r37);
        r8 = X.AbstractC195888lY.A00();
        r7 = r4.getContext();
        X.C14360o3.A07(r7);
        r8.A01(r7, r11, r9, "sup:SupDelegate_SETUP_GLASSES_CALLBACK");
        X.C37101o8.A00(X.AbstractC195888lY.A00()).A00(r10, r11, new X.C56756PGy(r37), "sup:SupDelegate|SupLiveDelegate_ADD_CB");
        X.C8JI.A04(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x19c5, code lost:
    
        r7 = (java.util.Set) r196.A0V.A07.A00;
        r18 = X.C81S.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x19d5, code lost:
    
        if (r7.contains(r18) != false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x19dd, code lost:
    
        if (r7.contains(r95) == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x19e5, code lost:
    
        if (X.AbstractC25351Lp.A01(r196.A0Q) == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x1b3e, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x1a4e, code lost:
    
        r196.A1R = r21;
        r7 = r196.A09;
        r4 = (X.C89P) new X.C52942bb(X.AbstractC183548Cd.A00((androidx.fragment.app.FragmentActivity) r7, r196.A0Q), (X.InterfaceC018407e) r7).A00(X.C89P.class);
        r196.A1n = r4;
        r4 = r197.A18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x1a74, code lost:
    
        if (r4 == null) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x1a7a, code lost:
    
        if (r4.A00 != X.EnumC189548aZ.A08) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x1a7c, code lost:
    
        r4 = r197.A13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x1a7e, code lost:
    
        if (r4 == null) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x1a82, code lost:
    
        if (r4.A04 == null) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x1a84, code lost:
    
        X.C1DW.A00(r196.A0Q).A00(r197.A18.A04);
        r196.A0q.A00.Egh(false);
        r196.A1Z.A00().CN1();
        r4 = r196.A1n;
        r8 = new com.instagram.clips.template.creation.model.ClipsTemplateModel(r197.A0B, r197.A13.A04.F4L(), r197.A18.A05, r197.A18.A04.getId(), r197.A18.A04.A2a());
        r13 = r4.A0S;
        r13.Egh(X.EnumC1828289c.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x1ad5, code lost:
    
        if (X.C14360o3.A0K(r4.A05, r8) != false) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x1ad7, code lost:
    
        r4.A05 = r8;
        r4.A0B = r8.A04;
        r10 = r8.A01;
        r4.A04 = r10;
        r4.A02 = r8.A00;
        r4.A09 = r8.A02;
        r12 = r8.A03;
        r4.A0C = r12;
        r15 = r4.A0I;
        r11 = X.AbstractC141776au.A00(r15);
        r8 = new X.C9D0(r15, r10, (X.InterfaceC23621Ds) null, 12);
        r9 = X.C05F.A00;
        X.AbstractC23641Du.A03(r9, r103, r8, r11);
        r7 = r4.A0J;
        r7.A00 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x1b07, code lost:
    
        if (r10 == null) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x1b09, code lost:
    
        r8 = r10.BsT();
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1b0d, code lost:
    
        if (r8 == null) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x1b0f, code lost:
    
        r10 = 0;
        r28 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x1b18, code lost:
    
        if (r28.hasNext() == false) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x1b1a, code lost:
    
        r11 = r28.next();
        r19 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x1b20, code lost:
    
        if (r10 >= 0) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x1b2a, code lost:
    
        r11 = (X.InterfaceC110074xc) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x1b30, code lost:
    
        if (X.AbstractC189168Zk.A03(r11) == false) goto L929;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x1b32, code lost:
    
        r7.A03.put(java.lang.Integer.valueOf(r10), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x1b3b, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x1b22, code lost:
    
        X.AbstractC16960so.A1U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x1b29, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x2484, code lost:
    
        r8 = r7.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x2486, code lost:
    
        if (r8 == null) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x2488, code lost:
    
        r8 = r8.Bp4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x248c, code lost:
    
        if (r8 == null) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x248e, code lost:
    
        r8 = r8.CFe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x2492, code lost:
    
        if (r8 == null) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x2494, code lost:
    
        r8 = X.AbstractC88593xJ.A01(null, X.AbstractC75353a2.A00(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x249e, code lost:
    
        if (r8 == null) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x24a0, code lost:
    
        r8 = r8.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x24a2, code lost:
    
        if (r8 == null) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x24a4, code lost:
    
        r11 = X.AbstractC50633MWu.A03(r7.A01.getApplicationContext(), r7.A02, new X.OUQ(r8, "ClipsTemplateReusableAssetViewModel", true, false, false));
        r11.A00 = new X.C215799gv(r7);
        X.C1GJ.A06(r11, 74275874, 2, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x24d2, code lost:
    
        r7 = r4.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x24d8, code lost:
    
        if (r7.A0s() == false) goto L855;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x24da, code lost:
    
        r8 = X.C1DW.A00(r4.A0K).A02(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x24e4, code lost:
    
        if (r8 == null) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x24ea, code lost:
    
        if (r4.A0H() != false) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x24f0, code lost:
    
        if (r4.A0I() != false) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x24f6, code lost:
    
        if (r4.A0K() == false) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x24f8, code lost:
    
        r4.A0M.A03(r8);
        r4.A0R.Egh(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x2508, code lost:
    
        if (r4.A0M() == false) goto L853;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x250a, code lost:
    
        r7 = X.EnumC1828289c.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x250c, code lost:
    
        r13.Egh(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x2513, code lost:
    
        if (r4.A0M() == false) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x2515, code lost:
    
        X.AbstractC23641Du.A05(r103, new X.PYv(r4, null, 1), X.AbstractC141776au.A00(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x2527, code lost:
    
        X.AbstractC23641Du.A03(r9, r103, new X.C206649Cv(r4, null, 0), X.AbstractC141776au.A00(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x3a48, code lost:
    
        r7 = X.EnumC1828289c.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x3a4c, code lost:
    
        X.C89P.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x3a51, code lost:
    
        r7.A0g(null);
        r15.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x253f, code lost:
    
        if ("story_selfie_reply".equals(r197.A2q) != false) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x2541, code lost:
    
        r9 = new X.C8JQ(r196);
        r4 = r196.A0Q;
        r4 = r196.A0J;
        r8 = new X.C57012jc((android.view.ViewStub) r4.requireViewById(com.facebook.R.id.previous_frame_overlay_stub));
        r4 = r196.A1e;
        r4 = r196.A0V;
        r4 = r196.A1Z;
        r4 = r196.A0h;
        r4 = r196.A0C;
        r4 = r196.A1W;
        r4 = r196.A1z;
        r4 = r196.A0o;
        r4 = r196.A0I;
        r4 = r196.A1K;
        r10 = r196.A0J;
        r4 = r196.A0Q;
        X.C14360o3.A0B(r4, 0);
        r4 = new X.C8JT(r4, r4, r196.A0u.A0C, r53, r77, r4, r4, r196.A0M.A00(), r4, r8, r4, r49, r4, r89, r63, r79, r196.A0n, r4, r14, r56, r4, r197, r9, r75, r83, r74, r4, r4, r4, r17, r4, r80, r81, r27, (X.C8JS) new X.C52942bb(new X.C8JR(r4), r10).A00(X.C8JS.class), r2, r197.A0N(), r196.A1p, r68, r4, r196.A21, r196.A26, r196.A2B);
        r196.A1i = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x2614, code lost:
    
        r3.A0E = r4;
        r7 = X.C81U.A00;
        r8 = r63.A0m;
        r8.A0B.put(r7, r4);
        r10 = r65.A00;
        ((X.InterfaceC184358Fz) r10.A00()).A81(r7, r196.A1i);
        r9 = (X.InterfaceC184358Fz) r10.A00();
        r8 = X.C128535rM.A00;
        r7 = new X.C8L6(r79);
        r9.A81(r8, new X.C8L7(r7));
        ((X.InterfaceC184358Fz) r10.A00()).A81(r18, new java.lang.Object());
        ((X.InterfaceC184358Fz) r10.A00()).A81(X.C81R.A00, r54);
        r8 = (X.InterfaceC184358Fz) r10.A00();
        r38 = X.C1811381p.A00;
        r8.A81(r38, new java.lang.Object());
        r4 = r196.A0Q;
        r10 = r196.A09;
        r4 = r196.A0C;
        r15 = r196.A0J;
        r14 = r196.A0V;
        r9 = (X.C8LA) new X.C52942bb((X.InterfaceC018407e) r10).A00(X.C8LA.class);
        r8 = new X.C8LB(r94);
        r13 = r196.A0M;
        r12 = r196.A1e;
        r11 = r196.A0h;
        r7 = r196.A01;
        r4 = r197.A12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x26a7, code lost:
    
        if (r4 == null) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x26a9, code lost:
    
        r153 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x26ad, code lost:
    
        if (r4.A00 != null) goto L721;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x26b1, code lost:
    
        r53 = new X.C8LC(r10, r4, r7, r77, r87, r15, r8, r13, r94, r4, r14, r11, r86, r9, r3, r12, r76, r153);
        r196.A1Y = r53;
        r11 = r196.A1e;
        r10 = r196.A09;
        r9 = r196.A21;
        r8 = r196.A0h;
        r7 = r196.A0Q;
        X.C14360o3.A0B(r10, 1);
        X.C14360o3.A0B(r8, 5);
        X.C14360o3.A0B(r7, 7);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x26fa, code lost:
    
        if (r9 == null) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x26fc, code lost:
    
        r4.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x26ff, code lost:
    
        r4.add(r3);
        r4.add(r93.A00());
        r42 = new X.C8LJ(r11, new X.C29722D8s(4, r10, r3, r4, r8, r197, r7));
        r196.A0X = r42;
        r17 = X.AbstractC150276pb.A00(new X.C8LL(r196), new X.InterfaceC143366db[0]);
        r196.A1y = r17;
        r8 = ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r196.A0h).A0K.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x2742, code lost:
    
        if (r197.A3t == false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x2744, code lost:
    
        r19 = new X.C8LM(new X.C58472Pvx(r8, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x2752, code lost:
    
        r8 = ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r196.A0h).A0K.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x275e, code lost:
    
        if (r197.A3t == false) goto L850;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x2760, code lost:
    
        r18 = new X.C8LM(new X.C58472Pvx(r8, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x276e, code lost:
    
        r40 = X.AbstractC09440dt.A01(new X.C8LN(r196));
        r196.A2D = r40;
        r141 = new X.C8LT(r196.A0M.A00(), r196.A0V, r3, r196.A0h, r63, r196.A0n, r196.A0u, r196.A10, r196.A1F, r50, r2, r2, r196.A1i, new X.C8LO(r196), new X.C8LP(r196), new X.C8LQ(r196), new X.C8LR(r196), new X.C8LS(r196), r40, r196.A08);
        r182 = new com.instagram.creation.capture.quickcapture.save.CachingVideoSaver();
        r45 = new X.C8LZ(r196.A09, r196.A1X.A00, r196.A0J, r94, r196.A0Q, r42, r3, r196.A0h, r63, r196.A0n, r197, r196.A1G, r134, r53, r182, r196.A1e, r93, r85, r196.A1u, r141, r17, r196.A1z, r2, r196.A21, r19, r2, new X.C8LX(r196), new X.C8LY(r196), r197.A3W);
        r196.A0b = r45;
        r25 = new X.C8MT((android.view.ViewGroup) r196.A1X.A00.requireViewById(com.facebook.R.id.post_capture_texture_view_container), r196.A0Q, r196.A0h, r196.A0n);
        r15 = r196.A0Q;
        r143 = r196.A09.getApplicationContext();
        r14 = r196.A0n;
        r13 = r196.A1u;
        r12 = r196.A1e;
        r11 = r196.A0S;
        r4 = r3.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x2877, code lost:
    
        if (r4 == null) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x2879, code lost:
    
        r155 = r4.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x287d, code lost:
    
        r44 = new X.C8MV(r143, r196.A01, r15, r11, r42, r196.A0h, r14, r12, r13, r141, r17, X.C8M0.A00(r196.A0Q), r155, r197.A2i, r197.A3W);
        r196.A0e = r44;
        r8 = r196.A09;
        r7 = r196.A0Q;
        X.C14360o3.A0B(r8, 0);
        X.C14360o3.A0B(r7, 1);
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x28c7, code lost:
    
        if (X.C18U.A06(r108, r7, 2342173836922864676L) == false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x28c9, code lost:
    
        r17 = new X.C8MX(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x28d0, code lost:
    
        r36 = new X.C185948Mo(r196.A09, r196.A0C, r196.A1X.A00, r196.A0J, r94, new X.C185938Mn(r196), r196.A0Q, r196.A0V, r49, r42, r3, r44, r78, r196.A0h, r89, r196.A0n, r197, new X.C185918Ml(r196), new X.C185908Mk(r196), r196.A1G, r25, r134, r179, r26.A01, r53, r182, r196.A1e, r197.A0N(), r93, r196.A1z, r196.A21, r18, r17, new X.C185898Mj(r196), new X.C185928Mm(r196));
        r196.A0f = r36;
        r35 = new X.C8NU(r196.A09, r196.A01, r196.A0Q, r196.A0V, r3, r196.A0h, r196.A0j, r196.A0n, new X.C8NT(r196), r25, r36, r197.A0N(), r93);
        r196.A0g = r35;
        r159 = new X.C187058Qy(r196.A09, r4, r196.A0J, r196.A0Q, r196.A0h, r4, r104, r196.A1Z, r196.A1z);
        r10 = r196.A0n;
        r143 = r196.A0J.requireActivity();
        r9 = r196.A0Q;
        r8 = r196.A0h;
        r7 = r196.A0j;
        r158 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x29d5, code lost:
    
        if (r4 == null) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x29d7, code lost:
    
        r158 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x29d9, code lost:
    
        r33 = new X.C8RZ(r143, r9, r42, r45, r3, r36, r35, r8, r7, r10, r25, r72, r2, r197.A27, r196.A10.getModuleName(), r158);
        r196.A0Z = r33;
        r32 = new X.C187128Rf(r196.A0M, r196.A0V, r42, r33, r45, r3, r36, r35, r196.A0h, r63, r196.A0n, r197, r196.A10, r196.A1F, r53, r196.A1i, r196.A1m, r2, r68, r4);
        r196.A14 = r32;
        r9 = r196.A19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x2a4b, code lost:
    
        if (r9 == null) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x2a4d, code lost:
    
        r9.A01 = new X.C9KD(r196.A0B, r33, r45, r3, r36, r196.A0n, r197, r196.A1e, r68, new X.C9KE(r196));
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x2a75, code lost:
    
        r4 = new X.C187138Rg(r196);
        r7 = r36.A11;
        r7.add(r4);
        r7.add(r49.A0Q);
        r69.A06(r36);
        r196.A1m.A01 = new X.C187148Rh(r196);
        r31 = new X.C187198Rm(r196.A1X.A00, r196.A0B, r196.A01, r196.A10, r29, r33, r45, r3, r36, r196.A0h, r63, r196.A0n, r91, r197, r32, r134, r182, r196.A1e, r141, r196.A1z, r196.A2B, new X.RunnableC187188Rl(r196), r196.A2C, new X.C187158Ri(r196), new X.C187168Rj(r196), new X.C187178Rk(r196), r196.A08);
        r196.A0a = r31;
        r61.A06(r196.A0J, new X.C8SV(r196));
        r11 = r196.A1e;
        r12 = r196.A09;
        r10 = r196.A0Q;
        X.C14360o3.A0B(r12, 2);
        X.C14360o3.A0B(r10, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x2b2d, code lost:
    
        if (r197.A3q == false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x2b2f, code lost:
    
        r9 = new X.C8SW(r10, r11, new X.ME5(19, r12, r45, r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x2b3f, code lost:
    
        r29 = new com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController(r84, r196.A0J, r196.A0Q, r192, r3, r196.A1z);
        r196.A29 = r29;
        r4 = r196.A0Q;
        r4 = r196.A1e;
        r4 = r196.A0J;
        r4 = r196.A0n;
        r10 = new X.C8SY(r196);
        r4 = r196.A1z;
        r15 = r196.A0V;
        r8 = new X.C8SZ(r196);
        r137 = r197.A0N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x2b7e, code lost:
    
        if (r5 == null) goto L847;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x2b80, code lost:
    
        r7 = r5.A0G;
        r14 = r5.A04;
        r13 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x2b88, code lost:
    
        r12 = r196.A0h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x2b8e, code lost:
    
        if (X.AbstractC185298Jv.A05(r4) != false) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x2b96, code lost:
    
        if (X.AbstractC185298Jv.A01(r196.A0Q) != false) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x2b98, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x2b9a, code lost:
    
        r143 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x2b9e, code lost:
    
        if (r197.A2c == null) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x2ba0, code lost:
    
        r143 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x2ba2, code lost:
    
        r4 = r197.A12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x2ba4, code lost:
    
        if (r4 == null) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x2ba6, code lost:
    
        r144 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x2baa, code lost:
    
        if (r4.A00 != null) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x2bae, code lost:
    
        r27 = new com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController(r84, r196.A0C, r4, r13, r14, r4, r67, r15, r12, r4, r10, r9, r4, r66, r2, r2, r137, r4, r11, r68, r8, r7, r143, r144);
        r196.A1j = r27;
        r197.A0t.A00.A0E(r27);
        r27.A07 = r3;
        r28 = new X.C8TI(r196.A09, r196.A0Q, r196.A0T, r196.A0V, r3, r63, r65, r91, r9, r196.A1Z, r196.A1e, r93, r197.A3t);
        r196.A1O = r28;
        r26 = new X.C8TN(r196.A09, r196.A0T.requireViewById(com.facebook.R.id.quick_capture_bottom_shadow_overlay), r196.A0G, r196.A0H, r196.A0Q, r196.A0V, r3, r63, r65, r196.A0m, r91, r197, r75, r196.A1H, r59, r196.A1P, r72, r196.A1Z, r22, r196.A1e, r196.A1i, r93, r196.A2B, r197.A3k, A05());
        r196.A0c = r26;
        r69.A06(r26);
        r2.add(r26);
        r4 = r196.A0n;
        r8 = r196.A2B;
        r7 = r196.A0m;
        r4 = r196.A0V;
        r4 = r196.A1e;
        r4 = new X.C8TS(r4, r33, r26, r3, r7, r4, r4, r93, r8);
        r196.A0r.A01 = r4;
        ((X.C88E) r92).A01 = r4;
        r4 = r196.A0J;
        r4 = r196.A0Q;
        r12 = r196.A0T;
        r4 = r196.A09;
        r4 = r196.A1i;
        r4 = r196.A0L;
        r4 = r196.A21;
        r4 = r196.A19;
        r155 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x2ce4, code lost:
    
        if (r2 == null) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x2ce6, code lost:
    
        r155 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x2ce8, code lost:
    
        r25 = new X.C8TT(r4, r12, (android.view.ViewGroup) r12.requireViewById(com.facebook.R.id.video_sticker_ltr_holder), (android.view.ViewGroup) r196.A0T.requireViewById(com.facebook.R.id.pre_capture_interactive_drawable_container_holder), (android.view.ViewGroup) r196.A0T.requireViewById(com.facebook.R.id.post_capture_interactive_drawable_container_holder), r4, r4, r196.A0M, r4, r119, r4, r49, r33, r31, r45, r26, r3, r36, r196.A0h, r24, r63, r4, r196.A0r, r4, r62, r196.A1G, r59, r72, r46, r53, r52, r50, r47, r48, r22, r4, r4, r93, r58, r68, r4, r2, r54, r196.A2B, r196.A08, r155);
        r196.A0Y = r25;
        r196.A10.A00 = r25;
        r9 = new X.BBw[]{r26, r3};
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x2d81, code lost:
    
        r7 = r9[r8];
        X.C14360o3.A0B(r7, 0);
        r4 = r25.A0k;
        r4.add(r7);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x2d93, code lost:
    
        if (r8 < 2) goto L931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x2d95, code lost:
    
        r7 = r197.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x2d97, code lost:
    
        if (r7 == null) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x2d99, code lost:
    
        r4.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x2d9e, code lost:
    
        r7 = r196.A1H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x2da0, code lost:
    
        if (r7 == null) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x2da2, code lost:
    
        r7.A05 = r63;
        r7.A03 = r26;
        r4 = r7.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x2dac, code lost:
    
        if (r4 == null) goto L856;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x2dae, code lost:
    
        r4.EgC(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x3a60, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x2db3, code lost:
    
        r9 = r196.A1e;
        r86 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x2db9, code lost:
    
        if (r196.A0N == null) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x2dbb, code lost:
    
        r86 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x2dbd, code lost:
    
        r11 = r197.A3y;
        r8 = r197.A43;
        r89 = X.AbstractC185298Jv.A05(r196.A0Q);
        r90 = r197.A22.booleanValue();
        r10 = r196.A0Q;
        X.C14360o3.A0B(r10, 0);
        r9 = (X.C1809981b) r9;
        X.C8TX.A01(r9.A01, r86, r11, r8, r89, r90, X.C18U.A06(r100, r10, 36325957216319008L));
        X.C8TX.A00(r9.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x2df1, code lost:
    
        if (X.AbstractC188508Wp.A00 != null) goto L781;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x2df3, code lost:
    
        X.AbstractC188508Wp.A00 = X.AbstractC19750y3.A01("GalleryMetadataPreferences");
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x2dfb, code lost:
    
        r5 = X.AbstractC188518Wq.A00(r196.A0Q);
        r5.A00 = null;
        r5.A01.A03(X.C188528Wr.class);
        r7 = r196.A0J.requireContext().getResources();
        r168 = r7.getDimensionPixelSize(com.facebook.R.dimen.asset_picker_redesign_sticker_height);
        r167 = r7.getDimensionPixelSize(com.facebook.R.dimen.asset_picker_static_sticker_last_row_padding);
        r5 = new X.C188548Wt(r196);
        r196.A0P = r5;
        r197.A0R.A00(r5);
        r5 = r196.A0n.A02;
        r4 = "story_selfie_reply".equals(r197.A2q);
        r9 = r5.A01;
        r9.A0T = r4;
        r9.A0U = r197.A3m;
        r9.A0S = r197.A3Z;
        r4 = r197.A1I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x2e4a, code lost:
    
        if (r4 == null) goto L785;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x2e4c, code lost:
    
        r8 = r4.A00;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x2e51, code lost:
    
        if (r8 == 9) goto L786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x2e54, code lost:
    
        r9.A0M = r4;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x2e5b, code lost:
    
        if (r197.A0B != X.C22P.A2S) goto L789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x2e5d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x2e5e, code lost:
    
        r9.A0N = r4;
        r4 = r196.A0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x2e62, code lost:
    
        if (r4 == null) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x2e64, code lost:
    
        r10 = r196.A0Q;
        r9 = new X.C188558Wu(r7, r4, r196);
        X.C14360o3.A0B(r10, 0);
        r8 = new X.C25621Ms(r10, -2);
        r8.A09(X.C05F.A0N);
        r8.A0B("creatives/get_unlockable_sticker_nux/");
        r8.A0P(null, X.C188568Wv.class, X.C188578Ww.class, false);
        r5 = r8.A0N();
        r5.A00 = new X.C188588Wx(r9, r10);
        X.C1GJ.A03(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x2e95, code lost:
    
        r14 = r196.A10;
        r13 = r196.A0M;
        r11 = r196.A1F;
        r10 = r196.A0V;
        r12 = r196.A1e;
        r9 = r196.A1z;
        r8 = r196.A0n;
        r7 = r196.A1m;
        r4 = r196.A0h;
        X.C14360o3.A0B(r11, 3);
        X.C14360o3.A0B(r10, 5);
        X.C14360o3.A0B(r9, 8);
        X.C14360o3.A0B(r7, 11);
        X.C14360o3.A0B(r4, 12);
        r5 = new X.C188598Wy(r13, r14, r10, r31, r45, r4, r63, r8, r197, r11, r72, r12, r7, r9);
        r196.A13 = r5;
        r50.A02 = new X.C188608Wz(r5);
        r48.A01 = new X.C8X0(r5);
        r47.A01 = new X.C8X1(r5);
        r46.A01 = new X.C8X2(r5);
        r52.A01 = new X.C8X3(r5);
        r52.A01 = new X.C8X3(r5);
        r10 = r196.A1e;
        r9 = r196.A0Q;
        r11 = r196.A0M;
        r8 = r196.A1F;
        r91 = r196.A10.getModuleName();
        r7 = r196.A0V;
        X.C14360o3.A0B(r9, 1);
        X.C14360o3.A0B(r8, 4);
        X.C14360o3.A0B(r7, 6);
        r16 = new X.C8X4(r10, new X.MHZ(r63, r7, r8, r11, r9, r91, 2));
        r10 = r196.A1e;
        r8 = r196.A0j;
        r4 = r196.A0v;
        r22 = new X.C8X5(r8, r197, r4, r10);
        r196.A16 = r22;
        r4 = r196.A0J;
        r4 = r196.A0x;
        r4 = r196.A10;
        r4 = r196.A0M;
        r4 = r196.A0V;
        r4 = r196.A1i;
        r4 = r196.A0T;
        r15 = r196.A0C;
        r4 = r196.A0m;
        r4 = r196.A21;
        r4 = r196.A22;
        r14 = r196.A0I;
        r13 = r196.A1F;
        r4 = r196.A0R;
        r4 = r196.A0n;
        r4 = r196.A1K;
        r4 = r196.A0N;
        r4 = r196.A1J;
        r4 = r196.A0H;
        r12 = r196.A0h;
        r9 = new X.C8X6(r196);
        r8 = new X.C8X7(r196);
        r7 = new X.C8X8(r196);
        X.C14360o3.A0B(r4, 3);
        X.C14360o3.A0B(r4, 9);
        X.C14360o3.A0B(r4, 12);
        X.C14360o3.A0B(r15, 13);
        X.C14360o3.A0B(r14, 22);
        X.C14360o3.A0B(r13, 23);
        X.C14360o3.A0B(r12, 34);
        r16 = new X.C8XA(r10, new X.C8X9(r4, r15, r4, r14, r4, r4, r4, r4, r4, r4, r45, r3, r16, r12, r63, r4, r4, r56, r197, r4, r4, r5, r13, r4, r4, r28, r37, r21, r10, r2, r4, r58, r4, r4, r9, r8, r7, r40));
        r196.A17 = r16;
        r4 = new X.C8XV(r196.A0N, r196.A0V, r196.A0W, r25, r33, r31, r45, r26, r3, r63, r196.A0m, r196.A0n, r4, r196.A0r, r197, new X.C8XU(r196), r196.A0x, r5, r16, r75, r196.A1H, r59, new X.C8XH(r196.A0J, r196.A0n.A02, new X.C8XG(r196), r196.A1e), r37, r21, r72, r46, r52, r196.A1Z, r50, r47, r48, r196.A1e, r196.A1i, r159, r196.A21, r196.A23, r2, r54);
        r196.A0l = r4;
        r63.A0B = r4;
        r8.A04 = r4;
        r54.A01 = r4;
        r10 = r196.A0n;
        r13 = r196.A1e;
        r9 = r197.A1h;
        r2.A08 = true;
        r2.A02 = r10;
        r2.A04 = r13;
        r2.A01 = r4;
        r2.A06 = r9;
        r2.A00 = r3;
        r2.A03 = r3;
        r7 = r10.A02;
        X.C14360o3.A0B(r7, 3);
        r9 = new X.C8XW(r3, r4, r7, r5);
        r8 = r196.A0Q;
        r7 = r196.A0J;
        X.C14360o3.A0B(r8, 2);
        X.C14360o3.A0B(r7, 3);
        new X.C82K(r13, X.C05F.A00, X.C8XX.A00, new X.ME5(27, r9, r8, r7), new X.ME5(28, r9, r8, r7), true);
        r9 = r196.A0u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x312c, code lost:
    
        if (r9.A28 != X.C05F.A02) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x312e, code lost:
    
        r12 = r196.A0C;
        r8 = r196.A0T.getContext();
        r11 = r196.A09;
        r7 = r196.A0Q;
        r21 = new com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController(r11, r8, r12, r84, r196.A0J.getViewLifecycleOwner(), r7, r33, r45, r3, r9, r20, r20, X.AbstractC43895Jb5.A00(r8, r7, new java.lang.Object()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x3166, code lost:
    
        r196.A12 = r21;
        r196.A1P.A04(r4);
        r13 = r196.A0Q;
        r12 = r196.A0r;
        r11 = r196.A0n;
        r10 = r196.A2B;
        r9 = r196.A1e;
        r96 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x317b, code lost:
    
        if (r2 == null) goto L798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x317d, code lost:
    
        r96 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x317f, code lost:
    
        r196.A1q.A00().A0C = new X.C188668Xg(r196.A0T.requireViewById(com.facebook.R.id.quick_capture_top_shadow_overlay), r13, r4, r26, r3, r63, r11, r4, r12, r9, r196.A21, r10, r96);
        r7 = r28.A0T;
        r7.add(r3);
        r9 = r196.A21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x31ba, code lost:
    
        if (r9 == null) goto L803;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x31bc, code lost:
    
        r9.A0S.add(new X.AiC(r4, r196));
        r8 = r196.A21;
        X.C14360o3.A0B(r8, 0);
        r7.add(r8);
        r8 = r196.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x31d4, code lost:
    
        if (r8 == null) goto L803;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x31d6, code lost:
    
        r8.A01 = r63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x31da, code lost:
    
        r13 = r196.A0T.getContext();
        r12 = r196.A09;
        r11 = r196.A0Q;
        r10 = r196.A1e;
        r14 = r196.A0n;
        r9 = new X.C57012jc((android.view.ViewStub) r196.A1X.A00.requireViewById(com.facebook.R.id.layout_post_capture_recycler_stub));
        r8 = r196.A0h;
        X.C14360o3.A0B(r13, 0);
        X.C14360o3.A0B(r12, 1);
        X.C14360o3.A0B(r11, 2);
        X.C14360o3.A0B(r8, 9);
        r24 = new X.C188688Xi(r10, new X.C208359Ju(r12, r13, r11, r119, r9, r8, r4, r14, r82, r10));
        r10 = r196.A0J;
        r9 = r10.requireActivity();
        r8 = r196.A0Q;
        X.C14360o3.A0B(r8, 1);
        r11 = (X.C75E) new X.C52942bb(new X.C75D(r9, r8), r10).A00(X.C75E.class);
        r196.A24 = r11;
        r10 = r196.A0C;
        r9 = r196.A0T;
        r80 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x3259, code lost:
    
        if (r196.A21 == null) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x325b, code lost:
    
        r80 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x325d, code lost:
    
        r8 = new X.C188698Xj(r196);
        X.C14360o3.A0B(r10, 0);
        X.C14360o3.A0B(r9, 2);
        r20 = new X.C188708Xk(r10, r9, r197, r16, r8, r80);
        r196.A15 = r20;
        r7 = r196.A1e;
        r12 = r196.A0Q;
        r7 = r196.A1P;
        r7 = r196.A1Z;
        r7 = r196.A0n;
        r7 = r196.A09;
        r7 = r196.A0C;
        r7 = r196.A0T;
        r7 = r196.A0V;
        r7 = r196.A0J;
        r7 = r197.A0O;
        r7 = r196.A1W;
        r7 = r196.A0o;
        r7 = r196.A1H;
        r7 = r196.A21;
        r7 = r196.A0N;
        r7 = r196.A0M;
        r7 = r196.A0x;
        r7 = r196.A0j;
        r7 = r196.A1z;
        r7 = r196.A1N;
        r7 = r196.A1i;
        r7 = r196.A0I;
        r7 = r196.A1m;
        r7 = r196.A1u;
        r7 = r7.requireContext();
        X.C14360o3.A0B(r12, 0);
        r7 = new com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService(X.AbstractC142256bi.A00(r7, r12), r12, new X.C188728Xm());
        r10 = (X.C188748Xp) new X.C52942bb(new X.C188738Xo(r7), r7).A00(X.C188748Xp.class);
        r7 = r196.A0h;
        r7 = r196.A0u.A1I;
        r7 = r196.A04;
        r15 = r196.A0J;
        r13 = r196.A0Q;
        r9 = r196.A0V;
        X.C14360o3.A0B(r13, 0);
        X.C14360o3.A0B(r9, 1);
        r8 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel) new X.C52942bb(X.C186268Nu.A00(new X.C186258Nt(new X.BAO(30, r9, r13), new X.C0YZ(com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.class))), r15).A00(com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.class);
        r13 = r196.A0u.A0N();
        r14 = r197.A1H;
        X.C14360o3.A0B(r7, 8);
        X.C14360o3.A0B(r7, 9);
        X.C14360o3.A0B(r7, 10);
        X.C14360o3.A0B(r7, 12);
        X.C14360o3.A0B(r7, 15);
        X.C14360o3.A0B(r7, 34);
        X.C14360o3.A0B(r2, 35);
        X.C14360o3.A0B(r7, 36);
        X.C14360o3.A0B(r2, 37);
        X.C14360o3.A0B(r7, 39);
        X.C14360o3.A0B(r7, 40);
        X.C14360o3.A0B(r10, 44);
        X.C14360o3.A0B(r7, 47);
        X.C14360o3.A0B(r2, 48);
        X.C14360o3.A0B(r11, 49);
        X.C14360o3.A0B(r4, 50);
        X.C14360o3.A0B(r7, 52);
        X.C14360o3.A0B(r8, 53);
        X.C14360o3.A0B(r13, 54);
        r17 = new X.C188798Xv(r7, new X.C188788Xu(r7, r7, r7, r4, r7, r7, r7, r7, r7, r12, r7, r25, r33, r31, r26, r7, r7, r7, r63, r4, r65, r7, r7, r197, r7, r5, r20, r16, r7, r104, r8, r10, r7, r28, r7, r24, r72, r7, r7, r7, r2, r7, r7, r2, r4, r2, r2, r13, r7, r159, r7, r7, r11, r2, r17, r14, r7));
        r196.A1M = r17;
        r196.A1i.ESP(r17);
        r4.A01 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x3468, code lost:
    
        if (((java.util.Set) r196.A0V.A07.A00).contains(r38) == false) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x346a, code lost:
    
        if (r5 == null) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x3470, code lost:
    
        if (r5.A04 != null) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x3472, code lost:
    
        r11 = r196.A0Q;
        new X.C208679Lb(r196.A0J, r11, r196.A0V, r17, (X.C185158Jg) new X.C52942bb(new X.C185148Jf(r11), (X.InterfaceC018407e) r196.A09).A00(X.C185158Jg.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x349d, code lost:
    
        r13 = new X.C8Y1(r197, r20, r196.A1e, new X.C188818Xx(r196), new X.C188828Xy(r196), new X.C188838Xz(r196), new X.C8Y0(r196), new X.C188808Xw(r196));
        r196.A11 = r13;
        r4.A00 = r13;
        r196.A22.A00 = r13;
        r196.A1S = new X.C8Y3(r196.A09, r196.A10, r196.A0Q, r31, r3, r197, r196.A0x, r13, r5, r2, new X.C8Y2(r196));
        r12 = new X.C8Y5(r196.A0J, X.C8Y4.A05, r196.A0Q);
        r196.A0K = r12;
        r24 = new X.C8Y6(r12, r196.A0L, r196.A0S, r196.A0U, r196.A0V, r196.A0W, r42, r33, r45, r3, r36, r196.A0h, r196.A0i, r196.A0j, r196.A0n, r197, r196.A10, r16, r196.A1D, r17, r72, r196.A1W, r196.A1X, r53, r196.A1e, r2, r196.A1i, r196.A1m, r196.A1s, r196.A1t, r196.A1x, r196.A1z, r196.A2B);
        r196.A1B = r24;
        r196.A1C = new X.C8Y8(r196.A0C, r12, r196.A0L, r196.A0T, r196.A0U, r33, r31, r45, r3, r44, r36, r35, r196.A0n, r197, r196.A10, r16, r196.A1D, r196.A1X, r53, r196.A1e, r196.A1u, r196.A28, new X.C8Y7(r196), r40);
        r196.A1T = new X.C8YJ(r196.A0S, r196.A0W, r33, r31, r45, r3, r196.A0n, r196.A0r, r197, r62, r17, r196.A1N, r53, r196.A1e, r196.A1q, r196.A2B, r196.A2C, new X.C8YI(r196));
        r196.A1k = new X.C8YK(r196.A0V, r196.A0W, r33, r31, r45, r3, r44, r36, r35, r196.A0h, r196.A0j, r196.A0n, r197, r16, r27, r196.A1x, r196.A2B);
        r12 = r196.A0V;
        r11 = r196.A1m;
        r10 = r196.A0n;
        r9 = r196.A1e;
        r84 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x3680, code lost:
    
        if (r197.A3i == false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x3682, code lost:
    
        r84 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x3684, code lost:
    
        r2 = new X.C8YL(r196.A0C.requireViewById(com.facebook.R.id.camera_photo_texture_view), r196.A0S, r196.A0Q, r12, r3, r63, r10, r197, r20, r84, r9, r11, r19, r18, android.view.ViewConfiguration.get(r196.A09).getScaledMinimumFlingVelocity());
        r196.A1Q = r2;
        r7.add(r2);
        r13 = X.AbstractC150276pb.A00(new X.C8YO(r196), new X.C8YP());
        r196.A1w = r13;
        r2 = new X.C8YR(r196.A0C, r196.A0I, r196.A0T, r196.A0V, r196.A0W, r33, r31, r45, r26, r196.A0d, r44, r36, r35, r196.A0h, r196.A0j, r196.A0n, r197, r196.A0z, r196.A10, r21, r32, r22, r16, r24, r196.A1H, r17, r196.A1U, r196.A1X, r53, r196.A1b, r196.A1e, r27, r196.A1m, r196.A1q, r196.A1u, r196.A1x, r13, r29, new X.C8YQ(r196), r167, r168);
        r14 = r196.A1e;
        r3 = r196.A0n;
        r13 = r196.A0N;
        r12 = r196.A1H;
        r11 = r196.A1G;
        r14 = (X.C1809981b) r14;
        r10 = r14.A02;
        r10.A02(r25);
        r9 = r197.A05;
        X.C14360o3.A07(r9);
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r7 = r3.A02;
        X.C14360o3.A0B(r7, 2);
        r10.A02(new X.C8YS(r9, r8, r7));
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r197.A0M.getClass();
        r7 = r197.A0M.requireContext();
        r10.A02(new X.C8YT(r8, r7));
        r8 = r14.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x37b5, code lost:
    
        if (r12 == null) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x37b7, code lost:
    
        r8.A01(r12, X.EnumC1810181d.A11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x37bc, code lost:
    
        if (r13 == null) goto L820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x37be, code lost:
    
        r8.A01(r13, X.EnumC1810181d.A0p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x37c3, code lost:
    
        r9 = r197.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x37c5, code lost:
    
        if (r9 == null) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x37c7, code lost:
    
        r8.A01(new X.C24057Alt(r9), X.EnumC1810181d.A0j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x37d1, code lost:
    
        r8.A02(r2);
        r8.A02(r25.A0D);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r8.A02((X.InterfaceC1810781j) r7.A01(X.C8YU.class, new X.MHQ(r7, 46)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x37f2, code lost:
    
        if (r13 == null) goto L826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x37f4, code lost:
    
        r8.A02(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x37f7, code lost:
    
        r8.A02(r11);
        r2 = r196.A22;
        r2.A02 = r16;
        r2.A01 = r5;
        r2.A04 = r196.A1f;
        r2.A03 = r72;
        r2.A04.A06(r196.A0J, new X.C151846sU(new X.C8YV(r196)));
        r196.A2F = true;
        A02(r4, r4, r196.A0V.A08(), r196, r4);
        r2 = r196.A18;
        r15 = r196.A0C;
        r2 = r196.A0H;
        r2 = r196.A0J;
        r2 = r196.A1e;
        r2 = r196.A0T;
        r14 = r196.A2E;
        r13 = r196.A0G;
        r12 = r196.A1p;
        r11 = r196.A0m;
        r10 = r196.A1W;
        r9 = r196.A1Z;
        r8 = r196.A0o;
        r7 = r196.A1E;
        r5 = r196.A1K;
        r3 = r196.A1H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x385e, code lost:
    
        if (X.C11T.A08() == false) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x3860, code lost:
    
        X.C8ZB.A00(r13, r2, r2, r2, r63, r4, r11, r8, r4, r197, r2, r7, r3, r5, r17, r28, r10, r9, r2, r4, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x388f, code lost:
    
        r9 = r196.A09;
        r8 = r196.A1e;
        r7 = r196.A0Q;
        r5 = r196.A10;
        r4 = r196.A0V;
        r3 = r196.A2B;
        r2 = r196.A0d;
        X.C14360o3.A0B(r9, 0);
        X.C14360o3.A0B(r7, 2);
        X.C14360o3.A0B(r4, 4);
        X.C14360o3.A0B(r3, 5);
        r3 = new X.C8ZL(r8, new X.C29722D8s(3, r5, r2, r9, r3, r4, r7));
        r4.add(r3);
        r196.A1e.A82(r3);
        A03(r196);
        r4 = new java.lang.Object();
        r196.A0y.A00 = r4;
        r3 = r196.A0Q;
        X.C14360o3.A0B(r3, 0);
        r3.A04(X.C8ZN.class, r4);
        r7 = r196.A0V;
        r5 = r196.A0m;
        r4 = r197.A0S;
        X.C14360o3.A0B(r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x38fc, code lost:
    
        if (X.C18U.A06(r108, r4, 36319385916349847L) != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x3907, code lost:
    
        if (X.C18U.A06(r108, r4, 36319385916480921L) != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x3912, code lost:
    
        if (X.C18U.A06(r108, r4, 36319385916415384L) == false) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x3974, code lost:
    
        if (r197.A3m == false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x3976, code lost:
    
        r196.A0T.requireViewById(com.facebook.R.id.video_pog_in_note_camera_background).setVisibility(0);
        r196.A0T.requireViewById(com.facebook.R.id.quick_capture_top_shadow_overlay).setVisibility(8);
        r4 = r196.A0T;
        r3 = r196.A09;
        r4.setBackgroundColor(r3.getColor(X.AbstractC53242c7.A0D(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x39a3, code lost:
    
        if (r197.A0B != X.C22P.A4o) goto L842;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x39a5, code lost:
    
        r196.A1e.A82(new X.C24059Alv(r196));
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x39af, code lost:
    
        r4 = (X.C8NW) r196.A0d.A1h.get();
        r1 = r4.A1I.A0H;
        r3 = r4.A0l;
        r1.A06(r3, new X.C8ZO(r4));
        r4.A0n.A03.A06(r3.requireActivity(), new X.C8ZP(r4));
        X.AbstractC58232lf.A00(r103, r4.A1m.A08).A06(r3, new X.C8ZQ(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x39e9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x3914, code lost:
    
        r10 = r197.A05;
        r9 = r197.A0S;
        r8 = new android.graphics.drawable.GradientDrawable();
        r8.setStroke(r10.getResources().getDimensionPixelSize(com.facebook.R.dimen.abc_action_bar_elevation_material), r10.getColor(X.AbstractC53242c7.A0H(r10, com.facebook.R.attr.igds_color_gradient_blue)));
        r4 = new android.graphics.drawable.GradientDrawable();
        r4.setStroke(r10.getResources().getDimensionPixelSize(com.facebook.R.dimen.abc_action_bar_elevation_material), r10.getColor(X.AbstractC53242c7.A0H(r10, com.facebook.R.attr.igds_color_gradient_blue)));
        r4.setCornerRadius(r10.getResources().getDimensionPixelSize(com.facebook.R.dimen.abc_select_dialog_padding_start_material));
        r4.getRootView().setOnDragListener(new X.ViewOnDragListenerC23251ASm(r10, r8, r4, r4, r9, r7, r5, r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x39ea, code lost:
    
        r15.post(new X.B09(r13, r2, r2, r2, r63, r4, r11, r8, r4, r197, r2, r7, r3, r5, r17, r28, r10, r9, r2, r4, r12, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x3a22, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x2e53, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x2bac, code lost:
    
        r144 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x3a26, code lost:
    
        r11 = r196.A2B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x3a2a, code lost:
    
        r7 = false;
        r14 = null;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x3a30, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x3a33, code lost:
    
        r155 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x3a37, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x3a3b, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x26af, code lost:
    
        r153 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x3a3f, code lost:
    
        r4 = new X.C23865AhH();
        r196.A1i = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x19e7, code lost:
    
        r12 = r196.A1e;
        r11 = r196.A0J;
        r10 = r196.A0V;
        r9 = r197.A0l;
        r8 = r196.A0T;
        r7 = r196.A0Q;
        r4 = r196.A08;
        r4 = r197.A0v;
        r4 = r197.A1w;
        r4 = r197.A2n;
        r4 = r197.A25;
        r15 = r197.A2B;
        r13 = r196.A0M;
        X.C14360o3.A0B(r11, 1);
        X.C14360o3.A0B(r10, 3);
        X.C14360o3.A0B(r9, 4);
        X.C14360o3.A0B(r8, 5);
        X.C14360o3.A0B(r7, 6);
        r21 = new X.C172047lZ(r12, new X.C171127k3(r8, r11, r13, r63, r7, r10, r56, r9, r37, r4, r4, r4, r15, r4, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x1b42, code lost:
    
        r15 = r196.A0V;
        r13 = r196.A09;
        r12 = r196.A0Q;
        r9 = r63.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x1b4c, code lost:
    
        if (r9 != null) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x1b4e, code lost:
    
        r9 = new X.C8HV(r63);
        r63.A09 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x1b55, code lost:
    
        r11 = r196.A1e;
        r8 = r196.A1X.A00;
        r7 = r196.A1P;
        r130 = !"story_selfie_reply".equals(r197.A2q);
        r196.A10.getModuleName();
        r4 = new X.XZO(r13, r8, r12, r15, r9, r82, r83, r7, r11, r130);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x1b87, code lost:
    
        r11 = null;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x1b8b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x1b8e, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x1b91, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x3a66, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x1b96, code lost:
    
        if (r197.A3b == false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x1b98, code lost:
    
        r45.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x1b9b, code lost:
    
        r4 = null;
        r196.A1H = null;
        r196.A1F = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x3a6c, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x1bab, code lost:
    
        if (r197.A12 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x1bad, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A0S;
        X.C14360o3.A07(r4);
        r14 = r10.getModuleName();
        r8 = r197.A12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x1bbd, code lost:
    
        if (r8 == null) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x1bbf, code lost:
    
        r2 = new X.C8G2(r7, r4, r3, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x3a72, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x1bcd, code lost:
    
        if (r197.A1h == null) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x1bcf, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A0S;
        X.C14360o3.A07(r4);
        r14 = r10.getModuleName();
        r8 = r197.A1h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x1bdf, code lost:
    
        if (r8 != null) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x1be6, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x1e45, code lost:
    
        r2 = new X.C218769lm(r7, r4, r3, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x1be9, code lost:
    
        if (r197.A0a == null) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x1beb, code lost:
    
        X.C14360o3.A07(r197.A0S);
        r4 = r197.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x1bf2, code lost:
    
        if (r4 == null) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x1bf4, code lost:
    
        r2 = new X.C218709lg(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x3a78, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x1bfd, code lost:
    
        if (r197.A1c == null) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x1bff, code lost:
    
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A05;
        X.C14360o3.A07(r4);
        r14 = r10.getModuleName();
        r8 = r197.A1c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x1c0f, code lost:
    
        if (r8 == null) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x1c11, code lost:
    
        r2 = new X.C218859lv(r4, r7, r3, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x3a7e, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1c1f, code lost:
    
        if (r197.A1v == null) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x1c21, code lost:
    
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r115 = r10.getModuleName();
        r9 = r197.A1v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x1c31, code lost:
    
        if (r9 == null) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x1c33, code lost:
    
        r2 = new X.C218909m0(r7, r197.A0F, r8, r3, r9, r115);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x3a84, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x1c4a, code lost:
    
        if (r197.A1f == null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x1c4c, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A0S;
        X.C14360o3.A07(r4);
        r14 = r10.getModuleName();
        r8 = r197.A1f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x1c5c, code lost:
    
        if (r8 == null) goto L870;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x1c5e, code lost:
    
        r2 = new X.C218919m1(r7, r4, r3, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x3a8a, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x1c6c, code lost:
    
        if (r197.A1R == null) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x1c6e, code lost:
    
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A05;
        X.C14360o3.A07(r4);
        r14 = r10.getModuleName();
        r8 = r197.A1R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x1c7e, code lost:
    
        if (r8 == null) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x1c80, code lost:
    
        r2 = new X.C218889ly(r4, r7, r3, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x3a90, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x1c8e, code lost:
    
        if (r197.A1Y == null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x1c90, code lost:
    
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A1Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x1c9c, code lost:
    
        if (r4 == null) goto L874;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x1c9e, code lost:
    
        r2 = new X.C218729li(r7, r8, r3, r4, r10.getModuleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x3a96, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x1cae, code lost:
    
        if (r7 != null) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x1cb2, code lost:
    
        if (r197.A1j == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x1cb4, code lost:
    
        r8 = r197.A05;
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A1j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x1cc0, code lost:
    
        if (r4 == null) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x1cc2, code lost:
    
        r2 = new X.C218699lf(r8, r7, r3, r4, r10.getModuleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x3a9c, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x1cd4, code lost:
    
        if (r197.A1b == null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x1cd6, code lost:
    
        r8 = r197.A05;
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A1b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x1ce2, code lost:
    
        if (r4 == null) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x1ce4, code lost:
    
        r2 = new X.C218749lk(r8, r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x3aa2, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x1ced, code lost:
    
        if (r197.A1a == null) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x1cef, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A1a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x1cf6, code lost:
    
        if (r4 == null) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x1cf8, code lost:
    
        r2 = new X.C218689le(r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x3aa8, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x1d01, code lost:
    
        if (r197.A1m == null) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x1d03, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        X.C14360o3.A07(r197.A0S);
        r4 = r197.A1m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x1d0f, code lost:
    
        if (r4 == null) goto L882;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x1d11, code lost:
    
        r2 = new X.C218899lz(r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x3aae, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x1d1a, code lost:
    
        if (r197.A1l == null) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x1d1c, code lost:
    
        r8 = r197.A05;
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r197.A0M.getClass();
        r111 = X.AbstractC018607g.A00(r197.A0M);
        r4 = r197.A1l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x1d33, code lost:
    
        if (r4 == null) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x1d35, code lost:
    
        r2 = new X.C218939m3(r8, r111, r10, r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x3ab4, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x1d4a, code lost:
    
        if (r197.A0D == null) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x1d4c, code lost:
    
        r4 = r197.A05;
        X.C14360o3.A07(r4);
        X.C14360o3.A07(r197.A0S);
        r2 = new X.C218789lo(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x1d5f, code lost:
    
        if (r197.A1Z == null) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x1d61, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        X.C14360o3.A07(r197.A0S);
        r4 = r197.A1Z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x1d6d, code lost:
    
        if (r4 == null) goto L886;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x1d6f, code lost:
    
        r2 = new X.C218739lj(r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x3aba, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x1d78, code lost:
    
        if (r197.A0k == null) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x1d7a, code lost:
    
        r8 = r197.A05.getApplicationContext();
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A0k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x1d8a, code lost:
    
        if (r4 == null) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x1d8c, code lost:
    
        r2 = new X.C218799lp(r8, r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x3ac0, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x1d95, code lost:
    
        if (r197.A0j == null) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x1d97, code lost:
    
        r8 = r197.A05.getApplicationContext();
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x1da7, code lost:
    
        if (r4 == null) goto L890;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x1da9, code lost:
    
        r2 = new X.C218809lq(r8, r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x3ac6, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x1db2, code lost:
    
        if (r197.A1o == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x1db4, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A1o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x1dbb, code lost:
    
        if (r4 == null) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x1dbd, code lost:
    
        r2 = new X.C218979m7(r7, r3, r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x3acc, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x1dc6, code lost:
    
        if (r197.A1X == null) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1dc8, code lost:
    
        r9 = r197.A05;
        X.C14360o3.A07(r9);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A1X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x1dd4, code lost:
    
        if (r4 == null) goto L894;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1dd6, code lost:
    
        r2 = new X.C218959m5(r9, r7, r3, r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x3ad2, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1de5, code lost:
    
        if (r197.A1n == null) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1de7, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A1n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x1dee, code lost:
    
        if (r4 == null) goto L896;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x1df0, code lost:
    
        r2 = new X.C218969m6(r7, r3, r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x3ad8, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x1df9, code lost:
    
        if (r197.A1u == null) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x1dfb, code lost:
    
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A1u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x1e07, code lost:
    
        if (r4 == null) goto L898;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x1e09, code lost:
    
        r2 = new X.C218819lr(r7, r8, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x3ade, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x1e12, code lost:
    
        if (r197.A0E == null) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x1e14, code lost:
    
        r8 = r197.A05;
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x1e20, code lost:
    
        if (r4 == null) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x1e22, code lost:
    
        r2 = new X.C218879lx(r8, r4, r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x3ae4, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x1e2b, code lost:
    
        if (r197.A1g == null) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x1e2d, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A0S;
        X.C14360o3.A07(r4);
        r14 = r10.getModuleName();
        r8 = r197.A1g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x1e3d, code lost:
    
        if (r8 != null) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x1e44, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x1e53, code lost:
    
        if (r197.A0Y == null) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x1e55, code lost:
    
        r8 = r197.A05;
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1e61, code lost:
    
        if (r4 == null) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x1e63, code lost:
    
        r2 = new X.C218869lw(r8, r7, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x3aea, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1e6c, code lost:
    
        if (r197.A1W == null) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1e6e, code lost:
    
        r8 = r197.A05;
        X.C14360o3.A07(r8);
        r7 = r197.A0S;
        X.C14360o3.A07(r7);
        r4 = r197.A1W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x1e7a, code lost:
    
        if (r4 == null) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x1e7c, code lost:
    
        r2 = new X.C218849lu(r8, r7, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x3af0, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x1e85, code lost:
    
        if (r197.A1V == null) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x1e87, code lost:
    
        r9 = r197.A05;
        X.C14360o3.A07(r9);
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r7 = r197.A1V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x1e93, code lost:
    
        if (r7 == null) goto L906;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x1e95, code lost:
    
        r4 = r3.A10;
        X.C14360o3.A07(r4);
        r2 = new X.C218719lh(r9, r8, r3, r4, r7, r10.getModuleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x3af6, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1eb3, code lost:
    
        if (r197.A16 == null) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1eb5, code lost:
    
        r9 = r197.A05;
        X.C14360o3.A07(r9);
        r8 = r197.A0S;
        X.C14360o3.A07(r8);
        r7 = r197.A16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1ec1, code lost:
    
        if (r7 == null) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1ec3, code lost:
    
        r4 = r3.A10;
        X.C14360o3.A07(r4);
        r2 = new X.C218949m4(r9, r8, r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x3afc, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x1ed7, code lost:
    
        if (r197.A39 == false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x1ed9, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A0S;
        X.C14360o3.A07(r4);
        r2 = new X.C218839lt(r7, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x1eea, code lost:
    
        r7 = r197.A1d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1eec, code lost:
    
        if (r7 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1ef0, code lost:
    
        if ((r7 instanceof com.instagram.reels.musicpick.model.MusicPickStickerModel) == false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1efa, code lost:
    
        if (((com.instagram.reels.musicpick.model.MusicPickStickerModel) r7).A02.isEmpty() == false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1efc, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A0S;
        X.C14360o3.A07(r4);
        r2 = new X.C218829ls(r7, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x1f0f, code lost:
    
        if (r197.A0Z == null) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x1f11, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r4 = r197.A0S;
        X.C14360o3.A07(r4);
        r10.getModuleName();
        r8 = r197.A0Z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x1f20, code lost:
    
        if (r8 == null) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1f22, code lost:
    
        r2 = new X.C218759ll(r7, r4, r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x3b02, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1f33, code lost:
    
        if (r197.A2C.longValue() <= 0) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1f35, code lost:
    
        r7 = r197.A05;
        X.C14360o3.A07(r7);
        r2 = r197.A2C;
        X.C14360o3.A07(r2);
        r12 = r2.longValue();
        r4 = r3.A10;
        X.C14360o3.A07(r4);
        r2 = new X.C218929m2(r7, r3, r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x1f53, code lost:
    
        r158 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x1f5a, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1115, code lost:
    
        r165 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x10a4, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x1f5d, code lost:
    
        r111 = r196.A1X.A00.requireViewById(com.facebook.R.id.post_capture_floating_button_picker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x1f6a, code lost:
    
        r111 = r3.requireViewById(com.facebook.R.id.post_capture_floating_button_picker_stub);
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x0ff7, code lost:
    
        r2 = r197.A12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ff9, code lost:
    
        if (r2 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x1001, code lost:
    
        if (r2.A00() != true) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x1f70, code lost:
    
        r4 = X.C183458Bs.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0514, code lost:
    
        if (X.C14360o3.A0K(r5, r7) == false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0bf2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0daf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0dd9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0deb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0eaf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0ee6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x1f74  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x1f7b  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x1fab  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x1fbb  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x1fd9  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x1fec  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x2019  */
    /* JADX WARN: Removed duplicated region for block: B:872:0x231c  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x2347  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x235e  */
    /* JADX WARN: Removed duplicated region for block: B:888:0x234c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:893:0x23c2  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x23ca  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x23d3  */
    /* JADX WARN: Type inference failed for: r10v36, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r10v86, types: [java.lang.Object, X.2pF] */
    /* JADX WARN: Type inference failed for: r147v1, types: [X.9K8] */
    /* JADX WARN: Type inference failed for: r20v8, types: [X.Ai7] */
    /* JADX WARN: Type inference failed for: r2v104, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v131, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v389, types: [X.2ba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v412, types: [X.2ba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30, types: [X.83I] */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.82I, X.0Zx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v124, types: [X.8FR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v195, types: [X.8G1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v197, types: [X.8G1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r81v0, types: [X.86P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context, java.lang.Object, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r8v87, types: [X.8Fz] */
    /* JADX WARN: Type inference failed for: r8v91, types: [X.8Fz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81Z(final X.C81J r197) {
        /*
            Method dump skipped, instructions count: 15136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81Z.<init>(X.81J):void");
    }
}
