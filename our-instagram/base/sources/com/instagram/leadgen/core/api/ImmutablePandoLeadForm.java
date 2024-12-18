package com.instagram.leadgen.core.api;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoLeadForm extends C17T implements LeadFormIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(37);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.leadgen.core.api.LeadFormIntf
    public final String B7u() {
        return A0h(-677446026);
    }

    @Override // com.instagram.leadgen.core.api.LeadFormIntf
    public final LeadForm F51() {
        ImageUrl A0A = A0A(1796349783);
        String A0h = A0h(1615086568);
        String A0h2 = A0h(-677446026);
        List A0o = A0o(-1341545633, ImmutablePandoLeadGenInfoFieldData.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            A0q.add(((LeadGenInfoFieldDataIntf) it.next()).F52());
        }
        return new LeadForm(A0A, getOptionalBooleanValueByHashCode(1940535780), A0h, A0h2, A0i(1365360682), A0q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
