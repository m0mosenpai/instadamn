package X;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public final class KK9 extends C2AG {
    public final Bitmap A00;
    public final /* synthetic */ EL6 A01;

    @Override // X.C11R
    public final int getRunnableId() {
        return 258;
    }

    public KK9(Bitmap bitmap, EL6 el6) {
        this.A01 = el6;
        this.A00 = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        EL6 el6 = this.A01;
        Bitmap bitmap = this.A00;
        C1F3 A00 = LI4.A00(el6.requireContext());
        try {
            OutputStream CHy = A00.CHy();
            if (bitmap != null) {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                C14360o3.A0A(CHy);
                AbstractC50673MYr.A00(compressFormat, bitmap, CHy);
            }
            A00.AIh();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C9GR.A07(this.A01.requireContext(), 2131953610);
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        super.onFinish();
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        EL6 el6 = this.A01;
        if (A1a) {
            AbstractC35075Fcm.A00(AbstractC166987dD.A0r(el6.A08), C05F.A1F);
            C9GR.A07(el6.requireContext(), 2131953607);
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E77("has_backup_codes", true);
            ARD.apply();
            return;
        }
        C9GR.A07(el6.requireContext(), 2131953610);
    }
}
