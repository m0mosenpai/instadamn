package X;

import java.io.File;

/* renamed from: X.9QI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9QI extends C0YY implements InterfaceC16620sF {
    public static final C9QI A00 = new C9QI();

    public C9QI() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        C14360o3.A0A(file);
        long lastModified = file.lastModified();
        C14360o3.A0A(file2);
        return Integer.valueOf((lastModified > file2.lastModified() ? 1 : (lastModified == file2.lastModified() ? 0 : -1)));
    }
}
