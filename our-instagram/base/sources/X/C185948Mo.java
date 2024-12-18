package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import go.Seq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8Mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185948Mo implements InterfaceC11380iw, C7W5, InterfaceC1821886c, InterfaceC185638Lg, InterfaceC185958Mp, InterfaceC185628Le, C8MF, InterfaceC1810781j, InterfaceC185968Mq {
    public static final String __redex_internal_original_name = "VideoViewController";
    public float A00;
    public C2GT A01;
    public InterfaceC58362lv A02;
    public C199758sR A03;
    public C81N A04;
    public C55U A05;
    public C8RZ A06;
    public InterfaceC25221BDv A07;
    public C198988qy A08;
    public EnumC189218Zt A09;
    public C8ME A0A;
    public C9KJ A0B;
    public FilterGroupModel A0C;
    public C47Z A0D;
    public Runnable A0E;
    public Runnable A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public Toast A0P;
    public InterfaceC58362lv A0Q;
    public C81N A0R;
    public C81N A0S;
    public A5F A0T;
    public C9KK A0U;
    public boolean A0V;
    public final Activity A0W;
    public final ViewGroup A0X;
    public final C22P A0Y;
    public final C1819485e A0Z;
    public final C89T A0a;
    public final C41761wQ A0b;
    public final UserSession A0c;
    public final C1810981l A0d;
    public final C89F A0e;
    public final C183688Ct A0f;
    public final C8MV A0g;
    public final C1828689h A0h;
    public final TargetViewSizeProvider A0i;
    public final AnonymousClass874 A0j;
    public final AnonymousClass840 A0k;
    public final C81J A0l;
    public final C185918Ml A0m;
    public final C8NJ A0n;
    public final C8MT A0o;
    public final C184048Et A0p;
    public final C8LC A0q;
    public final C8DL A0r;
    public final InterfaceC1810081c A0s;
    public final C84F A0t;
    public final ClipsCreationViewModel A0u;
    public final C8NL A0v;
    public final C5JK A0w;
    public final C8NQ A0x;
    public final C87H A0y;
    public final ViewOnTouchListenerC1829389o A0z;
    public final C8MX A10;
    public final List A11;
    public final InterfaceC08830cm A12;
    public final InterfaceC08830cm A13;
    public final InterfaceC09390do A14;
    public final InterfaceC09390do A15;
    public final Fragment A16;
    public final C8NS A17;
    public final InterfaceC60072op A18;
    public final C8LJ A19;
    public final C89H A1A = new C89H() { // from class: X.8Mr
        @Override // X.C89H
        public final void Cy8(Integer num, boolean z) {
            int intValue = num.intValue();
            boolean z2 = true;
            if (intValue != 0 && intValue != 2 && intValue != 3) {
                z2 = false;
            }
            C185948Mo c185948Mo = C185948Mo.this;
            C47Z c47z = c185948Mo.A0D;
            if (c47z != null) {
                c47z.A5F = z2;
                c185948Mo.A0J();
            }
            C9KJ c9kj = c185948Mo.A0B;
            if (c9kj != null) {
                C9KW c9kw = c9kj.A08;
                if (z2) {
                    if (c9kw != null) {
                        c9kw.A09();
                    }
                } else if (c9kw != null) {
                    c9kw.A0A();
                }
            }
            if (z && c185948Mo.A0l.A18 != null) {
                int i = 2131976622;
                if (z2) {
                    i = 2131976621;
                }
                C185948Mo.A0B(c185948Mo, i);
            }
        }
    };
    public final C185908Mk A1B;
    public final C1820485o A1C;
    public final CachingVideoSaver A1D;
    public final C8BE A1E;
    public final C8NF A1F;
    public final ClipsCreationDraftViewModel A1G;
    public final C89E A1H;
    public final AnonymousClass825 A1I;
    public final C8LM A1J;
    public final C8M1 A1K;

    public final void A0Q(ACA aca, C211689Zc c211689Zc, Integer num, String str, String str2, boolean z) {
        A0P(aca, c211689Zc, null, null, null, num, str, null, null, str2, null, null, 1, z);
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        C47Z c47z;
        C9KJ c9kj;
        C9KW c9kw;
        this.A0K = true;
        C81N c81n = this.A04;
        if (c81n.A0D != null) {
            c81n.A06().A01();
        }
        this.A0M = this.A0V;
        C9KJ c9kj2 = this.A0B;
        if (c9kj2 != null) {
            c9kj2.A03();
        }
        Iterator it = this.A11.iterator();
        while (it.hasNext()) {
            ((C87B) it.next()).DOt();
        }
        if (this.A09 == EnumC189218Zt.A04 && (c9kj = this.A0B) != null && (this.A05 instanceof C81V) && (c9kw = c9kj.A08) != null) {
            boolean z = c9kw instanceof C219919nd;
            C9KW c9kw2 = c9kw;
            if (z) {
                C219919nd c219919nd = (C219919nd) c9kw;
                C55208OeM c55208OeM = c219919nd.A05;
                c9kw2 = c219919nd;
                if (c55208OeM == null) {
                    c219919nd.A09 = true;
                    c9kw2 = c219919nd;
                }
            }
            c9kw2.A0O();
        }
        C8MX c8mx = this.A10;
        if (c8mx != null && (c47z = this.A0D) != null && c47z.A1N.A0F != null) {
            C05A c05a = this.A0r.A02;
            if (c05a.getValue() != C8DM.A09 && c05a.getValue() != C8DM.A0A && c05a.getValue() != C8DM.A0B) {
                c05a.Egh(C8DM.A0C);
                ClipInfo clipInfo = this.A0D.A1N;
                c8mx.A00(clipInfo.A0F, clipInfo.A0A);
            }
        }
    }

    public static AbstractC24481Hr A00(C185948Mo c185948Mo) {
        C47Z c47z;
        Bitmap A02 = ((C8LK) c185948Mo.A19.A00.A00()).A02(false, false);
        if (A02 != null && (c47z = c185948Mo.A0D) != null) {
            return AHW.A01(c185948Mo.A0W, AHW.A00(A02, c47z.A02), c185948Mo.A0c, true);
        }
        return null;
    }

    public static C81N A01(C185948Mo c185948Mo) {
        if (c185948Mo.A05 instanceof C81V) {
            if (C18U.A06(C06090Tz.A05, c185948Mo.A0c, 36316168990232653L)) {
                C81N c81n = c185948Mo.A0R;
                if (c81n == null) {
                    ViewGroup viewGroup = c185948Mo.A0X;
                    SurfaceView surfaceView = (SurfaceView) viewGroup.findViewById(R.id.camera_video_preview_surface_view);
                    if (surfaceView == null) {
                        surfaceView = (SurfaceView) ((ViewStub) viewGroup.requireViewById(R.id.camera_video_preview_surface_view_stub)).inflate().requireViewById(R.id.camera_video_preview_surface_view);
                    }
                    C81N c81n2 = new C81N(surfaceView);
                    c185948Mo.A0R = c81n2;
                    return c81n2;
                }
                return c81n;
            }
        }
        C81N c81n3 = c185948Mo.A0S;
        if (c81n3 != null) {
            return c81n3;
        }
        ViewGroup viewGroup2 = c185948Mo.A0X;
        MultiListenerTextureView multiListenerTextureView = (MultiListenerTextureView) viewGroup2.findViewById(R.id.camera_video_preview_texture_view);
        if (multiListenerTextureView == null) {
            multiListenerTextureView = (MultiListenerTextureView) ((ViewStub) viewGroup2.requireViewById(R.id.camera_video_preview_texture_view_stub)).inflate().requireViewById(R.id.camera_video_preview_texture_view);
        }
        C81N c81n4 = new C81N(multiListenerTextureView);
        c185948Mo.A0S = c81n4;
        return c81n4;
    }

    public static AAW A02(AbstractC24481Hr abstractC24481Hr, C185948Mo c185948Mo, AGH agh, C47Z c47z, Map map, boolean z, boolean z2) {
        String A0R;
        boolean z3;
        C1125256f c1125256f;
        C115595Kt c115595Kt;
        UserSession userSession = c185948Mo.A0c;
        Activity activity = c185948Mo.A0W;
        C55190Odw.A01(activity, userSession, c47z, AbstractC176977tt.A00(activity));
        c47z.A2V = AbstractC197018nW.A00(c185948Mo.A0k.A02.A03());
        C1810981l c1810981l = c185948Mo.A0d;
        boolean A00 = AbstractC226699zR.A00(c1810981l);
        boolean z4 = false;
        if (c47z.A10 != null) {
            z4 = true;
        }
        C8MT c8mt = c185948Mo.A0o;
        TransformMatrixConfig A06 = c8mt.A06(agh, A00, C6PX.A00(activity), z4);
        try {
            c47z.A60 = A00;
            if (c1810981l == null) {
                z3 = false;
            } else {
                z3 = c1810981l.A08.A00 instanceof C81V;
            }
            c47z.A61 = z3;
            if (c185948Mo.A0C == null) {
                c1125256f = null;
            } else {
                c185948Mo.A03.getClass();
                FilterChain deepCopy = ((FilterGroupModelImpl) c185948Mo.A0C).A02.deepCopy();
                if (A06 != null) {
                    AbstractC23113AHc.A02(deepCopy, "VideoViewController#serializeFilterModel", A06.C6v());
                    AbstractC199768sS.A01(deepCopy, A06.A08, A06.C6v());
                    c1125256f = new C1125256f(deepCopy);
                } else {
                    throw new IllegalArgumentException("transformMatrixConfig should not be null for a non-square crop");
                }
            }
            c47z.A1K = c1125256f;
            C14360o3.A0B(activity, 1);
            C14360o3.A0B(userSession, 2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            C47v A0H = c185948Mo.A0H();
            C14360o3.A0B(A0H, 0);
            if (c185948Mo.A05 instanceof C81V) {
                c115595Kt = c185948Mo.A0t.A03.A02();
            } else {
                c115595Kt = null;
            }
            C55U c55u = c185948Mo.A05;
            boolean z5 = false;
            if (c55u == C208509Kk.A00) {
                z5 = true;
            }
            return new AAW(activity, userSession, abstractC24481Hr, A06, c115595Kt, A0H, c47z, linkedHashMap, z2, z5, z);
        } catch (IllegalArgumentException e) {
            try {
                A0R = C47Y.A00(c47z);
            } catch (IOException e2) {
                A0R = AnonymousClass001.A0R("unable to retrieve pendingMediaJson: ", e2.getMessage());
            }
            StringBuilder sb = new StringBuilder();
            String obj = c8mt.A0F.A01.toString();
            C14360o3.A07(obj);
            sb.append(obj);
            sb.append("\n");
            sb.append(A0R);
            sb.append("\n");
            sb.append("can transform media: ");
            C199388rf c199388rf = c8mt.A04;
            boolean z6 = true;
            if (c199388rf == null || !c199388rf.A00) {
                z6 = false;
            }
            sb.append(z6);
            AbstractC12120kG.A01("VideoViewController_nullTransformMatrixConfig", sb.toString());
            throw e;
        }
    }

    public static C47Z A03(C185948Mo c185948Mo, C195868lW c195868lW) {
        String str;
        int width;
        int height;
        C44059Jdk c44059Jdk;
        C915647m c915647m;
        String str2;
        boolean z = c185948Mo.A0l.A3m;
        UserSession userSession = c185948Mo.A0c;
        C183978Ee c183978Ee = c185948Mo.A0f.A0O;
        if (c183978Ee != null) {
            str = c183978Ee.A06();
        } else {
            str = null;
        }
        if (z) {
            width = c195868lW.A0K;
            height = c195868lW.A08;
        } else {
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c185948Mo.A0i).A0K;
            width = interfaceC1812882f.getWidth();
            height = interfaceC1812882f.getHeight();
        }
        if (MY4.A04(c195868lW.A0k)) {
            c44059Jdk = new C44059Jdk(c195868lW.A0k, 0, -3L, true);
        } else {
            c44059Jdk = null;
        }
        ClipInfo A00 = C9O0.A00(userSession, c195868lW, c44059Jdk, width, height);
        C22P c22p = c185948Mo.A0Y;
        c185948Mo.A0k.A02.A01.A0Y.getClass();
        C47Z A01 = C9O1.A01(c22p, c185948Mo.A0q.A00(), userSession, null, A00, c195868lW, str, null, z);
        String str3 = (String) c185948Mo.A1G.A0P.getValue();
        if (c185948Mo.A05 == C208509Kk.A00) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36320717356409681L) && (str2 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L) != null) {
                A01.A2g = str2;
            }
        }
        if (str3 != null && A01.A2g == null) {
            A01.A2g = str3;
        }
        C47Z c47z = c185948Mo.A0D;
        if (c47z != null && (c915647m = c47z.A1i) != null) {
            A01.A1i = c915647m;
        }
        return A01;
    }

    private void A04() {
        C47Z c47z;
        AtomicBoolean atomicBoolean;
        C8MX c8mx = this.A10;
        if (c8mx != null && (c47z = this.A0D) != null && c47z.A1N.A0F != null) {
            C8DL c8dl = this.A0r;
            C05A c05a = c8dl.A02;
            if (c05a.getValue() != C8DM.A09 && c05a.getValue() != C8DM.A0A && c05a.getValue() != C8DM.A0B) {
                c05a.Egh(C8DM.A0D);
                c8dl.A03.Egh(0);
                String str = this.A0D.A1N.A0F;
                C14360o3.A0B(str, 0);
                HashMap hashMap = c8mx.A02.A04;
                if (hashMap.containsKey(str) && (atomicBoolean = (AtomicBoolean) hashMap.get(str)) != null) {
                    atomicBoolean.set(true);
                }
            }
        }
    }

    private void A05() {
        if (this.A0U != null) {
            C195868lW A04 = this.A0k.A02.A01.A04();
            A04.getClass();
            C8LC c8lc = this.A0q;
            int i = A04.A0F;
            C198528q1 c198528q1 = c8lc.A04;
            if (c198528q1 != null) {
                c198528q1.A00 = i;
                c198528q1.A02 = this;
            }
            C9U6 c9u6 = c8lc.A03;
            if (c9u6 != null) {
                c9u6.A00 = i;
                c9u6.A02 = this;
            }
        }
    }

    public static void A06(CameraAREffect cameraAREffect, C185948Mo c185948Mo) {
        C200558ty AXl;
        String str;
        if (cameraAREffect != null && cameraAREffect.A0I()) {
            InterfaceC25221BDv interfaceC25221BDv = c185948Mo.A07;
            if (interfaceC25221BDv == null) {
                C55U c55u = c185948Mo.A05;
                Fragment fragment = c185948Mo.A16;
                interfaceC25221BDv = AbstractC53897NsT.A00(fragment.requireActivity(), fragment.getViewLifecycleOwner(), c185948Mo.A0c, c55u, c185948Mo.A0k);
                c185948Mo.A07 = interfaceC25221BDv;
                if (interfaceC25221BDv == null) {
                    return;
                }
            }
            if (c185948Mo.A0Q == null) {
                c185948Mo.A0Q = new AU9(c185948Mo);
            }
            C2GT C9B = interfaceC25221BDv.C9B();
            c185948Mo.A01 = C9B;
            C9B.A06(c185948Mo.A16.getViewLifecycleOwner(), c185948Mo.A0Q);
            C195868lW A04 = c185948Mo.A0k.A02.A01.A04();
            if (A04 != null && ((str = c185948Mo.A0H) == null || !str.equals(A04.A07()))) {
                c185948Mo.A0H = A04.A07();
                A0B(c185948Mo, 2131964712);
                c185948Mo.A07.AUd(c185948Mo.A0W);
            }
            if (c185948Mo.A0T == null) {
                c185948Mo.A0T = new A5F(c185948Mo);
            }
            C200558ty AXl2 = c185948Mo.A0Z.A00().AXl();
            if (AXl2 == null) {
                return;
            }
            A5F a5f = c185948Mo.A0T;
            java.util.Set set = AXl2.A05;
            if (set == null) {
                set = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
                AXl2.A05 = set;
            }
            set.add(a5f);
            return;
        }
        if (c185948Mo.A0T == null || (AXl = c185948Mo.A0Z.A00().AXl()) == null) {
            return;
        }
        A5F a5f2 = c185948Mo.A0T;
        java.util.Set set2 = AXl.A05;
        if (set2 == null) {
            return;
        }
        set2.remove(a5f2);
    }

    public static void A07(final C185948Mo c185948Mo) {
        Runnable runnable;
        if (c185948Mo.A0B != null) {
            Iterator it = c185948Mo.A11.iterator();
            while (it.hasNext()) {
                if (!((C87B) it.next()).AG5(c185948Mo)) {
                    c185948Mo.A0B.A09(false);
                    runnable = new Runnable() { // from class: X.9Mp
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator it2 = C185948Mo.this.A11.iterator();
                            while (it2.hasNext()) {
                                ((C87B) it2.next()).E0B();
                            }
                        }
                    };
                    break;
                }
            }
        }
        C9KJ c9kj = c185948Mo.A0B;
        if (c9kj != null) {
            c9kj.CoQ();
        }
        runnable = new Runnable() { // from class: X.8hI
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it2 = C185948Mo.this.A11.iterator();
                while (it2.hasNext()) {
                    ((C87B) it2.next()).E03();
                }
            }
        };
        C11T.A02(runnable);
    }

    public static void A08(C185948Mo c185948Mo) {
        if (c185948Mo.A04.A05().getParent() != null) {
            c185948Mo.A04.A05().setVisibility(8);
            ViewGroup viewGroup = c185948Mo.A0X;
            viewGroup.removeView(c185948Mo.A04.A05());
            viewGroup.setTranslationY(0.0f);
            c185948Mo.A04.A0E.A00.clear();
        }
    }

    public static void A09(C185948Mo c185948Mo) {
        SurfaceView surfaceView;
        SurfaceHolder holder;
        MultiListenerTextureView multiListenerTextureView;
        C8MX c8mx;
        if (c185948Mo.A0N) {
            c185948Mo.A0x.A01();
        }
        C8RZ c8rz = c185948Mo.A06;
        if (c8rz != null) {
            c8rz.A0E(false);
        }
        C81N c81n = c185948Mo.A04;
        if (c81n.A0D != null) {
            c81n.A06().A00.A00();
        }
        c185948Mo.A0X.removeCallbacks(c185948Mo.A0F);
        c185948Mo.A0F = null;
        C8MT c8mt = c185948Mo.A0o;
        c8mt.A05 = null;
        c8mt.A0F.A00("onStopVideoRendering nullified");
        AnonymousClass874 anonymousClass874 = c185948Mo.A0j;
        C89H c89h = c185948Mo.A1A;
        C14360o3.A0B(c89h, 0);
        anonymousClass874.A0C.remove(c89h);
        Iterator it = c185948Mo.A11.iterator();
        while (it.hasNext()) {
            ((C87B) it.next()).Dp5();
        }
        C9KJ c9kj = c185948Mo.A0B;
        if (c9kj != null && (c8mx = c185948Mo.A10) != null) {
            C185828Mc c185828Mc = c8mx.A01;
            c9kj.A0J.remove(c185828Mc);
            C9KW c9kw = c9kj.A08;
            if (c9kw != null) {
                c9kw.A0A.remove(c185828Mc);
            }
        }
        c185948Mo.A04();
        if (c185948Mo.A0B != null) {
            if (c185948Mo.A0U != null) {
                C81N c81n2 = c185948Mo.A04;
                TextureView.SurfaceTextureListener surfaceTextureListener = c81n2.A08;
                if (surfaceTextureListener != null && (multiListenerTextureView = c81n2.A0D) != null) {
                    multiListenerTextureView.A00.A00.remove(surfaceTextureListener);
                }
                SurfaceHolder.Callback callback = c81n2.A07;
                if (callback != null && (surfaceView = c81n2.A0C) != null && (holder = surfaceView.getHolder()) != null) {
                    holder.removeCallback(callback);
                }
            }
            c185948Mo.A0U = null;
            c185948Mo.A0B.A00();
            C9KJ c9kj2 = c185948Mo.A0B;
            c9kj2.A06(null);
            c9kj2.A05(null, null, null, null, null);
            c9kj2.A0B = null;
            C9KW c9kw2 = c9kj2.A08;
            if (c9kw2 != null) {
                c9kw2.A06 = null;
            }
            c9kj2.A05 = null;
            if (c9kw2 != null) {
                c9kw2.A02 = null;
            }
            c9kj2.A0J.clear();
            C9KW c9kw3 = c9kj2.A08;
            if (c9kw3 != null) {
                c9kw3.A0A.clear();
            }
            c185948Mo.A0B = null;
        }
        A08(c185948Mo);
        c185948Mo.A0P = null;
    }

    public static void A0B(C185948Mo c185948Mo, int i) {
        Toast toast = c185948Mo.A0P;
        if (toast != null) {
            toast.cancel();
        }
        c185948Mo.A0P = C9GR.A01(c185948Mo.A0W, null, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        if (r5.A0R == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(X.C185948Mo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185948Mo.A0C(X.8Mo, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x029f, code lost:
    
        if (X.C18U.A06(r8, r4, 36318157557471199L) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ab, code lost:
    
        if (X.C9O6.A00(r4, r40.A05) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ad, code lost:
    
        r31 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b5, code lost:
    
        if (X.C9O6.A00(r4, r40.A05) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b7, code lost:
    
        r10 = r40.A05;
        X.C14360o3.A0B(r10, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c2, code lost:
    
        if (r10.equals(X.C208509Kk.A00) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c4, code lost:
    
        r36 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02cf, code lost:
    
        if (X.C18U.A06(r8, r4, 36320717356606290L) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02d3, code lost:
    
        r29 = X.C6PX.A01(r4);
        r12 = r40.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d9, code lost:
    
        if (r30 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02db, code lost:
    
        if (r5 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02dd, code lost:
    
        r32 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02df, code lost:
    
        if (r36 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e3, code lost:
    
        r11 = r40.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02e7, code lost:
    
        if (r41.A1I != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02eb, code lost:
    
        if (r41.A13 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ef, code lost:
    
        if (r41.A15 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02f1, code lost:
    
        r5 = r41.A18;
        r8 = r40.A0h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f5, code lost:
    
        if (r5 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02f7, code lost:
    
        r5 = "video_import";
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02fd, code lost:
    
        if (X.C1828689h.A00(r8, r5) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ff, code lost:
    
        r8 = new X.C199468rn(r13.getApplicationContext(), new X.C9OU(r17), X.C17280tP.A00().A0b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0317, code lost:
    
        r5 = new X.C9KK(r13, r8, r4, r12, r11, r27, r28, r29, r30, r31, r32, true, false, false, r36);
        r40.A0U = r5;
        r8 = r40.A0B;
        X.C14360o3.A0B(r8, 0);
        r5.A07 = r8;
        r8 = r40.A0U;
        r5 = r40.A0Z;
        X.C14360o3.A0B(r5, 0);
        r8.A02 = r5;
        r11 = r41.A0K;
        r10 = r41.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0344, code lost:
    
        if (r11 <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0346, code lost:
    
        if (r10 > 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x035b, code lost:
    
        r8 = r40.A0U;
        r8.A01 = r11;
        r8.A00 = r10;
        r40.A04.A08(r8);
        r40.A04.A05().setVisibility(0);
        r13 = new java.util.ArrayList(X.C8M4.A00(r4).A02(r40.A05 instanceof X.C81V));
        r5 = r40.A0B;
        r5.getClass();
        r12 = new X.AiL(r5);
        r11 = r40.A1F;
        r10 = ((X.C1809981b) r40.A0s).A02;
        X.C14360o3.A0B(r10, 2);
        r5 = new X.C189208Zp(r11, r12, new X.C8MB(X.AnonymousClass249.PHOTO, r4, r10, r13), r13);
        r40.A0A = r5;
        r5.A04.add(r40);
        r14 = r40.A0U;
        r15 = r40.A0C;
        r15.getClass();
        r13 = new X.C8MH();
        r5 = r40.A0A;
        r5.getClass();
        r12 = new X.C8MJ(r5);
        r11 = new X.C8MM(r4, r2);
        r5 = new X.B3Z(r40);
        r10 = ((com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r15).A02;
        r5 = new X.C199578s9(r10, new X.C199568s8(r10, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03d8, code lost:
    
        monitor-enter(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0489, code lost:
    
        r12.A00 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x048b, code lost:
    
        monitor-exit(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x048c, code lost:
    
        r11.A00 = r15;
        r5 = r13.A00;
        r5.add(r12);
        r5.add(r11);
        r14.A05 = r13;
        r5 = r40.A1J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x049a, code lost:
    
        if (r5 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x049c, code lost:
    
        ((X.C8MN) r5.A00.getValue()).A02 = r40.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04a8, code lost:
    
        r12 = r41.A0K;
        r11 = r41.A08;
        r40.A03 = new X.C199758sR(r12, r11);
        r2.A02 = r17;
        r2.A03 = r16;
        r5 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04bd, code lost:
    
        if (r5 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04c1, code lost:
    
        if (r5.A00 != true) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04c3, code lost:
    
        r10 = r2.A06;
        r2.A0A(r12, r11, r41.A09, "front".equals(r41.A0f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04d2, code lost:
    
        if (r10 == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04dc, code lost:
    
        if (r10.A00.A02() != X.C8DM.A02) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04de, code lost:
    
        r2.A0B(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04e1, code lost:
    
        r12 = r2.A0E.A02.A01;
        r5 = r12.A0i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04e9, code lost:
    
        if (r5 == null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04eb, code lost:
    
        r11 = r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04ed, code lost:
    
        r10 = true;
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04f1, code lost:
    
        if (r11 != X.EnumC209589Ot.A04) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04f3, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04f6, code lost:
    
        if (r12.A0a != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04f8, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04f9, code lost:
    
        if (r8 != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04fb, code lost:
    
        if (r10 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0503, code lost:
    
        r40.A08 = r2.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0509, code lost:
    
        if (r7 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x050b, code lost:
    
        r13 = r7.A01;
        r12 = r40.A0D;
        r11 = r40.A0i;
        X.C14360o3.A0B(r12, 2);
        X.C14360o3.A0B(r11, 3);
        r13.A04 = r41;
        r13.A01 = r2;
        r1 = r2.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x051f, code lost:
    
        if (r1 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0521, code lost:
    
        r13.A02 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig(new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams(r1.A08), "SmartTrackingOnScreenRenderController", r1.A05, r1.A03, r1.A04, r1.A07, r1.A06, r1.A0A, r1.A0F, r1.A0C, r1.A0G, r1.A0D, r1.A0E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0569, code lost:
    
        r13.A03 = r12;
        r13.A00 = r11;
        r40.A0B.A07(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0576, code lost:
    
        if (r1 != X.C5JK.A06) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x057c, code lost:
    
        if (r40.A0E() <= 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0588, code lost:
    
        if (r40.A0E() > X.AnonymousClass827.A00(r4).A01) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x058a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x058b, code lost:
    
        r1 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x058d, code lost:
    
        if (r1 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x058f, code lost:
    
        r1.A00 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0591, code lost:
    
        r3 = r2.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0593, code lost:
    
        if (r3 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0595, code lost:
    
        r1 = r40.A0D;
        r1.A16 = r3;
        r1.A5z = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x059b, code lost:
    
        r40.A0X.setTranslationY(0.0f);
        r5 = r40.A0j;
        r3 = r40.A1A;
        X.C14360o3.A0B(r3, 0);
        r5.A0C.add(r3);
        r5 = r40.A11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05b9, code lost:
    
        if (r5.hasNext() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05bb, code lost:
    
        ((X.C87B) r5.next()).Dl9(r40.A0E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x062a, code lost:
    
        r5 = r40.A0v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x062c, code lost:
    
        if (r5 == null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x062e, code lost:
    
        r7 = r40.A0n;
        r1 = r2.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0632, code lost:
    
        if (r1 == null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0634, code lost:
    
        r8 = X.C9O8.A00(r1, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x063e, code lost:
    
        if (r8.A00() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x064e, code lost:
    
        if (X.AMG.A04((X.C84B) r5.A04.A0F.A02()) == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0650, code lost:
    
        X.C8NL.A03(r8, null, r5, null, false);
        r10 = new X.C206169Az(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
        r7.A04 = false;
        r2.A09(r10.A03, r10.A02, r10.A00, r10.A01);
        r7.A04 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0672, code lost:
    
        X.AnonymousClass229.A01(r4).A0J.A05(r1, "setup_video_rendering_end");
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x067f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04fd, code lost:
    
        r5 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04ff, code lost:
    
        if (r5 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0501, code lost:
    
        r5.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0687, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05c9, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x05cc, code lost:
    
        r10 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x05ce, code lost:
    
        if (r10 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x05d0, code lost:
    
        r11 = X.AbstractC14620oa.A00(r41.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05d8, code lost:
    
        if ((r10 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x05da, code lost:
    
        if (r11 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05dc, code lost:
    
        r8 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r10;
        r8.A08 = X.AbstractC199558s5.A00(r11.A01);
        r8.A07 = X.AbstractC199558s5.A00(r11.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05ef, code lost:
    
        ((com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r10).A03 = r41.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x05fa, code lost:
    
        if (r11 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x05fc, code lost:
    
        r10 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r10;
        r10.A03("u_topColor", X.AbstractC224629vn.A00(r11.A01));
        r10.A03("u_bottomColor", X.AbstractC224629vn.A00(r11.A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0614, code lost:
    
        r8 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0616, code lost:
    
        if (r8 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0618, code lost:
    
        r8.A00 = r41.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05f5, code lost:
    
        X.C8MT.A03(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x061d, code lost:
    
        r2.A05 = null;
        r2.A0F.A00("onSetupVideoRendering nullified");
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0348, code lost:
    
        X.AbstractC12120kG.A01(X.AnonymousClass001.A02(r11, r10, "VideoViewController: invalid video dimension:", "x"), X.AnonymousClass001.A0R("path=", r41.A0k));
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03db, code lost:
    
        r5 = "video_recording";
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03df, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03e2, code lost:
    
        r8 = r40.A0h;
        r5 = "boomerang_capture";
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02e1, code lost:
    
        r32 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02d1, code lost:
    
        r36 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02a3, code lost:
    
        if (r5 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r8 == X.C05F.A15) goto L11;
     */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object, X.9ur] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, X.8rf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0D(final X.C185948Mo r40, X.C195868lW r41, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185948Mo.A0D(X.8Mo, X.8lW, int, boolean):boolean");
    }

    public final int A0E() {
        C47Z c47z = this.A0D;
        if (c47z != null) {
            ClipInfo clipInfo = c47z.A1N;
            int i = clipInfo.A07;
            int i2 = clipInfo.A05;
            int i3 = i2 - i;
            if (i3 < 0) {
                AbstractC12120kG.A01(__redex_internal_original_name, AnonymousClass001.A02(i, i2, "video duration is negative. start time: ", ", end time: "));
            } else {
                return i3;
            }
        }
        return 0;
    }

    public final Bitmap A0F(Bitmap bitmap, RectF rectF, C210399Se c210399Se) {
        Bitmap A03;
        int i;
        C9KW c9kw;
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            rectF.set(0.0f, 0.0f, this.A04.A05().getWidth(), this.A04.A05().getHeight());
            AbstractC12120kG.A01("VideoViewController#takeScreenshot:invalidScalingRect", "");
        }
        C81N c81n = this.A04;
        if (bitmap == null) {
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            MultiListenerTextureView multiListenerTextureView = c81n.A0D;
            if (multiListenerTextureView != null) {
                A03 = multiListenerTextureView.getBitmap(width, height);
            } else {
                A03 = null;
            }
        } else {
            A03 = c81n.A03(bitmap);
        }
        if (A03 != null) {
            Canvas canvas = new Canvas(A03);
            C8LK c8lk = (C8LK) this.A19.A00.A00();
            C9KJ c9kj = this.A0B;
            if (c9kj != null && (c9kw = c9kj.A08) != null) {
                i = c9kw.A07();
            } else {
                i = -1;
            }
            Bitmap A01 = c8lk.A01(bitmap, rectF, c210399Se, 1.0f, 1.0f, i, false, true, true, true);
            if (A01 != null) {
                canvas.drawBitmap(A01, 0.0f, 0.0f, (Paint) null);
            }
        }
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C187028Qv A0G() {
        /*
            r5 = this;
            X.8Ct r4 = r5.A0f
            X.89E r3 = r5.A1H
            X.8ME r2 = r5.A0A
            X.47Z r0 = r5.A0D
            if (r0 == 0) goto Lf
            boolean r1 = r0.A5F
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            X.8Qv r0 = X.C8NV.A00(r4, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185948Mo.A0G():X.8Qv");
    }

    public final C47v A0H() {
        if (!(this.A05 instanceof C81V)) {
            if (!C18U.A06(C06090Tz.A05, this.A0c, 36317929922565845L)) {
                return new C47v();
            }
        }
        return this.A1E.A02();
    }

    public final void A0I() {
        C8LM c8lm = this.A1J;
        if (c8lm != null) {
            C8MN c8mn = (C8MN) c8lm.A00.getValue();
            if (c8mn.A04) {
                C55982hj c55982hj = c8mn.A06;
                c55982hj.A08(c55982hj.A01, true);
            }
        }
    }

    public final void A0J() {
        C195868lW A04;
        C81J c81j;
        DirectCameraViewModel directCameraViewModel;
        if (this.A0D != null && (A04 = this.A0k.A02.A01.A04()) != null && (c81j = this.A0l) != null && (directCameraViewModel = c81j.A1I) != null && directCameraViewModel.A00 == 8) {
            UserSession userSession = this.A0c;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36323560625286513L)) {
                A0D(this, A04, 0, false);
                this.A1D.A01(null, A04.A07(), new InterfaceC16820sZ() { // from class: X.B2c
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        C185948Mo c185948Mo = C185948Mo.this;
                        C47Z c47z = c185948Mo.A0D;
                        c47z.getClass();
                        return C185948Mo.A02(C185948Mo.A00(c185948Mo), c185948Mo, new AGH(), c47z, ((C8NW) c185948Mo.A0f.A1h.get()).A1A(), false, false);
                    }
                }, true, true);
            }
        }
    }

    public final void A0K() {
        C208699Ld c208699Ld;
        InterfaceC179607yA A00;
        C178907x2 c178907x2;
        C9KJ c9kj = this.A0B;
        if (c9kj != null) {
            c9kj.A09(false);
        }
        C9KK c9kk = this.A0U;
        if (c9kk != null && (c208699Ld = c9kk.A04) != null && (A00 = C208699Ld.A00(c208699Ld)) != null) {
            C209159Mx c209159Mx = (C209159Mx) ((C9P6) ((AbstractC179687yI) A00).A00.Aq0(C9P6.A00));
            C209159Mx.A00(c209159Mx).E3h();
            C176517t9 c176517t9 = c209159Mx.A06;
            if (c176517t9 != null && (c178907x2 = c176517t9.A06) != null) {
                c178907x2.A06.A00(c176517t9);
            }
        }
    }

    public final void A0L(int i) {
        C9KJ c9kj = this.A0B;
        if (c9kj != null) {
            C9KW c9kw = c9kj.A08;
            if (c9kw != null) {
                c9kw.A0H(i);
            }
            Iterator it = this.A11.iterator();
            while (it.hasNext()) {
                ((C87B) it.next()).Dzq(i);
            }
        }
    }

    public final void A0M(int i, int i2) {
        C9KJ c9kj = this.A0B;
        if (c9kj != null) {
            c9kj.A03 = i;
            c9kj.A02 = i2;
            int i3 = c9kj.A04;
            if (i3 < i || (i2 != -1 && i3 > i2)) {
                c9kj.A04 = i;
            }
            C9KW c9kw = c9kj.A08;
            if (c9kw != null) {
                c9kw.A0I(i, i2);
            }
        }
    }

    public final void A0N(C26086BgF c26086BgF, final AbstractC24481Hr abstractC24481Hr, ACA aca, C211689Zc c211689Zc, A8X a8x, final C47Z c47z, C195868lW c195868lW, final Map map, boolean z, boolean z2) {
        UserSession userSession = this.A0c;
        if (C6PX.A01(userSession)) {
            onPause();
        }
        if (c195868lW != null) {
            A0D(this, c195868lW, 0, false);
            if (z && !z2) {
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36323560625024365L)) {
                    C8MV c8mv = this.A0g;
                    String str = c195868lW.A0k;
                    C14360o3.A0B(aca, 0);
                    C14360o3.A0B(str, 1);
                    C36961nt.A00().EOg(c26086BgF, c8mv.A02, new C23796Ag7(this, c8mv, aca), aca, c211689Zc, a8x, null, str);
                    if (C6PX.A01(userSession)) {
                        onResume();
                        return;
                    }
                    return;
                }
            }
        }
        C23829Age c23829Age = new C23829Age(c26086BgF, this, aca, c211689Zc, a8x);
        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.B3Q
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C185948Mo.A02(abstractC24481Hr, this, new AGH(), c47z, map, false, false);
            }
        };
        if (c195868lW != null) {
            this.A1D.A01(c23829Age, c195868lW.A07(), interfaceC16820sZ, false, true);
            return;
        }
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36319102448573376L);
        AAW aaw = (AAW) interfaceC16820sZ.invoke();
        if (A06) {
            C14360o3.A0B(aaw, 0);
            ALk.A01(aaw, c23829Age);
        } else {
            C14360o3.A0B(aaw, 0);
            C1GJ.A03(ALk.A00(aaw, c23829Age));
        }
    }

    public final void A0O(C8RZ c8rz, boolean z) {
        C6RB c6rb;
        this.A14.getValue();
        this.A06 = c8rz;
        C1815483h c1815483h = this.A0k.A02.A01;
        C195868lW A04 = c1815483h.A04();
        A04.getClass();
        int i = c1815483h.A04().A0G;
        this.A06.getClass();
        RunnableC24838Ayy runnableC24838Ayy = new RunnableC24838Ayy(this, A04, i, z);
        this.A0F = runnableC24838Ayy;
        AbstractC13880nE.A0q(this.A0X, runnableC24838Ayy);
        C81Z c81z = this.A1B.A00;
        C150286pc c150286pc = c81z.A1x;
        if (c150286pc != null) {
            c81z.A0f.A11.add(((C191478dz) c150286pc.get()).A0k);
            C191478dz c191478dz = (C191478dz) c150286pc.get();
            List list = c191478dz.A15;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c191478dz.A0L((Drawable) it.next());
                }
                C191478dz.A09(c191478dz);
                list.clear();
            }
            C8JU c8ju = c81z.A1i;
            if ((c8ju instanceof C8JT) && ((C8JT) c8ju).A0o) {
                InteractiveDrawableContainer interactiveDrawableContainer = c81z.A2B;
                Integer num = C05F.A01;
                if (interactiveDrawableContainer.A10(num)) {
                    C191478dz c191478dz2 = (C191478dz) c150286pc.get();
                    Iterator it2 = c191478dz2.A13.A0T(C5RM.class).iterator();
                    while (it2.hasNext()) {
                        C5RM c5rm = (C5RM) it2.next();
                        Drawable drawable = c5rm.A0A;
                        if ((drawable instanceof C6RB) && (c6rb = (C6RB) drawable) != null && c6rb.A0M == num) {
                            C191478dz.A02(c5rm, c191478dz2);
                            C191478dz.A01(c5rm, c191478dz2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0015, code lost:
    
        if (r33 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P(X.ACA r30, X.C211689Zc r31, X.A96 r32, X.C188538Ws r33, java.lang.Boolean r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.List r40, java.util.List r41, int r42, boolean r43) {
        /*
            r29 = this;
            r8 = r30
            boolean r0 = r8.A00()
            r14 = r32
            r15 = r33
            if (r0 != 0) goto L12
            boolean r0 = r8.A01()
            if (r0 == 0) goto L1d
        L12:
            if (r32 != 0) goto L17
            r1 = 1
            if (r33 == 0) goto L18
        L17:
            r1 = 0
        L18:
            java.lang.String r0 = "storyXShareParams and highlightsInfo are not valid with Direct shares"
            X.C02R.A06(r1, r0)
        L1d:
            r6 = r29
            X.8MV r5 = r6.A0g
            boolean r0 = r5.A00
            if (r0 != 0) goto La3
            r6.A0I()
            r20 = 0
            r13 = r31
            if (r31 == 0) goto La4
            java.lang.String r1 = r13.A00
            if (r1 == 0) goto La4
        L32:
            X.81J r2 = r6.A0l
            if (r2 == 0) goto L3a
            com.instagram.model.direct.camera.DirectCameraViewModel r12 = r2.A1I
            if (r12 != 0) goto L3c
        L3a:
            r12 = r20
        L3c:
            X.840 r4 = r6.A0k
            X.83z r0 = r4.A02
            X.83h r3 = r0.A01
            X.8lW r0 = r3.A04()
            if (r0 == 0) goto L52
            X.8lW r0 = r3.A04()
            int r0 = r0.A0F
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
        L52:
            X.22P r3 = r4.A01
            X.22P r0 = X.C22P.A2S
            if (r3 != r0) goto L6f
            boolean r0 = r2.A3B
            if (r0 != 0) goto L6f
            X.8M1 r3 = r6.A1K
            com.instagram.model.direct.DirectShareTarget r0 = r8.A00
            java.lang.Integer r21 = X.C05F.A1I
            r16 = r3
            r17 = r0
            r18 = r12
            r19 = r13
            r22 = r1
            r16.A00(r17, r18, r19, r20, r21, r22)
        L6f:
            X.8Qv r9 = r6.A0G()
            X.8Ml r0 = r6.A0m
            X.81Z r0 = r0.A00
            X.8NU r0 = r0.A0g
            X.8r2 r7 = r0.A00()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r11 = r6.A0C
            X.8Ct r0 = r6.A0f
            boolean r26 = r0.A0r()
            boolean r0 = r2.A3B
            r10 = 0
            r24 = r41
            r23 = r40
            r27 = r43
            r25 = r42
            r16 = r34
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r38
            r21 = r39
            r22 = r1
            r28 = r0
            r5.A06(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        La3:
            return
        La4:
            java.lang.String r1 = X.AbstractC68470VSb.A00()
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185948Mo.A0P(X.ACA, X.9Zc, X.A96, X.8Ws, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, boolean):void");
    }

    public final void A0R(C195868lW c195868lW, int i, boolean z) {
        if (this.A0B != null) {
            C1816783z c1816783z = this.A0k.A02;
            C195868lW A04 = c1816783z.A01.A04();
            A04.getClass();
            if (!A04.equals(c195868lW)) {
                c1816783z.A09(Collections.singletonList(new C198308pf(c195868lW, c1816783z.A00().A06)));
            }
            if (A04.A0K == c195868lW.A0K && A04.A08 == c195868lW.A08 && (this.A05 instanceof C81V)) {
                MediaComposition mediaComposition = c195868lW.A0O;
                if (mediaComposition != null) {
                    C9KJ c9kj = this.A0B;
                    C9KW c9kw = c9kj.A08;
                    if (c9kw != null) {
                        if (c9kw instanceof C219919nd) {
                            C219919nd c219919nd = (C219919nd) c9kw;
                            C47Z c47z = ((C9KW) c219919nd).A09;
                            if (c47z != null) {
                                c47z.A0r = mediaComposition;
                                ((C9KW) c219919nd).A00 = i;
                                C55208OeM c55208OeM = c219919nd.A05;
                                if (c55208OeM != null) {
                                    ClipInfo clipInfo = c47z.A1N;
                                    if (clipInfo != null) {
                                        int i2 = clipInfo.A09;
                                        int i3 = clipInfo.A06;
                                        C9KJ c9kj2 = c219919nd.A0F.A00;
                                        c55208OeM.A0A(mediaComposition, i2, i3, c9kj2.A03, c9kj2.A02, i, c55208OeM.A09);
                                        if (z) {
                                            c55208OeM.A06();
                                        } else {
                                            c55208OeM.A05();
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                            }
                            int i4 = c9kj.A03;
                            if (i4 != -1 || c9kj.A02 != -1) {
                                c9kj.A08.A0I(i4, c9kj.A02);
                            }
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    }
                } else {
                    AbstractC12120kG.A01("VideoViewController#loadVideo:video", "loadVideo called for VVP with null media composition");
                }
                this.A0D = A03(this, c195868lW);
                A0C(this, false);
            } else {
                A09(this);
                this.A06.getClass();
                RunnableC24838Ayy runnableC24838Ayy = new RunnableC24838Ayy(this, c195868lW, i, z);
                this.A0F = runnableC24838Ayy;
                AbstractC13880nE.A0q(this.A0X, runnableC24838Ayy);
            }
            C8NJ c8nj = this.A0n;
            if (c8nj.A03 != null) {
                c8nj.A03 = 0;
            }
        }
    }

    @Override // X.C8MF
    public final int AuP() {
        C8ME c8me = this.A0A;
        if (c8me == null) {
            return Integer.MAX_VALUE;
        }
        return c8me.AuP();
    }

    @Override // X.C7W5
    public final void CkQ(CharSequence charSequence, boolean z) {
        C8M1 c8m1 = this.A1K;
        String charSequence2 = charSequence.toString();
        C14360o3.A0B(charSequence2, 0);
        if (z) {
            c8m1.A01.A01(charSequence2);
        }
    }

    @Override // X.InterfaceC185958Mp
    public final void DFI() {
        C9KJ c9kj = this.A0B;
        if (c9kj != null) {
            c9kj.CoQ();
        }
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        C9KJ c9kj = this.A0B;
        if (c9kj != null) {
            c9kj.CoQ();
        }
    }

    @Override // X.InterfaceC185958Mp
    public final void DFL() {
        C9KJ c9kj = this.A0B;
        if (c9kj != null) {
            c9kj.A09(false);
        }
    }

    @Override // X.InterfaceC185638Lg
    public final void DZr(CameraAREffect cameraAREffect) {
        C47Z c47z = this.A0D;
        if (c47z != null) {
            c47z.A10 = cameraAREffect;
            A06(cameraAREffect, this);
        }
        if (cameraAREffect != null && C6PX.A01(this.A0c)) {
            C81N c81n = this.A04;
            if (c81n.A0D != null) {
                MultiListenerTextureView A06 = c81n.A06();
                A06.A00 = new C97764aF(A06, A06.A00);
            }
        }
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        boolean z;
        C9KW c9kw;
        boolean z2;
        Intent intent;
        String str;
        int i;
        EnumC1810181d enumC1810181d = (EnumC1810181d) obj;
        EnumC1810181d enumC1810181d2 = (EnumC1810181d) obj2;
        int ordinal = enumC1810181d.ordinal();
        if (ordinal != 6) {
            if (ordinal != 79) {
                if (ordinal != 39 && ordinal != 41) {
                    if (ordinal == 58 && enumC1810181d2 == EnumC1810181d.A0j) {
                        A0C(this, false);
                    }
                } else {
                    boolean z3 = obj3 instanceof C8VK;
                    if (z3 && ((i = ((C8VK) obj3).A00) == 9685 || i == 9683)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!this.A0K && !z2) {
                        onResume();
                    }
                    Integer num = C05F.A01;
                    Integer num2 = null;
                    if (z3) {
                        C8VK c8vk = (C8VK) obj3;
                        num2 = Integer.valueOf(c8vk.A00);
                        intent = c8vk.A01;
                    } else if (obj3 instanceof C8VM) {
                        C8VM c8vm = (C8VM) obj3;
                        int i2 = 0;
                        if (c8vm.A01) {
                            i2 = -1;
                        }
                        num2 = Integer.valueOf(i2);
                        intent = c8vm.A00;
                        num = C05F.A0N;
                    } else {
                        intent = null;
                    }
                    C1816783z c1816783z = this.A0k.A02;
                    C1815483h c1815483h = c1816783z.A01;
                    Integer num3 = c1815483h.A0B;
                    C14360o3.A07(num3);
                    if (num3 == num && c1816783z.A01() == EnumC198268pb.A07 && intent != null && num2 != null && num2.intValue() == -1) {
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets");
                        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("bundle_extra_user_story_targets");
                        boolean booleanExtra = intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false);
                        AH3 ah3 = new AH3(parcelableArrayListExtra, parcelableArrayListExtra2);
                        IngestSessionShim ingestSessionShim = (IngestSessionShim) intent.getParcelableExtra("bundle_extra_ingest_session");
                        if (ingestSessionShim == null) {
                            Integer num4 = c1815483h.A0D;
                            if (num4 != null) {
                                str = AbstractC226679zP.A00(num4);
                            } else {
                                str = "null";
                            }
                            C1810981l c1810981l = c1815483h.A0Y;
                            c1810981l.getClass();
                            AbstractC12120kG.A01(__redex_internal_original_name, AnonymousClass001.A13("onExitRecipientPicker(): null ingestSession | mediaSource=", str, " | cameraDestination=", ((C55U) c1810981l.A08.A00).A02, " | captureFormat=", AbstractC197018nW.A00(c1816783z.A03())));
                        } else {
                            this.A0g.A05(null, this, ingestSessionShim, null, ah3, num, booleanExtra);
                            if (!intent.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHARE_SHEET_LOGGING_REWRITE_IS_ENABLED", false) && parcelableArrayListExtra != null) {
                                UserSession userSession = this.A0c;
                                IQF.A01(this, userSession, userSession.userId, parcelableArrayListExtra);
                            }
                        }
                    } else {
                        Integer num5 = c1815483h.A0B;
                        C14360o3.A07(num5);
                        if (num5 == C05F.A0C && c1816783z.A01() == EnumC198268pb.A07 && intent != null && num2 != null && num2.intValue() == -1) {
                            intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets");
                            ArrayList parcelableArrayListExtra3 = intent.getParcelableArrayListExtra("bundle_extra_user_story_targets");
                            Object obj4 = this.A12.get();
                            UserStoryTarget userStoryTarget = UserStoryTarget.A07;
                            if (parcelableArrayListExtra3 != null && parcelableArrayListExtra3.contains(userStoryTarget) && obj4 != C22P.A3z && obj4 != C22P.A40 && obj4 != C22P.A5P && obj4 != C22P.A5Q) {
                                this.A0l.A0l.Crg("media_posted_to_highlight");
                            }
                        }
                    }
                }
            } else {
                C9KJ c9kj = this.A0B;
                if (c9kj != null && (c9kw = c9kj.A08) != null) {
                    c9kw.A0D();
                }
            }
        } else {
            this.A04.A05().setOnTouchListener(null);
        }
        switch (enumC1810181d2.ordinal()) {
            case 4:
                A05();
                return;
            case 6:
                A05();
                C9KJ c9kj2 = this.A0B;
                if (c9kj2 != null) {
                    c9kj2.CoQ();
                }
                this.A04.A05().setOnTouchListener(new View.OnTouchListener() { // from class: X.ATA
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        ALt aLt = C185948Mo.this.A0q.A01;
                        if (aLt != null) {
                            ALt.A00(aLt).A03();
                            return true;
                        }
                        return true;
                    }
                });
                return;
            case 39:
                A0I();
                z = this.A0K;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                z = !(obj3 instanceof C8U1);
                if (!this.A0K) {
                    return;
                }
                break;
            case 57:
                if (enumC1810181d != EnumC1810181d.A0j) {
                    return;
                }
                A0C(this, false);
                return;
            case 79:
                C9KJ c9kj3 = this.A0B;
                if (c9kj3 == null) {
                    return;
                }
                c9kj3.A09(true);
                return;
            default:
                return;
        }
        if (!z) {
            return;
        }
        onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r7 == 114) goto L8;
     */
    @Override // X.InterfaceC185628Le
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DrT(int r7) {
        /*
            r6 = this;
            X.47Z r0 = r6.A0D
            if (r0 == 0) goto L75
            X.0do r0 = r6.A14
            java.lang.Object r0 = r0.getValue()
            X.2tR r0 = (X.C62882tR) r0
            r4 = 1
            r0.A02(r4)
            r0 = 112(0x70, float:1.57E-43)
            if (r7 == r0) goto L1a
            r0 = 114(0x72, float:1.6E-43)
            r5 = 100
            if (r7 != r0) goto L1c
        L1a:
            r5 = 60
        L1c:
            com.instagram.common.session.UserSession r0 = r6.A0c
            X.1YQ r0 = X.C8M4.A00(r0)
            X.8M7 r0 = r0.A01(r7)
            java.lang.String r3 = r0.A04
            X.47Z r0 = r6.A0D
            X.47m r2 = r0.A1i
            X.47m r1 = new X.47m
            r1.<init>()
            r1.A00 = r5
            r1.A01 = r7
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L6e
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L3d:
            r1.A03 = r0
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L6c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L47:
            r1.A02 = r0
            X.47Z r0 = r6.A0D
            r0.A1i = r1
            X.85o r2 = r6.A1C
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A04(r3, r0)
            X.8Ct r0 = r6.A0f
            java.util.Set r0 = r0.A1v
            java.util.Iterator r1 = r0.iterator()
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.next()
            X.8F1 r0 = (X.C8F1) r0
            r0.DCs(r4)
            goto L5c
        L6c:
            r0 = 0
            goto L47
        L6e:
            r0 = 0
            goto L3d
        L70:
            android.app.Activity r0 = r6.A0W
            X.A02.A00(r0, r3)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185948Mo.DrT(int):void");
    }

    @Override // X.InterfaceC185628Le
    public final void DrX() {
        ((C62882tR) this.A14.getValue()).A02(false);
        C1820485o c1820485o = this.A1C;
        c1820485o.A05(false);
        c1820485o.A06(false);
    }

    @Override // X.InterfaceC185638Lg
    public final void DsT() {
        C81N c81n = this.A04;
        if (c81n.A0D != null) {
            MultiListenerTextureView A06 = c81n.A06();
            A06.A00 = new TextureViewSurfaceTextureListenerC97714a8(A06.A00);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C55U c55u = this.A05;
        if (c55u == C208509Kk.A00) {
            return "stories_postcapture_camera";
        }
        if (c55u == C81T.A00) {
            return "direct_postcapture_camera";
        }
        if (c55u == C1811481q.A00) {
            return "note_postcapture_camera";
        }
        return "clips_postcapture_camera";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.A0N() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r1 == false) goto L8;
     */
    @Override // X.InterfaceC1821886c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            r3 = this;
            X.9KJ r0 = r3.A0B
            if (r0 == 0) goto Lf
            X.9KW r0 = r0.A08
            if (r0 == 0) goto Lf
            boolean r1 = r0.A0N()
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            r3.A0V = r0
            r3.A0I()
            r1 = 0
            r3.A0K = r1
            X.0do r0 = r3.A15
            java.lang.Object r0 = r0.getValue()
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            r3.A0M = r1
            X.9KJ r2 = r3.A0B
            if (r2 == 0) goto L43
            X.9KW r0 = r2.A08
            if (r0 == 0) goto L34
            boolean r0 = r0.A0N()
            r1 = 1
            if (r0 != 0) goto L35
        L34:
            r1 = 0
        L35:
            r2.A0E = r1
            X.9KW r0 = r2.A08
            if (r0 == 0) goto L3e
            r0.A0K(r1)
        L3e:
            X.9KJ r0 = r3.A0B
            r0.A01()
        L43:
            java.util.List r0 = r3.A11
            java.util.Iterator r1 = r0.iterator()
        L49:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r1.next()
            X.87B r0 = (X.C87B) r0
            r0.DOs()
            goto L49
        L59:
            r3.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185948Mo.onPause():void");
    }

    public static void A0A(C185948Mo c185948Mo, int i) {
        C9KW c9kw;
        c185948Mo.A0L(i);
        C9KJ c9kj = c185948Mo.A0B;
        if (c9kj != null && !c9kj.CoQ() && (c9kw = c185948Mo.A0B.A08) != null) {
            c9kw.A0D();
        }
    }

    @Override // X.InterfaceC185968Mq
    public final void Eo6() {
        A07(this);
    }

    public C185948Mo(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, Fragment fragment, C1819485e c1819485e, InterfaceC60072op interfaceC60072op, UserSession userSession, C1810981l c1810981l, final C89F c89f, final C8LJ c8lj, C183688Ct c183688Ct, C8MV c8mv, C1828689h c1828689h, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, AnonymousClass840 anonymousClass840, C81J c81j, C185918Ml c185918Ml, C185908Mk c185908Mk, C1820485o c1820485o, final C8MT c8mt, C1830289x c1830289x, C184048Et c184048Et, C87A c87a, C8LC c8lc, CachingVideoSaver cachingVideoSaver, InterfaceC1810081c interfaceC1810081c, C5JK c5jk, C89E c89e, AnonymousClass825 anonymousClass825, ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, C8LM c8lm, C8MX c8mx, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        ArrayList arrayList = new ArrayList();
        this.A11 = arrayList;
        this.A15 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.8Ms
            @Override // X.InterfaceC16820sZ
            public final /* bridge */ /* synthetic */ Object invoke() {
                return new C6WQ(C185948Mo.this.A0W);
            }
        });
        this.A0b = C41761wQ.A00();
        this.A0V = true;
        this.A00 = 1.0f;
        this.A0L = false;
        this.A0k = anonymousClass840;
        this.A0c = userSession;
        this.A0s = interfaceC1810081c;
        interfaceC1810081c.A82(this);
        this.A0d = c1810981l;
        this.A16 = fragment;
        this.A0W = activity;
        this.A05 = (C55U) c1810981l.A08.A00;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.requireViewById(R.id.post_capture_texture_view_container);
        this.A0X = viewGroup3;
        this.A0e = c89f;
        AbstractC185998Mt.A00(viewGroup3);
        this.A04 = A01(this);
        this.A0l = c81j;
        this.A0i = targetViewSizeProvider;
        this.A13 = interfaceC08830cm;
        this.A1B = c185908Mk;
        this.A0m = c185918Ml;
        this.A0j = anonymousClass874;
        this.A0f = c183688Ct;
        c183688Ct.A07 = this;
        this.A12 = interfaceC08830cm2;
        this.A1H = c89e;
        this.A0z = viewOnTouchListenerC1829389o;
        this.A19 = c8lj;
        this.A0o = c8mt;
        java.util.Set set = c8mt.A0G;
        set.add(c1830289x);
        set.add(new InterfaceC1830389y() { // from class: X.8Mv
            @Override // X.InterfaceC1830389y
            public final void DvK(float f, float f2, float f3, float f4) {
                C9KJ c9kj;
                C9KW c9kw;
                C185948Mo c185948Mo = C185948Mo.this;
                C9KJ c9kj2 = c185948Mo.A0B;
                if ((c9kj2 != null && (c9kw = c9kj2.A08) != null && c9kw.A0N()) || (c9kj = c185948Mo.A0B) == null || !c185948Mo.A0n.A04) {
                    return;
                }
                c9kj.A02();
            }
        });
        this.A1C = c1820485o;
        this.A0Z = c1819485e;
        this.A0q = c8lc;
        this.A0p = c184048Et;
        this.A0w = c5jk;
        this.A1J = c8lm;
        this.A18 = interfaceC60072op;
        this.A1K = C8M0.A00(userSession);
        this.A0h = c1828689h;
        arrayList.add(c87a);
        c87a.A00 = new InterfaceC186038Mx() { // from class: X.8Mw
            @Override // X.InterfaceC186038Mx
            public final int CF4() {
                C09530e4 c09530e4;
                C09530e4 c09530e42;
                C185948Mo c185948Mo = C185948Mo.this;
                if (c185948Mo.A05 instanceof C81V) {
                    C87H c87h = c185948Mo.A0y;
                    int i = ClipsCreationViewModel.A00(c185948Mo.A0u).A00;
                    C2GS c2gs = c87h.A07;
                    C09530e4 c09530e43 = (C09530e4) c2gs.A02();
                    int i2 = 0;
                    if ((c09530e43 == null || ((Number) c09530e43.A01).intValue() != -1) && (c09530e4 = (C09530e4) c2gs.A02()) != null) {
                        i = ((Number) c09530e4.A01).intValue();
                    }
                    C09530e4 c09530e44 = (C09530e4) c2gs.A02();
                    if ((c09530e44 == null || ((Number) c09530e44.A00).intValue() != -1) && (c09530e42 = (C09530e4) c2gs.A02()) != null) {
                        i2 = ((Number) c09530e42.A00).intValue();
                    }
                    return i - i2;
                }
                return c185948Mo.A0E();
            }

            @Override // X.InterfaceC186038Mx
            public final void E3m() {
                C9KJ c9kj = C185948Mo.this.A0B;
                if (c9kj != null) {
                    c9kj.A09(true);
                }
            }

            @Override // X.InterfaceC186038Mx
            public final void E4Y() {
                C185948Mo.A07(C185948Mo.this);
            }
        };
        this.A14 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.8My
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C185948Mo c185948Mo = C185948Mo.this;
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return new C62882tR(c185948Mo.A0W, new InterfaceC11380iw() { // from class: X.Acf
                    public static final String __redex_internal_original_name = "VideoViewController$$ExternalSyntheticLambda27";

                    @Override // X.InterfaceC11380iw
                    public final String getModuleName() {
                        return "video_color_filter_swipe";
                    }
                }, c185948Mo.A0c, 23607164);
            }
        });
        this.A0Y = c81j.A0B;
        arrayList.add(new C186058Mz(viewGroup, fragment, userSession, this));
        C87H A00 = ((C87G) new C52942bb(fragment.requireActivity()).A00(C87G.class)).A00("post_capture");
        this.A0y = A00;
        A00.A0A.A06(fragment, new InterfaceC58362lv() { // from class: X.8NC
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C185948Mo.this.A09 = (EnumC189218Zt) obj;
            }
        });
        A00.A01.A06(fragment, new C151846sU(new InterfaceC58362lv() { // from class: X.8ND
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C9KW c9kw;
                List list = (List) obj;
                C9KJ c9kj = C185948Mo.this.A0B;
                if (c9kj != null && (c9kw = c9kj.A08) != null && (c9kw instanceof C219919nd)) {
                    C14360o3.A0B(list, 0);
                    C55208OeM c55208OeM = ((C219919nd) c9kw).A05;
                    if (c55208OeM != null) {
                        C55208OeM.A04(c55208OeM, list);
                    }
                }
            }
        }));
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        this.A1E = (C8BE) new C52942bb(new C185258Jq(userSession, fragmentActivity), fragmentActivity).A00(C8BE.class);
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        C8NF c8nf = (C8NF) new C52942bb(new C8NE(fragmentActivity, userSession, clipsCreationViewModel.A0Q), fragmentActivity).A00(C8NF.class);
        this.A1F = c8nf;
        c8nf.A00 = anonymousClass840;
        AbstractC58232lf.A00(AnonymousClass191.A00, c8nf.A07).A06(fragment, new InterfaceC58362lv() { // from class: X.8NH
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
            
                if (r1 != r7.A03) goto L16;
             */
            @Override // X.InterfaceC58362lv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r7) {
                /*
                    r6 = this;
                    X.8Mo r0 = X.C185948Mo.this
                    X.8NG r7 = (X.C8NG) r7
                    X.8ME r4 = r0.A0A
                    boolean r0 = r4 instanceof X.C189208Zp
                    if (r0 == 0) goto L8d
                    X.8Zp r4 = (X.C189208Zp) r4
                    r5 = 0
                    X.C14360o3.A0B(r7, r5)
                    X.8MK r3 = r4.A01
                    monitor-enter(r3)
                    int r0 = r3.A01     // Catch: java.lang.Throwable -> L84
                    int r2 = r7.A01     // Catch: java.lang.Throwable -> L84
                    if (r0 != r2) goto L2f
                    int r1 = r3.A02     // Catch: java.lang.Throwable -> L84
                    int r0 = r7.A02     // Catch: java.lang.Throwable -> L84
                    if (r1 != r0) goto L2f
                    float r1 = r3.A00     // Catch: java.lang.Throwable -> L84
                    float r0 = r7.A00     // Catch: java.lang.Throwable -> L84
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 != 0) goto L2f
                    java.lang.Integer r1 = r3.A03     // Catch: java.lang.Throwable -> L84
                    if (r1 == 0) goto L7a
                    java.lang.Integer r0 = r7.A03     // Catch: java.lang.Throwable -> L84
                    if (r1 == r0) goto L87
                L2f:
                    r3.A01 = r2     // Catch: java.lang.Throwable -> L84
                    int r0 = r7.A02     // Catch: java.lang.Throwable -> L84
                    r3.A02 = r0     // Catch: java.lang.Throwable -> L84
                    float r0 = r7.A00     // Catch: java.lang.Throwable -> L84
                    r3.A00 = r0     // Catch: java.lang.Throwable -> L84
                    java.lang.Integer r1 = r7.A03     // Catch: java.lang.Throwable -> L84
                    X.C14360o3.A0B(r1, r5)     // Catch: java.lang.Throwable -> L84
                    r3.A03 = r1     // Catch: java.lang.Throwable -> L84
                    java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L84
                    if (r1 != r0) goto L87
                    X.8NF r0 = r4.A00     // Catch: java.lang.Throwable -> L84
                    if (r0 == 0) goto L4f
                    X.84t r1 = r0.A03     // Catch: java.lang.Throwable -> L84
                    X.8eM r0 = X.EnumC191648eM.A0C     // Catch: java.lang.Throwable -> L84
                    r1.A01(r0)     // Catch: java.lang.Throwable -> L84
                L4f:
                    X.8MB r2 = r4.A03     // Catch: java.lang.Throwable -> L84
                    java.util.List r1 = r4.A05     // Catch: java.lang.Throwable -> L84
                    int r0 = r3.A01     // Catch: java.lang.Throwable -> L84
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L84
                    int r0 = r1.indexOf(r0)     // Catch: java.lang.Throwable -> L84
                    r2.A00(r0)     // Catch: java.lang.Throwable -> L84
                    int r2 = r4.AuP()     // Catch: java.lang.Throwable -> L84
                    java.util.ArrayList r0 = r4.A04     // Catch: java.lang.Throwable -> L84
                    java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L84
                L6a:
                    boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L84
                    if (r0 == 0) goto L87
                    java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L84
                    X.8Le r0 = (X.InterfaceC185628Le) r0     // Catch: java.lang.Throwable -> L84
                    r0.DrT(r2)     // Catch: java.lang.Throwable -> L84
                    goto L6a
                L7a:
                    java.lang.String r0 = "swipeMode"
                    X.C14360o3.A0F(r0)     // Catch: java.lang.Throwable -> L84
                    X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L84
                    throw r0     // Catch: java.lang.Throwable -> L84
                L84:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                L87:
                    monitor-exit(r3)
                    X.8MA r0 = r4.A02
                    r0.EGV()
                L8d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8NH.onChanged(java.lang.Object):void");
            }
        });
        C89T c89t = (C89T) new C52942bb(new C89S(userSession, fragmentActivity), fragmentActivity).A00(C89T.class);
        this.A0a = c89t;
        if (C6PX.A01(userSession)) {
            c89t.A02.A06(fragment.requireActivity(), new InterfaceC58362lv() { // from class: X.8NI
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    C185948Mo c185948Mo = C185948Mo.this;
                    if (obj instanceof KE6) {
                        C1819485e c1819485e2 = c185948Mo.A0Z;
                        if (c1819485e2.A00().AXl() != null) {
                            c1819485e2.A00().EJf();
                            return;
                        }
                        return;
                    }
                    if (!(obj instanceof C215119fn)) {
                        return;
                    }
                    C1819485e c1819485e3 = c185948Mo.A0Z;
                    if (c1819485e3.A00().AXl() == null) {
                        return;
                    }
                    c1819485e3.A00().ETb((CameraAREffect) c185948Mo.A0a.A06.getValue());
                }
            });
        }
        this.A0n = new C8NJ();
        ClipsCreationViewModel clipsCreationViewModel2 = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        this.A0u = clipsCreationViewModel2;
        C8NL c8nl = (C8NL) new C52942bb(new C8NK(fragmentActivity, userSession, clipsCreationViewModel2), fragmentActivity).A00(C8NL.class);
        this.A0v = c8nl;
        this.A1G = (ClipsCreationDraftViewModel) new C52942bb(new C183538Cb(fragmentActivity, userSession, null), fragment).A00(ClipsCreationDraftViewModel.class);
        c8nl.A01.A06(fragment, new C151846sU(new InterfaceC58362lv() { // from class: X.8NM
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0047. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC58362lv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r32) {
                /*
                    Method dump skipped, instructions count: 358
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8NM.onChanged(java.lang.Object):void");
            }
        }));
        c8mt.A07 = new InterfaceC16820sZ() { // from class: X.8NN
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C185948Mo c185948Mo = C185948Mo.this;
                C8MT c8mt2 = c8mt;
                C8NL c8nl2 = c185948Mo.A0v;
                if (c8nl2 != null) {
                    C8NJ c8nj = c185948Mo.A0n;
                    C81N c81n = c185948Mo.A04;
                    ViewGroup viewGroup4 = c185948Mo.A0X;
                    C87H c87h = c185948Mo.A0y;
                    C14360o3.A0B(c8mt2, 1);
                    C14360o3.A0B(c81n, 2);
                    C14360o3.A0B(viewGroup4, 3);
                    C14360o3.A0B(c87h, 4);
                    C206169Az A002 = C9O8.A00(c8mt2.A05, 1.0f);
                    if (!c8nl2.A0G() && AMG.A04((C84B) c8nl2.A04.A0F.A02())) {
                        C8NL.A03(A002, null, c8nl2, null, true);
                        C206169Az c206169Az = new C206169Az(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
                        Context context = viewGroup4.getContext();
                        C14360o3.A07(context);
                        C9TP c9tp = c8nj.A02;
                        if (c9tp == null) {
                            c9tp = new C9TP(context);
                            c8nj.A02 = c9tp;
                        }
                        c9tp.setShowGuide(false);
                        viewGroup4.removeView(c9tp);
                        viewGroup4.addView(c9tp);
                        c81n.A09(new C43752JWo(4, c8nj, c81n, viewGroup4, c206169Az, c8mt2, c9tp));
                    }
                    if (!c8nl2.A0G()) {
                        Iterator it = c185948Mo.A0f.A1v.iterator();
                        while (it.hasNext()) {
                            ((C8F1) it.next()).DCs(true);
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            }
        };
        this.A0t = AnonymousClass849.A00(activity.getApplication(), userSession).A00(clipsCreationViewModel.A0S);
        C8DL c8dl = (C8DL) new C52942bb(fragmentActivity).A00(C8DL.class);
        this.A0r = c8dl;
        c8dl.A00.A06(fragment, new InterfaceC58362lv() { // from class: X.8NO
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C9KJ c9kj;
                C185948Mo c185948Mo = C185948Mo.this;
                if (obj != C8DM.A03 && obj != C8DM.A02) {
                    c185948Mo.A0o.A06 = c185948Mo.A0r;
                    return;
                }
                if (c185948Mo.A06 == null) {
                    return;
                }
                c185948Mo.A0o.A0B(c185948Mo.A0r);
                if (c185948Mo.A09 != EnumC189218Zt.A04 || (c9kj = c185948Mo.A0B) == null) {
                    return;
                }
                c9kj.A02();
            }
        });
        C1815483h c1815483h = anonymousClass840.A02.A01;
        if (c1815483h.A04 != null && !AbstractC25351Lp.A03(userSession)) {
            c1815483h.A04.A06.A06(fragment, new InterfaceC58362lv() { // from class: X.8hJ
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    C185948Mo c185948Mo = C185948Mo.this;
                    C8MT c8mt2 = c185948Mo.A0o;
                    float floatValue = ((Number) obj).floatValue();
                    C199388rf c199388rf = c8mt2.A04;
                    TransformMatrixConfig transformMatrixConfig = c8mt2.A05;
                    if (transformMatrixConfig != null && c199388rf != null) {
                        c199388rf.A00 = true;
                        TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                        transformMatrixParams.A01 = floatValue;
                        transformMatrixParams.A00 = 0.0f;
                        transformMatrixConfig.A04(0.0f);
                        transformMatrixConfig.A05(0.0f);
                        C8MT.A03(c8mt2);
                        boolean z = false;
                        if (floatValue == 1.0f && c8mt2.A0E.A02.A01.A04 != null) {
                            if (!C18U.A06(C06090Tz.A05, c8mt2.A0C, 36322924969339629L)) {
                                z = true;
                            }
                        }
                        c199388rf.A00 = !z;
                    }
                    C9KJ c9kj = c185948Mo.A0B;
                    if (c9kj != null) {
                        c9kj.A02();
                    }
                }
            });
        }
        c1810981l.A0H(new AnonymousClass822() { // from class: X.816
            @Override // X.AnonymousClass822
            public final void onChanged(Object obj) {
                C185948Mo c185948Mo = C185948Mo.this;
                C55U c55u = (C55U) obj;
                c185948Mo.A05 = c55u;
                TransformMatrixConfig.A0M = c55u instanceof C81V;
                c185948Mo.A04 = C185948Mo.A01(c185948Mo);
            }
        });
        this.A1I = anonymousClass825;
        this.A0g = c8mv;
        this.A10 = c8mx;
        if (c8mx != null) {
            c8mx.A02.A00.add(new InterfaceC185838Md() { // from class: X.8NP
                @Override // X.InterfaceC185838Md
                public final void Duo() {
                    C8DL c8dl2 = C185948Mo.this.A0r;
                    c8dl2.A02.Egh(C8DM.A0A);
                }

                @Override // X.InterfaceC185838Md
                public final void Dup(int i) {
                    C185948Mo.this.A0r.A03.Egh(Integer.valueOf(i));
                }

                @Override // X.InterfaceC185838Md
                public final void Duq() {
                    C8DL c8dl2 = C185948Mo.this.A0r;
                    c8dl2.A02.Egh(C8DM.A0C);
                }
            });
        }
        this.A0x = new C8NQ(new C57012jc((ViewStub) viewGroup.findViewById(R.id.video_screenshot_view_stub)), this.A04, anonymousClass840);
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        final int width = interfaceC1812882f.getWidth();
        final int height = interfaceC1812882f.getHeight();
        this.A17 = new C8NS(c89f, c8lj, width, height) { // from class: X.8NR
            public final int A00;
            public final int A01;
            public final C89F A02;
            public final C8LJ A03;

            @Override // X.C8NS
            public final void AWx(C26076Bg5 c26076Bg5) {
                Bitmap bitmap = (Bitmap) c26076Bg5.A01;
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth() * 1.0f, bitmap.getHeight() * 1.0f);
                Canvas canvas = new Canvas(bitmap);
                Bitmap A01 = ((C8LK) this.A03.A00.A00()).A01(bitmap, rectF, this.A02.A09, bitmap.getWidth() / this.A01, bitmap.getHeight() / this.A00, (int) TimeUnit.MICROSECONDS.toMillis(c26076Bg5.A00), true, false, true, true);
                if (A01 != null) {
                    canvas.drawBitmap(A01, 0.0f, 0.0f, (Paint) null);
                }
            }

            {
                this.A02 = c89f;
                this.A03 = c8lj;
                this.A01 = width;
                this.A00 = height;
            }
        };
        if (c81j.A3m) {
            this.A0L = true;
        }
        this.A1D = cachingVideoSaver;
    }
}
