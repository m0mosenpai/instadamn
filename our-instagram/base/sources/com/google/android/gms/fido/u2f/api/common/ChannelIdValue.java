package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import X.RjY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes10.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(8);
    public final ChannelIdValueType A00;
    public final String A01;
    public final String A02;

    /* loaded from: classes10.dex */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        /* JADX INFO: Fake field, exist only in values array */
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);

        public static final Parcelable.Creator CREATOR = C63471SlC.A00(7);
        public final int A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
        }

        ChannelIdValueType(int i) {
            this.A00 = i;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (!(obj instanceof ChannelIdValue)) {
                return false;
            }
            ChannelIdValue channelIdValue = (ChannelIdValue) obj;
            ChannelIdValueType channelIdValueType = this.A00;
            if (!channelIdValueType.equals(channelIdValue.A00)) {
                return false;
            }
            int ordinal = channelIdValueType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return false;
                    }
                    str = this.A02;
                    str2 = channelIdValue.A02;
                } else {
                    str = this.A01;
                    str2 = channelIdValue.A01;
                }
                return str.equals(str2);
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str;
        ChannelIdValueType channelIdValueType = this.A00;
        int hashCode = channelIdValueType.hashCode() + 31;
        int ordinal = channelIdValueType.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i = hashCode * 31;
                str = this.A02;
            } else {
                return hashCode;
            }
        } else {
            i = hashCode * 31;
            str = this.A01;
        }
        return AbstractC25226BEj.A03(str, i);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
                if (i == channelIdValueType.A00) {
                    this.A00 = channelIdValueType;
                    this.A01 = str;
                    this.A02 = str2;
                    return;
                }
            }
            throw new Exception(String.format("ChannelIdValueType %s not supported", AbstractC25228BEl.A1Y(i)));
        } catch (RjY e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A00.A00);
        AbstractC128825rw.A0C(parcel, this.A01, 3, false);
        AbstractC58322PtE.A1F(parcel, this.A02, A04, false);
    }

    public ChannelIdValue() {
        this.A00 = ChannelIdValueType.ABSENT;
        this.A02 = null;
        this.A01 = null;
    }
}
