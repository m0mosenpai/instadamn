package X;

import androidx.profileinstaller.ProfileInstallReceiver;

/* renamed from: X.Sr3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63641Sr3 implements C08C {
    public final /* synthetic */ ProfileInstallReceiver A00;

    public C63641Sr3(ProfileInstallReceiver profileInstallReceiver) {
        this.A00 = profileInstallReceiver;
    }

    @Override // X.C08C
    public final void Dh5(int i, Object obj) {
        C08D.A01.Dh5(i, obj);
        this.A00.setResultCode(i);
    }
}
