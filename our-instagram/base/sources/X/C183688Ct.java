package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.facebook.R;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.share.ShopShareInfo;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.8Ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183688Ct implements InterfaceC143326dX, InterfaceC1829489p, InterfaceC1829589q, InterfaceC1829689r, InterfaceC1821886c, InterfaceC191388dp, InterfaceC183698Cu, BBw, InterfaceC1810781j {
    public static final CallerContext A2B = CallerContext.A01("QuickCaptureEditController");
    public int A00;
    public long A01;
    public Bitmap A02;
    public View A03;
    public Medium A04;
    public C172257lu A05;
    public C187118Re A06;
    public C185948Mo A07;
    public C218719lh A08;
    public C191038cz A09;
    public C22920A8q A0A;
    public C81M A0B;
    public C81M A0C;
    public C8BD A0D;
    public C8JU A0E;
    public C38321qM A0F;
    public InfoCenterFactShareInfoIntf A0G;
    public InfoCenterShareInfoIntf A0H;
    public ProductShareConfig A0I;
    public C8F8 A0J;
    public C8F9 A0K;
    public ProductCollectionShareInfo A0L;
    public ShopShareInfo A0M;
    public Product A0N;
    public C183978Ee A0O;
    public C8F7 A0P;
    public C1816383s A0Q;
    public C8EZ A0R;
    public Integer A0S;
    public Runnable A0T;
    public Runnable A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public HashMap A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final float A0m;
    public final float A0n;
    public final Activity A0o;
    public final View A0p;
    public final AbstractC018607g A0q;
    public final C22P A0r;
    public final C9BW A0s;
    public final AbstractC59962oe A0t;
    public final C1819485e A0u;
    public final InterfaceC11380iw A0v;
    public final UserSession A0w;
    public final C1810981l A0x;
    public final C89F A0y;
    public final C8DN A0z;
    public final TargetViewSizeProvider A10;
    public final AnonymousClass874 A11;
    public final AnonymousClass874 A12;
    public final AnonymousClass840 A14;
    public final C1816783z A15;
    public final C83C A16;
    public final C8D4 A17;
    public final C8D9 A18;
    public final C81J A19;
    public final C1813582n A1A;
    public final C8EJ A1B;
    public final C1830289x A1C;
    public final C183968Ec A1D;
    public final C183918Ds A1E;
    public final AnonymousClass877 A1F;
    public final C8EO A1G;
    public final C8ER A1H;
    public final C8DL A1I;
    public final C8EL A1J;
    public final C8AD A1K;
    public final InterfaceC1810081c A1N;
    public final C8EX A1O;
    public final C183828Di A1P;
    public final C183758Da A1Q;
    public final StoryDraftsCreationViewModel A1R;
    public final ClipsAudioMixingDrawerController A1S;
    public final C8D6 A1T;
    public final ClipsCreationDraftViewModel A1U;
    public final C8DU A1V;
    public final C183428Bp A1W;
    public final C183468Bt A1X;
    public final AnonymousClass856 A1Y;
    public final C150286pc A1Z;
    public final C150286pc A1a;
    public final C150286pc A1b;
    public final C150286pc A1c;
    public final C150286pc A1d;
    public final C150286pc A1e;
    public final C150286pc A1f;
    public final C150286pc A1g;
    public final C150286pc A1h;
    public final C150286pc A1i;
    public final C150286pc A1j;
    public final C150286pc A1k;
    public final C8DK A1l;
    public final C183608Cl A1m;
    public final C1828989k A1n;
    public final C8CS A1o;
    public final C149766oT A1p;
    public final C8DP A1q;
    public final C195918ld A1r;
    public final FloatingIndicator A1s;
    public final InteractiveDrawableContainer A1t;
    public final Integer A1u;
    public final InterfaceC08830cm A1x;
    public final InterfaceC08830cm A1y;
    public final InterfaceC08830cm A1z;
    public final boolean A22;
    public final boolean A23;
    public final boolean A24;
    public final boolean A25;
    public final boolean A26;
    public final C183988Ef A27;
    public final C183888Do A28;
    public final InterfaceC08830cm A29;
    public final boolean A2A;
    public final C89H A13 = new C89H() { // from class: X.8Cv
        @Override // X.C89H
        public final void Cy8(Integer num, boolean z) {
            C183688Ct.A0H(C183688Ct.this, false, false);
        }
    };
    public final java.util.Set A1v = new HashSet();
    public final InterfaceC183728Cx A1M = new Object();
    public final InterfaceC183728Cx A1L = new C183738Cy();
    public boolean A0k = false;
    public boolean A0b = false;
    public boolean A0l = false;
    public boolean A0c = false;
    public final AtomicBoolean A1w = new AtomicBoolean(false);
    public final InterfaceC16620sF A21 = new C8D1(this);
    public final InterfaceC09390do A20 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.8D2
        @Override // X.InterfaceC16820sZ
        public final /* bridge */ /* synthetic */ Object invoke() {
            Activity activity = C183688Ct.this.A0o;
            return new C9RW(activity, activity.getString(2131969964));
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r17.A0z() <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0171, code lost:
    
        if (r13 == false) goto L31;
     */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, X.8FD] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, X.8FD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.instagram.common.gallery.Medium r33, final X.C183688Ct r34, X.C38321qM r35, float r36, int r37) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A01(com.instagram.common.gallery.Medium, X.8Ct, X.1qM, float, int):void");
    }

    private void A0I(boolean z) {
        this.A0D = null;
        if (this.A0k) {
            A0H(this, false, false);
            C8DK c8dk = this.A1l;
            if (c8dk != null) {
                c8dk.EQs(false);
                c8dk.Ede(true);
            }
            this.A1E.A00();
            A0F(this, false);
        } else {
            C8DK c8dk2 = this.A1l;
            if (c8dk2 != null) {
                c8dk2.EQs(true);
            }
        }
        this.A0k = false;
        Iterator it = this.A1v.iterator();
        while (it.hasNext()) {
            ((C8F1) it.next()).DCs(z);
        }
    }

    public final void A0o(List list) {
        C195918ld c195918ld;
        boolean z = true;
        if (list == null) {
            c195918ld = this.A1r;
        } else {
            boolean A0u = A0u();
            c195918ld = this.A1r;
            if (!A0u && list.isEmpty()) {
                z = false;
            }
        }
        c195918ld.A01 = z;
        InterfaceC191388dp interfaceC191388dp = c195918ld.A00;
        if (interfaceC191388dp != null) {
            interfaceC191388dp.Dlg();
        }
    }

    public final boolean A0w(float f) {
        Fragment fragment;
        this.A0j = false;
        C8BD c8bd = this.A0D;
        if (c8bd instanceof C8NW) {
            C8NW c8nw = (C8NW) this.A1h.get();
            Integer num = c8nw.A0D;
            if (num == C05F.A01 || num == C05F.A04) {
                C150286pc c150286pc = c8nw.A1K;
                if (c150286pc.A03 && ((C9LN) c150286pc.get()).A0P(f, true)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (c8bd instanceof ClipsTimelineEditorDrawerController) {
            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = (ClipsTimelineEditorDrawerController) c8bd;
            boolean z = false;
            clipsTimelineEditorDrawerController.A0L = false;
            clipsTimelineEditorDrawerController.A0I = false;
            clipsTimelineEditorDrawerController.A08 = clipsTimelineEditorDrawerController.A09;
            C70569Wd3 c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
            if (c70569Wd3 != null) {
                c70569Wd3.A0G.A01();
            }
            C70569Wd3 c70569Wd32 = clipsTimelineEditorDrawerController.A0D;
            if (c70569Wd32 != null) {
                fragment = c70569Wd32.A0E.A0O(R.id.fragment_container);
            } else {
                fragment = null;
            }
            if ((fragment instanceof ClipsStackedTimelineFragment) && clipsTimelineEditorDrawerController.A09 != EnumC187428Sk.A08) {
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = ((ClipsStackedTimelineFragment) fragment).A0F;
                if (clipsStackedTimelineViewController == null) {
                    C14360o3.A0F("viewController");
                    throw C00O.createAndThrow();
                }
                clipsStackedTimelineViewController.A0S();
                C22C A01 = AnonymousClass229.A01(clipsTimelineEditorDrawerController.A0a);
                EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
                EnumC114925Hg enumC114925Hg = EnumC114925Hg.CLIPS;
                C448724r c448724r = A01.A0F;
                C18920wW c18920wW = c448724r.A02;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
                if (A00.isSampled()) {
                    A00.A8R(C81X.A2U, "tool_type");
                    A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_TAP");
                    C22M c22m = c448724r.A04;
                    String str = c22m.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("camera_session_id", str);
                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A00.A8p("event_type", 2);
                    A00.A8R(enumC50631MWs, "surface");
                    A00.A8R(c448724r.A0I(), "capture_type");
                    A00.AAP("module", C22F.A09.getModuleName());
                    A00.A8R(enumC114925Hg, "camera_destination");
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.AAP("timeline_entry_point", "SWIPE");
                    A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
                    A00.Cht();
                }
                z = true;
            }
            C150286pc c150286pc2 = this.A1b;
            if (c150286pc2 != null) {
                C191478dz c191478dz = (C191478dz) c150286pc2.get();
                if (!c191478dz.A0N) {
                    c191478dz.A0N = z;
                }
            }
        }
        this.A0a = false;
        return false;
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final void Cuq() {
        this.A0l = false;
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void DHW(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void Dir(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmk(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    @Override // X.InterfaceC1829589q
    public final boolean isVisible() {
        return true;
    }

    private void A00() {
        ImageView imageView;
        C8DK c8dk = this.A1l;
        if (c8dk != null) {
            c8dk.EQs(false);
            c8dk.Ede(false);
        }
        boolean Cae = this.A1N.Cae();
        this.A0k = Cae;
        if (Cae) {
            A0H(this, false, false);
        }
        if ((!(this.A0D instanceof C8NW) || ((C8NW) this.A1h.get()).A0D != C05F.A05) && (imageView = this.A1E.A00) != null) {
            imageView.setVisibility(8);
        }
        Iterator it = this.A1v.iterator();
        while (it.hasNext()) {
            ((C8F1) it.next()).DCt();
        }
    }

    public static void A02(C194808jg c194808jg, C148276lx c148276lx, C183688Ct c183688Ct, C23108AGw c23108AGw) {
        C150286pc c150286pc = c183688Ct.A1h;
        C194808jg A13 = ((C8NW) c150286pc.get()).A13();
        if (A13 != null) {
            ((C8NW) c150286pc.get()).A1l.A0Q(A13);
        }
        ((C8NW) c150286pc.get()).A1G(c194808jg, c148276lx, c23108AGw);
        C21C A00 = C21B.A00(c183688Ct.A0w);
        boolean z = false;
        if (A00.A00.getInt("reshare_tooltip_view_count", 0) < 3) {
            new Handler().postDelayed(new RunnableC24758Axg(c194808jg, c183688Ct, z), 200L);
            A00.A02();
        }
    }

    public static void A03(C148276lx c148276lx, C183688Ct c183688Ct) {
        if (!c148276lx.A0O.isEmpty()) {
            ImageUrl imageUrl = ((C148286ly) c148276lx.A0O.get(0)).A0H;
            if (!AbstractC81033jX.A03(imageUrl)) {
                C25821No.A00().A0P(imageUrl);
            }
        }
        if (c148276lx.A04 == EnumC150226pU.A0r) {
            c183688Ct.A0h = true;
        }
    }

    public static void A04(C183688Ct c183688Ct) {
        InterfaceC1810081c interfaceC1810081c = c183688Ct.A1N;
        if (!interfaceC1810081c.Cae()) {
            interfaceC1810081c.AuH();
            android.util.Log.getStackTraceString(new Exception());
        }
    }

    public static void A05(C183688Ct c183688Ct) {
        if (c183688Ct.A03 != null) {
            AnonymousClass856 anonymousClass856 = c183688Ct.A1Y;
            if (!anonymousClass856.A00().A01) {
                anonymousClass856.A00().A01(c183688Ct.A1t, c183688Ct.A03, EnumC199188rL.A10);
            }
        }
    }

    public static void A06(final C183688Ct c183688Ct) {
        UserSession userSession = c183688Ct.A0w;
        FragmentActivity fragmentActivity = (FragmentActivity) c183688Ct.A0o;
        EnumC27378C6h enumC27378C6h = EnumC27378C6h.A02;
        Integer num = C05F.A02;
        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.B2Y
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C183688Ct.this.A1N.E4u(new Object());
                return C0eB.A00;
            }
        };
        InterfaceC16820sZ interfaceC16820sZ2 = new InterfaceC16820sZ() { // from class: X.B2R
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C0eB.A00;
            }
        };
        InterfaceC16820sZ interfaceC16820sZ3 = new InterfaceC16820sZ() { // from class: X.B2S
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C0eB.A00;
            }
        };
        String str = c183688Ct.A15.A01.A0F;
        C14360o3.A07(str);
        LBW.A00(fragmentActivity, userSession, enumC27378C6h, null, num, str, null, null, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, null, false, false);
    }

    public static void A07(C183688Ct c183688Ct) {
        C8E4 c8e4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(VersionedCapability.Saliency);
        arrayList.add(VersionedCapability.SegmentAnything);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(C8E4.A0D.A00());
        arrayList2.add(C8E4.A0I.A00());
        UserSession userSession = c183688Ct.A0w;
        if (C18U.A06(C06090Tz.A05, userSession, 36330565716165537L)) {
            c8e4 = C8E4.A09;
        } else {
            arrayList2.add(C8E4.A0B.A00());
            c8e4 = C8E4.A0C;
        }
        arrayList2.add(c8e4.A00());
        C14360o3.A0B(c183688Ct.A0o, 1);
        C14360o3.A0B(userSession, 2);
        IgVoltronModelLoader.Companion.A00(userSession).fetchAllModules();
        new C8EB(null, userSession, arrayList, arrayList2).AV9(new C8EE(), true);
    }

    public static void A09(C183688Ct c183688Ct, int i) {
        C88Z c88z;
        C8DV c8dv = c183688Ct.A1V.A00;
        if (c8dv != null) {
            c8dv.A02(i);
        }
        A0G(c183688Ct, true);
        String str = C88Z.A0g.A00;
        C81M A02 = c183688Ct.A15.A01.A02();
        if (A02 != null && (c88z = A02.A06) != null) {
            str = c88z.A00;
        }
        AnonymousClass229.A01(c183688Ct.A0w).A1S(EnumC50631MWs.A0I, str);
    }

    public static void A0A(C183688Ct c183688Ct, int i, int i2, boolean z) {
        C8BD c8bd = c183688Ct.A0D;
        C150286pc c150286pc = c183688Ct.A1d;
        if (c8bd == c150286pc.get()) {
            ((C8PR) c150286pc.get()).A0D(i);
            return;
        }
        C8BD c8bd2 = c183688Ct.A0D;
        C150286pc c150286pc2 = c183688Ct.A1c;
        if (c8bd2 == c150286pc2.get()) {
            ((C23769Afg) c150286pc2.get()).A05(new int[]{i}, z, z);
            return;
        }
        C8BD c8bd3 = c183688Ct.A0D;
        if (c8bd3 instanceof ViewOnFocusChangeListenerC23628AdN) {
            ((ViewOnFocusChangeListenerC23628AdN) c183688Ct.A1f.get()).A02(i);
            return;
        }
        if (!(c8bd3 instanceof C8NW) && !(c8bd3 instanceof ClipsTimelineEditorDrawerController)) {
            return;
        }
        C8NW c8nw = (C8NW) c183688Ct.A1h.get();
        if (i2 == 1) {
            AnonymousClass229.A01(c8nw.A0r).A1J(c8nw.A12(), i, 1);
        }
        Integer num = c8nw.A0D;
        if (num != C05F.A0N && num != C05F.A03) {
            if (num != C05F.A0j) {
                return;
            }
            ((C23630AdP) c8nw.A1N.get()).A0B(i, true);
            return;
        }
        ((C190398bx) c8nw.A1d.get()).A0b(i);
    }

    public static void A0B(C183688Ct c183688Ct, C8DD c8dd, int i) {
        C183978Ee A03 = c183688Ct.A15.A01.A03();
        List list = c8dd.A02;
        if (list.isEmpty()) {
            A09(c183688Ct, c8dd.A00);
            return;
        }
        if (A03 == null) {
            return;
        }
        c183688Ct.A1V.A00(i);
        C8LG c8lg = new C8LG();
        c8lg.A02(AbstractC001800i.A0x(list));
        GradientDrawable.Orientation orientation = c8dd.A01;
        C14360o3.A0B(orientation, 0);
        c8lg.A03 = orientation;
        TextColorScheme textColorScheme = new TextColorScheme(c8lg);
        C8Q5 c8q5 = (C8Q5) c183688Ct.A1g.get();
        int[] A0x = AbstractC001800i.A0x(list);
        C14360o3.A0B(A0x, 2);
        c8q5.ERk(orientation, A0x, 0);
        A0D(c183688Ct, textColorScheme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8, 36319888430997266L) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(final X.C183688Ct r17, X.EnumC193878i8 r18, java.lang.Integer r19, final java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0C(X.8Ct, X.8i8, java.lang.Integer, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0218, code lost:
    
        if (r1 != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(final X.C183688Ct r11, final java.lang.Runnable r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0E(X.8Ct, java.lang.Runnable, boolean):void");
    }

    public static void A0F(C183688Ct c183688Ct, boolean z) {
        ImageView imageView;
        C1809080s A00;
        View view;
        EnumC199188rL enumC199188rL;
        boolean z2 = c183688Ct.A19.A44;
        boolean z3 = !(c183688Ct.A0x.A08.A00 instanceof C81V);
        final C183918Ds c183918Ds = c183688Ct.A1E;
        UserSession userSession = c183918Ds.A0C;
        boolean A002 = C4A4.A00(userSession);
        if (c183918Ds.A0H == C05F.A00 && ((z2 && z3 && A002) || (C17060sy.A01.A01(userSession).A2I() && C18U.A06(C06090Tz.A05, userSession, 36321572054705780L)))) {
            if (c183918Ds.A00 == null) {
                ImageView imageView2 = (ImageView) ((ViewStub) c183918Ds.A0A.requireViewById(R.id.more_options_button_stub)).inflate();
                c183918Ds.A00 = imageView2;
                C3P9 c3p9 = new C3P9(imageView2);
                c3p9.A04 = new C3PD() { // from class: X.8ud
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view2) {
                        C183918Ds.this.A01();
                        return true;
                    }
                };
                c3p9.A00();
            }
            c183918Ds.A00();
            c183918Ds.A00.setVisibility(0);
            if (z && (imageView = c183918Ds.A00) != null) {
                AnonymousClass856 anonymousClass856 = c183918Ds.A0G;
                if (!anonymousClass856.A00().A01) {
                    long A01 = C18U.A01(C06090Tz.A05, userSession, 36603047031739259L);
                    if (A01 == 0) {
                        A00 = anonymousClass856.A00();
                        view = c183918Ds.A0A;
                        enumC199188rL = EnumC199188rL.A07;
                    } else if (A01 == 1) {
                        A00 = anonymousClass856.A00();
                        view = c183918Ds.A0A;
                        enumC199188rL = EnumC199188rL.A08;
                    } else {
                        if (A01 != 2) {
                            return;
                        }
                        A00 = anonymousClass856.A00();
                        view = c183918Ds.A0A;
                        enumC199188rL = EnumC199188rL.A09;
                    }
                    A00.A01(view, imageView, enumC199188rL);
                    return;
                }
                return;
            }
            return;
        }
        ImageView imageView3 = c183918Ds.A00;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(8);
    }

    public static void A0G(C183688Ct c183688Ct, boolean z) {
        TextColorScheme textColorScheme;
        C8DU c8du = c183688Ct.A1V;
        C8DV c8dv = c8du.A00;
        if (c8dv != null) {
            c8dv.A00();
        }
        C8DV c8dv2 = c8du.A00;
        if (c8dv2 != null) {
            textColorScheme = c8dv2.A02;
        } else {
            textColorScheme = null;
        }
        textColorScheme.getClass();
        if (z) {
            String str = textColorScheme.A06;
            C8Q5 c8q5 = (C8Q5) c183688Ct.A1g.get();
            if (str != null) {
                c8q5.ERl(textColorScheme.A06);
            } else {
                GradientDrawable.Orientation orientation = textColorScheme.A03;
                orientation.getClass();
                int[] A01 = textColorScheme.A01();
                C14360o3.A0B(A01, 2);
                c8q5.ERk(orientation, A01, 0);
            }
            A0D(c183688Ct, textColorScheme);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (((X.C8NW) r28.A1h.get()).A0D != X.C05F.A05) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r28.A0D != r4.get()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (((X.C8NW) r28.A1h.get()).A0D != X.C05F.A0Y) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        if (r2 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (((X.C8NW) r8.get()).A1r.size() != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016c, code lost:
    
        if (r2.A16.A01 == X.C9LN.A00(r2)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
    
        if (r4.A1A.AuG() != X.EnumC1810181d.A02) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0H(X.C183688Ct r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0H(X.8Ct, boolean, boolean):void");
    }

    public static boolean A0J(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C8AD c8ad) {
        EnumC199338ra enumC199338ra;
        EnumC199338ra enumC199338ra2;
        C8BB c8bb = new C8BB(interfaceC11380iw, userSession);
        c8bb.A00(EnumC199338ra.A02);
        if (c8ad.CcJ(C8AE.A0G)) {
            enumC199338ra = EnumC199338ra.A03;
        } else {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342162141727693826L) && !c8ad.CcJ(C8AE.A00)) {
                enumC199338ra2 = EnumC199338ra.A08;
            } else if (C18U.A06(c06090Tz, userSession, 2342162141727497217L) && !c8ad.CcJ(C8AE.A0F)) {
                enumC199338ra2 = EnumC199338ra.A06;
            } else if (C18U.A06(c06090Tz, userSession, 2342162141727759363L) && !c8ad.CcJ(C8AE.A0E)) {
                enumC199338ra2 = EnumC199338ra.A04;
            } else if (C18U.A06(c06090Tz, userSession, 2342162141727955973L) && !c8ad.CcJ(C8AE.A0D)) {
                enumC199338ra2 = EnumC199338ra.A07;
            } else if (!c8ad.CcJ(C8AE.A01)) {
                enumC199338ra2 = EnumC199338ra.A09;
            } else {
                c8bb.A00(EnumC199338ra.A0B);
                if (!c8ad.CcJ(C8AE.A02)) {
                    enumC199338ra2 = EnumC199338ra.A05;
                } else {
                    enumC199338ra = EnumC199338ra.A0A;
                }
            }
            c8bb.A00(enumC199338ra2);
            return false;
        }
        c8bb.A00(enumC199338ra);
        return true;
    }

    public static boolean A0K(UserSession userSession, C8AD c8ad) {
        if (!c8ad.CcJ(C8AE.A0n)) {
            C14360o3.A0B(userSession, 0);
            if ((AbstractC196078lx.A00(userSession) != C05F.A01 && !C18U.A06(C06090Tz.A05, userSession, 36323719538617910L)) || !c8ad.CcJ(C8AE.A0o) || !C18U.A06(C06090Tz.A05, userSession, 36324866294559267L)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0L(C183688Ct c183688Ct) {
        if (c183688Ct.A0x.A08.A00 == C208509Kk.A00 && !c183688Ct.A23) {
            C1815483h c1815483h = c183688Ct.A15.A01;
            if (c1815483h.A0Z == null && c1815483h.A0g == null && c1815483h.A04 == null && c1815483h.A07 == null && c183688Ct.A14.A01 != C22P.A5H) {
                PendingRecipient pendingRecipient = c1815483h.A0j;
                if (pendingRecipient != null && pendingRecipient.A0Y) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean A0M(C183688Ct c183688Ct) {
        if (C18U.A06(C06090Tz.A05, c183688Ct.A0w, 36316598482571801L)) {
            return c183688Ct.A1r.A01;
        }
        return c183688Ct.A0u();
    }

    public static boolean A0N(C183688Ct c183688Ct) {
        C150286pc c150286pc = c183688Ct.A1b;
        if (c150286pc != null && c150286pc.A03) {
            C191478dz c191478dz = (C191478dz) c150286pc.get();
            if (c191478dz.A0O && c191478dz.A0w == C5JK.A05) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0O(C183688Ct c183688Ct) {
        C150286pc c150286pc = c183688Ct.A1b;
        if (c150286pc != null && ((C191478dz) c150286pc.get()).A0u.A04 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r3.A02().A0E == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0P(X.C183688Ct r3) {
        /*
            X.83z r0 = r3.A15
            X.83h r3 = r0.A01
            X.8Ee r0 = r3.A03()
            r2 = 1
            if (r0 == 0) goto L1a
            X.81M r0 = r3.A02()
            if (r0 == 0) goto L1a
            X.81M r0 = r3.A02()
            boolean r0 = r0.A0E
            r1 = 1
            if (r0 != 0) goto L1b
        L1a:
            r1 = 0
        L1b:
            boolean r0 = r3.A07()
            if (r0 == 0) goto L28
            if (r1 != 0) goto L27
            boolean r0 = r3.A0J
            if (r0 == 0) goto L28
        L27:
            return r2
        L28:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0P(X.8Ct):boolean");
    }

    public final C194808jg A0Q(C5GJ c5gj, C38321qM c38321qM, C8FC c8fc) {
        C8FC c8fc2 = c8fc;
        if (c38321qM != null && !c38321qM.A63()) {
            final Context context = this.A0p.getContext();
            final UserSession userSession = this.A0w;
            String moduleName = this.A0v.getModuleName();
            C14360o3.A0B(context, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(moduleName, 2);
            final C194808jg A01 = AbstractC23122AKg.A01(context, null, userSession, c38321qM, null, moduleName, 0, 0);
            if (A01.A08.size() > 1) {
                A01.A0B(1);
            }
            A01.A0C(new C9PD(context, userSession, A01, this) { // from class: X.9k1
                public final /* synthetic */ C183688Ct A00;

                @Override // X.C9PD, X.ACE
                public final boolean A01() {
                    return false;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, userSession, A01, context.getResources().getString(2131974419));
                    this.A00 = this;
                }
            });
            if (c8fc == null) {
                C23108AGw A15 = ((C8NW) this.A1h.get()).A15();
                A15.A0H = false;
                A15.A0Q = false;
                c8fc2 = new C8FC(A15);
            }
            C148276lx A03 = AbstractC23122AKg.A03(context, userSession, c38321qM, c38321qM, 0, false);
            C150286pc c150286pc = this.A1h;
            ((C8NW) c150286pc.get()).A0w(A01, c5gj, null, c8fc2, null, null, "feed_post_sticker", null, null, A03.A01());
            ((C8NW) c150286pc.get()).A1M(C05F.A01);
            return A01;
        }
        throw new UnsupportedOperationException("addCanvasMedia requires a feed media.");
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, X.8qv] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, X.8qu] */
    public final C198968qw A0R() {
        ArrayList arrayList;
        HashMap hashMap;
        C8Q0 c8q0;
        C5QL c5ql;
        C8DV c8dv;
        int i;
        TextColorScheme textColorScheme;
        List list;
        Number number;
        C22993ABs BKP;
        C150286pc c150286pc = this.A1h;
        C8NW c8nw = (C8NW) c150286pc.get();
        InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
        Iterator it = interactiveDrawableContainer.getAllDrawables().iterator();
        while (true) {
            if (it.hasNext()) {
                Drawable drawable = (Drawable) it.next();
                if (!(drawable instanceof C5RM) || ((C5RM) drawable).A03 != C05F.A0C) {
                    break;
                }
            } else if (!interactiveDrawableContainer.getAllDrawables().isEmpty()) {
                interactiveDrawableContainer.A0Z();
            }
        }
        C198938qt c198938qt = null;
        if (interactiveDrawableContainer.getInteractiveDrawables().size() > 0) {
            arrayList = new ArrayList(interactiveDrawableContainer.getInteractiveDrawables());
        } else {
            arrayList = null;
        }
        C150286pc c150286pc2 = c8nw.A1N;
        if (c150286pc2.A03) {
            InterfaceC25221BDv interfaceC25221BDv = ((C23630AdP) c150286pc2.get()).A06;
            if (interfaceC25221BDv != null && (BKP = interfaceC25221BDv.BKP()) != null) {
                int i2 = BKP.A02;
                int i3 = BKP.A01;
                int i4 = BKP.A00;
                c198938qt = new C198938qt(BKP.A03, BKP.A04, BKP.A05, BKP.A08, BKP.A09, BKP.A06, BKP.A07, i2, i3, i4);
            } else {
                c198938qt = null;
            }
        }
        SparseArray sparseArray = c8nw.A0g;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            C5NG c5ng = (C5NG) sparseArray.valueAt(i5);
            if (c5ng != null) {
                c5ng.A02 = interactiveDrawableContainer.A0O(sparseArray.keyAt(i5));
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        C198928qs.A01(sparseArray2, sparseArray);
        if (interactiveDrawableContainer.getInteractiveDrawables().size() > 0) {
            hashMap = interactiveDrawableContainer.A0V(Drawable.class);
        } else {
            hashMap = null;
        }
        C198928qs c198928qs = new C198928qs(sparseArray2, c198938qt, arrayList, hashMap, interactiveDrawableContainer.getMaxZ());
        C150286pc c150286pc3 = this.A1d;
        if (c150286pc3.A03) {
            c8q0 = ((C8PR) c150286pc3.get()).A09();
        } else {
            c8q0 = null;
        }
        C9BH c9bh = new C9BH(this.A1E.A03, 5);
        AnonymousClass877 anonymousClass877 = this.A1F;
        AnonymousClass879 A02 = anonymousClass877.A02();
        String str = anonymousClass877.A00;
        int BVn = A02.BVn();
        int BVm = A02.BVm();
        ?? obj = new Object();
        obj.A03 = str;
        obj.A02 = null;
        obj.A01 = BVn;
        obj.A00 = BVm;
        C8DU c8du = this.A1V;
        C81M A022 = this.A15.A01.A02();
        if (A022 != null && (c8dv = c8du.A00) != null) {
            A022 = A022.A05();
            A022.A0A = new ArrayList(c8dv.A05);
            A022.A03 = c8dv.A01;
            A022.A01 = c8dv.A00;
            C8DV c8dv2 = c8du.A00;
            if (c8dv2 != null && (textColorScheme = c8dv2.A03) != null && (list = textColorScheme.A07) != null && (number = (Number) AbstractC001800i.A0J(list)) != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            A022.A02 = i;
        }
        Spannable A11 = ((C8NW) c150286pc.get()).A11();
        if (A11 != null) {
            c5ql = WE0.A01(A11, true);
        } else {
            c5ql = null;
        }
        boolean booleanValue = ((Boolean) this.A1D.A09.getValue()).booleanValue();
        ?? obj2 = new Object();
        obj2.A00 = booleanValue;
        return new C198968qw(c9bh, c8q0, obj2, obj, c198928qs, A022, c5ql);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.8PM, java.lang.Object] */
    public final C8PM A0S() {
        ArrayList arrayList;
        C8NW c8nw = (C8NW) this.A1h.get();
        if (c8nw.A0t.A08.A00 instanceof C81V) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
            C8PL c8pl = C8PL.A00;
            ArrayList arrayList2 = new ArrayList(interactiveDrawableContainer.getInteractiveDrawables());
            C01T.A1D(arrayList2, c8pl);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Drawable drawable = ((C9LJ) ((BD4) it.next())).A0B;
                if (C6RB.class.isInstance(drawable)) {
                    Object cast = C6RB.class.cast(drawable);
                    C14360o3.A07(cast);
                    arrayList3.add(cast);
                }
            }
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((C6RB) arrayList3.get(i)).A0F != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((C6RB) arrayList3.get(i)).A0F);
                    AbstractC202898y7.A00(spannableStringBuilder);
                    String obj = spannableStringBuilder.toString();
                    C14360o3.A07(obj);
                    arrayList.add(obj);
                }
            }
        }
        ?? obj2 = new Object();
        obj2.A00 = Collections.unmodifiableList(arrayList);
        return obj2;
    }

    public final MusicOverlayStickerModel A0T() {
        MusicOverlayStickerModel musicOverlayStickerModel;
        C1816783z c1816783z = this.A15;
        if (c1816783z.A01.A07()) {
            C198308pf A00 = c1816783z.A00();
            if (A00.A05.ordinal() != 0) {
                C195868lW c195868lW = A00.A03;
                c195868lW.getClass();
                musicOverlayStickerModel = c195868lW.A0V;
            } else {
                C183978Ee c183978Ee = A00.A02;
                c183978Ee.getClass();
                musicOverlayStickerModel = c183978Ee.A0J;
            }
            if (musicOverlayStickerModel == null) {
                Drawable A10 = ((C8NW) this.A1h.get()).A10();
                if (A10 != null) {
                    return AbstractC101614hW.A02(A10);
                }
            } else {
                return musicOverlayStickerModel;
            }
        }
        return null;
    }

    public final String A0U() {
        Integer num;
        int i;
        C8EJ c8ej = this.A1B;
        if (c8ej != null) {
            C48252LXb c48252LXb = c8ej.A03;
            if (c48252LXb != null) {
                num = c48252LXb.A01;
            } else {
                num = C05F.A00;
            }
            if (num.intValue() != 0) {
                i = 941;
            } else {
                i = 747;
            }
            return AbstractC43591JPw.A00(i);
        }
        return null;
    }

    public final String A0V() {
        C8DO c8do;
        if (this.A19.A03 == 8) {
            c8do = ((C8Q5) this.A1g.get()).Auk();
            if (c8do == null) {
                return null;
            }
        } else {
            C8EJ c8ej = this.A1B;
            if (c8ej != null) {
                C199028r5 c199028r5 = c8ej.A04;
                if (c199028r5 != null) {
                    c8ej.A02 = c199028r5.A00;
                }
                c8do = c8ej.A02;
            } else {
                if (this.A0r != C22P.A53) {
                    return null;
                }
                c8do = C8DO.A06;
            }
        }
        return c8do.A00;
    }

    public final ArrayList A0W() {
        SparseArray sparseArray = ((C8NW) this.A1h.get()).A0g;
        if (sparseArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Object valueAt = sparseArray.valueAt(i);
            C14360o3.A07(valueAt);
            arrayList.add(valueAt);
        }
        return arrayList;
    }

    public final ArrayList A0X() {
        return ((C8NW) this.A1h.get()).A16();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if ((r9 instanceof X.AbstractC202988yG) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap A0Y() {
        /*
            r13 = this;
            X.8Di r6 = r13.A1P
            boolean r0 = r6.A08()
            if (r0 != 0) goto Le
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        Ld:
            return r3
        Le:
            X.6pU r0 = X.EnumC150226pU.A0c
            java.lang.String r5 = r0.toString()
            X.6pU r0 = X.EnumC150226pU.A1i
            java.lang.String r4 = r0.toString()
            X.6pU r0 = X.EnumC150226pU.A0f
            java.lang.String r2 = r0.toString()
            X.B4n r3 = new X.B4n
            r3.<init>(r13, r5, r4, r2)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r13.A1t
            java.util.Set r0 = r6.A00
            java.util.Set r0 = X.AbstractC001800i.A0k(r0)
            java.util.HashMap r0 = r1.A0X(r0)
            java.util.Collection r1 = r0.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r12 = r0.iterator()
        L3e:
            boolean r0 = r12.hasNext()
            r10 = 1
            if (r0 == 0) goto Laf
            java.lang.Object r9 = r12.next()
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            boolean r0 = X.AbstractC209309No.A01(r9)
            if (r0 != 0) goto L65
            boolean r0 = r9 instanceof X.C194808jg
            if (r0 == 0) goto L6d
            r0 = r9
            X.8jg r0 = (X.C194808jg) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            boolean r0 = r0 instanceof X.C202728xq
            if (r0 == 0) goto L6d
        L65:
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r3.put(r5, r0)
            goto L3e
        L6d:
            boolean r0 = r9 instanceof X.C9PX
            if (r0 != 0) goto L76
            boolean r1 = r9 instanceof X.AbstractC202988yG
            r0 = 0
            if (r1 == 0) goto L77
        L76:
            r0 = 1
        L77:
            r7 = 0
            if (r0 == 0) goto L92
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r0 = r3.getOrDefault(r4, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r0 = r0 + r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r4, r0)
            goto L3e
        L92:
            boolean r0 = X.AbstractC209309No.A02(r9)
            if (r0 == 0) goto L3e
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r0 = r3.getOrDefault(r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r0 = r0 + r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            goto L3e
        Laf:
            boolean r0 = r6.A07()
            if (r0 == 0) goto Ld
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = "background"
            r3.put(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0Y():java.util.HashMap");
    }

    public final void A0Z() {
        ArrayList A0T = ((C8NW) this.A1h.get()).A1l.A0T(C202638xh.class);
        if (!A0T.isEmpty()) {
            ((C202638xh) A0T.get(0)).A04.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r2.A00.equals(X.C81T.A00) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0a() {
        /*
            r5 = this;
            X.83z r4 = r5.A15
            X.8pb r1 = r4.A01()
            X.8pb r0 = X.EnumC198268pb.A07
            r3 = 0
            if (r1 != r0) goto Lc
            r3 = 1
        Lc:
            X.81l r0 = r5.A0x
            X.81v r2 = r0.A08
            java.lang.Object r1 = r2.A00
            X.9Kk r0 = X.C208509Kk.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L25
            java.lang.Object r1 = r2.A00
            X.81T r0 = X.C81T.A00
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L26
        L25:
            r0 = 1
        L26:
            if (r3 == 0) goto L6c
            if (r0 == 0) goto L6c
            X.83h r2 = r4.A01
            X.8lW r0 = r2.A04()
            r0.getClass()
            int r1 = r0.A07
            r0 = 15000(0x3a98, float:2.102E-41)
            if (r1 <= r0) goto L6c
            X.8lW r0 = r2.A04()
            r0.getClass()
            boolean r4 = r0.A1G
            boolean r3 = r0.A18
            int r2 = r0.A07
            r1 = 60000(0xea60, float:8.4078E-41)
            r0 = 0
            if (r2 <= r1) goto L4d
            r0 = 1
        L4d:
            if (r4 != 0) goto L6c
            if (r3 == 0) goto L6c
            if (r0 == 0) goto L6c
            com.instagram.common.session.UserSession r3 = r5.A0w
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318106016028554(0x8107200000178a, double:3.031054713586687E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6c
            X.81c r1 = r5.A1N
            X.8VC r0 = new X.8VC
            r0.<init>()
            r1.E4u(r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0a():void");
    }

    public final void A0b() {
        List list;
        C22C A01;
        int i;
        C8NW c8nw = (C8NW) this.A1h.get();
        String str = this.A0V;
        if (str != null) {
            if (str == "feed_post") {
                C194808jg A13 = c8nw.A13();
                if (A13 != null) {
                    int size = A13.A08.size();
                    int i2 = A13.A00;
                    int i3 = size - c8nw.A00;
                    list = c8nw.A0J;
                    if (list != null && (i = i2 - i3) >= 0) {
                        A01 = AnonymousClass229.A01(c8nw.A0r);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (str != "reel" || (list = c8nw.A0J) == null || c8nw.A01 <= 0) {
                    return;
                }
                A01 = AnonymousClass229.A01(c8nw.A0r);
                i = c8nw.A01 - 1;
            }
            Object obj = ((C148276lx) list.get(i)).A01().get(0);
            C449524z c449524z = A01.A05;
            C14360o3.A0B(obj, 0);
            C18920wW c18920wW = c449524z.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "did_use_avatar_in_story_reshare");
            if (A00.isSampled()) {
                HashMap hashMap = new HashMap();
                hashMap.put("sticker_id", obj);
                hashMap.put("reshare_type", str);
                A00.A9M("extra_client_data", hashMap);
                A00.Cht();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1vN] */
    public final void A0c() {
        ProfileStickerAiAgentData profileStickerAiAgentData;
        C66645URj c66645URj;
        AiAgentMetadataDict aiAgentMetadataDict;
        C9QC c9qc;
        AbstractC25651Mw.A00(this.A0w).E4s(new Object());
        C8NW c8nw = (C8NW) this.A1h.get();
        C81J c81j = this.A19;
        C14360o3.A0B(c81j, 0);
        if (C8NW.A0u(c8nw)) {
            C23127AMf c23127AMf = (C23127AMf) c8nw.A1Z.get();
            String str = c8nw.A13.A02.A00().A06;
            InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
            UserSession userSession = c23127AMf.A04;
            String str2 = c23127AMf.A08;
            C194808jg A01 = C23127AMf.A01(interactiveDrawableContainer, null);
            C194808jg A02 = C23127AMf.A02(interactiveDrawableContainer, null);
            ArrayList arrayList = new ArrayList();
            if (A01 != null) {
                arrayList.add(((AbstractC202348xE) A01.A04()).A01().A0H);
            } else if (A02 != null) {
                Iterator it = ((C221049pS) ((AbstractC202358xF) A02.A04())).A02.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Product) it.next()).A0H);
                }
            }
            InterfaceC11380iw interfaceC11380iw = c23127AMf.A03;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str2, 1);
            C14360o3.A0B(str, 2);
            C14360o3.A0B(interfaceC11380iw, 5);
            C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            InterfaceC02590Ai A00 = A012.A00(A012.A00, MSV.A00(1275));
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC55216Oef.A02(userSession.userId, str), arrayList);
            JSONObject jSONObject = new JSONObject(AbstractC06930Yk.A0B(hashMap));
            A00.AAP("upload_key", AbstractC55216Oef.A02(userSession.userId, str));
            A00.A7v("is_album", false);
            A00.A9K(MSV.A00(1182), 0L);
            A00.A9K(MSV.A00(1183), Long.valueOf(arrayList.size()));
            A00.AAP(MSV.A00(1184), jSONObject.toString());
            A00.AAP(AbstractC69998VzI.A00(0, 10, 45), str2);
            String str3 = userSession.userId;
            C14360o3.A0B(str3, 0);
            A00.A9K("ig_user_id", AbstractC003100w.A0k(10, str3));
            A00.AAP(MSV.A00(512), "stories");
            A00.Cht();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c8nw.A1l.A0T(C194808jg.class).iterator();
        while (it2.hasNext()) {
            Drawable A04 = ((C194808jg) it2.next()).A04();
            C14360o3.A07(A04);
            if ((A04 instanceof C217749k7) && (c9qc = ((C217749k7) A04).A00) != null) {
                arrayList2.add(c9qc);
            }
        }
        if (!arrayList2.isEmpty()) {
            C8PK c8pk = c8nw.A0w;
            C18920wW c18920wW = c8pk.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_fitness_stickers");
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C9QC c9qc2 = (C9QC) it3.next();
                C0Zx c0Zx = new C0Zx();
                c0Zx.A05("days_since_sticker_generated", Long.valueOf(TimeUnit.SECONDS.toDays((System.currentTimeMillis() / 1000) - c9qc2.A01)));
                c0Zx.A06("sticker_type", c9qc2.A02);
                c0Zx.A06("sticker_image", c9qc2.A03);
                arrayList3.add(c0Zx);
            }
            if (A002.isSampled()) {
                A002.AAP("story_session_uuid", c8pk.A01);
                A002.AAP("event_name", "PUBLISH_STORY_WITH_FITNESS_STICKER");
                A002.AAk("published_fitness_stickers", arrayList3);
                A002.Cht();
            }
        }
        C8F9 c8f9 = c81j.A1e;
        if (c8f9 != null && (c66645URj = c8f9.A0E) != null && (aiAgentMetadataDict = c66645URj.A00) != null) {
            new C28484Chc(c8nw.A0r).A08(aiAgentMetadataDict.Aah(), aiAgentMetadataDict.Aad(), false);
        }
        ProfileStickerModel profileStickerModel = c81j.A1l;
        if (profileStickerModel != null && (profileStickerAiAgentData = profileStickerModel.A02) != null) {
            new C28484Chc(c8nw.A0r).A08(profileStickerAiAgentData.A00, profileStickerAiAgentData.A01, true);
        }
        A24.A00(this.A0p.getContext());
    }

    public final void A0d() {
        ((C8PR) this.A1d.get()).A0E(C05F.A01);
        ((C8NW) this.A1h.get()).A1B();
    }

    public final void A0e() {
        ((C8Q5) this.A1g.get()).Eey(this.A1r.A06());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    public final void A0f(Context context, int i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C148276lx c148276lx = (C148276lx) it.next();
            if (!c148276lx.A0O.isEmpty()) {
                ((C148286ly) c148276lx.A0O.get(0)).A0c = "STORIES_RESHARE_AVATAR_STICKER_TRAY";
            }
            arrayList.add(C194808jg.A01(context, this.A0w, c148276lx));
        }
        C8NW c8nw = (C8NW) this.A1h.get();
        c8nw.A00 = i;
        List list2 = c8nw.A0J;
        if (list2 != null) {
            list = list2;
        }
        c8nw.A0J = list;
        ?? r0 = c8nw.A0K;
        if (r0 != 0) {
            arrayList = r0;
        }
        c8nw.A0K = arrayList;
    }

    public final void A0g(Drawable drawable, C5GJ c5gj, C148276lx c148276lx, C8FC c8fc, boolean z) {
        C8FC c8fc2 = c8fc;
        if (c8fc == null) {
            c8fc2 = new C8FC(((C8NW) this.A1h.get()).A15());
        }
        C150286pc c150286pc = this.A1h;
        ((C8NW) c150286pc.get()).A0w(drawable, c5gj, null, c8fc2, null, null, null, null, null, c148276lx.A01());
        if (z) {
            ((C8NW) c150286pc.get()).A1M(C05F.A01);
        }
    }

    public final void A0h(Drawable drawable, C5GJ c5gj, C8FC c8fc, String str, List list) {
        C8NW c8nw = (C8NW) this.A1h.get();
        C14360o3.A0B(list, 0);
        C14360o3.A0B(drawable, 1);
        C14360o3.A0B(c8fc, 2);
        C14360o3.A0B(c5gj, 3);
        c8nw.A0w(drawable, c5gj, null, c8fc, null, null, str, null, null, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r8 instanceof X.BE6) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0i(android.graphics.drawable.Drawable r8, X.C8FC r9) {
        /*
            r7 = this;
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r7.A1t
            r2 = r8
            boolean r4 = X.C138436Oz.A0A(r8)
            X.83z r0 = r7.A15
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L14
            boolean r0 = r8 instanceof X.BE6
            r5 = 1
            if (r0 != 0) goto L15
        L14:
            r5 = 0
        L15:
            r6 = 0
            X.C14360o3.A0B(r8, r6)
            r3 = r9
            r1.A0J(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0i(android.graphics.drawable.Drawable, X.8FC):void");
    }

    public final void A0j(CameraAREffect cameraAREffect) {
        List list;
        C195868lW A04 = this.A15.A01.A04();
        if (A04 != null && (list = A04.A0u) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((CameraAREffect) it.next()).A0f) {
                    break;
                }
            }
        }
        if (cameraAREffect == null || !cameraAREffect.A0f) {
            return;
        }
        A0p(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0l(C198968qw c198968qw, InterfaceC187088Rb interfaceC187088Rb) {
        boolean z;
        C8Q1 c8q1;
        InterfaceC25221BDv interfaceC25221BDv;
        C5RM c5rm;
        if (this.A26) {
            C1816783z c1816783z = this.A15;
            c198968qw.getClass();
            C81M c81m = c198968qw.A05;
            List singletonList = Collections.singletonList(c81m);
            C1815483h c1815483h = c1816783z.A01;
            List list = c1815483h.A0p;
            list.clear();
            if (singletonList != null) {
                list.addAll(singletonList);
            }
            if (c81m != null) {
                C8DU c8du = this.A1V;
                C8DV c8dv = new C8DV(c81m.A0A, new int[]{c81m.A02}, c81m.A01, c81m.A03);
                c8dv.A00();
                c8du.A00 = c8dv;
                TextColorScheme textColorScheme = c8dv.A02;
                if (textColorScheme != null) {
                    String str = textColorScheme.A06;
                    C8Q5 c8q5 = (C8Q5) this.A1g.get();
                    if (str != null) {
                        c8q5.ERl(textColorScheme.A06);
                    } else {
                        GradientDrawable.Orientation orientation = textColorScheme.A03;
                        orientation.getClass();
                        int[] A01 = textColorScheme.A01();
                        C14360o3.A0B(A01, 2);
                        c8q5.ERk(orientation, A01, 0);
                        A0D(this, textColorScheme);
                    }
                }
            }
            C150286pc c150286pc = this.A1h;
            C8NW c8nw = (C8NW) c150286pc.get();
            C198928qs c198928qs = c198968qw.A04;
            InterfaceC08830cm interfaceC08830cm = c8nw.A1s;
            C191478dz c191478dz = (C191478dz) interfaceC08830cm.get();
            if (c191478dz != null) {
                c191478dz.A0F();
            }
            List<BD4> list2 = c198928qs.A04;
            if (list2 != null && (!AnonymousClass483.A04(list2))) {
                InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
                AnonymousClass848 anonymousClass848 = interactiveDrawableContainer.A0D;
                if (anonymousClass848 != null) {
                    anonymousClass848.AI1();
                } else {
                    interactiveDrawableContainer.A0A = null;
                    interactiveDrawableContainer.A0r.clear();
                }
                InteractiveDrawableContainer.A07(interactiveDrawableContainer);
                interactiveDrawableContainer.A0A = null;
                for (BD4 bd4 : list2) {
                    C14360o3.A0C(bd4, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.intf.InteractiveDrawable");
                    InteractiveDrawableContainer.A09(interactiveDrawableContainer, (BEd) bd4);
                }
                InteractiveDrawableContainer.A08(interactiveDrawableContainer);
                interactiveDrawableContainer.invalidate();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Drawable drawable = ((C9LJ) ((BD4) it.next())).A0B;
                    C8NW.A0N(drawable, c8nw);
                    if (!c198928qs.A01) {
                        C8NW.A0O(drawable, c8nw);
                        if (C8NW.A0v(c8nw)) {
                            if (AbstractC226939zp.A00(drawable, c8nw.A0r)) {
                                if (!(drawable instanceof C5RM)) {
                                    int i = C5RM.A0D;
                                    String obj = UUID.randomUUID().toString();
                                    C14360o3.A07(obj);
                                    c5rm = new C5RM(c8nw.A0f, drawable, obj);
                                    drawable.setCallback(c5rm);
                                } else {
                                    c5rm = drawable;
                                }
                                ((C191478dz) interfaceC08830cm.get()).A0L(c5rm);
                            } else {
                                ((C191478dz) interfaceC08830cm.get()).A0L(drawable);
                            }
                        }
                        ((C190398bx) c8nw.A1d.get()).A0c(drawable);
                        if (drawable instanceof BEc) {
                            BEc bEc = (BEc) drawable;
                            c8nw.A1G.A0Z.Egh(new C24024AlG(bEc.BVf(), null, bEc.BVp(), bEc.ApI()));
                        }
                    }
                }
                c198928qs.A01 = true;
            }
            SparseArray sparseArray = c198928qs.A02;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                c8nw.A0g.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
            C198938qt c198938qt = c198928qs.A03;
            if (c198938qt != null && (interfaceC25221BDv = ((C23630AdP) c8nw.A1N.get()).A06) != null) {
                int i3 = c198938qt.A02;
                int i4 = c198938qt.A01;
                int i5 = c198938qt.A00;
                interfaceC25221BDv.EWp(new C22993ABs(c198938qt.A03, c198938qt.A04, c198938qt.A05, c198938qt.A06, c198938qt.A09, c198938qt.A07, c198938qt.A08, i3, i4, i5));
            }
            if (c8nw.A1I.A04 != null) {
                for (Drawable drawable2 : c8nw.A1l.getAllDrawables()) {
                    if (drawable2 instanceof C5RM) {
                        Drawable drawable3 = ((C5RM) drawable2).A0A;
                        if (drawable3 instanceof C6RB) {
                            C14360o3.A0C(drawable3, "null cannot be cast to non-null type com.instagram.ui.text.drawable.TextDrawable");
                            if (((C6RB) drawable3).A0M == C05F.A01) {
                                C191478dz c191478dz2 = (C191478dz) interfaceC08830cm.get();
                                if (c191478dz2 != null) {
                                    c191478dz2.A0M(drawable2);
                                }
                                c8nw.EFB(drawable2, false);
                            }
                        }
                    }
                }
                C89Y c89y = c8nw.A0n;
                if (!c89y.A02.isEmpty()) {
                    List<C51760Mtj> list3 = c89y.A02;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (C51760Mtj c51760Mtj : list3) {
                            if (c51760Mtj.A01 == null || c51760Mtj.A00 != null) {
                                break;
                            }
                        }
                    }
                    C8NW.A0S(c8nw);
                }
                C8NW.A0c(c8nw, c89y.A00(C8NW.A02(c8nw)));
                C8NW.A0b(c8nw, c89y.A02);
            }
            Iterator it2 = c8nw.A1l.getAllDrawables().iterator();
            while (it2.hasNext()) {
                c8nw.A19.Doe((Drawable) it2.next());
            }
            C8NW c8nw2 = (C8NW) c150286pc.get();
            C5QL c5ql = c198968qw.A06;
            if (c8nw2.A05 == C208509Kk.A00 && (c5ql != null || (!c8nw2.A0l.mDetached && c8nw2.A1c.A03 && !c8nw2.A0O))) {
                UFV A00 = C70827Whk.A00((C70827Whk) c8nw2.A1c.get());
                if (c5ql == null) {
                    A00.A09();
                } else {
                    UFV.A04(A00, c5ql);
                }
            }
            if (!this.A22) {
                C183918Ds c183918Ds = this.A1E;
                C9BH c9bh = c198968qw.A00;
                c9bh.getClass();
                ReelMoreOptionsModel reelMoreOptionsModel = (ReelMoreOptionsModel) c9bh.A00;
                reelMoreOptionsModel.getClass();
                c183918Ds.A02(new C183938Du(reelMoreOptionsModel).A01());
                C8PR c8pr = (C8PR) this.A1d.get();
                C8Q0 c8q0 = c198968qw.A01;
                if (c8pr.A0i != null && c8q0 != null && interfaceC187088Rb != null) {
                    C8PX c8px = c8pr.A0O;
                    if ((!c8px.A06.isEmpty()) && (c8q1 = c8q0.A00) != null && !c8q1.A00.isEmpty()) {
                        c8px.A01 = new A8B(c8pr, c8q0, interfaceC187088Rb);
                    } else {
                        C8PR.A00(c8pr).A00.A04(interfaceC187088Rb, c8q0.A00);
                    }
                }
                AnonymousClass877 anonymousClass877 = this.A1F;
                C198948qu c198948qu = c198968qw.A03;
                if (c198948qu == null || c198948qu.A03 == null) {
                    AnonymousClass877.A01(anonymousClass877);
                }
            }
            C183978Ee A03 = c1815483h.A03();
            C183968Ec c183968Ec = this.A1D;
            c183968Ec.A07.Egh(A03);
            C198958qv c198958qv = c198968qw.A02;
            C05A c05a = c183968Ec.A09;
            if (c198958qv != null) {
                z = c198958qv.A00;
            } else {
                z = false;
            }
            c05a.Egh(Boolean.valueOf(z));
        }
    }

    public final void A0m(InterfaceC187088Rb interfaceC187088Rb, boolean z) {
        C8NW c8nw = (C8NW) this.A1h.get();
        C191478dz c191478dz = (C191478dz) c8nw.A1s.get();
        if (c191478dz != null) {
            c191478dz.A0F();
        }
        c8nw.A1l.A0Z();
        c8nw.A0g.clear();
        C150286pc c150286pc = c8nw.A1N;
        if (c150286pc.A03) {
            ((C23630AdP) c150286pc.get()).A0A();
        }
        C150286pc c150286pc2 = this.A1d;
        if (c150286pc2.A03) {
            C8PR c8pr = (C8PR) c150286pc2.get();
            if (interfaceC187088Rb != null) {
                GLDrawingView gLDrawingView = C8PR.A00(c8pr).A00;
                RunnableC24707Awo runnableC24707Awo = new RunnableC24707Awo(gLDrawingView, new RunnableC24494AtD(interfaceC187088Rb));
                X1v x1v = gLDrawingView.A05;
                if (x1v != null) {
                    x1v.A07(runnableC24707Awo);
                }
            }
        }
        this.A1E.A02(new C183938Du().A01());
        this.A1F.A00 = null;
        this.A15.A01.A0p.clear();
        if (z) {
            C183968Ec c183968Ec = this.A1D;
            c183968Ec.A07.Egh(null);
            c183968Ec.A09.Egh(false);
        }
    }

    public final void A0n(Runnable runnable) {
        StoryDraftsStore storyDraftsStore;
        String str;
        C1816783z c1816783z = this.A15;
        C183978Ee A03 = c1816783z.A01.A03();
        UserSession userSession = this.A0w;
        C22C A01 = AnonymousClass229.A01(userSession);
        synchronized (StoryDraftsStore.class) {
            synchronized (StoryDraftsStore.A08) {
                C14360o3.A0B(userSession, 0);
                storyDraftsStore = (StoryDraftsStore) userSession.A01(StoryDraftsStore.class, new C9ES(userSession, 12));
            }
        }
        int size = storyDraftsStore.A03.size();
        String moduleName = this.A0v.getModuleName();
        String str2 = null;
        if (A03 != null) {
            str = A03.A0g;
            str2 = A03.A0e;
        } else {
            str = null;
        }
        C447924j c447924j = A01.A06;
        C14360o3.A0B(moduleName, 1);
        C18920wW c18920wW = c447924j.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_draft");
        if (A00.isSampled()) {
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "SAVE_STORY_TEMP");
            A00.AAQ(c447924j.A0M(), "creation_session_state");
            C22M c22m = c447924j.A04;
            String str3 = c22m.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A00.AAP("camera_session_id", str3);
            A00.A8R(c447924j.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("module", moduleName);
            A00.A8p("event_type", 2);
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.A9K("total_drafts_saved", Long.valueOf(size));
            A00.AAP("save_method", "tap");
            A00.A7v("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(c447924j.A03, false)));
            A00.AAP("genai_response_id", str);
            A00.AAP("genai_content_id", str2);
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_STORIES_SAVE_DRAFT");
            A00.Cht();
        }
        C8Y6 c8y6 = (C8Y6) this.A1x.get();
        if (c8y6 != null) {
            StoryDraftsCreationViewModel storyDraftsCreationViewModel = this.A1R;
            AnonymousClass840 anonymousClass840 = this.A14;
            C199008r1 A04 = c8y6.A08.A04();
            Bitmap A05 = c8y6.A05();
            TargetViewSizeProvider targetViewSizeProvider = this.A10;
            Context context = this.A0p.getContext();
            CameraSpec A002 = c8y6.A0Q.A00();
            InterfaceC16660sJ interfaceC16660sJ = new InterfaceC16660sJ() { // from class: X.B3W
                @Override // X.InterfaceC16660sJ
                public final Object invoke(Object obj) {
                    AnonymousClass229.A01(C183688Ct.this.A0w).A22((String) obj, false);
                    return null;
                }
            };
            boolean z = false;
            if (c1816783z.A01() == EnumC198268pb.A07) {
                z = true;
            }
            storyDraftsCreationViewModel.A01(context, A05, targetViewSizeProvider, anonymousClass840, A002, A04, interfaceC16660sJ, true, z);
        }
        runnable.run();
    }

    public final void A0p(boolean z) {
        C8NW c8nw = (C8NW) this.A1h.get();
        C148276lx c148276lx = C148276lx.A10;
        SparseArray sparseArray = c8nw.A0g;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Object valueAt = sparseArray.valueAt(i);
            valueAt.getClass();
            Iterator it = ((C5NG) valueAt).A06.iterator();
            while (it.hasNext()) {
                if (c148276lx.A01().contains(it.next())) {
                    return;
                }
            }
        }
        AbstractC13880nE.A0q(c8nw.A1l, new RunnableC24652Avm(c8nw, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0q(boolean r16) {
        /*
            r15 = this;
            X.81J r6 = r15.A19
            X.83r r2 = r6.A18
            if (r2 == 0) goto L36
            com.instagram.common.session.UserSession r8 = r15.A0w
            X.1qM r0 = r2.A03
            boolean r0 = r0.A5x()
            r0 = r0 ^ 1
            if (r0 != 0) goto L37
            X.874 r0 = r15.A12
        L14:
            r0.A02()
        L17:
            X.83z r0 = r15.A15
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L36
            X.0iw r7 = r15.A0v
            java.lang.String r13 = r6.A2l
            java.lang.String r10 = "remix_reply_sound"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "remix_reply_post_capture"
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            r9 = 0
            r14 = r9
            X.AbstractC43821JZj.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L36:
            return
        L37:
            X.1qM r0 = r2.A03
            r0.getClass()
            boolean r0 = r0.Cff()
            r7 = r16
            if (r0 == 0) goto L50
            X.83z r0 = r15.A15
            X.8pb r1 = r0.A01()
            X.8pb r0 = X.EnumC198268pb.A04
            if (r1 != r0) goto L50
            if (r16 == 0) goto L94
        L50:
            X.874 r0 = r15.A12
            boolean r0 = r0.A0B
            if (r0 != 0) goto L94
            X.8aO r1 = new X.8aO
            r1.<init>(r8)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0a = r0
            android.app.Activity r5 = r15.A0o
            r0 = 2131974486(0x7f135956, float:1.9586037E38)
            java.lang.String r0 = r5.getString(r0)
            r1.A0d = r0
            X.8aR r4 = r1.A00()
            com.instagram.user.model.User r0 = r2.A05
            java.lang.String r3 = r0.getUsername()
            X.9fB r2 = new X.9fB
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "other_username"
            r1.putString(r0, r3)
            java.lang.String r0 = "is_precapture"
            r1.putBoolean(r0, r7)
            r2.setArguments(r1)
            r2.A00 = r15
            r4.A02(r5, r2)
            goto L17
        L94:
            X.874 r0 = r15.A11
            r0.getClass()
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0q(boolean):void");
    }

    public final boolean A0r() {
        EnumC150226pU enumC150226pU;
        C8NW c8nw = (C8NW) this.A1h.get();
        java.util.Set A0F = C8NW.A0F(c8nw);
        if (A0F == null) {
            return false;
        }
        InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
        if (interactiveDrawableContainer.A0U(C202728xq.class, A0F).isEmpty()) {
            ArrayList A0U = interactiveDrawableContainer.A0U(C202588xc.class, A0F);
            ArrayList arrayList = new ArrayList();
            Iterator it = A0U.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Drawable drawable = (Drawable) next;
                if ((drawable instanceof C202588xc) && (enumC150226pU = ((C202588xc) drawable).A0M) != EnumC150226pU.A0C && enumC150226pU != EnumC150226pU.A0A) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0s() {
        String str;
        List list;
        C8Y6 c8y6 = (C8Y6) this.A1x.get();
        if (!CKr()) {
            Integer num = C05F.A00;
            C150286pc c150286pc = this.A1h;
            if (!((C8NW) c150286pc.get()).A1l.A10(num)) {
                Spannable A11 = ((C8NW) c150286pc.get()).A11();
                if (A11 != null && A11.length() > 0) {
                    return true;
                }
                C183978Ee A03 = this.A15.A01.A03();
                if ((A03 != null && (list = A03.A0p) != null && (!list.isEmpty())) || this.A12.A00) {
                    return true;
                }
                if (c8y6 != null) {
                    C1816783z c1816783z = c8y6.A0E.A02;
                    EnumC198268pb A01 = c1816783z.A01();
                    if (A01 != EnumC198268pb.A04 && A01 != EnumC198268pb.A07) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown captured media type: ");
                        sb.append(A01.A01);
                        sb.append(" | cameraConfiguration: ");
                        C1815483h c1815483h = c1816783z.A01;
                        C1810981l c1810981l = c1815483h.A0Y;
                        if (c1810981l != null) {
                            str = AbstractC226029yL.A00((C55U) c1810981l.A08.A00, (java.util.Set) c1810981l.A09.A00);
                        } else {
                            str = "null";
                        }
                        sb.append(str);
                        sb.append(" | wasGalleryItemSelected: ");
                        sb.append(c1815483h.A0V);
                        AbstractC12120kG.A01("EditControllerDelegateImpl", sb.toString());
                        return false;
                    }
                    C8RZ c8rz = c8y6.A08;
                    if (c8rz.A04().A00()) {
                        return true;
                    }
                    C1816783z c1816783z2 = c8rz.A0F.A02;
                    String str2 = c1816783z2.A00().A06;
                    C14360o3.A07(str2);
                    Iterator it = c1816783z2.A05().iterator();
                    while (it.hasNext()) {
                        String str3 = ((C198308pf) it.next()).A06;
                        C14360o3.A07(str3);
                        if (!str3.equals(str2)) {
                            HashMap hashMap = c8rz.A0H.A00;
                            if (hashMap.containsKey(str3)) {
                                Object obj = hashMap.get(str3);
                                if (obj != null) {
                                    if (((C199008r1) obj).A00()) {
                                        return true;
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0t() {
        /*
            r5 = this;
            X.8BD r0 = r5.A0D
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lc
            return r2
        Lc:
            X.81c r1 = r5.A1N
            X.81d r0 = r1.AuG()
            int r0 = r0.ordinal()
            r4 = 0
            switch(r0) {
                case 4: goto Ld6;
                case 6: goto Ld6;
                case 7: goto Ld6;
                case 8: goto Ld6;
                case 17: goto Ld6;
                case 31: goto Ld6;
                case 32: goto Ld6;
                case 37: goto L9d;
                case 54: goto Ld6;
                case 67: goto Lce;
                case 69: goto Ld6;
                case 71: goto Ld6;
                case 72: goto Lac;
                case 78: goto La6;
                case 79: goto Ld6;
                case 85: goto L97;
                case 87: goto Ld6;
                default: goto L1a;
            }
        L1a:
            boolean r0 = r5.A0d
            if (r0 == 0) goto L6d
            boolean r0 = r5.A0i
            if (r0 != 0) goto L6d
            boolean r0 = r5.A2A
            if (r0 != 0) goto L6d
            X.81J r0 = r5.A19
            boolean r0 = r0.A3E
            if (r0 != 0) goto L6d
            X.83z r0 = r5.A15
            X.83h r3 = r0.A01
            java.lang.String r2 = r3.A0G
            boolean r0 = r5.A0s()
            if (r0 != 0) goto L4d
            X.81l r0 = r3.A0Y
            r0.getClass()
            X.81v r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L60
            boolean r0 = A0O(r5)
            if (r0 != 0) goto L4d
        L4b:
            if (r2 == 0) goto L8d
        L4d:
            boolean r1 = A0N(r5)
            X.9Jo r0 = new X.9Jo
            r0.<init>()
        L56:
            A0E(r5, r0, r1)
            boolean r0 = A0N(r5)
            r2 = r0 ^ 1
            return r2
        L60:
            java.lang.Integer r1 = r3.A0D
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L4b
            X.81M r0 = r3.A02()
            if (r0 == 0) goto L4d
            goto L4b
        L6d:
            boolean r0 = r1.Cap()
            if (r0 == 0) goto L8d
            X.83z r0 = r5.A15
            X.83h r0 = r0.A01
            java.lang.Boolean r0 = r0.A0l
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8d
            boolean r0 = r5.A0i
            if (r0 != 0) goto L8d
            boolean r1 = A0N(r5)
            X.AqT r0 = new X.AqT
            r0.<init>()
            goto L56
        L8d:
            X.856 r0 = r5.A1Y
            X.80s r0 = r0.A00()
            r0.A00()
            return r4
        L97:
            X.8Wl r0 = new X.8Wl
            r0.<init>()
            goto La2
        L9d:
            X.8VS r0 = new X.8VS
            r0.<init>()
        La2:
            r1.E4u(r0)
            return r2
        La6:
            X.9z8 r0 = new X.9z8
            r0.<init>()
            goto Ld3
        Lac:
            android.app.Activity r0 = r5.A0o
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.0h2 r1 = X.AbstractC62582sx.A00(r0)
            r0 = 2131439078(0x7f0b2de6, float:1.85001E38)
            androidx.fragment.app.Fragment r2 = r1.A0O(r0)
            if (r2 == 0) goto Ld6
            java.lang.String r1 = r2.mTag
            java.lang.String r0 = "MAGIC_MOD"
            boolean r0 = X.C2I7.A00(r1, r0)
            if (r0 == 0) goto Ld6
            X.2op r2 = (X.InterfaceC60072op) r2
            boolean r2 = r2.onBackPressed()
            return r2
        Lce:
            X.9z6 r0 = new X.9z6
            r0.<init>()
        Ld3:
            r1.E4u(r0)
        Ld6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0t():boolean");
    }

    public final boolean A0u() {
        Integer num;
        C8AD c8ad = this.A1K;
        UserSession userSession = this.A0w;
        InterfaceC11380iw interfaceC11380iw = this.A0v;
        C131995xZ A00 = C196068lw.A00(userSession).A00(A2B);
        if (!C196068lw.A01(A00) && C18U.A06(C06090Tz.A05, userSession, 36326481202329491L)) {
            num = C05F.A15;
        } else if (!c8ad.CcJ(C8AE.A0M) && AbstractC196078lx.A01(userSession) && !C196068lw.A03(A00)) {
            num = C05F.A02;
        } else if (!c8ad.CcJ(C8AE.A05)) {
            num = C05F.A0j;
        } else if (!c8ad.CcJ(C8AE.A03)) {
            num = C05F.A0Y;
        } else if (!c8ad.CcJ(C8AE.A04) && !C18U.A06(C06090Tz.A05, userSession, 36320687291376434L)) {
            num = C05F.A0M;
        } else if (!c8ad.CcJ(C8AE.A0f)) {
            num = C05F.A0J;
        } else if (!c8ad.CcJ(C8AE.A0l)) {
            num = C05F.A0P;
        } else if (!c8ad.CcJ(C8AE.A0L)) {
            num = C05F.A1I;
        } else if (!c8ad.CcJ(C8AE.A07)) {
            num = C05F.A0D;
        } else {
            C8AG c8ag = C8AE.A06;
            if (!c8ad.CcJ(c8ag) && !C196068lw.A02(A00) && !C18U.A06(C06090Tz.A05, userSession, 36317268497404891L)) {
                num = C05F.A0B;
            } else if (!c8ad.CcJ(c8ag) && !(!AbstractC23021Ah.A00(userSession).A21())) {
                num = C05F.A06;
            } else if (!c8ad.CcJ(C8AE.A0d)) {
                num = C05F.A0I;
            } else if (!c8ad.CcJ(C8AE.A0P)) {
                num = C05F.A04;
            } else if (!c8ad.CcJ(C8AE.A0B)) {
                num = C05F.A00;
            } else if (!c8ad.CcJ(C8AE.A0m)) {
                num = C05F.A0R;
            } else if (!A0K(userSession, c8ad)) {
                num = C05F.A0Q;
            } else if (!c8ad.CcJ(C8AE.A0k)) {
                num = C05F.A0O;
            } else if (!c8ad.CcJ(C8AE.A0b)) {
                num = C05F.A0F;
            } else if (!c8ad.CcJ(C8AE.A09) && !C18U.A06(C06090Tz.A05, userSession, 36319970031902586L)) {
                num = C05F.A0S;
            } else if (!c8ad.CcJ(C8AE.A0j)) {
                num = C05F.A0L;
            } else {
                if (!c8ad.CcJ(C8AE.A0Q)) {
                    C14360o3.A0B(userSession, 0);
                    if (!C18U.A06(C06090Tz.A05, userSession, 36327172692719982L)) {
                        num = C05F.A05;
                    }
                }
                if (!c8ad.CcJ(C8AE.A0V)) {
                    C14360o3.A0B(userSession, 0);
                    if (!C18U.A06(C06090Tz.A05, userSession, 36319888429489918L)) {
                        num = C05F.A08;
                    }
                }
                if (!A0J(interfaceC11380iw, userSession, c8ad)) {
                    num = C05F.A0C;
                } else if (!c8ad.CcJ(C8AE.A0I)) {
                    num = C05F.A0u;
                } else if (AbstractC196078lx.A01(userSession) && !C196068lw.A03(A00)) {
                    num = C05F.A0N;
                } else {
                    num = null;
                }
            }
        }
        this.A0S = num;
        if (num == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r8.A0j != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r8.A0a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r3 = r4.CRB(X.EnumC1810181d.A0j);
        r1 = r8.A0x.A08.A00 instanceof X.C81V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r8.A0j != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r3 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r4.E4u(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r8.A0j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r1 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r1 = r8.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if ((r1 instanceof com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r1 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r1.A0I != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r9 <= 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r1.A0L = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r1.A08 = r1.A09;
        r0 = r1.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r0.A0G.A02(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r9 >= (-1.5f)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        r1.A0L = false;
        r1.A0I = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if ((r8.A0D instanceof X.C8NW) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r2 = (X.C8NW) r8.A1h.get();
        r1 = r2.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r1 == X.C05F.A01) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        if (r1 != X.C05F.A04) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        r3 = (X.C9LN) r2.A1K.get();
        r5 = r3.A1C.A02.A01.A0Y;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r5.A0W(X.C81W.A0o, X.C81W.A0p) != true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r0 = r3.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        if (r0.getVisibility() != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        r0 = r3.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c1, code lost:
    
        if (r0.getVisibility() != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c3, code lost:
    
        X.C9LN.A08(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (r9 <= 0.0f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cb, code lost:
    
        X.AnonymousClass229.A01(r3.A18).A01.A00();
        r3.A1E.E4u(new java.lang.Object());
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0016, code lost:
    
        if (r8.A0D != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r8.A0D != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r9 >= 0.0f) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0v(float r9) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0v(float):boolean");
    }

    @Override // X.InterfaceC143326dX
    public final C8BD AYo() {
        return this.A0D;
    }

    @Override // X.InterfaceC183698Cu
    public final Bitmap AzW(int i, int i2) {
        return ((C8PR) this.A1d.get()).AzW(i, i2);
    }

    @Override // X.InterfaceC183698Cu
    public final Bitmap AzX(Bitmap bitmap) {
        return C8PR.A00((C8PR) this.A1d.get()).A00.getBitmap();
    }

    @Override // X.InterfaceC143326dX
    public final boolean CKf() {
        if (this.A0D == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC183698Cu
    public final boolean CKr() {
        return ((C8PR) this.A1d.get()).CKr();
    }

    @Override // X.InterfaceC1829589q
    public final boolean CLU() {
        C150286pc c150286pc = this.A1h;
        if ((c150286pc.A03 && ((C8NW) c150286pc.get()).A1l.getInteractiveDrawables().size() > 0) || CKr()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC143326dX
    public final boolean CPd() {
        return this.A1E.A03.A0G;
    }

    @Override // X.InterfaceC1829489p
    public final void Cvp(Drawable drawable, int i) {
        C8D6 c8d6;
        AbstractC223919ua abstractC223919ua;
        boolean z = drawable instanceof C5RM;
        if ((z && (((C5RM) drawable).A0A instanceof BEc)) || (c8d6 = this.A1T) == null) {
            return;
        }
        C14360o3.A0B(drawable, 0);
        if (AbstractC101614hW.A09(drawable) != null || (c8d6.A01() instanceof C219619n9) || (c8d6.A01() instanceof C219609n8)) {
            return;
        }
        if (z && (((C5RM) drawable).A0A instanceof C9PX)) {
            abstractC223919ua = C219689nG.A00;
        } else {
            abstractC223919ua = C219659nD.A00;
        }
        c8d6.A04(abstractC223919ua);
    }

    @Override // X.BBw
    public final void D2U(boolean z) {
        this.A0c = z;
        C150286pc c150286pc = this.A1g;
        if (c150286pc.A03) {
            ((C8Q5) c150286pc.get()).D2U(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36320012981641115L) == false) goto L19;
     */
    @Override // X.InterfaceC143326dX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5W(X.C8BD r5) {
        /*
            r4 = this;
            X.8BD r0 = r4.A0D
            if (r0 == 0) goto L15
            boolean r0 = r0 instanceof X.C8NW
            if (r0 != 0) goto L15
            X.6pc r0 = r4.A1h
            java.lang.Object r1 = r0.get()
            X.8NW r1 = (X.C8NW) r1
            java.lang.Integer r0 = X.C05F.A01
            r1.A1M(r0)
        L15:
            X.81J r0 = r4.A19
            X.BCp r0 = r0.A1A
            if (r0 == 0) goto L1e
            r0.Dsg()
        L1e:
            boolean r0 = r5 instanceof X.C8NW
            if (r0 == 0) goto L2d
            X.81c r1 = r4.A1N
            X.81d r0 = X.EnumC1810181d.A1R
            boolean r0 = r1.CRB(r0)
            if (r0 == 0) goto L2d
            return
        L2d:
            boolean r0 = r5 instanceof com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController
            if (r0 == 0) goto L45
            com.instagram.common.session.UserSession r3 = r4.A0w
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320012981641115(0x8108dc00021f9b, double:3.032260686318805E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 0
            if (r1 != 0) goto L46
        L45:
            r0 = 1
        L46:
            r4.A0I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.D5W(X.8BD):void");
    }

    @Override // X.InterfaceC1829689r
    public final boolean DJG(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        C8EJ c8ej;
        if (this.A25 && (c8ej = this.A1B) != null) {
            c8ej.A06 = false;
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC143326dX
    public final void DWb(C8BD c8bd) {
        C8NW c8nw;
        Integer num;
        this.A0D = c8bd;
        if (c8bd instanceof C24151Ana) {
            c8nw = (C8NW) this.A1h.get();
            num = C05F.A08;
        } else {
            if (!(c8bd instanceof C8NW) && !(c8bd instanceof ClipsTimelineEditorDrawerController)) {
                c8nw = (C8NW) this.A1h.get();
                num = C05F.A0C;
            }
            A00();
        }
        c8nw.A1M(num);
        A00();
    }

    @Override // X.InterfaceC1829489p
    public final void Dep(Drawable drawable, int i, boolean z) {
        C8D6 c8d6;
        AbstractC223919ua abstractC223919ua;
        boolean z2 = drawable instanceof C5RM;
        if ((z2 && (((C5RM) drawable).A0A instanceof BEc)) || (c8d6 = this.A1T) == null) {
            return;
        }
        C14360o3.A0B(drawable, 0);
        if (AbstractC101614hW.A09(drawable) != null || (c8d6.A01() instanceof C219619n9) || (c8d6.A01() instanceof C219609n8)) {
            return;
        }
        if (z2 && (((C5RM) drawable).A0A instanceof C9PX)) {
            abstractC223919ua = C219699nH.A00;
        } else {
            abstractC223919ua = C219669nE.A00;
        }
        c8d6.A04(abstractC223919ua);
    }

    @Override // X.InterfaceC1829489p
    public final void Din(Drawable drawable, float f, float f2, float f3, float f4) {
        AbstractC223919ua abstractC223919ua;
        if (!this.A0l) {
            this.A0l = true;
            C8D6 c8d6 = this.A1T;
            if (c8d6 != null) {
                C14360o3.A0B(drawable, 0);
                if (AbstractC101614hW.A09(drawable) == null) {
                    if ((drawable instanceof C5RM) && (((C5RM) drawable).A0A instanceof C9PX)) {
                        abstractC223919ua = C219709nI.A00;
                    } else {
                        abstractC223919ua = C219679nF.A00;
                    }
                    c8d6.A04(abstractC223919ua);
                }
            }
        }
    }

    @Override // X.InterfaceC191388dp
    public final void Dlg() {
        ((C8Q5) this.A1g.get()).Eey(this.A1r.A06());
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ea, code lost:
    
        if (r5 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03bc, code lost:
    
        if (r0 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13.A0w, 36316783166362259L) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (r10 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024f, code lost:
    
        if (r1.A03().A0E == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0269, code lost:
    
        if (r1.A00().AXl().A0M == null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1810781j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC1829689r
    public final void Du2(float f, float f2) {
        if (this.A0c) {
            ((C187198Rm) this.A29.get()).A0c.A06.CMI();
            C8EX c8ex = this.A1O;
            C201948wR c201948wR = new C201948wR(f, f2);
            C141796aw A00 = AbstractC141776au.A00(c8ex);
            C12T c12t = C12P.A00;
            AbstractC23641Du.A03(C05F.A00, AnonymousClass131.A00.A06(), new C9D3(c8ex, c201948wR, (InterfaceC23621Ds) null, 35), A00);
        }
    }

    @Override // X.InterfaceC1829589q
    public final void EGp(Canvas canvas, int i, boolean z, boolean z2) {
        ((InterfaceC1829589q) ((C8NW) this.A1h.get()).A1V.get()).EGp(canvas, i, z, z2);
    }

    @Override // X.InterfaceC1829589q
    public final void EJm() {
        ((InterfaceC1829589q) ((C8NW) this.A1h.get()).A1V.get()).EJm();
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        LIj lIj;
        C95334Qt c95334Qt;
        LIj lIj2;
        C95334Qt c95334Qt2;
        C150286pc c150286pc = this.A1h;
        if (c150286pc.A03) {
            C8NW c8nw = (C8NW) c150286pc.get();
            C150286pc c150286pc2 = c8nw.A1d;
            if (c150286pc2.A03) {
                ((C190398bx) c150286pc2.get()).A0V();
            }
            C150286pc c150286pc3 = c8nw.A1K;
            if (c150286pc3.A03) {
                C9LN c9ln = (C9LN) c150286pc3.get();
                C48590LeS c48590LeS = c9ln.A0E;
                if (c48590LeS != null && (lIj2 = c48590LeS.A02) != null && (c95334Qt2 = lIj2.A03) != null) {
                    c95334Qt2.pause();
                }
                C48589LeR c48589LeR = c9ln.A0K;
                if (c48589LeR != null && (lIj = c48589LeR.A02) != null && (c95334Qt = lIj.A03) != null) {
                    c95334Qt.pause();
                }
                JT7 jt7 = c9ln.A0J;
                if (jt7 != null) {
                    JT7.A00(jt7, null);
                    MediaPlayer mediaPlayer = jt7.A00;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                    jt7.A00 = null;
                }
            }
            if (c8nw.A1A.Cap() && c8nw.A1R()) {
                C87P c87p = c8nw.A1J;
                if (c87p.A03) {
                    c87p.A00 = c87p.A00();
                }
            }
            if (c8nw.A05 == C208509Kk.A00) {
                C150286pc c150286pc4 = c8nw.A1c;
                if (c150286pc4.A03) {
                    C70827Whk c70827Whk = (C70827Whk) c150286pc4.get();
                    C70827Whk.A00(c70827Whk).A08();
                    IgEditText igEditText = c70827Whk.A05;
                    if (igEditText.hasFocus()) {
                        igEditText.clearFocus();
                    }
                }
            }
        }
        C150286pc c150286pc5 = this.A1d;
        if (c150286pc5.A03) {
            C8PR c8pr = (C8PR) c150286pc5.get();
            if (c8pr.A0i != null) {
                GLDrawingView gLDrawingView = C8PR.A00(c8pr).A00;
                RunnableC73549YIw runnableC73549YIw = gLDrawingView.A0E;
                runnableC73549YIw.A09 = true;
                runnableC73549YIw.A0H.remove(runnableC73549YIw.A06);
                runnableC73549YIw.A06 = null;
                X1v x1v = gLDrawingView.A05;
                if (x1v != null) {
                    W4S w4s = GLDrawingView.A0I;
                    synchronized (w4s) {
                        x1v.A08 = true;
                        w4s.notifyAll();
                        while (!x1v.A01 && !x1v.A06) {
                            try {
                                w4s.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
                gLDrawingView.A07 = true;
            }
        }
        this.A1W.A00().Eoi();
        this.A1X.A00().Eoi();
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        LIj lIj;
        C95334Qt c95334Qt;
        LIj lIj2;
        C95334Qt c95334Qt2;
        C150286pc c150286pc = this.A1d;
        if (c150286pc.A03) {
            C8PR c8pr = (C8PR) c150286pc.get();
            if (c8pr.A0i != null) {
                C8PR.A00(c8pr).A00.A01();
            }
            Integer num = c8pr.A06;
            Integer num2 = C05F.A0Y;
            if (num == num2 || num == C05F.A0N) {
                c8pr.A0E(num2);
            }
        }
        C150286pc c150286pc2 = this.A1h;
        if (c150286pc2.A03) {
            C8NW c8nw = (C8NW) c150286pc2.get();
            if (c8nw.A0Q) {
                AnonymousClass229.A01(c8nw.A0r).A03.A02();
            }
            if (c8nw.A0V && C17060sy.A01.A01(c8nw.A0r).A03.Bxy() != null) {
                c8nw.A1L(C05F.A00);
            }
            c8nw.A0V = false;
            if (c8nw.A0T && C17060sy.A01.A01(c8nw.A0r).A03.Bxv() != null) {
                c8nw.A1L(C05F.A01);
            }
            c8nw.A0T = false;
            if (c8nw.A0U) {
                C08730cb c08730cb = C17060sy.A01;
                UserSession userSession = c8nw.A0r;
                if (c08730cb.A01(userSession).A03.Bxx() != null) {
                    User A01 = c08730cb.A01(userSession);
                    Integer num3 = C05F.A0C;
                    EnumC209229Ne enumC209229Ne = EnumC209229Ne.A0H;
                    int[] A02 = AbstractC209259Nh.A02(enumC209229Ne);
                    C8NW.A0X(c8nw, new C41629IbK(A01, num3, null, null, null, AbstractC209259Nh.A00(enumC209229Ne), A02[1], 0, A02[0], -6710887, -16777216, true));
                }
            }
            c8nw.A0U = false;
            if (c8nw.A0a) {
                InterfaceC111194zh Bxy = C17060sy.A01.A01(c8nw.A0r).A03.Bxy();
                ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw = (ViewOnFocusChangeListenerC23261ASw) c8nw.A1b.get();
                if (Bxy != null) {
                    ViewOnFocusChangeListenerC23261ASw.A03(viewOnFocusChangeListenerC23261ASw, ViewOnFocusChangeListenerC23261ASw.A00(viewOnFocusChangeListenerC23261ASw));
                } else {
                    viewOnFocusChangeListenerC23261ASw.A04(true);
                }
            }
            c8nw.A0a = false;
            if (c8nw.A0Y) {
                InterfaceC111194zh Bxv = C17060sy.A01.A01(c8nw.A0r).A03.Bxv();
                ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw2 = (ViewOnFocusChangeListenerC23261ASw) c8nw.A1b.get();
                if (Bxv != null) {
                    ViewOnFocusChangeListenerC23261ASw.A03(viewOnFocusChangeListenerC23261ASw2, ViewOnFocusChangeListenerC23261ASw.A00(viewOnFocusChangeListenerC23261ASw2));
                } else {
                    viewOnFocusChangeListenerC23261ASw2.A04(true);
                }
            }
            c8nw.A0Y = false;
            if (c8nw.A0Z) {
                InterfaceC111194zh Bxx = C17060sy.A01.A01(c8nw.A0r).A03.Bxx();
                ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw3 = (ViewOnFocusChangeListenerC23261ASw) c8nw.A1b.get();
                if (Bxx != null) {
                    ViewOnFocusChangeListenerC23261ASw.A03(viewOnFocusChangeListenerC23261ASw3, ViewOnFocusChangeListenerC23261ASw.A00(viewOnFocusChangeListenerC23261ASw3));
                } else {
                    viewOnFocusChangeListenerC23261ASw3.A04(true);
                }
            }
            c8nw.A0Z = false;
            C150286pc c150286pc3 = c8nw.A1K;
            if (c150286pc3.A03) {
                C9LN c9ln = (C9LN) c150286pc3.get();
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = c9ln.A09;
                if (touchInterceptorFrameLayout != null) {
                    touchInterceptorFrameLayout.getVisibility();
                }
                C48590LeS c48590LeS = c9ln.A0E;
                if (c48590LeS != null && (lIj2 = c48590LeS.A02) != null && (c95334Qt2 = lIj2.A03) != null) {
                    c95334Qt2.start();
                }
                C48589LeR c48589LeR = c9ln.A0K;
                if (c48589LeR != null && (lIj = c48589LeR.A02) != null && (c95334Qt = lIj.A03) != null) {
                    c95334Qt.start();
                }
            }
            InterfaceC1810081c interfaceC1810081c = c8nw.A1A;
            if (interfaceC1810081c.Cap() && c8nw.A1R()) {
                C87P c87p = c8nw.A1J;
                if (c87p.A03) {
                    c87p.A02 = System.currentTimeMillis();
                }
            }
            if (c8nw.A05 == C208509Kk.A00) {
                C150286pc c150286pc4 = c8nw.A1c;
                if (c150286pc4.A03 && interfaceC1810081c.CRB(EnumC1810181d.A07)) {
                    C70827Whk.A00((C70827Whk) c150286pc4.get()).A07();
                }
            }
            if (this.A1N.Cap() && ((C8NW) c150286pc2.get()).A1R()) {
                this.A1X.A00().Eo3();
            }
        }
        if (this.A0d) {
            this.A1W.A00().Eo3();
        }
        C183918Ds c183918Ds = this.A1E;
        if (c183918Ds != null && c183918Ds.A03.A0F) {
            A0H(this, false, false);
            C183938Du c183938Du = new C183938Du(c183918Ds.A03);
            c183938Du.A0F = false;
            c183918Ds.A03 = c183938Du.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (((X.C23769Afg) r2.get()).A01 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(X.C183688Ct r5) {
        /*
            boolean r0 = A0P(r5)
            if (r0 == 0) goto L29
            X.83z r0 = r5.A15
            X.83h r0 = r0.A01
            boolean r0 = r0.A0J
            if (r0 != 0) goto L38
            X.8DU r0 = r5.A1V
            X.8DV r0 = r0.A00
            if (r0 == 0) goto L29
            com.instagram.ui.text.TextColorScheme r2 = r0.A02
            if (r2 == 0) goto L29
            java.lang.String r1 = r2.A06
            X.6pc r0 = r5.A1g
            java.lang.Object r5 = r0.get()
            X.8Q5 r5 = (X.C8Q5) r5
            if (r1 == 0) goto L2a
            java.lang.String r0 = r2.A06
            r5.ERl(r0)
        L29:
            return
        L2a:
            android.graphics.drawable.GradientDrawable$Orientation r4 = r2.A03
            r4.getClass()
            int[] r3 = r2.A01()
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            goto L62
        L38:
            X.6pc r2 = r5.A1c
            java.lang.Object r1 = r2.get()
            X.Afg r1 = (X.C23769Afg) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L67
            com.instagram.ui.text.TextColorScheme r1 = r1.A06
        L46:
            X.6pc r0 = r5.A1g
            java.lang.Object r5 = r0.get()
            X.8Q5 r5 = (X.C8Q5) r5
            android.graphics.drawable.GradientDrawable$Orientation r4 = r1.A03
            r4.getClass()
            int[] r3 = r1.A01()
            java.lang.Object r0 = r2.get()
            X.Afg r0 = (X.C23769Afg) r0
            boolean r1 = r0.A01
            r0 = 2
            if (r1 != 0) goto L63
        L62:
            r0 = 0
        L63:
            r5.ERk(r4, r3, r0)
            return
        L67:
            com.instagram.ui.text.TextColorScheme r1 = r1.A00
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A08(X.8Ct):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r5.A1A == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        if (r11 != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0D(X.C183688Ct r11, com.instagram.ui.text.TextColorScheme r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.A0D(X.8Ct, com.instagram.ui.text.TextColorScheme):void");
    }

    public final void A0k(EnumC150226pU enumC150226pU) {
        Integer num;
        EnumC193878i8 enumC193878i8;
        Object obj;
        int ordinal = enumC150226pU.ordinal();
        if (ordinal != 54) {
            if (ordinal != 46 && ordinal != 55) {
                if (ordinal == 56) {
                    num = C05F.A0Y;
                    enumC193878i8 = EnumC193878i8.A0B;
                } else {
                    return;
                }
            } else {
                num = C05F.A0Y;
                enumC193878i8 = EnumC193878i8.A09;
            }
            obj = new Object();
        } else {
            num = C05F.A0Y;
            enumC193878i8 = EnumC193878i8.A09;
            obj = new Object();
        }
        A0C(this, enumC193878i8, num, obj);
    }

    @Override // X.InterfaceC1829589q
    public final boolean CLZ(boolean z, boolean z2) {
        if (CLU()) {
            if (AbstractC23126AKl.A03(((C8NW) this.A1h.get()).A1l.getAllDrawables(), z, z2) || CKr()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x018c, code lost:
    
        if (r4 == 7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0379, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r65, 36323049523981194L) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0548  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.8Cx] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.2ba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v120, types: [X.7lu, X.8EU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C183688Ct(android.app.Activity r56, final android.view.View r57, final android.view.View r58, final android.view.View r59, final X.AbstractC018607g r60, X.C22P r61, final X.AbstractC59962oe r62, final X.C1819485e r63, X.InterfaceC11380iw r64, final com.instagram.common.session.UserSession r65, final X.C3I9 r66, final X.C57012jc r67, final X.C1810981l r68, X.C89F r69, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r70, final X.AnonymousClass874 r71, X.AnonymousClass874 r72, X.AnonymousClass840 r73, X.C83C r74, final X.C183618Cm r75, X.C81J r76, X.C1813582n r77, final X.ViewOnTouchListenerC1829889t r78, final X.C8C0 r79, X.C1830289x r80, final X.AnonymousClass877 r81, final X.InterfaceC1818984z r82, X.C8AD r83, final X.InterfaceC1810081c r84, com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r85, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r86, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r87, final X.C87P r88, X.C183428Bp r89, X.C183468Bt r90, X.AnonymousClass856 r91, final X.C150286pc r92, X.C9K8 r93, X.C8DK r94, X.C183608Cl r95, X.C1828989k r96, X.C8CS r97, com.instagram.model.direct.DirectShareTarget r98, final X.AnonymousClass844 r99, final X.C677733r r100, final com.instagram.reels.prompt.model.PromptStickerModel r101, final com.instagram.ui.widget.interactive.InteractiveDrawableContainer r102, java.lang.Integer r103, final java.util.List r104, X.InterfaceC08830cm r105, X.InterfaceC08830cm r106, X.InterfaceC08830cm r107, X.InterfaceC08830cm r108, boolean r109, boolean r110, boolean r111, boolean r112, final boolean r113, boolean r114) {
        /*
            Method dump skipped, instructions count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183688Ct.<init>(android.app.Activity, android.view.View, android.view.View, android.view.View, X.07g, X.22P, X.2oe, X.85e, X.0iw, com.instagram.common.session.UserSession, X.3I9, X.2jc, X.81l, X.89F, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.874, X.874, X.840, X.83C, X.8Cm, X.81J, X.82n, X.89t, X.8C0, X.89x, X.877, X.84z, X.8AD, X.81c, com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.87P, X.8Bp, X.8Bt, X.856, X.6pc, X.9K8, X.8DK, X.8Cl, X.89k, X.8CS, com.instagram.model.direct.DirectShareTarget, X.844, X.33r, com.instagram.reels.prompt.model.PromptStickerModel, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.Integer, java.util.List, X.0cm, X.0cm, X.0cm, X.0cm, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
