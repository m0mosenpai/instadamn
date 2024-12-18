package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1No, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25821No implements C1MT {
    public static boolean A0k = true;
    public static boolean A0l = true;
    public static C25821No A0m;
    public static boolean A0n;
    public static final java.util.Set A0o = new HashSet();
    public C59562nz A00;
    public InterfaceC25751Nh A01;
    public AbstractC12990ll A03;
    public java.util.Set A05;
    public ExecutorService A06;
    public boolean A07;
    public final double A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final long A0C;
    public final Context A0D;
    public final C0f6 A0E;
    public final InterfaceC11560jF A0F;
    public final C1O2 A0G;
    public final C1NX A0H;
    public final C1O8 A0I;
    public final C25761Ni A0K;
    public final C1NZ A0L;
    public final HandlerC25861Nt A0M;
    public final HandlerC25861Nt A0N;
    public final java.util.Set A0Q;
    public final java.util.Set A0R;
    public final java.util.Set A0S;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final int A0b;
    public final int A0c;
    public final HandlerThread A0d;
    public final C25811Nn A0f;
    public final InterfaceC222916i A0g;
    public final AbstractRunnableC14200nk A0h;
    public final InterfaceC08830cm A0i;
    public final boolean A0j;
    public final Object A0O = new Object();
    public final Map A0P = new HashMap();
    public final InterfaceC25751Nh A0J = new C25741Ng();
    public final AtomicInteger A0T = new AtomicInteger(0);
    public final AtomicInteger A0U = new AtomicInteger(0);
    public final AwakeTimeSinceBootClock A0e = AwakeTimeSinceBootClock.INSTANCE;
    public C43601zh A02 = null;
    public C43611zn A04 = null;

    public static boolean A0E(int i, int i2) {
        return i == -1 ? i2 != -1 : i2 != -1 && i > i2;
    }

    @Deprecated
    public final Bitmap A0G(ImageUrl imageUrl) {
        C73033Pe A01 = A01(this, null, imageUrl, null, false, false);
        if (A01 != null) {
            return A01.A01;
        }
        return null;
    }

    @Deprecated
    public final Bitmap A0H(ImageUrl imageUrl, String str) {
        C73033Pe A01 = A01(this, null, imageUrl, str, false, false);
        if (A01 != null) {
            return A01.A01;
        }
        return null;
    }

    public final Bitmap A0I(ImageUrl imageUrl, String str) {
        C73033Pe A01 = A01(this, null, imageUrl, str, false, true);
        if (A01 != null) {
            return A01.A01;
        }
        return null;
    }

    public final C73033Pe A0K(AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, String str) {
        return A01(this, abstractC12990ll, imageUrl, str, false, false);
    }

    public static synchronized C25821No A00() {
        C25821No c25821No;
        synchronized (C25821No.class) {
            c25821No = A0m;
        }
        return c25821No;
    }

    public static String A03(C25821No c25821No, ImageCacheKey imageCacheKey) {
        if (c25821No.A0H.A04) {
            return AnonymousClass001.A0o(imageCacheKey.A02, "_", "_", imageCacheKey.A01, imageCacheKey.A00);
        }
        return imageCacheKey.A03;
    }

    public static void A04(Bitmap bitmap, C25821No c25821No, C59722oF c59722oF, String str) {
        C43611zn c43611zn = c25821No.A04;
        if (c43611zn != null) {
            C14360o3.A0B(str, 0);
            UserSession userSession = c43611zn.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36325824072267163L) && AbstractC61362qy.A00(userSession).A01.containsKey(str)) {
                L70 A00 = AbstractC47012KqV.A00(userSession);
                UserSession userSession2 = A00.A00;
                AbstractC61362qy.A00(userSession2).A04(str);
                A00.A01.ATO(new KMR(bitmap, c59722oF, userSession2, null, str));
            }
        }
    }

    public static void A05(InterfaceC59502nt interfaceC59502nt, C25821No c25821No) {
        C59632o6 c59632o6;
        synchronized (c25821No.A0O) {
            Map map = c25821No.A0P;
            C59562nz c59562nz = (C59562nz) map.get(interfaceC59502nt.AjY());
            if (c59562nz != null) {
                InterfaceC11560jF interfaceC11560jF = c25821No.A0F;
                if (interfaceC11560jF != null) {
                    interfaceC11560jF.Ck1(interfaceC59502nt.BRz());
                }
                C59562nz.A03(interfaceC59502nt, c59562nz);
                if (interfaceC11560jF != null) {
                    interfaceC11560jF.Cjw(interfaceC59502nt.BRz(), c25821No.A0e.now() - c59562nz.A0H);
                }
                if (!interfaceC59502nt.Cas()) {
                    interfaceC59502nt.BGt();
                    c59562nz.A0W = c25821No.A0T.incrementAndGet();
                }
            } else if (c25821No.A0F(interfaceC59502nt)) {
                InterfaceC11560jF interfaceC11560jF2 = c25821No.A0F;
                if (interfaceC11560jF2 != null) {
                    interfaceC11560jF2.Cjy(interfaceC59502nt.BRz(), "memory", "SUCCESS");
                }
            } else {
                AbstractC12990ll session = interfaceC59502nt.getSession();
                ImageUrl BRz = interfaceC59502nt.BRz();
                int BqU = interfaceC59502nt.BqU();
                List B2e = interfaceC59502nt.BGt().B2e();
                int decrementAndGet = c25821No.A0U.decrementAndGet();
                String Byf = interfaceC59502nt.Byf();
                boolean Cbv = interfaceC59502nt.Cbv();
                boolean Cas = interfaceC59502nt.Cas();
                C59562nz c59562nz2 = new C59562nz(c25821No.A0e, c25821No, session, BRz, Byf, B2e, BqU, decrementAndGet, interfaceC59502nt.BTw(), Cbv, Cas, interfaceC59502nt.CUp(), interfaceC59502nt.Cfj());
                C59562nz.A03(interfaceC59502nt, c59562nz2);
                if (c25821No.A0f != null) {
                    synchronized (C59632o6.A02) {
                        c59632o6 = C59632o6.A01;
                        if (c59632o6 == null) {
                            c59632o6 = new C59632o6();
                            C59632o6.A01 = c59632o6;
                        }
                    }
                    String CDP = interfaceC59502nt.BRz().CDP();
                    String Byf2 = interfaceC59502nt.Byf();
                    C14360o3.A07(Byf2);
                    c59632o6.A00.put(CDP, Byf2);
                }
                map.put(interfaceC59502nt.AjY(), c59562nz2);
                if (!Cas) {
                    c59562nz2.A0W = c25821No.A0T.incrementAndGet();
                }
                if (c25821No.A0j && !c25821No.A0G.A00().Cb3(c25821No.A0L(interfaceC59502nt.BRz()))) {
                    if (interfaceC59502nt.CfE()) {
                        if (c59562nz2.A01 == 0) {
                            c59562nz2.A01 = 20005;
                            c59562nz2.A0D = "Cache only request failed because image is not in disk cache";
                        }
                        C59562nz.A09(c59562nz2, "cacheonly", "FAIL", null);
                    } else if (c59562nz2.A0M == C05F.A0u) {
                        C59562nz.A05(c59562nz2);
                    } else {
                        C59562nz.A06(c59562nz2);
                    }
                } else {
                    c25821No.A01.A7h(c59562nz2);
                    InterfaceC11560jF interfaceC11560jF3 = c25821No.A0F;
                    if (interfaceC11560jF3 != null) {
                        interfaceC11560jF3.Cjn(interfaceC59502nt.BRz());
                    }
                }
            }
            A08(c25821No);
        }
    }

    public static void A06(InterfaceC59502nt interfaceC59502nt, C25821No c25821No) {
        synchronized (c25821No.A0O) {
            C59562nz c59562nz = (C59562nz) c25821No.A0P.get(interfaceC59502nt.AjY());
            if (c59562nz != null) {
                C59562nz.A04(interfaceC59502nt, c59562nz);
            }
        }
    }

    public static synchronized void A07(C3WI c3wi) {
        synchronized (C25821No.class) {
            C25821No c25821No = A0m;
            if (c25821No != null) {
                c3wi.DLK(c25821No);
            } else {
                A0o.add(c3wi);
            }
        }
    }

    public static void A09(C25821No c25821No) {
        synchronized (c25821No.A0O) {
            int i = c25821No.A0c;
            if (i > 1) {
                while (true) {
                    java.util.Set set = c25821No.A0R;
                    if (set.size() < i) {
                        InterfaceC25751Nh interfaceC25751Nh = c25821No.A0J;
                        if (!interfaceC25751Nh.isEmpty()) {
                            final C59562nz BE1 = interfaceC25751Nh.BE1();
                            if (BE1 != null) {
                                interfaceC25751Nh.EEl(BE1);
                                set.add(BE1);
                                InterfaceC11560jF interfaceC11560jF = c25821No.A0F;
                                if (interfaceC11560jF != null) {
                                    interfaceC11560jF.Cjq(BE1.A0L);
                                }
                                c25821No.A06.execute(new AbstractRunnableC14200nk() { // from class: X.2pb
                                    {
                                        super(716, 2, false, true);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2;
                                        boolean z;
                                        int i3;
                                        int i4;
                                        Bitmap bitmap;
                                        int[] iArr;
                                        C59562nz c59562nz = C59562nz.this;
                                        c59562nz.A0A.getClass();
                                        C59722oF c59722oF = c59562nz.A0A;
                                        c59722oF.A01 = true;
                                        C25821No c25821No2 = c59562nz.A0c;
                                        c59562nz.A05 = AbstractC60562pf.A00(c25821No2.A0D, c59722oF.A02);
                                        C1NX c1nx = c25821No2.A0H;
                                        int[] iArr2 = null;
                                        if (c1nx.A09 && c59562nz.A0G != null) {
                                            ImageUrl imageUrl = c59562nz.A0L;
                                            if (((ImageCacheKey) imageUrl.AjX()).A01 > 0 && ((ImageCacheKey) imageUrl.AjX()).A00 > 0) {
                                                iArr2 = new int[]{((ImageCacheKey) imageUrl.AjX()).A01, ((ImageCacheKey) imageUrl.AjX()).A00};
                                            }
                                        }
                                        InterfaceC11560jF interfaceC11560jF2 = c25821No2.A0F;
                                        if (interfaceC11560jF2 != null) {
                                            interfaceC11560jF2.Ck4(c59562nz.A0L);
                                        }
                                        C1O2 c1o2 = c25821No2.A0G;
                                        C25761Ni c25761Ni = c1o2.A04.A0K;
                                        ImageUrl imageUrl2 = c59562nz.A0L;
                                        String str = ((ImageCacheKey) imageUrl2.AjX()).A03;
                                        if (c1nx.A04 && (iArr = c59562nz.A0G) != null) {
                                            int i5 = iArr[0];
                                            i2 = 1;
                                            int i6 = iArr[1];
                                            int i7 = ((ImageCacheKey) imageUrl2.AjX()).A01;
                                            int i8 = ((ImageCacheKey) imageUrl2.AjX()).A00;
                                            if (i7 > 0 && i8 > 0) {
                                                while (i7 * 2 * i2 <= i5 && i8 * 2 * i2 <= i6) {
                                                    i2 *= 2;
                                                }
                                            }
                                        } else {
                                            C59592o2 c59592o2 = c59562nz.A0J;
                                            i2 = c59592o2.A00 == Integer.MAX_VALUE ? 1 : c59592o2.A00;
                                        }
                                        C59722oF c59722oF2 = c59562nz.A0A;
                                        byte[] bArr = c59722oF2.A02;
                                        int i9 = c59722oF2.A00;
                                        int i10 = c59562nz.A04;
                                        String str2 = c59562nz.A0C;
                                        Boolean bool = c59562nz.A0J.A02;
                                        if (bool != null) {
                                            z = bool.booleanValue();
                                        } else {
                                            z = false;
                                        }
                                        String str3 = c59562nz.A0N;
                                        C61292qr A01 = c25761Ni.A01(c59562nz.A05, str, str2, str3, imageUrl2.CDP(), bArr, iArr2, i2, i9, i10, z);
                                        if (A01 != null) {
                                            Bitmap bitmap2 = A01.A02;
                                            c59562nz.A07 = new C61332qv(bitmap2, A01.A04);
                                            c59562nz.A0F = true;
                                            if (c1nx.A02 && iArr2 != null) {
                                                String A0L = c25821No2.A0L(imageUrl2);
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap2, byteArrayOutputStream, 85);
                                                C59562nz.A0A(c59562nz, c59562nz.A0C, A0L, byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size(), c59562nz.A04, true);
                                            }
                                            if (c1nx.A05) {
                                                C1O8 c1o8 = c25821No2.A0I;
                                                ImageCacheKey imageCacheKey = (ImageCacheKey) imageUrl2.AjX();
                                                C14360o3.A0B(imageCacheKey, 0);
                                                if (c1o8.A02 && !c1o8.A03) {
                                                    C1O8.A02(c1o8.A01, c1o8, imageCacheKey);
                                                }
                                            }
                                            C24211Gq c24211Gq = c1o2.A02;
                                            if (c24211Gq != null) {
                                                c24211Gq.A02(c25821No2.A0L(imageUrl2), str3, 1, c59562nz.A00, c59562nz.A0A.A00);
                                            }
                                        }
                                        c25821No2.A00 = null;
                                        c25821No2.A0R.remove(c59562nz);
                                        if (interfaceC11560jF2 != null) {
                                            int i11 = 0;
                                            if (A01 != null && (bitmap = A01.A02) != null) {
                                                i11 = bitmap.getWidth();
                                                i3 = bitmap.getHeight();
                                                i4 = bitmap.getByteCount();
                                            } else {
                                                i3 = 0;
                                                i4 = 0;
                                            }
                                            interfaceC11560jF2.Cjk(imageUrl2);
                                            interfaceC11560jF2.Cji(imageUrl2, i11, i3, i4);
                                        }
                                        C59562nz.A09(c59562nz, c59562nz.A0B, "SUCCESS", null);
                                        C25821No.A08(c25821No2);
                                        if (A01 != null) {
                                            C25821No.A04(A01.A02, c25821No2, null, imageUrl2.getUrl());
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            } else if (c25821No.A00 == null) {
                InterfaceC25751Nh interfaceC25751Nh2 = c25821No.A0J;
                if (!interfaceC25751Nh2.isEmpty()) {
                    C59562nz BE12 = interfaceC25751Nh2.BE1();
                    c25821No.A00 = BE12;
                    if (BE12 != null) {
                        interfaceC25751Nh2.EEl(BE12);
                        InterfaceC11560jF interfaceC11560jF2 = c25821No.A0F;
                        if (interfaceC11560jF2 != null) {
                            interfaceC11560jF2.Cjq(c25821No.A00.A0L);
                        }
                        ExecutorService executorService = c25821No.A06;
                        final C59562nz c59562nz = c25821No.A00;
                        executorService.execute(new AbstractRunnableC14200nk() { // from class: X.2pb
                            {
                                super(716, 2, false, true);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2;
                                boolean z;
                                int i3;
                                int i4;
                                Bitmap bitmap;
                                int[] iArr;
                                C59562nz c59562nz2 = C59562nz.this;
                                c59562nz2.A0A.getClass();
                                C59722oF c59722oF = c59562nz2.A0A;
                                c59722oF.A01 = true;
                                C25821No c25821No2 = c59562nz2.A0c;
                                c59562nz2.A05 = AbstractC60562pf.A00(c25821No2.A0D, c59722oF.A02);
                                C1NX c1nx = c25821No2.A0H;
                                int[] iArr2 = null;
                                if (c1nx.A09 && c59562nz2.A0G != null) {
                                    ImageUrl imageUrl = c59562nz2.A0L;
                                    if (((ImageCacheKey) imageUrl.AjX()).A01 > 0 && ((ImageCacheKey) imageUrl.AjX()).A00 > 0) {
                                        iArr2 = new int[]{((ImageCacheKey) imageUrl.AjX()).A01, ((ImageCacheKey) imageUrl.AjX()).A00};
                                    }
                                }
                                InterfaceC11560jF interfaceC11560jF22 = c25821No2.A0F;
                                if (interfaceC11560jF22 != null) {
                                    interfaceC11560jF22.Ck4(c59562nz2.A0L);
                                }
                                C1O2 c1o2 = c25821No2.A0G;
                                C25761Ni c25761Ni = c1o2.A04.A0K;
                                ImageUrl imageUrl2 = c59562nz2.A0L;
                                String str = ((ImageCacheKey) imageUrl2.AjX()).A03;
                                if (c1nx.A04 && (iArr = c59562nz2.A0G) != null) {
                                    int i5 = iArr[0];
                                    i2 = 1;
                                    int i6 = iArr[1];
                                    int i7 = ((ImageCacheKey) imageUrl2.AjX()).A01;
                                    int i8 = ((ImageCacheKey) imageUrl2.AjX()).A00;
                                    if (i7 > 0 && i8 > 0) {
                                        while (i7 * 2 * i2 <= i5 && i8 * 2 * i2 <= i6) {
                                            i2 *= 2;
                                        }
                                    }
                                } else {
                                    C59592o2 c59592o2 = c59562nz2.A0J;
                                    i2 = c59592o2.A00 == Integer.MAX_VALUE ? 1 : c59592o2.A00;
                                }
                                C59722oF c59722oF2 = c59562nz2.A0A;
                                byte[] bArr = c59722oF2.A02;
                                int i9 = c59722oF2.A00;
                                int i10 = c59562nz2.A04;
                                String str2 = c59562nz2.A0C;
                                Boolean bool = c59562nz2.A0J.A02;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                String str3 = c59562nz2.A0N;
                                C61292qr A01 = c25761Ni.A01(c59562nz2.A05, str, str2, str3, imageUrl2.CDP(), bArr, iArr2, i2, i9, i10, z);
                                if (A01 != null) {
                                    Bitmap bitmap2 = A01.A02;
                                    c59562nz2.A07 = new C61332qv(bitmap2, A01.A04);
                                    c59562nz2.A0F = true;
                                    if (c1nx.A02 && iArr2 != null) {
                                        String A0L = c25821No2.A0L(imageUrl2);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap2, byteArrayOutputStream, 85);
                                        C59562nz.A0A(c59562nz2, c59562nz2.A0C, A0L, byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size(), c59562nz2.A04, true);
                                    }
                                    if (c1nx.A05) {
                                        C1O8 c1o8 = c25821No2.A0I;
                                        ImageCacheKey imageCacheKey = (ImageCacheKey) imageUrl2.AjX();
                                        C14360o3.A0B(imageCacheKey, 0);
                                        if (c1o8.A02 && !c1o8.A03) {
                                            C1O8.A02(c1o8.A01, c1o8, imageCacheKey);
                                        }
                                    }
                                    C24211Gq c24211Gq = c1o2.A02;
                                    if (c24211Gq != null) {
                                        c24211Gq.A02(c25821No2.A0L(imageUrl2), str3, 1, c59562nz2.A00, c59562nz2.A0A.A00);
                                    }
                                }
                                c25821No2.A00 = null;
                                c25821No2.A0R.remove(c59562nz2);
                                if (interfaceC11560jF22 != null) {
                                    int i11 = 0;
                                    if (A01 != null && (bitmap = A01.A02) != null) {
                                        i11 = bitmap.getWidth();
                                        i3 = bitmap.getHeight();
                                        i4 = bitmap.getByteCount();
                                    } else {
                                        i3 = 0;
                                        i4 = 0;
                                    }
                                    interfaceC11560jF22.Cjk(imageUrl2);
                                    interfaceC11560jF22.Cji(imageUrl2, i11, i3, i4);
                                }
                                C59562nz.A09(c59562nz2, c59562nz2.A0B, "SUCCESS", null);
                                C25821No.A08(c25821No2);
                                if (A01 != null) {
                                    C25821No.A04(A01.A02, c25821No2, null, imageUrl2.getUrl());
                                }
                            }
                        });
                    }
                }
            }
            while (true) {
                java.util.Set set2 = c25821No.A0Q;
                if (set2.size() >= c25821No.A0b || c25821No.A01.isEmpty()) {
                    break;
                }
                final C59562nz BE13 = c25821No.A01.BE1();
                if (BE13 != null) {
                    c25821No.A01.EEl(BE13);
                    set2.add(BE13);
                    InterfaceC14020nS A00 = C14120nc.A00();
                    final int i2 = BE13.A0c.A09;
                    A00.ATO(new AbstractRunnableC14200nk(i2) { // from class: X.2oB
                        /* JADX WARN: Can't wrap try/catch for region: R(17:41|18e|74|75|76|77|78|(3:80|81|(2:83|84))|86|(1:102)|90|(1:94)|95|(1:97)(1:101)|98|99|100) */
                        /* JADX WARN: Code restructure failed: missing block: B:109:0x0441, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:110:0x0442, code lost:
                        
                            r5.A01();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:111:0x0445, code lost:
                        
                            throw r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:231:0x00ca, code lost:
                        
                            if (r13 != null) goto L55;
                         */
                        /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0141. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x0137  */
                        /* JADX WARN: Removed duplicated region for block: B:72:0x038f A[Catch: all -> 0x046d, TRY_LEAVE, TryCatch #5 {, blocks: (B:45:0x0191, B:46:0x01b4, B:55:0x0343, B:56:0x0344, B:58:0x034a, B:60:0x034e, B:62:0x0355, B:63:0x035c, B:65:0x037c, B:67:0x0380, B:68:0x0446, B:162:0x046c, B:70:0x0383, B:72:0x038f, B:112:0x044c, B:114:0x0452, B:129:0x022e, B:132:0x0231, B:133:0x026f, B:142:0x02ca, B:143:0x02cb, B:145:0x02d1, B:147:0x02d5, B:148:0x02f0, B:150:0x02f6, B:152:0x0302, B:155:0x032f, B:157:0x0335, B:161:0x0467, B:165:0x033c, B:168:0x0458, B:170:0x045e, B:181:0x0465, B:135:0x0270, B:137:0x0286, B:140:0x028c, B:172:0x0290, B:174:0x02ac, B:175:0x02ae, B:177:0x02ba, B:178:0x02c2, B:179:0x02c9, B:48:0x01b5, B:50:0x01c9, B:53:0x01cf, B:116:0x01d3, B:118:0x01f4, B:120:0x01fe, B:121:0x0200, B:123:0x0214, B:124:0x021d, B:127:0x022c, B:126:0x0225), top: B:43:0x018f, inners: #2, #4 }] */
                        /* JADX WARN: Type inference failed for: r7v4, types: [X.2oD] */
                        /* JADX WARN: Type inference failed for: r7v6, types: [X.2oD] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 1272
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C59682oB.run():void");
                        }
                    });
                }
            }
        }
    }

    public static void A0B(C25821No c25821No, final Runnable runnable, boolean z) {
        if (z) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                runnable.run();
                return;
            } else {
                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.0vH
                    @Override // java.lang.Runnable
                    public final void run() {
                        runnable.run();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1008224327, 3, false, true);
                    }
                });
                return;
            }
        }
        A0A(c25821No, runnable);
    }

    public static void A0C(C25821No c25821No, String str) {
        synchronized (c25821No.A0O) {
            HashMap hashMap = new HashMap();
            for (C59562nz c59562nz : c25821No.A0P.values()) {
                for (InterfaceC59502nt interfaceC59502nt : c59562nz.A0O) {
                    if (str.equals(interfaceC59502nt.Byf())) {
                        List list = (List) hashMap.get(c59562nz);
                        if (list == null) {
                            list = new LinkedList();
                            hashMap.put(c59562nz, list);
                        }
                        list.add(interfaceC59502nt);
                    }
                }
            }
            for (C59562nz c59562nz2 : hashMap.keySet()) {
                List list2 = (List) hashMap.get(c59562nz2);
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        C59562nz.A04((InterfaceC59502nt) it.next(), c59562nz2);
                    }
                }
            }
        }
    }

    public static void A0D(C25821No c25821No, String str, boolean z) {
        C1Ef c1Ef;
        synchronized (c25821No.A0O) {
            C59562nz c59562nz = (C59562nz) c25821No.A0P.get(str);
            if (c59562nz != null) {
                if (!z) {
                    c1Ef = C1Ef.OffScreen;
                } else {
                    c1Ef = C1Ef.OnScreen;
                }
                C59562nz.A02(c1Ef, c59562nz);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r7 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0F(final X.InterfaceC59502nt r21) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25821No.A0F(X.2nt):boolean");
    }

    public final C1OG A0J(ImageUrl imageUrl, String str) {
        return new C1OG(this.A0g, imageUrl, str);
    }

    public final void A0N(final InterfaceC59502nt interfaceC59502nt) {
        int i;
        boolean z;
        String str;
        if (Systrace.A0E(1L)) {
            C0fO.A01("loadImage", 302079949);
        }
        try {
            C0f6 c0f6 = this.A0E;
            if (interfaceC59502nt.CQU()) {
                final C1NJ Ajp = interfaceC59502nt.Ajp();
                if (Ajp != null) {
                    A0B(this, new Runnable() { // from class: X.M38
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1NJ c1nj = Ajp;
                            InterfaceC59502nt interfaceC59502nt2 = interfaceC59502nt;
                            C13080lu A00 = AbstractC13090lv.A00("IgImageInfra.onImageErrorCallback");
                            try {
                                c1nj.DLP(interfaceC59502nt2, new C82183lf(EnumC82173le.A04, "Bad cache request", "undefined", 20004));
                                A00.close();
                            } catch (Throwable th) {
                                try {
                                    A00.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                }
                            }
                        }
                    }, interfaceC59502nt.ART());
                }
                String EJC = interfaceC59502nt.EJC();
                boolean Cas = interfaceC59502nt.Cas();
                Boolean CPT = interfaceC59502nt.CPT();
                if (CPT != null) {
                    z = CPT.booleanValue();
                } else {
                    z = false;
                }
                switch (interfaceC59502nt.FDJ().intValue()) {
                    case 1:
                        str = "EMPTY_URL";
                        break;
                    case 2:
                        str = "MALFORMED_URL";
                        break;
                    case 3:
                        str = "OPAQUE_URL";
                        break;
                    case 4:
                        str = "VALID_URL";
                        break;
                    default:
                        str = "NULL_URL";
                        break;
                }
                String AjU = interfaceC59502nt.AjU();
                C14360o3.A0B(EJC, 1);
                AbstractC107914ta.A00(c0f6, "ERROR_BAD_URL", new C57568Pgg(EJC, str, AjU, Cas, z));
                if (Systrace.A0E(1L)) {
                    i = 2136990006;
                } else {
                    return;
                }
            } else {
                InterfaceC11560jF interfaceC11560jF = this.A0F;
                if (interfaceC11560jF != null) {
                    ImageUrl BRz = interfaceC59502nt.BRz();
                    String Byf = interfaceC59502nt.Byf();
                    boolean z2 = false;
                    if (!interfaceC59502nt.Cas()) {
                        z2 = true;
                    }
                    interfaceC11560jF.EnW(BRz, Byf, z2, interfaceC59502nt.Cbv());
                    if (interfaceC59502nt.Cbw()) {
                        interfaceC11560jF.Ck3(interfaceC59502nt.BRz());
                    }
                }
                if (interfaceC59502nt.EiI()) {
                    C25761Ni c25761Ni = this.A0K;
                    c25761Ni.A03.A00(interfaceC59502nt.AjY());
                }
                if (!interfaceC59502nt.Bxi()) {
                    if (interfaceC11560jF != null) {
                        interfaceC11560jF.Cjo(interfaceC59502nt.BRz());
                    }
                    boolean A0F = A0F(interfaceC59502nt);
                    if (interfaceC11560jF != null) {
                        interfaceC11560jF.Cjt(interfaceC59502nt.BRz());
                    }
                    if (A0F) {
                        if (interfaceC11560jF != null) {
                            interfaceC11560jF.Cjy(interfaceC59502nt.BRz(), "memory", "SUCCESS");
                        }
                        if (Systrace.A0E(1L)) {
                            i = -452189996;
                        } else {
                            return;
                        }
                    }
                }
                this.A0M.A01(997783198, new Runnable() { // from class: X.2nx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C25821No.A05(interfaceC59502nt, this);
                    }
                });
                if (Systrace.A0E(1L)) {
                    i = 2003192531;
                } else {
                    return;
                }
            }
            C0fO.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1803850949);
            }
            throw th;
        }
    }

    @Deprecated
    public final void A0P(ImageUrl imageUrl) {
        C13080lu A00 = AbstractC13090lv.A00("IgImageInfra.prefetch");
        try {
            A01(this, null, imageUrl, null, true, false);
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.C1MT
    public final void F8g() {
        C1O2 c1o2 = this.A0G;
        if (c1o2.A00() != null) {
            double d = this.A08;
            if (c1o2.A00() != null) {
                c1o2.A00().EYh(Math.round(c1o2.A00().BQ5() * d));
            }
        }
    }

    @Override // X.C1MT
    public final void F8h() {
        C1O2 c1o2 = this.A0G;
        if (c1o2.A00() != null) {
            c1o2.A00().clear();
        }
    }

    public static C73033Pe A01(C25821No c25821No, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, String str, boolean z, boolean z2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String name = imageUrl.Amf().name();
            StringBuilder sb = new StringBuilder();
            sb.append("IgImageInfra.fetch: type ");
            sb.append(name);
            sb.append(" isPrefetch ");
            sb.append(z);
            sb.append(" source: ");
            sb.append(str);
            C13080lu A00 = AbstractC13090lv.A00(sb.toString());
            try {
                C4GT c4gt = new C4GT();
                C1OG A0J = c25821No.A0J(imageUrl, str);
                A0J.A03 = -1;
                A0J.A02(c4gt);
                A0J.A0I = z;
                A0J.A0O = z2;
                A0J.A05 = abstractC12990ll;
                A0J.A01();
                try {
                    c4gt.A01.await(10L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
                C73033Pe c73033Pe = c4gt.A00;
                A00.close();
                return c73033Pe;
            } catch (Throwable th) {
                try {
                    A00.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
        throw new IllegalStateException("Can't fetch the image on UI thread.");
    }

    public static Integer A02(ImageUrl imageUrl) {
        if (imageUrl.CDP().startsWith("file:/")) {
            return C05F.A01;
        }
        if (imageUrl.CDP().startsWith("emoji:/")) {
            return C05F.A0C;
        }
        if (imageUrl.CDP().startsWith("emoji-sprite-sheet:/")) {
            return C05F.A0N;
        }
        if (imageUrl.CDP().startsWith("preview:/")) {
            return C05F.A0Y;
        }
        if (imageUrl.CDP().startsWith("base64:/")) {
            return C05F.A0j;
        }
        if (imageUrl.CDP().startsWith("msys:/")) {
            return C05F.A0u;
        }
        if (imageUrl.CDP().startsWith("res:/")) {
            return C05F.A15;
        }
        return C05F.A00;
    }

    public static void A08(C25821No c25821No) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A09(c25821No);
            return;
        }
        HandlerC25861Nt handlerC25861Nt = c25821No.A0M;
        if (handlerC25861Nt.hasMessages(1)) {
            return;
        }
        handlerC25861Nt.sendMessageAtFrontOfQueue(handlerC25861Nt.obtainMessage(1));
    }

    public static void A0A(C25821No c25821No, Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            c25821No.A0N.A01(1008224327, runnable);
        }
    }

    public final String A0L(ImageUrl imageUrl) {
        StringBuilder sb;
        String CDP;
        int i;
        int intValue = A02(imageUrl).intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                return A03(this, (ImageCacheKey) imageUrl.AjX());
            }
            sb = new StringBuilder();
            sb.append("emoji_");
            sb.append(C2UX.A01());
            CDP = imageUrl.CDP();
            i = 20;
        } else {
            sb = new StringBuilder();
            sb.append("emoji_");
            sb.append(C2UX.A01());
            CDP = imageUrl.CDP();
            i = 7;
        }
        sb.append(Integer.toHexString(CDP.substring(i).split("//")[0].hashCode()));
        return sb.toString();
    }

    public final void A0M(final InterfaceC59502nt interfaceC59502nt) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.A0M.A01(997783198, new Runnable() { // from class: X.Auh
                @Override // java.lang.Runnable
                public final void run() {
                    C25821No.A06(interfaceC59502nt, this);
                }
            });
        } else {
            A06(interfaceC59502nt, this);
        }
    }

    public final void A0O(AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, String str) {
        C1OG A0J = A0J(imageUrl, str);
        A0J.A03 = -1;
        A0J.A0I = true;
        A0J.A0F = true;
        if (abstractC12990ll != null) {
            A0J.A05 = abstractC12990ll;
        }
        A0J.A01();
    }

    public C25821No(Context context, C0f6 c0f6, C25811Nn c25811Nn, InterfaceC11560jF interfaceC11560jF, InterfaceC222916i interfaceC222916i, C1NX c1nx, InterfaceC25751Nh interfaceC25751Nh, final C1NF c1nf, C1NZ c1nz, AbstractC12990ll abstractC12990ll, C24211Gq c24211Gq, Integer num, InterfaceC08830cm interfaceC08830cm, int i, int i2, final int i3, final int i4, int i5, int i6, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ExecutorService newSingleThreadExecutor;
        int i7;
        int i8;
        C1O8 c1o8;
        this.A05 = new HashSet();
        this.A0c = i6;
        final boolean z8 = this.A0X;
        if (i6 > 1) {
            newSingleThreadExecutor = Executors.newFixedThreadPool(i6, new ThreadFactory() { // from class: X.42b
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    if (z8) {
                        C0SX.A00(runnable, "Fury", 2);
                    }
                    return new C14290nt(runnable, "Image Decoding", i4);
                }
            });
        } else {
            newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: X.1Np
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    if (z8) {
                        runnable = C0SX.A00(runnable, "Fury", 2);
                    }
                    return new C14290nt(runnable, "Image Decoding", i4);
                }
            });
        }
        C14360o3.A0A(newSingleThreadExecutor);
        this.A06 = newSingleThreadExecutor;
        AbstractC25841Nq.A00(abstractC12990ll, newSingleThreadExecutor);
        this.A07 = z7;
        this.A0D = context.getApplicationContext();
        this.A0E = c0f6;
        this.A01 = interfaceC25751Nh;
        final Looper mainLooper = Looper.getMainLooper();
        this.A0N = new HandlerC25861Nt(mainLooper) { // from class: X.1Nr
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C59562nz c59562nz;
                Bitmap bitmap;
                int i9 = message.what;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 5) {
                                if (i9 == 6) {
                                    Object obj = message.obj;
                                    obj.getClass();
                                    c59562nz = (C59562nz) obj;
                                    synchronized (c59562nz) {
                                        for (InterfaceC59502nt interfaceC59502nt : c59562nz.A0O) {
                                            InterfaceC58852mj BU5 = interfaceC59502nt.BU5();
                                            if (BU5 != null) {
                                                C61332qv c61332qv = c59562nz.A08;
                                                String str = null;
                                                if (c61332qv != null) {
                                                    bitmap = c61332qv.A00;
                                                    str = c61332qv.A01;
                                                } else {
                                                    bitmap = null;
                                                }
                                                String str2 = c59562nz.A0E;
                                                if (str2 == null) {
                                                    str2 = "UNKNOWN";
                                                }
                                                BU5.DTb(interfaceC59502nt, new C73033Pe(bitmap, null, str2, str, -1));
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown message what = ", i9));
                                }
                            } else {
                                Object obj2 = message.obj;
                                obj2.getClass();
                                C59562nz c59562nz2 = (C59562nz) obj2;
                                synchronized (c59562nz2) {
                                    C59562nz.A08(c59562nz2, c59562nz2.A09, c59562nz2.A0V, -1);
                                }
                                return;
                            }
                        } else {
                            Object obj3 = message.obj;
                            obj3.getClass();
                            C59562nz.A07((C59562nz) obj3);
                            return;
                        }
                    } else {
                        Object obj4 = message.obj;
                        obj4.getClass();
                        InterfaceC59502nt interfaceC59502nt2 = (InterfaceC59502nt) obj4;
                        C1NJ Ajp = interfaceC59502nt2.Ajp();
                        if (Ajp != null) {
                            Ajp.DLP(interfaceC59502nt2, new C82183lf(EnumC82173le.A02, null, "undefined", 0));
                            return;
                        }
                        return;
                    }
                } else {
                    Object obj5 = message.obj;
                    obj5.getClass();
                    c59562nz = (C59562nz) obj5;
                    synchronized (c59562nz) {
                        for (InterfaceC59502nt interfaceC59502nt3 : c59562nz.A0O) {
                            C1NJ Ajp2 = interfaceC59502nt3.Ajp();
                            if (Ajp2 != null) {
                                Ajp2.DLW(interfaceC59502nt3, c59562nz.A0U);
                            }
                        }
                    }
                }
            }
        };
        C25761Ni.A08 = c1nf.A01;
        boolean z9 = c1nf.A02;
        if (z9) {
            i7 = (int) (Runtime.getRuntime().maxMemory() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED);
        } else {
            i7 = -1;
        }
        C25761Ni.A06 = i7;
        int intValue = num.intValue();
        if (intValue != 0 && intValue == 1) {
            C18C.A0G(false, "Hybrid decoder not supported on Oreo+");
            throw C00O.createAndThrow();
        }
        int i9 = context.getResources().getDisplayMetrics().heightPixels * context.getResources().getDisplayMetrics().widthPixels * 20;
        int max = Math.max((int) ((i9 * (30.0d / 100.0d)) / 409600.0d), 3);
        if (z9) {
            i8 = C25761Ni.A06 / 8;
        } else {
            i8 = i9 * c1nf.A00;
        }
        C25761Ni c25761Ni = new C25761Ni(c0f6, new C25891Nw(new C25881Nv(c1nf), i8, c1nf.A04, max), new AbstractC25921Nz() { // from class: X.1Ny
            @Override // X.AbstractC25921Nz
            public final C61262qo A00(final C206409Bx c206409Bx, final String str, String str2, String str3, byte[] bArr, float f, final int i10, final int i11, final int i12, boolean z10) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (z10) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    Boolean bool = (Boolean) C1NF.this.A08.get();
                    if (bool != null && bool.booleanValue()) {
                        options.inDither = true;
                    }
                }
                if (i10 != 1) {
                    options.inSampleSize = i10;
                }
                C17280tP A00 = C17280tP.A00();
                if (((Boolean) A00.A0W.CES(A00, C17280tP.A4G[1])).booleanValue()) {
                    options.inDither = true;
                }
                C1NF c1nf2 = C1NF.this;
                boolean z11 = C25761Ni.A07;
                int intValue2 = Long.valueOf(((Number) c1nf2.A06.apply(str2)).longValue()).intValue();
                if (options.inSampleSize <= 1) {
                    options.inJustDecodeBounds = true;
                    C0fL.A00(bArr, 0, i11, options);
                    options.inJustDecodeBounds = false;
                    if (options.outHeight * options.outWidth > intValue2) {
                        C0w9.A01(EnumC12410kj.A09, AnonymousClass001.A0R("excessive_resolution_", str2), AnonymousClass001.A0R("AssetUrl=", str3));
                        options.inSampleSize = 4;
                    }
                }
                Bitmap A002 = C0fL.A00(bArr, 0, i11, options);
                if (A002 != null) {
                    A002 = (Bitmap) c1nf2.A07.apply(A002);
                }
                if (A002 == null) {
                    return null;
                }
                A002.getConfig();
                A002.getWidth();
                A002.getHeight();
                A002.getAllocationByteCount();
                if (C25761Ni.A07) {
                    A002.prepareToDraw();
                }
                Bitmap bitmap = A002;
                if (C25761Ni.A08) {
                    bitmap = null;
                }
                final WeakReference weakReference = new WeakReference(bitmap);
                final int byteCount = A002.getByteCount();
                boolean z12 = C25761Ni.A08;
                final Bitmap bitmap2 = null;
                if (z12) {
                    bitmap2 = A002;
                }
                AbstractC59422nl abstractC59422nl = new AbstractC59422nl(bitmap2, c206409Bx, str, i10, i11, byteCount, i12) { // from class: X.2ql
                    @Override // X.AbstractC59422nl
                    public final Bitmap A00() {
                        if (C25761Ni.A08) {
                            return super.A00;
                        }
                        return (Bitmap) weakReference.get();
                    }
                };
                if (z12) {
                    A002 = null;
                }
                return new C61262qo(A002, abstractC59422nl);
            }
        }, c1nf.A03 ? new C1O0() : null);
        boolean z10 = c1nf.A09;
        int i10 = c1nf.A05;
        c25761Ni.A01 = z10;
        if (z10) {
            c25761Ni.A00 = new Semaphore(i10, true);
        }
        this.A0K = c25761Ni;
        this.A0g = interfaceC222916i;
        this.A0A = 80;
        this.A0C = j;
        this.A0V = true;
        this.A0G = new C1O2(this, c24211Gq);
        this.A0f = c25811Nn;
        this.A0F = interfaceC11560jF;
        this.A0R = new HashSet();
        this.A0S = new HashSet();
        this.A0Q = new HashSet();
        this.A0i = interfaceC08830cm;
        List list = C1O5.A01;
        new Thread() { // from class: X.1O6
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                while (true) {
                    try {
                        List list2 = C1O5.A01;
                        C1O5.A01.remove(C1O5.A00.remove());
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }.start();
        HandlerThread handlerThread = new HandlerThread("Image Cache Background", i5);
        AbstractC09770fa.A00(handlerThread);
        this.A0d = handlerThread;
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A0M = new HandlerC25861Nt(looper) { // from class: X.1O7
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i11 = message.what;
                if (i11 == 1) {
                    C25821No.A09(this);
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown message what = ", i11));
            }
        };
        this.A08 = 0.5d;
        this.A0B = i;
        this.A0X = z;
        this.A0Z = z2;
        this.A0H = c1nx;
        if (!c1nx.A05 && !c1nx.A04) {
            c1o8 = C1O8.A04;
        } else {
            c1o8 = new C1O8(c1nx.A01, c1nx.A00, true, c1nx.A0B);
        }
        this.A0I = c1o8;
        this.A0W = z3;
        this.A0b = i2;
        this.A09 = 2;
        this.A0L = c1nz;
        this.A0Y = z4;
        this.A0j = z5;
        this.A0a = z6;
        this.A03 = abstractC12990ll;
        String A04 = C18U.A04(C06090Tz.A05, abstractC12990ll, 36890560732136324L);
        if (!A04.isEmpty()) {
            this.A05 = new HashSet(Arrays.asList(A04.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
        }
        this.A0h = new AbstractRunnableC14200nk(i3) { // from class: X.1OA
            @Override // java.lang.Runnable
            public final void run() {
                C25821No.A09(C25821No.this);
            }
        };
    }
}
