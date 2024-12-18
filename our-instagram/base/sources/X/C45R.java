package X;

import java.io.Serializable;

/* renamed from: X.45R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45R extends C45S implements Serializable {
    public static final int A06;
    public static final AnonymousClass162 A07 = new AnonymousClass161();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass162 A05;

    static {
        int i = 0;
        for (Object obj : (Enum[]) EnumC912645f.class.getEnumConstants()) {
            C45Z c45z = (C45Z) obj;
            if (c45z.ARw()) {
                i |= c45z.BPk();
            }
        }
        A06 = i;
    }

    public final void A0B(AnonymousClass182 anonymousClass182) {
        EnumC912645f enumC912645f = EnumC912645f.INDENT_OUTPUT;
        int i = this.A04;
        if ((enumC912645f.A00 & i) != 0 && anonymousClass182.A00 == null) {
            AnonymousClass162 anonymousClass162 = this.A05;
            if (anonymousClass162 instanceof AnonymousClass163) {
                anonymousClass162 = ((AnonymousClass163) anonymousClass162).AMQ();
            }
            if (anonymousClass162 != null) {
                anonymousClass182.A00 = anonymousClass162;
            }
        }
        boolean z = false;
        if ((i & EnumC912645f.WRITE_BIGDECIMAL_AS_PLAIN.A00) != 0) {
            z = true;
        }
        int i2 = this.A03;
        if (i2 != 0 || z) {
            int i3 = this.A02;
            if (z) {
                int i4 = AnonymousClass160.WRITE_BIGDECIMAL_AS_PLAIN.A00;
                i3 |= i4;
                i2 |= i4;
            }
            AnonymousClass181 anonymousClass181 = (AnonymousClass181) anonymousClass182;
            int i5 = anonymousClass181.A00;
            int i6 = (i3 & i2) | ((i2 ^ (-1)) & i5);
            int i7 = i5 ^ i6;
            if (i7 != 0) {
                anonymousClass181.A00 = i6;
                anonymousClass181.A12(i6, i7);
            }
        }
    }

    public final boolean A0C(EnumC912645f enumC912645f) {
        if ((enumC912645f.A00 & this.A04) == 0) {
            return false;
        }
        return true;
    }

    public C45R(C45R c45r, int i, int i2, int i3, int i4, int i5, long j) {
        super(c45r, j);
        this.A04 = i;
        this.A05 = c45r.A05;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }

    public C45R(C45R c45r, AnonymousClass451 anonymousClass451) {
        super(anonymousClass451, c45r);
        this.A04 = c45r.A04;
        this.A05 = c45r.A05;
        this.A02 = c45r.A02;
        this.A03 = c45r.A03;
        this.A00 = c45r.A00;
        this.A01 = c45r.A01;
    }

    public C45R(AnonymousClass451 anonymousClass451, C45G c45g, C45E c45e, C45C c45c, C45D c45d) {
        super(anonymousClass451, c45g, c45e, c45c, c45d);
        this.A04 = A06;
        this.A05 = A07;
        this.A02 = 0;
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 0;
    }
}
