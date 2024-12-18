package X;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;

/* loaded from: classes10.dex */
public final class T46 implements InterfaceC65397TjU {
    public final Context A00;
    public final ConnectivityManager A01;
    public final InterfaceC65401TjY A02;
    public final InterfaceC65401TjY A03;
    public final C62651SKk A04;
    public final java.net.URL A05;

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(1:7)(1:27)|8|(1:10)(2:21|(1:23)(7:24|(1:26)|12|13|14|15|16))|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ef, code lost:
    
        android.util.Log.e(X.AnonymousClass001.A0R("TransportRuntime.", "CctTransportBackend"), "Unable to find version code for package", r3);
        r0 = -1;
     */
    @Override // X.InterfaceC65397TjU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C60638REx AOM(X.AbstractC61581Rq5 r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T46.AOM(X.Rq5):X.REx");
    }

    public T46(Context context, InterfaceC65401TjY interfaceC65401TjY, InterfaceC65401TjY interfaceC65401TjY2) {
        C64434TDs c64434TDs = new C64434TDs();
        C64427TDl.A00.AJ7(c64434TDs);
        c64434TDs.A01 = true;
        this.A04 = new C62651SKk(c64434TDs);
        this.A00 = context;
        this.A01 = (ConnectivityManager) context.getSystemService("connectivity");
        String str = T42.A02;
        try {
            this.A05 = new java.net.URL(str);
            this.A02 = interfaceC65401TjY2;
            this.A03 = interfaceC65401TjY;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AnonymousClass001.A0R("Invalid url: ", str), e);
        }
    }
}
