package X;

import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class E71 extends C0T6 {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public E71(C105824pt c105824pt, String str, int i) {
        this.A03 = 2;
        AbstractC167017dG.A1Q(c105824pt, str);
        this.A01 = c105824pt;
        this.A00 = i;
        this.A02 = str;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof E71) && ((E71) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0020 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L22;
                case 1: goto L26;
                case 2: goto L60;
                case 3: goto L87;
                case 4: goto L8b;
                case 5: goto L40;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto Lb2
            r0 = 6
        L8:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L20
            X.E71 r3 = (X.E71) r3
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L20
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L7c
        L20:
            r0 = 0
            return r0
        L22:
            if (r2 == r3) goto Lb2
            r0 = 0
            goto L8
        L26:
            if (r2 == r3) goto Lb2
            r0 = 1
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L20
            X.E71 r3 = (X.E71) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L20
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto La4
        L40:
            if (r2 == r3) goto Lb2
            r0 = 5
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L20
            X.E71 r3 = (X.E71) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L20
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L20
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L80
        L60:
            if (r2 == r3) goto Lb2
            r0 = 2
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L20
            X.E71 r3 = (X.E71) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L20
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L7c
            goto L20
        L7c:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L80:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb2
            goto L20
        L87:
            if (r2 == r3) goto Lb2
            r0 = 3
            goto L8e
        L8b:
            if (r2 == r3) goto Lb2
            r0 = 4
        L8e:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L20
            X.E71 r3 = (X.E71) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L20
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        La4:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L20
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto Lb2
            goto L20
        Lb2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E71.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0J;
        int hashCode;
        int A0J2;
        int hashCode2;
        int A0G;
        int i;
        switch (this.A03) {
            case 0:
                A0G = this.A00 * 31;
                i = AbstractC167017dG.A0M(this.A01);
                A0J = (A0G + i) * 31;
                hashCode = this.A02.hashCode();
                break;
            case 1:
                A0J2 = AbstractC166987dD.A0G(this.A01);
                hashCode2 = AbstractC167017dG.A0O(this.A02);
                A0J = (A0J2 + hashCode2) * 31;
                hashCode = this.A00;
                break;
            case 2:
                A0G = AbstractC166987dD.A0G(this.A01);
                i = this.A00;
                A0J = (A0G + i) * 31;
                hashCode = this.A02.hashCode();
                break;
            case 3:
                hashCode2 = AbstractC167017dG.A0O(this.A02) * 31;
                A0J2 = AbstractC166997dE.A0I(this.A01);
                A0J = (A0J2 + hashCode2) * 31;
                hashCode = this.A00;
                break;
            case 4:
                A0J2 = AbstractC166987dD.A0J(this.A02);
                hashCode2 = this.A01.hashCode();
                A0J = (A0J2 + hashCode2) * 31;
                hashCode = this.A00;
                break;
            case 5:
                A0J = (AbstractC166987dD.A0J(this.A02) + this.A00) * 31;
                hashCode = this.A01.hashCode();
                break;
            default:
                hashCode = ((this.A00 * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                A0J = AbstractC25227BEk.A07(this.A02);
                break;
        }
        return hashCode + A0J;
    }

    public final String toString() {
        if (1 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RecommendedUserRowLoggingItem(user=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(1464));
        A1C.append(this.A02);
        A1C.append(", position=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }

    public E71(Object obj, String str, int i, int i2) {
        this.A03 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public E71(User user, String str, int i) {
        this.A03 = 1;
        this.A01 = user;
        this.A02 = str;
        this.A00 = i;
    }

    public E71(Medium medium, String str, int i) {
        this.A03 = 4;
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = medium;
        this.A00 = i;
    }

    public E71(View.OnClickListener onClickListener, String str, int i) {
        this.A03 = 5;
        this.A02 = str;
        this.A00 = i;
        this.A01 = onClickListener;
    }

    public E71(List list, int i, String str) {
        this.A03 = 0;
        C14360o3.A0B(str, 3);
        this.A00 = i;
        this.A01 = list;
        this.A02 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E71(String str) {
        this(null, str, 2131972381, 6);
        this.A03 = 6;
    }
}
