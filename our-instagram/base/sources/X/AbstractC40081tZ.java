package X;

import android.os.Build;
import java.io.IOException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.1tZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40081tZ {
    public C39841t8 A00;
    public C40101tb A01;
    public AbstractC41001v7 A02;
    public final int A03;
    public final int A04;
    public final ByteBuffer A05;
    public final char[] A08;
    public final C39901tE A09;
    public final C04060Jx A0A;
    public final java.util.Set A07 = new HashSet();
    public final Queue A06 = new LinkedList();

    public abstract AbstractC41001v7 A06(AbstractC41001v7 abstractC41001v7, String str);

    public abstract Object A07();

    public final AbstractC41001v7 A01() {
        C40101tb c40101tb;
        Writer writer;
        C04060Jx c04060Jx;
        C0CA A02;
        int incrementAndGet;
        AbstractC41001v7 abstractC41001v7 = this.A02;
        if (abstractC41001v7 == null || !abstractC41001v7.A01.A0B(this)) {
            A02();
            AbstractC41001v7 A06 = A06(this.A02, null);
            this.A02 = A06;
            try {
                C41651wF c41651wF = A06.A02;
                C39901tE c39901tE = this.A09;
                C41651wF.A00(c41651wF);
                Writer writer2 = c41651wF.A02;
                C0CA A022 = c39901tE.A01.A02();
                AbstractC020908f.A00("writeFixedData");
                try {
                    C0CA.A00(A022, Long.valueOf(System.currentTimeMillis()), "time");
                    C38071pr c38071pr = c39901tE.A04;
                    C0CA.A00(A022, "567067343352427", "app_id");
                    C0CA.A00(A022, c38071pr.A01, "app_ver");
                    C0CA.A00(A022, Integer.valueOf(c38071pr.A00), "build_num");
                    C0CA.A00(A022, 0L, "consent_state");
                    C0CA.A00(A022, Build.MODEL, "device");
                    C0CA.A00(A022, Build.VERSION.RELEASE, "os_ver");
                    C0CA.A00(A022, C16030qx.A02.A05(c39901tE.A02.A00), AbstractC58347Ptn.A00(0, 9, 39));
                    C11830jh c11830jh = c39901tE.A03.A00;
                    if (c11830jh != null) {
                        C19T c19t = C19T.A1H;
                        if (c11830jh.A02(c19t) != null) {
                            C0CA.A00(A022, c11830jh.A02(c19t), "family_device_id");
                        }
                    }
                    C0C2.A00().A05(A022, writer2);
                    A022.A02();
                    AbstractC021008g.A00();
                    C41651wF c41651wF2 = this.A02.A02;
                    c40101tb = this.A01;
                    C41651wF.A00(c41651wF2);
                    writer = c41651wF2.A02;
                    c04060Jx = c40101tb.A01;
                    A02 = c04060Jx.A02();
                    AbstractC020908f.A00("writeNewSessionData");
                } catch (Throwable th) {
                    th = th;
                    A022.A02();
                }
                try {
                    String A00 = AbstractC58347Ptn.A00(9, 10, 87);
                    C39841t8 c39841t8 = c40101tb.A00;
                    C0CA.A00(A02, c39841t8.A02, A00);
                    synchronized (c39841t8) {
                        incrementAndGet = C39841t8.A03.incrementAndGet();
                    }
                    C0CA.A00(A02, Integer.valueOf(incrementAndGet), "seq");
                    C39831t7 c39831t7 = c39841t8.A01;
                    if (c39831t7 == null) {
                        C0CA.A00(A02, null, "uid");
                    } else {
                        C0CA.A00(A02, c39831t7.A00, "app_uid");
                        String str = c39831t7.A01;
                        if (str != null) {
                            C0CW A01 = c04060Jx.A01();
                            C0CW.A00(A01, str);
                            A02.A0E(A01, "claims");
                        }
                    }
                    C0C2.A00().A05(A02, writer);
                    A02.A02();
                    AbstractC021008g.A00();
                } catch (Throwable th2) {
                    th = th2;
                    A02.A02();
                    AbstractC021008g.A00();
                    throw th;
                }
            } catch (IOException e) {
                this.A02.A01.A08(this);
                A02();
                throw e;
            }
        }
        return this.A02;
    }

    public final void A02() {
        AbstractC41001v7 abstractC41001v7 = this.A02;
        if (abstractC41001v7 != null) {
            try {
                abstractC41001v7.A03.close();
                abstractC41001v7.A01.A03();
            } catch (IOException unused) {
            }
            this.A02 = null;
        }
    }

    public final void A03(C39841t8 c39841t8) {
        this.A00 = c39841t8;
        this.A01 = new C40101tb(c39841t8, this.A0A);
        AbstractC41001v7 abstractC41001v7 = this.A02;
        if (abstractC41001v7 != null) {
            try {
                abstractC41001v7.A03.close();
                abstractC41001v7.A01.A03();
            } catch (IOException unused) {
            }
            this.A02 = null;
        }
    }

    public AbstractC40081tZ(InterfaceC38361qQ interfaceC38361qQ, C39901tE c39901tE, C04060Jx c04060Jx, int i, int i2, int i3) {
        if (i > i2) {
            i2 = i;
            if (i <= 0) {
                i = 50;
                i2 = 50;
            }
        }
        this.A04 = i;
        this.A03 = i2;
        i3 = i3 <= 0 ? 1024 : i3;
        this.A08 = new char[i3];
        this.A05 = ByteBuffer.allocate(i3 * 2);
        this.A09 = c39901tE;
        this.A0A = c04060Jx;
        this.A01 = new C40101tb(new C39841t8(null, interfaceC38361qQ.E6h()), c04060Jx);
    }

    public final void A04(AbstractC04050Jw abstractC04050Jw) {
        AbstractC41001v7 A01 = A01();
        if (A01 == null) {
            this.A06.add(abstractC04050Jw);
            return;
        }
        while (true) {
            try {
                Queue queue = this.A06;
                if (!queue.isEmpty()) {
                    A01.A02.A01((AbstractC04050Jw) queue.poll());
                    A01.A00++;
                } else {
                    A01.A02.A01(abstractC04050Jw);
                    A01.A03.flush();
                    A01.A00++;
                    return;
                }
            } finally {
                A01.A01.A08(this);
            }
        }
    }

    public final void A05(AbstractC04050Jw[] abstractC04050JwArr, int i, int i2) {
        AbstractC41001v7 A01 = A01();
        if (A01 == null) {
            int i3 = i2 + i;
            while (i < i3) {
                this.A06.add(abstractC04050JwArr[i]);
                i++;
            }
            return;
        }
        while (true) {
            try {
                Queue queue = this.A06;
                if (queue.isEmpty()) {
                    break;
                }
                A01.A02.A01((AbstractC04050Jw) queue.poll());
                A01.A00++;
            } finally {
                A01.A01.A08(this);
            }
        }
        C41651wF c41651wF = A01.A02;
        int i4 = i2 + i;
        if (abstractC04050JwArr.length < i4) {
            throw new IllegalArgumentException();
        }
        while (i < i4) {
            c41651wF.A01(abstractC04050JwArr[i]);
            i++;
        }
        A01.A03.flush();
        A01.A00 += i2;
    }
}
