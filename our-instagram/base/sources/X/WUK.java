package X;

import android.util.Pair;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WUK implements InterfaceC71947XBy {
    public Pair A00;
    public final /* synthetic */ C70481WYm A01;
    public final /* synthetic */ ByteBuffer A02;

    public WUK(C70481WYm c70481WYm, ByteBuffer byteBuffer) {
        this.A01 = c70481WYm;
        this.A02 = byteBuffer;
        this.A00 = MSY.A0D(byteBuffer, -1);
    }

    @Override // X.InterfaceC71947XBy
    public final void DX8(ByteBuffer byteBuffer, int i, long j) {
        C70481WYm c70481WYm = this.A01;
        c70481WYm.A06 = true;
        c70481WYm.A05 = byteBuffer;
    }

    @Override // X.InterfaceC71947XBy
    public final Pair EJD() {
        this.A02.clear();
        return this.A00;
    }
}
