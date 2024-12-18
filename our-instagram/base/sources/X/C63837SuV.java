package X;

import android.content.res.Resources;
import java.io.InputStream;

/* renamed from: X.SuV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63837SuV implements InterfaceC65324Ti4 {
    public final Resources A00;

    @Override // X.InterfaceC65324Ti4
    public final InterfaceC65477Tku AEQ(C62954SYw c62954SYw) {
        return new C63817SuB(this.A00, c62954SYw.A00(android.net.Uri.class, InputStream.class));
    }

    public C63837SuV(Resources resources) {
        this.A00 = resources;
    }
}
