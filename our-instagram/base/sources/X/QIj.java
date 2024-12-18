package X;

/* loaded from: classes10.dex */
public final class QIj extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public QIj(String str, String str2, String str3, String str4, String str5, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A01 = str;
                this.A02 = str2;
                this.A04 = str3;
                this.A05 = str4;
                this.A03 = str5;
                return;
            case 1:
                AbstractC167017dG.A1P(str, str2);
                this.A01 = str;
                this.A05 = str2;
                this.A03 = str3;
                this.A04 = str4;
                this.A02 = str5;
                return;
            case 2:
                this.A05 = str;
                this.A04 = str2;
                this.A02 = str3;
                this.A03 = str4;
                this.A01 = str5;
                return;
            default:
                C14360o3.A0B(str, 1);
                this.A04 = str;
                this.A01 = str2;
                this.A02 = str3;
                this.A03 = str4;
                this.A05 = str5;
                return;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof QIj)) {
                        return false;
                    }
                    QIj qIj = (QIj) obj;
                    if (qIj.A00 != 0 || !C14360o3.A0K(this.A01, qIj.A01) || !C14360o3.A0K(this.A02, qIj.A02) || !C14360o3.A0K(this.A04, qIj.A04) || !C14360o3.A0K(this.A05, qIj.A05)) {
                        return false;
                    }
                    str = this.A03;
                    str2 = qIj.A03;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof QIj)) {
                        return false;
                    }
                    QIj qIj2 = (QIj) obj;
                    if (qIj2.A00 != 1 || !C14360o3.A0K(this.A01, qIj2.A01) || !C14360o3.A0K(this.A05, qIj2.A05) || !C14360o3.A0K(this.A03, qIj2.A03) || !C14360o3.A0K(this.A04, qIj2.A04)) {
                        return false;
                    }
                    str = this.A02;
                    str2 = qIj2.A02;
                    break;
                } else {
                    return true;
                }
                break;
            case 2:
                if (this != obj) {
                    if (!(obj instanceof QIj)) {
                        return false;
                    }
                    QIj qIj3 = (QIj) obj;
                    if (qIj3.A00 != 2 || !C14360o3.A0K(this.A05, qIj3.A05) || !C14360o3.A0K(this.A04, qIj3.A04) || !C14360o3.A0K(this.A02, qIj3.A02) || !C14360o3.A0K(this.A03, qIj3.A03)) {
                        return false;
                    }
                    str = this.A01;
                    str2 = qIj3.A01;
                    break;
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof QIj) {
                        QIj qIj4 = (QIj) obj;
                        if (qIj4.A00 == 3 && C14360o3.A0K(this.A04, qIj4.A04) && C14360o3.A0K(this.A01, qIj4.A01) && C14360o3.A0K(this.A02, qIj4.A02) && C14360o3.A0K(this.A03, qIj4.A03)) {
                            str = this.A05;
                            str2 = qIj4.A05;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0K;
        String str;
        switch (this.A00) {
            case 0:
                A0K = ((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
                str = this.A03;
                return A0K + AbstractC25227BEk.A07(str);
            case 1:
                A0K = (((AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
                str = this.A02;
                return A0K + AbstractC25227BEk.A07(str);
            case 2:
                return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A05)))));
            default:
                A0K = (((((AbstractC166987dD.A0J(this.A04) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
                str = this.A05;
                return A0K + AbstractC25227BEk.A07(str);
        }
    }
}
