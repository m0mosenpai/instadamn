package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1p3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37661p3 extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;
    public List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37661p3) {
                C37661p3 c37661p3 = (C37661p3) obj;
                if (!C14360o3.A0K(this.A05, c37661p3.A05) || this.A02 != c37661p3.A02 || this.A00 != c37661p3.A00 || this.A01 != c37661p3.A01 || !C14360o3.A0K(this.A03, c37661p3.A03) || !C14360o3.A0K(this.A04, c37661p3.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A05.hashCode() * 31) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SurfaceContent(storiesItems=");
        sb.append(this.A05);
        sb.append(", nextAdRequestIndex=");
        sb.append(this.A02);
        sb.append(", adsPoolThreshold=");
        sb.append(this.A00);
        sb.append(", earliestRequestPosition=");
        sb.append(this.A01);
        sb.append(", calculationStrategy=");
        sb.append(this.A03);
        sb.append(", deliverySource=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C37661p3() {
        ArrayList arrayList = new ArrayList();
        String str = EnumC37671p4.A04.A00;
        C14360o3.A0B(str, 5);
        this.A05 = arrayList;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = str;
        this.A04 = "cross_session";
    }
}
