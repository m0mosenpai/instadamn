package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Sdm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63140Sdm {
    public static final String A02 = "secondary_dns";
    public static final InetSocketAddress A03;
    public static final InetSocketAddress A04;
    public static final InetSocketAddress[] A05;
    public static final InetSocketAddress A06;
    public static final InetSocketAddress A07;
    public final int A00;
    public final List A01;

    static {
        InetSocketAddress A00 = A00(new byte[]{8, 8, 8, 8});
        A03 = A00;
        InetSocketAddress A002 = A00(new byte[]{8, 8, 4, 4});
        A04 = A002;
        InetSocketAddress A003 = A00(new byte[]{32, 1, 72, 96, 72, 96, 0, 0, 0, 0, 0, 0, 0, 0, -120, -120});
        A06 = A003;
        InetSocketAddress A004 = A00(new byte[]{32, 1, 72, 96, 72, 96, 0, 0, 0, 0, 0, 0, 0, 0, -120, 68});
        A07 = A004;
        A05 = new InetSocketAddress[]{A00, A002, A003, A004};
    }

    public static InetSocketAddress A00(byte[] bArr) {
        try {
            return new InetSocketAddress(InetAddress.getByAddress(bArr), 53);
        } catch (UnknownHostException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    public C63140Sdm(int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A01 = A1E;
        synchronized (A1E) {
            A1E.clear();
            A1E.add(A03);
            A1E.add(A04);
        }
        this.A00 = i;
    }
}
