package X;

/* renamed from: X.Ioe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42316Ioe implements InterfaceC66482zP {
    public final C38680GzL A00;
    public final IDO A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public C42316Ioe(C38680GzL c38680GzL, IDO ido, String str) {
        this.A02 = str;
        this.A00 = c38680GzL;
        this.A01 = ido;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
