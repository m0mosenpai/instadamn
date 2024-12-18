package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1QW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QW {
    public static final AtomicInteger A0D = new AtomicInteger(1);
    public int A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final C1JP A05;
    public final InterfaceC26421Px A06;
    public final Integer A07;
    public final String A08;
    public final java.net.URI A09;
    public final Map A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final void A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        ArrayList A0U = AbstractC001800i.A0U(this.A01);
        A0U.add(new C23781El(str, str2));
        this.A01 = A0U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.01p] */
    public /* synthetic */ C1QW(C1JP c1jp, InterfaceC26421Px interfaceC26421Px, Integer num, String str, List list, Map map, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4 = z3;
        boolean z5 = z2;
        z = (i2 & 32) != 0 ? true : z;
        Map c005001p = (i2 & 64) != 0 ? new C005001p(0) : map;
        z5 = (i2 & 128) != 0 ? false : z5;
        if ((i2 & 256) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(System.currentTimeMillis());
            sb.append(A0D.getAndIncrement());
            i = Math.abs(sb.toString().hashCode());
        }
        z4 = (i2 & 512) != 0 ? false : z4;
        C14360o3.A0B(c005001p, 7);
        this.A08 = str;
        this.A07 = num;
        this.A06 = interfaceC26421Px;
        this.A01 = list;
        this.A05 = c1jp;
        this.A0C = z;
        this.A0A = c005001p;
        this.A0B = z5;
        this.A04 = i;
        this.A02 = z4;
        java.net.URI create = java.net.URI.create(str);
        C14360o3.A07(create);
        this.A09 = create;
        this.A00 = 3;
        if (create.getHost() == null) {
            C0w9.A03("url_has_no_host", AnonymousClass001.A0u(create.getScheme(), "://", create.getPath(), " has no host"));
        }
        if (!create.isAbsolute()) {
            C0w9.A03("url_not_absolute", AnonymousClass001.A11("URI with host: ", create.getHost(), ", path: ", create.getPath(), " has no scheme"));
        }
    }

    public final C23781El A00(String str) {
        for (C23781El c23781El : this.A01) {
            String str2 = c23781El.A00;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return c23781El;
            }
        }
        return null;
    }

    public final boolean A02(String str) {
        List list = this.A01;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = ((C23781El) it.next()).A00;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("{Uri: %s. RequestId: %d}", this.A09.toString(), Integer.valueOf(hashCode()));
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
