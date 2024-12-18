package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206139Av;
import X.C69669VtA;
import X.VP5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class StoryPromptTappableData extends C0T6 implements StoryPromptTappableDataIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(16);
    public final int A00;
    public final ElectionAddYoursInfoDict A01;
    public final GenAIToolInfoDict A02;
    public final StoryPromptDisablementState A03;
    public final StoryPromptFailureTooltipDict A04;
    public final StoryPromptParticipationFrictionInfoDict A05;
    public final StoryPromptType A06;
    public final StoryTemplateDict A07;
    public final User A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Boolean A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;

    public StoryPromptTappableData(ElectionAddYoursInfoDict electionAddYoursInfoDict, GenAIToolInfoDict genAIToolInfoDict, StoryPromptDisablementState storyPromptDisablementState, StoryPromptFailureTooltipDict storyPromptFailureTooltipDict, StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict, StoryPromptType storyPromptType, StoryTemplateDict storyTemplateDict, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str, String str2, String str3, String str4, String str5, String str6, List list, int i) {
        C14360o3.A0B(storyPromptDisablementState, 2);
        C14360o3.A0B(list, 4);
        C14360o3.A0B(str2, 7);
        C14360o3.A0B(str6, 28);
        this.A0L = str;
        this.A03 = storyPromptDisablementState;
        this.A01 = electionAddYoursInfoDict;
        this.A0R = list;
        this.A02 = genAIToolInfoDict;
        this.A09 = bool;
        this.A0M = str2;
        this.A0A = bool2;
        this.A0B = bool3;
        this.A0C = bool4;
        this.A0D = bool5;
        this.A0E = bool6;
        this.A0F = bool7;
        this.A0G = bool8;
        this.A0H = bool9;
        this.A0I = bool10;
        this.A0J = bool11;
        this.A0K = bool12;
        this.A0N = str3;
        this.A08 = user;
        this.A00 = i;
        this.A05 = storyPromptParticipationFrictionInfoDict;
        this.A04 = storyPromptFailureTooltipDict;
        this.A0O = str4;
        this.A06 = storyPromptType;
        this.A0P = str5;
        this.A07 = storyTemplateDict;
        this.A0Q = str6;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptTappableDataIntf EAY(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptTappableData F1L(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptTappableData F1M(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryPromptTappableData) {
                StoryPromptTappableData storyPromptTappableData = (StoryPromptTappableData) obj;
                if (!C14360o3.A0K(this.A0L, storyPromptTappableData.A0L) || this.A03 != storyPromptTappableData.A03 || !C14360o3.A0K(this.A01, storyPromptTappableData.A01) || !C14360o3.A0K(this.A0R, storyPromptTappableData.A0R) || !C14360o3.A0K(this.A02, storyPromptTappableData.A02) || !C14360o3.A0K(this.A09, storyPromptTappableData.A09) || !C14360o3.A0K(this.A0M, storyPromptTappableData.A0M) || !C14360o3.A0K(this.A0A, storyPromptTappableData.A0A) || !C14360o3.A0K(this.A0B, storyPromptTappableData.A0B) || !C14360o3.A0K(this.A0C, storyPromptTappableData.A0C) || !C14360o3.A0K(this.A0D, storyPromptTappableData.A0D) || !C14360o3.A0K(this.A0E, storyPromptTappableData.A0E) || !C14360o3.A0K(this.A0F, storyPromptTappableData.A0F) || !C14360o3.A0K(this.A0G, storyPromptTappableData.A0G) || !C14360o3.A0K(this.A0H, storyPromptTappableData.A0H) || !C14360o3.A0K(this.A0I, storyPromptTappableData.A0I) || !C14360o3.A0K(this.A0J, storyPromptTappableData.A0J) || !C14360o3.A0K(this.A0K, storyPromptTappableData.A0K) || !C14360o3.A0K(this.A0N, storyPromptTappableData.A0N) || !C14360o3.A0K(this.A08, storyPromptTappableData.A08) || this.A00 != storyPromptTappableData.A00 || !C14360o3.A0K(this.A05, storyPromptTappableData.A05) || !C14360o3.A0K(this.A04, storyPromptTappableData.A04) || !C14360o3.A0K(this.A0O, storyPromptTappableData.A0O) || this.A06 != storyPromptTappableData.A06 || !C14360o3.A0K(this.A0P, storyPromptTappableData.A0P) || !C14360o3.A0K(this.A07, storyPromptTappableData.A07) || !C14360o3.A0K(this.A0Q, storyPromptTappableData.A0Q)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0L;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.A03.hashCode()) * 31;
        ElectionAddYoursInfoDict electionAddYoursInfoDict = this.A01;
        int hashCode2 = (((hashCode + (electionAddYoursInfoDict == null ? 0 : electionAddYoursInfoDict.hashCode())) * 31) + this.A0R.hashCode()) * 31;
        GenAIToolInfoDict genAIToolInfoDict = this.A02;
        int hashCode3 = (hashCode2 + (genAIToolInfoDict == null ? 0 : genAIToolInfoDict.hashCode())) * 31;
        Boolean bool = this.A09;
        int hashCode4 = (((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.A0M.hashCode()) * 31;
        Boolean bool2 = this.A0A;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A0B;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A0C;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A0D;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0E;
        int hashCode9 = (hashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A0F;
        int hashCode10 = (hashCode9 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A0G;
        int hashCode11 = (hashCode10 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A0H;
        int hashCode12 = (hashCode11 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A0I;
        int hashCode13 = (hashCode12 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.A0J;
        int hashCode14 = (hashCode13 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.A0K;
        int hashCode15 = (hashCode14 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str2 = this.A0N;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        User user = this.A08;
        int hashCode17 = (((hashCode16 + (user == null ? 0 : user.hashCode())) * 31) + this.A00) * 31;
        StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict = this.A05;
        int hashCode18 = (hashCode17 + (storyPromptParticipationFrictionInfoDict == null ? 0 : storyPromptParticipationFrictionInfoDict.hashCode())) * 31;
        StoryPromptFailureTooltipDict storyPromptFailureTooltipDict = this.A04;
        int hashCode19 = (hashCode18 + (storyPromptFailureTooltipDict == null ? 0 : storyPromptFailureTooltipDict.hashCode())) * 31;
        String str3 = this.A0O;
        int hashCode20 = (hashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StoryPromptType storyPromptType = this.A06;
        int hashCode21 = (hashCode20 + (storyPromptType == null ? 0 : storyPromptType.hashCode())) * 31;
        String str4 = this.A0P;
        int hashCode22 = (hashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StoryTemplateDict storyTemplateDict = this.A07;
        return ((hashCode22 + (storyTemplateDict != null ? storyTemplateDict.hashCode() : 0)) * 31) + this.A0Q.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
        List list = this.A0R;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        parcel.writeParcelable(this.A02, i);
        Boolean bool = this.A09;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0M);
        Boolean bool2 = this.A0A;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A0B;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A0C;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.A0D;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.A0E;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.A0F;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.A0G;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.A0H;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.A0I;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        Boolean bool11 = this.A0J;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Boolean bool12 = this.A0K;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0N);
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0O);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0P);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0Q);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final /* bridge */ /* synthetic */ C69669VtA AKZ() {
        return new C69669VtA(this);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptDisablementState Ay6() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final /* bridge */ /* synthetic */ ElectionAddYoursInfoDictIntf B0n() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final List B48() {
        return this.A0R;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final /* bridge */ /* synthetic */ GenAIToolInfoDictIntf B9Z() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean BCK() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final User BZk() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final int BbW() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptParticipationFrictionInfoDict BbZ() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final /* bridge */ /* synthetic */ StoryPromptFailureTooltipDictIntf Bif() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String Bik() {
        return this.A0O;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptType Bio() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String C0j() {
        return this.A0P;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final /* bridge */ /* synthetic */ StoryTemplateDictIntf C2N() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CQY() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CRP() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CRs() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CV8() {
        return this.A0D;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CW3() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CZt() {
        return this.A0F;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CaL() {
        return this.A0G;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CdT() {
        return this.A0H;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean Cds() {
        return this.A0I;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean Ces() {
        return this.A0J;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean Cfw() {
        return this.A0K;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryPromptTappableData", VP5.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getBackgroundColor() {
        return this.A0L;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getId() {
        return this.A0M;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getMediaId() {
        return this.A0N;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getText() {
        return this.A0Q;
    }
}
