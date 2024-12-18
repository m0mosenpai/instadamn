package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3a3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75363a3 {
    public int A00;
    public int A01;
    public boolean A02;
    public Boolean A03;
    public Boolean A04;
    public List A05;
    public final long A06;
    public final C5H1 A07;
    public final VideoUrlImpl A08;
    public final ProductType A09;
    public final C88583xH A0A;
    public final Boolean A0B;
    public final Double A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final android.net.Uri A0W;
    public final String A0X;
    public final String A0Y;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (X.AbstractC001900j.A0a(r2, X.AnonymousClass001.A0S("lang=\"", r6, '\"'), false) != true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            java.lang.Boolean r0 = r5.A03
            if (r0 == 0) goto Ld
            boolean r3 = r0.booleanValue()
            return r3
        Ld:
            java.lang.String r2 = r5.A03()
            r3 = 1
            if (r2 == 0) goto L23
            java.lang.String r1 = "lang=\""
            r0 = 34
            java.lang.String r0 = X.AnonymousClass001.A0S(r1, r6, r0)
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r4)
            r1 = 1
            if (r0 == r3) goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.A03 = r0
            boolean r0 = r5.A07()
            if (r0 == 0) goto L33
            if (r1 == 0) goto L33
            return r3
        L33:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75363a3.A09(java.lang.String):boolean");
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C75363a3) {
            C75363a3 c75363a3 = (C75363a3) obj;
            if (this.A0R == c75363a3.A0R && this.A0T == c75363a3.A0T && C14360o3.A0K(this.A0G, c75363a3.A0G) && C14360o3.A0K(this.A0M, c75363a3.A0M) && C14360o3.A0K(A03(), c75363a3.A03()) && C14360o3.A0K(this.A0F, c75363a3.A0F)) {
                if (this.A02) {
                    i = 0;
                } else {
                    i = this.A0D;
                }
                if (c75363a3.A02) {
                    i2 = 0;
                } else {
                    i2 = c75363a3.A0D;
                }
                if (C14360o3.A0K(i, i2) && C14360o3.A0K(A04(), c75363a3.A04()) && this.A01 == c75363a3.A01 && this.A00 == c75363a3.A00 && this.A0U == c75363a3.A0U) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String A02() {
        String str;
        VideoUrlImpl videoUrlImpl = this.A08;
        if (videoUrlImpl == null || (str = videoUrlImpl.A06) == null) {
            return "";
        }
        return str;
    }

    public final String A03() {
        if (this.A02) {
            return null;
        }
        return this.A0X;
    }

    public final String A04() {
        if (this.A02) {
            return null;
        }
        return this.A0Y;
    }

    public final List A05() {
        List list = this.A0M;
        if (list == null) {
            return C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((VideoUrlImpl) it.next()).A05;
            if (str != null) {
                Long A0k = AbstractC003100w.A0k(10, str);
                if (A0k != null) {
                    arrayList.add(A0k);
                } else if (str.length() != 0) {
                    C0K8.A0C("VideoSource", AnonymousClass001.A0R("Video id is not numerical: ", str));
                }
            }
        }
        return arrayList;
    }

    public final List A06() {
        List list = this.A0M;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoUrlImpl) it.next()).A06);
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public final boolean A07() {
        Boolean bool = this.A04;
        if (bool == null) {
            String A03 = A03();
            boolean z = true;
            if (A03 == null || !AbstractC001900j.A0a(A03, "value=\"dub\"", false)) {
                z = false;
            }
            this.A04 = Boolean.valueOf(z);
            return z;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0025 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08() {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.A0E
            int r0 = r0.intValue()
            r2 = 0
            r1 = 1
            switch(r0) {
                case 0: goto L11;
                case 1: goto L11;
                case 2: goto L11;
                case 3: goto L2c;
                case 4: goto L25;
                case 5: goto L26;
                case 6: goto L11;
                case 7: goto L11;
                case 8: goto L11;
                case 9: goto L11;
                default: goto Lb;
            }
        Lb:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L11:
            boolean r0 = r3.A02
            if (r0 == 0) goto L27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L19:
            int r0 = r0.intValue()
            if (r0 != r1) goto L26
            java.lang.String r0 = r3.A03()
            if (r0 == 0) goto L26
        L25:
            r2 = 1
        L26:
            return r2
        L27:
            java.lang.Integer r0 = r3.A0D
            if (r0 == 0) goto L26
            goto L19
        L2c:
            boolean r2 = r3.A0P
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75363a3.A08():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            java.lang.String r0 = r4.A0G
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            boolean r0 = r4.A0R
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.A0T
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.A0U
            int r1 = r1 + r0
            int r0 = r1 * 31
            int r1 = r0 * 31
            java.util.List r0 = r4.A0M
            r2 = 0
            if (r0 == 0) goto L75
            int r0 = r0.hashCode()
        L22:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A03()
            if (r0 == 0) goto L73
            int r0 = r0.hashCode()
        L2f:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A0F
            if (r0 == 0) goto L71
            int r0 = r0.hashCode()
        L3a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.A02
            if (r0 == 0) goto L6b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L45:
            int r0 = r0.intValue()
        L49:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A04()
            if (r0 == 0) goto L56
            int r2 = r0.hashCode()
        L56:
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r0 = r4.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r4.A00
            int r1 = r1 + r0
            int r3 = r1 * 31
            r1 = 0
            r0 = 32
            long r1 = r1 >>> r0
            int r0 = (int) r1
            int r3 = r3 + r0
            return r3
        L6b:
            java.lang.Integer r0 = r4.A0D
            if (r0 != 0) goto L45
            r0 = 0
            goto L49
        L71:
            r0 = 1
            goto L3a
        L73:
            r0 = 0
            goto L2f
        L75:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75363a3.hashCode():int");
    }

    public C75363a3(C5H1 c5h1, ProductType productType, C88583xH c88583xH, Boolean bool, Double d, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, List list3, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        android.net.Uri A01;
        this.A0E = num;
        this.A09 = productType;
        this.A0G = str;
        this.A0M = list;
        this.A0I = str2;
        this.A0L = str3;
        this.A07 = c5h1;
        this.A0F = str5;
        this.A05 = list2;
        this.A0P = z2;
        this.A0T = z3;
        this.A0A = c88583xH;
        this.A0R = z4;
        this.A0Q = z5;
        this.A0O = z6;
        this.A06 = j;
        this.A0B = bool;
        this.A01 = i;
        this.A00 = i2;
        this.A0U = z7;
        this.A0C = d;
        this.A0N = list3;
        this.A0H = str8;
        this.A0V = z8;
        this.A0K = str9;
        this.A0X = str4;
        this.A0D = num2;
        this.A0Y = str6;
        VideoUrlImpl videoUrlImpl = null;
        if (str3 == null) {
            A01 = null;
        } else {
            A01 = AbstractC08820cl.A01(AbstractC92554Cp.A00, str3);
        }
        this.A0W = A01;
        this.A0S = z;
        this.A0J = str7;
        if (list != null && !list.isEmpty()) {
            videoUrlImpl = AbstractC88593xJ.A01(this.A0G, this.A0M);
        }
        this.A08 = videoUrlImpl;
    }

    public final C4BR A00(Context context) {
        if (A08()) {
            C92074An c92074An = new C92074An();
            android.net.Uri uri = this.A0W;
            if (uri == null) {
                uri = android.net.Uri.parse("");
            }
            C92124As A02 = AbstractC92114Ar.A02(uri, c92074An, A03());
            C4BL c4bl = C4BL.A00;
            return AbstractC92114Ar.A01(context, new WYH(this), new WYM(this), c4bl, A02, false, false, false);
        }
        return null;
    }

    public final ImmutableList A01(Context context) {
        List list;
        List list2;
        if (A08() && this.A05 == null) {
            C4BR A00 = A00(context);
            if (A00 != null && (list2 = A00.A01) != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((C4BB) it.next()).A02.A0R));
                }
                list = AbstractC001800i.A0W(arrayList);
            } else {
                list = null;
            }
            this.A05 = list;
        }
        List list3 = this.A05;
        if (list3 == null) {
            return null;
        }
        return ImmutableList.copyOf((Collection) list3);
    }

    public final String toString() {
        return A02();
    }
}
