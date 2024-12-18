package com.facebook.smartcapture.logging;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.EnumC61146Rg7;
import X.MSY;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class CommonLoggingFields implements Parcelable {
    public Map _tagsMap;
    public EnumC61146Rg7 featureLevel;
    public String flowType;
    public String product;
    public String sessionId;
    public String submissionId;
    public Bundle tags;
    public static final Companion Companion = new Object();
    public static final CommonLoggingFields NO_OP_LOGGING_FIELDS = new CommonLoggingFields(EnumC61146Rg7.A03, "", "", null, null, null);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.facebook.smartcapture.logging.CommonLoggingFields$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public CommonLoggingFields createFromParcel(Parcel parcel) {
            C14360o3.A0B(parcel, 0);
            return new CommonLoggingFields(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CommonLoggingFields[] newArray(int i) {
            return new CommonLoggingFields[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            C14360o3.A0B(parcel, 0);
            return new CommonLoggingFields(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CommonLoggingFields[i];
        }
    };

    /* loaded from: classes10.dex */
    public final class Companion {
        public final Parcelable.Creator getCREATOR() {
            return CommonLoggingFields.CREATOR;
        }

        public final CommonLoggingFields getNO_OP_LOGGING_FIELDS() {
            return CommonLoggingFields.NO_OP_LOGGING_FIELDS;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map bundleToMap(Bundle bundle) {
            HashMap A1G = AbstractC166987dD.A1G();
            if (bundle != null) {
                Iterator A14 = AbstractC58319PtB.A14(bundle);
                while (A14.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(A14);
                    A1G.put(A1B, bundle.getString(A1B));
                }
            }
            return A1G;
        }

        public Companion() {
        }
    }

    public CommonLoggingFields(Parcel parcel) {
        C14360o3.A0B(parcel, 1);
        EnumC61146Rg7 enumC61146Rg7 = (EnumC61146Rg7) parcel.readSerializable();
        if (enumC61146Rg7 != null) {
            this.featureLevel = enumC61146Rg7;
            String readString = parcel.readString();
            if (readString != null) {
                this.flowType = readString;
                String readString2 = parcel.readString();
                if (readString2 != null) {
                    this.product = readString2;
                    this.sessionId = parcel.readString();
                    Bundle A08 = MSY.A08(parcel, String.class);
                    this.tags = A08;
                    this._tagsMap = Companion.bundleToMap(A08);
                    this.submissionId = parcel.readString();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void setFeatureLevel(EnumC61146Rg7 enumC61146Rg7) {
        C14360o3.A0B(enumC61146Rg7, 0);
        this.featureLevel = enumC61146Rg7;
    }

    public final void setFlowType(String str) {
        C14360o3.A0B(str, 0);
        this.flowType = str;
    }

    public final void setProduct(String str) {
        C14360o3.A0B(str, 0);
        this.product = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeSerializable(this.featureLevel);
        parcel.writeString(this.flowType);
        parcel.writeString(this.product);
        parcel.writeString(this.sessionId);
        parcel.writeBundle(this.tags);
        parcel.writeString(this.submissionId);
    }

    public static final Parcelable.Creator getCREATOR() {
        return CREATOR;
    }

    public final EnumC61146Rg7 getFeatureLevel() {
        return this.featureLevel;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSubmissionId() {
        return this.submissionId;
    }

    public final Bundle getTags() {
        return this.tags;
    }

    public final Map getTagsMap() {
        return AbstractC58318PtA.A12(this._tagsMap);
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSubmissionId(String str) {
        this.submissionId = str;
    }

    public final void setTags(Bundle bundle) {
        this.tags = bundle;
    }

    public CommonLoggingFields(EnumC61146Rg7 enumC61146Rg7, String str, String str2, String str3, Bundle bundle, String str4) {
        AbstractC167027dH.A13(enumC61146Rg7, str, str2);
        this.featureLevel = enumC61146Rg7;
        this.flowType = str;
        this.product = str2;
        this.sessionId = str3;
        this.tags = bundle;
        this._tagsMap = Companion.bundleToMap(bundle);
        this.submissionId = str4;
    }
}
