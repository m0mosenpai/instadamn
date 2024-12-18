package X;

/* renamed from: X.LZc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48303LZc implements InterfaceC66482zP {
    public final int A00;
    public final String A01;
    public final boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "spam_folder_row";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48303LZc c48303LZc = (C48303LZc) obj;
        C14360o3.A0B(c48303LZc, 0);
        if (C14360o3.A0K(this.A01, c48303LZc.A01) && this.A00 == c48303LZc.A00 && this.A02 == c48303LZc.A02) {
            return true;
        }
        return false;
    }

    public C48303LZc(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
