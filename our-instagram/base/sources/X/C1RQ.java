package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1RQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RQ {
    public static C1RQ A03;
    public C0g7 A00;
    public final Context A01;
    public final AtomicBoolean A02;

    public final boolean A05(EnumC27091Ti enumC27091Ti) {
        return C0g3.A00().A01(AbstractC10100gN.A00(enumC27091Ti.A00)) == C05F.A0C;
    }

    public final boolean A07(EnumC27091Ti enumC27091Ti) {
        C26711Ra A00 = C26711Ra.A00(this.A01);
        int andIncrement = A00.A04.getAndIncrement();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            c006802i.markerStart(15335444, andIncrement);
            c006802i.markerAnnotate(15335444, andIncrement, "module_name", enumC27091Ti.A00);
            c006802i.markerAnnotate(15335444, andIncrement, "built_in", false);
            c006802i.markerAnnotate(15335444, andIncrement, "google", A00.A05);
        }
        String str = enumC27091Ti.A00;
        try {
            A00.A03.A03(str);
            if (c006802i != null) {
                c006802i.markerEnd(15335444, andIncrement, (short) 2);
            }
        } catch (IOException unused) {
            if (c006802i != null) {
                c006802i.markerEnd(15335444, andIncrement, (short) 3);
            }
            C0w9.A03("Downloadable Module", AnonymousClass001.A0R(str, "%s module loading failed"));
        }
        if (A06(enumC27091Ti)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0xV] */
    public static C1RQ A00() {
        String str;
        C18C.A07(A03, "Must call setInstance() first");
        C1RQ c1rq = A03;
        synchronized (c1rq) {
            AtomicBoolean atomicBoolean = c1rq.A02;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                Context context = c1rq.A01;
                c1rq.A00 = new C0g7(context, C1U4.A00(context), new C09970fz(context), new Object() { // from class: X.0xV
                });
                C07470aM.A00(context, new InterfaceC08830cm() { // from class: X.1UL
                    @Override // X.InterfaceC08830cm
                    public final Object get() {
                        return C0w9.A01;
                    }
                });
                try {
                    C0g7 c0g7 = c1rq.A00;
                    synchronized (c0g7) {
                        try {
                            if (!c0g7.A00) {
                                HashSet hashSet = new HashSet();
                                C1UI c1ui = c0g7.A02;
                                C1UM A00 = c1ui.A00("AppModules::Uninstall");
                                if (A00.getSize() > 0) {
                                    C0g3.A00().A06(c0g7.A01);
                                    int i = 0;
                                    do {
                                        String moduleName = AbstractC09930fu.getModuleName(i);
                                        if (A00.getBoolean(moduleName, false)) {
                                            hashSet.add(moduleName);
                                        }
                                        i++;
                                    } while (i < 103);
                                }
                                Context context2 = c0g7.A01;
                                HashSet A002 = AbstractC09980gA.A00(context2);
                                hashSet.removeAll(A002);
                                C0g7.A00(c0g7, hashSet, A002);
                                if (!hashSet.isEmpty()) {
                                    C1UP c1up = (C1UP) c1ui.A00("AppModules::Uninstall");
                                    C1UP.A03(c1up);
                                    C1ZT c1zt = new C1ZT(c1up);
                                    C1UP c1up2 = (C1UP) c1ui.A00("AppModules::UninstallInitialRequestTime");
                                    C1UP.A03(c1up2);
                                    C1ZT c1zt2 = new C1ZT(c1up2);
                                    C1UP c1up3 = (C1UP) c1ui.A00("AppModules::UninstallLastFinishTime");
                                    C1UP.A03(c1up3);
                                    C1ZT c1zt3 = new C1ZT(c1up3);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        c1zt3.A08(str2, currentTimeMillis);
                                        c1zt.A06(str2);
                                        c1zt2.A06(str2);
                                    }
                                    c1zt3.A0B();
                                    c1zt.A0B();
                                    c1zt2.A0B();
                                }
                                C09970fz c09970fz = c0g7.A03;
                                Pattern compile = Pattern.compile(AnonymousClass001.A0g("^(\\w+[\\w\\.]*)", "_", "(\\p{XDigit}*)$"));
                                File file = c09970fz.A01;
                                String[] strArr = {"lib-zstd", "lib-xzs"};
                                String[] list = file.list();
                                if (list != null) {
                                    for (String str3 : list) {
                                        Matcher matcher = compile.matcher(str3);
                                        if (matcher.find() && matcher.groupCount() == 2) {
                                            matcher.group(1);
                                            str = matcher.group(2);
                                        } else {
                                            str = null;
                                        }
                                        if ("0".equals(str)) {
                                            int i2 = 0;
                                            do {
                                                File file2 = new File(file, AnonymousClass001.A0g(str3, File.separator, strArr[i2]));
                                                if (file2.exists()) {
                                                    C09970fz.A00(file2);
                                                }
                                                i2++;
                                            } while (i2 < 2);
                                        }
                                    }
                                }
                                java.util.Set<String> keySet = c1ui.A00("AppModules::ScheduledInstallRequestTimestamp").Aax().keySet();
                                ArrayList arrayList = new ArrayList();
                                for (String str4 : keySet) {
                                    if (AbstractC09930fu.A00(str4) == -1 || AbstractC10000gD.A01(context2, str4)) {
                                        arrayList.add(str4);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    C1UP c1up4 = (C1UP) c1ui.A00("AppModules::ScheduledInstallRequestTimestamp");
                                    C1UP.A03(c1up4);
                                    C1ZT c1zt4 = new C1ZT(c1up4);
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        c1zt4.A06((String) it2.next());
                                    }
                                    c1zt4.A0B();
                                }
                            }
                            c0g7.A00 = true;
                        } finally {
                        }
                    }
                } catch (IOException e) {
                    throw new IllegalStateException("Failed to initialize", e);
                }
            }
        }
        return A03;
    }

    public static boolean A01(AbstractC12990ll abstractC12990ll, MTD mtd) {
        MTF mtf;
        C11T.A05("Waiting on ui thread will cause an ANR");
        MTG mtg = (MTG) abstractC12990ll.A01(MTG.class, new MTH());
        synchronized (mtg) {
            mtf = (MTF) mtg.A00.get(Integer.valueOf(mtd.A00));
        }
        if (mtf != null) {
            try {
                try {
                    C58428Pv7 c58428Pv7 = mtf.A06;
                    AbstractC58432PvB.A00(c58428Pv7, mtd.A01);
                    mtf.A00();
                    if (c58428Pv7.A06()) {
                        if (mtf.A01(true)) {
                            return true;
                        }
                        Exception A032 = c58428Pv7.A03();
                        if (A032 == null) {
                            if (c58428Pv7.A04() != null && ((C124725kd) c58428Pv7.A04()).A01 != null) {
                                throw new RuntimeException(((C124725kd) c58428Pv7.A04()).A01);
                            }
                            if (c58428Pv7.A04() != null && !((C124725kd) c58428Pv7.A04()).A03) {
                                throw new RuntimeException(AnonymousClass001.A0R("The result of executing downloading voltron module task is unsuccessful. Voltron Download Code is ", String.valueOf(((C124725kd) c58428Pv7.A04()).A00)));
                            }
                        } else {
                            throw new RuntimeException(A032.toString());
                        }
                    } else {
                        C006802i.A0p.markerPoint(34668546, mtf.A07.A00, "time_out");
                    }
                } catch (InterruptedException e) {
                    C0K8.A0G("IgDownloadableModulesPluginImpl", "Interrupted while waiting for download", e);
                    throw e;
                }
            } catch (Throwable th) {
                mtf.A00();
                throw th;
            }
        }
        return false;
    }

    public final File A02(String str) {
        File A01 = C26711Ra.A00(this.A01).A03.A01(str);
        if (A01 != null && A01.exists()) {
            return A01;
        }
        throw new RuntimeException(AnonymousClass001.A0R("No downloaded module file found for ", str));
    }

    public final void A03(final AbstractC12990ll abstractC12990ll, final MTD mtd) {
        MTF mtf;
        Context context = this.A01;
        C1TY c1ty = (C1TY) abstractC12990ll.A01(C1TY.class, new C48142Jb(context.getApplicationContext(), abstractC12990ll));
        SystemClock.elapsedRealtime();
        C58422Pv0 CsF = c1ty.CsF(MTE.A00(mtd));
        List list = mtd.A05;
        int size = list.size();
        String[] strArr = new String[size];
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            strArr[i] = ((EnumC27091Ti) list.get(i)).A00;
        }
        for (int i2 = 0; i2 < size; i2++) {
            String str = strArr[i2];
            if (str != null && !str.startsWith("d_")) {
                CsF.A06.add(str);
            }
        }
        C58428Pv7 A01 = CsF.A01();
        MTG mtg = (MTG) abstractC12990ll.A01(MTG.class, new MTH());
        list.get(0);
        synchronized (mtg) {
            mtf = new MTF(context, A01, mtd);
            mtg.A00.put(Integer.valueOf(mtd.A00), mtf);
        }
        InterfaceC191378do interfaceC191378do = mtd.A03;
        if (interfaceC191378do != null) {
            MTD mtd2 = mtf.A07;
            if (MTE.A00(mtd2) == C05F.A00 && mtd2.A02 != null) {
                synchronized (MTF.A09) {
                    PN4 pn4 = new PN4(mtf);
                    MTF.A08 = pn4;
                    mtf.A05.postDelayed(pn4, 200L);
                }
            }
        }
        A01.A05(new MTI(this, mtf), new ExecutorC14040nU(C14120nc.A00(), 141, 3, false, false));
        if (interfaceC191378do != null) {
            final AbstractRunnableC14200nk abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.86f
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(142, 3, false, true);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AbstractC12990ll abstractC12990ll2 = AbstractC12990ll.this;
                        MTD mtd3 = mtd;
                        if (C1RQ.A01(abstractC12990ll2, mtd3)) {
                            Iterator it = mtd3.A05.iterator();
                            while (it.hasNext()) {
                                C0g3.A00().A05(((EnumC27091Ti) it.next()).A00, C05F.A0C);
                            }
                        }
                    } catch (Exception e) {
                        C0K8.A0L("IgDownloadableModulesPluginImpl", "Interrupted while waiting for download. %s", e, e);
                    }
                }
            };
            if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36316216231989397L)) {
                InterfaceC24811Iz interfaceC24811Iz = AbstractC24641Ih.A02;
                final int i3 = abstractRunnableC14200nk.runnableId;
                interfaceC24811Iz.Ep8(new AbstractC18280vF(i3) { // from class: X.9jm
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        abstractRunnableC14200nk.run();
                    }
                });
                return;
            }
            C14120nc.A00().ATO(abstractRunnableC14200nk);
        }
    }

    public final void A04(AbstractC12990ll abstractC12990ll, MTD mtd) {
        boolean z = false;
        if (mtd.A03 == null) {
            z = true;
        }
        C18C.A0H(z, "Don't use this function with a callback");
        A01(abstractC12990ll, mtd);
    }

    public C1RQ(Context context) {
        this.A02 = new AtomicBoolean();
        this.A01 = context.getApplicationContext();
    }

    public final boolean A06(EnumC27091Ti enumC27091Ti) {
        return C0g3.A00().A07(enumC27091Ti.A00);
    }

    public C1RQ() {
    }
}
