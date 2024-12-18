package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7FG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FG {
    public MessageIdentifier A00;
    public final Context A01;
    public final UserSession A02;
    public final C7FA A03;
    public final C7FF A04;
    public final PendingMediaStore A05;
    public final C7FH A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final ConcurrentHashMap A09;

    public C7FG(Context context, UserSession userSession, C7FA c7fa, C7FF c7ff, PendingMediaStore pendingMediaStore) {
        C14360o3.A0B(pendingMediaStore, 3);
        C14360o3.A0B(c7ff, 4);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = pendingMediaStore;
        this.A04 = c7ff;
        this.A03 = c7fa;
        this.A07 = AbstractC09440dt.A01(new C206949Dz(this, 48));
        this.A08 = AbstractC09440dt.A01(new C206949Dz(this, 49));
        this.A09 = new ConcurrentHashMap();
        this.A06 = new C7FH(context);
        AbstractC13880nE.A0E(context);
    }

    private final void A03(C26086BgF c26086BgF, Long l, List list, boolean z, boolean z2) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C45029JwK) it.next()).A03) {
                    C14120nc.A00().ATO(new KMS(c26086BgF, this, l, list, z, z2));
                    return;
                }
            }
        }
        A02(c26086BgF, this, l, list, z, z2);
    }

    public final void A04(C26086BgF c26086BgF, MediaUploadMetadata mediaUploadMetadata, C211689Zc c211689Zc, C47Z c47z, C183978Ee c183978Ee, Long l, String str, String str2, ConcurrentLinkedQueue concurrentLinkedQueue, int i, int i2, boolean z) {
        String str3;
        String str4;
        C14360o3.A0B(concurrentLinkedQueue, 2);
        if (str2 != null && str2.length() != 0) {
            c183978Ee.A0k = str2;
        }
        MediaUploadMetadata mediaUploadMetadata2 = null;
        if (str2 != null) {
            AbstractC224309vG A00 = AbstractC178007vZ.A00(null, this.A02, str2, true);
            if (A00 != null) {
                str3 = A00.A02();
                str4 = A00.A03();
            } else {
                str3 = null;
                str4 = null;
            }
            mediaUploadMetadata.A00(new MediaUploadMetadata(null, str3, null, null, null, null, C197098ne.A05(str2), str4, null, null, null, false));
        }
        c183978Ee.A01().A00(mediaUploadMetadata);
        MediaUploadMetadata A01 = c183978Ee.A01();
        if (c47z != null) {
            mediaUploadMetadata2 = c47z.A13;
        }
        A01.A01(mediaUploadMetadata2);
        if (str2 != null) {
            c183978Ee.A01().A01(C9L8.A03(this.A02, str2));
        }
        if (i != -1) {
            concurrentLinkedQueue.offer(new C09530e4(Integer.valueOf(i), new KQJ(c47z, c183978Ee)));
            A01(c26086BgF, this, l, str, concurrentLinkedQueue);
            return;
        }
        C11T.A02(new M7E(c26086BgF, this, c211689Zc, c47z, c183978Ee, l, i2, z));
    }

    public final void A06(C26086BgF c26086BgF, MessageIdentifier messageIdentifier, C211689Zc c211689Zc, Long l, List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 0);
        LI5 A00 = AbstractC46750Km7.A00(this.A02);
        LI5.A01(A00, new C57249PbX(list.size(), 25, A00));
        A05(c26086BgF, messageIdentifier, c211689Zc, l, list, z, z2);
    }

    private final void A00(C26086BgF c26086BgF, Medium medium, C211689Zc c211689Zc, C47Z c47z, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue, int i, int i2, boolean z, boolean z2) {
        C09530e4 c09530e4;
        String str2 = medium.A0X;
        if (z2) {
            UserSession userSession = this.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            int A01 = (int) C18U.A01(c06090Tz, userSession, 36611538182215969L);
            int A012 = (int) C18U.A01(c06090Tz, userSession, 36611538182281506L);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str2, options);
            Integer valueOf = Integer.valueOf(options.outWidth);
            Integer valueOf2 = Integer.valueOf(options.outHeight);
            int intValue = valueOf.intValue();
            int intValue2 = valueOf2.intValue();
            int i3 = A012;
            if (intValue > intValue2) {
                i3 = A01;
            }
            if (i3 == A01) {
                A01 = A012;
            }
            c09530e4 = new C09530e4(Integer.valueOf(i3), Integer.valueOf(A01));
        } else {
            c09530e4 = new C09530e4(0, 0);
        }
        int intValue3 = ((Number) c09530e4.A00).intValue();
        int intValue4 = ((Number) c09530e4.A01).intValue();
        String str3 = medium.A0X;
        Context context = this.A01;
        UserSession userSession2 = this.A02;
        C24184Ao7 c24184Ao7 = new C24184Ao7(c26086BgF, medium, this, c211689Zc, c47z, l, str, concurrentLinkedQueue, i, i2, z2, z);
        C14360o3.A0B(str3, 0);
        AbstractC209669Pc.A05(context, userSession2, new C221699qY(str3, intValue3, intValue4), c24184Ao7);
    }

    public static final void A01(C26086BgF c26086BgF, C7FG c7fg, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        if (str != null) {
            ConcurrentHashMap concurrentHashMap = c7fg.A09;
            AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(str);
            if (atomicInteger != null && atomicInteger.decrementAndGet() == 0) {
                C11T.A02(new M6K(c26086BgF, c7fg, l, concurrentLinkedQueue));
                concurrentHashMap.remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (X.C14360o3.A0K(r1, "replayable") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C26086BgF r38, com.instagram.model.direct.messageid.MessageIdentifier r39, X.C211689Zc r40, java.lang.Long r41, java.util.List r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7FG.A05(X.BgF, com.instagram.model.direct.messageid.MessageIdentifier, X.9Zc, java.lang.Long, java.util.List, boolean, boolean):void");
    }

    public static final void A02(C26086BgF c26086BgF, C7FG c7fg, Long l, List list, boolean z, boolean z2) {
        String BcF;
        C47Z A03;
        String valueOf = String.valueOf(C0HN.A00());
        c7fg.A09.put(valueOf, new AtomicInteger(list.size()));
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C45029JwK c45029JwK = (C45029JwK) it.next();
            if (c45029JwK.A03) {
                C14120nc.A00().ATO(new C45723KMa(c26086BgF, c45029JwK.A00, c45029JwK, c7fg, null, c45029JwK.A01, l, valueOf, concurrentLinkedQueue, i, list.size(), z));
            } else {
                Medium medium = c45029JwK.A00;
                C47Z c47z = c45029JwK.A01;
                int size = list.size();
                C7FF c7ff = c7fg.A04;
                C183978Ee Bcn = c7ff.Bcn(medium.A05);
                if (Bcn != null && Bcn.A12 == z2 && (BcF = c7ff.BcF(AbstractC46923Kp4.A00(Bcn))) != null && (A03 = c7fg.A05.A03(BcF)) != null) {
                    if (i != -1) {
                        concurrentLinkedQueue.offer(new C09530e4(Integer.valueOf(i), new KQJ(A03, Bcn)));
                        A01(c26086BgF, c7fg, l, valueOf, concurrentLinkedQueue);
                    } else {
                        C11T.A02(new M73(c26086BgF, c7fg, A03, Bcn, l, size, z));
                    }
                } else {
                    c7fg.A00(c26086BgF, medium, null, c47z, l, valueOf, concurrentLinkedQueue, i, list.size(), z, z2);
                }
            }
            i = i2;
        }
    }
}
