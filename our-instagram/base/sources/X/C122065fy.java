package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122065fy extends C1P1 {
    public final /* synthetic */ BanyanCoordinator A00;

    public C122065fy(BanyanCoordinator banyanCoordinator) {
        this.A00 = banyanCoordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.1vN] */
    private final void A00(C122045fw c122045fw) {
        int i;
        boolean z;
        C121395ef A02;
        C121395ef A022;
        List list;
        try {
            BanyanCoordinator banyanCoordinator = this.A00;
            ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (writeLock.tryLock(1L, timeUnit)) {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock2 = banyanCoordinator.A0L;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock2.readLock();
                    int i2 = 0;
                    if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock2.getReadHoldCount();
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                    writeLock2.lock();
                    try {
                        HashMap hashMap = banyanCoordinator.A0K;
                        if (!hashMap.isEmpty()) {
                            Iterator it = c122045fw.A03.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (C14360o3.A0K(((C121395ef) it.next()).A03, "direct_ibc_inbox_invitations")) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (!c122045fw.A03.isEmpty() && ((C121395ef) c122045fw.A03.get(0)).A02 != null) {
                                C122025fu A00 = AbstractC122015ft.A00(banyanCoordinator.A0I);
                                String str = ((C121395ef) c122045fw.A03.get(0)).A02;
                                if (str != null) {
                                    List A03 = new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str);
                                    if (!A03.isEmpty()) {
                                        ListIterator listIterator = A03.listIterator(A03.size());
                                        while (listIterator.hasPrevious()) {
                                            if (((String) listIterator.previous()).length() != 0) {
                                                list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    list = C16930sl.A00;
                                    String str2 = ((String[]) list.toArray(new String[0]))[0];
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it2 = c122045fw.A03.iterator();
                                    while (it2.hasNext()) {
                                        String str3 = ((C121395ef) it2.next()).A03;
                                        if (str3 != null) {
                                            arrayList.add(str3);
                                        }
                                    }
                                    A00.A01(str2, c122045fw.A01(), (String[]) arrayList.toArray(new String[0]), false);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            C121395ef A002 = c122045fw.A00("direct_ibc_nullstate");
                            if (A002 != null) {
                                UserSession userSession = banyanCoordinator.A0I;
                                C2041791n.A00((C2041791n) userSession.A01(C2041791n.class, new C37058GUs(userSession, 43)), A002.A02, "banyan_response_received", A002.A04.size());
                            }
                            UserSession userSession2 = banyanCoordinator.A0I;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            boolean A06 = C18U.A06(c06090Tz, userSession2, 36315937058525011L);
                            boolean A062 = C18U.A06(c06090Tz, userSession2, 36317496132441370L);
                            double A003 = C18U.A00(c06090Tz, userSession2, 37161921062633650L);
                            try {
                            } catch (InterruptedException e) {
                                C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
                            }
                            if (reentrantReadWriteLock.writeLock().tryLock(1L, timeUnit)) {
                                try {
                                    C5e8 c5e8 = banyanCoordinator.A07;
                                    c5e8.A02.A00();
                                    for (String str4 : c5e8.A07.keySet()) {
                                        if (C14360o3.A0K(str4, "direct_user_search_nullstate") || C14360o3.A0K(str4, "direct_user_search_keypressed")) {
                                            C121395ef A004 = c122045fw.A00(str4);
                                            if (A004 != null && (A022 = c5e8.A02(str4)) != null) {
                                                if (A062) {
                                                    float f = 0.0f;
                                                    for (Object obj : A004.A04.values()) {
                                                        C14360o3.A07(obj);
                                                        if (((C121415eh) obj).A00 == 0.0d) {
                                                            f += 1.0f;
                                                        }
                                                    }
                                                    if (f / A004.A04.values().size() > A003) {
                                                        c122045fw.A03.remove(A004);
                                                        c122045fw.A03.add(A022);
                                                    }
                                                }
                                                if (A06) {
                                                    ADK.A00(A022, A004);
                                                    c122045fw.A03.remove(A004);
                                                    c122045fw.A03.add(A004);
                                                } else {
                                                    c122045fw.A03.add(A022);
                                                    c122045fw.A04.add(str4);
                                                }
                                            }
                                        }
                                    }
                                    reentrantReadWriteLock.writeLock().unlock();
                                    if (z && c122045fw.A00("direct_ibc_inbox_invitations") == null && (A02 = banyanCoordinator.A07.A02("direct_ibc_inbox_invitations")) != null) {
                                        A02.A04 = new HashMap();
                                        A02.A01 = System.currentTimeMillis() + A02.A00;
                                    }
                                    C5e8 c5e82 = banyanCoordinator.A07;
                                    c5e82.A03(c122045fw);
                                    C006802i c006802i = C006802i.A0p;
                                    if (c5e82.A02("reshare_share_sheet") != null) {
                                        c006802i.markerPoint(145755797, "BANYAN_RESHARE_SHEET_RESPONSE_PARSED");
                                    }
                                    C121395ef A023 = c5e82.A02("direct_ibc_nullstate");
                                    if (A023 != null) {
                                        C2041791n.A00((C2041791n) userSession2.A01(C2041791n.class, new C37058GUs(userSession2, 43)), A023.A02, "banyan_response_parsed", A023.A04.size());
                                    }
                                    C121325eV A005 = AbstractC121315eU.A00(userSession2);
                                    C121125e6 c121125e6 = c5e82.A02;
                                    c121125e6.A00();
                                    ArrayList arrayList2 = new ArrayList(c5e82.A07.values());
                                    C121335eW c121335eW = A005.A00;
                                    if (c121335eW != null) {
                                        C121325eV.A02(null, "disk_persist_banyan_start", arrayList2);
                                        c121335eW.A00.add("banyan");
                                    }
                                    C124055jK c124055jK = new C124055jK(banyanCoordinator, "banyan");
                                    c121125e6.A00();
                                    C5e8.A00(c5e82, c124055jK);
                                    if (z) {
                                        AbstractC25651Mw.A00(userSession2).E4s(new Object());
                                    }
                                    Iterator it3 = hashMap.keySet().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        Object next = it3.next();
                                        C14360o3.A07(next);
                                        java.util.Set set = (java.util.Set) next;
                                        if (!c122045fw.A03.isEmpty() && AbstractC001800i.A0u(set, ((C121395ef) c122045fw.A03.get(0)).A03)) {
                                            hashMap.remove(set);
                                            break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    reentrantReadWriteLock.writeLock().unlock();
                                    throw th;
                                }
                            } else {
                                throw new InterruptedException("Failed to claim lock after 1 seconds");
                            }
                        }
                        banyanCoordinator.A02 = null;
                        reentrantReadWriteLock.writeLock().unlock();
                    } finally {
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock2.unlock();
                    }
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
        } catch (InterruptedException e2) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (r0 >= r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        r17.lock();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        r16.unlock();
     */
    /* JADX WARN: Finally extract failed */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r19) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122065fy.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(503888526);
        BanyanCoordinator banyanCoordinator = this.A00;
        if (banyanCoordinator.A02 != null) {
            C121325eV A00 = AbstractC121315eU.A00(banyanCoordinator.A0I);
            if (A00.A00 == null) {
                C121325eV.A01(A00);
            }
            C121335eW c121335eW = A00.A00;
            if (c121335eW != null) {
                c121335eW.A03 = true;
                C006802i.A0p.markerPoint(135806945, "banyan_fetch_start");
            }
        }
        C0f9.A0A(398734232, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1697356403);
        C122045fw c122045fw = (C122045fw) obj;
        int A032 = C0f9.A03(1937769772);
        C14360o3.A0B(c122045fw, 0);
        if (!C18U.A06(C06090Tz.A05, this.A00.A0I, 36312217615860743L)) {
            A00(c122045fw);
        }
        C0f9.A0A(745767349, A032);
        C0f9.A0A(-1697671386, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(879259491);
        C122045fw c122045fw = (C122045fw) obj;
        int A032 = C0f9.A03(-304816237);
        C14360o3.A0B(c122045fw, 0);
        if (!c122045fw.A03.isEmpty()) {
            C121325eV A00 = AbstractC121315eU.A00(this.A00.A0I);
            List list = c122045fw.A03;
            C121335eW c121335eW = A00.A00;
            if (c121335eW != null) {
                c121335eW.A03 = false;
                C121325eV.A02(true, "banyan_fetch_end", list);
                C121325eV.A00(A00);
            }
        }
        if (C18U.A06(C06090Tz.A05, this.A00.A0I, 36312217615860743L)) {
            A00(c122045fw);
        }
        C0f9.A0A(379969795, A032);
        C0f9.A0A(819503917, A03);
    }
}
