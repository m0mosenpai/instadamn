package X;

/* renamed from: X.WhG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70800WhG implements InterfaceC66482zP, X8P {
    public final C38657Gyy A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A04;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70800WhG c70800WhG = (C70800WhG) obj;
        C14360o3.A0B(c70800WhG, 0);
        return C14360o3.A0K(this.A00, c70800WhG.A00);
    }

    public C70800WhG(C38657Gyy c38657Gyy) {
        this.A00 = c38657Gyy;
    }
}
