package X;

/* renamed from: X.REp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60630REp extends RlA {
    public final EnumC61103RfI A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RlA)) {
                return false;
            }
            C60630REp c60630REp = (C60630REp) ((RlA) obj);
            if (!this.A01.equals(c60630REp.A01) || !this.A00.equals(c60630REp.A00)) {
                return false;
            }
        }
        return true;
    }

    public C60630REp(EnumC61103RfI enumC61103RfI, Object obj) {
        if (obj != null) {
            this.A01 = obj;
            this.A00 = enumC61103RfI;
            return;
        }
        throw AbstractC166987dD.A15("Null payload");
    }

    public final int hashCode() {
        return (((-721379959) ^ this.A01.hashCode()) * 1000003) ^ this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Event{code=");
        A1C.append((Object) null);
        A1C.append(", payload=");
        A1C.append(this.A01);
        A1C.append(", priority=");
        return JQ0.A0l(this.A00, A1C);
    }
}
