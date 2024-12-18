package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.4NJ, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4NJ extends C4NK implements C4NL {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public QuickPromotionSurface A06;
    public C4NZ A07;
    public C4NM A08;
    public C4NP A09;
    public C4NQ A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C4NJ c4nj = (C4NJ) obj;
            if (!C14360o3.A0K(this.A0E, c4nj.A0E) || !C14360o3.A0K(this.A0D, c4nj.A0D)) {
                return false;
            }
        }
        return true;
    }

    public final C117045Rn A00() {
        C117045Rn c117045Rn = new C117045Rn();
        c117045Rn.A05 = this.A0D;
        c117045Rn.A03 = this.A0C;
        c117045Rn.A04 = this.A0B;
        c117045Rn.A02 = Integer.valueOf(this.A00);
        c117045Rn.A07 = new ArrayList(CB6());
        c117045Rn.A0B = this.A0K;
        c117045Rn.A00 = this.A07;
        c117045Rn.A01 = this.A09;
        c117045Rn.A0A = this.A0J;
        c117045Rn.A08 = this.A0G;
        c117045Rn.A09 = this.A0M;
        c117045Rn.A0C = this.A0H;
        return c117045Rn;
    }

    @Override // X.C4NL
    public final java.util.Set CB6() {
        java.util.Set copyOf;
        List list = this.A0F;
        C14360o3.A0A(list);
        if (list.isEmpty()) {
            copyOf = Collections.emptySet();
        } else {
            copyOf = EnumSet.copyOf((Collection) this.A0F);
        }
        C14360o3.A0A(copyOf);
        return copyOf;
    }

    public final int hashCode() {
        return (this.A0E.hashCode() * 31) + this.A0D.hashCode();
    }

    public C4NJ(QuickPromotionSurface quickPromotionSurface, C4NM c4nm, C117045Rn c117045Rn, C4NQ c4nq, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        int i2;
        this.A08 = new C4NM();
        this.A09 = new C4NP();
        this.A0E = "";
        this.A0D = "";
        this.A0A = new C4NQ();
        this.A06 = QuickPromotionSurface.A0J;
        this.A03 = System.currentTimeMillis();
        this.A08 = c4nm;
        this.A09 = c117045Rn.A01;
        List list = c117045Rn.A07;
        this.A0F = list == null ? C16930sl.A00 : list;
        this.A0C = c117045Rn.A03;
        String str2 = c117045Rn.A05;
        C14360o3.A0B(str2, 0);
        this.A0D = str2;
        this.A06 = quickPromotionSurface;
        this.A0E = str;
        this.A04 = j;
        this.A02 = j2;
        this.A05 = j3;
        Integer num = c117045Rn.A02;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        this.A01 = i;
        this.A0A = c4nq;
        this.A0L = z;
        this.A0I = z2;
        this.A0B = c117045Rn.A04;
        this.A07 = c117045Rn.A00;
        this.A0J = c117045Rn.A0A;
        this.A0M = c117045Rn.A09;
        this.A0K = c117045Rn.A0B;
        this.A0H = c117045Rn.A0C;
        this.A0G = c117045Rn.A08;
    }

    public C4NJ() {
        this.A08 = new C4NM();
        this.A09 = new C4NP();
        this.A0E = "";
        this.A0D = "";
        this.A0A = new C4NQ();
        this.A06 = QuickPromotionSurface.A0J;
        this.A03 = System.currentTimeMillis();
    }
}
