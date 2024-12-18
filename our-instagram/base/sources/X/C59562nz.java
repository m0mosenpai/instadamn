package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.2nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59562nz {
    public int A01;
    public int A04;
    public C206409Bx A05;
    public InterfaceC27191Tt A06;
    public C61332qv A07;
    public C61332qv A08;
    public C61332qv A09;
    public C59722oF A0A;
    public String A0C;
    public String A0D;
    public String A0E;
    public final long A0H;
    public final C1QX A0I;
    public final AbstractC12990ll A0K;
    public final ImageUrl A0L;
    public final Integer A0M;
    public final String A0N;
    public final boolean A0Q;
    public final C5GF A0R;
    public volatile int A0S;
    public volatile int A0T;
    public volatile int A0V;
    public volatile int A0W;
    public volatile int A0X;
    public volatile Integer A0Y;
    public volatile String A0Z;
    public volatile List A0a;
    public volatile int A0b;
    public final /* synthetic */ C25821No A0c;
    public final Collection A0O = new ArrayList();
    public final Collection A0P = new ArrayList();
    public volatile int A0U = 0;
    public int A03 = 0;
    public int A02 = 0;
    public int A00 = 0;
    public int[] A0G = null;
    public String A0B = "undefined";
    public boolean A0F = false;
    public final C59592o2 A0J = new C59592o2();

    public static void A04(InterfaceC59502nt interfaceC59502nt, C59562nz c59562nz) {
        Collection collection;
        boolean remove;
        InterfaceC59502nt A00;
        synchronized (c59562nz) {
            collection = c59562nz.A0O;
            remove = collection.remove(interfaceC59502nt);
        }
        if (remove) {
            if (!interfaceC59502nt.Cas()) {
                int i = c59562nz.A03 - 1;
                c59562nz.A03 = i;
                if (i == 0) {
                    A02(C1Ef.OffScreen, c59562nz);
                }
            }
            if (!interfaceC59502nt.CfE()) {
                c59562nz.A02--;
            }
            C25821No c25821No = c59562nz.A0c;
            HandlerC25861Nt handlerC25861Nt = c25821No.A0N;
            handlerC25861Nt.sendMessage(handlerC25861Nt.obtainMessage(2, interfaceC59502nt));
            if (collection.isEmpty()) {
                if (c25821No.A01.EEl(c59562nz)) {
                    InterfaceC11560jF interfaceC11560jF = c25821No.A0F;
                    if (interfaceC11560jF != null) {
                        interfaceC11560jF.Cjs(c59562nz.A0L);
                    }
                    c25821No.A0P.remove(((ImageCacheKey) c59562nz.A0L.AjX()).A03);
                    return;
                }
                boolean z = c25821No.A0V;
                if (z && c25821No.A0Q.contains(c59562nz)) {
                    c59562nz.A0Y = C05F.A0C;
                    return;
                }
                if (!z || !c25821No.A0S.contains(c59562nz)) {
                    return;
                }
                c59562nz.A0Y = C05F.A0C;
                InterfaceC27191Tt interfaceC27191Tt = c59562nz.A06;
                if (interfaceC27191Tt == null) {
                    return;
                }
                interfaceC27191Tt.cancel();
                return;
            }
            if (!c59562nz.A0Y.equals(C05F.A00)) {
                return;
            }
            synchronized (c59562nz) {
                A00 = A00(collection);
            }
            if (A00 == null) {
                return;
            }
            c59562nz.A0X = A00.BqU();
            return;
        }
        c59562nz.A0P.remove(interfaceC59502nt);
    }

    public static synchronized void A07(C59562nz c59562nz) {
        synchronized (c59562nz) {
            A08(c59562nz, c59562nz.A07, c59562nz.A0X, c59562nz.A0b);
        }
    }

    public static void A08(final C59562nz c59562nz, C61332qv c61332qv, final int i, final int i2) {
        final Bitmap bitmap;
        int BqU;
        C25821No c25821No;
        Runnable runnable;
        final String str = null;
        if (c61332qv != null) {
            bitmap = c61332qv.A00;
            str = c61332qv.A01;
        } else {
            bitmap = null;
        }
        C5GF c5gf = c59562nz.A0R;
        if (c5gf != null) {
            c5gf.A01 = i;
            c5gf.A00 = i;
            C25821No c25821No2 = c59562nz.A0c;
            ImageUrl imageUrl = c59562nz.A0L;
            Looper.myLooper();
            Looper.getMainLooper();
            imageUrl.AjX();
            c5gf.A03 = c25821No2.A0G.A00().B2T(c25821No2.A0L(imageUrl));
            c5gf.A05 = ((ImageCacheKey) imageUrl.AjX()).A03;
            if (bitmap != null && bitmap.getConfig() != null) {
                c5gf.A06 = bitmap.getConfig().name();
            }
        }
        Iterator it = c59562nz.A0O.iterator();
        while (it.hasNext()) {
            final InterfaceC59502nt interfaceC59502nt = (InterfaceC59502nt) it.next();
            InterfaceC58912mp Avt = interfaceC59502nt.Avt();
            if (Avt != null) {
                Avt.DxG(c5gf);
            }
            if (c59562nz.A0S != 0) {
                BqU = c59562nz.A0S;
            } else {
                BqU = interfaceC59502nt.BqU();
            }
            if (C25821No.A0E(BqU, i)) {
                final InterfaceC58872ml BiQ = interfaceC59502nt.BiQ();
                if (BiQ != null && bitmap != null) {
                    C25821No.A0B(c59562nz.A0c, new Runnable() { // from class: X.53s
                        @Override // java.lang.Runnable
                        public final void run() {
                            C59562nz c59562nz2 = c59562nz;
                            InterfaceC58872ml interfaceC58872ml = BiQ;
                            InterfaceC59502nt interfaceC59502nt2 = interfaceC59502nt;
                            int i3 = i;
                            Bitmap bitmap2 = bitmap;
                            int i4 = i2;
                            String str2 = str;
                            C13080lu A00 = AbstractC13090lv.A00("IgImageInfra.onProgressiveImageCallback");
                            try {
                                String str3 = c59562nz2.A0E;
                                if (str3 == null) {
                                    str3 = "UNKNOWN";
                                }
                                interfaceC58872ml.Dc3(interfaceC59502nt2, new C73033Pe(bitmap2, null, str3, str2, i4), i3);
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
            } else {
                final C1NJ Ajp = interfaceC59502nt.Ajp();
                if (Ajp != null) {
                    if (c59562nz.A0F) {
                        String str2 = c59562nz.A0E;
                        if (str2 == null) {
                            str2 = "UNKNOWN";
                        }
                        final C73033Pe c73033Pe = new C73033Pe(bitmap, c59562nz.A05, str2, str, i2);
                        c25821No = c59562nz.A0c;
                        runnable = new Runnable() { // from class: X.3Q7
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1NJ c1nj = Ajp;
                                InterfaceC59502nt interfaceC59502nt2 = interfaceC59502nt;
                                C73033Pe c73033Pe2 = c73033Pe;
                                C13080lu A00 = AbstractC13090lv.A00("IgImageInfra.onBitmapLoadedCallback");
                                try {
                                    c1nj.Cza(interfaceC59502nt2, c73033Pe2);
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
                        };
                    } else {
                        c25821No = c59562nz.A0c;
                        runnable = new Runnable() { // from class: X.3ld
                            @Override // java.lang.Runnable
                            public final void run() {
                                C59562nz c59562nz2 = c59562nz;
                                C1NJ c1nj = Ajp;
                                InterfaceC59502nt interfaceC59502nt2 = interfaceC59502nt;
                                C13080lu A00 = AbstractC13090lv.A00("IgImageInfra.onImageErrorCallback");
                                try {
                                    int i3 = c59562nz2.A01;
                                    String str3 = c59562nz2.A0D;
                                    EnumC82173le enumC82173le = EnumC82173le.A03;
                                    String str4 = c59562nz2.A0E;
                                    if (str4 == null) {
                                        str4 = "undefined";
                                    }
                                    c1nj.DLP(interfaceC59502nt2, new C82183lf(enumC82173le, str3, str4, i3));
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
                        };
                    }
                    C25821No.A0B(c25821No, runnable, interfaceC59502nt.ART());
                }
                it.remove();
            }
        }
    }

    public final void A0D(C59722oF c59722oF, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        boolean z3;
        String str4;
        this.A0A = c59722oF;
        this.A0D = str2;
        this.A01 = i2;
        this.A04 = i;
        this.A0C = str;
        if (z2) {
            str3 = "disk";
        } else {
            str3 = "network";
        }
        if (c59722oF != null) {
            C25821No c25821No = this.A0c;
            this.A05 = AbstractC60562pf.A00(c25821No.A0D, c59722oF.A02);
            C25821No.A04(null, c25821No, this.A0A, this.A0L.getUrl());
        }
        if (i != -1 && (i != this.A0X ? i < 6 : i <= 0)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean A0E = A0E();
        C59722oF c59722oF2 = this.A0A;
        if (c59722oF2 != null && i != 0) {
            byte[] bArr = c59722oF2.A02;
            int i3 = c59722oF2.A00;
            C25821No c25821No2 = this.A0c;
            ImageUrl imageUrl = this.A0L;
            A0A(this, str, c25821No2.A0L(imageUrl), bArr, i3, i, z);
            InterfaceC11560jF interfaceC11560jF = c25821No2.A0F;
            if (interfaceC11560jF != null) {
                interfaceC11560jF.Cjj(this.A0A.A00, imageUrl);
            }
        }
        if (z3 && A0E) {
            A0B(this, str3, this.A0c.A0S);
            return;
        }
        this.A0F = z3;
        java.util.Set set = this.A0c.A0S;
        if (z) {
            str4 = "SUCCESS";
        } else {
            str4 = "FAIL";
        }
        A09(this, str3, str4, set);
    }

    public final boolean A0E() {
        synchronized (this) {
            for (InterfaceC59502nt interfaceC59502nt : this.A0O) {
                if (interfaceC59502nt.EiO() || !interfaceC59502nt.Cas()) {
                    return true;
                }
            }
            return false;
        }
    }

    public C59562nz(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C25821No c25821No, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, String str, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        EnumC23341Bw enumC23341Bw;
        this.A0c = c25821No;
        this.A0W = 0;
        this.A0K = abstractC12990ll;
        this.A0L = imageUrl;
        this.A0X = i;
        this.A0S = i3;
        this.A0a = list;
        this.A0W = i2;
        C1QX c1qx = new C1QX();
        if (z4 && abstractC12990ll != null && C18U.A06(C06090Tz.A05, abstractC12990ll, 36327610778663649L) && c25821No.A05.contains(str)) {
            enumC23341Bw = EnumC23341Bw.VideoCoverImage;
        } else {
            enumC23341Bw = EnumC23341Bw.Image;
        }
        c1qx.A04 = enumC23341Bw;
        c1qx.A03 = C1Ef.OffScreen;
        c1qx.A0C = str;
        c1qx.A02 = new C59602o3(imageUrl, z2, z3);
        c1qx.A06 = imageUrl.BJa();
        this.A0I = c1qx;
        this.A0M = C25821No.A02(imageUrl);
        this.A0Y = C05F.A00;
        this.A0N = str;
        this.A0Q = z;
        this.A0H = TimeUnit.NANOSECONDS.toMillis(awakeTimeSinceBootClock.nowNanos());
        if (C25821No.A0n) {
            C5GF c5gf = new C5GF();
            this.A0R = c5gf;
            c5gf.A02 = this.A0X;
            c5gf.A04 = imageUrl;
        }
    }

    private void A01() {
        if (!TextUtils.isEmpty(this.A0Z)) {
            Runnable runnable = new Runnable() { // from class: X.40s
                @Override // java.lang.Runnable
                public final void run() {
                    C59562nz c59562nz = C59562nz.this;
                    if (!TextUtils.isEmpty(c59562nz.A0Z)) {
                        C25821No c25821No = c59562nz.A0c;
                        Context context = c25821No.A0D;
                        C1O2 c1o2 = c25821No.A0G;
                        String A0R = AnonymousClass001.A0R(((ImageCacheKey) c59562nz.A0L.AjX()).A03, "_mini");
                        ImageCacheKey imageCacheKey = new ImageCacheKey(A0R, A0R, -1, -1);
                        String str = c59562nz.A0Z;
                        int i = c59562nz.A0T;
                        String str2 = c59562nz.A0N;
                        boolean z = false;
                        if (c59562nz.A03 > 0) {
                            z = true;
                        }
                        C61332qv A00 = new C903740w(context, c1o2, imageCacheKey, str, str2, i, !z).A00();
                        c59562nz.A08 = A00;
                        if (A00 != null && A00.A00 != null) {
                            HandlerC25861Nt handlerC25861Nt = c25821No.A0N;
                            handlerC25861Nt.sendMessage(handlerC25861Nt.obtainMessage(6, c59562nz));
                        }
                    }
                }
            };
            C25821No c25821No = this.A0c;
            if (c25821No.A0Y) {
                c25821No.A06.execute(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public static void A02(C1Ef c1Ef, C59562nz c59562nz) {
        int i;
        InterfaceC27191Tt interfaceC27191Tt = c59562nz.A06;
        if (interfaceC27191Tt == null) {
            c59562nz.A0I.A03 = c1Ef;
        } else {
            interfaceC27191Tt.FAL(c1Ef);
        }
        if (c1Ef == C1Ef.OffScreen) {
            i = 0;
        } else {
            i = -1;
            if (c1Ef == C1Ef.OnScreen) {
                i = 1;
            }
        }
        c59562nz.A00 = i;
    }

    public static void A05(C59562nz c59562nz) {
        C25821No c25821No = c59562nz.A0c;
        synchronized (c25821No.A0O) {
            if (c59562nz.A0Y != C05F.A0C && c59562nz.A02 != 0 && C9A6.A00 != null) {
                AbstractC12990ll abstractC12990ll = c59562nz.A0K;
                if (abstractC12990ll instanceof UserSession) {
                    c25821No.A0Q.remove(c59562nz);
                    c25821No.A0S.add(c59562nz);
                    C14120nc.A00().ATO(new KM9(C9A6.A00, c59562nz, (UserSession) abstractC12990ll, c25821No.A0Z));
                    C25821No.A08(c25821No);
                }
            }
            A09(c59562nz, "network", "CANCELLED", c25821No.A0Q);
        }
    }

    public static void A09(C59562nz c59562nz, String str, String str2, java.util.Set set) {
        C61332qv c61332qv;
        C25821No c25821No = c59562nz.A0c;
        synchronized (c25821No.A0O) {
            InterfaceC11560jF interfaceC11560jF = c25821No.A0F;
            if (interfaceC11560jF != null) {
                interfaceC11560jF.Cjy(c59562nz.A0L, str, str2);
            }
            C59722oF c59722oF = c59562nz.A0A;
            if (c59722oF != null) {
                c59562nz.A0b = c59722oF.A00;
                c59562nz.A0A.A01();
            }
            if (c59562nz.A0F && ((c61332qv = c59562nz.A07) == null || c61332qv.A00 == null)) {
                synchronized (c59562nz) {
                    Iterator it = c59562nz.A0O.iterator();
                    while (it.hasNext()) {
                        InterfaceC59502nt interfaceC59502nt = (InterfaceC59502nt) it.next();
                        if (!interfaceC59502nt.Cas()) {
                            c59562nz.A0P.add(interfaceC59502nt);
                            it.remove();
                        }
                    }
                }
            }
            c25821No.A0P.remove(((ImageCacheKey) c59562nz.A0L.AjX()).A03);
            if (set != null) {
                set.remove(c59562nz);
            }
            Collection collection = c59562nz.A0P;
            if (!collection.isEmpty()) {
                InterfaceC59502nt A00 = A00(collection);
                if (A00 != null) {
                    collection.remove(A00);
                    c25821No.A0N(A00);
                }
                if (!collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c25821No.A0N((InterfaceC59502nt) it2.next());
                    }
                    collection.clear();
                }
            } else {
                C25821No.A08(c25821No);
            }
            C5GF c5gf = c59562nz.A0R;
            if (c5gf != null) {
                c5gf.A07 = str;
            }
            c59562nz.A0E = str;
        }
        if (c25821No.A07) {
            A07(c59562nz);
        } else {
            HandlerC25861Nt handlerC25861Nt = c25821No.A0N;
            handlerC25861Nt.sendMessage(handlerC25861Nt.obtainMessage(3, c59562nz));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.4te, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.4te, java.lang.Object] */
    public static void A0A(C59562nz c59562nz, String str, String str2, byte[] bArr, int i, int i2, boolean z) {
        C59732oG ARB;
        ImageCacheKey A01;
        try {
            C25821No c25821No = c59562nz.A0c;
            if (c25821No.A0a) {
                if (!z || str != null) {
                    HashMap hashMap = new HashMap();
                    if (!z) {
                        hashMap.put("scan", Integer.valueOf(i2));
                    }
                    if (str != null) {
                        hashMap.put("content_id", str);
                    }
                    ?? obj = new Object();
                    obj.A00 = new JSONObject(hashMap);
                    ARB = c25821No.A0G.A00().ARH(obj, str2, true);
                } else {
                    ARB = c25821No.A0G.A00().ARB(str2);
                }
            } else if (!z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("scan", Integer.valueOf(i2));
                ?? obj2 = new Object();
                obj2.A00 = new JSONObject(hashMap2);
                ARB = c25821No.A0G.A00().ARH(obj2, str2, true);
            } else {
                ARB = c25821No.A0G.A00().ARB(str2);
            }
            if (ARB.A00 != null) {
                AbstractC71443Ii abstractC71443Ii = (AbstractC71443Ii) ARB.A00();
                try {
                    abstractC71443Ii.write(bArr, 0, i);
                    if (abstractC71443Ii.A03() && c25821No.A0H.A04 && z) {
                        C1O8 c1o8 = c25821No.A0I;
                        C14360o3.A0B(str2, 0);
                        if (c1o8.A02 && !c1o8.A03 && (A01 = C1O8.A01(c1o8, str2)) != null) {
                            C1O8.A02(c1o8.A00, c1o8, A01);
                        }
                    }
                    abstractC71443Ii.A02();
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void A0B(C59562nz c59562nz, String str, java.util.Set set) {
        C25821No c25821No = c59562nz.A0c;
        synchronized (c25821No.A0O) {
            if (c59562nz.A0Y == C05F.A0C) {
                A09(c59562nz, str, "CANCELLED", set);
            } else {
                c59562nz.A0B = str;
                set.remove(c59562nz);
                c25821No.A0J.A7h(c59562nz);
                InterfaceC11560jF interfaceC11560jF = c25821No.A0F;
                if (interfaceC11560jF != null) {
                    interfaceC11560jF.Cjl(c59562nz.A0L);
                }
                C25821No.A08(c25821No);
            }
        }
    }

    public final int A0C() {
        C25821No c25821No = this.A0c;
        int abs = Math.abs(c25821No.A0U.get()) + c25821No.A0T.get();
        boolean equals = this.A0N.equals(C26771Rh.A00().A00);
        int i = this.A0W;
        if (equals) {
            return i + abs + 100;
        }
        return i;
    }

    public static InterfaceC59502nt A00(Collection collection) {
        Iterator it = collection.iterator();
        InterfaceC59502nt interfaceC59502nt = null;
        int i = -1;
        while (it.hasNext()) {
            InterfaceC59502nt interfaceC59502nt2 = (InterfaceC59502nt) it.next();
            if (interfaceC59502nt2.BqU() == -1) {
                return interfaceC59502nt2;
            }
            if (interfaceC59502nt2.BqU() > i) {
                i = interfaceC59502nt2.BqU();
                interfaceC59502nt = interfaceC59502nt2;
            }
        }
        return interfaceC59502nt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r2 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(final X.InterfaceC59502nt r8, final X.C59562nz r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59562nz.A03(X.2nt, X.2nz):void");
    }

    public static void A06(final C59562nz c59562nz) {
        c59562nz.A01();
        C25821No c25821No = c59562nz.A0c;
        synchronized (c25821No.A0O) {
            if (c59562nz.A0Y != C05F.A0C && c59562nz.A02 != 0) {
                c25821No.A0Q.remove(c59562nz);
                c25821No.A0S.add(c59562nz);
                InterfaceC14020nS A00 = C14120nc.A00();
                final boolean z = c25821No.A0Z;
                A00.ATO(new AbstractRunnableC14200nk(z) { // from class: X.3To
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59562nz c59562nz2 = C59562nz.this;
                        if (c59562nz2.A0Y == C05F.A00) {
                            c59562nz2.A0Y = C05F.A01;
                        }
                        C25821No c25821No2 = c59562nz2.A0c;
                        C1O2 c1o2 = c25821No2.A0G;
                        ImageUrl imageUrl = c59562nz2.A0L;
                        int i = c59562nz2.A04;
                        int i2 = 0;
                        if (i > 0) {
                            i2 = i + 1;
                        }
                        int i3 = c59562nz2.A0X;
                        C59722oF c59722oF = c59562nz2.A0A;
                        List list = c59562nz2.A0a;
                        String A0L = c25821No2.A0L(imageUrl);
                        C59592o2 c59592o2 = c59562nz2.A0J;
                        int i4 = c25821No2.A0A;
                        C1QY A002 = c59562nz2.A0I.A00();
                        boolean z2 = c25821No2.A0W;
                        InterfaceC11560jF interfaceC11560jF = c25821No2.A0F;
                        boolean z3 = c59562nz2.A0Q;
                        c59562nz2.A06 = new C2DA(c25821No2.A0E, interfaceC11560jF, A002, c1o2, c59562nz2, c25821No2.A0L, c59592o2, c59722oF, c59562nz2.A0K, imageUrl, A0L, "queueTaskToLoadImageFromNetwork", list, i2, i3, i4, z2, z3).A02();
                    }
                });
                C25821No.A08(c25821No);
            } else {
                A09(c59562nz, "network", "CANCELLED", c25821No.A0Q);
            }
        }
    }
}
