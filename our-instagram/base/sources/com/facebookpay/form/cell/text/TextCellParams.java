package com.facebookpay.form.cell.text;

import X.AbstractC37304Gc5;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC65702TsY;
import X.AbstractC69844VwU;
import X.C00O;
import X.C14360o3;
import X.C67664Uuw;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes11.dex */
public class TextCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(83);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final TextFormatter A04;
    public final TextFieldHandler A05;
    public final FBPayIcon A06;
    public final ImmutableList A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(AbstractC69844VwU.A01(this.A08));
        parcel.writeList(this.A07);
        parcel.writeValue(this.A05);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeValue(this.A04);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
    }

    public TextCellParams(Parcel parcel) {
        super(parcel);
        this.A0B = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0A = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        String readString = parcel.readString();
        if (readString != null) {
            this.A08 = AbstractC69844VwU.A00(readString);
            ArrayList arrayList = new ArrayList();
            AbstractC65702TsY.A0z(parcel, TextValidatorParams.class, arrayList);
            this.A07 = ImmutableList.copyOf((Collection) arrayList);
            this.A05 = (TextFieldHandler) AbstractC58321PtD.A0n(parcel, TextFieldHandler.class);
            this.A06 = (FBPayIcon) AbstractC37304Gc5.A04(parcel, FBPayIcon.class);
            this.A0E = AbstractC58320PtC.A1T(parcel);
            this.A02 = parcel.readInt();
            this.A0F = AbstractC58320PtC.A1T(parcel);
            this.A04 = (TextFormatter) AbstractC58321PtD.A0n(parcel, TextFormatter.class);
            this.A09 = parcel.readString();
            this.A0C = AbstractC58320PtC.A1T(parcel);
            this.A0D = AbstractC58320PtC.A1T(parcel);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public TextCellParams(C67664Uuw c67664Uuw) {
        super(c67664Uuw);
        this.A0B = c67664Uuw.A0B;
        this.A03 = c67664Uuw.A03;
        this.A0A = c67664Uuw.A0A;
        this.A00 = c67664Uuw.A00;
        this.A01 = c67664Uuw.A01;
        this.A08 = c67664Uuw.A08;
        ImmutableList immutableList = c67664Uuw.A07;
        if (immutableList != null) {
            this.A07 = immutableList;
            this.A05 = c67664Uuw.A05;
            this.A06 = c67664Uuw.A06;
            this.A0E = c67664Uuw.A0E;
            this.A02 = c67664Uuw.A02;
            this.A0F = c67664Uuw.A0F;
            this.A04 = c67664Uuw.A04;
            this.A09 = c67664Uuw.A09;
            this.A0C = c67664Uuw.A0C;
            this.A0D = c67664Uuw.A0D;
            return;
        }
        C14360o3.A0F("validators");
        throw C00O.createAndThrow();
    }
}
