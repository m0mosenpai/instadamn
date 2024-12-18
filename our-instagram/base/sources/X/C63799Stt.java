package X;

import android.graphics.Bitmap;
import java.util.Queue;

/* renamed from: X.Stt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63799Stt implements InterfaceC65322Ti2 {
    public int A00;
    public Bitmap.Config A01;
    public final QBF A02;

    @Override // X.InterfaceC65322Ti2
    public final void Cts() {
        Queue queue = this.A02.A00;
        if (queue.size() < 20) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C63799Stt)) {
            return false;
        }
        C63799Stt c63799Stt = (C63799Stt) obj;
        if (this.A00 != c63799Stt.A00) {
            return false;
        }
        Bitmap.Config config = this.A01;
        Bitmap.Config config2 = c63799Stt.A01;
        if (config == null) {
            equals = AbstractC25229BEm.A1Z(config2);
        } else {
            equals = config.equals(config2);
        }
        if (!equals) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC25235BEs.A06(this.A01);
    }

    public final String toString() {
        int i = this.A00;
        Bitmap.Config config = this.A01;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[");
        A1C.append(i);
        A1C.append("](");
        return AbstractC58323PtF.A0q(config, A1C);
    }

    public C63799Stt(QBF qbf) {
        this.A02 = qbf;
    }
}
