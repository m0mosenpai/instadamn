package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class OJH {
    public InterfaceC58032PoI A00;
    public final C1C6 A01;
    public final UserSession A02;
    public final C55931OsN A03 = new C55931OsN(this);
    public final String A04;

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        try {
            System.currentTimeMillis();
            UserSession userSession = this.A02;
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("shortwave.instagram.com").appendPath("v2").appendPath("transcribe").appendQueryParameter("detailed", RealtimeSubscription.GRAPHQL_MQTT_VERSION).appendQueryParameter("product", this.A04);
            C14360o3.A07(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(AbstractC31173DnH.A0g()));
            String A0j = AbstractC167017dG.A0j();
            if (C18U.A06(C06090Tz.A05, userSession, 36320262089613531L)) {
                Locale A02 = C1Q2.A02();
                appendQueryParameter.appendQueryParameter("lang", A02.toString());
                A02.toString();
            }
            C26371Ps c26371Ps = new C26371Ps(new C1JO(userSession));
            c26371Ps.A01(C05F.A01);
            c26371Ps.A02 = AbstractC166987dD.A19(appendQueryParameter.build());
            c26371Ps.A05 = true;
            c26371Ps.A06.add(new C23781El("X-Shortwave-ID", A0j));
            try {
                File A11 = AbstractC166987dD.A11(str);
                int length = (int) A11.length();
                byte[] bArr = new byte[length];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(A11));
                try {
                    bufferedInputStream.read(bArr, 0, length);
                    bufferedInputStream.close();
                    c26371Ps.A00 = new C126615nx(new C23781El(AbstractC111324zv.A00(610), "audio/m4a"), bArr);
                    C1QW A00 = c26371Ps.A00();
                    C1QX A0J = MSY.A0J();
                    A0J.A0A = "Karaoke";
                    A0J.A03 = C1Ef.OffScreen;
                    C1QY A002 = A0J.A00();
                    C55931OsN c55931OsN = this.A03;
                    c55931OsN.A00 = str;
                    this.A01.A02(c55931OsN, A00, A002);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C20I.A00(bufferedInputStream, th);
                        throw th2;
                    }
                }
            } catch (FileNotFoundException | IOException e) {
                AbstractC12120kG.A05("KaraokeTranscriptionApi", "KaraokeTranscriptionApi_readBytes_exception", e);
                InterfaceC58032PoI interfaceC58032PoI = this.A00;
                if (interfaceC58032PoI != null) {
                    interfaceC58032PoI.Dv6();
                }
            }
        } catch (IOException e2) {
            AbstractC12120kG.A05("KaraokeTranscriptionFetcher", "KaraokeTranscriptionFetcher_error_building_request", e2);
            InterfaceC58032PoI interfaceC58032PoI2 = this.A00;
            if (interfaceC58032PoI2 != null) {
                interfaceC58032PoI2.Dv6();
            }
        }
    }

    public OJH(C1C6 c1c6, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A01 = c1c6;
        this.A04 = str;
    }
}
