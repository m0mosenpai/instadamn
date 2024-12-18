package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.MFd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50196MFd extends C0YY implements InterfaceC16820sZ {
    public static final C50196MFd A00 = new C50196MFd();

    public C50196MFd() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }
}
