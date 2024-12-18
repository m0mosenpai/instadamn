package com.instagram.model.androidlink;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37396Gdc;
import X.C17T;
import X.C39305HXw;
import X.C41177IKq;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoAndroidLink extends C17T implements AndroidLink {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(39);

    @Override // com.instagram.model.androidlink.AndroidLink
    public final /* synthetic */ C41177IKq AKl() {
        return new C41177IKq(this);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37396Gdc.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Abj() {
        return A0i(-1017761719);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String AcH() {
        return A0j(93028124);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Integer AcK() {
        return getOptionalIntValueByHashCode(-1067261809);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Ajo() {
        return A0i(910979721);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String AlR() {
        return A0i(1462791458);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String AlS() {
        return A0j(-1897704965);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Ar1() {
        return A0j(-407108748);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Aw8() {
        return A0i(-2040478554);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Ax1() {
        return A0i(-458916415);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String B9G() {
        return A0j(1390652273);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Integer B9H() {
        return getOptionalIntValueByHashCode(642507912);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BGG() {
        return A0j(2072860932);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BMm() {
        return A0j(-751256461);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Integer BNX() {
        return getOptionalIntValueByHashCode(1194206804);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Bdp() {
        return A0i(855553022);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BhG() {
        return A0j(939593177);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Bka() {
        return A0i(-1811695680);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BlN() {
        return A0i(1970337776);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Bm5() {
        return A0i(-2094679959);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String C5F() {
        return A0i(-1255393252);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String CHN() {
        return A0i(-791817864);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String CIt() {
        return A0i(-807062458);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean CPt() {
        return getOptionalBooleanValueByHashCode(-1962982378);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean CcE() {
        return getOptionalBooleanValueByHashCode(-1508132237);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean Cf2() {
        return getOptionalBooleanValueByHashCode(-1385407525);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean Cg8() {
        return getOptionalBooleanValueByHashCode(-1579042979);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final AndroidLinkImpl F53() {
        String A0i = A0i(-1017761719);
        String A0j = A0j(93028124);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1067261809);
        String A0i2 = A0i(-794136500);
        String A0i3 = A0i(910979721);
        String A0i4 = A0i(1462791458);
        String A0j2 = A0j(-1897704965);
        String A0j3 = A0j(-407108748);
        String A0i5 = A0i(-2040478554);
        String A0i6 = A0i(-458916415);
        String A0j4 = A0j(1390652273);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(642507912);
        String A0j5 = A0j(2072860932);
        return new AndroidLinkImpl(getOptionalBooleanValueByHashCode(-1962982378), getOptionalBooleanValueByHashCode(-1508132237), getOptionalBooleanValueByHashCode(-1385407525), getOptionalBooleanValueByHashCode(-1579042979), optionalIntValueByHashCode, optionalIntValueByHashCode2, getOptionalIntValueByHashCode(1194206804), A0i, A0j, A0i2, A0i3, A0i4, A0j2, A0j3, A0i5, A0i6, A0j4, A0j5, A0j(-751256461), A0i(-807062458), A0i(855553022), A0j(939593177), A0i(-1811695680), A0i(1970337776), A0i(-2094679959), A0i(-1255393252), A0i(-791817864));
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String getAppName() {
        return A0i(-794136500);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
