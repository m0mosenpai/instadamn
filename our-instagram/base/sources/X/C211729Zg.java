package X;

/* renamed from: X.9Zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211729Zg extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C211729Zg(String str, String str2, String str3, int i) {
        AbstractC167017dG.A1Q(str, str2);
        C14360o3.A0B(str3, 4);
        this.A04 = str;
        this.A01 = i;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C211729Zg) {
                C211729Zg c211729Zg = (C211729Zg) obj;
                if (c211729Zg.A00 != 0 || !C14360o3.A0K(this.A04, c211729Zg.A04) || this.A01 != c211729Zg.A01 || !C14360o3.A0K(this.A02, c211729Zg.A02) || !C14360o3.A0K(this.A03, c211729Zg.A03)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        return AbstractC166997dE.A0K(this.A02, (AbstractC166987dD.A0J(this.A04) + this.A01) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (i != 0) {
            A1C.append("RemixPivotPageArguments(mediaId=");
            A1C.append(this.A02);
            A1C.append(", mediaTapToken=");
            A1C.append(this.A03);
            A1C.append(", tappedMediaPosition=");
            A1C.append(this.A01);
            A1C.append(", tappedMediaId=");
            str = this.A04;
        } else {
            A1C.append("SFXAudio(localFilePath=");
            A1C.append(this.A04);
            A1C.append(", durationMs=");
            A1C.append(this.A01);
            A1C.append(", audioAssetId=");
            A1C.append(this.A02);
            A1C.append(AbstractC111324zv.A00(1402));
            str = this.A03;
        }
        A1C.append(str);
        return AbstractC167017dG.A0p(A1C);
    }

    public C211729Zg(String str, String str2, String str3, int i, int i2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i;
        this.A04 = str3;
    }
}
