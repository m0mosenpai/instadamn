package X;

/* renamed from: X.RBi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60591RBi extends C60592RBj {
    public final String A00;
    public final String A01;

    @Override // X.C60592RBj
    public final AbstractC910944l A00(AbstractC913445n abstractC913445n, String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.A01;
            StringBuilder A0r = AbstractC58318PtA.A0r(length, str2.length());
            if (str2.isEmpty()) {
                str = str.substring(1);
            } else {
                A0r.append(str2);
            }
            str = AbstractC166997dE.A0x(str, A0r);
        }
        return super.A00(abstractC913445n, str);
    }

    public C60591RBi(AbstractC910944l abstractC910944l, C44z c44z, C910844k c910844k) {
        super(abstractC910944l, c44z, c910844k);
        String name = abstractC910944l.A00.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.A01 = "";
            this.A00 = ".";
        } else {
            this.A00 = name.substring(0, lastIndexOf + 1);
            this.A01 = name.substring(0, lastIndexOf);
        }
    }
}
