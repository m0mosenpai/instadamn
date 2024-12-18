package X;

import java.io.File;

/* renamed from: X.LSa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48125LSa implements InterfaceC58742mX {
    public static final C48125LSa A00 = new C48125LSa();

    @Override // X.InterfaceC58742mX
    public final /* bridge */ /* synthetic */ Object AK1(File file) {
        if (file == null) {
            return null;
        }
        return android.net.Uri.fromFile(file).getPath();
    }
}
