package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V80 extends AbstractC33588Et0 {
    public ImageUrl A00;
    public ImageUrl A01;
    public VE7 A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0H = false;
    public List A0G = new ArrayList(0);

    public final int hashCode() {
        int i;
        int i2 = 0;
        int A06 = (((((((((((((((((((((((((((((this.A0H ? 1 : 0) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC31177DnL.A04(this.A0B)) * 31) + AbstractC31177DnL.A04(this.A0C)) * 31) + AbstractC31177DnL.A04(this.A0D)) * 31) + AbstractC31177DnL.A04(this.A0E)) * 31) + AbstractC31177DnL.A04(this.A0F)) * 31) + AbstractC31177DnL.A04(this.A05)) * 31) + AbstractC31177DnL.A04(this.A09)) * 31) + AbstractC31177DnL.A04(this.A08)) * 31) + AbstractC31177DnL.A04(this.A0A)) * 31) + AbstractC31177DnL.A04(this.A07)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31;
        List list = this.A0G;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int A062 = (((A06 + i) * 31) + AbstractC25235BEs.A06(this.A00)) * 31;
        String str = this.A06;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A062 + i2;
    }
}
