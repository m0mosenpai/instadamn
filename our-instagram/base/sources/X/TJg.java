package X;

import java.net.InetAddress;

/* loaded from: classes10.dex */
public final class TJg implements Runnable {
    public final String A00;

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A00;
        AbstractC63254SgB.A01("BrowserLiteFragment", "Async resolving %s", str);
        try {
            InetAddress.getByName(str);
        } catch (Exception e) {
            AbstractC63254SgB.A01("BrowserLiteFragment", "Exception during async DNS: %s", AbstractC58319PtB.A1Z(e));
        }
        AbstractC63254SgB.A01("BrowserLiteFragment", "Done resolving %s", str);
    }

    public TJg(String str) {
        this.A00 = str;
    }
}
