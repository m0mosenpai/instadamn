package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.Mac;
import org.apache.http.client.ClientProtocolException;

/* renamed from: X.TQp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64708TQp implements Runnable {
    public final /* synthetic */ SFP A00;
    public final /* synthetic */ TFF A01;
    public final /* synthetic */ Q07 A02;
    public final /* synthetic */ String A03;

    public RunnableC64708TQp(SFP sfp, TFF tff, Q07 q07, String str) {
        this.A01 = tff;
        this.A00 = sfp;
        this.A02 = q07;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TFF tff = this.A01;
        C3JQ c3jq = tff.A00;
        if (c3jq != null && c3jq.A01 == 200) {
            SFP sfp = this.A00;
            ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(tff.A01.toByteArray()));
            Q07 q07 = this.A02;
            C14360o3.A0B(q07, 1);
            try {
                try {
                    byte[] bArr = new byte[1024];
                    for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                        if (!nextEntry.isDirectory()) {
                            ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    A0U.write(bArr, 0, read);
                                }
                            }
                            zipInputStream.closeEntry();
                            String A19 = AbstractC166987dD.A19(A0U);
                            zipInputStream.close();
                            String str = sfp.A02.A01;
                            Charset charset = C15W.A05;
                            byte[] A1a = AbstractC58318PtA.A1a(A19, charset);
                            Mac mac = Mac.getInstance("HmacSHA256");
                            mac.init(AbstractC58318PtA.A16("HmacSHA256", AbstractC58318PtA.A1a("prepackaged", charset)));
                            String lowerCase = SUX.A00(mac.doFinal(A1a)).toLowerCase();
                            C14360o3.A07(lowerCase);
                            C14360o3.A0B(str, 0);
                            if (str.equalsIgnoreCase(lowerCase)) {
                                sfp.A01.A00(q07, A19, C16930sl.A00);
                                return;
                            }
                            throw AbstractC166987dD.A14("Downloaded zip file does not have valid checksum");
                        }
                    }
                    zipInputStream.close();
                    throw new Exception("Found no Bloks bundle in the downloaded zip.");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C20I.A00(zipInputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                sfp.A01.A01(q07, e);
                return;
            }
        }
        SFP sfp2 = this.A00;
        ClientProtocolException clientProtocolException = new ClientProtocolException(AnonymousClass001.A0R("HTTP Request Failed for ", this.A03));
        Q07 q072 = this.A02;
        AbstractC167017dG.A1N(clientProtocolException, q072);
        sfp2.A01.A01(q072, clientProtocolException);
    }
}
