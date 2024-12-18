package X;

import java.util.Arrays;

/* renamed from: X.3Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69613Av {
    public Integer A00;
    public final AbstractC69603Au A01;
    public final String A02;

    public C69613Av(AbstractC69603Au abstractC69603Au, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = abstractC69603Au;
        this.A02 = str;
        this.A00 = C05F.A00;
    }

    public final void A04() {
        A08(null);
    }

    private final boolean A00(Integer num, Integer num2) {
        Integer num3 = this.A00;
        if (num3 != C05F.A0C) {
            AbstractC69603Au abstractC69603Au = this.A01;
            if (abstractC69603Au.A01) {
                if (num3 != num) {
                    String format = String.format("%s.%s tries to move from state %s to %s while the current state is %s", Arrays.copyOf(new Object[]{abstractC69603Au.getClass().getSimpleName(), this.A02, AbstractC1570573k.A00(num), AbstractC1570573k.A00(num2), AbstractC1570573k.A00(num3)}, 5));
                    C14360o3.A07(format);
                    C0w9.A03("NavigationPerfComponent", format);
                } else {
                    this.A00 = num2;
                    return true;
                }
            }
        }
        return false;
    }

    public final void A01() {
        if (A00(C05F.A01, C05F.A0C)) {
            this.A01.A0D(this, null, true);
        }
    }

    public final void A02() {
        Integer num = this.A00;
        if (num != C05F.A01 && num != C05F.A00) {
            String format = String.format("%s.%s component prefetched attempt while the current state is %s", Arrays.copyOf(new Object[]{this.A01.getClass().getSimpleName(), this.A02, AbstractC1570573k.A00(num)}, 3));
            C14360o3.A07(format);
            C0w9.A03("NavigationPerfComponent", format);
        } else {
            if (!A00(num, C05F.A0C)) {
                return;
            }
            AbstractC69603Au abstractC69603Au = this.A01;
            if (abstractC69603Au.A01) {
                abstractC69603Au.A05.markerPoint(abstractC69603Au.A01(), abstractC69603Au.A00, AnonymousClass001.A0R(this.A02, "_prefetched"));
                abstractC69603Au.A08.remove(this);
                abstractC69603Au.A03();
            }
            C2ZI.A00.A01(abstractC69603Au.A01(), AnonymousClass001.A0R(this.A02, "_prefetched"));
        }
    }

    public final void A03() {
        Integer num = C05F.A00;
        Integer num2 = C05F.A0C;
        if (A00(num, num2)) {
            this.A00 = num2;
            AbstractC69603Au abstractC69603Au = this.A01;
            if (abstractC69603Au.A01) {
                abstractC69603Au.A05.markerPoint(abstractC69603Au.A01(), abstractC69603Au.A00, AnonymousClass001.A0R(this.A02, "_skipped"));
                abstractC69603Au.A08.remove(this);
                abstractC69603Au.A03();
            }
            C2ZI.A00.A01(abstractC69603Au.A01(), AnonymousClass001.A0R(this.A02, "_skipped"));
        }
    }

    public final void A05() {
        Integer num = C05F.A01;
        Integer num2 = C05F.A0C;
        if (A00(num, num2)) {
            this.A00 = num2;
            AbstractC69603Au abstractC69603Au = this.A01;
            if (abstractC69603Au.A01) {
                abstractC69603Au.A05.markerPoint(abstractC69603Au.A01(), abstractC69603Au.A00, AnonymousClass001.A0R(this.A02, "_end"));
                abstractC69603Au.A08.remove(this);
                abstractC69603Au.A03();
            }
            C2ZI.A00.A01(abstractC69603Au.A01(), AnonymousClass001.A0R(this.A02, "_end"));
        }
    }

    public final void A06(long j) {
        if (A00(C05F.A00, C05F.A01)) {
            this.A01.A0C(this, null, j);
        }
    }

    public final void A07(String str) {
        if (A00(C05F.A01, C05F.A0C)) {
            this.A01.A0D(this, str, true);
        }
    }

    public final void A08(String str) {
        if (A00(C05F.A00, C05F.A01)) {
            this.A01.A0C(this, str, -1L);
        }
    }
}
