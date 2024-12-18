package X;

/* loaded from: classes6.dex */
public final class GH7 implements C7XU {
    public final int A00;
    public final Object A01;
    public final String A02;

    public GH7(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C7XU
    public final void DAy() {
        String str;
        if (this.A00 == 0) {
            C44293Jhj c44293Jhj = (C44293Jhj) this.A01;
            C60852q9 c60852q9 = (C60852q9) c44293Jhj.A06.getValue();
            String str2 = c44293Jhj.A05;
            if (str2 == null) {
                str = "surface";
            } else {
                String str3 = c44293Jhj.A04;
                if (str3 == null) {
                    str = "mechanism";
                } else {
                    c60852q9.A00(new EEA(str2, str3, this.A02));
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C7XU
    public final void DB3() {
        if (this.A00 != 0) {
            FKB fkb = (FKB) this.A01;
            String str = this.A02;
            C140966Yy A0r = AbstractC25225BEi.A0r(fkb.A00.requireActivity(), fkb.A01);
            A0r.A0E(C35028Fc1.A00(str).A02());
            A0r.A04();
        }
    }
}
