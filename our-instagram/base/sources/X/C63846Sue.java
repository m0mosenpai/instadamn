package X;

import android.content.ContentResolver;

/* renamed from: X.Sue, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63846Sue implements InterfaceC65324Ti4, InterfaceC65325Ti5 {
    public final ContentResolver A00;

    @Override // X.InterfaceC65325Ti5
    public final InterfaceC65570Tn3 AEO(android.net.Uri uri) {
        return new AbstractC63763StJ(this.A00, uri);
    }

    @Override // X.InterfaceC65324Ti4
    public final InterfaceC65477Tku AEQ(C62954SYw c62954SYw) {
        return new C63821SuF(this);
    }

    public C63846Sue(ContentResolver contentResolver) {
        this.A00 = contentResolver;
    }
}
