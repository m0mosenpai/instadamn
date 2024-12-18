package X;

/* loaded from: classes8.dex */
public final class LZY implements InterfaceC66482zP {
    public final C38321qM A00;
    public final C75113Zb A01;
    public final EnumC74373Vt A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZY lzy = (LZY) obj;
        C14360o3.A0B(lzy, 0);
        String id = this.A00.getId();
        if (id == null) {
            id = "";
        }
        String id2 = lzy.A00.getId();
        if (id2 == null) {
            id2 = "";
        }
        return id.equals(id2);
    }

    public LZY(C38321qM c38321qM, C75113Zb c75113Zb, EnumC74373Vt enumC74373Vt) {
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A02 = enumC74373Vt;
    }
}
