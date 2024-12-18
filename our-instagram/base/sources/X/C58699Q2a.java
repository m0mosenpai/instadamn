package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.facebook.location.platform.api.Location;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Q2a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58699Q2a extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ConnectivityManager A00;
    public final /* synthetic */ SLZ A01;
    public final /* synthetic */ AtomicBoolean A02;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        SBA sba;
        Object qJo;
        C14360o3.A0B(network, 0);
        this.A02.set(true);
        this.A00.unregisterNetworkCallback(this);
        try {
            SLZ slz = this.A01;
            SL8 sl8 = new SL8(network, slz.A01);
            if (slz instanceof C58918QJw) {
                C58918QJw c58918QJw = (C58918QJw) slz;
                String str = c58918QJw.A02;
                C11L c11l = new C11L(c58918QJw.A01);
                HttpURLConnection A00 = sl8.A00(new java.net.URL(str));
                A00.setInstanceFollowRedirects(false);
                AbstractC09810fe.A02(A00, 591742661);
                int responseCode = A00.getResponseCode();
                for (int i = 0; responseCode / 100 == 3 && i < 10; i++) {
                    String headerField = A00.getHeaderField(Location.TAG);
                    A00.disconnect();
                    C14360o3.A0A(headerField);
                    if (headerField.length() == 0) {
                        sba = new QJs();
                        break;
                    }
                    if (c11l.A08(headerField)) {
                        qJo = new QJp(headerField);
                        break;
                    }
                    A00 = sl8.A00(new java.net.URL(headerField));
                    A00.setInstanceFollowRedirects(false);
                    AbstractC09810fe.A02(A00, 591742661);
                    responseCode = A00.getResponseCode();
                }
                A00.disconnect();
                String responseMessage = A00.getResponseMessage();
                C14360o3.A07(responseMessage);
                sba = new SBA(AnonymousClass001.A0W("unexpected_response_", responseMessage, '_', A00.getResponseCode()));
                qJo = new QJo(sba);
                if (qJo instanceof QJp) {
                    c58918QJw.A00.DqC(((QJp) qJo).A00);
                    return;
                } else {
                    if (qJo instanceof QJo) {
                        c58918QJw.A00.DG0(((QJo) qJo).A00);
                        return;
                    }
                    throw B4Z.A00();
                }
            }
            C58917QJv c58917QJv = (C58917QJv) slz;
            HttpURLConnection A002 = sl8.A00(new java.net.URL(c58917QJv.A01));
            AbstractC09810fe.A02(A002, -1448468238);
            boolean A1P = AbstractC167007dF.A1P(A002.getResponseCode() / 100, 2);
            InterfaceC65488Tl8 interfaceC65488Tl8 = c58917QJv.A00;
            if (A1P) {
                BufferedReader A0h = AbstractC58320PtC.A0h(AbstractC09810fe.A00(A002, -1844687473));
                StringBuilder A1C = AbstractC166987dD.A1C();
                while (true) {
                    String readLine = A0h.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        A1C.append(readLine);
                    }
                }
                interfaceC65488Tl8.DqC(AbstractC166987dD.A19(A1C));
            } else {
                String responseMessage2 = A002.getResponseMessage();
                C14360o3.A07(responseMessage2);
                interfaceC65488Tl8.DG0(new SBA(AnonymousClass001.A0W("unexpected_response_", responseMessage2, '_', A002.getResponseCode())));
            }
            A002.disconnect();
        } catch (SocketTimeoutException | IOException | Exception e) {
            InterfaceC65488Tl8 interfaceC65488Tl82 = this.A01.A00;
            Object message = e.getMessage();
            if (message == null) {
                message = new C0YZ(e.getClass());
            }
            interfaceC65488Tl82.DG0(new SBA(String.valueOf(message)));
        }
    }

    public C58699Q2a(ConnectivityManager connectivityManager, SLZ slz, AtomicBoolean atomicBoolean) {
        this.A02 = atomicBoolean;
        this.A00 = connectivityManager;
        this.A01 = slz;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.A02.set(true);
        this.A00.unregisterNetworkCallback(this);
        this.A01.A00.DG0(new C58916QJu());
    }
}
