package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.7XL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7XL implements InterfaceC69913Ca {
    public InterfaceC69973Cg A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC16820sZ A03;

    public C7XL(Fragment fragment, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(fragment, 1);
        C14360o3.A0B(interfaceC16820sZ, 3);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC69913Ca
    public final void CKE(Intent intent) {
        C14360o3.A0B(intent, 0);
        ((InterfaceC165327aL) this.A03.invoke()).FD7(intent);
    }

    @Override // X.InterfaceC69913Ca
    public final void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        C14360o3.A0B(file, 0);
        LJR.A03(this.A01, file, i);
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        C12260kU.A06(this.A01, intent, i);
    }
}
