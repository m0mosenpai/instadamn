package X;

import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.9Ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208589Ks extends C4QU implements InterfaceC189918bA {
    public C1815383g A00;
    public boolean A01;
    public final C208579Kr A04;
    public final C677933t A05;
    public final C95334Qt A06;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public int A02 = -1;

    @Override // X.C4QU, X.C4QV
    public final void DEE(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, String str3) {
        C14360o3.A0B(str3, 3);
        this.A05.A05(str3);
    }

    @Override // X.InterfaceC189918bA
    public final int E8P(String str, short[] sArr, int i) {
        C14360o3.A0B(sArr, 1);
        int i2 = 0;
        if (this.A00 != null && this.A01) {
            int currentPosition = this.A06.getCurrentPosition();
            if (this.A02 != currentPosition) {
                this.A02 = currentPosition;
                C1815383g c1815383g = this.A00;
                if (c1815383g != null) {
                    c1815383g.A04(currentPosition);
                }
            }
            while (i2 < i) {
                C24238Ap5 c24238Ap5 = (C24238Ap5) this.A03.poll();
                if (c24238Ap5 == null) {
                    break;
                }
                if (c24238Ap5.A00 >= currentPosition) {
                    byte[] bArr = c24238Ap5.A01;
                    int min = Math.min(bArr.length / 2, i - i2);
                    ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, i2, min);
                    i2 += min;
                }
            }
        }
        return i2;
    }

    @Override // X.C4QU, X.C4QV
    public final void DVN(byte[] bArr, long j) {
        if (this.A01) {
            this.A03.add(new C24238Ap5(bArr, j));
        }
    }

    @Override // X.C4QU, X.C4QV
    public final void DaX(InterfaceC95344Qu interfaceC95344Qu, long j) {
        this.A05.A03();
    }

    @Override // X.C4QU, X.C4QV
    public final void DzK(long j, String str) {
        this.A05.A00();
    }

    @Override // X.C4QU, X.C4QV
    public final void E05(long j) {
        this.A05.A02();
        UserSession userSession = this.A04.A00.A07;
        C24U c24u = AnonymousClass229.A01(userSession).A03;
        c24u.A04 = c24u.A0E.A02(17645025, c24u.A04);
        C447024a c447024a = AnonymousClass229.A01(userSession).A02;
        AbstractC167027dH.A10(c447024a);
        C447024a.A00(c447024a, "backing_track_player_is_playing");
    }

    public C208589Ks(C208579Kr c208579Kr, C677933t c677933t, C95334Qt c95334Qt) {
        this.A06 = c95334Qt;
        this.A05 = c677933t;
        this.A04 = c208579Kr;
    }
}
