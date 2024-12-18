package X;

import java.util.Collections;

/* renamed from: X.SuF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63821SuF implements InterfaceC65477Tku {
    public static final java.util.Set A01 = Collections.unmodifiableSet(AbstractC58319PtB.A13(new String[]{"file", "android.resource", "content"}));
    public final InterfaceC65325Ti5 A00;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new SFV(new C63726Ssg(uri), this.A00.AEO(uri));
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        return A01.contains(((android.net.Uri) obj).getScheme());
    }

    public C63821SuF(InterfaceC65325Ti5 interfaceC65325Ti5) {
        this.A00 = interfaceC65325Ti5;
    }
}
