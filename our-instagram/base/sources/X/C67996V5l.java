package X;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: X.V5l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67996V5l extends C2AG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractC70118W4q A02;
    public final /* synthetic */ ByteBuffer A03;

    @Override // X.C11R
    public final int getRunnableId() {
        return 333;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        this.A02.A03(exc);
    }

    public C67996V5l(AbstractC70118W4q abstractC70118W4q, ByteBuffer byteBuffer, int i, int i2) {
        this.A03 = byteBuffer;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = abstractC70118W4q;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            ByteBuffer byteBuffer = this.A03;
            int i = this.A01;
            int i2 = this.A00;
            AbstractC66019TyH.A01(byteBuffer, i, i2);
            Bitmap A0F = AbstractC167007dF.A0F(i, i2);
            A0F.copyPixelsFromBuffer(byteBuffer);
            this.A02.A04(A0F);
            return null;
        } catch (OutOfMemoryError e) {
            throw new Exception(e);
        } catch (RuntimeException e2) {
            throw new Exception(e2);
        }
    }
}
