package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6VU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VU implements C6VV {
    public final QuickPerformanceLogger A00;
    public final LF9 A01;
    public final C72064XMi A02;
    public final C72065XMj A03;
    public final XF4 A04;
    public final Executor A05;
    public final Executor A06;
    public final ExecutorService A07;

    /* JADX WARN: Type inference failed for: r1v2, types: [X.LF9, java.lang.Object] */
    public C6VU(QuickPerformanceLogger quickPerformanceLogger, C72064XMi c72064XMi, C1341564a c1341564a, UserSession userSession, String str) {
        LruCache lruCache;
        JT0 jt0;
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        C43667JSz c43667JSz = new C43667JSz(userSession, A00);
        C43666JSy c43666JSy = new C43666JSy();
        C25821No A002 = C25821No.A00();
        C14360o3.A07(A002);
        C43661JSt c43661JSt = new C43661JSt(c1341564a, A002, str);
        ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 498, 3, false, false);
        int i = c1341564a.A00;
        if (i > 0) {
            lruCache = new LruCache(i);
        } else {
            lruCache = null;
        }
        if (C18U.A06(C06090Tz.A05, C1341564a.A00(c1341564a), 36310770213847313L)) {
            jt0 = new JT0();
        } else {
            jt0 = null;
        }
        AbstractC43664JSw abstractC43664JSw = new AbstractC43664JSw(lruCache, jt0, c43666JSy, c43667JSz, c43661JSt, executorC14040nU);
        ExecutorC14040nU executorC14040nU2 = new ExecutorC14040nU(C14120nc.A00(), 499, 3, false, false);
        Executor executor = C6T2.A01;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        C14360o3.A0B(executor, 3);
        ?? obj = new Object();
        C72065XMj c72065XMj = new C72065XMj();
        this.A04 = abstractC43664JSw;
        this.A05 = executorC14040nU2;
        this.A06 = executor;
        this.A00 = quickPerformanceLogger;
        this.A07 = newSingleThreadExecutor;
        this.A02 = c72064XMi;
        this.A01 = obj;
        this.A03 = c72065XMj;
    }

    public final ListenableFuture A03(XP9 xp9, C43658JSq c43658JSq, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ) {
        BVA bva;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(c43658JSq, 2);
        try {
            LruCache lruCache = ((AbstractC43664JSw) this.A04).A00;
            if (lruCache != null && (bva = (BVA) lruCache.get(Integer.valueOf(c43658JSq.hashCode()))) != null) {
                return new C25191Kx(A00(xp9, bva));
            }
        } catch (C53401Njq e) {
            C0K8.A0H("ShowreelNativeKeyframesDrawableProviderBase", "Create Keyframes drawable from cache failed", e);
        }
        return AbstractRunnableC133325zz.A01(new MZY(xp9, c43658JSq, this, str2, interfaceC16820sZ), AbstractC43664JSw.A01(xp9, c43658JSq, (AbstractC43664JSw) this.A04, str, str2, str3, false), this.A05);
    }

    @Override // X.C6VV
    public final ListenableFuture AUu(C9CK c9ck, XP9 xp9, C6PU c6pu) {
        C14360o3.A0B(c9ck, 0);
        C14360o3.A0B(c6pu, 1);
        return XOv.A00(new XP2(c9ck, xp9, c6pu, this));
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.68q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.68V, java.lang.Object] */
    public static final C66199U3p A00(XP9 xp9, BVA bva) {
        List<AbstractC56612iu> list;
        List list2;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        C66198U3o c66198U3o = null;
        for (C44237Jgh c44237Jgh : bva.A00) {
            C14360o3.A0A(c44237Jgh);
            C14360o3.A0B(c44237Jgh, 2);
            xp9.DaP();
            try {
                ?? obj = new Object();
                ByteBuffer wrap = ByteBuffer.wrap(c44237Jgh.A04);
                C14360o3.A07(wrap);
                AbstractC56582ir A00 = obj.A00(wrap);
                for (Map.Entry entry : c44237Jgh.A03.entrySet()) {
                    String str = (String) entry.getKey();
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    try {
                        Map map = A00.A02;
                        if (map != null && (list = (List) map.get(str)) != null && !list.isEmpty()) {
                            for (AbstractC56612iu abstractC56612iu : list) {
                                int i = abstractC56612iu.A0L;
                                if (i >= 0) {
                                    C141566aZ c141566aZ = A00.A01;
                                    if (c141566aZ != null && (list2 = c141566aZ.A00) != null) {
                                        AbstractC56602it abstractC56602it = ((C1349268q) list2.get(i)).A01;
                                        ?? obj2 = new Object();
                                        obj2.A01 = abstractC56602it;
                                        obj2.A00 = bitmap;
                                        list2.add(obj2);
                                        abstractC56612iu.A0L = list2.size() - 1;
                                    } else {
                                        throw new IllegalArgumentException("No bitmaps in asset");
                                    }
                                } else {
                                    throw new IllegalArgumentException("Not a bitmap layer");
                                }
                            }
                        } else {
                            throw new IllegalArgumentException(AnonymousClass001.A0R("no layers found for tag:", str));
                        }
                    } catch (IllegalArgumentException e) {
                        Integer num = C05F.A0u;
                        ImmutableMap immutableMap = RegularImmutableMap.A02;
                        C14360o3.A07(immutableMap);
                        xp9.DnK(immutableMap, num, "Animation initialisation error");
                        xp9.DaO(e);
                        throw new C53401Njq("Mutate bitmap failed", e);
                    }
                }
                xp9.DaQ();
                try {
                    AnonymousClass693 anonymousClass693 = new AnonymousClass693(A00);
                    anonymousClass693.ABF(true);
                    C66198U3o c66198U3o2 = new C66198U3o(anonymousClass693, c44237Jgh.A00, c44237Jgh.A01, c44237Jgh.A02, bva.A03);
                    if (c66198U3o == null) {
                        c66198U3o = c66198U3o2;
                    } else {
                        builder.add((Object) c66198U3o2);
                    }
                } catch (C40U e2) {
                    throw new C53401Njq(AnonymousClass001.A0R("KeyframesException: ", e2.getMessage()), null);
                } catch (NullPointerException e3) {
                    throw new C53401Njq(AnonymousClass001.A0R("SN_NPE: ", e3.getMessage()), null);
                }
            } catch (C40U e4) {
                Integer num2 = C05F.A15;
                ImmutableMap immutableMap2 = RegularImmutableMap.A02;
                C14360o3.A07(immutableMap2);
                xp9.DnK(immutableMap2, num2, "Document decode error");
                xp9.DaO(e4);
                throw new C53401Njq("Create Keyframes document failed", e4);
            }
        }
        if (c66198U3o != null) {
            ImmutableList build = builder.build();
            C14360o3.A07(build);
            return new C66199U3p(c66198U3o, build, bva.A01, bva.A02);
        }
        throw new C53401Njq("There should be at least one Keyframes document", null);
    }

    public static final void A01(C9CK c9ck, XP0 xp0, XP9 xp9, XP3 xp3, C6PU c6pu, C6VU c6vu, Throwable th, int i) {
        boolean z;
        MHX mhx;
        if (i > 0) {
            z = true;
            xp9.ClD(LF9.A00(th), c6vu.A01.A01(th), i);
            mhx = new MHX(i, 0, xp9, c6vu, th);
        } else {
            z = false;
            xp9.DgF();
            mhx = null;
        }
        ListenableFuture A03 = c6vu.A03(xp9, (C43658JSq) c9ck.A00, c9ck.A03, c9ck.A02, c9ck.A01, mhx);
        xp0.A01.add(A03);
        C2OD.A03(new C73445YDo(c9ck, xp0, xp9, xp3, c6pu, c6vu, th, i, z), A03, c6vu.A06);
    }

    public final void A04(final BCY bcy, C65750TtP c65750TtP, C6PU c6pu) {
        ListenableFuture A02;
        C9H8 c9h8 = c6pu.A00;
        final C9HB c9hb = new C9HB(c6pu);
        c9hb.DgF();
        String str = c9h8.A05;
        String str2 = c65750TtP.A08;
        C43658JSq c43658JSq = c65750TtP.A00;
        String str3 = c65750TtP.A05;
        C14360o3.A0B(str, 0);
        AbstractC43664JSw abstractC43664JSw = (AbstractC43664JSw) this.A04;
        LruCache lruCache = abstractC43664JSw.A00;
        if (lruCache != null && lruCache.get(Integer.valueOf(c43658JSq.hashCode())) != null) {
            A02 = C25191Kx.A01;
        } else {
            ListenableFuture A01 = AbstractC43664JSw.A01(c9hb, c43658JSq, abstractC43664JSw, str, str2, str3, true);
            final C25103B8z c25103B8z = C25103B8z.A00;
            A02 = AbstractRunnableC133325zz.A02(new C2n2(c25103B8z) { // from class: X.9HD
                public final /* synthetic */ InterfaceC16660sJ A00;

                {
                    C14360o3.A0B(c25103B8z, 1);
                    this.A00 = c25103B8z;
                }

                @Override // X.C2n2
                public final /* synthetic */ Object apply(Object obj) {
                    return this.A00.invoke(obj);
                }
            }, A01, abstractC43664JSw.A04);
        }
        final C65048Tcd c65048Tcd = C65048Tcd.A00;
        C2OD.A03(new C2JL() { // from class: X.9HE
            @Override // X.C2JL
            public final void onFailure(Throwable th) {
                C14360o3.A0B(th, 0);
                boolean z = th instanceof CancellationException;
                C9HB c9hb2 = C9HB.this;
                if (z) {
                    c9hb2.Dfl();
                } else {
                    c9hb2.Dfv(th);
                }
                bcy.DaE(th);
            }

            @Override // X.C2JL
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C9HB.this.A02.A03();
                bcy.DaF();
            }
        }, AbstractRunnableC133325zz.A01(new InterfaceC133315zy(c65048Tcd) { // from class: X.JT5
            public final /* synthetic */ InterfaceC16660sJ A00;

            {
                C14360o3.A0B(c65048Tcd, 1);
                this.A00 = c65048Tcd;
            }

            @Override // X.InterfaceC133315zy
            public final /* synthetic */ ListenableFuture ABq(Object obj) {
                return (ListenableFuture) this.A00.invoke(obj);
            }
        }, A02, this.A05), C1M8.A01);
    }

    public final C6PU A02(C65750TtP c65750TtP, boolean z) {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        String str = c65750TtP.A08;
        String str2 = c65750TtP.A07;
        C43658JSq c43658JSq = c65750TtP.A00;
        String str3 = c43658JSq.A02;
        C14360o3.A06(str3);
        String str4 = c65750TtP.A05;
        if (str4 == null) {
            str4 = "";
        }
        C9H8 c9h8 = new C9H8(obj, str, str2, str3, str4, c43658JSq.A01.length());
        Integer num = null;
        Integer num2 = null;
        String str5 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean valueOf = Boolean.valueOf(z);
        Integer num5 = c65750TtP.A02;
        if (num5 != null) {
            num = num5;
        }
        Integer num6 = c65750TtP.A01;
        if (num6 != null) {
            num2 = num6;
        }
        Integer num7 = c65750TtP.A03;
        if (num7 != null) {
            num3 = num7;
        }
        Integer num8 = c65750TtP.A04;
        if (num8 != null) {
            num4 = num8;
        }
        String str6 = c65750TtP.A06;
        if (str6 != null) {
            str5 = str6;
        }
        return new C6PU(c9h8, this.A00, new C9HA(valueOf, num, num2, num3, num4, str5), this.A07);
    }
}
