package X;

import android.widget.Toast;
import com.facebook.react.modules.toast.ToastModule;

/* renamed from: X.TPu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64689TPu implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ToastModule A01;
    public final /* synthetic */ String A02;

    public RunnableC64689TPu(ToastModule toastModule, String str, int i) {
        this.A01 = toastModule;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(AbstractC58321PtD.A0b(this.A01), this.A02, this.A00).show();
    }
}
