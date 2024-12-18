package X;

import com.instagram.quicksand.QuickSandSolverBridge;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZR extends AbstractRunnableC14200nk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C34706FQr A04;
    public QuickSandSolverBridge A05;
    public String A06;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.FQq] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        while (this.A00 < this.A01) {
            QuickSandSolverBridge quickSandSolverBridge = this.A05;
            if (quickSandSolverBridge.A02()) {
                break;
            }
            int[] A03 = quickSandSolverBridge.A03(this.A02, this.A06);
            int length = A03.length;
            int i = this.A03;
            if (length == i) {
                ArrayList A17 = AbstractC25225BEi.A17(i);
                for (int i2 : A03) {
                    AbstractC166997dE.A1W(A17, i2);
                }
                try {
                    String A02 = new C71473Il("-").A02(A17);
                    MessageDigest messageDigest = MessageDigest.getInstance(AbstractC111324zv.A00(1788));
                    messageDigest.update(A02.getBytes());
                    byte[] digest = messageDigest.digest();
                    str = AbstractC13670mt.A06(AnonymousClass001.A0c("%0", "x", digest.length << 1), new BigInteger(1, digest));
                } catch (NoSuchAlgorithmException unused) {
                    str = new String();
                }
                this.A06 = str;
                C34706FQr c34706FQr = this.A04;
                synchronized (c34706FQr) {
                    List list = c34706FQr.A00;
                    ?? obj = new Object();
                    obj.A00 = A17;
                    list.add(obj);
                }
            } else {
                this.A00--;
            }
            this.A00++;
        }
        this.A05.A00();
    }
}
