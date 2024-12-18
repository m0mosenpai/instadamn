package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40119Hqm;
import X.C17T;
import X.C39307HXy;
import X.IKM;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoOnFeedMessages extends C17T implements OnFeedMessagesIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(29);

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final /* synthetic */ IKM AKR() {
        return new IKM(this);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final List BEf() {
        return A08(1513094509, ImmutablePandoIceBreakerMessage.class);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final GreetingAttachmentIntf BGY() {
        return (GreetingAttachmentIntf) A05(1049635038, ImmutablePandoGreetingAttachment.class);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40119Hqm.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final Integer Ax8() {
        return getOptionalIntValueByHashCode(-1762553752);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String B9e() {
        return A0i(312565784);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BAJ() {
        return A0i(-867601146);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BDG() {
        return A0i(1977519450);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BEd() {
        return A0i(1592690889);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BEe() {
        return A0i(1311887831);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final Boolean BvT() {
        return getOptionalBooleanValueByHashCode(-988043426);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final OnFeedMessages ExU() {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1762553752);
        String A0i = A0i(312565784);
        String A0i2 = A0i(-867601146);
        String A0i3 = A0i(1977519450);
        String A0i4 = A0i(1592690889);
        String A0i5 = A0i(1311887831);
        List BEf = BEf();
        GreetingAttachment greetingAttachment = null;
        if (BEf != null) {
            arrayList = AbstractC167017dG.A0q(BEf);
            Iterator it = BEf.iterator();
            while (it.hasNext()) {
                arrayList.add(((IceBreakerMessageIntf) it.next()).Evc());
            }
        } else {
            arrayList = null;
        }
        GreetingAttachmentIntf BGY = BGY();
        if (BGY != null) {
            greetingAttachment = BGY.Etv();
        }
        return new OnFeedMessages(greetingAttachment, getOptionalBooleanValueByHashCode(-988043426), optionalIntValueByHashCode, A0i, A0i2, A0i3, A0i4, A0i5, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
