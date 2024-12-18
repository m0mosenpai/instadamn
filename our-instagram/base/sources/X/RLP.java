package X;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class RLP extends RLJ {
    public static final RLP zzb;
    public InterfaceC65689TsB zzd = RLL.A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, X.Rdx] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.IOException, X.Rdx] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.IOException, X.Rdx] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.Rdx] */
    public static RLP A01(byte[] bArr) {
        C61029Rdx e;
        int length = bArr.length;
        C63130Sdb c63130Sdb = C63130Sdb.A01;
        RLP rlp = new RLP();
        try {
            InterfaceC65579TnE A00 = SYV.A02.A00(rlp.getClass());
            A00.FGT(new C62904SWl(c63130Sdb), rlp, bArr, 0, length);
            A00.FGG(rlp);
            return rlp;
        } catch (C61029Rdx e2) {
            e = e2;
            e.A00 = rlp;
            throw e;
        } catch (TXI e3) {
            e = new IOException(e3.getMessage());
            e.A00 = null;
            e.A00 = rlp;
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C61029Rdx) {
                throw e4.getCause();
            }
            e = new IOException(e4.getMessage(), e4);
            e.A00 = null;
            e.A00 = rlp;
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            e.A00 = null;
            e.A00 = rlp;
            throw e;
        }
    }

    static {
        RLP rlp = new RLP();
        zzb = rlp;
        ((RLJ) rlp).zzd &= Integer.MAX_VALUE;
        RLJ.zzb.put(RLP.class, rlp);
    }
}
