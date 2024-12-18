package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import X.CDP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class NoteCustomThemeImpl extends C0T6 implements NoteCustomTheme, Parcelable {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(16);
    public final NoteActivationType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final NoteCustomThemeImpl ExJ() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteCustomThemeImpl) {
                NoteCustomThemeImpl noteCustomThemeImpl = (NoteCustomThemeImpl) obj;
                if (this.A00 != noteCustomThemeImpl.A00 || !C14360o3.A0K(this.A01, noteCustomThemeImpl.A01) || !C14360o3.A0K(this.A02, noteCustomThemeImpl.A02) || !C14360o3.A0K(this.A03, noteCustomThemeImpl.A03) || !C14360o3.A0K(this.A04, noteCustomThemeImpl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        NoteActivationType noteActivationType = this.A00;
        int hashCode = (noteActivationType == null ? 0 : noteActivationType.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final NoteActivationType AYn() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String Aev() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String AvG() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String C31() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String C6B() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNoteCustomTheme", CDP.A00(this));
    }

    public NoteCustomThemeImpl(NoteActivationType noteActivationType, String str, String str2, String str3, String str4) {
        this.A00 = noteActivationType;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
