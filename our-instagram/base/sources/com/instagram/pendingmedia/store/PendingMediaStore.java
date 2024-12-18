package com.instagram.pendingmedia.store;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC06950Ym;
import X.AbstractC09440dt;
import X.AbstractC12220kQ;
import X.AbstractC13530mf;
import X.AbstractC210079Qv;
import X.AbstractC25651Mw;
import X.AbstractC93564Hx;
import X.AnonymousClass001;
import X.AnonymousClass257;
import X.AnonymousClass485;
import X.C01L;
import X.C05F;
import X.C06090Tz;
import X.C0eM;
import X.C0s6;
import X.C0w9;
import X.C14360o3;
import X.C18920wW;
import X.C18U;
import X.C19270xB;
import X.C1MT;
import X.C218914p;
import X.C25671My;
import X.C47Z;
import X.C49602Pt;
import X.C5JD;
import X.C9EQ;
import X.C9FO;
import X.EnumC220415e;
import X.EnumC40111tc;
import X.EnumC915447k;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC28041Xi;
import X.InterfaceC70363Du;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class PendingMediaStore implements InterfaceC13000lm {
    public C49602Pt A00;
    public boolean A01;
    public InterfaceC12870lZ A02;
    public final C1MT A03;
    public final C25671My A04;
    public final UserSession A05;
    public final Map A06;
    public final Set A07;
    public final Set A08;
    public final Set A09;
    public final InterfaceC09390do A0A;
    public final AtomicBoolean A0C = new AtomicBoolean(true);
    public final C19270xB A0B = new C19270xB("PendingMediaStore");

    public final C47Z A04(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C47Z c47z = (C47Z) this.A06.remove(str);
        if (c47z != null) {
            A0A();
            if ((!str2.equals("Configured")) && (!c47z.A5S || AbstractC210079Qv.A03(c47z))) {
                ((InterfaceC70363Du) this.A0A.getValue()).EHe(c47z, AnonymousClass001.A0R("remove:", str2), 0);
            }
        }
        return c47z;
    }

    public final ArrayList A05(Integer num) {
        C14360o3.A0B(num, 0);
        Collection values = this.A06.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            C47Z c47z = (C47Z) obj;
            if (c47z.A6J == EnumC915447k.A02 || c47z.A5g) {
                if (AbstractC93564Hx.A00(c47z, num) && c47z.A5P) {
                    arrayList.add(obj);
                }
            }
        }
        return AbstractC001800i.A0U(arrayList);
    }

    public final void A0B(final Context context) {
        C14360o3.A0B(context, 0);
        if (this.A0C.compareAndSet(true, false)) {
            A01(context, this);
            InterfaceC12870lZ interfaceC12870lZ = this.A02;
            if (interfaceC12870lZ != null) {
                UserSession userSession = this.A05;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36330720335315947L)) {
                    C218914p.A06(interfaceC12870lZ);
                }
            }
            InterfaceC12870lZ interfaceC12870lZ2 = new InterfaceC12870lZ() { // from class: X.3Kj
                @Override // X.InterfaceC12870lZ
                public final void onAppBackgrounded() {
                    int A03 = C0f9.A03(-1175427390);
                    PendingMediaStore pendingMediaStore = this;
                    Context context2 = context;
                    PendingMediaStore.A01(context2, pendingMediaStore);
                    C14120nc.A00().ATO(new NGI(new OUE(context2, pendingMediaStore.A05, new ArrayList(pendingMediaStore.A06.values()))));
                    C0f9.A0A(-1453176678, A03);
                }

                @Override // X.InterfaceC12870lZ
                public final void onAppForegrounded() {
                    C0f9.A0A(-1464343996, C0f9.A03(465250655));
                }
            };
            C218914p.A03(EnumC220415e.A03, interfaceC12870lZ2);
            this.A02 = interfaceC12870lZ2;
        }
    }

    public final void A0C(EnumC40111tc enumC40111tc, Set set) {
        C14360o3.A0B(enumC40111tc, 0);
        Map map = this.A06;
        C9FO c9fo = new C9FO(44, this, set, enumC40111tc);
        C01L A1I = C0eM.A1I();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Boolean) c9fo.invoke(entry)).booleanValue()) {
                it.remove();
                A1I.add(entry.getValue());
            }
        }
        Iterator<E> it2 = C0eM.A1J(A1I).iterator();
        while (it2.hasNext()) {
            ((InterfaceC70363Du) this.A0A.getValue()).EHe((C47Z) it2.next(), "UnconfiguredMedia", 0);
        }
    }

    public final void A0D(C47Z c47z, String str) {
        C14360o3.A0B(str, 0);
        this.A06.put(str, c47z);
        c47z.A6K = new Runnable() { // from class: X.9Qg
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass257.A00(PendingMediaStore.this.A05).A05();
            }
        };
        this.A04.E4s(new AnonymousClass485(c47z));
        A0A();
    }

    public final synchronized boolean A0E() {
        return this.A01;
    }

    public static final void A01(final Context context, final PendingMediaStore pendingMediaStore) {
        AnonymousClass257.A00(pendingMediaStore.A05).A06(new Runnable() { // from class: X.3Ki
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC14020nS A00 = C14120nc.A00();
                final PendingMediaStore pendingMediaStore2 = pendingMediaStore;
                final Context context2 = context;
                A00.ATO(new AbstractRunnableC14200nk() { // from class: X.48j
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(169, 5, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        File file;
                        File[] listFiles;
                        String str;
                        List list;
                        String str2;
                        List list2;
                        List list3;
                        C5NL A002;
                        List B6F;
                        String str3;
                        final PendingMediaStore pendingMediaStore3 = pendingMediaStore2;
                        Context context3 = context2;
                        final C48k A003 = C48k.A00(context3);
                        C14360o3.A07(A003);
                        UserSession userSession = pendingMediaStore3.A05;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        C18U.A01(c06090Tz, userSession, 36604206673040434L);
                        InterfaceC28041Xi interfaceC28041Xi = new InterfaceC28041Xi() { // from class: X.48q
                            @Override // X.InterfaceC28041Xi
                            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                                boolean containsKey;
                                File file2 = (File) obj;
                                if (file2 != null) {
                                    long currentTimeMillis = System.currentTimeMillis() - (((int) C18U.A01(C06090Tz.A05, pendingMediaStore3.A05, 36604206673040434L)) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                                    if (file2.lastModified() != 0) {
                                        C48k c48k = A003;
                                        String path = file2.getPath();
                                        synchronized (c48k) {
                                            try {
                                                path = new File(path).getCanonicalPath();
                                            } catch (IOException unused) {
                                            }
                                            if (c48k.A03) {
                                                containsKey = c48k.A07.containsKey(path);
                                            } else {
                                                containsKey = true;
                                            }
                                        }
                                        if (!containsKey && file2.lastModified() < currentTimeMillis) {
                                            return true;
                                        }
                                    }
                                }
                                return false;
                            }
                        };
                        java.util.Set set = pendingMediaStore3.A09;
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC23881Ey.A00().AXd(null, 811671523), null, set);
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC916948n.A03(), null, set);
                        File AXd = AbstractC23881Ey.A00().AXd(null, 1559854576);
                        if (AXd.isDirectory()) {
                            PendingMediaStore.A00(interfaceC28041Xi, AXd, null, set);
                        }
                        File file2 = AbstractC916948n.A03;
                        if (file2 == null) {
                            file2 = AbstractC23881Ey.A00().CHo(null, 1460857084);
                            AbstractC916948n.A03 = file2;
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, file2, null, set);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Map map = pendingMediaStore3.A06;
                        for (C47Z c47z : map.values()) {
                            String str4 = c47z.A3V;
                            if (str4 != null) {
                                String name = new File(str4).getName();
                                C14360o3.A07(name);
                                linkedHashSet.add(name);
                            }
                            Iterator it = ((java.util.Set) c47z.A0j.A00).iterator();
                            while (it.hasNext()) {
                                String name2 = new File((String) it.next()).getName();
                                C14360o3.A07(name2);
                                linkedHashSet.add(name2);
                            }
                            String str5 = c47z.A3m;
                            if (str5 != null) {
                                String name3 = new File(str5).getName();
                                C14360o3.A07(name3);
                                linkedHashSet.add(name3);
                            }
                            ClipInfo clipInfo = c47z.A1N;
                            if (clipInfo != null && (str3 = clipInfo.A0F) != null) {
                                String name4 = new File(str3).getName();
                                C14360o3.A07(name4);
                                linkedHashSet.add(name4);
                            }
                            if (((c47z.A0l() && C18U.A06(C06090Tz.A06, userSession, 36323161192541226L)) || C18U.A06(c06090Tz, userSession, 36322426753132780L)) && (list3 = c47z.A4a) != null) {
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    C5NM c5nm = ((C5NJ) it2.next()).A04;
                                    if (c5nm != null && (A002 = c5nm.A00()) != null && (B6F = A002.B6F()) != null) {
                                        Iterator it3 = B6F.iterator();
                                        while (it3.hasNext()) {
                                            String name5 = new File((String) it3.next()).getName();
                                            C14360o3.A07(name5);
                                            linkedHashSet.add(name5);
                                        }
                                    }
                                }
                            }
                            if (C18U.A06(c06090Tz, userSession, 36323942876589776L)) {
                                C115595Kt c115595Kt = c47z.A1P;
                                if (c115595Kt != null && (list2 = (List) c115595Kt.A06.getValue()) != null) {
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        String name6 = new File(((C115475Kh) it4.next()).A0G.A0F).getName();
                                        C14360o3.A07(name6);
                                        linkedHashSet.add(name6);
                                    }
                                }
                                List list4 = c47z.A4J;
                                if (list4 != null) {
                                    Iterator it5 = list4.iterator();
                                    while (it5.hasNext()) {
                                        String str6 = ((C5JD) it5.next()).A0C;
                                        if (str6 != null) {
                                            String name7 = new File(str6).getName();
                                            C14360o3.A07(name7);
                                            linkedHashSet.add(name7);
                                        }
                                    }
                                }
                            }
                        }
                        Iterator it6 = pendingMediaStore3.A08.iterator();
                        while (it6.hasNext()) {
                            String name8 = new File((String) it6.next()).getName();
                            C14360o3.A07(name8);
                            linkedHashSet.add(name8);
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, (File) C1Q3.A01.getValue(), null, linkedHashSet);
                        File A07 = AbstractC916948n.A07();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Iterator it7 = map.values().iterator();
                        while (it7.hasNext()) {
                            ClipInfo clipInfo2 = ((C47Z) it7.next()).A1N;
                            if (clipInfo2 != null && (str2 = clipInfo2.A0F) != null && A07.equals(new File(str2).getParentFile())) {
                                String name9 = new File(str2).getName();
                                C14360o3.A07(name9);
                                linkedHashSet2.add(name9);
                            }
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC916948n.A07(), null, linkedHashSet2);
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        for (C47Z c47z2 : map.values()) {
                            String str7 = c47z2.A2k;
                            if (str7 != null) {
                                String name10 = new File(str7).getName();
                                C14360o3.A07(name10);
                                linkedHashSet3.add(name10);
                            }
                            if (c47z2.A4a != null && (!r0.isEmpty()) && (list = c47z2.A4a) != null) {
                                Iterator it8 = list.iterator();
                                while (it8.hasNext()) {
                                    String str8 = ((C5NJ) it8.next()).A05;
                                    if (str8 != null) {
                                        String name11 = new File(str8).getName();
                                        C14360o3.A07(name11);
                                        linkedHashSet3.add(name11);
                                    }
                                }
                            }
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC917048o.A01(), null, linkedHashSet3);
                        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                        for (C47Z c47z3 : map.values()) {
                            C52W c52w = c47z3.A1L;
                            if (c52w != null && (str = c52w.A01) != null) {
                                String name12 = new File(str).getName();
                                C14360o3.A07(name12);
                                linkedHashSet4.add(name12);
                            }
                            Iterator it9 = c47z3.A1V.A03.iterator();
                            while (it9.hasNext()) {
                                String name13 = new File(((C5JH) it9.next()).A05).getName();
                                C14360o3.A07(name13);
                                linkedHashSet4.add(name13);
                            }
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC916948n.A02(), null, linkedHashSet4);
                        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                        Iterator it10 = map.values().iterator();
                        while (it10.hasNext()) {
                            Iterator it11 = ((C47Z) it10.next()).A1j.A06.iterator();
                            while (it11.hasNext()) {
                                String str9 = ((C51580MqY) it11.next()).A06;
                                if (str9 != null) {
                                    String name14 = new File(str9).getName();
                                    C14360o3.A07(name14);
                                    linkedHashSet5.add(name14);
                                }
                            }
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC916948n.A05(), null, linkedHashSet5);
                        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                        for (C47Z c47z4 : map.values()) {
                            String str10 = c47z4.A33;
                            if (str10 != null) {
                                String name15 = new File(str10).getName();
                                C14360o3.A07(name15);
                                linkedHashSet6.add(name15);
                            }
                            String str11 = c47z4.A3Z;
                            if (str11 != null) {
                                String name16 = new File(str11).getName();
                                C14360o3.A07(name16);
                                linkedHashSet6.add(name16);
                            }
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC916948n.A04(), null, linkedHashSet6);
                        if (C18U.A06(C06090Tz.A06, userSession, 36318058772502390L)) {
                            try {
                                C49602Pt c49602Pt = pendingMediaStore3.A00;
                                if (c49602Pt != null) {
                                    if (c49602Pt.A02()) {
                                        file = c49602Pt.A05;
                                    } else {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } else {
                                    C49602Pt A004 = A0I.A00(context3, userSession);
                                    pendingMediaStore3.A00 = A004;
                                    if (A004.A02()) {
                                        file = A004.A05;
                                    } else {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                }
                                PendingMediaStore.A00(interfaceC28041Xi, file, null, linkedHashSet6);
                            } catch (Exception unused) {
                            }
                        }
                        PendingMediaStore.A00(interfaceC28041Xi, AbstractC23881Ey.A00().CHo(null, 761593505), null, linkedHashSet6);
                        String string = AbstractC23021Ah.A00(userSession).A01.getString("captured_media_recovery_info", "");
                        C14360o3.A07(string);
                        boolean z = true;
                        if (string.length() == 0 || !C18U.A06(c06090Tz, userSession, 36322731696007609L)) {
                            z = false;
                        }
                        if (!z) {
                            File cacheDir = context3.getCacheDir();
                            C14360o3.A07(cacheDir);
                            PendingMediaStore.A02(pendingMediaStore3, "tmp_photo_", ".jpg", PendingMediaStore.A00(interfaceC28041Xi, cacheDir, C48s.A00, linkedHashSet6));
                            PendingMediaStore.A02(pendingMediaStore3, C50472Tr.A01(), ".jpg", PendingMediaStore.A00(interfaceC28041Xi, new File(C50472Tr.A01()), null, linkedHashSet6));
                            if (C18U.A06(c06090Tz, userSession, 36322731696073146L)) {
                                long A005 = PendingMediaStore.A00(interfaceC28041Xi, AbstractC23881Ey.A00().CHo(null, 554767808), null, linkedHashSet6);
                                String path = AbstractC23881Ey.A00().CHo(null, 554767808).getPath();
                                C14360o3.A07(path);
                                PendingMediaStore.A02(pendingMediaStore3, path, ".mp4", A005);
                            }
                        }
                        File cacheDir2 = context3.getCacheDir();
                        C14360o3.A07(cacheDir2);
                        PendingMediaStore.A02(pendingMediaStore3, "story_share_content_", "", PendingMediaStore.A00(interfaceC28041Xi, cacheDir2, C917248t.A00, linkedHashSet6));
                        File cacheDir3 = context3.getCacheDir();
                        C14360o3.A07(cacheDir3);
                        PendingMediaStore.A02(pendingMediaStore3, "direct_share_content_", "", PendingMediaStore.A00(interfaceC28041Xi, cacheDir3, C917348u.A00, linkedHashSet6));
                        List A0a = AbstractC001800i.A0a(map.keySet());
                        C14360o3.A0B(userSession, 1);
                        try {
                            java.util.Set A0k = AbstractC001800i.A0k(A0a);
                            File file3 = new File(context3.getFilesDir(), AnonymousClass001.A0R(userSession.userId, "/pending_media_backup"));
                            if (file3.exists() && (listFiles = file3.listFiles()) != null) {
                                for (File file4 : listFiles) {
                                    if (file4 != null && !A0k.contains(file4.getName())) {
                                        try {
                                            AbstractC13530mf.A01(C35887Ft1.A00, file4.getPath(), null);
                                        } catch (Throwable th) {
                                            new C09540e5(th);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            new C09540e5(th2);
                        }
                        File[] listFiles2 = context3.getFilesDir().listFiles();
                        if (listFiles2 != null) {
                            C0s6 c0s6 = new C0s6(listFiles2);
                            while (c0s6.hasNext()) {
                                File file5 = (File) c0s6.next();
                                String name17 = file5.getName();
                                C14360o3.A07(name17);
                                if (AbstractC002300n.A0h(name17, "pending_media_", false)) {
                                    String name18 = file5.getName();
                                    C14360o3.A07(name18);
                                    if (AbstractC002300n.A0f(name18, ".jpg", false) && !linkedHashSet6.contains(file5.getName()) && interfaceC28041Xi.apply(file5)) {
                                        file5.delete();
                                    }
                                }
                            }
                        }
                    }
                });
            }
        });
    }

    public static final void A02(PendingMediaStore pendingMediaStore, String str, String str2, long j) {
        if (j > 0) {
            C18920wW A01 = AbstractC12220kQ.A01(pendingMediaStore.A0B, pendingMediaStore.A05);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_disk_footprint_reclaimed_space");
            A00.AAP("file_extension", str2);
            A00.AAP("file_path_fragment", str);
            A00.A9K("file_size", Long.valueOf(j));
            A00.AAP("reclaim_type", "deleted");
            A00.AAP("reclaim_zone", "");
            A00.Cht();
        }
    }

    public final C47Z A03(String str) {
        if (str != null) {
            return (C47Z) this.A06.get(str);
        }
        return null;
    }

    public final HashSet A06() {
        HashSet hashSet = new HashSet();
        for (C47Z c47z : this.A06.values()) {
            ShareType A0D = c47z.A0D();
            if (A0D == ShareType.A08 || A0D == ShareType.A0W || A0D == ShareType.A0V) {
                if (c47z.A1f != EnumC915447k.A02) {
                    String str = c47z.A1N.A0F;
                    if (str != null) {
                        hashSet.add(str);
                    }
                    List list = c47z.A4J;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str2 = ((C5JD) it.next()).A0C;
                            if (str2 != null) {
                                hashSet.add(str2);
                            }
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public final List A07() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (C47Z c47z : this.A06.values()) {
            if (c47z.A5S && !c47z.A5R && !c47z.A0u()) {
                if (c47z.A1G != EnumC40111tc.A09) {
                    String str2 = c47z.A33;
                    if (str2 != null) {
                        if (!new File(str2).exists()) {
                            str = "draft file missing on device";
                        }
                    } else {
                        str = "draft missing file path";
                    }
                    C0w9.A03("PendingMediaStore", str);
                    A04(c47z.A35, str);
                }
                arrayList.add(c47z);
            }
        }
        return AbstractC001800i.A0g(arrayList, new Comparator() { // from class: X.93M
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2BS.A00(Long.valueOf(((C47Z) obj).A0g), Long.valueOf(((C47Z) obj2).A0g));
            }
        });
    }

    public final List A08() {
        Collection values = this.A06.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            C47Z c47z = (C47Z) obj;
            if (AbstractC93564Hx.A00(c47z, C05F.A02) && c47z.A0m() && c47z.A6J == EnumC915447k.A02) {
                arrayList.add(obj);
            }
        }
        return AbstractC001800i.A0a(AbstractC001800i.A0g(arrayList, new Comparator() { // from class: X.3MU
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return C2BS.A00(Long.valueOf(((C47Z) obj2).A0g), Long.valueOf(((C47Z) obj3).A0g));
            }
        }));
    }

    public final List A09(Integer num) {
        Collection values = this.A06.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (AbstractC93564Hx.A00((C47Z) obj, num)) {
                arrayList.add(obj);
            }
        }
        return AbstractC001800i.A0a(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1vN] */
    public final void A0A() {
        this.A04.E4s(new Object());
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC12870lZ interfaceC12870lZ;
        A01(this.A05.deviceSession.A06(), this);
        if (!this.A0C.getAndSet(true) && (interfaceC12870lZ = this.A02) != null) {
            C218914p.A06(interfaceC12870lZ);
        }
    }

    public PendingMediaStore(UserSession userSession) {
        this.A05 = userSession;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A06 = concurrentHashMap;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A07 = newSetFromMap;
        Set newSetFromMap2 = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap2);
        this.A08 = newSetFromMap2;
        this.A04 = AbstractC25651Mw.A00(userSession);
        this.A03 = new C1MT() { // from class: X.25C
            @Override // X.C1MT
            public final void F8g() {
                PendingMediaStore pendingMediaStore = PendingMediaStore.this;
                PendingMediaStore.A01(pendingMediaStore.A05.deviceSession.A06(), pendingMediaStore);
            }

            @Override // X.C1MT
            public final void F8h() {
                PendingMediaStore pendingMediaStore = PendingMediaStore.this;
                PendingMediaStore.A01(pendingMediaStore.A05.deviceSession.A06(), pendingMediaStore);
            }
        };
        this.A0A = AbstractC09440dt.A01(new C9EQ(this, 9));
        Collection values = concurrentHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((C47Z) obj).A1G == EnumC40111tc.A0a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C47Z) it.next()).A3w;
            if (str != null) {
                arrayList2.add(str);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A09 = AbstractC001800i.A0k(arrayList2);
    }

    public static final long A00(InterfaceC28041Xi interfaceC28041Xi, File file, FilenameFilter filenameFilter, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (AbstractC001900j.A0a(str, "/", false)) {
                C0w9.A03("not_simple_file_name", AnonymousClass001.A0R("should be simple file name :", str));
            }
        }
        File[] listFiles = file.listFiles(filenameFilter);
        long j = 0;
        if (file.exists() && listFiles != null) {
            HashSet hashSet = new HashSet();
            C0s6 c0s6 = new C0s6(listFiles);
            while (c0s6.hasNext()) {
                File file2 = (File) c0s6.next();
                if (!set.contains(file2.getName())) {
                    j += AbstractC13530mf.A01(interfaceC28041Xi, file2.getPath(), hashSet);
                }
            }
            file.getAbsolutePath();
        }
        return j;
    }
}
