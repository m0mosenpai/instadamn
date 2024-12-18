package X;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ACJ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final EnumC200808uN A04;
    public final EnumC200938ua A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACJ)) {
            return false;
        }
        ACJ acj = (ACJ) obj;
        return this.A02.equals(acj.A02) && this.A01.equals(acj.A01) && this.A00.equals(acj.A00) && this.A04.equals(acj.A04) && this.A05.equals(acj.A05) && this.A03.equals(acj.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, this.A04, this.A03});
    }

    public ACJ(String str, String str2, String str3, Map map, EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A04 = enumC200808uN;
        this.A05 = enumC200938ua;
        this.A03 = map;
    }
}
