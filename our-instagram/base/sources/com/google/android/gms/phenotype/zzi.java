package com.google.android.gms.phenotype;

import X.AbstractC111324zv;
import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC62225S2v;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class zzi extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(75);
    public final int A00;
    public final String A01;
    public final double A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final boolean A06;
    public final byte[] A07;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        zzi zziVar = (zzi) obj;
        int compareTo = this.A01.compareTo(zziVar.A01);
        if (compareTo == 0) {
            int i = this.A03;
            int i2 = zziVar.A03;
            if (i >= i2) {
                if (i == i2) {
                    int i3 = 0;
                    compareTo = 1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        byte[] bArr = this.A07;
                                        byte[] bArr2 = zziVar.A07;
                                        if (bArr != bArr2) {
                                            if (bArr != null) {
                                                if (bArr2 != null) {
                                                    while (true) {
                                                        int length = bArr.length;
                                                        int length2 = bArr2.length;
                                                        if (i3 < Math.min(length, length2)) {
                                                            compareTo = bArr[i3] - bArr2[i3];
                                                            if (compareTo != 0) {
                                                                break;
                                                            }
                                                            i3++;
                                                        } else if (length >= length2) {
                                                            compareTo = 0;
                                                            if (length != length2) {
                                                                return 1;
                                                            }
                                                        } else {
                                                            return -1;
                                                        }
                                                    }
                                                }
                                            }
                                            return -1;
                                        }
                                        return 0;
                                    }
                                    throw AbstractC58318PtA.A0W(AbstractC58320PtC.A12("Invalid enum value: ", AbstractC58318PtA.A0q(31), i));
                                }
                                String str = this.A05;
                                String str2 = zziVar.A05;
                                if (str != str2) {
                                    if (str != null) {
                                        if (str2 != null) {
                                            return str.compareTo(str2);
                                        }
                                    }
                                    return -1;
                                }
                                return 0;
                            }
                            return Double.compare(this.A02, zziVar.A02);
                        }
                        boolean z = this.A06;
                        if (z != zziVar.A06) {
                            if (!z) {
                                return -1;
                            }
                            return 1;
                        }
                        return 0;
                    }
                    long j = this.A04;
                    long j2 = zziVar.A04;
                    if (j >= j2) {
                        if (j == j2) {
                            return 0;
                        }
                    }
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        if (!AbstractC62225S2v.A00(this.A01, zziVar.A01) || (i = this.A03) != zziVar.A03 || this.A00 != zziVar.A00) {
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return Arrays.equals(this.A07, zziVar.A07);
                        }
                        throw AbstractC58318PtA.A0W(AbstractC58320PtC.A12("Invalid enum value: ", AbstractC58318PtA.A0q(31), i));
                    }
                    return AbstractC62225S2v.A00(this.A05, zziVar.A05);
                }
                i2 = (this.A02 > zziVar.A02 ? 1 : (this.A02 == zziVar.A02 ? 0 : -1));
            } else {
                if (this.A06 != zziVar.A06) {
                    return false;
                }
                return true;
            }
        } else {
            i2 = (this.A04 > zziVar.A04 ? 1 : (this.A04 == zziVar.A04 ? 0 : -1));
        }
        if (i2 != 0) {
            return false;
        }
        return true;
    }

    public zzi(String str, String str2, byte[] bArr, double d, int i, int i2, long j, boolean z) {
        this.A01 = str;
        this.A04 = j;
        this.A06 = z;
        this.A02 = d;
        this.A05 = str2;
        this.A07 = bArr;
        this.A03 = i;
        this.A00 = i2;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Flag(");
        String str2 = this.A01;
        A1C.append(str2);
        A1C.append(", ");
        int i = this.A03;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            byte[] bArr = this.A07;
                            if (bArr == null) {
                                A1C.append("null");
                            } else {
                                A1C.append("'");
                                str = Base64.encodeToString(bArr, 3);
                            }
                        } else {
                            StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str2) + 27);
                            A0q.append(AbstractC111324zv.A00(1675));
                            A0q.append(str2);
                            throw AbstractC58318PtA.A0W(AbstractC58320PtC.A12(", ", A0q, i));
                        }
                    } else {
                        A1C.append("'");
                        str = this.A05;
                    }
                    A1C.append(str);
                    A1C.append("'");
                } else {
                    A1C.append(this.A02);
                }
            } else {
                A1C.append(this.A06);
            }
        } else {
            A1C.append(this.A04);
        }
        A1C.append(", ");
        A1C.append(i);
        A1C.append(", ");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(")", A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A08(parcel, 3, this.A04);
        AbstractC128825rw.A09(parcel, 4, this.A06);
        double d = this.A02;
        parcel.writeInt(524293);
        parcel.writeDouble(d);
        AbstractC128825rw.A0C(parcel, this.A05, 6, false);
        AbstractC128825rw.A0F(parcel, this.A07, 7, false);
        AbstractC128825rw.A07(parcel, 8, this.A03);
        AbstractC128825rw.A07(parcel, 9, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
