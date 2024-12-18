package X;

import com.facebook.flexiblesampling.SamplingResult;

/* renamed from: X.1rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39141rn {
    public long A00;
    public long A02;
    public C39091ri A04;
    public C0CA A05;
    public C0CA A06;
    public SamplingResult A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public volatile boolean A0I;
    public long A01 = -1;
    public long A03 = 0;

    private void A01(final C0CA c0ca, String str, String str2) {
        String str3 = str;
        C39091ri c39091ri = this.A04;
        C0J8.A03(c39091ri, "EventBuilder was not acquired: Analytics2Logger null.");
        C38951rU c38951rU = c39091ri.A0F;
        if (c38951rU.A02) {
            if (str.equals("event.captured") && c38951rU.A00.A1d) {
                str3 = AnonymousClass001.A0R(str, ".on_platform_layer");
            }
            InterfaceC109534wf A00 = c38951rU.A00();
            String str4 = this.A0E;
            C0J8.A03(str4, "EventBuilder was not acquired: Trace ID null");
            A00.Chy(str3, str2, str4, new InterfaceC16820sZ() { // from class: X.4wl
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C0CA c0ca2 = C0CA.this;
                    if (c0ca2 != null) {
                        return C5KW.A00(c0ca2).get("extra");
                    }
                    return "";
                }
            }, 1L, true);
        }
    }

    public C39141rn A07(boolean z) {
        A00(this);
        this.A08 = true;
        return this;
    }

    public boolean A0A() {
        this.A0G = true;
        return true;
    }

    public static void A00(C39141rn c39141rn) {
        if (!c39141rn.A0G) {
            String str = c39141rn.A0B;
            if (str == null) {
                str = "unknown";
            }
            throw new IllegalStateException(AnonymousClass001.A0g("isSampled was not invoked for ", str, "."));
        }
        if (c39141rn.A0I) {
        } else {
            throw new IllegalStateException("Expected mutability");
        }
    }

    public C39141rn A02() {
        C0J8.A03(this.A04, "EventBuilder was not acquired: Analytics2Logger null.");
        this.A0F = true;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A09() {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39141rn.A09():void");
    }

    public C39141rn A03(long j) {
        A00(this);
        this.A01 = j;
        return this;
    }

    public C39141rn A04(Boolean bool, String str) {
        A00(this);
        C0CA.A00(A08(), bool, "test_bool");
        synchronized (this) {
            this.A00 += 4;
        }
        return this;
    }

    public C39141rn A05(Number number, String str) {
        A00(this);
        C0CA.A00(A08(), number, str);
        synchronized (this) {
            if (number != null) {
                this.A00 += 4;
            }
        }
        return this;
    }

    public C39141rn A06(String str, String str2) {
        A00(this);
        C0CA.A00(A08(), str2, str);
        synchronized (this) {
            if (str2 != null) {
                this.A00 += str2.length();
            }
        }
        return this;
    }

    public C0CA A08() {
        Integer num;
        String str;
        A00(this);
        if (this.A06 == null) {
            C39091ri c39091ri = this.A04;
            C0J8.A03(c39091ri, "EventBuilder was not acquired: Analytics2Logger null.");
            C0CA A02 = c39091ri.A09.A02();
            this.A06 = A02;
            C0CA c0ca = this.A05;
            if (c0ca != null && (num = this.A09) != null) {
                if (1 - num.intValue() != 0) {
                    str = "extra";
                } else {
                    str = "result";
                }
                c0ca.A0E(A02, str);
            }
        }
        return this.A06;
    }
}
