package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC43591JPw;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C63471SlC;
import X.EnumC61225Rim;
import X.EnumC61226Rin;
import X.InterfaceC65410Tjh;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(0);
    public final InterfaceC65410Tjh A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.Rim[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Rim] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Rin] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Tjh] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.Rin] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Rin[]] */
    public static COSEAlgorithmIdentifier A00(int i) {
        ?? r3;
        if (i == -262) {
            r3 = EnumC61226Rin.RS1;
        } else {
            ?? values = EnumC61226Rin.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    r3 = values[i2];
                    if (r3.A00 == i) {
                        break;
                    }
                    i2++;
                } else {
                    ?? values2 = EnumC61225Rim.values();
                    int length2 = values2.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        r3 = values2[i3];
                        if (r3.A00 != i) {
                        }
                    }
                    throw new Exception(AnonymousClass001.A0c("Algorithm with COSE value ", AbstractC43591JPw.A00(99), i));
                }
            }
        }
        return new COSEAlgorithmIdentifier(r3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof COSEAlgorithmIdentifier) || this.A00.Aap() != ((COSEAlgorithmIdentifier) obj).A00.Aap()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0g("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.A00), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.Aap());
    }

    public COSEAlgorithmIdentifier(InterfaceC65410Tjh interfaceC65410Tjh) {
        this.A00 = interfaceC65410Tjh;
    }
}
