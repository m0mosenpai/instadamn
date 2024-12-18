package com.instagram.reels.questionv2.model;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C39305HXw;
import X.I5T;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoQuestionMediaResponseModel extends C17T implements QuestionMediaResponseModelIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(84);

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final ImageInfo BGx() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final SpritesheetInfo C8E() {
        return (SpritesheetInfo) A05(-1703162617, ImmutablePandoSpritesheetInfo.class);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final List CFe() {
        return A08(713258463, ImmutablePandoVideoVersion.class);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I5T.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Boolean BB7() {
        return getOptionalBooleanValueByHashCode(53851633);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer BRq() {
        return getOptionalIntValueByHashCode(1939875509);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer BZo() {
        return getOptionalIntValueByHashCode(-636516523);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer Ba2() {
        return getOptionalIntValueByHashCode(1933097432);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String CFK() {
        return A0i(-1617978007);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer CSN() {
        return getOptionalIntValueByHashCode(-181834353);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final QuestionMediaResponseModel F74() {
        ImageInfoImpl imageInfoImpl;
        SpritesheetInfoImpl spritesheetInfoImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(53851633);
        String A0e = A0e();
        ImageInfo BGx = BGx();
        ArrayList arrayList = null;
        if (BGx != null) {
            imageInfoImpl = BGx.F5B();
        } else {
            imageInfoImpl = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-181834353);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(1939875509);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-636516523);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(1933097432);
        SpritesheetInfo C8E = C8E();
        if (C8E != null) {
            spritesheetInfoImpl = C8E.F5D();
        } else {
            spritesheetInfoImpl = null;
        }
        String A0i = A0i(1370685266);
        String A0i2 = A0i(-134887560);
        String A0i3 = A0i(-1617978007);
        List CFe = CFe();
        if (CFe != null) {
            arrayList = AbstractC167017dG.A0q(CFe);
            Iterator it = CFe.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1Y(arrayList, it);
            }
        }
        return new QuestionMediaResponseModel(imageInfoImpl, spritesheetInfoImpl, optionalBooleanValueByHashCode, optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, A0e, A0i, A0i2, A0i3, arrayList);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String getVideoCodec() {
        return A0i(1370685266);
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String getVideoDashManifest() {
        return A0i(-134887560);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
