package X;

import com.facebook.instagrammem.mca.MailboxInstagramMem$BytesAvailableHandlerCallback;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.IOException;

/* renamed from: X.Jvh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44991Jvh extends MailboxInstagramMem$BytesAvailableHandlerCallback {
    public UserSession A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final C61042ReE A06;
    public final C1O3 A07;

    public C44991Jvh(C1O3 c1o3, int i) {
        C14360o3.A0B(c1o3, 1);
        this.A07 = c1o3;
        this.A05 = i;
        this.A06 = new C61042ReE(c1o3, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, 0L);
    }

    public static final void A00(C44991Jvh c44991Jvh) {
        synchronized (c44991Jvh) {
            if (!c44991Jvh.A02) {
                try {
                    c44991Jvh.A06.close();
                } catch (IOException unused) {
                    C0K8.A0C("ArmadilloExpressStreamableDownloadResponse", "Error happened closing input stream");
                }
                c44991Jvh.A02 = true;
            }
        }
    }
}
