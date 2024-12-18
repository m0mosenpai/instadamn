package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39307HXy;
import X.C43281JBa;
import X.C43282JBb;
import X.C69669VtA;
import X.VP5;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryPromptTappableData extends C17T implements StoryPromptTappableDataIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(90);
    public User A00;
    public List A01;

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final /* synthetic */ C69669VtA AKZ() {
        return new C69669VtA(this);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptDisablementState Ay6() {
        return (StoryPromptDisablementState) A0M(186507096, C43281JBa.A00);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final ElectionAddYoursInfoDictIntf B0n() {
        return (ElectionAddYoursInfoDictIntf) A05(917294641, ImmutablePandoElectionAddYoursInfoDict.class);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final List B48() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'facepileTopParticipants' field.");
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final GenAIToolInfoDictIntf B9Z() {
        return (GenAIToolInfoDictIntf) A05(1337664557, ImmutablePandoGenAIToolInfoDict.class);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final User BZk() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptParticipationFrictionInfoDict BbZ() {
        return (StoryPromptParticipationFrictionInfoDict) A05(-1767801771, ImmutablePandoStoryPromptParticipationFrictionInfoDict.class);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptFailureTooltipDictIntf Bif() {
        return (StoryPromptFailureTooltipDictIntf) A05(-885136013, ImmutablePandoStoryPromptFailureTooltipDict.class);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptType Bio() {
        return (StoryPromptType) A0N(1634479413, C43282JBb.A00);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryTemplateDictIntf C2N() {
        return (StoryTemplateDictIntf) A05(1530218628, ImmutablePandoStoryTemplateDict.class);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptTappableDataIntf EAY(C1DY c1dy) {
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it);
        }
        this.A01 = A0q;
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -821815367);
        return this;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptTappableData F1L(C1DY c1dy) {
        ElectionAddYoursInfoDict electionAddYoursInfoDict;
        GenAIToolInfoDict genAIToolInfoDict;
        User user;
        StoryPromptParticipationFrictionInfoDictImpl storyPromptParticipationFrictionInfoDictImpl;
        StoryPromptFailureTooltipDict storyPromptFailureTooltipDict;
        User A0N;
        String A0n = AbstractC37301Gc2.A0n(this);
        StoryPromptDisablementState Ay6 = Ay6();
        ElectionAddYoursInfoDictIntf B0n = B0n();
        StoryTemplateDict storyTemplateDict = null;
        if (B0n != null) {
            electionAddYoursInfoDict = B0n.EtB();
        } else {
            electionAddYoursInfoDict = null;
        }
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it);
        }
        ArrayList A0q2 = AbstractC167017dG.A0q(A0q);
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            AbstractC37303Gc4.A18(c1dy, A0q2, it2);
        }
        GenAIToolInfoDictIntf B9Z = B9Z();
        if (B9Z != null) {
            genAIToolInfoDict = B9Z.Etq();
        } else {
            genAIToolInfoDict = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(849767883);
        String A0g = A0g();
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1025303767);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-1475936846);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(405415469);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(1597787285);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(493270317);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(1356750754);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(-1911580874);
        Boolean optionalBooleanValueByHashCode9 = getOptionalBooleanValueByHashCode(1233798655);
        Boolean optionalBooleanValueByHashCode10 = getOptionalBooleanValueByHashCode(-1114680033);
        Boolean optionalBooleanValueByHashCode11 = getOptionalBooleanValueByHashCode(-1996772183);
        Boolean optionalBooleanValueByHashCode12 = getOptionalBooleanValueByHashCode(464576065);
        String A0f = A0f();
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -821815367);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        int intValueByHashCode = getIntValueByHashCode(1324364035);
        StoryPromptParticipationFrictionInfoDict BbZ = BbZ();
        if (BbZ != null) {
            storyPromptParticipationFrictionInfoDictImpl = BbZ.F1K();
        } else {
            storyPromptParticipationFrictionInfoDictImpl = null;
        }
        StoryPromptFailureTooltipDictIntf Bif = Bif();
        if (Bif != null) {
            storyPromptFailureTooltipDict = Bif.F1J();
        } else {
            storyPromptFailureTooltipDict = null;
        }
        String A0i = A0i(-871809258);
        StoryPromptType Bio = Bio();
        String A0i2 = A0i(-1061345759);
        StoryTemplateDictIntf C2N = C2N();
        if (C2N != null) {
            storyTemplateDict = C2N.F22();
        }
        return new StoryPromptTappableData(electionAddYoursInfoDict, genAIToolInfoDict, Ay6, storyPromptFailureTooltipDict, storyPromptParticipationFrictionInfoDictImpl, Bio, storyTemplateDict, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalBooleanValueByHashCode9, optionalBooleanValueByHashCode10, optionalBooleanValueByHashCode11, optionalBooleanValueByHashCode12, A0n, A0g, A0f, A0i, A0i2, A0P(), A0q2, intValueByHashCode);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, VP5.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean BCK() {
        return getOptionalBooleanValueByHashCode(849767883);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final int BbW() {
        return getIntValueByHashCode(1324364035);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String Bik() {
        return A0i(-871809258);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String C0j() {
        return A0i(-1061345759);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CQY() {
        return getOptionalBooleanValueByHashCode(-1025303767);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CRP() {
        return getOptionalBooleanValueByHashCode(-1475936846);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CRs() {
        return getOptionalBooleanValueByHashCode(405415469);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CV8() {
        return getOptionalBooleanValueByHashCode(1597787285);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CW3() {
        return getOptionalBooleanValueByHashCode(493270317);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CZt() {
        return getOptionalBooleanValueByHashCode(1356750754);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CaL() {
        return getOptionalBooleanValueByHashCode(-1911580874);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean CdT() {
        return getOptionalBooleanValueByHashCode(1233798655);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean Cds() {
        return getOptionalBooleanValueByHashCode(-1114680033);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean Ces() {
        return getOptionalBooleanValueByHashCode(-1996772183);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final Boolean Cfw() {
        return getOptionalBooleanValueByHashCode(464576065);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final StoryPromptTappableData F1M(C1DV c1dv) {
        return F1L(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getBackgroundColor() {
        return AbstractC37301Gc2.A0n(this);
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getId() {
        return A0g();
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getMediaId() {
        return A0f();
    }

    @Override // com.instagram.api.schemas.StoryPromptTappableDataIntf
    public final String getText() {
        return A0P();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
