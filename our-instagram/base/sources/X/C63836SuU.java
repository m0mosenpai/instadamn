package X;

import android.content.res.Resources;
import android.os.ParcelFileDescriptor;

/* renamed from: X.SuU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63836SuU implements InterfaceC65324Ti4 {
    public final Resources A00;

    @Override // X.InterfaceC65324Ti4
    public final InterfaceC65477Tku AEQ(C62954SYw c62954SYw) {
        return new C63817SuB(this.A00, c62954SYw.A00(android.net.Uri.class, ParcelFileDescriptor.class));
    }

    public C63836SuU(Resources resources) {
        this.A00 = resources;
    }
}
