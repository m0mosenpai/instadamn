package X;

import com.facebook.systrace.Systrace;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* renamed from: X.1Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26471Qc implements InterfaceC26481Qd, InterfaceC26491Qe {
    public C26501Qf A00;
    public C3JX A01;
    public final Semaphore A02;
    public final C24531Hw A03;
    public final java.net.URI A04;
    public final BlockingQueue A05;

    public C26471Qc(C24531Hw c24531Hw, java.net.URI uri) {
        this.A04 = uri;
        this.A03 = c24531Hw;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.A05 = linkedBlockingQueue;
        this.A00 = new C26501Qf(linkedBlockingQueue);
        this.A02 = new Semaphore(0, true);
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        String str;
        C14360o3.A0B(iOException, 0);
        C24531Hw c24531Hw = this.A03;
        if (Systrace.A0E(1L)) {
            C0fO.A01("StreamingHttpRequestTask.onFailed", -1915736919);
        }
        try {
            if (iOException.getMessage() != null) {
                str = iOException.getMessage();
                if (str == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                str = "no_error_message";
            }
            InterfaceC151096rC interfaceC151096rC = c24531Hw.A00;
            if (interfaceC151096rC != null) {
                interfaceC151096rC.Cj9(str);
            }
            C24531Hw.A00(new C115095Ie(iOException), c24531Hw);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1971137279);
            }
            this.A02.release();
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(891483136);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        this.A05.add(byteBuffer);
        C3JX c3jx = this.A01;
        if (c3jx != null) {
            this.A03.A03(c3jx);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.3JY, X.3JX] */
    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        C26501Qf c26501Qf;
        C14360o3.A0B(c3jq, 0);
        int i = c3jq.A01;
        String str = c3jq.A02;
        int i2 = c3jq.A00;
        List unmodifiableList = Collections.unmodifiableList(c3jq.A03);
        C14360o3.A07(unmodifiableList);
        ?? c3jy = new C3JY(str, unmodifiableList, i, i2);
        this.A01 = c3jy;
        c3jy.A00 = this;
        C24531Hw c24531Hw = this.A03;
        if (Systrace.A0E(1L)) {
            C0fO.A01("StreamingHttpRequestTask.onResponseStarted", 1468726463);
        }
        try {
            InterfaceC26481Qd interfaceC26481Qd = c3jy.A00;
            C14360o3.A0C(interfaceC26481Qd, "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpService.StreamingResponseBody");
            C26471Qc c26471Qc = (C26471Qc) interfaceC26481Qd;
            if (c26471Qc != null) {
                c26501Qf = c26471Qc.A00;
            } else {
                c26501Qf = null;
            }
            c24531Hw.A02 = c26501Qf;
            if (!c24531Hw.A0B) {
                Iterator it = c24531Hw.A05.iterator();
                while (it.hasNext()) {
                    InterfaceC24551Hy interfaceC24551Hy = (InterfaceC24551Hy) it.next();
                    InterfaceC26451Qa interfaceC26451Qa = c24531Hw.A01;
                    if (interfaceC26451Qa == null) {
                        C14360o3.A0F("action");
                        throw C00O.createAndThrow();
                    }
                    interfaceC24551Hy.Dgo(interfaceC26451Qa, c3jy);
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1610903241);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-497591372);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        C26501Qf c26501Qf = this.A00;
        if (!c26501Qf.hasNext() && !c26501Qf.A01.isEmpty()) {
            BlockingQueue blockingQueue = this.A05;
            byte[] bytes = "\n".getBytes(C15W.A05);
            C14360o3.A07(bytes);
            blockingQueue.add(ByteBuffer.wrap(bytes));
        }
        final C3JX c3jx = this.A01;
        if (c3jx != null) {
            final C24531Hw c24531Hw = this.A03;
            if (Systrace.A0E(1L)) {
                C0fO.A01("StreamingHttpRequestTask.onComplete", -1419480535);
            }
            try {
                c24531Hw.A03(c3jx);
                InterfaceC151096rC interfaceC151096rC = c24531Hw.A00;
                if (interfaceC151096rC != null) {
                    interfaceC151096rC.Clw();
                }
                C11T.A02(new Runnable() { // from class: X.3qL
                    @Override // java.lang.Runnable
                    public final void run() {
                        C24531Hw c24531Hw2 = C24531Hw.this;
                        C3JX c3jx2 = c3jx;
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("StreamingHttpRequestTask.onComplete", 2083656444);
                        }
                        try {
                            if (!c24531Hw2.A0B) {
                                Iterator it = c24531Hw2.A05.iterator();
                                while (it.hasNext()) {
                                    InterfaceC24551Hy interfaceC24551Hy = (InterfaceC24551Hy) it.next();
                                    InterfaceC26451Qa interfaceC26451Qa = c24531Hw2.A01;
                                    if (interfaceC26451Qa == null) {
                                        C14360o3.A0F("action");
                                        throw C00O.createAndThrow();
                                    }
                                    interfaceC24551Hy.D6Z(interfaceC26451Qa, c3jx2);
                                }
                            }
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(1100513340);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-1027097029);
                            }
                            throw th;
                        }
                    }
                });
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1289413260);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1320975315);
                }
                throw th;
            }
        }
        this.A02.release();
    }

    @Override // X.InterfaceC26481Qd
    public final void AIH() {
        throw new UnsupportedOperationException("use getByteStreamIterator()");
    }

    @Override // X.InterfaceC26481Qd
    public final long AJp() {
        throw new UnsupportedOperationException("use getByteStreamIterator()");
    }

    @Override // X.InterfaceC26481Qd
    public final InputStream AjT() {
        throw new UnsupportedOperationException("use getByteStreamIterator()");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("use getByteStreamIterator()");
    }
}
