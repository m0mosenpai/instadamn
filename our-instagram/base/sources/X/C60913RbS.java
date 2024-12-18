package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;

/* renamed from: X.RbS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60913RbS extends RcZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C64119Szb A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Header[] A04;

    public C60913RbS(C64119Szb c64119Szb, String str, Header[] headerArr, int i, long j) {
        this.A02 = c64119Szb;
        this.A01 = j;
        this.A04 = headerArr;
        this.A00 = i;
        this.A03 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3JQ, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C64119Szb c64119Szb = this.A02;
        SQ7 sq7 = c64119Szb.A0A;
        C1QW c1qw = c64119Szb.A08;
        sq7.A03(c1qw, "response_headers_received", this.A01, TimeUnit.NANOSECONDS);
        Header[] headerArr = this.A04;
        Map map = c64119Szb.A03;
        ArrayList A00 = C64119Szb.A00(map, headerArr);
        try {
            C1JP c1jp = c1qw.A05;
            if (c1jp != null) {
                c1jp.FA4(c1qw.A09, Collections.unmodifiableMap(map));
            }
            InterfaceC65592TnX interfaceC65592TnX = c64119Szb.A02;
            int i = this.A00;
            String str = this.A03;
            int i2 = c1qw.A04;
            ?? obj = new Object();
            obj.A01 = i;
            obj.A02 = str;
            obj.A00 = i2;
            obj.A03 = A00;
            interfaceC65592TnX.Dgg(obj);
        } catch (IOException | IllegalStateException e) {
            C0w9.A07("LigerAsyncInterface_resp", e);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0R("LigerAsyncResponseHandler.onResponse: ", this.A02.A08.A09.toString());
    }
}
