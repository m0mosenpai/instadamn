package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.264, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass264 implements InterfaceC449925e {
    public final long A00;
    public final ReentrantReadWriteLock A01;
    public final C01U A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public /* synthetic */ AnonymousClass264(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        long A01 = C18U.A01(c06090Tz, userSession, 36600177993256703L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318703016483239L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36318703016614312L);
        this.A00 = A01;
        this.A03 = A06;
        this.A04 = A062;
        this.A02 = new C01U();
        this.A01 = new ReentrantReadWriteLock();
    }

    public final void A00(C9CJ c9cj) {
        int i;
        if (this.A03) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A01;
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
                C01U c01u = this.A02;
                c01u.addLast(c9cj);
                if (c01u.size() > this.A00) {
                    c01u.removeFirst();
                }
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        ReentrantReadWriteLock.ReadLock readLock = this.A01.readLock();
        readLock.lock();
        try {
            C01U<C9CJ> c01u = this.A02;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(c01u, 10));
            for (C9CJ c9cj : c01u) {
                arrayList.add(AnonymousClass001.A11(c9cj.A02, ": ", c9cj.A01, ": ", c9cj.A00));
            }
            String join = TextUtils.join("\n", arrayList);
            C14360o3.A07(join);
            return join;
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "ar_logs";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ArEffectsLogCollector";
    }
}
