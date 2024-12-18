package androidx.media3.extractor.metadata.id3;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31177DnL;
import X.AbstractC50523MSb;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.Py5;
import X.WDn;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes10.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = Py5.A00(42);
    public final ImmutableList A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (!Util.A0F(super.A00, ((Id3Frame) textInformationFrame).A00) || !Util.A0F(this.A01, textInformationFrame.A01) || !this.A00.equals(textInformationFrame.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC50523MSb.A02(super.A00) + AbstractC31177DnL.A04(this.A01)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeStringArray(AbstractC58319PtB.A1b(this.A00, 0));
    }

    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        WDn.A01(AbstractC166987dD.A1b(list));
        this.A01 = str2;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        this.A00 = copyOf;
        copyOf.get(0);
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

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.A00);
        A1C.append(": description=");
        A1C.append(this.A01);
        A1C.append(": values=");
        return AbstractC166997dE.A0v(this.A00, A1C);
    }
}
