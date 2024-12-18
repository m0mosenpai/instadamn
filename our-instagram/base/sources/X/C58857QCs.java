package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.QCs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58857QCs extends AbstractC40011tS {
    public static AbstractC40011tS A00;

    @Override // X.AbstractC40011tS
    public final /* bridge */ /* synthetic */ AbstractC40721uf A03(Object obj) {
        File file = (File) obj;
        try {
            return new C58856QCr(this, file);
        } catch (IOException e) {
            throw new RuntimeException(AbstractC167017dG.A0n(file, "Unexpected error, failed to create file: ", AbstractC166987dD.A1C()), e);
        }
    }
}
