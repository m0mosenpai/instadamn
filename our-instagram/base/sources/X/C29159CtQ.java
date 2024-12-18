package X;

/* renamed from: X.CtQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29159CtQ implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    public C29159CtQ(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
