package X;

/* renamed from: X.Q9m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58791Q9m extends AbstractC61597RqM {
    public int A00;
    public int A01;
    public String A02;
    public C63135Sdg[] A03;

    public AbstractC58791Q9m(AbstractC58791Q9m abstractC58791Q9m) {
        this.A03 = null;
        this.A01 = 0;
        this.A02 = abstractC58791Q9m.A02;
        this.A00 = abstractC58791Q9m.A00;
        C63135Sdg[] c63135SdgArr = abstractC58791Q9m.A03;
        int length = c63135SdgArr.length;
        C63135Sdg[] c63135SdgArr2 = new C63135Sdg[length];
        for (int i = 0; i < length; i++) {
            c63135SdgArr2[i] = new C63135Sdg(c63135SdgArr[i]);
        }
        this.A03 = c63135SdgArr2;
    }

    public C63135Sdg[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(C63135Sdg[] c63135SdgArr) {
        int length;
        int length2;
        C63135Sdg[] c63135SdgArr2 = this.A03;
        if (c63135SdgArr2 != null && c63135SdgArr != null && (length = c63135SdgArr2.length) == (length2 = c63135SdgArr.length)) {
            for (int i = 0; i < length; i++) {
                if (c63135SdgArr2[i].A00 == c63135SdgArr[i].A00 && c63135SdgArr2[i].A01.length == c63135SdgArr[i].A01.length) {
                }
            }
            for (int i2 = 0; i2 < length2; i2++) {
                c63135SdgArr2[i2].A00 = c63135SdgArr[i2].A00;
                for (int i3 = 0; i3 < c63135SdgArr[i2].A01.length; i3++) {
                    c63135SdgArr2[i2].A01[i3] = c63135SdgArr[i2].A01[i3];
                }
            }
            return;
        }
        int length3 = c63135SdgArr.length;
        C63135Sdg[] c63135SdgArr3 = new C63135Sdg[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            c63135SdgArr3[i4] = new C63135Sdg(c63135SdgArr[i4]);
        }
        this.A03 = c63135SdgArr3;
    }

    public AbstractC58791Q9m() {
        this.A03 = null;
        this.A01 = 0;
    }
}
