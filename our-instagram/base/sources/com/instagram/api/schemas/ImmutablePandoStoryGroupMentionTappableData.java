package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.AbstractC40289Htt;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryGroupMentionTappableData extends C17T implements StoryGroupMentionTappableDataIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(83);
    public List A00;

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final List BSS() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'mentionedUsers' field.");
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final StoryGroupMentionTappableDataIntf EAF(C1DY c1dy) {
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40289Htt.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final String AvN() {
        return A0b();
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final StoryGroupMentionTappableData F0e(C1DY c1dy) {
        String A0b = A0b();
        String A0g = A0g();
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
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
        return new StoryGroupMentionTappableData(AbstractC37301Gc2.A0a(this), A0b, A0g, A0X(), A0q2);
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final StoryGroupMentionTappableData F0f(C1DV c1dv) {
        return F0e(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final String getId() {
        return A0g();
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final String getText() {
        return A0X();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
