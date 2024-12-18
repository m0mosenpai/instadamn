package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.TNa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64618TNa implements Runnable {
    public final /* synthetic */ C4MI A00;
    public final /* synthetic */ AnonymousClass206 A01;

    public RunnableC64618TNa(C4MI c4mi, AnonymousClass206 anonymousClass206) {
        this.A01 = anonymousClass206;
        this.A00 = c4mi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConnectionConfig connectionConfig;
        AnonymousClass206 anonymousClass206 = this.A01;
        C94464My c94464My = anonymousClass206.A02;
        if (c94464My != null) {
            connectionConfig = c94464My.A05(anonymousClass206.A03, this.A00, anonymousClass206.A07, AnonymousClass206.A0H);
        } else {
            connectionConfig = null;
        }
        if (!AbstractC94804Ol.A00(anonymousClass206.A01, connectionConfig)) {
            anonymousClass206.stop();
            AnonymousClass206.A01(connectionConfig, anonymousClass206, C05F.A0j);
        }
    }
}
