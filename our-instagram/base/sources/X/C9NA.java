package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.GradientBackgroundVideoFilter;
import com.instagram.filterkit.filter.IdentityFilter;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filter.resize.ResizeFilter;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: X.9NA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NA {
    public static final C9N2 A0X = C9N1.A00();
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public ResizeFilter A04;
    public XOI A05;
    public XOI A06;
    public InterfaceC197718oi A07;
    public boolean A08;
    public float[] A09;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final YPq A0G;
    public final YRL A0H;
    public final ClipInfo A0I;
    public final XOT A0J;
    public final AAY A0K;
    public final InterfaceC09390do A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final int A0S;
    public final UserSession A0T;
    public final C9NC A0U;
    public final C22958AAc A0V;
    public final InterfaceC09390do A0W;
    public final float[] A0Q = AbstractC199498rs.A00();
    public final float[] A0R = AbstractC199498rs.A00();
    public final InterfaceC1122755a A0F = new InterfaceC1122755a() { // from class: X.9NB
        @Override // X.InterfaceC1122755a
        public final float[] C6v() {
            return C9NA.this.A0R;
        }
    };
    public int A0A = -12345;

    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9NA(final android.content.Context r32, android.opengl.EGLContext r33, final com.instagram.common.session.UserSession r34, X.XOT r35, X.C9N6 r36, int r37, int r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9NA.<init>(android.content.Context, android.opengl.EGLContext, com.instagram.common.session.UserSession, X.XOT, X.9N6, int, int, boolean):void");
    }

    private void A00(Bitmap bitmap, InterfaceC1122755a interfaceC1122755a, InterfaceC197718oi interfaceC197718oi, YRL yrl, float[] fArr, float[] fArr2, boolean z) {
        C9N2 c9n2;
        InterfaceC09390do interfaceC09390do = this.A0W;
        interfaceC09390do.getClass();
        GradientBackgroundVideoFilter gradientBackgroundVideoFilter = (GradientBackgroundVideoFilter) interfaceC09390do.getValue();
        gradientBackgroundVideoFilter.A02(interfaceC1122755a);
        if (fArr != null && fArr2 != null) {
            gradientBackgroundVideoFilter.A05(fArr, fArr2);
        }
        ClipInfo clipInfo = this.A0I;
        if (clipInfo.A0K) {
            float f = this.A0C / this.A0B;
            float f2 = this.A0E / this.A0D;
            if (f < f2) {
                gradientBackgroundVideoFilter.A06(f, f2, z);
            }
        }
        if (clipInfo.A0N) {
            float f3 = this.A0C / this.A0B;
            if (f3 < 1.0f) {
                gradientBackgroundVideoFilter.A06(f3, 1.0f, z);
            }
        }
        if (bitmap != null) {
            C0f5 AEp = C18950wb.A01.AEp(AbstractC111324zv.A00(1636), 817895413);
            AEp.ABW(AbstractC111324zv.A00(3275), "TranscodeTextureRenderer");
            AEp.report();
            gradientBackgroundVideoFilter.A05 = bitmap;
        }
        if (this.A0M) {
            c9n2 = A0X;
        } else {
            C9NC c9nc = this.A0U;
            c9nc.getClass();
            c9n2 = c9nc.A01;
        }
        gradientBackgroundVideoFilter.A0E = c9n2;
        GLES20.glBindFramebuffer(36160, yrl.B8d());
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        gradientBackgroundVideoFilter.EGY(this.A0G, interfaceC197718oi, yrl);
    }

    private void A02(YRL yrl, long j) {
        C199758sR c199758sR;
        InterfaceC197718oi C6s;
        C199758sR c199758sR2;
        C5NO c5no;
        int i;
        BDV A00;
        C22958AAc c22958AAc = this.A0V;
        if (c22958AAc != null) {
            try {
                int round = Math.round((float) (j / 1000));
                int i2 = this.A0S;
                c22958AAc.A01 = round;
                c22958AAc.A00 = i2;
                YPq yPq = this.A0G;
                C14360o3.A0B(yPq, 0);
                C14360o3.A0B(yrl, 1);
                List<C5NJ> list = c22958AAc.A0F;
                C199758sR c199758sR3 = c22958AAc.A03;
                if (c199758sR3 == null || (c199758sR = c22958AAc.A02) == null) {
                    int width = yrl.getWidth();
                    int Bmd = yrl.Bmd();
                    c199758sR3 = new C199758sR(width, Bmd);
                    c22958AAc.A03 = c199758sR3;
                    c199758sR = new C199758sR(yrl.Bmj(), Bmd);
                    c22958AAc.A02 = c199758sR;
                }
                if (!c22958AAc.A06) {
                    c22958AAc.A06 = true;
                    Context context = c22958AAc.A07;
                    UserSession userSession = c22958AAc.A09;
                    YPq yPq2 = c22958AAc.A0B;
                    C22979ABd c22979ABd = c22958AAc.A0D;
                    c22958AAc.A04 = new ABQ(context, userSession, yPq2, c22979ABd);
                    for (C5NJ c5nj : list) {
                        TreeSet treeSet = new TreeSet(c5nj.A07);
                        c22958AAc.A0G.put(c5nj, treeSet);
                        C5NP c5np = c5nj.A03;
                        C14360o3.A07(c5np);
                        int ordinal = c5np.ordinal();
                        if (ordinal != 0 && ordinal != 1 && ordinal != 3 && ordinal != 2) {
                            if (ordinal == 4) {
                                C23015ACp c23015ACp = new C23015ACp(context, c199758sR3, c199758sR, userSession, c22979ABd, c22958AAc.A0E);
                                c22958AAc.A05 = c23015ACp;
                                Object floor = treeSet.floor(new Object());
                                if (floor != null) {
                                    c23015ACp.A02(c5nj, (C5NO) floor);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unhandled image region type ");
                                sb.append(c5np);
                                throw new IllegalStateException(sb.toString());
                            }
                        } else {
                            ABQ abq = c22958AAc.A04;
                            if (abq != null && (A00 = abq.A00(c5np)) != null) {
                                A00.A8j(c5nj);
                            }
                        }
                    }
                }
                if (c22958AAc.A04 != null) {
                    for (C5NJ c5nj2 : list) {
                        C22880A7a c22880A7a = c5nj2.A02;
                        if (c22880A7a == null || (c22880A7a.A01 <= (i = c22958AAc.A01) && i <= c22880A7a.A00)) {
                            C5NP c5np2 = c5nj2.A03;
                            C14360o3.A07(c5np2);
                            int ordinal2 = c5np2.ordinal();
                            if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 3 && ordinal2 != 2) {
                                if (ordinal2 == 4) {
                                    C23015ACp c23015ACp2 = c22958AAc.A05;
                                    if (c23015ACp2 != null) {
                                        c23015ACp2.A01(c5nj2, c22958AAc.A01);
                                    }
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Unhandled image region type ");
                                    sb2.append(c5np2);
                                    throw new IllegalStateException(sb2.toString());
                                }
                            } else {
                                ABQ abq2 = c22958AAc.A04;
                                if (abq2 != null) {
                                    C5NP c5np3 = c5nj2.A03;
                                    C14360o3.A07(c5np3);
                                    BDV A002 = abq2.A00(c5np3);
                                    if (A002 != null && (C6s = A002.C6s(c5nj2, c22958AAc.A01, c22958AAc.A00)) != null) {
                                        C199758sR c199758sR4 = c22958AAc.A03;
                                        if (c199758sR4 != null && (c199758sR2 = c22958AAc.A02) != null) {
                                            C5NO c5no2 = c22958AAc.A0C;
                                            c5no2.A0C = c22958AAc.A01;
                                            NavigableSet navigableSet = (NavigableSet) c22958AAc.A0G.get(c5nj2);
                                            if (navigableSet != null && (c5no = (C5NO) navigableSet.floor(c5no2)) != null) {
                                                Matrix4 matrix4 = c22958AAc.A08;
                                                AbstractC23049AEf.A00(c199758sR4, c199758sR2, matrix4, c5no);
                                                IdentityFilter identityFilter = c22958AAc.A0A;
                                                identityFilter.A03 = true;
                                                identityFilter.A04.A04(matrix4);
                                                boolean glIsEnabled = GLES20.glIsEnabled(3042);
                                                if (!glIsEnabled) {
                                                    GLES20.glEnable(3042);
                                                }
                                                GLES20.glBlendFunc(1, 771);
                                                identityFilter.EGY(yPq, C6s, yrl);
                                                if (!glIsEnabled) {
                                                    GLES20.glDisable(3042);
                                                }
                                            }
                                            C5NP c5np4 = c5nj2.A03;
                                            C14360o3.A07(c5np4);
                                            if (c5np4 == C5NP.A08 || c5np4 == C5NP.A06 || c5np4 == C5NP.A05) {
                                                C6s.cleanup();
                                            }
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            } catch (C72451Xdv e) {
                C0K8.A0F("TranscodeTextureRenderer", "Region tracking filter failed", e);
                C0w9.A07("TranscodeTextureRenderer render exception", e);
            }
        }
    }

    public final SurfaceTexture A03(UserSession userSession, BaseFilter baseFilter, VideoFilter videoFilter) {
        SurfaceTexture surfaceTexture;
        C197768on c197768on;
        if (this.A03 != null) {
            C0w9.A03("TranscodeTextureRenderer", "mSurfaceTexture has already been initialized");
        }
        AAY aay = this.A0K;
        if (aay != null) {
            try {
                c197768on = aay.A01;
            } catch (InterruptedException e) {
                C0K8.A0F("IG-CameraCoreRenderer", "SharedTextureVideoInput latch was interrupted", e);
                C0w9.A07("SharedTextureVideoInput latch exception", e);
                surfaceTexture = null;
            }
            if (c197768on != null) {
                surfaceTexture = c197768on.A01(false);
                this.A03 = surfaceTexture;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            AnonymousClass811 anonymousClass811 = new AnonymousClass811("TranscodeTextureRenderer");
            anonymousClass811.A03 = 36197;
            anonymousClass811.A00 = 6408;
            int i = new AnonymousClass810(anonymousClass811).A00;
            this.A0A = i;
            this.A03 = new SurfaceTexture(i);
            this.A07 = AbstractC197698og.A01(null, this.A0A, this.A0C, this.A0B);
        }
        if (this.A08) {
            this.A04 = new ResizeFilter(userSession, true);
            this.A05 = new XOI(this.A0E, this.A0D);
        }
        if (baseFilter != null) {
            this.A06 = new XOI(this.A0E, this.A0D);
        }
        videoFilter.A01();
        SurfaceTexture surfaceTexture2 = this.A03;
        surfaceTexture2.getClass();
        return surfaceTexture2;
    }

    public final void A04() {
        C23015ACp c23015ACp;
        AAY aay = this.A0K;
        if (aay == null) {
            SurfaceTexture surfaceTexture = this.A03;
            surfaceTexture.getClass();
            surfaceTexture.release();
        } else {
            synchronized (aay.A04) {
            }
            C200558ty c200558ty = aay.A05;
            c200558ty.A04 = null;
            InterfaceC199698sL interfaceC199698sL = c200558ty.A03;
            if (interfaceC199698sL != null) {
                interfaceC199698sL.destroy();
                synchronized (c200558ty) {
                    c200558ty.A03 = null;
                }
            }
        }
        C22958AAc c22958AAc = this.A0V;
        if (c22958AAc != null) {
            c22958AAc.A0A.AHR(this.A0G);
            if (c22958AAc.A06) {
                for (C5NP c5np : C5NP.A03) {
                    int ordinal = c5np.ordinal();
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                        if (ordinal == 4 && (c23015ACp = c22958AAc.A05) != null) {
                            c23015ACp.A00();
                        }
                    } else {
                        ABQ abq = c22958AAc.A04;
                        if (abq != null) {
                            abq.A00(c5np).cleanup();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                c22958AAc.A0D.A00.clear();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(1:5)|134|7|(2:9|(8:11|44|16|17|53|35|36|(1:38)(10:63|40|41|(1:45)|47|(1:49)(1:60)|50|(2:52|(1:54))(2:(1:58)|59)|55|56))(2:73|74))(12:75|(1:77)|78|(2:80|(2:90|(1:101)(5:94|(1:96)|97|(1:99)|100))(4:84|(1:86)|87|(1:89)))|102|(3:112|(5:114|(1:117)|118|(1:122)|123)|124)|125|(1:127)|128|(1:130)|133|132)|39|40|41|(2:43|45)|47|(0)(0)|50|(0)(0)|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ac, code lost:
    
        if ((r0.intValue() % 2) == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0267, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0268, code lost:
    
        X.C0K8.A0F("TranscodeTextureRenderer", "Video resize failed", r2);
        X.C0w9.A07("TranscodeTextureRenderer render exception", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r22.A0I.A0N != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.instagram.filterkit.filter.BaseFilter r23, com.instagram.filterkit.filter.VideoFilter r24, long r25) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9NA.A05(com.instagram.filterkit.filter.BaseFilter, com.instagram.filterkit.filter.VideoFilter, long):void");
    }

    private void A01(BaseFilter baseFilter, XOI xoi, YRL yrl) {
        try {
            GLES20.glBindFramebuffer(36160, this.A0H.B8d());
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            baseFilter.EGY(this.A0G, xoi, yrl);
            baseFilter.toString();
        } catch (C72451Xdv e) {
            C0K8.A0F("TranscodeTextureRenderer", "Secondary filter failed", e);
            C0w9.A07("TranscodeTextureRenderer render exception", e);
        }
    }
}
