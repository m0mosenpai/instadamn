package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.litho.annotations.Comparable;
import java.util.Timer;

/* renamed from: X.Bpz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26664Bpz extends AbstractC50922Vo {

    @Comparable(type = 3)
    public int A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public Timer A01;

    @Comparable(type = 3)
    public boolean A02;

    @Override // X.AbstractC50922Vo
    public final void A01(C125975mo c125975mo) {
        Object[] objArr = c125975mo.A01;
        switch (c125975mo.A00) {
            case Integer.MIN_VALUE:
                this.A02 = AbstractC166987dD.A1a(objArr[0]);
                return;
            case Process.WAIT_RESULT_STOPPED /* -2147483647 */:
                this.A00 = AbstractC166987dD.A0H(objArr[0]);
                return;
            case Process.WAIT_RESULT_RUNNING /* -2147483646 */:
                this.A01 = (Timer) objArr[0];
                return;
            default:
                return;
        }
    }
}
