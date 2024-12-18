package X;

/* loaded from: classes8.dex */
public final class LZZ implements InterfaceC66482zP {
    public final C45097JxR A00;
    public final AnonymousClass781 A01;
    public final String A02;

    public LZZ(C45097JxR c45097JxR, AnonymousClass781 anonymousClass781, String str) {
        C14360o3.A0B(str, 3);
        this.A01 = anonymousClass781;
        this.A00 = c45097JxR;
        this.A02 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
