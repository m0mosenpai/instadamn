package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import X.RjW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public final TokenBindingStatus A00;
    public final String A01;
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(83);
    public static final TokenBinding A03 = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
    public static final TokenBinding A02 = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* loaded from: classes10.dex */
    public enum TokenBindingStatus implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator CREATOR = C63474SlF.A01(82);
        public final String A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.A00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00);
        }

        TokenBindingStatus(String str) {
            this.A00 = str;
        }

        public static TokenBindingStatus A00(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.A00)) {
                    return tokenBindingStatus;
                }
            }
            throw new Exception(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        TokenBindingStatus tokenBindingStatus = this.A00;
        TokenBindingStatus tokenBindingStatus2 = tokenBinding.A00;
        if (tokenBindingStatus != tokenBindingStatus2 && (tokenBindingStatus == null || !tokenBindingStatus.equals(tokenBindingStatus2))) {
            return false;
        }
        String str = this.A01;
        String str2 = tokenBinding.A01;
        if (str != str2 && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public TokenBinding(String str, String str2) {
        C3U5.A02(str);
        try {
            this.A00 = TokenBindingStatus.A00(str);
            this.A01 = str2;
        } catch (RjW e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A00.toString());
        AbstractC58319PtB.A1D(parcel, this.A01, A04, false);
    }
}
