package X;

import android.graphics.Bitmap;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.List;

/* loaded from: classes9.dex */
public final class PJI implements InterfaceC58173Pqd {
    public final List A00;
    public final long A01;
    public final List A02;

    @Override // X.InterfaceC58173Pqd
    public final boolean Cs9() {
        return true;
    }

    @Override // X.InterfaceC58173Pqd
    public final void DMF(long j) {
    }

    public final int A00(long j) {
        long j2 = j + this.A01;
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (Math.abs(AbstractC166987dD.A0N(list.get(i)) - j2) < StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                return i;
            }
        }
        return -1;
    }

    public PJI(List list, long j) {
        this.A02 = list;
        this.A01 = j;
        this.A00 = AbstractC16960so.A1N(new Bitmap[list.size()]);
    }

    @Override // X.InterfaceC58173Pqd
    public final void CzY(long j, int i, Bitmap bitmap) {
        int A00 = A00(j);
        if (A00 != -1) {
            this.A00.set(A00, bitmap);
        }
    }

    @Override // X.InterfaceC58173Pqd
    public final boolean Ehv(int i, long j) {
        int A00 = A00(j);
        if (A00 == -1 || this.A00.get(A00) != null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58173Pqd
    public final /* synthetic */ Long AVb(List list) {
        return null;
    }
}
