package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC184988In implements InterfaceC184998Io, InterfaceC185008Ip, C8HL, C8BD {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public TextureView A03;
    public C174757qB A04;
    public C8J0 A06;
    public InterfaceC143326dX A07;
    public InterfaceC1810081c A08;
    public boolean A0A;
    public ViewStub A0B;
    public final Context A0D;
    public final FrameLayout A0E;
    public final UserSession A0F;
    public final C1810981l A0G;
    public final C8HV A0H;
    public final C8C0 A0I;
    public final boolean A0O;
    public final C1820485o A0P;
    public final C1813982r A0Q;
    public final boolean A0R;
    public final View A0S;
    public volatile EnumC1810381f A0U;
    public C177247uK A05 = null;
    public final AtomicInteger A0M = new AtomicInteger(0);
    public volatile EnumC185018Iq A0T = EnumC185018Iq.A08;
    public EnumC185018Iq A0C = this.A0T;
    public FilmstripTimelineView A09 = null;
    public final Map A0L = new HashMap();
    public final InterfaceC09390do A0N = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.8Iw
        @Override // X.InterfaceC16820sZ
        public final /* bridge */ /* synthetic */ Object invoke() {
            AbstractC184988In abstractC184988In = AbstractC184988In.this;
            Context context = abstractC184988In.A0D;
            C218279kz c218279kz = new C218279kz(context, abstractC184988In.A06, abstractC184988In, abstractC184988In.A0I, true);
            ArrayList A01 = AbstractC23046AEc.A01(context, abstractC184988In.A0F);
            boolean isEmpty = A01.isEmpty();
            List list = A01;
            if (isEmpty) {
                List asList = Arrays.asList(EnumC185018Iq.values());
                asList.remove(EnumC185018Iq.A07);
                list = asList;
            }
            c218279kz.A03(list);
            return c218279kz;
        }
    });
    public final InterfaceC1810781j A0J = new InterfaceC1810781j() { // from class: X.8Ix
        @Override // X.InterfaceC1810781j
        public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
            int i;
            EnumC1810181d enumC1810181d = (EnumC1810181d) obj2;
            final AbstractC184988In abstractC184988In = AbstractC184988In.this;
            C1810981l c1810981l = abstractC184988In.A0G;
            if (c1810981l.A0W(C81W.A0B)) {
                if (obj == EnumC1810181d.A0z) {
                    if (abstractC184988In.A0O) {
                        ((C8J9) abstractC184988In.A0N.getValue()).CMH(true);
                    }
                    FilmstripTimelineView filmstripTimelineView = abstractC184988In.A09;
                    if (filmstripTimelineView != null) {
                        AbstractC125325le.A05(new View[]{filmstripTimelineView}, false);
                    }
                    InterfaceC143326dX interfaceC143326dX = abstractC184988In.A07;
                    if (interfaceC143326dX != null) {
                        interfaceC143326dX.D5W(abstractC184988In);
                    }
                    C8J0 c8j0 = abstractC184988In.A06;
                    c8j0.A00 = c8j0.A03.A02(518927814, c8j0.A00);
                }
                int ordinal = enumC1810181d.ordinal();
                if (ordinal != 7) {
                    if (ordinal == 11 && abstractC184988In.A0O) {
                        ((C8J9) abstractC184988In.A0N.getValue()).CMH(true);
                        return;
                    }
                    return;
                }
                C8J0 c8j02 = abstractC184988In.A06;
                String str = ((C55U) c1810981l.A08.A00).A02;
                C24Q c24q = c8j02.A03;
                long A03 = c24q.A03(518927814, 600000L);
                c8j02.A00 = A03;
                c24q.A09(A03, "camera_destination", str);
                c24q.A09(c8j02.A00, "camera_tool_cf", "BOOMERANG");
                if (abstractC184988In.A0O) {
                    abstractC184988In.A06(abstractC184988In.A0T);
                    C218279kz c218279kz = (C218279kz) abstractC184988In.A0N.getValue();
                    c218279kz.A02(abstractC184988In.A0T);
                    ((C8J9) c218279kz).A01.A0A(c218279kz, true);
                }
                final FilmstripTimelineView A04 = abstractC184988In.A04();
                abstractC184988In.A09 = A04;
                if (A04 != null) {
                    A04.setShowSeekbar(false);
                    A04.A00 = abstractC184988In;
                    final C22952A9w c22952A9w = (C22952A9w) abstractC184988In.A0L.get(abstractC184988In.A0T);
                    if (c22952A9w != null) {
                        i = c22952A9w.A02;
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        i = 40;
                    }
                    A04.setTrimmerMinimumRange(Math.max(0.0f, Math.min(20.0f / i, 1.0f)));
                    AbstractC125325le.A04(null, new View[]{A04}, false);
                    AbstractC13880nE.A0u(A04, new Callable() { // from class: X.B1G
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C22952A9w c22952A9w2;
                            AbstractC184988In abstractC184988In2 = abstractC184988In;
                            C22952A9w c22952A9w3 = c22952A9w;
                            FilmstripTimelineView filmstripTimelineView2 = A04;
                            Map map = abstractC184988In2.A0L;
                            boolean containsKey = map.containsKey(abstractC184988In2.A0T);
                            Boolean A0b = AbstractC166997dE.A0b();
                            if (containsKey && map.get(abstractC184988In2.A0T) != null && (c22952A9w2 = (C22952A9w) map.get(abstractC184988In2.A0T)) != null && c22952A9w3 != null) {
                                filmstripTimelineView2.A01(c22952A9w3.A00, c22952A9w2.A01);
                            }
                            return A0b;
                        }
                    });
                    if (A04.getParent() instanceof View) {
                        AbstractC13880nE.A0n(A04, (View) A04.getParent());
                    }
                }
                InterfaceC143326dX interfaceC143326dX2 = abstractC184988In.A07;
                if (interfaceC143326dX2 == null) {
                    return;
                }
                interfaceC143326dX2.DWb(abstractC184988In);
            }
        }
    };
    public final InterfaceC1810781j A0K = new InterfaceC1810781j() { // from class: X.8Iy
        @Override // X.InterfaceC1810781j
        public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
            FilmstripTimelineView filmstripTimelineView;
            EnumC1810381f enumC1810381f = (EnumC1810381f) obj2;
            final AbstractC184988In abstractC184988In = AbstractC184988In.this;
            if (abstractC184988In.A0G.A0W(C81W.A0B)) {
                abstractC184988In.A0U = enumC1810381f;
                EnumC1810381f enumC1810381f2 = EnumC1810381f.A02;
                if (enumC1810381f == enumC1810381f2 && (filmstripTimelineView = abstractC184988In.A09) != null) {
                    filmstripTimelineView.A01(0.0f, 1.0f);
                }
                if (enumC1810381f == EnumC1810381f.A03) {
                    abstractC184988In.A0T = EnumC185018Iq.A08;
                    TextureView textureView = abstractC184988In.A03;
                    if (textureView != null) {
                        abstractC184988In.A0E.removeView(textureView);
                        abstractC184988In.A03 = null;
                    }
                    abstractC184988In.A01 = 0;
                    abstractC184988In.A00 = 0;
                    abstractC184988In.A0E.removeAllViews();
                    abstractC184988In.A03 = null;
                    Map map = abstractC184988In.A0L;
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() != null) {
                            C22952A9w c22952A9w = (C22952A9w) entry.getValue();
                            C22952A9w.A00(c22952A9w.A04);
                            C22952A9w.A00(c22952A9w.A05);
                        }
                    }
                    C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9iS
                        {
                            super(78, 4, false, false);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            File file = AbstractC916948n.A01;
                            if (file == null) {
                                file = AbstractC23881Ey.A00().AXd(null, 2066873147);
                                AbstractC916948n.A01 = file;
                            }
                            File A11 = AbstractC166987dD.A11(file.getAbsolutePath());
                            if (A11.isDirectory() && A11.listFiles() != null) {
                                File[] listFiles = A11.listFiles();
                                for (File file2 : listFiles) {
                                    file2.delete();
                                }
                            }
                        }
                    });
                    map.clear();
                }
                if (obj == enumC1810381f2) {
                    abstractC184988In.A07();
                    InterfaceC1810081c interfaceC1810081c = abstractC184988In.A08;
                    InterfaceC1810781j interfaceC1810781j = abstractC184988In.A0K;
                    C1809981b c1809981b = (C1809981b) interfaceC1810081c;
                    C14360o3.A0B(interfaceC1810781j, 0);
                    c1809981b.A02.A02.remove(interfaceC1810781j);
                    InterfaceC1810781j interfaceC1810781j2 = abstractC184988In.A0J;
                    C14360o3.A0B(interfaceC1810781j2, 0);
                    c1809981b.A01.A02.remove(interfaceC1810781j2);
                    if (abstractC184988In.A0O) {
                        ((C8J9) abstractC184988In.A0N.getValue()).CMH(true);
                    }
                }
            }
        }
    };

    public void A07() {
        InterfaceC178717wj interfaceC178717wj;
        C184978Im c184978Im = (C184978Im) this;
        C177247uK c177247uK = ((AbstractC184988In) c184978Im).A05;
        if (c177247uK != null && (interfaceC178717wj = ((C179697yJ) C177247uK.A00(c177247uK)).A00) != null) {
            interfaceC178717wj.AP1();
        }
        C184978Im.A02(c184978Im);
    }

    public void A08() {
        C23128AMg c23128AMg;
        synchronized (this) {
            C177247uK c177247uK = this.A05;
            c177247uK.getClass();
            InterfaceC178717wj interfaceC178717wj = ((C179697yJ) C177247uK.A00(c177247uK)).A00;
            if (interfaceC178717wj != null && (c23128AMg = ((C178707wi) interfaceC178717wj).A02) != null) {
                c23128AMg.A0Y = false;
                c23128AMg.A0I = true;
            }
        }
    }

    public void A09(float f, float f2) {
        final C184978Im c184978Im = (C184978Im) this;
        if (c184978Im.A0M.compareAndSet(3, 4)) {
            C176567tE.A00(new Runnable() { // from class: X.Aqj
                @Override // java.lang.Runnable
                public final void run() {
                    C184978Im c184978Im2 = C184978Im.this;
                    c184978Im2.A02 = System.currentTimeMillis();
                    C0fJ.A00((Dialog) c184978Im2.A09.getValue());
                }
            });
            Integer num = c184978Im.A05;
            num.getClass();
            String absolutePath = AbstractC166987dD.A11(AbstractC916948n.A0C(AbstractC916948n.A0D(null, num.intValue(), false))).getAbsolutePath();
            C177247uK c177247uK = ((AbstractC184988In) c184978Im).A05;
            c177247uK.getClass();
            EnumC185018Iq enumC185018Iq = c184978Im.A0T;
            C8J3 c8j3 = c184978Im.A06;
            C14360o3.A0B(absolutePath, 0);
            C14360o3.A0B(enumC185018Iq, 1);
            C14360o3.A0B(c8j3, 4);
            C177247uK.A00(c177247uK).FAN(enumC185018Iq, c8j3, absolutePath, f, f2);
        }
    }

    public void A0B(EnumC185018Iq enumC185018Iq) {
        Pair pair;
        C184978Im c184978Im = (C184978Im) this;
        C22952A9w c22952A9w = (C22952A9w) c184978Im.A0L.get(c184978Im.A0T);
        if (c22952A9w != null) {
            pair = new Pair(Float.valueOf(c22952A9w.A00), Float.valueOf(c22952A9w.A01));
        } else {
            pair = null;
        }
        c184978Im.A0T = enumC185018Iq;
        C184978Im.A00(pair, c184978Im);
    }

    public void A0D(File file) {
        boolean z;
        int height;
        int width;
        C184978Im c184978Im = (C184978Im) this;
        InterfaceC1810081c interfaceC1810081c = ((AbstractC184988In) c184978Im).A08;
        interfaceC1810081c.A85(c184978Im.A0K);
        interfaceC1810081c.A82(c184978Im.A0J);
        c184978Im.A04 = file;
        C174757qB c174757qB = ((AbstractC184988In) c184978Im).A04;
        c174757qB.getClass();
        Integer valueOf = Integer.valueOf(c174757qB.A07());
        c184978Im.A05 = valueOf;
        if (valueOf == null) {
            AbstractC12120kG.A03("GLBoomerangCaptureController", "startRecording() has null mCameraFacing");
        }
        Rect A0A = ((AbstractC184988In) c184978Im).A04.A0A();
        C174757qB c174757qB2 = ((AbstractC184988In) c184978Im).A04;
        InterfaceC179847yZ A02 = C174757qB.A02(c174757qB2);
        int A07 = c174757qB2.A07();
        C175007qa c175007qa = ((BasicCameraOutputController) A02).A04;
        AbstractC05810Sj.A00(c175007qa);
        int AFE = c175007qa.A0N.AFE(A07, 0);
        if (AFE != 90 && AFE != 270) {
            z = true;
            height = A0A.width();
        } else {
            z = false;
            height = A0A.height();
        }
        c184978Im.A01 = height;
        if (z) {
            width = A0A.height();
        } else {
            width = A0A.width();
        }
        c184978Im.A00 = width;
        int i = c184978Im.A01;
        if (i != 0 && width != 0) {
            ((AbstractC184988In) c184978Im).A04.A0M(new C196858nF(c184978Im), true);
        } else {
            AbstractC12120kG.A03("GLBoomerangCaptureController", AnonymousClass001.A02(i, width, "recording: w or h == 0, w= ", " h="));
            c184978Im.A0E(false);
        }
    }

    public void A0E(boolean z) {
        C23128AMg c23128AMg;
        final C184978Im c184978Im = (C184978Im) this;
        synchronized (c184978Im) {
            boolean z2 = true;
            if (c184978Im.A0M.compareAndSet(1, 2)) {
                if (z) {
                    c184978Im.A02 = System.currentTimeMillis();
                }
                C177247uK c177247uK = ((AbstractC184988In) c184978Im).A05;
                c177247uK.getClass();
                if (z) {
                    z2 = false;
                }
                InterfaceC178717wj interfaceC178717wj = ((C179697yJ) C177247uK.A00(c177247uK)).A00;
                if (interfaceC178717wj != null && (c23128AMg = ((C178707wi) interfaceC178717wj).A02) != null) {
                    c23128AMg.A0Y = z2;
                    c23128AMg.A0I = true;
                }
                c184978Im.A0H.A02(z);
                C174757qB c174757qB = ((AbstractC184988In) c184978Im).A04;
                c174757qB.getClass();
                c174757qB.A0N(new AbstractC184688Hj() { // from class: X.8pI
                }, true);
                if (!z) {
                    C184978Im.A02(c184978Im);
                } else {
                    FilmstripTimelineView A04 = c184978Im.A04();
                    ((AbstractC184988In) c184978Im).A09 = A04;
                    if (A04 != null) {
                        TargetViewSizeProvider targetViewSizeProvider = c184978Im.A03;
                        C14360o3.A0B(targetViewSizeProvider, 0);
                        if (targetViewSizeProvider.CV5()) {
                            AbstractC13880nE.A0q(A04, new RunnableC24617AvD(A04, targetViewSizeProvider));
                        }
                        Resources resources = c184978Im.A0D.getResources();
                        ((AbstractC184988In) c184978Im).A09.A02(c184978Im.A08, resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin), resources.getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void DOn(float f, float f2) {
    }

    @Override // X.InterfaceC184998Io
    public final void Djx(float f) {
    }

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void E2A(float f) {
    }

    public final FilmstripTimelineView A04() {
        View findViewById;
        ViewStub viewStub = this.A0B;
        if (viewStub != null && viewStub.getParent() != null) {
            findViewById = viewStub.inflate();
        } else {
            View view = this.A0S;
            if (view.findViewById(R.id.boomerang_trimmer) != null) {
                findViewById = view.findViewById(R.id.boomerang_trimmer);
            }
            return this.A09;
        }
        this.A09 = (FilmstripTimelineView) findViewById;
        return this.A09;
    }

    public final void A05() {
        C22952A9w c22952A9w = (C22952A9w) this.A0L.get(this.A0T);
        FilmstripTimelineView filmstripTimelineView = this.A09;
        if (filmstripTimelineView != null && c22952A9w != null) {
            filmstripTimelineView.A01(c22952A9w.A00, c22952A9w.A01);
        }
        TextureView textureView = this.A03;
        if (textureView != null) {
            textureView.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.EnumC185018Iq r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0R
            if (r0 == 0) goto L2d
            android.content.Context r1 = r6.A0D
            int r0 = X.AbstractC23046AEc.A00(r7)
            java.lang.String r5 = r1.getString(r0)
            X.85o r4 = r6.A0P
            android.widget.TextView r0 = r4.A05
            if (r0 == 0) goto L1b
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            r0 = r0 ^ 1
            r2 = 750(0x2ee, double:3.705E-321)
            X.C1820485o.A02(r4, r5, r0)
            android.view.View r1 = r4.A0A
            java.lang.Runnable r0 = r4.A0I
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC184988In.A06(X.8Iq):void");
    }

    public void A0A(SurfaceTexture surfaceTexture, float f, int i, int i2) {
        C23128AMg c23128AMg;
        C177247uK c177247uK = this.A05;
        c177247uK.getClass();
        InterfaceC178717wj interfaceC178717wj = ((C179697yJ) C177247uK.A00(c177247uK)).A00;
        if (interfaceC178717wj != null && (c23128AMg = ((C178707wi) interfaceC178717wj).A02) != null) {
            c23128AMg.A0K.post(new RunnableC24857AzI(surfaceTexture, c23128AMg, f, i, i2));
        }
    }

    @Override // X.InterfaceC185008Ip
    public final EnumC185018Iq Aud() {
        return this.A0T;
    }

    @Override // X.C8HL
    public final void D1Z() {
        this.A04 = this.A0Q.A02;
    }

    @Override // X.InterfaceC184998Io
    public final void DOp(float f) {
        TextureView textureView = this.A03;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            A0A(surfaceTexture, f, this.A01, this.A00);
        }
    }

    @Override // X.InterfaceC185008Ip
    public final void DTi(final EnumC185018Iq enumC185018Iq) {
        if (this.A0G.A0W(C81W.A0B)) {
            C174757qB c174757qB = this.A04;
            if (c174757qB != null && c174757qB.CWZ()) {
                c174757qB.A07();
            }
            C22C A01 = AnonymousClass229.A01(this.A0F);
            C2I7.A00(this.A0U, EnumC1810381f.A02);
            A01.A0I();
            AtomicInteger atomicInteger = this.A0M;
            if (atomicInteger.get() == 1) {
                AbstractC12120kG.A03("boomerang mode update", "Tried to update boomerang mode while recording boomerang");
                return;
            }
            if (atomicInteger.get() == 0) {
                A06(enumC185018Iq);
            }
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9il
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(77, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC184988In abstractC184988In = this;
                    C8J0 c8j0 = abstractC184988In.A06;
                    EnumC185018Iq enumC185018Iq2 = enumC185018Iq;
                    String str = enumC185018Iq2.A00;
                    C14360o3.A0B(str, 0);
                    c8j0.A03.A0C(str, c8j0.A00);
                    abstractC184988In.A0B(enumC185018Iq2);
                }
            });
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DhR(float f) {
        TextureView textureView = this.A03;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            A0A(surfaceTexture, f, this.A01, this.A00);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DuJ(boolean z) {
        FilmstripTimelineView filmstripTimelineView;
        if (this.A09 != null) {
            TextureView textureView = this.A03;
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            Map map = this.A0L;
            if (map.containsKey(this.A0T) && (filmstripTimelineView = this.A09) != null) {
                C8RH c8rh = filmstripTimelineView.A0A;
                float leftTrimmerValue = c8rh.getLeftTrimmerValue();
                float rightTrimmerValue = c8rh.getRightTrimmerValue();
                C22952A9w c22952A9w = (C22952A9w) map.get(this.A0T);
                if (c22952A9w != null) {
                    float f = c22952A9w.A00;
                    if (f != leftTrimmerValue || c22952A9w.A01 != rightTrimmerValue) {
                        if (f != leftTrimmerValue) {
                            c22952A9w.A00 = leftTrimmerValue;
                        }
                        if (c22952A9w.A01 != rightTrimmerValue) {
                            c22952A9w.A01 = rightTrimmerValue;
                        }
                        C8J0 c8j0 = this.A06;
                        C14360o3.A0B("boomerang trimmed", 0);
                        c8j0.A03.A0C("boomerang trimmed", c8j0.A00);
                        C8RH c8rh2 = this.A09.A0A;
                        A09(c8rh2.getLeftTrimmerValue(), c8rh2.getRightTrimmerValue());
                        C22952A9w c22952A9w2 = (C22952A9w) map.get(this.A0T);
                        if (c22952A9w2 == null) {
                            return;
                        }
                        c22952A9w2.A03++;
                        return;
                    }
                }
            }
            A05();
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DuL(boolean z) {
        if (this.A03 == null) {
            TextureView textureView = new TextureView(this.A0D);
            this.A03 = textureView;
            this.A0E.addView(textureView);
            this.A03.setSurfaceTextureListener(new AQ0(this));
            this.A03.setVisibility(8);
        }
    }

    @Override // X.C8BD
    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }

    public AbstractC184988In(Context context, View view, UserSession userSession, C1810981l c1810981l, C8HV c8hv, C8C0 c8c0, C1820485o c1820485o, C1813982r c1813982r, InterfaceC1810081c interfaceC1810081c, boolean z) {
        this.A0G = c1810981l;
        this.A0D = context;
        this.A0F = userSession;
        this.A0I = c8c0;
        this.A0H = c8hv;
        this.A0P = c1820485o;
        this.A0Q = c1813982r;
        this.A0R = z;
        this.A06 = AbstractC185088Iz.A00(userSession, null);
        this.A08 = interfaceC1810081c;
        this.A0S = view;
        C14360o3.A0B(context, 0);
        boolean A00 = C6PX.A00(context);
        this.A0O = A00;
        if (A00 && view.findViewById(R.id.boomerang_trimmer_stub) != null) {
            this.A0B = (ViewStub) view.requireViewById(R.id.boomerang_trimmer_stub);
        }
        this.A0E = (FrameLayout) view.requireViewById(R.id.gl_frame_preview_container);
    }

    public void A0C(C177247uK c177247uK) {
        this.A05 = c177247uK;
    }
}
