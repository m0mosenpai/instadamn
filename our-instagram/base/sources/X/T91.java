package X;

/* loaded from: classes10.dex */
public final class T91 implements InterfaceC65430Tk1 {
    public final RVD A00;
    public final C58526Pwu A01;

    public static T91 A00(RVD keyTemplate) {
        String str = keyTemplate.typeUrl_;
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                throw AbstractC58318PtA.A0x(AnonymousClass001.A0C("Not a printable ASCII character: ", charAt));
            }
        }
        return new T91(keyTemplate, new C58526Pwu(bArr, bArr.length));
    }

    @Override // X.InterfaceC65430Tk1
    public final C58526Pwu BYW() {
        return this.A01;
    }

    public T91(RVD keyTemplate, C58526Pwu objectIdentifier) {
        this.A00 = keyTemplate;
        this.A01 = objectIdentifier;
    }
}
