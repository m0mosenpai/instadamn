package X;

/* renamed from: X.7oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173687oL implements InterfaceC179247xa {
    public Integer A00;

    @Override // X.InterfaceC179247xa
    public final boolean AOo() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C173687oL) obj).A00;
        }
        return true;
    }

    @Override // X.InterfaceC179247xa
    public final EnumC179217xX CBM() {
        return EnumC179217xX.A0M;
    }

    public final int hashCode() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "FRONT";
            } else {
                str = "BACK";
            }
            return str.hashCode() + intValue;
        }
        return 0;
    }
}
