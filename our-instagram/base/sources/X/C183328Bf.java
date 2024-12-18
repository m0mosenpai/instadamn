package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183328Bf {
    public C23002ACb A00;
    public final UserSession A01;
    public final C183378Bk A02;
    public final C183298Bb A03;
    public final TreeSet A04;
    public final Context A05;
    public final C183348Bh A06;

    public C183328Bf(Context context, C07X c07x, UserSession userSession, C8Ba c8Ba, C8Ba c8Ba2, C183298Bb c183298Bb) {
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c183298Bb, 4);
        this.A05 = context;
        this.A01 = userSession;
        this.A03 = c183298Bb;
        this.A06 = AbstractC183338Bg.A00(userSession);
        final C206989Ed c206989Ed = new C206989Ed(this, 18);
        this.A04 = new TreeSet(new Comparator() { // from class: X.8Bi
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Number) InterfaceC16620sF.this.invoke(obj, obj2)).intValue();
            }
        });
        this.A02 = AbstractC183368Bj.A00(context, userSession);
        c183298Bb.A02(c8Ba, c8Ba2);
        c183298Bb.A04.A06(c07x, new C151846sU(new InterfaceC58362lv() { // from class: X.8Bm
            /* JADX WARN: Type inference failed for: r14v1, types: [X.0ps, java.lang.Object] */
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C115475Kh c115475Kh;
                AbstractC223899uY c219449ms;
                InterfaceC16820sZ c207229Fb;
                AbstractC189198Zo abstractC189198Zo = (AbstractC189198Zo) obj;
                C183328Bf c183328Bf = C183328Bf.this;
                C14360o3.A0A(abstractC189198Zo);
                if (abstractC189198Zo instanceof C189228Zw) {
                    C189228Zw c189228Zw = (C189228Zw) abstractC189198Zo;
                    c115475Kh = c189228Zw.A01;
                    InterfaceC16620sF interfaceC16620sF = c189228Zw.A02;
                    C8Ba c8Ba3 = c189228Zw.A00;
                    String str = (String) new C206899Du(c8Ba3, 49).invoke(c115475Kh);
                    C183298Bb c183298Bb2 = c183328Bf.A03;
                    HashMap hashMap = c183298Bb2.A09;
                    Object obj2 = hashMap.get(str);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        hashMap.put(str, obj2);
                    }
                    ((AbstractCollection) obj2).add(interfaceC16620sF);
                    C207419Fu c207419Fu = new C207419Fu(str, c183328Bf, 0);
                    int intValue = ((Number) c8Ba3.A05.invoke(c115475Kh)).intValue();
                    C14360o3.A0B(c115475Kh, 0);
                    int abs = (int) (c115475Kh.A09 * Math.abs(c115475Kh.A00));
                    int i = 0;
                    while (true) {
                        if (i >= intValue) {
                            i = intValue - 1;
                            break;
                        }
                        InterfaceC16620sF interfaceC16620sF2 = c8Ba3.A07;
                        int i2 = i + 1;
                        if (Math.abs(((Number) interfaceC16620sF2.invoke(Integer.valueOf(i), c115475Kh)).intValue() - abs) <= Math.abs(((Number) interfaceC16620sF2.invoke(Integer.valueOf(i2), c115475Kh)).intValue() - abs)) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                    int intValue2 = ((Number) c8Ba3.A07.invoke(Integer.valueOf(i), c115475Kh)).intValue();
                    C14360o3.A0B(str, 0);
                    Object obj3 = c183298Bb2.A08.get(new C206369Bt(str, intValue2, 2));
                    if (obj3 != null) {
                        interfaceC16620sF.invoke(obj3, str);
                        return;
                    } else {
                        c219449ms = C219459mt.A00;
                        c207229Fb = new B67(c183328Bf, c8Ba3, c115475Kh, str, interfaceC16620sF, c207419Fu, intValue2);
                    }
                } else {
                    if (abstractC189198Zo instanceof C189248Zz) {
                        C115475Kh c115475Kh2 = ((C189248Zz) abstractC189198Zo).A00;
                        if (!AbstractC115515Kl.A05(c115475Kh2)) {
                            TreeSet treeSet = c183328Bf.A04;
                            Iterator it = treeSet.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                C23002ACb c23002ACb = (C23002ACb) next;
                                if (C14360o3.A0K(c23002ACb.A00, C219459mt.A00) && C14360o3.A0K(c23002ACb.A01, c115475Kh2)) {
                                    if (next != null) {
                                        treeSet.remove(next);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (abstractC189198Zo instanceof C189258a0) {
                        C115475Kh c115475Kh3 = ((C189258a0) abstractC189198Zo).A00;
                        C183298Bb c183298Bb3 = c183328Bf.A03;
                        C8Ba A00 = c183298Bb3.A00();
                        if (c115475Kh3 != null) {
                            TreeSet treeSet2 = c183328Bf.A04;
                            AnonymousClass016.A17(treeSet2, B9R.A00);
                            int intValue3 = ((Number) A00.A05.invoke(c115475Kh3)).intValue();
                            String str2 = (String) new C206899Du(A00, 49).invoke(c115475Kh3);
                            boolean z = false;
                            for (int i3 = 0; i3 < intValue3; i3++) {
                                int intValue4 = ((Number) A00.A07.invoke(Integer.valueOf(i3), c115475Kh3)).intValue();
                                C14360o3.A0B(str2, 0);
                                if (c183298Bb3.A08.get(new C206369Bt(str2, intValue4, 2)) == null) {
                                    C23002ACb c23002ACb2 = new C23002ACb(new C219439mr(intValue4), c115475Kh3, new B64(c183328Bf, A00, c115475Kh3, str2, intValue4));
                                    if (!c23002ACb2.equals(c183328Bf.A00) && treeSet2.add(c23002ACb2)) {
                                        C183328Bf.A00(c183328Bf);
                                    }
                                    z = true;
                                }
                            }
                            if (!z) {
                                c183298Bb3.A07.A0B(c183298Bb3.A08);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (abstractC189198Zo instanceof C189188Zn) {
                        C84B c84b = ((C189188Zn) abstractC189198Zo).A00;
                        C8Ba A002 = c183328Bf.A03.A00();
                        Iterator it2 = C17s.A0C(0, c84b.A01.size()).iterator();
                        while (it2.hasNext()) {
                            C115475Kh c115475Kh4 = (C115475Kh) c84b.A04(((AbstractC16880sg) it2).A00());
                            if (c115475Kh4 != null && !AbstractC115515Kl.A05(c115475Kh4)) {
                                final int intValue5 = ((Number) A002.A07.invoke(0, c115475Kh4)).intValue();
                                C09530e4 c09530e4 = (C09530e4) A002.A06.invoke(c115475Kh4);
                                ((Number) c09530e4.A00).intValue();
                                int intValue6 = ((Number) c09530e4.A01).intValue();
                                final C183378Bk c183378Bk = c183328Bf.A02;
                                String A0E = c115475Kh4.A0E();
                                C14360o3.A0B(A0E, 0);
                                final C115475Kh A003 = AbstractC54870OOf.A00(A0E);
                                final C209059Mn c209059Mn = new C209059Mn(intValue6);
                                UserSession userSession2 = c183378Bk.A01;
                                C14360o3.A0B(userSession2, 0);
                                final boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36317371577013362L);
                                final ?? obj4 = new Object();
                                if (!A06) {
                                    try {
                                        obj4.A00 = C183378Bk.A00(c209059Mn, c183378Bk, A003, intValue5);
                                    } catch (IOException unused) {
                                    }
                                }
                                Object obj5 = obj4.A00;
                                if (obj5 == null || !((File) obj5).exists()) {
                                    C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9jO
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(94, 3, false, false);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            File file;
                                            if (A06) {
                                                try {
                                                    file = C183378Bk.A00(c209059Mn, c183378Bk, A003, intValue5);
                                                } catch (IOException unused2) {
                                                    return;
                                                }
                                            } else {
                                                Object obj6 = obj4.A00;
                                                if (obj6 != null) {
                                                    file = (File) obj6;
                                                } else {
                                                    throw AbstractC166997dE.A0g();
                                                }
                                            }
                                            if (!file.exists()) {
                                                C183378Bk.A02(c209059Mn, c183378Bk, A003, file, intValue5);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        return;
                    }
                    if (abstractC189198Zo instanceof C221599qO) {
                        C221599qO c221599qO = (C221599qO) abstractC189198Zo;
                        c115475Kh = c221599qO.A01;
                        int i4 = c221599qO.A00;
                        InterfaceC16620sF interfaceC16620sF3 = c221599qO.A02;
                        C8Ba A004 = c183328Bf.A03.A00();
                        c219449ms = new C219449ms(i4);
                        c207229Fb = new C207229Fb(c183328Bf, c115475Kh, A004, interfaceC16620sF3, i4, 0);
                    } else {
                        if (abstractC189198Zo instanceof C221609qP) {
                            c183328Bf.A04.clear();
                            return;
                        }
                        throw new RuntimeException();
                    }
                }
                C23002ACb c23002ACb3 = new C23002ACb(c219449ms, c115475Kh, c207229Fb);
                if (!c23002ACb3.equals(c183328Bf.A00) && c183328Bf.A04.add(c23002ACb3)) {
                    C183328Bf.A00(c183328Bf);
                }
            }
        }));
        AbstractC18560vj.A03(C07Y.A00(c07x), new C15340po(new C206629Ct(this, null, 20), c183298Bb.A0A));
    }

    public static final void A00(C183328Bf c183328Bf) {
        C183348Bh c183348Bh;
        Long valueOf;
        if (c183328Bf.A00 == null) {
            C05A c05a = c183328Bf.A03.A0A;
            if (((Boolean) c05a.getValue()).booleanValue()) {
                TreeSet treeSet = c183328Bf.A04;
                if (!treeSet.isEmpty()) {
                    C23002ACb c23002ACb = (C23002ACb) treeSet.pollFirst();
                    c183328Bf.A00 = c23002ACb;
                    if (c23002ACb != null) {
                        c23002ACb.A02.invoke();
                    }
                }
            }
            if (c183328Bf.A04.isEmpty()) {
                c183348Bh = c183328Bf.A06;
                Long l = c183348Bh.A0E;
                if (l != null) {
                    long longValue = l.longValue();
                    AHF ahf = new AHF(c183348Bh.A0J);
                    ahf.A01 = longValue;
                    ahf.A02();
                } else {
                    return;
                }
            } else {
                boolean booleanValue = ((Boolean) c05a.getValue()).booleanValue();
                c183348Bh = c183328Bf.A06;
                if (!booleanValue) {
                    Long l2 = c183348Bh.A0E;
                    if (l2 == null) {
                        return;
                    }
                    long longValue2 = l2.longValue();
                    AHF ahf2 = new AHF(c183348Bh.A0J);
                    ahf2.A01 = longValue2;
                    ahf2.A03("view scope ended");
                } else {
                    if (c183348Bh.A0E != null) {
                        return;
                    }
                    valueOf = Long.valueOf(c183348Bh.A0J.A01("video_track_thumbnail_request", 17643603).A01());
                    c183348Bh.A0E = valueOf;
                }
            }
            valueOf = null;
            c183348Bh.A0E = valueOf;
        }
    }

    public static final void A01(C183328Bf c183328Bf, C8Ba c8Ba, C115475Kh c115475Kh, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, final int i, boolean z, boolean z2) {
        C183378Bk c183378Bk;
        int i2;
        int i3;
        boolean z3;
        C09530e4 c09530e4 = (C09530e4) c8Ba.A06.invoke(c115475Kh);
        final int intValue = ((Number) c09530e4.A00).intValue();
        final int intValue2 = ((Number) c09530e4.A01).intValue();
        if (!z && Build.VERSION.SDK_INT >= 30) {
            C183378Bk c183378Bk2 = c183328Bf.A02;
            String A0E = c115475Kh.A0E();
            Bitmap.Config config = c8Ba.A03;
            C23872AhR c23872AhR = new C23872AhR(c183328Bf, c8Ba, c115475Kh, str, interfaceC16820sZ, interfaceC16620sF, interfaceC16620sF2, i, false);
            C14360o3.A0B(A0E, 0);
            C14360o3.A0B(config, 4);
            C115475Kh A00 = AbstractC54870OOf.A00(A0E);
            if (z2) {
                z3 = true;
                c183378Bk = c183378Bk2;
                i2 = i;
                i3 = intValue2;
            } else {
                c183378Bk = c183378Bk2;
                i2 = i;
                i3 = intValue2;
                z3 = false;
            }
            C183378Bk.A01(config, c23872AhR, c183378Bk, A00, i2, intValue, i3, z3);
            return;
        }
        final C183378Bk c183378Bk3 = c183328Bf.A02;
        String A0E2 = c115475Kh.A0E();
        final Bitmap.Config config2 = c8Ba.A03;
        final C23872AhR c23872AhR2 = new C23872AhR(c183328Bf, c8Ba, c115475Kh, str, interfaceC16820sZ, interfaceC16620sF, interfaceC16620sF2, i, z);
        C14360o3.A0B(A0E2, 0);
        C14360o3.A0B(config2, 4);
        final C115475Kh A002 = AbstractC54870OOf.A00(A0E2);
        final C209059Mn c209059Mn = new C209059Mn(intValue2);
        try {
            final File A003 = C183378Bk.A00(c209059Mn, c183378Bk3, A002, i);
            A003.exists();
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9jV
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(94, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap A004;
                    C115475Kh c115475Kh2 = A002;
                    File file = A003;
                    int i4 = i;
                    int i5 = intValue;
                    int i6 = intValue2;
                    Bitmap.Config config3 = config2;
                    C209059Mn c209059Mn2 = c209059Mn;
                    InterfaceC25187BCk interfaceC25187BCk = c23872AhR2;
                    if (!file.exists()) {
                        C115525Km c115525Km = c115475Kh2.A0G;
                        Point A005 = c209059Mn2.A00(new Point(c115525Km.A09, c115525Km.A05));
                        try {
                            if (AbstractC115515Kl.A05(c115475Kh2)) {
                                String str2 = c115475Kh2.A0G.A0I;
                                if (str2 != null) {
                                    A004 = C1NC.A0E(str2, A005.x, A005.y);
                                }
                                AbstractC12120kG.A09("VideoFrameStore", AnonymousClass001.A0R("retrieveSyncFrame from image fails. path: ", c115475Kh2.A0G.A0I), null);
                            } else {
                                A004 = AMI.A00(config3, A005, AbstractC166987dD.A11(c115475Kh2.A0G.A0F), TimeUnit.MICROSECONDS.convert(i4, TimeUnit.MILLISECONDS));
                            }
                            if (A004 != null) {
                                AMI.A04(A004, new FileOutputStream(file));
                            }
                            AbstractC12120kG.A09("VideoFrameStore", AnonymousClass001.A0R("retrieveSyncFrame from image fails. path: ", c115475Kh2.A0G.A0I), null);
                        } catch (Throwable th) {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("could not generate thumbnail for video from ");
                            A1C.append(AbstractC166987dD.A11(c115475Kh2.A0G.A0F));
                            A1C.append(" at frame time: ");
                            A1C.append(i4);
                            AbstractC12120kG.A09("VideoFrameStore", A1C.toString(), th);
                        }
                    }
                    C11T.A02(new RunnableC24665Avz(AMI.A01(config3, file, i5, i6), interfaceC25187BCk));
                }
            });
        } catch (IOException unused) {
            c23872AhR2.DIT();
        }
    }
}
