package X;

import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonXplatBodyProvider;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.concurrent.Executor;
import org.apache.http.HttpEntity;
import org.apache.http.entity.InputStreamEntity;

/* renamed from: X.1SH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1SH extends TigonXplatBodyProvider {
    public final InterfaceC26421Px A00;
    public final Executor A01;

    public C1SH(InterfaceC26421Px interfaceC26421Px, Executor executor) {
        C14360o3.A0B(executor, 2);
        this.A00 = interfaceC26421Px;
        this.A01 = executor;
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public final void beginStream(final TigonBodyStream tigonBodyStream) {
        C14360o3.A0B(tigonBodyStream, 0);
        Executor executor = this.A01;
        final InterfaceC26421Px interfaceC26421Px = this.A00;
        executor.execute(C0SX.A00(new Runnable(tigonBodyStream, this, interfaceC26421Px) { // from class: X.1TX
            public HttpEntity A00;
            public final TigonBodyStream A01;
            public final /* synthetic */ C1SH A02;

            {
                C14360o3.A0B(interfaceC26421Px, 3);
                this.A02 = this;
                this.A01 = tigonBodyStream;
                try {
                    this.A00 = new InputStreamEntity(interfaceC26421Px.E2i(), interfaceC26421Px.getContentLength());
                } catch (IOException e) {
                    this.A01.reportError(new TigonError(TigonErrorCode.FATAL_ERROR, "IGTigonBodyProviderDomain", 0, e.toString()));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    HttpEntity httpEntity = this.A00;
                    if (httpEntity != null) {
                        C1SH c1sh = this.A02;
                        TigonBodyStream tigonBodyStream2 = this.A01;
                        long contentLength = c1sh.A00.getContentLength();
                        if (contentLength > 2147483647L) {
                            contentLength = 2147483647L;
                        }
                        tigonBodyStream2.reportBodyLength((int) contentLength);
                        C27211Tv c27211Tv = new C27211Tv(tigonBodyStream2, c1sh);
                        httpEntity.writeTo(c27211Tv);
                        int i = c27211Tv.A00;
                        if (i > 0 && 1 == c27211Tv.A02.transferBytes(c27211Tv.A03, i)) {
                            c27211Tv.A01 = true;
                        }
                        if (!c27211Tv.A01) {
                            tigonBodyStream2.writeEOM();
                        }
                    }
                } catch (IOException | BufferUnderflowException e) {
                    this.A01.reportError(new TigonError(TigonErrorCode.FATAL_ERROR, "IGTigonBodyProviderDomain", 0, e.toString()));
                }
            }
        }, "IGTigonBodyProvider", 0));
    }
}
