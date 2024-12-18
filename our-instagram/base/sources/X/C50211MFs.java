package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.MFs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50211MFs extends C0YY implements InterfaceC16820sZ {
    public static final C50211MFs A00 = new C50211MFs();

    public C50211MFs() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }
}
