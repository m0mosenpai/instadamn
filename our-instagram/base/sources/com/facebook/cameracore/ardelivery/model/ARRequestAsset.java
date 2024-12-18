package com.facebook.cameracore.ardelivery.model;

import X.AbstractC126965oa;
import X.AbstractC58317Pt9;
import X.AnonymousClass001;
import X.C05F;
import X.C174407pa;
import X.C206149Aw;
import X.EnumC1825988f;
import X.EnumC202068wl;
import X.EnumC203618zO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class ARRequestAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(6);
    public final long A00;
    public final long A01;
    public final C174407pa A02;
    public final SparkVisionCapability A03;
    public final ImmutableList A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String A0D;

    /* loaded from: classes4.dex */
    public enum CompressionMethod {
        NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
        ZIP("ZIP"),
        TAR_BROTLI("TAR_BROTLI");

        public String mMethod;

        public static CompressionMethod fromJson(String str) {
            return valueOf(str.toUpperCase(Locale.US));
        }

        public static CompressionMethod fromString(String str) {
            return valueOf(str.toUpperCase(Locale.US));
        }

        public String getCompressionMethod() {
            return this.mMethod;
        }

        CompressionMethod(String str) {
            this.mMethod = str;
        }

        public static CompressionMethod fromCompressionType(EnumC203618zO enumC203618zO) {
            int ordinal = enumC203618zO.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return TAR_BROTLI;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0R("unsupported compression method for CompressionType : ", enumC203618zO.name()));
                }
                return ZIP;
            }
            return NONE;
        }

        public static CompressionMethod fromCompressionTypeCppValue(int i) {
            for (EnumC203618zO enumC203618zO : EnumC203618zO.values()) {
                if (enumC203618zO.A00 == i) {
                    return fromCompressionType(enumC203618zO);
                }
            }
            throw new IllegalArgumentException(AnonymousClass001.A0O("Unsupported compression type : ", i));
        }

        public static String toJson(CompressionMethod compressionMethod) {
            return compressionMethod.getCompressionMethod();
        }

        public static EnumC203618zO toXplatCompressionType(CompressionMethod compressionMethod) {
            int ordinal = compressionMethod.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return EnumC203618zO.TarBrotli;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported compression method : ");
                    sb.append(compressionMethod);
                    throw new IllegalArgumentException(sb.toString());
                }
                return EnumC203618zO.Zip;
            }
            return EnumC203618zO.None;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        SparkVisionCapability sparkVisionCapability;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ARRequestAsset)) {
            return false;
        }
        ARRequestAsset aRRequestAsset = (ARRequestAsset) obj;
        SparkVisionCapability sparkVisionCapability2 = this.A03;
        if (sparkVisionCapability2 == null && aRRequestAsset.A03 == null) {
            z = true;
        } else if (sparkVisionCapability2 != null && (sparkVisionCapability = aRRequestAsset.A03) != null) {
            z = sparkVisionCapability2.equals(sparkVisionCapability);
        } else {
            z = false;
        }
        if (this.A02.A09.equals(aRRequestAsset.A02.A09) && AbstractC126965oa.A04(this.A07, aRRequestAsset.A07) && AbstractC126965oa.A04(this.A09, aRRequestAsset.A09) && AbstractC126965oa.A04(this.A0D, aRRequestAsset.A0D) && this.A0B == aRRequestAsset.A0B && AbstractC126965oa.A04(this.A06, aRRequestAsset.A06) && this.A05 == aRRequestAsset.A05 && this.A00 == aRRequestAsset.A00) {
            List list = this.A0A;
            List list2 = aRRequestAsset.A0A;
            if (list != null ? list.equals(list2) : list2 == null) {
                if (AbstractC126965oa.A04(this.A08, aRRequestAsset.A08)) {
                    ImmutableList immutableList = this.A04;
                    ImmutableList immutableList2 = aRRequestAsset.A04;
                    if (immutableList != null ? immutableList.equals(immutableList2) : immutableList2 == null) {
                        if (this.A0C == aRRequestAsset.A0C && z) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.A09.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        C174407pa c174407pa = this.A02;
        sb.append(c174407pa.A09);
        sb.append(", name: ");
        sb.append(c174407pa.A0B);
        sb.append(", instance id: ");
        sb.append(c174407pa.A0A);
        sb.append(AbstractC58317Pt9.A00(423));
        sb.append(c174407pa.A08);
        sb.append(", asset type: ");
        ARAssetType aRAssetType = c174407pa.A02;
        sb.append(aRAssetType);
        sb.append(", sub asset type: ");
        sb.append(c174407pa.A02());
        sb.append(", compression method: ");
        sb.append(c174407pa.A03);
        sb.append(", uri: ");
        sb.append(this.A09);
        sb.append(", file size bytes: ");
        sb.append(this.A00);
        sb.append(", hash value: ");
        sb.append(this.A06);
        sb.append(", hash type: ");
        Integer num = this.A05;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "MD5";
        } else {
            str = "SHA256";
        }
        sb.append(str);
        sb.append(", is logging disabled: ");
        sb.append(this.A0B);
        sb.append(", is asset encrypted: ");
        sb.append(c174407pa.A06.booleanValue());
        sb.append(", uses flm capability: ");
        sb.append(this.A0C);
        if (aRAssetType == ARAssetType.EFFECT) {
            sb.append(", model capability minVersion: ");
            sb.append(this.A0A);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        C174407pa c174407pa = this.A02;
        ByteBuffer allocate = ByteBuffer.allocate(4096);
        allocate.putLong(7310021016723351138L);
        C174407pa.A01(c174407pa.A09, allocate);
        C174407pa.A01(c174407pa.A0A, allocate);
        C174407pa.A01(c174407pa.A0B, allocate);
        C174407pa.A01(c174407pa.A02.name(), allocate);
        C174407pa.A01(c174407pa.A02(), allocate);
        C174407pa.A01(c174407pa.A0C, allocate);
        C174407pa.A01(c174407pa.A03.name(), allocate);
        allocate.putInt(c174407pa.A01);
        C174407pa.A01(c174407pa.A08, allocate);
        C174407pa.A01(c174407pa.A07.toString(), allocate);
        EnumC1825988f enumC1825988f = c174407pa.A05;
        if (enumC1825988f == null) {
            obj = null;
        } else {
            obj = enumC1825988f.toString();
        }
        C174407pa.A01(obj, allocate);
        C174407pa.A01(c174407pa.A06.toString(), allocate);
        C174407pa.A01(c174407pa.A0D, allocate);
        parcel.writeByteArray(Arrays.copyOf(allocate.array(), allocate.position()));
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeTypedList(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeTypedList(this.A04);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        int i2 = 0;
        parcel.writeParcelable(this.A03, 0);
        Integer num = this.A05;
        if (num != null) {
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public ARRequestAsset(Parcel parcel) {
        ImmutableList copyOf;
        try {
            this.A02 = new C174407pa(ByteBuffer.wrap(parcel.createByteArray()));
            this.A07 = parcel.readString();
            this.A09 = parcel.readString();
            this.A0D = parcel.readString();
            this.A0B = parcel.readByte() != 0;
            this.A06 = parcel.readString();
            this.A00 = parcel.readLong();
            this.A01 = parcel.readLong();
            this.A0A = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
            this.A08 = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AREffectAsyncAsset.CREATOR);
            if (createTypedArrayList == null) {
                copyOf = null;
            } else {
                copyOf = ImmutableList.copyOf((Collection) createTypedArrayList);
            }
            this.A04 = copyOf;
            this.A0C = parcel.readByte() != 0;
            this.A03 = (SparkVisionCapability) parcel.readParcelable(SparkVisionCapability.class.getClassLoader());
            this.A05 = C05F.A00(2)[parcel.readInt()];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ARRequestAsset(ARAssetType aRAssetType, CompressionMethod compressionMethod, EffectAssetType effectAssetType, EnumC202068wl enumC202068wl, EnumC1825988f enumC1825988f, SparkVisionCapability sparkVisionCapability, VersionedCapability versionedCapability, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        if (compressionMethod != null) {
            this.A02 = new C174407pa(aRAssetType, compressionMethod, effectAssetType, enumC202068wl, enumC1825988f, versionedCapability, Boolean.valueOf(z), Boolean.valueOf(z2), str, str2, str3, str7, aRAssetType == ARAssetType.SPARKVISION ? str : null, i);
            this.A09 = str5;
            this.A07 = str4;
            this.A06 = str6;
            this.A0B = z;
            this.A0D = str;
            this.A00 = j;
            this.A01 = j2;
            this.A0A = list;
            this.A08 = str8;
            this.A04 = list2 != null ? ImmutableList.copyOf((Collection) list2) : null;
            this.A03 = sparkVisionCapability;
            this.A0C = z3;
            this.A05 = num;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("Compression method must not be null: id=", str));
    }
}
