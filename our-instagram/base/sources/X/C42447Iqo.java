package X;

import com.instagram.api.schemas.UrpRendererType;

/* renamed from: X.Iqo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42447Iqo implements InterfaceC43450JHo {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC43450JHo
    public final String Anz() {
        return this.A01;
    }

    @Override // X.InterfaceC43450JHo
    public final Integer Bms() {
        return this.A00;
    }

    @Override // X.InterfaceC43450JHo
    public final String Bmu() {
        return this.A02;
    }

    @Override // X.InterfaceC43450JHo
    public final String C5f() {
        return this.A03;
    }

    public C42447Iqo(InterfaceC105004oG interfaceC105004oG) {
        String str;
        String str2;
        UrpRendererType Bmq;
        this.A01 = interfaceC105004oG.Anz();
        InterfaceC43564JLy BQX = interfaceC105004oG.BQX();
        Integer num = null;
        if (BQX != null) {
            str = BQX.Bmu();
        } else {
            str = null;
        }
        this.A02 = str;
        InterfaceC43564JLy BQX2 = interfaceC105004oG.BQX();
        if (BQX2 != null) {
            str2 = BQX2.C5f();
        } else {
            str2 = null;
        }
        this.A03 = str2;
        InterfaceC43564JLy BQX3 = interfaceC105004oG.BQX();
        if (BQX3 != null && (Bmq = BQX3.Bmq()) != null) {
            int ordinal = Bmq.ordinal();
            if (ordinal != 1) {
                if (ordinal == 3) {
                    num = C05F.A00;
                }
            } else {
                num = C05F.A01;
            }
        }
        this.A00 = num;
    }
}
