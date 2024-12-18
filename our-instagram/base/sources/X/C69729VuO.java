package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VuO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69729VuO {
    public char A00;
    public char A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public EnumC68123VCh A0B;
    public char[] A0C;
    public final C69576Vrf A0D;
    public final Map A0E;
    public final char[] A0F;

    public final void A01(EnumC68122VCg enumC68122VCg, char c) {
        int i;
        int i2;
        int i3;
        C14360o3.A0B(enumC68122VCg, 1);
        this.A01 = c;
        this.A06 = this.A04;
        this.A07 = this.A0D.A00(c);
        this.A0C = null;
        char c2 = this.A00;
        Map map = this.A0E;
        Character valueOf = Character.valueOf(c2);
        if (map.containsKey(valueOf)) {
            Object obj = map.get(valueOf);
            if (obj != null) {
                i = ((Number) obj).intValue() + 1;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            i = -1;
        }
        Character valueOf2 = Character.valueOf(this.A01);
        if (map.containsKey(valueOf2)) {
            Object obj2 = map.get(valueOf2);
            if (obj2 != null) {
                i2 = ((Number) obj2).intValue() + 1;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            i2 = -1;
        }
        if (this.A0B != EnumC68123VCh.A03 && i >= 0 && i2 >= 0) {
            this.A0A = i;
            this.A09 = i2;
            this.A0C = this.A0F;
            if (enumC68122VCg == EnumC68122VCg.A03) {
                if (i < i2) {
                    this.A0A = i + 10;
                }
            } else if (i2 < i) {
                i3 = i2 + 10;
                this.A09 = i3;
            }
        } else {
            char c3 = this.A00;
            char c4 = this.A01;
            i3 = 1;
            if (c3 == c4) {
                this.A0C = new char[]{c3};
                this.A0A = 0;
            } else {
                int ordinal = enumC68122VCg.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.A0C = new char[]{c3, c4};
                        this.A0A = 0;
                        this.A09 = i3;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    this.A0C = new char[]{c4, c3};
                    this.A0A = 1;
                }
            }
            this.A09 = 0;
        }
        this.A05 = this.A03;
        this.A03 = 0.0f;
    }

    public final void A00() {
        float A00 = this.A0D.A00(this.A01);
        float f = this.A04;
        float f2 = this.A07;
        if (f == f2 && f2 != A00) {
            this.A07 = A00;
            this.A04 = A00;
        }
    }

    public C69729VuO(EnumC68123VCh enumC68123VCh, C69576Vrf c69576Vrf) {
        int i;
        AbstractC167017dG.A1P(c69576Vrf, enumC68123VCh);
        this.A0D = c69576Vrf;
        this.A0B = enumC68123VCh;
        int i2 = 0;
        this.A0C = new char[0];
        this.A0E = new HashMap();
        for (int i3 = 0; i3 < 10; i3++) {
            this.A0E.put(Character.valueOf("9876543210".charAt(i3)), Integer.valueOf(i3));
        }
        char[] cArr = new char[21];
        this.A0F = cArr;
        cArr[0] = 0;
        do {
            i = i2 + 1;
            this.A0F[i] = "9876543210".charAt(i2);
            this.A0F[i2 + 11] = "9876543210".charAt(i2);
            i2 = i;
        } while (i < 10);
    }
}
