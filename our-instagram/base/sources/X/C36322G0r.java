package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import java.io.File;

/* renamed from: X.G0r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36322G0r implements InterfaceC69913Ca {
    public final /* synthetic */ FragmentActivity A00;

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        C14360o3.A0B(file, 0);
        LJR.A02(this.A00, file, i);
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        C12260kU.A08(this.A00, intent, i);
    }

    public C36322G0r(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }
}
