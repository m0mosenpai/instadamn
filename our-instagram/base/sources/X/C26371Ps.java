package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26371Ps {
    public InterfaceC26421Px A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final List A06;
    public final C1JP A07;
    public final Map A08;

    public final void A01(Integer num) {
        C14360o3.A0B(num, 0);
        this.A01 = num;
    }

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        this.A02 = str;
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        this.A06.add(new C23781El(str, str2));
    }

    public C26371Ps(C1QW c1qw) {
        this(c1qw.A05);
        this.A02 = c1qw.A09.toString();
        this.A01 = c1qw.A07;
        this.A00 = c1qw.A06;
        this.A05 = c1qw.A0C;
        this.A04 = c1qw.A0B;
        this.A06.addAll(c1qw.A01);
        this.A08.putAll(c1qw.A0A);
        this.A03 = c1qw.A02;
    }

    public final C1QW A00() {
        String str;
        String str2 = this.A02;
        if (str2 == null) {
            str = "url";
        } else {
            Integer num = this.A01;
            if (num == null) {
                str = "method";
            } else {
                InterfaceC26421Px interfaceC26421Px = this.A00;
                List list = this.A06;
                return new C1QW(this.A07, interfaceC26421Px, num, str2, list, this.A08, 0, 256, this.A05, this.A04, this.A03);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01p, java.util.Map] */
    public C26371Ps(C1JP c1jp) {
        this.A07 = c1jp;
        this.A05 = true;
        this.A06 = new ArrayList();
        this.A08 = new C005001p(0);
    }

    public C26371Ps() {
        this((C1JP) null);
    }
}
