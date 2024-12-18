package X;

import android.widget.Toast;
import com.facebook.react.modules.toast.ToastModule;

/* loaded from: classes10.dex */
public final class TQg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ToastModule A02;
    public final /* synthetic */ String A03;

    public TQg(ToastModule toastModule, String str, int i, int i2) {
        this.A02 = toastModule;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast makeText = Toast.makeText(AbstractC58321PtD.A0b(this.A02), this.A03, this.A00);
        makeText.setGravity(this.A01, 0, 0);
        makeText.show();
    }
}
