package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.V5m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67997V5m extends C2AG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ XCX A03;
    public final /* synthetic */ OVl A04;
    public final /* synthetic */ C47Z A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    @Override // X.C11R
    public final int getRunnableId() {
        return 595;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        if (!this.A07) {
            this.A03.D7w();
        }
    }

    public C67997V5m(XCX xcx, OVl oVl, C47Z c47z, String str, int i, int i2, long j, boolean z) {
        this.A07 = z;
        this.A04 = oVl;
        this.A05 = c47z;
        this.A06 = str;
        this.A03 = xcx;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v4, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v3, types: [X.PzK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v4, types: [X.X9T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v1, types: [X.PpU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v3, types: [X.WZX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [X.VK1, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        EnumC189548aZ enumC189548aZ;
        String str2;
        Bitmap A00;
        List list;
        EnumC189548aZ enumC189548aZ2;
        C1125956n A04;
        String str3;
        HashMap A07;
        C69223Vjq c69223Vjq;
        ?? obj;
        OVl oVl;
        if (this.A07) {
            OVl oVl2 = this.A04;
            C47Z c47z = this.A05;
            String str4 = this.A06;
            XCX xcx = this.A03;
            long j = this.A02;
            WDI wdi = new WDI();
            wdi.A0C = 720;
            wdi.A0A = 1280;
            wdi.A01 = 3000000;
            wdi.A0B = 0;
            wdi.A0O = true;
            wdi.A03 = 5;
            C115595Kt c115595Kt = c47z.A1P;
            if (c115595Kt == null) {
                xcx.D7w();
            } else {
                Context context = oVl2.A01;
                UserSession userSession = oVl2.A02;
                C49602Pt A002 = A0I.A00(context, userSession);
                C06090Tz c06090Tz = C06090Tz.A05;
                C1126256q A003 = AbstractC23119AKd.A00(context, userSession, c115595Kt, A002, false, false, C18U.A06(c06090Tz, userSession, 36327469044939356L));
                EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
                A003.A03(enumC1125356h, new C55779Opo(c47z, false));
                MediaComposition mediaComposition = new MediaComposition(A003);
                List list2 = (List) mediaComposition.A00.get(enumC1125356h);
                if (list2 != null && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((C69688VtY) it.next()).A01 instanceof C55779Opo) {
                            W5s A05 = AbstractC86593tX.A05(userSession, false, false, false, true, false);
                            boolean A06 = C18U.A06(c06090Tz, userSession, 36316168988659770L);
                            boolean z = A05.A1A;
                            boolean z2 = A05.A1F;
                            boolean z3 = A05.A1D;
                            boolean z4 = A05.A1E;
                            int i = A05.A00;
                            boolean z5 = A05.A0G;
                            boolean z6 = A05.A0J;
                            boolean z7 = A05.A0F;
                            boolean z8 = A05.A0H;
                            boolean z9 = A05.A0I;
                            String str5 = A05.A0C;
                            boolean z10 = A05.A0K;
                            boolean z11 = A05.A19;
                            boolean z12 = A05.A0m;
                            boolean z13 = A05.A0b;
                            boolean z14 = A05.A15;
                            boolean z15 = A05.A0Q;
                            boolean z16 = A05.A0r;
                            boolean z17 = A05.A0e;
                            boolean z18 = A05.A0p;
                            boolean z19 = A05.A0s;
                            boolean z20 = A05.A0d;
                            boolean z21 = A05.A11;
                            boolean z22 = A05.A14;
                            boolean z23 = A05.A13;
                            boolean z24 = A05.A0y;
                            boolean z25 = A05.A0g;
                            boolean z26 = A05.A0h;
                            boolean z27 = A05.A0f;
                            boolean z28 = A05.A0i;
                            boolean z29 = A05.A0w;
                            boolean z30 = A05.A0E;
                            boolean z31 = A05.A0j;
                            boolean z32 = A05.A0L;
                            boolean z33 = A05.A10;
                            int i2 = A05.A05;
                            int i3 = A05.A04;
                            boolean z34 = A05.A0T;
                            int i4 = A05.A02;
                            int i5 = A05.A01;
                            W5s w5s = new W5s(str5, A05.A0D, i, 1000, i2, i3, i4, i5, A05.A06, A05.A09, A05.A08, A05.A07, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, true, z12, true, z13, z14, z15, z16, z17, z18, z19, true, true, true, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, A05.A0M, true, A05.A0U, A05.A0Y, A05.A0R, true, A05.A0W, A05.A0x, A05.A0a, A06, true, A05.A0l, true, A05.A0P, true, A05.A0V, A05.A0t, A05.A16, A05.A0k, true, A05.A0O, A05.A17, A05.A1B, A05.A0q, A05.A12);
                            W3N w3n = new W3N();
                            w3n.A06 = wdi;
                            w3n.A0H = true;
                            w3n.A08 = mediaComposition;
                            w3n.A0B = w5s.A0B;
                            C69489VoC c69489VoC = new C69489VoC(w3n);
                            ?? obj2 = new Object();
                            C69223Vjq c69223Vjq2 = new C69223Vjq(xcx, oVl2, str4, obj2);
                            WZ2 wz2 = new WZ2();
                            C23518AbY A01 = ADB.A01(context, userSession, AbstractC50707Ma2.A01(c47z), false, false);
                            WZB wzb = new WZB(VYI.A00, true);
                            C70114W4m c70114W4m = new C70114W4m(context, new Object(), new Object(), new C55773Oph(context, false), new C70129W5q(), new C55775Opk(), wz2, new Object(), wzb, c69489VoC, new WZY(new U7T(), A01), c69223Vjq2);
                            obj2.A00 = c70114W4m;
                            List asList = Arrays.asList(Long.valueOf(j));
                            c70114W4m.A04 = null;
                            c70114W4m.A05 = new HashMap();
                            System.nanoTime();
                            Collections.sort(asList);
                            long j2 = -1;
                            try {
                                if (!c70114W4m.A06) {
                                    Context context2 = c70114W4m.A07;
                                    InterfaceC58019Po5 interfaceC58019Po5 = c70114W4m.A0A;
                                    InterfaceC71972XDf interfaceC71972XDf = c70114W4m.A0F;
                                    X9V x9v = c70114W4m.A0D;
                                    InterfaceC58105PpU interfaceC58105PpU = c70114W4m.A0E;
                                    ?? obj3 = new Object();
                                    C69489VoC c69489VoC2 = c70114W4m.A01;
                                    C58647PzK c58647PzK = c70114W4m.A09;
                                    MediaComposition A03 = new C70168WEk(context2, c58647PzK, interfaceC58019Po5, x9v, interfaceC58105PpU, interfaceC71972XDf, obj3, c69489VoC2, new File(context2.getCacheDir(), "transcodeCache"), C05F.A00).A03(c70114W4m.A01.A0B.A0P());
                                    W3N w3n2 = new W3N(c70114W4m.A01);
                                    w3n2.A08 = A03;
                                    C69489VoC c69489VoC3 = new C69489VoC(w3n2);
                                    c70114W4m.A01 = c69489VoC3;
                                    try {
                                        InterfaceC71895X9c interfaceC71895X9c = c70114W4m.A0H;
                                        XCA ALX = interfaceC71895X9c.ALX(c69489VoC3.A08, AbstractC55147OdA.A04(c69489VoC3));
                                        if (ALX instanceof WZU) {
                                            c70114W4m.A02 = (C66036TyY) ALX.AM8();
                                            WDI wdi2 = c70114W4m.A01.A06;
                                            boolean z35 = false;
                                            AbstractC1126356r.A07(AbstractC167007dF.A1W(wdi2), "MediaTranscodeParams should not be null");
                                            C69068VhJ c69068VhJ = c70114W4m.A0G;
                                            int i6 = wdi2.A0C;
                                            int i7 = wdi2.A0A;
                                            AnonymousClass810 anonymousClass810 = new AnonymousClass810(new AnonymousClass811(AbstractC111324zv.A00(660)));
                                            c69068VhJ.A02 = anonymousClass810;
                                            anonymousClass810.A00(i6, i7);
                                            SurfaceTexture surfaceTexture = new SurfaceTexture(c69068VhJ.A02.A00);
                                            c69068VhJ.A00 = surfaceTexture;
                                            surfaceTexture.setDefaultBufferSize(i6, i7);
                                            Surface surface = new Surface(c69068VhJ.A00);
                                            c69068VhJ.A01 = surface;
                                            C66036TyY c66036TyY = c70114W4m.A02;
                                            C69489VoC c69489VoC4 = c70114W4m.A01;
                                            c66036TyY.A00(context2, surface, c69489VoC4.A06, null, c69489VoC4.A0B);
                                            C69489VoC c69489VoC5 = c70114W4m.A01;
                                            if (c69489VoC5.A08 != null) {
                                                z35 = true;
                                            }
                                            AbstractC1126356r.A07(z35, "Input should be given as MediaComposition");
                                            XC9 xc9 = c70114W4m.A08;
                                            ?? obj4 = new Object();
                                            obj4.A00 = context2;
                                            obj4.A05 = interfaceC71895X9c;
                                            obj4.A03 = x9v;
                                            obj4.A02 = interfaceC58019Po5;
                                            obj4.A04 = interfaceC58105PpU;
                                            obj4.A01 = xc9;
                                            c70114W4m.A00 = new WGV(c58647PzK, null, new Object(), interfaceC58019Po5, c70114W4m.A0B, null, new C69409Vmt(null, null, null, null, null, null, c70114W4m.A02), c69489VoC5, ALX, obj4);
                                            c70114W4m.A06 = true;
                                            c70114W4m.A04 = null;
                                        } else {
                                            throw new Exception("Incompatible transcoder");
                                        }
                                    } catch (Throwable th) {
                                        c70114W4m.A01();
                                        throw th;
                                    }
                                }
                                WGV wgv = c70114W4m.A00;
                                AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "preparePlayer", new Object[0]);
                                wgv.A0C(null, new HashSet());
                                int i8 = 0;
                                c70114W4m.A00.A0B(((Long) asList.get(0)).longValue());
                                int size = asList.size();
                                while (true) {
                                    if (i8 < size) {
                                        Long l = (Long) asList.get(i8);
                                        if (c70114W4m.A0J.get()) {
                                            break;
                                        }
                                        j2 = l.longValue();
                                        WGV wgv2 = c70114W4m.A00;
                                        long longValue = l.longValue();
                                        AbstractC66028TyQ abstractC66028TyQ = wgv2.A08;
                                        if (abstractC66028TyQ != null) {
                                            abstractC66028TyQ.A01(longValue);
                                        }
                                        AbstractC66028TyQ abstractC66028TyQ2 = wgv2.A07;
                                        if (abstractC66028TyQ2 != null) {
                                            abstractC66028TyQ2.A01(longValue);
                                        }
                                        WGV.A05(enumC1125356h, wgv2, null, longValue);
                                        WGV.A04(enumC1125356h, wgv2, longValue, true);
                                        Map map = wgv2.A0R;
                                        C69489VoC c69489VoC6 = wgv2.A0M;
                                        Iterator it2 = AbstractC70158WDt.A02(enumC1125356h, c69489VoC6.A0B, map, longValue).iterator();
                                        while (it2.hasNext()) {
                                            int intValue = ((Integer) it2.next()).intValue();
                                            InterfaceC71998XEm A08 = wgv2.A08(enumC1125356h, intValue);
                                            MediaComposition mediaComposition2 = c69489VoC6.A08;
                                            mediaComposition2.getClass();
                                            C1125956n A042 = mediaComposition2.A04(enumC1125356h, intValue);
                                            if (A042 != null) {
                                                long j3 = A042.A00;
                                                if (j3 < 0) {
                                                    j3 = 0;
                                                }
                                                A08.AO4(longValue - j3);
                                            } else {
                                                throw new Exception();
                                            }
                                        }
                                        Iterator A15 = AbstractC166997dE.A15(wgv2.A0L.A07);
                                        while (A15.hasNext()) {
                                            ((C66036TyY) AbstractC31176DnK.A0j(A15)).EGl(longValue);
                                        }
                                        c70114W4m.A02.EGl(l.longValue());
                                        long longValue2 = l.longValue();
                                        Bitmap bitmap = null;
                                        try {
                                            try {
                                                InterfaceC72002XEq interfaceC72002XEq = c70114W4m.A02.A00;
                                                interfaceC72002XEq.getClass();
                                                bitmap = interfaceC72002XEq.ELb();
                                                c69223Vjq = c70114W4m.A03;
                                                obj = new Object();
                                                oVl = c69223Vjq.A01;
                                                obj.A00 = OVl.A00(bitmap, oVl, c69223Vjq.A02, bitmap.getWidth());
                                            } catch (Exception e) {
                                                C70114W4m.A00(c70114W4m, e, longValue2);
                                            }
                                            try {
                                                try {
                                                    C70114W4m c70114W4m2 = (C70114W4m) c69223Vjq.A03.A00;
                                                    if (c70114W4m2 != null) {
                                                        c70114W4m2.A01();
                                                    }
                                                } catch (Exception e2) {
                                                    AbstractC12120kG.A09("ClipsDefaultCoverPhotoGenerator", "frameRetriever?.release() failed", e2);
                                                }
                                                c69223Vjq.A03.A00 = null;
                                                C11T.A02(new RunnableC71573WwO(c69223Vjq.A00, oVl, obj));
                                                if (bitmap != null) {
                                                    bitmap.recycle();
                                                }
                                                i8++;
                                            } catch (Throwable th2) {
                                                c69223Vjq.A03.A00 = null;
                                                throw th2;
                                                break;
                                            }
                                        } catch (Throwable th3) {
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                throw th3;
                                            }
                                            throw th3;
                                        }
                                    } else {
                                        XES xes = c70114W4m.A01.A07;
                                        if (xes != null) {
                                            xes.D6f(c70114W4m.A0I);
                                        }
                                        if (c70114W4m.A04 == null) {
                                            c70114W4m.A04 = Boolean.TRUE;
                                            return null;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                C70114W4m.A00(c70114W4m, th4, j2);
                                return null;
                            }
                        }
                    }
                }
                AbstractC12120kG.A09("ClipsDefaultCoverPhotoGenerator", "empty video effects while calling ClipsDefaultCoverPhotoGenerator#generateDefaultCoverPhotoFromMediaComposition", null);
                C11T.A02(new RunnableC71493Wut(xcx, oVl2));
                return null;
            }
            return null;
        }
        try {
            OVl oVl3 = this.A04;
            C47Z c47z2 = this.A05;
            String str6 = this.A06;
            int i9 = this.A01;
            int i10 = this.A00;
            long j4 = this.A02;
            int i11 = c47z2.A0H;
            MediaComposition mediaComposition3 = c47z2.A0r;
            int i12 = 1;
            C185368Kc c185368Kc = c47z2.A12;
            if (mediaComposition3 != null) {
                if (c185368Kc == null) {
                    enumC189548aZ2 = null;
                } else {
                    enumC189548aZ2 = c185368Kc.A03;
                }
                if (enumC189548aZ2 != EnumC189548aZ.A07 || (A07 = mediaComposition3.A07(EnumC1125356h.VIDEO)) == null || A07.size() <= 1) {
                    i12 = 0;
                }
                MediaComposition mediaComposition4 = c47z2.A0r;
                if (mediaComposition4 == null || (A04 = mediaComposition4.A04(EnumC1125356h.VIDEO, i12)) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(A04.A04);
                if (((C1125756l) arrayList.get(0)).A01(false)) {
                    File file = ((C1125756l) arrayList.get(0)).A04;
                    if (file != null) {
                        str3 = file.getCanonicalPath();
                    } else {
                        str3 = null;
                    }
                    Bitmap decodeFile = BitmapFactory.decodeFile(str3);
                    if (decodeFile == null) {
                        return null;
                    }
                    return OVl.A00(decodeFile, oVl3, str6, i11);
                }
                File file2 = ((C1125756l) arrayList.get(0)).A04;
                if (file2 == null) {
                    return null;
                }
                if (i9 > 0 && i10 > 0) {
                    String canonicalPath = file2.getCanonicalPath();
                    C14360o3.A07(canonicalPath);
                    A00 = AbstractC209669Pc.A00(oVl3.A02, canonicalPath, i9, i10, ((C1125756l) arrayList.get(0)).A03.A03(TimeUnit.MICROSECONDS));
                } else {
                    String canonicalPath2 = file2.getCanonicalPath();
                    C14360o3.A07(canonicalPath2);
                    Bitmap A012 = AbstractC209669Pc.A01(canonicalPath2, ((C1125756l) arrayList.get(0)).A03.A03(TimeUnit.MICROSECONDS));
                    if (A012 != null) {
                        return OVl.A00(A012, oVl3, str6, i11);
                    }
                    return null;
                }
            } else {
                if (c185368Kc == null) {
                    enumC189548aZ = null;
                } else {
                    enumC189548aZ = c185368Kc.A03;
                }
                if (enumC189548aZ == EnumC189548aZ.A07 && (list = c47z2.A4J) != null && list.size() > 1) {
                    List list3 = c47z2.A4J;
                    if (list3 != null) {
                        str2 = ((C5JD) list3.get(1)).A0C;
                        if (str2 == null) {
                            return null;
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    str2 = c47z2.A1N.A0F;
                    if (str2 == null) {
                        return null;
                    }
                }
                A00 = AbstractC209669Pc.A00(oVl3.A02, str2, i9, i10, j4);
            }
            if (A00 != null) {
                return OVl.A00(A00, oVl3, str6, A00.getWidth());
            }
            return null;
        } catch (FileNotFoundException e3) {
            e = e3;
            str = "FileNotFoundException calling ClipsDefaultCoverPhotoGenerator#generateAndSaveDefaultCoverPhoto";
            AbstractC12120kG.A09("ClipsDefaultCoverPhotoGenerator", str, e);
            return null;
        } catch (IOException e4) {
            e = e4;
            str = "IOException calling ClipsDefaultCoverPhotoGenerator#generateAndSaveDefaultCoverPhoto";
            AbstractC12120kG.A09("ClipsDefaultCoverPhotoGenerator", str, e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            str = "NullPointerException calling ClipsDefaultCoverPhotoGenerator#generateAndSaveDefaultCoverPhoto";
            AbstractC12120kG.A09("ClipsDefaultCoverPhotoGenerator", str, e);
            return null;
        }
    }

    @Override // X.C2AG, X.C11R
    public final void onCancel() {
        this.A04.A00 = true;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (!this.A07) {
            XCX xcx = this.A03;
            if (str != null) {
                xcx.D9V(str);
            } else {
                xcx.D7w();
            }
        }
    }
}
