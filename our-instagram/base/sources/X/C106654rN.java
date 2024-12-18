package X;

import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGHttpPriorityContext;
import com.instagram.service.tigon.IGTigonService;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.4rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106654rN {
    public static final IGHttpPriorityContext A00(C1QY c1qy, AbstractC12990ll abstractC12990ll) {
        C42511xf c42511xf;
        UserSession userSession;
        C42411xV A00;
        C4J0 c4j0;
        boolean z;
        int i;
        UserSession userSession2;
        C9BO c9bo;
        C4J0 c4j02;
        C14360o3.A0B(abstractC12990ll, 0);
        EnumC26881Rz A002 = C1S1.A00(c1qy);
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36325248548615092L)) {
            IGTigonService tigonService = IGTigonService.getTigonService(abstractC12990ll);
            ReadWriteLock readWriteLock = IGTigonService.PREFETCH_MAP_LOCK;
            readWriteLock.readLock().lock();
            try {
                c42511xf = tigonService.mPrefetchItemMap;
            } finally {
                readWriteLock.readLock().unlock();
            }
        } else {
            c42511xf = null;
            if ((abstractC12990ll instanceof UserSession) && (userSession = (UserSession) abstractC12990ll) != null && userSession.A05(C42411xV.class) && (A00 = C42411xV.A00(userSession)) != null) {
                c42511xf = A00.A0C;
            }
        }
        String str = "";
        boolean z2 = false;
        boolean z3 = false;
        if (c42511xf != null) {
            int ordinal = c1qy.A09.ordinal();
            if (ordinal != 3 && ordinal != 2) {
                if (ordinal == 1 && (c4j02 = c1qy.A0A) != null) {
                    String str2 = c4j02.A07;
                    if (c42511xf.A01(str2) != null) {
                        z2 = true;
                    }
                    str = c42511xf.A03(str2);
                    z3 = Boolean.valueOf(z2);
                }
            } else {
                C59602o3 c59602o3 = c1qy.A08;
                if (c59602o3 != null) {
                    String A003 = c59602o3.A00();
                    if (c42511xf.A00(A003) != null) {
                        z2 = true;
                    }
                    str = c42511xf.A02(A003);
                    z3 = Boolean.valueOf(z2);
                }
            }
        }
        C09530e4 c09530e4 = new C09530e4(z3, str);
        boolean booleanValue = ((Boolean) c09530e4.A00).booleanValue();
        String str3 = (String) c09530e4.A01;
        String str4 = C26771Rh.A00().A00;
        Integer num = null;
        if (C20150ym.A07(AbstractC20100yh.A00(36325248547107752L)) && (abstractC12990ll instanceof UserSession) && (userSession2 = (UserSession) abstractC12990ll) != null) {
            C42981yQ A004 = AbstractC42951yN.A00(userSession2);
            C42611xp c42611xp = new C42611xp(userSession2);
            if (AbstractC16830sb.A07(EnumC23341Bw.Image, EnumC23341Bw.Video).contains(c1qy.A09)) {
                DRQ drq = new DRQ(c1qy, 0);
                String str5 = C26771Rh.A00().A00;
                C14360o3.A07(str5);
                C93144Fq A02 = A004.A02(c42611xp.A01(str5), str5, drq);
                if (A02 != null && A02.hasNext() && (c9bo = (C9BO) C93144Fq.A00(A02, true).A01) != null) {
                    num = Integer.valueOf(c9bo.A00);
                }
            }
        }
        C59602o3 c59602o32 = c1qy.A08;
        if ((c59602o32 != null && c59602o32.A01) || ((c4j0 = c1qy.A0A) != null && c4j0.A05)) {
            z = true;
        } else {
            z = false;
        }
        C106654rN c106654rN = IGHttpPriorityContext.Companion;
        int i2 = A002.A00;
        C1Ef A005 = c1qy.A00();
        C14360o3.A07(A005);
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        boolean z4 = false;
        if (c42511xf == null) {
            z4 = true;
        }
        return new IGHttpPriorityContext(i2, A005, str3, booleanValue, str4, z, i, z4);
    }
}
