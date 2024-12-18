package X;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: X.Sty, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63804Sty implements InterfaceC65537Tm9 {
    @Override // X.InterfaceC65537Tm9
    public final /* bridge */ /* synthetic */ void AIC(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // X.InterfaceC65537Tm9
    public final Class Avg() {
        return ParcelFileDescriptor.class;
    }

    @Override // X.InterfaceC65537Tm9
    public final /* bridge */ /* synthetic */ Object E2J(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
