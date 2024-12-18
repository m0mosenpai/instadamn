package com.google.android.gms.auth.api.signin;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.AbstractC58322PtE;
import X.C61X;
import X.C63474SlF;
import X.SZE;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

@Deprecated
/* loaded from: classes10.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C61X, ReflectedParcelable {
    public static final GoogleSignInOptions A0B;
    public static final GoogleSignInOptions A0C;
    public static final Scope A0D = new Scope(1, "profile");
    public static final Scope A0E = new Scope(1, "email");
    public static final Scope A0F = new Scope(1, "openid");
    public static final Scope A0G;
    public static final Scope A0H;
    public static final Comparator A0I;
    public static final Parcelable.Creator CREATOR;
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public boolean A05;
    public Map A06;
    public final int A07;
    public final ArrayList A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r6.A00 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A01) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 != 0) goto L4
            return r4
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r6     // Catch: java.lang.ClassCastException -> L7c
            java.util.ArrayList r0 = r5.A04     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            java.util.ArrayList r0 = r6.A04     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            java.util.ArrayList r3 = r5.A08     // Catch: java.lang.ClassCastException -> L7c
            int r2 = r3.size()     // Catch: java.lang.ClassCastException -> L7c
            java.util.ArrayList r1 = r6.A08     // Catch: java.lang.ClassCastException -> L7c
            java.util.ArrayList r0 = X.AbstractC166987dD.A1F(r1)     // Catch: java.lang.ClassCastException -> L7c
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7c
            if (r2 != r0) goto L7c
            java.util.ArrayList r0 = X.AbstractC166987dD.A1F(r1)     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r3.containsAll(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            android.accounts.Account r1 = r5.A00     // Catch: java.lang.ClassCastException -> L7c
            if (r1 != 0) goto L58
            android.accounts.Account r0 = r6.A00     // Catch: java.lang.ClassCastException -> L7c
            if (r0 != 0) goto L7c
        L3a:
            java.lang.String r1 = r5.A01     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L4f
            java.lang.String r0 = r6.A01     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
        L4a:
            boolean r1 = r5.A0A     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r6.A0A     // Catch: java.lang.ClassCastException -> L7c
            goto L61
        L4f:
            java.lang.String r0 = r6.A01     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 != 0) goto L4a
            goto L7b
        L58:
            android.accounts.Account r0 = r6.A00     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            goto L3a
        L61:
            if (r1 != r0) goto L7c
            boolean r1 = r5.A05     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r6.A05     // Catch: java.lang.ClassCastException -> L7c
            if (r1 != r0) goto L7c
            boolean r1 = r5.A09     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r6.A09     // Catch: java.lang.ClassCastException -> L7c
            if (r1 != r0) goto L7c
            java.lang.String r1 = r5.A03     // Catch: java.lang.ClassCastException -> L7c
            java.lang.String r0 = r6.A03     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            r0 = 1
            return r0
        L7b:
            return r4
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Comparator] */
    static {
        Scope scope = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        A0G = scope;
        A0H = new Scope(1, "https://www.googleapis.com/auth/games");
        SZE sze = new SZE();
        Set set = sze.A02;
        set.add(A0F);
        set.add(A0D);
        A0C = sze.A00();
        SZE sze2 = new SZE();
        Set set2 = sze2.A02;
        set2.add(scope);
        set2.addAll(Arrays.asList(new Scope[0]));
        A0B = sze2.A00();
        CREATOR = C63474SlF.A01(19);
        A0I = new Object();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A07);
        AbstractC128825rw.A0E(parcel, AbstractC166987dD.A1F(this.A08), 2, false);
        AbstractC128825rw.A0A(parcel, this.A00, 3, i, false);
        AbstractC128825rw.A09(parcel, 4, this.A05);
        AbstractC128825rw.A09(parcel, 5, this.A09);
        AbstractC128825rw.A09(parcel, 6, this.A0A);
        AbstractC128825rw.A0C(parcel, this.A01, 7, false);
        AbstractC128825rw.A0C(parcel, this.A02, 8, false);
        AbstractC128825rw.A0E(parcel, this.A04, 9, false);
        AbstractC128825rw.A0C(parcel, this.A03, 10, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public GoogleSignInOptions(Account account, String str, String str2, String str3, ArrayList arrayList, Map map, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = i;
        this.A08 = arrayList;
        this.A00 = account;
        this.A05 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = AbstractC31180DnO.A0n(map);
        this.A06 = map;
        this.A03 = str3;
    }

    public final int hashCode() {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A1E.add(((Scope) arrayList.get(i)).A01);
        }
        Collections.sort(A1E);
        return ((((((((((((A1E.hashCode() + 31) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.A03);
    }
}
