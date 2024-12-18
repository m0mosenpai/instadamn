package X;

import android.os.Environment;

/* renamed from: X.MFt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50212MFt extends C0YY implements InterfaceC16820sZ {
    public static final C50212MFt A00 = new C50212MFt();

    public C50212MFt() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Environment.getExternalStorageState();
    }
}
