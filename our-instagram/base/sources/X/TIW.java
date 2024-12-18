package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.dextricks.Constants;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class TIW implements Cloneable {
    public int A01;
    public int A02;
    public int A03;
    public int A06;
    public Resources.Theme A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public boolean A0H;
    public boolean A0J;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public float A00 = 1.0f;
    public S9K A0E = S9K.A00;
    public EnumC61107RfN A0B = EnumC61107RfN.NORMAL;
    public boolean A0I = true;
    public int A04 = -1;
    public int A05 = -1;
    public InterfaceC65617To8 A0C = C63730Ssk.A00;
    public boolean A0L = true;
    public C63729Ssj A0D = new C63729Ssj();
    public Map A0G = new C005001p(0);
    public Class A0F = Object.class;
    public boolean A0K = true;

    public final TIW A04() {
        if (this.A0H) {
            return clone().A04();
        }
        this.A0O = true;
        this.A03 |= 1048576;
        A0G();
        return this;
    }

    public final TIW A03() {
        if (this.A0H) {
            return clone().A03();
        }
        this.A0I = false;
        this.A03 |= 256;
        A0G();
        return this;
    }

    public final TIW A05(int i, int i2) {
        if (this.A0H) {
            return clone().A05(i, i2);
        }
        this.A05 = i;
        this.A04 = i2;
        this.A03 |= 512;
        A0G();
        return this;
    }

    public final TIW A06(Drawable drawable) {
        if (this.A0H) {
            return clone().A06(drawable);
        }
        this.A09 = drawable;
        int i = this.A03 | 8192;
        this.A02 = 0;
        this.A03 = i & (-16385);
        A0G();
        return this;
    }

    public final TIW A07(EnumC61107RfN enumC61107RfN) {
        if (this.A0H) {
            return clone().A07(enumC61107RfN);
        }
        Rs8.A00(enumC61107RfN);
        this.A0B = enumC61107RfN;
        this.A03 |= 8;
        A0G();
        return this;
    }

    public final TIW A08(InterfaceC65617To8 interfaceC65617To8) {
        if (this.A0H) {
            return clone().A08(interfaceC65617To8);
        }
        Rs8.A00(interfaceC65617To8);
        this.A0C = interfaceC65617To8;
        this.A03 |= 1024;
        A0G();
        return this;
    }

    public final TIW A09(C62997SaL c62997SaL, Object obj) {
        if (this.A0H) {
            return clone().A09(c62997SaL, obj);
        }
        Rs8.A00(c62997SaL);
        Rs8.A00(obj);
        this.A0D.A00.put(c62997SaL, obj);
        A0G();
        return this;
    }

    public final TIW A0A(InterfaceC65632Tpt interfaceC65632Tpt, SNC snc) {
        if (this.A0H) {
            return clone().A0A(interfaceC65632Tpt, snc);
        }
        C62997SaL c62997SaL = SNC.A00;
        Rs8.A00(snc);
        A09(c62997SaL, snc);
        return A0D(interfaceC65632Tpt, false);
    }

    public final TIW A0B(InterfaceC65632Tpt interfaceC65632Tpt, SNC snc) {
        if (this.A0H) {
            return clone().A0B(interfaceC65632Tpt, snc);
        }
        C62997SaL c62997SaL = SNC.A00;
        Rs8.A00(snc);
        A09(c62997SaL, snc);
        return A0D(interfaceC65632Tpt, true);
    }

    public final TIW A0C(InterfaceC65632Tpt interfaceC65632Tpt, Class cls, boolean z) {
        if (this.A0H) {
            return clone().A0C(interfaceC65632Tpt, cls, z);
        }
        Rs8.A00(cls);
        Rs8.A00(interfaceC65632Tpt);
        this.A0G.put(cls, interfaceC65632Tpt);
        int i = this.A03 | C3OO.FLAG_MOVED;
        this.A0L = true;
        int i2 = i | Constants.LOAD_RESULT_PGO_ATTEMPTED;
        this.A03 = i2;
        this.A0K = false;
        if (z) {
            this.A03 = i2 | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            this.A0M = true;
        }
        A0G();
        return this;
    }

    public final TIW A0D(InterfaceC65632Tpt interfaceC65632Tpt, boolean z) {
        if (this.A0H) {
            return clone().A0D(interfaceC65632Tpt, z);
        }
        C63757StD c63757StD = new C63757StD(interfaceC65632Tpt, z);
        A0C(interfaceC65632Tpt, Bitmap.class, z);
        A0C(c63757StD, Drawable.class, z);
        A0C(c63757StD, BitmapDrawable.class, z);
        A0C(new C63756StC(interfaceC65632Tpt), Q2P.class, z);
        A0G();
        return this;
    }

    public final TIW A0E(S9K s9k) {
        if (this.A0H) {
            return clone().A0E(s9k);
        }
        Rs8.A00(s9k);
        this.A0E = s9k;
        this.A03 |= 4;
        A0G();
        return this;
    }

    public final TIW A0F(Class cls) {
        if (this.A0H) {
            return clone().A0F(cls);
        }
        Rs8.A00(cls);
        this.A0F = cls;
        this.A03 |= 4096;
        A0G();
        return this;
    }

    public final void A0G() {
        if (!this.A0J) {
        } else {
            throw AbstractC166987dD.A14("You cannot modify locked T, consider clone()");
        }
    }

    public TIW A0I(TIW tiw) {
        if (this.A0H) {
            return clone().A0I(tiw);
        }
        int i = tiw.A03;
        if ((i & 2) != 0) {
            this.A00 = tiw.A00;
        }
        if ((262144 & i) != 0) {
            this.A0P = tiw.A0P;
        }
        if ((1048576 & i) != 0) {
            this.A0O = tiw.A0O;
        }
        if ((i & 4) != 0) {
            this.A0E = tiw.A0E;
        }
        if ((i & 8) != 0) {
            this.A0B = tiw.A0B;
        }
        if (AbstractC167007dF.A1M(i & 16)) {
            this.A08 = tiw.A08;
            this.A01 = 0;
            this.A03 &= -33;
        }
        if (AbstractC167007dF.A1M(tiw.A03 & 32)) {
            this.A01 = tiw.A01;
            this.A08 = null;
            this.A03 &= -17;
        }
        if ((tiw.A03 & 64) != 0) {
            this.A0A = tiw.A0A;
            this.A06 = 0;
            this.A03 &= -129;
        }
        if ((tiw.A03 & 128) != 0) {
            this.A06 = tiw.A06;
            this.A0A = null;
            this.A03 &= -65;
        }
        int i2 = tiw.A03;
        if ((256 & i2) != 0) {
            this.A0I = tiw.A0I;
        }
        if ((512 & i2) != 0) {
            this.A05 = tiw.A05;
            this.A04 = tiw.A04;
        }
        if ((1024 & i2) != 0) {
            this.A0C = tiw.A0C;
        }
        if ((4096 & i2) != 0) {
            this.A0F = tiw.A0F;
        }
        if ((i2 & 8192) != 0) {
            this.A09 = tiw.A09;
            this.A02 = 0;
            this.A03 &= -16385;
        }
        if ((tiw.A03 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            this.A02 = tiw.A02;
            this.A09 = null;
            this.A03 &= -8193;
        }
        int i3 = tiw.A03;
        if ((32768 & i3) != 0) {
            this.A07 = tiw.A07;
        }
        if ((65536 & i3) != 0) {
            this.A0L = tiw.A0L;
        }
        if ((131072 & i3) != 0) {
            this.A0M = tiw.A0M;
        }
        if ((i3 & C3OO.FLAG_MOVED) != 0) {
            this.A0G.putAll(tiw.A0G);
            this.A0K = tiw.A0K;
        }
        if ((tiw.A03 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            this.A0N = tiw.A0N;
        }
        if (!this.A0L) {
            this.A0G.clear();
            int i4 = this.A03 & (-2049);
            this.A0M = false;
            this.A03 = i4 & (-131073);
            this.A0K = true;
        }
        this.A03 |= tiw.A03;
        this.A0D.A00.A09(tiw.A0D.A00);
        A0G();
        return this;
    }

    public boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        if (!(obj instanceof TIW)) {
            return false;
        }
        TIW tiw = (TIW) obj;
        if (Float.compare(tiw.A00, this.A00) != 0 || this.A01 != tiw.A01) {
            return false;
        }
        Drawable drawable = this.A08;
        Drawable drawable2 = tiw.A08;
        if (drawable == null) {
            equals = AbstractC25229BEm.A1Z(drawable2);
        } else {
            equals = drawable.equals(drawable2);
        }
        if (!equals || this.A06 != tiw.A06) {
            return false;
        }
        Drawable drawable3 = this.A0A;
        Drawable drawable4 = tiw.A0A;
        if (drawable3 == null) {
            equals2 = AbstractC25229BEm.A1Z(drawable4);
        } else {
            equals2 = drawable3.equals(drawable4);
        }
        if (!equals2 || this.A02 != tiw.A02) {
            return false;
        }
        Drawable drawable5 = this.A09;
        Drawable drawable6 = tiw.A09;
        if (drawable5 == null) {
            equals3 = AbstractC25229BEm.A1Z(drawable6);
        } else {
            equals3 = drawable5.equals(drawable6);
        }
        if (!equals3 || this.A0I != tiw.A0I || this.A04 != tiw.A04 || this.A05 != tiw.A05 || this.A0M != tiw.A0M || this.A0L != tiw.A0L || this.A0P != tiw.A0P || this.A0N != tiw.A0N || !this.A0E.equals(tiw.A0E) || this.A0B != tiw.A0B || !this.A0D.equals(tiw.A0D) || !this.A0G.equals(tiw.A0G) || !this.A0F.equals(tiw.A0F)) {
            return false;
        }
        InterfaceC65617To8 interfaceC65617To8 = this.A0C;
        InterfaceC65617To8 interfaceC65617To82 = tiw.A0C;
        if (interfaceC65617To8 == null) {
            equals4 = AbstractC25229BEm.A1Z(interfaceC65617To82);
        } else {
            equals4 = interfaceC65617To8.equals(interfaceC65617To82);
        }
        if (!equals4) {
            return false;
        }
        Resources.Theme theme = this.A07;
        Resources.Theme theme2 = tiw.A07;
        if (theme == null) {
            equals5 = AbstractC25229BEm.A1Z(theme2);
        } else {
            equals5 = theme.equals(theme2);
        }
        if (!equals5) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int floatToIntBits = ((((((((((((((((((((((((((((((((((((((527 + Float.floatToIntBits(this.A00)) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + this.A06) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + (this.A0I ? 1 : 0)) * 31) + this.A04) * 31) + this.A05) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0L ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0C);
        return (floatToIntBits * 31) + AbstractC167017dG.A0M(this.A07);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.01p, java.util.Map] */
    @Override // 
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public TIW clone() {
        try {
            TIW tiw = (TIW) super.clone();
            C63729Ssj c63729Ssj = new C63729Ssj();
            tiw.A0D = c63729Ssj;
            c63729Ssj.A00.A09(this.A0D.A00);
            ?? c005001p = new C005001p(0);
            tiw.A0G = c005001p;
            c005001p.putAll(this.A0G);
            tiw.A0J = false;
            tiw.A0H = false;
            return tiw;
        } catch (CloneNotSupportedException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
