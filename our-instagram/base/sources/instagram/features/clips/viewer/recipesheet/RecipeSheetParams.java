package instagram.features.clips.viewer.recipesheet;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class RecipeSheetParams extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(89);
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public RecipeSheetParams(String str, String str2, String str3, String str4, int i, int i2, long j, boolean z, boolean z2) {
        AbstractC167007dF.A1G(str, 1, str2);
        this.A04 = str;
        this.A02 = j;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipeSheetParams) {
                RecipeSheetParams recipeSheetParams = (RecipeSheetParams) obj;
                if (!C14360o3.A0K(this.A04, recipeSheetParams.A04) || this.A02 != recipeSheetParams.A02 || this.A08 != recipeSheetParams.A08 || this.A07 != recipeSheetParams.A07 || !C14360o3.A0K(this.A06, recipeSheetParams.A06) || !C14360o3.A0K(this.A05, recipeSheetParams.A05) || !C14360o3.A0K(this.A03, recipeSheetParams.A03) || this.A00 != recipeSheetParams.A00 || this.A01 != recipeSheetParams.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC25236BEt.A01(this.A02, AbstractC166987dD.A0J(this.A04))))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RecipeSheetParams(mediaId=");
        A1C.append(this.A04);
        A1C.append(", mediaIndex=");
        A1C.append(this.A02);
        A1C.append(", shouldMuteAudio=");
        A1C.append(this.A08);
        A1C.append(", isInspirationEnabled=");
        A1C.append(this.A07);
        A1C.append(", viewerSessionId=");
        A1C.append(this.A06);
        A1C.append(AbstractC111324zv.A00(3441));
        A1C.append(this.A05);
        A1C.append(", effectSourceAssetId=");
        A1C.append(this.A03);
        A1C.append(", clipsViewerSourceOrdinal=");
        A1C.append(this.A00);
        A1C.append(", listTypeOrdinal=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
