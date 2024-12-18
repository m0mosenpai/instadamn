package X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tu0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65782Tu0 extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C65782Tu0(Rect rect, EnumC65748TtN enumC65748TtN, Integer num, int i, int i2) {
        C14360o3.A0B(enumC65748TtN, 1);
        this.A05 = enumC65748TtN;
        this.A01 = i;
        this.A04 = rect;
        this.A02 = i2;
        this.A03 = num;
    }

    public final String A00() {
        String str;
        Rect rect = (Rect) this.A04;
        String A0R = AnonymousClass001.A0R("bounds:", AnonymousClass001.A0w("{l:", ", t:", ", r:", ", b:", '}', rect.left, rect.top, rect.right, rect.bottom));
        String A0O = AnonymousClass001.A0O("visibility:", this.A02);
        Number number = (Number) this.A03;
        if (number != null) {
            str = AnonymousClass001.A0O("lines:", number.intValue());
        } else {
            str = null;
        }
        List A1Q = AbstractC16960so.A1Q(A0R, A0O, str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A1Q) {
            String str2 = (String) obj;
            if (str2 != null && str2.length() != 0) {
                arrayList.add(obj);
            }
        }
        return AnonymousClass001.A0E(AbstractC31175DnJ.A0a(", ", arrayList), '{', '}');
    }

    public final String A01(Integer num) {
        EnumC65748TtN enumC65748TtN = (EnumC65748TtN) this.A05;
        int ordinal = enumC65748TtN.ordinal();
        if (ordinal != 0 && ordinal != 3 && ordinal != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC167007dF.A0h(enumC65748TtN.name()));
            sb.append('_');
            return AbstractC166997dE.A0v(num, sb);
        }
        return AbstractC167007dF.A0h(enumC65748TtN.name());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L3a;
                case 1: goto L64;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L97
            r1 = 2
            boolean r0 = r3 instanceof X.C65782Tu0
            if (r0 == 0) goto L38
            X.Tu0 r3 = (X.C65782Tu0) r3
            int r0 = r3.A00
            if (r0 != r1) goto L38
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L38
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 != r0) goto L38
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L38
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
        L32:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L97
        L38:
            r0 = 0
            return r0
        L3a:
            if (r2 == r3) goto L97
            r1 = 0
            boolean r0 = r3 instanceof X.C65782Tu0
            if (r0 == 0) goto L38
            X.Tu0 r3 = (X.C65782Tu0) r3
            int r0 = r3.A00
            if (r0 != r1) goto L38
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            if (r1 != r0) goto L38
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L38
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 == r0) goto L92
            goto L38
        L64:
            if (r2 == r3) goto L97
            r1 = 1
            boolean r0 = r3 instanceof X.C65782Tu0
            if (r0 == 0) goto L38
            X.Tu0 r3 = (X.C65782Tu0) r3
            int r0 = r3.A00
            if (r0 != r1) goto L38
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L38
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L38
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L38
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L92
            goto L38
        L92:
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L32
        L97:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65782Tu0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int A0M;
        switch (this.A00) {
            case 0:
                i = (AbstractC166997dE.A0J(this.A04, ((this.A05.hashCode() * 31) + this.A01) * 31) + this.A02) * 31;
                A0M = AbstractC167017dG.A0M(this.A03);
                break;
            case 1:
                i = 0;
                A0M = ((((((this.A01 * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
                Object obj = this.A03;
                if (obj != null) {
                    i = obj.hashCode();
                    break;
                }
                break;
            default:
                i = (((AbstractC166997dE.A0J(this.A03, this.A01 * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
                A0M = this.A05.hashCode();
                break;
        }
        return i + A0M;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UiElementRenderingDebugInfo(uiElementType=");
        sb.append(this.A05);
        sb.append(", viewUniqueIdentifier=");
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1444));
        sb.append(this.A04);
        sb.append(", visibility=");
        sb.append(this.A02);
        sb.append(", lines=");
        return AbstractC167017dG.A0o(this.A03, sb);
    }

    public C65782Tu0(int i, int i2) {
        this((Integer) null, (Integer) null, (InterfaceC16820sZ) null, i, i2);
    }

    public C65782Tu0(C4I3 c4i3, Long l, java.util.Set set, int i, int i2) {
        C14360o3.A0B(c4i3, 2);
        this.A01 = i;
        this.A03 = c4i3;
        this.A02 = i2;
        this.A04 = l;
        this.A05 = set;
    }

    public C65782Tu0(Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A05 = num;
        this.A04 = interfaceC16820sZ;
        this.A03 = num2;
    }
}
