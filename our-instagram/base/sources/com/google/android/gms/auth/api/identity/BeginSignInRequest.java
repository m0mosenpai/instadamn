package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(0);
    public final int A00;
    public final GoogleIdTokenRequestOptions A01;
    public final PasskeyJsonRequestOptions A02;
    public final PasskeysRequestOptions A03;
    public final PasswordRequestOptions A04;
    public final String A05;
    public final boolean A06;

    /* loaded from: classes10.dex */
    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63474SlF.A01(4);
        public final String A00;
        public final String A01;
        public final String A02;
        public final List A03;
        public final boolean A04;
        public final boolean A05;
        public final boolean A06;

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.A04 != googleIdTokenRequestOptions.A04 || !SSI.A01(this.A00, googleIdTokenRequestOptions.A00) || !SSI.A01(this.A01, googleIdTokenRequestOptions.A01) || this.A05 != googleIdTokenRequestOptions.A05 || !SSI.A01(this.A02, googleIdTokenRequestOptions.A02) || !SSI.A01(this.A03, googleIdTokenRequestOptions.A03) || this.A06 != googleIdTokenRequestOptions.A06) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A00, this.A01, Boolean.valueOf(this.A05), this.A02, this.A03, Boolean.valueOf(this.A06)});
        }

        public GoogleIdTokenRequestOptions(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            C3U5.A08(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.A04 = z;
            if (z) {
                C3U5.A03(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.A00 = str;
            this.A01 = str2;
            this.A05 = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = AbstractC166987dD.A1F(list);
                Collections.sort(arrayList);
            }
            this.A03 = arrayList;
            this.A02 = str3;
            this.A06 = z3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A09(parcel, 1, this.A04);
            AbstractC128825rw.A0B(parcel, this.A00);
            AbstractC128825rw.A0C(parcel, this.A01, 3, false);
            AbstractC128825rw.A09(parcel, 4, this.A05);
            AbstractC128825rw.A0C(parcel, this.A02, 5, false);
            AbstractC128825rw.A0D(parcel, this.A03, 6);
            AbstractC128825rw.A09(parcel, 7, this.A06);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63474SlF.A01(5);
        public final String A00;
        public final boolean A01;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PasskeyJsonRequestOptions) {
                    PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
                    if (this.A01 != passkeyJsonRequestOptions.A01 || !SSI.A01(this.A00, passkeyJsonRequestOptions.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return AbstractC37301Gc2.A02(Boolean.valueOf(this.A01), this.A00);
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                C3U5.A02(str);
            }
            this.A01 = z;
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A09(parcel, 1, this.A01);
            AbstractC128825rw.A0B(parcel, this.A00);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    @Deprecated
    /* loaded from: classes10.dex */
    public final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63474SlF.A01(6);
        public final String A00;
        public final boolean A01;
        public final byte[] A02;

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this != obj) {
                if (obj instanceof PasskeysRequestOptions) {
                    PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
                    if (this.A01 != passkeysRequestOptions.A01 || !Arrays.equals(this.A02, passkeysRequestOptions.A02) || ((str = this.A00) != (str2 = passkeysRequestOptions.A00) && (str == null || !str.equals(str2)))) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return AbstractC58321PtD.A0E(this.A02, AbstractC37301Gc2.A02(Boolean.valueOf(this.A01), this.A00) * 31);
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                C3U5.A02(bArr);
                C3U5.A02(str);
            }
            this.A01 = z;
            this.A02 = bArr;
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A09(parcel, 1, this.A01);
            AbstractC58319PtB.A1D(parcel, this.A00, A04, AbstractC58319PtB.A1R(parcel, this.A02));
        }
    }

    /* loaded from: classes10.dex */
    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63474SlF.A01(7);
        public final boolean A00;

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.A00 != ((PasswordRequestOptions) obj).A00) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return AbstractC58322PtE.A08(Boolean.valueOf(this.A00));
        }

        public PasswordRequestOptions(boolean z) {
            this.A00 = z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC58320PtC.A1F(parcel, AbstractC58319PtB.A04(parcel), this.A00);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!SSI.A01(this.A04, beginSignInRequest.A04) || !SSI.A01(this.A01, beginSignInRequest.A01) || !SSI.A01(this.A03, beginSignInRequest.A03) || !SSI.A01(this.A02, beginSignInRequest.A02) || !SSI.A01(this.A05, beginSignInRequest.A05) || this.A06 != beginSignInRequest.A06 || this.A00 != beginSignInRequest.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A03, this.A02, this.A05, Boolean.valueOf(this.A06)});
    }

    public BeginSignInRequest(GoogleIdTokenRequestOptions googleIdTokenRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, PasskeysRequestOptions passkeysRequestOptions, PasswordRequestOptions passwordRequestOptions, String str, int i, boolean z) {
        C3U5.A02(passwordRequestOptions);
        this.A04 = passwordRequestOptions;
        C3U5.A02(googleIdTokenRequestOptions);
        this.A01 = googleIdTokenRequestOptions;
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        this.A03 = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, null, false) : passkeysRequestOptions;
        this.A02 = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A04, 1, i, false);
        AbstractC128825rw.A0A(parcel, this.A01, 2, i, false);
        AbstractC128825rw.A0C(parcel, this.A05, 3, false);
        AbstractC128825rw.A09(parcel, 4, this.A06);
        AbstractC128825rw.A07(parcel, 5, this.A00);
        AbstractC128825rw.A0A(parcel, this.A03, 6, i, false);
        AbstractC128825rw.A0A(parcel, this.A02, 7, i, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
