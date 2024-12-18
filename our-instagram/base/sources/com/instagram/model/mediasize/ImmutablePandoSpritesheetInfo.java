package com.instagram.model.mediasize;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC65734Tt9;
import X.C17T;
import X.C37965Gn7;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoSpritesheetInfo extends C17T implements SpritesheetInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(44);

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final List BzQ() {
        return A0p(248549918, C37965Gn7.A00);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC65734Tt9.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer B6H() {
        return getOptionalIntValueByHashCode(-1163893102);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer BQ8() {
        return getOptionalIntValueByHashCode(-666356284);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer Bmk() {
        return getOptionalIntValueByHashCode(-600590916);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer BzP() {
        return getOptionalIntValueByHashCode(-2045979679);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer BzR() {
        return getOptionalIntValueByHashCode(-883315764);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Float C80() {
        return A0K(-1104578681);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C82() {
        return getOptionalIntValueByHashCode(-147481638);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C8D() {
        return getOptionalIntValueByHashCode(2087420083);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C8F() {
        return getOptionalIntValueByHashCode(777273472);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C9x() {
        return getOptionalIntValueByHashCode(-750947634);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Float CFE() {
        return A0K(-209702102);
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final SpritesheetInfoImpl F5D() {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1163893102);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-666356284);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-600590916);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(-2045979679);
        List BzQ = BzQ();
        Integer optionalIntValueByHashCode5 = getOptionalIntValueByHashCode(-883315764);
        return new SpritesheetInfoImpl(A0K(-1104578681), A0K(-209702102), optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, optionalIntValueByHashCode5, getOptionalIntValueByHashCode(-147481638), getOptionalIntValueByHashCode(2087420083), getOptionalIntValueByHashCode(777273472), getOptionalIntValueByHashCode(-750947634), BzQ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
