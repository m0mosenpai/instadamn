package X;

/* loaded from: classes12.dex */
public abstract class YAA implements YPZ {
    public final int A00;
    public final Y0B A01;
    public final C72675Xku A02;
    public final YQO A03;
    public final String A04;
    public final int[] A05;
    public final Object[] A06;
    public final String[] A07;
    public final String[] A08;

    @Override // X.YPZ
    public YPZ EP1(Boolean bool, int i) {
        if (bool == null) {
            A00(2);
            return this;
        }
        this.A06[2] = bool;
        return this;
    }

    public YPZ A00(int i) {
        this.A06[i] = null;
        return this;
    }

    @Override // X.YPZ
    public YPZ EOz(Long l, int i) {
        if (l == null) {
            A00(i);
            return this;
        }
        this.A06[i] = l;
        return this;
    }

    @Override // X.YPZ
    public YPZ EP0(String str, int i) {
        if (str == null) {
            A00(i);
            return this;
        }
        this.A06[i] = str;
        return this;
    }

    public YAA(C72675Xku c72675Xku, Xkw xkw, YQO yqo, Object[] objArr) {
        Y0B y0b;
        this.A03 = yqo;
        this.A02 = c72675Xku;
        synchronized (xkw) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            String[] strArr = (String[]) objArr[4];
            String[] strArr2 = (String[]) objArr[2];
            String str3 = (String) objArr[6];
            C005001p c005001p = xkw.A00;
            y0b = (Y0B) c005001p.get(str);
            if (y0b == null) {
                y0b = new Y0B(str2, str3, strArr, strArr2);
                c005001p.put(str, y0b);
            }
        }
        this.A01 = y0b;
        String[] strArr3 = (String[]) objArr[2];
        this.A07 = strArr3;
        this.A00 = AbstractC166987dD.A0H(objArr[3]);
        this.A08 = (String[]) objArr[4];
        this.A05 = (int[]) objArr[5];
        int A0H = AbstractC166987dD.A0H(objArr[7]);
        String str4 = (String) objArr[8];
        this.A04 = str4;
        this.A06 = new Object[str4 == null ? strArr3.length + A0H : AbstractC166987dD.A0H(objArr[9])];
    }
}
