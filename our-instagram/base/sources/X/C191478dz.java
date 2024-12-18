package X;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.gson.Gson;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.8dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191478dz implements InterfaceC184998Io, C8F1, InterfaceC1810781j {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewStub A04;
    public C2GS A05;
    public InterfaceC41501vz A06;
    public IgImageView A07;
    public IgImageView A08;
    public C191728eU A09;
    public C8e1 A0A;
    public C8Z9 A0B;
    public InterfaceC186228Nq A0C;
    public EnumC189218Zt A0D;
    public IgdsMediaButton A0E;
    public IgdsMediaButton A0F;
    public ClipInfo A0G;
    public C191548eB A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;
    public final Context A0S;
    public final Handler A0T;
    public final View A0U;
    public final View A0V;
    public final View A0W;
    public final FragmentActivity A0X;
    public final C22P A0Y;
    public final AbstractC59962oe A0Z;
    public final InterfaceC11380iw A0a;
    public final UserSession A0b;
    public final IgFrameLayout A0c;
    public final C1810981l A0d;
    public final CreationActionBar A0e;
    public final TargetViewSizeProvider A0f;
    public final ClipsAssetHubViewModel A0g;
    public final AnonymousClass840 A0h;
    public final C188798Xv A0i;
    public final C86S A0j;
    public final C87A A0k;
    public final InterfaceC1810081c A0l;
    public final ClipsAudioMixingDrawerController A0m;
    public final C191578eE A0n;
    public final C185198Jk A0o;
    public final C8KD A0p;
    public final C8JY A0q;
    public final C87D A0r;
    public final ClipsCreationViewModel A0s;
    public final C8D6 A0t;
    public final C89P A0u;
    public final ClipsCreationDraftViewModel A0v;
    public final C5JK A0w;
    public final AnonymousClass856 A0x;
    public final C87H A0y;
    public final C1828989k A0z;
    public final IgdsMediaButton A10;
    public final MusicAttributionConfig A11;
    public final InterfaceC1829489p A12;
    public final InteractiveDrawableContainer A13;
    public final String A14;
    public final List A15;
    public final InterfaceC08830cm A16;
    public final InterfaceC08830cm A17;
    public final InterfaceC08830cm A18;
    public final InterfaceC09390do A19;
    public final InterfaceC09390do A1A;
    public final InterfaceC09390do A1B;
    public final InterfaceC09390do A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final C2GS A1F;
    public final ACRType A1G;
    public final C1819485e A1H;
    public final C81J A1I;
    public final InterfaceC143326dX A1J;
    public final Runnable A1K;
    public final String A1L;
    public final InterfaceC08830cm A1M;
    public final InterfaceC09390do A1N;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Drawable drawable, C191478dz c191478dz) {
        Object obj;
        C5RO c5ro;
        Drawable Afg;
        Object obj2 = drawable;
        boolean z = drawable instanceof C5RO;
        if (z) {
            obj2 = ((C5RO) obj2).Afg();
        }
        if (!(obj2 instanceof BEc)) {
            Drawable drawable2 = drawable;
            if (C14360o3.A0K(c191478dz.A0d.A08.A00, C1811181n.A00)) {
                Integer num = null;
                if (z && (c5ro = (C5RO) drawable) != null && (Afg = c5ro.Afg()) != null) {
                    drawable2 = Afg;
                }
                if (!(drawable2 instanceof C8P7)) {
                    Iterator it = c191478dz.A13.getInteractiveDrawables().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (C14360o3.A0K(((C9LJ) ((BD4) obj)).A0B, drawable2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    BEd bEd = (BEd) obj;
                    if (bEd != null) {
                        num = ((C9LJ) bEd).A0G;
                    }
                    if (num == C05F.A01) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (drawable instanceof C5RM) {
                ClipsCreationViewModel clipsCreationViewModel = c191478dz.A0s;
                C5RO c5ro2 = (C5RO) drawable;
                C14360o3.A0B(c5ro2, 0);
                clipsCreationViewModel.A0N.A01(c5ro2);
                return;
            }
            if (!(drawable instanceof C5RR)) {
                return;
            }
            C1817884n c1817884n = c191478dz.A0s.A0N;
            List list = c1817884n.A01;
            list.add(drawable);
            c1817884n.A0B.Egh(list);
            c1817884n.A05.F8m(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(Drawable drawable, C191478dz c191478dz) {
        Object obj = drawable;
        if (drawable instanceof C5RO) {
            obj = ((C5RO) obj).Afg();
        }
        if (!(obj instanceof BEc)) {
            if (drawable instanceof C5RM) {
                ClipsCreationViewModel clipsCreationViewModel = c191478dz.A0s;
                clipsCreationViewModel.A0c((C5RO) drawable);
                C5RM c5rm = (C5RM) drawable;
                if (c5rm.A02.A00 == C05F.A0C) {
                    String str = c5rm.A0B;
                    C14360o3.A0B(str, 0);
                    clipsCreationViewModel.A0K.A0A.A01(str);
                    return;
                }
                return;
            }
            if (!(drawable instanceof C5RR)) {
                return;
            }
            c191478dz.A0s.A0f((C5RR) drawable);
        }
    }

    public static final void A05(final C1816783z c1816783z, final C191478dz c191478dz, final C5JK c5jk, List list) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = c191478dz.A0v;
        clipsCreationDraftViewModel.A0F(c5jk, c1816783z.A01.A0j, false);
        if (c5jk == C5JK.A06) {
            AnonymousClass229.A01(c191478dz.A0b).A10(EnumC114925Hg.FEED, null);
        }
        C22P c22p = c191478dz.A0Y;
        if (c22p == C22P.A4c || c22p == C22P.A1W) {
            c191478dz.A0O(c191478dz.A0S.getString(2131955560));
        }
        UserSession userSession = c191478dz.A0b;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        String str = ((C55U) c191478dz.A0d.A08.A00).A02;
        C14360o3.A0B(c5jk, 0);
        C183348Bh.A01(c22p, A00, c5jk, str, "prefill_import_start", "5");
        String str2 = (String) clipsCreationDraftViewModel.A0P.getValue();
        if (str2 == null) {
            str2 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        }
        Context context = c191478dz.A0S;
        AbstractC167017dG.A1N(context, userSession);
        C49602Pt A002 = C2Ps.A00(context, userSession);
        TargetViewSizeProvider targetViewSizeProvider = c191478dz.A0f;
        CameraSpec cameraSpec = (CameraSpec) new Gson().A08(C1AT.A01(userSession).A03(C1AV.A0e).getString("KEY_CAMERA_SPEC", null), CameraSpec.class);
        if (cameraSpec == null) {
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
            cameraSpec = C75I.A01(userSession, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight());
        }
        C2AH c2ah = new C2AH() { // from class: X.9h4
            @Override // X.C2AH
            public final void onFail(Exception exc) {
                C14360o3.A0B(exc, 0);
                AbstractC12120kG.A07("ClipsPostCaptureController", "Failed to import prefill medium videos", exc);
                C191478dz c191478dz2 = c191478dz;
                UserSession userSession2 = c191478dz2.A0b;
                C183348Bh A003 = AbstractC183338Bg.A00(userSession2);
                C5JK c5jk2 = c5jk;
                if (c5jk2 == C5JK.A05) {
                    AtomicLong atomicLong = A003.A0F;
                    atomicLong.set(A003.A0K.A07("prefill medium failed", "", 838607486, atomicLong.get()));
                }
                AbstractC166987dD.A0u(userSession2).A07(c5jk2, "prefill medium failed", null, null);
                c191478dz2.A0G();
                AKk.A02(c191478dz2.A0S, C05F.A0u, "Failure while importing video for Reels", 2131955611);
            }

            @Override // X.C2AH
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                long j;
                int i;
                EnumC114925Hg enumC114925Hg;
                C115475Kh c115475Kh;
                List<C195868lW> list2 = (List) obj;
                C14360o3.A0B(list2, 0);
                C191478dz c191478dz2 = c191478dz;
                UserSession userSession2 = c191478dz2.A0b;
                C183348Bh A003 = AbstractC183338Bg.A00(userSession2);
                C5JK c5jk2 = c5jk;
                C1811981v c1811981v = c191478dz2.A0d.A08;
                String str3 = ((C55U) c1811981v.A00).A02;
                C22P c22p2 = c191478dz2.A0Y;
                C183348Bh.A01(c22p2, A003, c5jk2, str3, "prefill_import_end", "6");
                if (list2.isEmpty()) {
                    onFail(AbstractC166987dD.A18("zero videos imported"));
                    return;
                }
                InterfaceC1812882f interfaceC1812882f2 = ((NineSixteenLayoutConfigImpl) c191478dz2.A0f).A0K;
                List A1J = AbstractC166987dD.A1J(AbstractC16960so.A1Q(Long.valueOf(interfaceC1812882f2.getHeight()), Long.valueOf(interfaceC1812882f2.getWidth())));
                C195868lW c195868lW = (C195868lW) AbstractC001800i.A0O(list2, 0);
                long j2 = 0;
                if (c195868lW != null) {
                    j = c195868lW.A08;
                } else {
                    j = 0;
                }
                Long valueOf = Long.valueOf(j);
                C195868lW c195868lW2 = (C195868lW) AbstractC001800i.A0O(list2, 0);
                if (c195868lW2 != null) {
                    j2 = c195868lW2.A0K;
                }
                List A1J2 = AbstractC166987dD.A1J(AbstractC16960so.A1Q(valueOf, Long.valueOf(j2)));
                ArrayList A0i = AbstractC167007dF.A0i(list2);
                for (C195868lW c195868lW3 : list2) {
                    A0i.add(AbstractC16960so.A1Q(Long.valueOf(c195868lW3.A08), Long.valueOf(c195868lW3.A0K)));
                }
                ArrayList A0i2 = AbstractC167007dF.A0i(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1X(A0i2, ((C195868lW) it.next()).A00());
                }
                ArrayList A0i3 = AbstractC167007dF.A0i(list2);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    A0i3.add(((C195868lW) it2.next()).A0k);
                }
                C449124v c449124v = AnonymousClass229.A01(userSession2).A0A;
                C195868lW c195868lW4 = (C195868lW) AbstractC001800i.A0O(list2, 0);
                if (c195868lW4 != null) {
                    i = c195868lW4.A0F;
                } else {
                    i = -1;
                }
                C1815483h c1815483h = c1816783z.A01;
                String A05 = c1815483h.A05();
                EnumC114925Hg enumC114925Hg2 = EnumC114925Hg.CLIPS;
                C5JK c5jk3 = C5JK.A06;
                c449124v.A0Z(null, enumC114925Hg2, AnonymousClass249.VIDEO, c1815483h.A09, A05, A1J, A1J2, A0i, A0i2, A0i3, i, AbstractC167007dF.A1X(c5jk2, c5jk3));
                C183348Bh.A01(c22p2, AbstractC183338Bg.A00(userSession2), c5jk2, ((C55U) c1811981v.A00).A02, "prefill_process_start", "7");
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    int i2 = ((C195868lW) it3.next()).A07;
                    if (i2 == 0) {
                        onFail(AbstractC166987dD.A18("video duration is zero"));
                        return;
                    }
                    AbstractC166997dE.A1W(A1E, i2);
                }
                List A1E2 = AbstractC166987dD.A1E();
                if (c5jk2 != c5jk3) {
                    A1E2 = OOM.A01(A1E, c191478dz2.A0s.A0E());
                    if (list2.size() != A1E2.size()) {
                        onFail(AbstractC166987dD.A18("videos size differs from finalVideoDurations size"));
                        return;
                    }
                }
                C449124v c449124v2 = AnonymousClass229.A01(userSession2).A0A;
                EnumC193318hB enumC193318hB = EnumC193318hB.A02;
                if (c5jk2 == c5jk3) {
                    enumC114925Hg = EnumC114925Hg.FEED;
                } else {
                    enumC114925Hg = null;
                }
                c449124v2.A0Y(enumC193318hB, enumC114925Hg2, enumC114925Hg, false);
                ArrayList A1E3 = AbstractC166987dD.A1E();
                ArrayList A1E4 = AbstractC166987dD.A1E();
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C195868lW c195868lW5 = (C195868lW) AbstractC001800i.A0O(list2, i3);
                    if (c195868lW5 != null) {
                        int i4 = c195868lW5.A07;
                        if (c5jk2 == c5jk3) {
                            c115475Kh = C191478dz.A00(c191478dz2, c195868lW5, 0, c195868lW5.A07);
                        } else {
                            OLX olx = (OLX) AbstractC001800i.A0O(A1E2, i3);
                            if (olx != null) {
                                int i5 = olx.A00;
                                int i6 = olx.A01;
                                i4 = i5 - i6;
                                c115475Kh = C191478dz.A00(c191478dz2, c195868lW5, i6, i5);
                            } else {
                                c115475Kh = null;
                            }
                        }
                        AnonymousClass229.A01(userSession2).A0A.A0d(null, null, C16930sl.A00, i4, 1, c191478dz2.A0s.A0E(), AbstractC167007dF.A1X(c5jk2, c5jk3));
                        if (c115475Kh != null) {
                            A1E3.add(c115475Kh);
                            A1E4.add(AHY.A00(c115475Kh, null, i3));
                        }
                    }
                }
                C183348Bh.A01(c22p2, AbstractC183338Bg.A00(userSession2), c5jk2, ((C55U) c1811981v.A00).A02, "prefill_process_end", "8");
                c191478dz2.A0s.A0i(A1E3);
                AbstractC183338Bg.A00(userSession2).A06(c22p2, c5jk2, ((C55U) c1811981v.A00).A02, A1E4);
                c191478dz2.A0G();
                C191478dz.A08(c191478dz2);
            }
        };
        C14360o3.A0B(list, 0);
        C14360o3.A0B(A002, 3);
        C121275eQ c121275eQ = new C121275eQ(new B1U(context, userSession, cameraSpec, null, A002, str2, list), 459);
        c121275eQ.A00 = c2ah;
        C1GJ.A03(c121275eQ);
    }

    public final void A0I() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        InterfaceC09390do interfaceC09390do = this.A1C;
        ((View) interfaceC09390do.getValue()).startAnimation(alphaAnimation);
        ((View) interfaceC09390do.getValue()).setVisibility(0);
    }

    public final void A0L(Drawable drawable) {
        ClipsCreationViewModel clipsCreationViewModel;
        int i;
        int i2 = 0;
        C14360o3.A0B(drawable, 0);
        if (drawable instanceof C5RM) {
            if (this.A0G != null && !this.A0u.A0H()) {
                C5RM c5rm = (C5RM) drawable;
                Integer num = null;
                if (c5rm.A01 != -1 && c5rm.A00 != -1) {
                    Drawable drawable2 = c5rm.A0A;
                    if (drawable2 instanceof C6RB) {
                        C6RB c6rb = (C6RB) drawable2;
                        if (c6rb != null) {
                            num = c6rb.A0M;
                        }
                        if (num == C05F.A01) {
                            clipsCreationViewModel = this.A0s;
                            boolean z = !clipsCreationViewModel.A0L.A04.isEmpty();
                            i2 = c5rm.A01;
                            if (!z) {
                                if (i2 != -1 && c5rm.A00 != -1) {
                                    i = Math.min(ClipsCreationViewModel.A00(clipsCreationViewModel).A00, c5rm.A00);
                                    c5rm.Efo(i2, i);
                                }
                            }
                        }
                    }
                } else {
                    if (this.A0G == null) {
                        AbstractC12120kG.A07("ClipsPostCaptureController", "video render not set up", null);
                        return;
                    }
                    clipsCreationViewModel = this.A0s;
                }
                i = ClipsCreationViewModel.A00(clipsCreationViewModel).A00;
                c5rm.Efo(i2, i);
            } else {
                this.A15.add(drawable);
                return;
            }
        }
        A01(drawable, this);
        this.A0T.removeCallbacksAndMessages(null);
    }

    public final void A0M(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (drawable instanceof C5RM) {
            A02(drawable, this);
            ArrayList arrayList = new ArrayList();
            List list = this.A15;
            for (Object obj : list) {
                if (obj == drawable) {
                    arrayList.add(obj);
                }
            }
            list.removeAll(arrayList);
            return;
        }
        A02(drawable, this);
    }

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void DOn(float f, float f2) {
    }

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void E2A(float f) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C115475Kh A00(C191478dz c191478dz, C195868lW c195868lW, int i, int i2) {
        String str;
        Integer num;
        Boolean bool;
        Long l;
        Long l2;
        C3x9 clipsMetadata;
        C5HL B3d;
        List<InterfaceC31129DmC> B9u;
        Medium medium = c195868lW.A0R;
        if (medium != null) {
            str = medium.A0Y;
            num = Integer.valueOf(medium.A05);
            bool = medium.A0K;
        } else {
            str = null;
            num = null;
            bool = null;
        }
        int i3 = c195868lW.A0K;
        int i4 = i3;
        int i5 = c195868lW.A08;
        int i6 = c195868lW.A09;
        if (i6 == 90 || i6 == 270) {
            i4 = i5;
            i5 = i3;
        }
        Medium A03 = C8IU.A03(new File(c195868lW.A0k), 3, 0);
        A03.A0B = i4;
        A03.A04 = i5;
        C195868lW c195868lW2 = new C195868lW(A03, i4, i5, 0);
        c195868lW2.A07 = c195868lW.A07;
        c195868lW2.A0H = 0;
        c195868lW2.A06 = c195868lW.A07;
        c195868lW2.A1L = c195868lW.A1L;
        c195868lW2.A0r = c195868lW.A0r;
        MediaUploadMetadata A02 = c195868lW.A02();
        ACRType aCRType = c191478dz.A1G;
        String str2 = c191478dz.A1L;
        int A00 = AbstractC55153OdH.A00(aCRType, str2, 1);
        int i7 = c195868lW2.A07;
        C115475Kh c115475Kh = new C115475Kh(null, null == true ? 1 : 0, new C115545Ko(C16930sl.A00, null, null, 1.0f, -1, false), AbstractC23036ADs.A01(c195868lW2, c195868lW2.A06(), A00, i7, 0, i7, i7), null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 1.0f, 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 2147483640, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0);
        c115475Kh.A09 = i;
        c115475Kh.A08 = i2;
        c115475Kh.A0E = c195868lW2.A0U;
        c115475Kh.A0S = true;
        c115475Kh.A0U = false;
        C115525Km c115525Km = c115475Kh.A0G;
        c115525Km.A0C = bool;
        C1816283r c1816283r = c191478dz.A0z.A00;
        ArrayList arrayList = null;
        if (c1816283r != null && (clipsMetadata = c1816283r.A04.A0C.getClipsMetadata()) != null && (B3d = clipsMetadata.B3d()) != null && (B9u = B3d.B9u()) != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(B9u, 10));
            for (InterfaceC31129DmC interfaceC31129DmC : B9u) {
                arrayList.add(new C51743MtS((Integer) 0, "giphy_video", interfaceC31129DmC.getId(), interfaceC31129DmC.getUsername(), interfaceC31129DmC.getTitle(), interfaceC31129DmC.C8B()));
            }
        }
        c115525Km.A0J = arrayList;
        c115475Kh.A0G.A0B.A01(A02);
        if (str2 != null) {
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            } else {
                l = null;
            }
            if (num != null) {
                l2 = Long.valueOf(num.intValue());
            } else {
                l2 = null;
            }
            c115475Kh.A0D = new C26086BgF(aCRType, l, l2, str2);
        }
        return c115475Kh;
    }

    public static final void A03(View view, C191478dz c191478dz) {
        IgdsMediaButton igdsMediaButton = c191478dz.A0F;
        if (igdsMediaButton != null) {
            CreationActionBar creationActionBar = c191478dz.A0e;
            if (creationActionBar.A09.contains(igdsMediaButton)) {
                creationActionBar.addView(view);
                creationActionBar.bringChildToFront(view);
                C110964z8 c110964z8 = new C110964z8();
                c110964z8.A0I(creationActionBar);
                c110964z8.A0C(view.getId(), 3, igdsMediaButton.getId(), 3);
                int id = view.getId();
                int id2 = igdsMediaButton.getId();
                Context context = creationActionBar.getContext();
                C14360o3.A07(context);
                c110964z8.A0E(id, 6, id2, 7, -((int) AbstractC13880nE.A04(context, 12)));
                c110964z8.A0G(creationActionBar);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                view.startAnimation(alphaAnimation);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(com.instagram.common.typedurl.ImageUrl r22, X.C8ZA r23, X.C191478dz r24, com.instagram.music.common.model.AudioOverlayTrack r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191478dz.A04(com.instagram.common.typedurl.ImageUrl, X.8ZA, X.8dz, com.instagram.music.common.model.AudioOverlayTrack, boolean):void");
    }

    public static final void A06(C191478dz c191478dz) {
        View view = c191478dz.A03;
        if (c191478dz.A01 != null && view != null && view.getVisibility() == 0 && c191478dz.A0L) {
            LayoutTransition layoutTransition = AbstractC124845kp.A01(view).getLayoutTransition();
            C14360o3.A07(layoutTransition);
            layoutTransition.disableTransitionType(3);
            View view2 = c191478dz.A03;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    public static final void A07(C191478dz c191478dz) {
        if (C18U.A06(C06090Tz.A06, c191478dz.A0b, 36318501153020132L) && c191478dz.A01 == null) {
            try {
                c191478dz.A01 = ((ViewStub) c191478dz.A0c.requireViewById(R.id.preview_container)).inflate();
            } catch (Exception e) {
                AbstractC12120kG.A07("ClipsPostCaptureController", "Failed to inflate long press preview", e);
            }
        }
    }

    public static final void A08(C191478dz c191478dz) {
        Runnable runnableC24416Arx;
        AbstractC23021Ah.A00(c191478dz.A0b);
        if (!c191478dz.A0Q) {
            if (!c191478dz.A0X.isFinishing() && c191478dz.A0w == C5JK.A06) {
                C23031Ai c23031Ai = c191478dz.A0n.A07;
                if (!((Boolean) c23031Ai.A3K.CES(c23031Ai, C23031Ai.A8c[320])).booleanValue()) {
                    runnableC24416Arx = new RunnableC24415Arw(c191478dz);
                    C11T.A04(runnableC24416Arx, 1000L);
                    c191478dz.A0Q = true;
                }
            }
            C191728eU c191728eU = c191478dz.A09;
            if (c191728eU == null) {
                return;
            }
            C23031Ai c23031Ai2 = c191728eU.A02;
            if (((Boolean) c23031Ai2.A2e.CES(c23031Ai2, C23031Ai.A8c[321])).booleanValue() || c23031Ai2.A1p()) {
                return;
            }
            runnableC24416Arx = new RunnableC24416Arx(c191478dz);
            C11T.A04(runnableC24416Arx, 1000L);
            c191478dz.A0Q = true;
        }
    }

    public static final void A09(C191478dz c191478dz) {
        C2GS c2gs = c191478dz.A1F;
        if (c191478dz.A0d.A08.A00 instanceof C81V) {
            c2gs.A0A(new C8A8(C0eB.A00));
        }
    }

    public static final void A0A(C191478dz c191478dz) {
        int i;
        if (!c191478dz.A0O) {
            C84B c84b = (C84B) c191478dz.A0s.A0F.A02();
            if (c84b != null) {
                i = c84b.A01.size();
            } else {
                i = 0;
            }
            C183348Bh A00 = AbstractC183338Bg.A00(c191478dz.A0b);
            Object obj = c191478dz.A18.get();
            C14360o3.A07(obj);
            C22P c22p = (C22P) obj;
            C14360o3.A0B(c22p, 0);
            AHF A01 = A00.A0J.A01("postcapture", 838614012);
            String name = c22p.name();
            C14360o3.A0B(name, 1);
            A01.A04.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, name);
            A01.A05("num_segments", i);
            A00.A07 = A01.A01();
            ((C1809981b) c191478dz.A0l).A01.A04(new Object());
        } else {
            ((C1809981b) c191478dz.A0l).A01.A04(new Object());
        }
        c191478dz.A0O(c191478dz.A0S.getString(2131969964));
    }

    public static final void A0B(C191478dz c191478dz) {
        IgdsMediaButton igdsMediaButton;
        int i;
        C1816283r c1816283r = c191478dz.A0z.A00;
        C84B c84b = (C84B) c191478dz.A0s.A0F.A02();
        if ((c1816283r == null || c1816283r.A00 != EnumC189548aZ.A07 || c84b == null || c84b.A01.size() > 1) && !((Boolean) c191478dz.A1A.getValue()).booleanValue()) {
            igdsMediaButton = c191478dz.A10;
            if (igdsMediaButton != null) {
                i = 0;
            } else {
                return;
            }
        } else {
            igdsMediaButton = c191478dz.A10;
            if (igdsMediaButton == null) {
                return;
            } else {
                i = 8;
            }
        }
        igdsMediaButton.setVisibility(i);
    }

    public static final void A0C(C191478dz c191478dz, AudioOverlayTrack audioOverlayTrack) {
        List A04;
        UserSession userSession = c191478dz.A0b;
        if (C36A.A08(userSession) && !c191478dz.A0s.A0n() && c191478dz.A0g.A01 == null && c191478dz.A0u.A04 == null && !c191478dz.A0l.CRB(EnumC1810181d.A09) && !A0D(c191478dz, audioOverlayTrack)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36324475452534968L)) {
                C8KD c8kd = c191478dz.A0p;
                AbstractC59962oe abstractC59962oe = c191478dz.A0Z;
                MusicProduct musicProduct = MusicProduct.A06;
                MusicBrowseCategory A01 = C50535MSo.A01("clips_browse");
                String str = c191478dz.A14;
                LinkedHashMap linkedHashMap = null;
                if (C18U.A06(c06090Tz, userSession, 36324475452731579L) && (A04 = ((C1817984o) c191478dz.A19.getValue()).A04()) != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj : A04) {
                        String str2 = ((C9ZC) obj).A02;
                        Object obj2 = linkedHashMap2.get(str2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap2.put(str2, obj2);
                        }
                        ((List) obj2).add(obj);
                    }
                    linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap2.size()));
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        Object key = entry.getKey();
                        Iterable<C9ZC> iterable = (Iterable) entry.getValue();
                        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(iterable, 10));
                        if (A0L < 16) {
                            A0L = 16;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(A0L);
                        for (C9ZC c9zc : iterable) {
                            linkedHashMap3.put(c9zc.A01, Float.valueOf(c9zc.A00));
                        }
                        linkedHashMap.put(key, linkedHashMap3);
                    }
                }
                c8kd.A00(musicProduct, abstractC59962oe, userSession, A01, str, linkedHashMap);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        if (r6 != null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0D(X.C191478dz r10, com.instagram.music.common.model.AudioOverlayTrack r11) {
        /*
            X.8KD r2 = r10.A0p
            X.05A r1 = r2.A01
            java.lang.Object r0 = r1.getValue()
            X.Goo r0 = (X.C38061Goo) r0
            if (r0 == 0) goto L68
            X.JIN r0 = r0.A00()
            if (r0 == 0) goto L68
            com.instagram.common.typedurl.ImageUrl r6 = r0.AsT()
        L16:
            X.2GT r0 = r2.A00
            java.lang.Object r9 = r0.A02()
            java.lang.Object r0 = r1.getValue()
            X.Goo r0 = (X.C38061Goo) r0
            if (r0 == 0) goto L66
            X.JIN r8 = r0.A00()
        L28:
            com.instagram.music.common.config.MusicAttributionConfig r3 = r10.A11
            if (r3 == 0) goto L64
            com.instagram.music.common.model.MusicAssetModel r0 = r3.A02
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.A0E
        L32:
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L6a
            int r0 = r0.length()
            if (r0 == 0) goto L6a
            com.instagram.common.session.UserSession r5 = r10.A0b
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36324003006131976(0x810c7d00002f08, double:3.0347839938733645E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L6a
            if (r3 == 0) goto L63
            com.instagram.music.common.model.MusicAssetModel r0 = r3.A02
            if (r0 == 0) goto L63
            com.instagram.common.typedurl.ImageUrl r3 = r0.A03
            if (r3 == 0) goto L63
            X.8ZA r2 = X.C8ZA.A05
            r0 = 36324003006197513(0x810c7d00012f09, double:3.0347839939148103E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            A04(r3, r2, r10, r11, r0)
        L63:
            return r7
        L64:
            r0 = 0
            goto L32
        L66:
            r8 = 0
            goto L28
        L68:
            r6 = 0
            goto L16
        L6a:
            if (r9 == 0) goto La3
            if (r6 == 0) goto Lac
            if (r8 == 0) goto La5
            com.instagram.common.session.UserSession r5 = r10.A0b
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36324003006131976(0x810c7d00002f08, double:3.0347839938733645E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto La5
            com.instagram.pendingmedia.model.ClipInfo r0 = r10.A0G
            if (r0 == 0) goto Lac
            int r1 = r0.A05
            int r0 = r0.A07
            int r1 = r1 - r0
            com.instagram.music.common.model.MusicAssetModel r0 = com.instagram.music.common.model.MusicAssetModel.A02(r8)
            X.C14360o3.A0A(r0)
            com.instagram.music.common.model.AudioOverlayTrack r3 = new com.instagram.music.common.model.AudioOverlayTrack
            r3.<init>(r0, r2, r1)
            X.8ZA r2 = X.C8ZA.A04
            r0 = 36324003006197513(0x810c7d00012f09, double:3.0347839939148103E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            A04(r6, r2, r10, r3, r0)
            return r7
        La3:
            if (r6 == 0) goto Lac
        La5:
            X.8ZA r1 = X.C8ZA.A02
            r0 = 0
            A04(r6, r1, r10, r0, r2)
            return r7
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191478dz.A0D(X.8dz, com.instagram.music.common.model.AudioOverlayTrack):boolean");
    }

    public static final boolean A0E(C191478dz c191478dz, EnumC1810181d enumC1810181d) {
        if (enumC1810181d == EnumC1810181d.A0j && (c191478dz.A0d.A08.A00 instanceof C81V)) {
            return true;
        }
        return false;
    }

    public final void A0F() {
        ClipsCreationViewModel clipsCreationViewModel = this.A0s;
        clipsCreationViewModel.AI1();
        C84K c84k = clipsCreationViewModel.A0K.A0A;
        Map map = c84k.A02;
        map.clear();
        C84K.A00(c84k, map);
    }

    public final void A0G() {
        ((Dialog) this.A1N.getValue()).dismiss();
    }

    public final void A0H() {
        if (this.A0s.A0u()) {
            this.A0l.E4u(new C8UN(EnumC222689s9.A03, true, false, false, null, false, false));
            return;
        }
        A0N(EnumC222689s9.A03);
        if (!this.A1D && this.A0R == 1) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A0b).A01.ARD();
            ARD.E7D("edit_clips_button_badge_nux", -1);
            ARD.apply();
        }
        View view = this.A02;
        if (view != null) {
            view.setVisibility(8);
        }
        AnonymousClass229.A01(this.A0b).A0w(EnumC114925Hg.CLIPS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012e, code lost:
    
        if (r0.A01.size() != 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
    
        if (r5.A0G.A08 == 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191478dz.A0J():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.8cy] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final void A0K() {
        ?? r2;
        if (((Boolean) this.A0j.A0B.getValue()).booleanValue()) {
            ClipsCreationViewModel clipsCreationViewModel = this.A0s;
            if (clipsCreationViewModel.A0l()) {
                UserSession userSession = this.A0b;
                C448724r c448724r = AnonymousClass229.A01(userSession).A0F;
                C18920wW c18920wW = c448724r.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
                if (A00.isSampled()) {
                    A00.A8R(C81X.A0b, "tool_type");
                    A00.AAP("legacy_falco_event_name", "IG_CAMERA_ADD_CLIPS");
                    C22M c22m = c448724r.A04;
                    String str = c22m.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("camera_session_id", str);
                    A00.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A00.A8p("event_type", 2);
                    A00.A8R(EnumC50631MWs.A0I, "surface");
                    A00.A8R(c448724r.A0I(), "capture_type");
                    A00.AAP("module", "post_capture");
                    A00.A8R(AnonymousClass249.VIDEO, "media_type");
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
                    A00.Cht();
                }
                if (C18U.A06(C06090Tz.A05, userSession, 36321718083593954L)) {
                    r2 = new C176497t7(Integer.valueOf(ClipsCreationViewModel.A00(clipsCreationViewModel).A01.size()), true);
                } else {
                    r2 = new Object();
                }
                clipsCreationViewModel.A0I.A0B(this.A16.get());
                ((C1809981b) this.A0l).A01.A04(new C8U0(r2));
                return;
            }
            C9GR.A07(this.A0S, 2131955752);
        }
    }

    public final void A0N(EnumC222689s9 enumC222689s9) {
        Boolean bool = Boolean.FALSE;
        this.A0l.E4u(new C8UN(enumC222689s9, bool, bool, bool, null, false, false));
    }

    public final void A0O(String str) {
        InterfaceC09390do interfaceC09390do = this.A1N;
        ((C6WQ) interfaceC09390do.getValue()).A00(str);
        C0fJ.A00((Dialog) interfaceC09390do.getValue());
    }

    public final boolean A0P() {
        ClipsCreationViewModel clipsCreationViewModel = this.A0s;
        if (clipsCreationViewModel.A03 != C5JK.A05 && !clipsCreationViewModel.A0t()) {
            return false;
        }
        return true;
    }

    @Override // X.C8F1
    public final void DCs(boolean z) {
        InterfaceC1810081c interfaceC1810081c = this.A0l;
        boolean z2 = true;
        if (interfaceC1810081c.CRB(EnumC1810181d.A0m) || interfaceC1810081c.CRB(EnumC1810181d.A09) || interfaceC1810081c.CRB(EnumC1810181d.A0K)) {
            z2 = false;
        }
        if ((this.A0d.A08.A00 instanceof C81V) && interfaceC1810081c.Cae() && z2) {
            AbstractC125325le.A04(null, new View[]{this.A0U}, false);
        }
        if (z) {
            A09(this);
        }
    }

    @Override // X.C8F1
    public final void DCt() {
        if ((this.A0d.A08.A00 instanceof C81V) && this.A0l.Cae()) {
            AbstractC125325le.A05(new View[]{this.A0U}, false);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DOp(float f) {
        if (this.A0G != null) {
            AbstractC12120kG.A07("ClipsPostCaptureController", "drawable is null", null);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DhR(float f) {
        if (this.A0G != null) {
            AbstractC12120kG.A07("ClipsPostCaptureController", "drawable is null", null);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void Djx(float f) {
        if (this.A0G != null) {
            this.A0y.A06((int) (f * (r0.A05 - r0.A07)));
        }
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        EnumC1810181d enumC1810181d = (EnumC1810181d) obj2;
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(enumC1810181d, 1);
        if (enumC1810181d == EnumC1810181d.A11) {
            A0F();
        }
        if (enumC1810181d != EnumC1810181d.A0j) {
            C8Z9 c8z9 = this.A0B;
            if (c8z9 != null) {
                c8z9.A04(false);
            }
        } else if (AbstractC199378re.A00(this.A0Y) && !this.A0M) {
            if (C18U.A06(C06090Tz.A05, this.A0b, 36323612164107689L)) {
                A0C(this, null);
            }
        }
        EnumC1810181d enumC1810181d2 = EnumC1810181d.A0K;
        if (enumC1810181d == enumC1810181d2) {
            InterfaceC09390do interfaceC09390do = this.A1C;
            ViewParent parent = ((View) interfaceC09390do.getValue()).getParent();
            IgFrameLayout igFrameLayout = this.A0c;
            if (parent != igFrameLayout) {
                igFrameLayout.addView((View) interfaceC09390do.getValue(), -1, new FrameLayout.LayoutParams(-2, -2, 81));
            }
            A0I();
        } else if (obj == enumC1810181d2) {
            ((View) this.A1C.getValue()).setVisibility(8);
        }
        A07(this);
        View view = this.A01;
        if (A0E(this, enumC1810181d)) {
            if (C18U.A06(C06090Tz.A05, this.A0b, 36318501153020132L) && !this.A0L && view != null) {
                this.A03 = view.requireViewById(R.id.preview_instruction_prompt);
                Handler handler = this.A0T;
                handler.postDelayed(new RunnableC24417Ary(this), 1000L);
                handler.postDelayed(new RunnableC24418Arz(this), 3000L);
                this.A0L = true;
                return;
            }
        }
        A06(this);
    }

    @Override // X.InterfaceC184998Io
    public final void DuL(boolean z) {
        C448124l c448124l = AnonymousClass229.A01(this.A0b).A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A02);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_CLIPS_TIMELINE_SCROLL");
            A08.A0q("CLIPS_TIMELINE_SCROLL");
            C448124l.A00(A08, c448124l);
            C22M c22m = c448124l.A04;
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A08.A0V(i);
            A08.A0M(c448124l.A0I(), "capture_type");
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0c(c22m.A0A);
            A08.A0m(C22F.A09.getModuleName());
            A08.A0U();
            A08.A0Q("capture_format_index", 0L);
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DuJ(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x03b0, code lost:
    
        if (r12 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0205, code lost:
    
        if (r14.A04 != null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r4v20, types: [X.8EU, X.8eU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C191478dz(android.view.View r34, X.C2GS r35, X.C22P r36, X.AbstractC59962oe r37, X.C1819485e r38, X.InterfaceC11380iw r39, com.instagram.common.session.UserSession r40, com.instagram.common.ui.base.IgFrameLayout r41, X.C1810981l r42, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r43, X.AnonymousClass840 r44, X.C81J r45, X.C188798Xv r46, X.C86S r47, X.InterfaceC143326dX r48, X.InterfaceC1810081c r49, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r50, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r51, X.AnonymousClass856 r52, X.C677733r r53, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r54, java.lang.String r55, java.util.List r56, java.util.List r57, X.InterfaceC08830cm r58, X.InterfaceC08830cm r59, X.InterfaceC08830cm r60, X.InterfaceC08830cm r61) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191478dz.<init>(android.view.View, X.2GS, X.22P, X.2oe, X.85e, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgFrameLayout, X.81l, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.840, X.81J, X.8Xv, X.86S, X.6dX, X.81c, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.856, X.33r, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.String, java.util.List, java.util.List, X.0cm, X.0cm, X.0cm, X.0cm):void");
    }
}
