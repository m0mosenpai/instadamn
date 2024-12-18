package X;

import android.graphics.Typeface;
import android.text.Spannable;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class JV1 extends C0T6 {
    public final int A00 = 2;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L4f;
                case 2: goto L6f;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L9a
            r1 = 3
            boolean r0 = r3 instanceof X.JV1
            if (r0 == 0) goto L28
            X.JV1 r3 = (X.JV1) r3
            int r0 = r3.A00
            if (r0 != r1) goto L28
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L28
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L28
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 == r0) goto L4a
        L28:
            r0 = 0
            return r0
        L2a:
            if (r2 == r3) goto L9a
            r1 = 0
            boolean r0 = r3 instanceof X.JV1
            if (r0 == 0) goto L28
            X.JV1 r3 = (X.JV1) r3
            int r0 = r3.A00
            if (r0 != r1) goto L28
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L28
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L28
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 == r0) goto L4a
            goto L28
        L4a:
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L93
        L4f:
            if (r2 == r3) goto L9a
            r1 = 1
            boolean r0 = r3 instanceof X.JV1
            if (r0 == 0) goto L28
            X.JV1 r3 = (X.JV1) r3
            int r0 = r3.A00
            if (r0 != r1) goto L28
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L28
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L28
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            if (r1 == r0) goto L8f
            goto L28
        L6f:
            if (r2 == r3) goto L9a
            r1 = 2
            boolean r0 = r3 instanceof X.JV1
            if (r0 == 0) goto L28
            X.JV1 r3 = (X.JV1) r3
            int r0 = r3.A00
            if (r0 != r1) goto L28
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            if (r1 != r0) goto L28
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L28
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 == r0) goto L8f
            goto L28
        L8f:
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
        L93:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L9a
            goto L28
        L9a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0J;
        String str;
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
                A0J = AbstractC166997dE.A0J(this.A03, ((this.A02 * 31) + this.A01) * 31);
                obj = this.A04;
                i = obj.hashCode();
                break;
            case 1:
                A0J = AbstractC166997dE.A0J(this.A04, ((this.A02 * 31) + this.A01) * 31);
                obj = this.A03;
                i = obj.hashCode();
                break;
            case 2:
                int A0H = AbstractC166987dD.A0H(this.A04);
                if (1 != A0H) {
                    str = "SETTINGS";
                } else {
                    str = "SHARE";
                }
                A0J = (((AbstractC25228BEl.A0F(str, A0H) + this.A02) * 31) + this.A01) * 31;
                obj = this.A03;
                if (obj == null) {
                    i = 0;
                    break;
                }
                i = obj.hashCode();
                break;
            default:
                A0J = (((AbstractC166987dD.A0G(this.A03) + this.A02) * 31) + this.A01) * 31;
                obj = this.A04;
                i = obj.hashCode();
                break;
        }
        return A0J + i;
    }

    public final String toString() {
        String str;
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ConsiderationActionButton(type=");
        Number number = (Number) this.A04;
        if (number != null) {
            if (1 - number.intValue() != 0) {
                str = "SETTINGS";
            } else {
                str = "SHARE";
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", drawableRes=");
        A1C.append(this.A02);
        A1C.append(AbstractC58317Pt9.A00(58));
        A1C.append(this.A01);
        A1C.append(", tooltipText=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }

    public JV1(Integer num) {
        this((C5QE) null, num, R.drawable.instagram_settings_pano_outline_24, 2131962137);
    }

    public JV1(C5QE c5qe, Integer num, int i, int i2) {
        this.A04 = num;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = c5qe;
    }

    public JV1(C7R c7r, List list, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = c7r;
        this.A04 = list;
    }

    public JV1(EnumC43692JUb enumC43692JUb, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A04 = enumC43692JUb;
        this.A03 = interfaceC16820sZ;
    }

    public JV1(Typeface typeface, Spannable spannable, int i, int i2) {
        this.A03 = spannable;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = typeface;
    }
}
