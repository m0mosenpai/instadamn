package X;

import java.io.File;

/* renamed from: X.Su4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63810Su4 implements InterfaceC65477Tku {
    public final InterfaceC65537Tm9 A00;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        File file = (File) obj;
        return new SFV(new C63726Ssg(file), new C63768StO(this.A00, file));
    }

    public C63810Su4(InterfaceC65537Tm9 interfaceC65537Tm9) {
        this.A00 = interfaceC65537Tm9;
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        return true;
    }
}
