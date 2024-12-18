package com.google.android.gms.auth.api.credentials;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC31174DnI;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63470SlB;
import X.SSI;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes10.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(93);
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Credential) {
                Credential credential = (Credential) obj;
                if (!TextUtils.equals(this.A01, credential.A01) || !TextUtils.equals(this.A02, credential.A02) || !SSI.A01(this.A00, credential.A00) || !TextUtils.equals(this.A03, credential.A03) || !TextUtils.equals(this.A04, credential.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(this.A01, this.A02, this.A00, this.A03, this.A04);
    }

    public Credential(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        List unmodifiableList;
        C3U5.A03(str, "credential identifier cannot be null");
        String trim = str.trim();
        C3U5.A06(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw AbstractC166987dD.A12("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                    z = true;
                }
            }
            if (!AbstractC31174DnI.A1b(z)) {
                throw AbstractC166987dD.A12("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw AbstractC166987dD.A12("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.A02 = str2;
        this.A00 = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A07 = unmodifiableList;
        this.A01 = trim;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, this.A01);
        AbstractC128825rw.A0B(parcel, this.A02);
        AbstractC128825rw.A0A(parcel, this.A00, 3, i, A1Q);
        AbstractC128825rw.A0E(parcel, this.A07, 4, A1Q);
        AbstractC128825rw.A0C(parcel, this.A03, 5, A1Q);
        AbstractC128825rw.A0C(parcel, this.A04, 6, A1Q);
        AbstractC128825rw.A0C(parcel, this.A05, 9, A1Q);
        AbstractC128825rw.A0C(parcel, this.A06, 10, A1Q);
        AbstractC128825rw.A06(parcel, A04);
    }
}
