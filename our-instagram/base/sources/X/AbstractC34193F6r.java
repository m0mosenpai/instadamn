package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.F6r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34193F6r {
    public static final void A00(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        int i;
        AbstractC167017dG.A1N(userSession, directThreadKey);
        C2DU c2du = (C2DU) AbstractC28761aE.A00(userSession);
        C4GV A0P = c2du.A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            if (AbstractC167007dF.A1Z(c81663kb.A05)) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A1T = null;
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb.A01;
                synchronized (c80693iy) {
                    c80693iy.A1T = null;
                }
            }
            c2du.FCS(directThreadKey);
        }
        String str2 = directThreadKey.A00;
        if (str2 != null) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0L("direct_v2/threads/%s/dismiss_suggestion/%s/", str2, str);
            C1GJ.A03(AbstractC31177DnL.A0Q(A0c));
        }
    }
}
