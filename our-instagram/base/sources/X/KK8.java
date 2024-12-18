package X;

import android.graphics.Bitmap;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class KK8 extends C2AG {
    public Bitmap A00;
    public final /* synthetic */ C33231ElP A01;

    @Override // X.C11R
    public final int getRunnableId() {
        return 290;
    }

    public KK8(Bitmap bitmap, C33231ElP c33231ElP) {
        this.A01 = c33231ElP;
        this.A00 = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        C33231ElP c33231ElP = this.A01;
        Bitmap bitmap = this.A00;
        C1F3 A00 = LI4.A00(c33231ElP.requireContext());
        try {
            AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, bitmap, A00.CHy());
            A00.AIh();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C9GR.A07(AbstractC12290kX.A00, 2131953610);
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        super.onFinish();
        C33231ElP c33231ElP = this.A01;
        c33231ElP.A04 = false;
        AbstractC31178DnM.A0v(c33231ElP);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (AbstractC166987dD.A1a(obj)) {
            C9GR.A07(AbstractC12290kX.A00, 2131953607);
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E77("has_backup_codes", true);
            ARD.apply();
            return;
        }
        C9GR.A07(AbstractC12290kX.A00, 2131953610);
    }
}
