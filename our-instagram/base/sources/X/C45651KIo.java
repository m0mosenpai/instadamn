package X;

/* renamed from: X.KIo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45651KIo extends C4F4 {
    public final long A00;
    public final String A01;
    public final boolean A02;

    public C45651KIo(long j, String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = z;
        this.A00 = j;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45651KIo c45651KIo = (C45651KIo) obj;
        C14360o3.A0B(c45651KIo, 0);
        if (C14360o3.A0K(this.A01, c45651KIo.A01) && this.A02 == c45651KIo.A02 && this.A00 == c45651KIo.A00) {
            return true;
        }
        return false;
    }
}
