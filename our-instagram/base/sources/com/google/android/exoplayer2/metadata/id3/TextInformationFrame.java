package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC16960so;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC50523MSb;
import X.AbstractC58320PtC;
import X.C14360o3;
import X.C4B8;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(68);
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (!Util.A0I(super.A00, ((Id3Frame) textInformationFrame).A00) || !Util.A0I(this.A00, textInformationFrame.A00) || !this.A01.equals(textInformationFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC50523MSb.A02(super.A00) + AbstractC31177DnL.A04(this.A00)) * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeStringArray(AbstractC31173DnH.A1b(this.A01, 0));
    }

    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        C4B8.A03(AbstractC166987dD.A1b(list));
        this.A00 = str2;
        Object[] array = list.toArray(new String[0]);
        C14360o3.A0B(array, 0);
        Object[] copyOf = Arrays.copyOf(array, array.length);
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC16960so.A1Q(Arrays.copyOf(copyOf, copyOf.length)));
        this.A01 = A1F;
        A1F.get(0);
    }

    public static ArrayList A00(String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        try {
            int length = str.length();
            if (length >= 10) {
                AbstractC58320PtC.A1P(str, A1E, 0, 4);
                AbstractC58320PtC.A1P(str, A1E, 5, 7);
                AbstractC58320PtC.A1P(str, A1E, 8, 10);
                return A1E;
            }
            if (length >= 7) {
                AbstractC58320PtC.A1P(str, A1E, 0, 4);
                AbstractC58320PtC.A1P(str, A1E, 5, 7);
                return A1E;
            }
            if (length >= 4) {
                AbstractC58320PtC.A1P(str, A1E, 0, 4);
            }
            return A1E;
        } catch (NumberFormatException unused) {
            return AbstractC166987dD.A1E();
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.A00);
        A1C.append(": description=");
        A1C.append(this.A00);
        A1C.append(": values=");
        return AbstractC166997dE.A0v(this.A01, A1C);
    }
}
