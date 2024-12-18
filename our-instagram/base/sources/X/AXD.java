package X;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class AXD implements InterfaceC179317xh {
    public final /* synthetic */ C23017ACw A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.AGQ, java.lang.Object] */
    @Override // X.InterfaceC179317xh
    public final /* bridge */ /* synthetic */ AGQ AL7() {
        ?? obj = new Object();
        obj.A01 = -1;
        obj.A0A = null;
        obj.A0C = new C179297xf[1];
        return obj;
    }

    public AXD(C23017ACw c23017ACw) {
        this.A00 = c23017ACw;
    }

    @Override // X.InterfaceC179317xh
    public final /* bridge */ /* synthetic */ void Dee(Object obj) {
        C179297xf[] c179297xfArr = ((AGQ) obj).A0C;
        boolean z = true;
        if (c179297xfArr == null || c179297xfArr.length != 1) {
            z = false;
        }
        C0J8.A07(z);
        ABT abt = this.A00.A05;
        ByteBuffer byteBuffer = c179297xfArr[0].A02;
        synchronized (abt) {
            if (byteBuffer != null) {
                if (byteBuffer.capacity() == abt.A00) {
                    abt.A02.add(byteBuffer);
                }
            }
        }
    }
}
