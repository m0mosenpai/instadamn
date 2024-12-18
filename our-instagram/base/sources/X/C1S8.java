package X;

import android.os.Handler;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.iface.TigonRequest;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1S8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1S8 extends C1S9 {
    public int A00;
    public boolean A01;
    public final C1SG A02;
    public final Handler A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1S8(C1Bs c1Bs, C23301Br c23301Br, TigonXplatService tigonXplatService, TigonRequest tigonRequest, IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, CacheBehaviorLogger cacheBehaviorLogger, C26511Qg c26511Qg, C1QW c1qw, C1QY c1qy, AbstractC12990ll abstractC12990ll, C1CT[] c1ctArr) {
        super(c1Bs, c23301Br, tigonXplatService, tigonRequest, iGTigonQuickPerformanceLogger, cacheBehaviorLogger, c26511Qg, c1qw, c1qy, abstractC12990ll, c1ctArr, false);
        C14360o3.A0B(cacheBehaviorLogger, 7);
        C14360o3.A0B(c1ctArr, 8);
        this.A02 = new C1SG(new C1SF(tigonXplatService));
        this.A03 = new Handler(C1CG.A00());
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onBody(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        this.A00 += byteBuffer.remaining();
        if (!this.A01) {
            this.A01 = true;
        }
        C1SG c1sg = this.A02;
        ReentrantLock reentrantLock = c1sg.A04;
        reentrantLock.lock();
        try {
            c1sg.A02.add(byteBuffer);
            c1sg.A03.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onEOM(InterfaceC74743Xi interfaceC74743Xi) {
        C14360o3.A0B(interfaceC74743Xi, 0);
        C1SG c1sg = this.A02;
        ReentrantLock reentrantLock = c1sg.A04;
        reentrantLock.lock();
        try {
            c1sg.A01 = true;
            c1sg.A03.signalAll();
            reentrantLock.unlock();
            A0G(new C9F8(22, interfaceC74743Xi, this));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onError(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi) {
        C14360o3.A0B(tigonError, 0);
        C14360o3.A0B(interfaceC74743Xi, 1);
        C1SG c1sg = this.A02;
        IOException iOException = new IOException(tigonError.analyticsDetail);
        ReentrantLock reentrantLock = c1sg.A04;
        reentrantLock.lock();
        try {
            c1sg.A00 = iOException;
            c1sg.A03.signalAll();
            reentrantLock.unlock();
            A0G(new C9FP(9, tigonError, this, interfaceC74743Xi));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onFirstByteFlushed(long j) {
        A0G(new C207039Ei(this, j, 3));
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onLastByteAcked(long j, long j2) {
        A0G(new C207059Ek(this, 0, j, j2));
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onResponse(C9BO c9bo) {
        C14360o3.A0B(c9bo, 0);
        A0G(new C9F8(23, c9bo, this));
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onUploadProgress(long j, long j2) {
        A0G(new C207059Ek(this, 1, j, j2));
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onWillRetry(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi) {
        C14360o3.A0B(tigonError, 0);
        C14360o3.A0B(interfaceC74743Xi, 1);
        A0G(new C9FP(10, tigonError, this, interfaceC74743Xi));
    }

    @Override // X.C1S9
    public final int A0D() {
        return this.A00;
    }

    @Override // X.C1S9, com.facebook.tigon.TigonCallbacks
    public final void onHeaderBytesReceived(long j, long j2) {
        A0G(new B60(this, j, j2));
    }

    public static final /* synthetic */ void A00(C9BO c9bo, C1S8 c1s8) {
        super.onResponse(c9bo);
    }

    public static final /* synthetic */ void A03(InterfaceC74743Xi interfaceC74743Xi, C1S8 c1s8) {
        super.onEOM(interfaceC74743Xi);
    }

    public static final /* synthetic */ void A01(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi, C1S8 c1s8) {
        super.onError(tigonError, interfaceC74743Xi);
    }

    public static final /* synthetic */ void A02(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi, C1S8 c1s8) {
        super.onWillRetry(tigonError, interfaceC74743Xi);
    }
}
