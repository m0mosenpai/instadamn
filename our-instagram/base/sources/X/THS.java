package X;

import com.facebook.common.dextricks.Constants;
import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public final class THS implements Closeable {
    public static final Logger A05 = AbstractC58319PtB.A17(C63116SdK.class);
    public int A00;
    public boolean A01;
    public final C62971SZq A02;
    public final TWX A03;
    public final InterfaceC65700TsM A04;

    public final synchronized void A00() {
        if (!this.A01) {
            this.A04.flush();
        } else {
            throw AbstractC58321PtD.A0g();
        }
    }

    public final synchronized void A02(int i, long j) {
        if (!this.A01) {
            if (j != 0 && j <= 2147483647L) {
                A01((byte) 8, (byte) 0, i, 4);
                InterfaceC65700TsM interfaceC65700TsM = this.A04;
                interfaceC65700TsM.FEZ((int) j);
                interfaceC65700TsM.flush();
            } else {
                Object[] objArr = {Long.valueOf(j)};
                String[] strArr = C63116SdK.A01;
            }
        } else {
            throw AbstractC58321PtD.A0g();
        }
    }

    public final synchronized void A03(int i, Integer num) {
        if (!this.A01) {
            int A00 = AbstractC62284S5d.A00(num);
            A01((byte) 3, (byte) 0, i, 4);
            InterfaceC65700TsM interfaceC65700TsM = this.A04;
            interfaceC65700TsM.FEZ(A00);
            interfaceC65700TsM.flush();
        } else {
            throw AbstractC58321PtD.A0g();
        }
    }

    public final synchronized void A04(TWX twx, int i, int i2, boolean z) {
        if (!this.A01) {
            A01((byte) 0, AbstractC167007dF.A1M(z ? 1 : 0) ? (byte) 1 : (byte) 0, i, i2);
            if (i2 > 0) {
                this.A04.FEM(twx, i2);
            }
        } else {
            throw AbstractC58321PtD.A0g();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.A01 = true;
        this.A04.close();
    }

    public final void A01(byte b, byte b2, int i, int i2) {
        Object[] A1Z;
        String str;
        Logger logger = A05;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C63116SdK.A00(b, b2, i, i2, false));
        }
        int i3 = this.A00;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                InterfaceC65700TsM interfaceC65700TsM = this.A04;
                interfaceC65700TsM.FER((i2 >>> 16) & 255);
                interfaceC65700TsM.FER((i2 >>> 8) & 255);
                interfaceC65700TsM.FER(i2 & 255);
                interfaceC65700TsM.FER(b & 255);
                interfaceC65700TsM.FER(b2 & 255);
                interfaceC65700TsM.FEZ(i & Integer.MAX_VALUE);
                return;
            }
            A1Z = AbstractC25228BEl.A1Y(i);
            str = "reserved bit set: %s";
        } else {
            A1Z = AbstractC25228BEl.A1Z(Integer.valueOf(i3), i2);
            str = "FRAME_SIZE_ERROR length > %d: %d";
        }
        String[] strArr = C63116SdK.A01;
        throw AbstractC166987dD.A12(AbstractC58321PtD.A0x(str, A1Z));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.TWX, java.lang.Object] */
    public THS(InterfaceC65700TsM interfaceC65700TsM) {
        this.A04 = interfaceC65700TsM;
        ?? obj = new Object();
        this.A03 = obj;
        this.A02 = new C62971SZq(obj);
        this.A00 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
    }
}
