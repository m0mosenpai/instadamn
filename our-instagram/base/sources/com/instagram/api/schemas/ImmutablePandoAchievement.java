package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.DKQ;
import X.DKR;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes5.dex */
public final class ImmutablePandoAchievement extends C17T implements AchievementIntf {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(0);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final List Aoj() {
        return A08(1802049969, ImmutablePandoCloseToEarningAchievementMedia.class);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final EarnedOnMediaState B0H() {
        return (EarnedOnMediaState) A0N(1482500318, DKQ.A00);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementButtonInfo BEP() {
        return (AchievementButtonInfo) A05(-19570535, ImmutablePandoAchievementButtonInfo.class);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementName BW3() {
        return (AchievementName) A0M(3373707, DKR.A00);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementButtonInfo BgE() {
        return (AchievementButtonInfo) A05(-1817464817, ImmutablePandoAchievementButtonInfo.class);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementButtonInfo BrN() {
        return (AchievementButtonInfo) A05(40167517, ImmutablePandoAchievementButtonInfo.class);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String AXm() {
        return A0h(1898587517);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final long AYD() {
        return A03(-257040341);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String Abz() {
        return A0h(2031529524);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String Ate() {
        return A0i(-1805264478);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0D() {
        return A0i(-386350540);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0E() {
        return A0i(1793790719);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0F() {
        return A0i(-738662418);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0G() {
        return A0i(-1506814994);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0I() {
        return A0i(1421481598);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String BGu() {
        return A0h(-877823861);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final Integer BiK() {
        return getOptionalIntValueByHashCode(-1001078227);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final Integer C8L() {
        return getOptionalIntValueByHashCode(-1882917531);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String CCW() {
        return A0h(1086628188);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String getSecondaryText() {
        return A0i(-1170385640);
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String getTitle() {
        return A0S();
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final int getValue() {
        return getIntValueByHashCode(111972721);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
