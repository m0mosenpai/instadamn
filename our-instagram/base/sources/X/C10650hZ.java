package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.0hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10650hZ extends AbstractC004301i {
    public final /* synthetic */ C0NK A00;

    public C10650hZ(C0NK c0nk) {
        this.A00 = c0nk;
    }

    @Override // X.AbstractC004301i
    public final /* bridge */ /* synthetic */ Object A00() {
        return new InterfaceC04650Mh() { // from class: X.09T
            @Override // X.InterfaceC04650Mh
            public final C07920bC ALA(File file, int i) {
                C0NK c0nk = C10650hZ.this.A00;
                C0NK c0nk2 = C0NK.A0k;
                if (c0nk.A0f) {
                    try {
                        C07920bC c07920bC = new C07920bC(file, i);
                        c07920bC.mlockBuffer();
                        return c07920bC;
                    } catch (IOException e) {
                        C0PC.A00().DEh("MLockedFileCreate", e, null);
                        C0K8.A0H("lacrima", "Failed to initialize mlocked file, using fallback", e);
                    }
                }
                try {
                    return new C07920bC(file, i);
                } catch (IOException e2) {
                    C0PC.A00().DEh("SimpleMappedFileCreate", e2, null);
                    C0K8.A0H("lacrima", "Failed to initialize mapped file", e2);
                    return null;
                }
            }
        };
    }
}
