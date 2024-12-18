package X;

import java.io.Serializable;

/* renamed from: X.45h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C912845h extends C45S implements Serializable {
    public static final int A09;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C45O A05;
    public final C1126656w A06;
    public final C913045j A07;
    public final C1126556v A08;

    public C912845h(AnonymousClass451 anonymousClass451, C45O c45o, C45G c45g, C45E c45e, C45C c45c, C45D c45d) {
        super(anonymousClass451, c45g, c45e, c45c, c45d);
        this.A00 = A09;
        this.A08 = null;
        this.A07 = C913045j.A00;
        this.A06 = null;
        this.A05 = c45o;
        this.A03 = 0;
        this.A04 = 0;
        this.A01 = 0;
        this.A02 = 0;
    }

    static {
        int i = 0;
        for (Object obj : (Enum[]) EnumC912945i.class.getEnumConstants()) {
            C45Z c45z = (C45Z) obj;
            if (c45z.ARw()) {
                i |= c45z.BPk();
            }
        }
        A09 = i;
    }

    public final C45B A0B(AbstractC910944l abstractC910944l) {
        AnonymousClass452 anonymousClass452 = (AnonymousClass452) ((C45T) this).A01.A03;
        C45B A00 = AnonymousClass452.A00(abstractC910944l, this);
        if (A00 == null) {
            C45B A04 = anonymousClass452.A04(abstractC910944l, this);
            if (A04 == null) {
                return new C45B(anonymousClass452.A06(abstractC910944l, this, this, false));
            }
            return A04;
        }
        return A00;
    }

    public final boolean A0C(EnumC912945i enumC912945i) {
        if ((enumC912945i.A00 & this.A00) == 0) {
            return false;
        }
        return true;
    }

    public C912845h(C912845h c912845h, AnonymousClass451 anonymousClass451) {
        super(anonymousClass451, c912845h);
        this.A00 = c912845h.A00;
        this.A08 = c912845h.A08;
        this.A07 = c912845h.A07;
        this.A05 = c912845h.A05;
        this.A06 = c912845h.A06;
        this.A03 = c912845h.A03;
        this.A04 = c912845h.A04;
        this.A01 = c912845h.A01;
        this.A02 = c912845h.A02;
    }

    public C912845h(C912845h c912845h, int i, int i2, int i3, int i4, int i5, long j) {
        super(c912845h, j);
        this.A00 = i;
        this.A08 = c912845h.A08;
        this.A07 = c912845h.A07;
        this.A05 = c912845h.A05;
        this.A06 = c912845h.A06;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A02 = i5;
    }
}
