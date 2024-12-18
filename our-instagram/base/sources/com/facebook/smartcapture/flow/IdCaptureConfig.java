package com.facebook.smartcapture.flow;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C05F;
import X.C14360o3;
import X.C63473SlE;
import X.EnumC61111RfR;
import X.EnumC61146Rg7;
import X.SXL;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.clientsignals.ClientSignalsAccumulator;
import com.facebook.smartcapture.download.CreditCardModulesDownloader;
import com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.IdCaptureUi;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public class IdCaptureConfig implements Parcelable {
    public static volatile EnumC61111RfR A0S;
    public static volatile EnumC61146Rg7 A0T;
    public static volatile StringOverrideFactory A0U;
    public static volatile Integer A0V;
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(64);
    public final int A00;
    public final long A01;
    public final long A02;
    public final Bundle A03;
    public final FixedSizes A04;
    public final ClientSignalsAccumulator A05;
    public final CreditCardModulesDownloader A06;
    public final IdCaptureExperimentConfigProvider A07;
    public final SmartCaptureLoggerProvider A08;
    public final ResourcesProvider A09;
    public final IdCaptureUi A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final EnumC61111RfR A0M;
    public final EnumC61146Rg7 A0N;
    public final StringOverrideFactory A0O;
    public final Integer A0P;
    public final Set A0Q;
    public final boolean A0R;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdCaptureConfig) {
                IdCaptureConfig idCaptureConfig = (IdCaptureConfig) obj;
                if (!C14360o3.A0K(this.A0B, idCaptureConfig.A0B) || A00() != idCaptureConfig.A00() || !C14360o3.A0K(this.A0A, idCaptureConfig.A0A) || !C14360o3.A0K(this.A05, idCaptureConfig.A05) || A03() != idCaptureConfig.A03() || !C14360o3.A0K(this.A07, idCaptureConfig.A07) || A01() != idCaptureConfig.A01() || !C14360o3.A0K(this.A04, idCaptureConfig.A04) || !C14360o3.A0K(this.A0C, idCaptureConfig.A0C) || this.A0H != idCaptureConfig.A0H || this.A0I != idCaptureConfig.A0I || this.A0R != idCaptureConfig.A0R || this.A0J != idCaptureConfig.A0J || this.A0K != idCaptureConfig.A0K || this.A0L != idCaptureConfig.A0L || !C14360o3.A0K(this.A08, idCaptureConfig.A08) || !C14360o3.A0K(this.A0D, idCaptureConfig.A0D) || this.A01 != idCaptureConfig.A01 || !C14360o3.A0K(this.A06, idCaptureConfig.A06) || !C14360o3.A0K(this.A0E, idCaptureConfig.A0E) || !C14360o3.A0K(this.A0F, idCaptureConfig.A0F) || !C14360o3.A0K(this.A09, idCaptureConfig.A09) || !C14360o3.A0K(this.A0G, idCaptureConfig.A0G) || !C14360o3.A0K(A02(), idCaptureConfig.A02()) || this.A02 != idCaptureConfig.A02 || !C14360o3.A0K(this.A03, idCaptureConfig.A03) || this.A00 != idCaptureConfig.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final EnumC61111RfR A00() {
        if (this.A0Q.contains("captureMode")) {
            return this.A0M;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = EnumC61111RfR.A03;
                }
            }
        }
        return A0S;
    }

    public final EnumC61146Rg7 A01() {
        if (this.A0Q.contains("featureLevel")) {
            return this.A0N;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = EnumC61146Rg7.A03;
                }
            }
        }
        return A0T;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory, java.lang.Object] */
    public final StringOverrideFactory A02() {
        if (this.A0Q.contains("stringOverrideFactory")) {
            return this.A0O;
        }
        if (A0U == null) {
            synchronized (this) {
                if (A0U == null) {
                    A0U = new Object();
                }
            }
        }
        return A0U;
    }

    public final Integer A03() {
        if (this.A0Q.contains("designSystem")) {
            return this.A0P;
        }
        if (A0V == null) {
            synchronized (this) {
                if (A0V == null) {
                    A0V = C05F.A00;
                }
            }
        }
        return A0V;
    }

    public final int hashCode() {
        int ordinal;
        int intValue;
        int A02 = AbstractC63311ShH.A02(this.A0B);
        int i = -1;
        if (A00() == null) {
            ordinal = -1;
        } else {
            ordinal = A00().ordinal();
        }
        int A06 = (((((A02 * 31) + ordinal) * 31) + AbstractC25235BEs.A06(this.A0A)) * 31) + AbstractC25235BEs.A06(this.A05);
        if (A03() == null) {
            intValue = -1;
        } else {
            intValue = A03().intValue();
        }
        int A062 = (((A06 * 31) + intValue) * 31) + AbstractC25235BEs.A06(this.A07);
        if (A01() != null) {
            i = A01().ordinal();
        }
        return (((AbstractC58321PtD.A08(this.A02, ((((((((((((AbstractC58321PtD.A08(this.A01, ((((((((((((((((((((((A062 * 31) + i) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A0C)) * 31) + AbstractC58322PtE.A02(this.A0H ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A0I ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A0R ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A0J ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A0K ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A0L ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC25235BEs.A06(this.A0D)) * 31) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A0E)) * 31) + AbstractC25235BEs.A06(this.A0F)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A0G)) * 31) + AbstractC25235BEs.A06(A02())) * 31) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A0B, 0, 1);
        AbstractC58323PtF.A1C(parcel, this.A0M);
        AbstractC58323PtF.A1A(parcel, this.A0A, i);
        AbstractC58323PtF.A1A(parcel, this.A05, i);
        AbstractC167027dH.A0o(parcel, this.A0P, 0, 1);
        AbstractC58323PtF.A1A(parcel, this.A07, i);
        AbstractC58323PtF.A1C(parcel, this.A0N);
        FixedSizes fixedSizes = this.A04;
        if (fixedSizes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fixedSizes.writeToParcel(parcel, i);
        }
        AbstractC58322PtE.A1E(parcel, this.A0C, 0, 1);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        AbstractC58323PtF.A1A(parcel, this.A08, i);
        AbstractC58322PtE.A1E(parcel, this.A0D, 0, 1);
        parcel.writeLong(this.A01);
        AbstractC58323PtF.A1A(parcel, this.A06, i);
        parcel.writeString(this.A0E);
        AbstractC58322PtE.A1E(parcel, this.A0F, 0, 1);
        AbstractC58323PtF.A1A(parcel, this.A09, i);
        AbstractC58322PtE.A1E(parcel, this.A0G, 0, 1);
        AbstractC58323PtF.A1A(parcel, this.A0O, i);
        parcel.writeLong(this.A02);
        Bundle bundle = this.A03;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A0Q);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
    }

    public IdCaptureConfig(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = EnumC61111RfR.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (IdCaptureUi) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ClientSignalsAccumulator) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = AbstractC58322PtE.A0i(parcel, 2);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (IdCaptureExperimentConfigProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = EnumC61146Rg7.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (FixedSizes) FixedSizes.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        this.A0H = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0I = AbstractC58320PtC.A1U(parcel);
        this.A0R = AbstractC58320PtC.A1U(parcel);
        this.A0J = AbstractC58320PtC.A1U(parcel);
        this.A0K = AbstractC58320PtC.A1U(parcel);
        this.A0L = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (SmartCaptureLoggerProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (CreditCardModulesDownloader) parcel.readParcelable(A0g);
        }
        this.A0E = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (ResourcesProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (StringOverrideFactory) parcel.readParcelable(A0g);
        }
        this.A02 = parcel.readLong();
        this.A03 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
        this.A00 = parcel.readInt();
        HashSet A1H = AbstractC166987dD.A1H();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1H.add(parcel.readString());
        }
        this.A0Q = Collections.unmodifiableSet(A1H);
    }

    public IdCaptureConfig(SXL sxl) {
        this.A0B = sxl.A0D;
        this.A0M = sxl.A04;
        this.A0A = sxl.A0B;
        this.A05 = null;
        this.A0P = sxl.A0C;
        this.A07 = sxl.A07;
        this.A0N = sxl.A05;
        this.A04 = sxl.A03;
        this.A0C = sxl.A0E;
        this.A0H = sxl.A0K;
        this.A0I = sxl.A0L;
        this.A0R = false;
        this.A0J = false;
        this.A0K = sxl.A0M;
        this.A0L = sxl.A0N;
        this.A08 = sxl.A08;
        this.A0D = sxl.A0F;
        this.A01 = 0L;
        this.A06 = sxl.A06;
        String str = sxl.A0G;
        AbstractC63311ShH.A04(str, "product");
        this.A0E = str;
        this.A0F = sxl.A0H;
        this.A09 = sxl.A09;
        this.A0G = sxl.A0I;
        this.A0O = sxl.A0A;
        this.A02 = sxl.A01;
        this.A03 = sxl.A02;
        this.A00 = sxl.A00;
        this.A0Q = Collections.unmodifiableSet(sxl.A0J);
    }
}
