package com.facebook.smartcapture.flow;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.AbstractC25228BEl;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37302Gc3;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C05F;
import X.C14360o3;
import X.C63473SlE;
import X.EnumC61102RfH;
import X.EnumC61132Rfm;
import X.EnumC61146Rg7;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.R;
import com.facebook.smartcapture.capture.SelfieEvidenceRecorderProvider;
import com.facebook.smartcapture.clientsignals.ClientSignalsAccumulator;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.experimentation.SelfieCaptureExperimentConfigProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.ui.consent.ConsentTextsProvider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public class SelfieCaptureConfig implements Parcelable {
    public static volatile EnumC61146Rg7 A0Z;
    public static volatile StringOverrideFactory A0a;
    public static volatile Integer A0b;
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(65);
    public final int A00;
    public final int A01;
    public final long A02;
    public final Bundle A03;
    public final SelfieEvidenceRecorderProvider A04;
    public final ChallengeProvider A05;
    public final EnumC61132Rfm A06;
    public final EnumC61102RfH A07;
    public final SelfieCaptureExperimentConfigProvider A08;
    public final FaceTrackerModelsProvider A09;
    public final FaceTrackerProvider A0A;
    public final SmartCaptureLoggerProvider A0B;
    public final ResourcesProvider A0C;
    public final SelfieCaptureUi A0D;
    public final ConsentTextsProvider A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Integer A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final ClientSignalsAccumulator A0T;
    public final EnumC61146Rg7 A0U;
    public final FaceTrackerModelsProvider A0V;
    public final StringOverrideFactory A0W;
    public final Integer A0X;
    public final Set A0Y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelfieCaptureConfig) {
                SelfieCaptureConfig selfieCaptureConfig = (SelfieCaptureConfig) obj;
                if (!C14360o3.A0K(this.A0L, selfieCaptureConfig.A0L) || !C14360o3.A0K(this.A05, selfieCaptureConfig.A05) || !C14360o3.A0K(this.A0T, selfieCaptureConfig.A0T) || !C14360o3.A0K(this.A0E, selfieCaptureConfig.A0E) || A02() != selfieCaptureConfig.A02() || !C14360o3.A0K(this.A0F, selfieCaptureConfig.A0F) || !C14360o3.A0K(this.A0M, selfieCaptureConfig.A0M) || !C14360o3.A0K(this.A04, selfieCaptureConfig.A04) || !C14360o3.A0K(this.A08, selfieCaptureConfig.A08) || !C14360o3.A0K(this.A0G, selfieCaptureConfig.A0G) || !C14360o3.A0K(this.A09, selfieCaptureConfig.A09) || !C14360o3.A0K(this.A0A, selfieCaptureConfig.A0A) || A00() != selfieCaptureConfig.A00() || !C14360o3.A0K(this.A0H, selfieCaptureConfig.A0H) || this.A0R != selfieCaptureConfig.A0R || !C14360o3.A0K(this.A0N, selfieCaptureConfig.A0N) || !C14360o3.A0K(this.A0V, selfieCaptureConfig.A0V) || this.A0K != selfieCaptureConfig.A0K || !C14360o3.A0K(this.A0O, selfieCaptureConfig.A0O) || !C14360o3.A0K(this.A0C, selfieCaptureConfig.A0C) || this.A06 != selfieCaptureConfig.A06 || !C14360o3.A0K(this.A0D, selfieCaptureConfig.A0D) || !C14360o3.A0K(this.A0P, selfieCaptureConfig.A0P) || !C14360o3.A0K(this.A0I, selfieCaptureConfig.A0I) || this.A0S != selfieCaptureConfig.A0S || !C14360o3.A0K(this.A0J, selfieCaptureConfig.A0J) || !C14360o3.A0K(this.A0B, selfieCaptureConfig.A0B) || !C14360o3.A0K(A01(), selfieCaptureConfig.A01()) || this.A02 != selfieCaptureConfig.A02 || !C14360o3.A0K(this.A03, selfieCaptureConfig.A03) || this.A00 != selfieCaptureConfig.A00 || this.A01 != selfieCaptureConfig.A01 || this.A07 != selfieCaptureConfig.A07 || !C14360o3.A0K(this.A0Q, selfieCaptureConfig.A0Q)) {
                }
            }
            return false;
        }
        return true;
    }

    public final EnumC61146Rg7 A00() {
        if (this.A0Y.contains("featureLevel")) {
            return this.A0U;
        }
        if (A0Z == null) {
            synchronized (this) {
                if (A0Z == null) {
                    A0Z = EnumC61146Rg7.A03;
                }
            }
        }
        return A0Z;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory, java.lang.Object] */
    public final StringOverrideFactory A01() {
        if (this.A0Y.contains("stringOverrideFactory")) {
            return this.A0W;
        }
        if (A0a == null) {
            synchronized (this) {
                if (A0a == null) {
                    A0a = new Object();
                }
            }
        }
        return A0a;
    }

    public final Integer A02() {
        if (this.A0Y.contains("designSystem")) {
            return this.A0X;
        }
        if (A0b == null) {
            synchronized (this) {
                if (A0b == null) {
                    A0b = C05F.A00;
                }
            }
        }
        return A0b;
    }

    public final int hashCode() {
        int intValue;
        int ordinal;
        int intValue2;
        int ordinal2;
        int A02 = (((((AbstractC63311ShH.A02(this.A0L) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A0T)) * 31) + AbstractC25235BEs.A06(this.A0E);
        int i = -1;
        if (A02() == null) {
            intValue = -1;
        } else {
            intValue = A02().intValue();
        }
        int A06 = (((((((((((((((A02 * 31) + intValue) * 31) + AbstractC25235BEs.A06(this.A0F)) * 31) + AbstractC25235BEs.A06(this.A0M)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC25235BEs.A06(this.A0G)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A0A);
        if (A00() == null) {
            ordinal = -1;
        } else {
            ordinal = A00().ordinal();
        }
        int A062 = (((((((((A06 * 31) + ordinal) * 31) + AbstractC25235BEs.A06(this.A0H)) * 31) + AbstractC58322PtE.A02(this.A0R ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A0N)) * 31) + AbstractC25235BEs.A06(this.A0V);
        Integer num = this.A0K;
        if (num == null) {
            intValue2 = -1;
        } else {
            intValue2 = num.intValue();
        }
        int A063 = (((((A062 * 31) + intValue2) * 31) + AbstractC25235BEs.A06(this.A0O)) * 31) + AbstractC25235BEs.A06(this.A0C);
        EnumC61132Rfm enumC61132Rfm = this.A06;
        if (enumC61132Rfm == null) {
            ordinal2 = -1;
        } else {
            ordinal2 = enumC61132Rfm.ordinal();
        }
        int A064 = (((((((((((((((((((((((A063 * 31) + ordinal2) * 31) + AbstractC25235BEs.A06(this.A0D)) * 31) + AbstractC25235BEs.A06(this.A0P)) * 31) + AbstractC25235BEs.A06(this.A0I)) * 31) + AbstractC58322PtE.A02(this.A0S ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A0J)) * 31) + AbstractC25235BEs.A06(this.A0B)) * 31) + AbstractC25235BEs.A06(A01())) * 31) + AbstractC25228BEl.A03(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + this.A00) * 31) + this.A01;
        EnumC61102RfH enumC61102RfH = this.A07;
        if (enumC61102RfH != null) {
            i = enumC61102RfH.ordinal();
        }
        return (((A064 * 31) + i) * 31) + AbstractC25235BEs.A06(this.A0Q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A0L, 0, 1);
        ChallengeProvider challengeProvider = this.A05;
        if (challengeProvider == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            challengeProvider.writeToParcel(parcel, i);
        }
        AbstractC58323PtF.A1A(parcel, this.A0T, i);
        AbstractC58323PtF.A1A(parcel, this.A0E, i);
        AbstractC167027dH.A0o(parcel, this.A0X, 0, 1);
        AbstractC31179DnN.A0p(parcel, this.A0F);
        AbstractC58322PtE.A1E(parcel, this.A0M, 0, 1);
        parcel.writeParcelable(this.A04, i);
        AbstractC58323PtF.A1A(parcel, this.A08, i);
        AbstractC31179DnN.A0p(parcel, this.A0G);
        AbstractC58323PtF.A1A(parcel, this.A09, i);
        AbstractC58323PtF.A1A(parcel, this.A0A, i);
        AbstractC58323PtF.A1C(parcel, this.A0U);
        AbstractC31179DnN.A0p(parcel, this.A0H);
        parcel.writeInt(this.A0R ? 1 : 0);
        AbstractC58322PtE.A1E(parcel, this.A0N, 0, 1);
        AbstractC58323PtF.A1A(parcel, this.A0V, i);
        AbstractC167027dH.A0o(parcel, this.A0K, 0, 1);
        parcel.writeString(this.A0O);
        AbstractC58323PtF.A1A(parcel, this.A0C, i);
        AbstractC58323PtF.A1C(parcel, this.A06);
        AbstractC58323PtF.A1A(parcel, this.A0D, i);
        AbstractC58322PtE.A1E(parcel, this.A0P, 0, 1);
        AbstractC31179DnN.A0p(parcel, this.A0I);
        parcel.writeInt(this.A0S ? 1 : 0);
        AbstractC31179DnN.A0p(parcel, this.A0J);
        AbstractC58323PtF.A1A(parcel, this.A0B, i);
        AbstractC58323PtF.A1A(parcel, this.A0W, i);
        parcel.writeLong(this.A02);
        Bundle bundle = this.A03;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        AbstractC58323PtF.A1C(parcel, this.A07);
        AbstractC58322PtE.A1E(parcel, this.A0Q, 0, 1);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A0Y);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
    }

    public SelfieCaptureConfig(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ChallengeProvider) ChallengeProvider.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = (ClientSignalsAccumulator) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (ConsentTextsProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = AbstractC58322PtE.A0i(parcel, 2);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = Boolean.valueOf(AbstractC58320PtC.A1U(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        this.A04 = (SelfieEvidenceRecorderProvider) parcel.readParcelable(A0g);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (SelfieCaptureExperimentConfigProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = Boolean.valueOf(AbstractC58320PtC.A1U(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (FaceTrackerModelsProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (FaceTrackerProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = EnumC61146Rg7.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = Boolean.valueOf(AbstractC58320PtC.A1U(parcel));
        }
        this.A0R = AbstractC58320PtC.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = (FaceTrackerModelsProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = AbstractC58322PtE.A0i(parcel, 3);
        }
        this.A0O = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (ResourcesProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = EnumC61132Rfm.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (SelfieCaptureUi) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = Boolean.valueOf(AbstractC58320PtC.A1U(parcel));
        }
        this.A0S = AbstractC58320PtC.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = Boolean.valueOf(parcel.readInt() == 1);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (SmartCaptureLoggerProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (StringOverrideFactory) parcel.readParcelable(A0g);
        }
        this.A02 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A07 = parcel.readInt() != 0 ? EnumC61102RfH.values()[parcel.readInt()] : null;
        this.A0Q = AbstractC58322PtE.A0n(parcel);
        HashSet A1H = AbstractC166987dD.A1H();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1H.add(parcel.readString());
        }
        this.A0Y = Collections.unmodifiableSet(A1H);
    }

    public SelfieCaptureConfig(Bundle bundle, SelfieEvidenceRecorderProvider selfieEvidenceRecorderProvider, ChallengeProvider challengeProvider, EnumC61132Rfm enumC61132Rfm, FaceTrackerModelsProvider faceTrackerModelsProvider, FaceTrackerProvider faceTrackerProvider, SmartCaptureLoggerProvider smartCaptureLoggerProvider, ResourcesProvider resourcesProvider, StringOverrideFactory stringOverrideFactory, SelfieCaptureUi selfieCaptureUi, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, Set set, int i, long j, boolean z) {
        this.A0L = str;
        this.A05 = challengeProvider;
        this.A0T = null;
        this.A0E = null;
        this.A0X = num;
        this.A0F = bool;
        this.A0M = str2;
        this.A04 = selfieEvidenceRecorderProvider;
        this.A08 = null;
        this.A0G = bool2;
        this.A09 = faceTrackerModelsProvider;
        this.A0A = faceTrackerProvider;
        this.A0U = null;
        this.A0H = bool3;
        this.A0R = false;
        this.A0N = str3;
        this.A0V = null;
        this.A0K = num2;
        AbstractC63311ShH.A04(str4, "product");
        this.A0O = str4;
        this.A0C = resourcesProvider;
        this.A06 = enumC61132Rfm;
        this.A0D = selfieCaptureUi;
        this.A0P = str5;
        this.A0I = bool4;
        this.A0S = z;
        this.A0J = bool5;
        this.A0B = smartCaptureLoggerProvider;
        this.A0W = stringOverrideFactory;
        this.A02 = j;
        this.A03 = bundle;
        this.A00 = i;
        this.A01 = R.style.SmartCapture_Selfie_Ig;
        this.A07 = null;
        this.A0Q = str6;
        this.A0Y = Collections.unmodifiableSet(set);
    }
}
