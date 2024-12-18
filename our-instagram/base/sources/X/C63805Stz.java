package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: X.Stz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63805Stz implements InterfaceC65537Tm9 {
    @Override // X.InterfaceC65537Tm9
    public final /* bridge */ /* synthetic */ void AIC(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // X.InterfaceC65537Tm9
    public final Class Avg() {
        return InputStream.class;
    }

    @Override // X.InterfaceC65537Tm9
    public final /* bridge */ /* synthetic */ Object E2J(File file) {
        return new FileInputStream(file);
    }
}
