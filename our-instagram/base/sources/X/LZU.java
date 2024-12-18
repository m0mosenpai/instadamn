package X;

/* loaded from: classes8.dex */
public final class LZU implements InterfaceC66482zP {
    public final C45045Jwa A00;
    public final C45128JyU A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A0B;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        LZU lzu = (LZU) obj;
        String str2 = this.A01.A0B;
        if (lzu != null) {
            str = lzu.A01.A0B;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }

    public LZU(C45045Jwa c45045Jwa, C45128JyU c45128JyU) {
        this.A01 = c45128JyU;
        this.A00 = c45045Jwa;
    }
}
