package X;

import androidx.fragment.app.Fragment;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;

/* renamed from: X.M6c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50013M6c implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC50380MMi A01;
    public final /* synthetic */ GoogleAuthController A02;
    public final /* synthetic */ L69 A03;
    public final /* synthetic */ boolean A04;

    public RunnableC50013M6c(Fragment fragment, InterfaceC50380MMi interfaceC50380MMi, GoogleAuthController googleAuthController, L69 l69, boolean z) {
        this.A03 = l69;
        this.A01 = interfaceC50380MMi;
        this.A00 = fragment;
        this.A02 = googleAuthController;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A00(this.A00, this.A02, (Exception) ((C45130JyW) this.A01).A01);
    }
}
