package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;

/* renamed from: X.SuT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63835SuT implements InterfaceC65324Ti4 {
    public final Resources A00;

    @Override // X.InterfaceC65324Ti4
    public final InterfaceC65477Tku AEQ(C62954SYw c62954SYw) {
        return new C63817SuB(this.A00, c62954SYw.A00(android.net.Uri.class, AssetFileDescriptor.class));
    }

    public C63835SuT(Resources resources) {
        this.A00 = resources;
    }
}
