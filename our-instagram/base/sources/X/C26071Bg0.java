package X;

import java.util.List;

/* renamed from: X.Bg0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26071Bg0 extends C0T6 {
    public final float A00;
    public final EnumC27394C6x A01;
    public final Integer A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26071Bg0) {
                C26071Bg0 c26071Bg0 = (C26071Bg0) obj;
                if (this.A01 != c26071Bg0.A01 || !C14360o3.A0K(this.A03, c26071Bg0.A03) || Float.compare(this.A00, c26071Bg0.A00) != 0 || this.A04 != c26071Bg0.A04 || !C14360o3.A0K(this.A02, c26071Bg0.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A02(EnumC27394C6x enumC27394C6x, C26071Bg0 c26071Bg0, Object obj, List list, C05A c05a) {
        return c05a.AIi(obj, A01(enumC27394C6x, c26071Bg0.A02, list, c26071Bg0.A00, c26071Bg0.A04));
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A01)), this.A00)) + AbstractC167017dG.A0M(this.A02);
    }

    public C26071Bg0(EnumC27394C6x enumC27394C6x, Integer num, List list, float f, boolean z) {
        this.A01 = enumC27394C6x;
        this.A03 = list;
        this.A00 = f;
        this.A04 = z;
        this.A02 = num;
    }

    public static C26070Bfy A00(Number number, C0UO c0uo) {
        return (C26070Bfy) ((C26071Bg0) c0uo.getValue()).A03.get(number.intValue());
    }

    public static final C26071Bg0 A01(EnumC27394C6x enumC27394C6x, Integer num, List list, float f, boolean z) {
        AbstractC167017dG.A1N(enumC27394C6x, list);
        return new C26071Bg0(enumC27394C6x, num, list, f, z);
    }

    public C26071Bg0() {
        this(EnumC27394C6x.A04, null, C16930sl.A00, 0.0f, true);
    }
}
