package com.instagram.filterkit.filter;

import X.AbstractC167007dF;
import X.C72236XZn;
import X.LNL;
import X.XOB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.math.matrix.Matrix4;

/* loaded from: classes12.dex */
public class IdentityFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new LNL(76);
    public XOB A00;
    public C72236XZn A01;
    public boolean A02;
    public boolean A03;
    public final Matrix4 A04;

    public IdentityFilter(Parcel parcel) {
        super(parcel);
        Matrix4 matrix4 = new Matrix4();
        this.A04 = matrix4;
        Parcelable readParcelable = parcel.readParcelable(Matrix4.class.getClassLoader());
        readParcelable.getClass();
        matrix4.A04((Matrix4) readParcelable);
        this.A03 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A02 = parcel.readInt() == 1;
    }

    public IdentityFilter() {
        this.A04 = new Matrix4();
    }
}
