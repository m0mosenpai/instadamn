package X;

/* loaded from: classes4.dex */
public final class ACB {
    public int A00;
    public final InterfaceC197718oi A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if ((obj instanceof ACB) && ((ACB) obj).A01.getTextureId() == this.A01.getTextureId()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.getTextureId();
    }

    public ACB(InterfaceC197718oi interfaceC197718oi, String str) {
        this.A02 = str;
        this.A01 = interfaceC197718oi;
    }
}
