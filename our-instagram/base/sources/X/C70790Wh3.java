package X;

/* renamed from: X.Wh3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70790Wh3 implements InterfaceC66482zP {
    public final C38321qM A00;
    public final C75113Zb A01;
    public final EnumC74373Vt A02;

    public C70790Wh3(C38321qM c38321qM, C75113Zb c75113Zb, EnumC74373Vt enumC74373Vt) {
        C14360o3.A0B(c75113Zb, 2);
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A02 = enumC74373Vt;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C70790Wh3 c70790Wh3 = (C70790Wh3) obj;
        String id = this.A00.getId();
        if (id != null) {
            if (c70790Wh3 != null) {
                str = c70790Wh3.A00.getId();
                if (str == null) {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                str = null;
            }
            return id.equals(str);
        }
        throw AbstractC166997dE.A0g();
    }
}
