package X;

/* renamed from: X.9CQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CQ extends C0T6 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9CQ(int r9) {
        /*
            r8 = this;
            r0 = r8
            r8.A06 = r9
            if (r9 == 0) goto L11
            java.lang.String r1 = ""
            r4 = 2
        L8:
            r2 = r1
            r3 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L11:
            r1 = 0
            r4 = 0
            r8.A06 = r4
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CQ.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        C9CQ c9cq;
        String str;
        String str2;
        switch (this.A06) {
            case 0:
                if (this != obj) {
                    if (obj instanceof C9CQ) {
                        c9cq = (C9CQ) obj;
                        if (c9cq.A06 == 0 && C14360o3.A0K(this.A01, c9cq.A01) && C14360o3.A0K(this.A03, c9cq.A03) && C14360o3.A0K(this.A02, c9cq.A02) && C14360o3.A0K(this.A05, c9cq.A05)) {
                            str = this.A00;
                            str2 = c9cq.A00;
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
            case 1:
                if (this != obj) {
                    if (obj instanceof C9CQ) {
                        c9cq = (C9CQ) obj;
                        if (c9cq.A06 == 1 && C14360o3.A0K(this.A03, c9cq.A03) && C14360o3.A0K(this.A02, c9cq.A02) && C14360o3.A0K(this.A01, c9cq.A01) && C14360o3.A0K(this.A00, c9cq.A00)) {
                            str = this.A05;
                            str2 = c9cq.A05;
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
            default:
                return super.equals(obj);
        }
        if (!C14360o3.A0K(str, str2) || !C14360o3.A0K(this.A04, c9cq.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        switch (this.A06) {
            case 0:
                String str = this.A01;
                int i = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i2 = hashCode * 31;
                String str2 = this.A03;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i3 = (i2 + hashCode2) * 31;
                String str3 = this.A02;
                if (str3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str3.hashCode();
                }
                int i4 = (i3 + hashCode3) * 31;
                String str4 = this.A05;
                if (str4 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = str4.hashCode();
                }
                int i5 = (i4 + hashCode4) * 31;
                String str5 = this.A00;
                if (str5 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str5.hashCode();
                }
                int i6 = (i5 + hashCode5) * 31;
                String str6 = this.A04;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                return i6 + i;
            case 1:
                return (((((((((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode();
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A06) {
            case 0:
                sb = new StringBuilder();
                str2 = "AdMetaId(adId=";
                sb.append(str2);
                sb.append(this.A01);
                sb.append(", campaignId=");
                sb.append(this.A03);
                sb.append(", appId=");
                sb.append(this.A02);
                sb.append(AbstractC111324zv.A00(1441));
                sb.append(this.A05);
                sb.append(", actorId=");
                sb.append(this.A00);
                str = AbstractC43591JPw.A00(231);
                break;
            case 1:
                sb = new StringBuilder();
                sb.append("FooterAfiRenderingData(controlText=");
                sb.append(this.A03);
                sb.append(", controlIcon=");
                sb.append(this.A02);
                sb.append(", confirmationText=");
                sb.append(this.A01);
                sb.append(", confirmationIcon=");
                sb.append(this.A00);
                sb.append(", undoText=");
                sb.append(this.A05);
                str = ", undoConfirmationText=";
                break;
            default:
                sb = new StringBuilder();
                str2 = "AdMetaIdDataModel(adId=";
                sb.append(str2);
                sb.append(this.A01);
                sb.append(", campaignId=");
                sb.append(this.A03);
                sb.append(", appId=");
                sb.append(this.A02);
                sb.append(AbstractC111324zv.A00(1441));
                sb.append(this.A05);
                sb.append(", actorId=");
                sb.append(this.A00);
                str = AbstractC43591JPw.A00(231);
                break;
        }
        sb.append(str);
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C9CQ(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        this.A06 = i;
        switch (i) {
            case 0:
                this.A01 = str;
                this.A03 = str2;
                this.A02 = str3;
                this.A05 = str4;
                this.A00 = str5;
                break;
            case 1:
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str2, 2);
                C14360o3.A0B(str3, 3);
                C14360o3.A0B(str4, 4);
                C14360o3.A0B(str5, 5);
                C14360o3.A0B(str6, 6);
                this.A03 = str;
                this.A02 = str2;
                this.A01 = str3;
                this.A00 = str4;
                this.A05 = str5;
                break;
            default:
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str2, 2);
                C14360o3.A0B(str3, 3);
                C14360o3.A0B(str4, 4);
                C14360o3.A0B(str5, 5);
                C14360o3.A0B(str6, 6);
                this.A01 = str;
                this.A03 = str2;
                this.A02 = str3;
                this.A05 = str4;
                this.A00 = str5;
                break;
        }
        this.A04 = str6;
    }
}
