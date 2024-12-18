package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NVh extends AbstractC53534Nm0 {
    public final String A00;
    public final List A01;

    public final EnumC53249Ngn A00() {
        EnumC53249Ngn enumC53249Ngn = (EnumC53249Ngn) AbstractC001800i.A0J(this.A01);
        if (enumC53249Ngn == null) {
            return EnumC53249Ngn.A0W;
        }
        return enumC53249Ngn;
    }

    public NVh(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Unavailable(unavailableReasons=");
        A1C.append(this.A01);
        A1C.append(AbstractC58317Pt9.A00(59));
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
