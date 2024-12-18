package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import java.io.IOException;

/* renamed from: X.5ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126435ne {
    public long A00;
    public Long A01;
    public final DataTask A02;
    public final NetworkSession A03;
    public final InterfaceC27191Tt A04;
    public final C61042ReE A05;
    public final C1JP A06;
    public final /* synthetic */ C1334960t A07;

    public C126435ne(DataTask dataTask, NetworkSession networkSession, C1JP c1jp, C1334960t c1334960t) {
        this.A07 = c1334960t;
        try {
            long j = dataTask.mContentLength;
            Long valueOf = Long.valueOf(j);
            this.A01 = valueOf;
            if (j != 0) {
                this.A06 = c1jp;
                this.A00 = 0L;
                this.A02 = dataTask;
                this.A03 = networkSession;
                C61042ReE c61042ReE = new C61042ReE(c1334960t.A01, 15000L, valueOf.longValue());
                this.A05 = c61042ReE;
                Execution.executeAsync(new USH(this, c1334960t), null, 3);
                this.A04 = AbstractC126595nv.A00(dataTask, c1jp, new InterfaceC126575nt() { // from class: X.WjV
                    @Override // X.InterfaceC126575nt
                    public final C69224Vjs AET(long j2) {
                        C126435ne c126435ne = C126435ne.this;
                        return new C69224Vjs(c126435ne.A03, c126435ne.A02.mTaskIdentifier, j2);
                    }
                }, new C126585nu(dataTask, networkSession, c1jp, c1334960t), null, c61042ReE);
                return;
            }
            throw new IOException("Content-Length cannot be empty for streaming upload");
        } catch (IOException e) {
            C0K8.A0F("IgNetworkSession", "Error while initializing StreamingUploadDataTask", e);
            throw e;
        }
    }

    public static void A00(C126435ne c126435ne) {
        try {
            c126435ne.A05.close();
        } catch (IOException e) {
            C0K8.A0J("IgNetworkSession", "Error while attempting to close StreamingUploadInputStream", e);
        }
    }
}
