package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.UOg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66596UOg extends C141566aZ implements X98 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        X98[] A09 = WGe.A09(C66598UOi.class, byteBuffer, i, 0);
        if (A09 != null) {
            this.A00 = new ArrayList(Arrays.asList(A09));
        }
        this.A01 = (AbstractC68230VIq[]) WGe.A09(C66597UOh.class, byteBuffer, i, 1);
    }
}
