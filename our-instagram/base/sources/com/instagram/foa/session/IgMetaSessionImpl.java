package com.instagram.foa.session;

import X.AbstractC12990ll;
import X.AbstractC31175DnJ;
import X.C14360o3;
import X.LNL;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes11.dex */
public final class IgMetaSessionImpl implements FoaUserSession {
    public static final Parcelable.Creator CREATOR = new LNL(80);
    public final AbstractC12990ll A00;

    public IgMetaSessionImpl(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC12990ll abstractC12990ll = this.A00;
        Bundle bundle = new Bundle();
        AbstractC31175DnJ.A0r(bundle, abstractC12990ll);
        parcel.writeBundle(bundle);
    }

    @Override // com.meta.foa.session.FoaUserSession
    public final String getUserId() {
        UserSession userSession;
        AbstractC12990ll abstractC12990ll = this.A00;
        if (!(abstractC12990ll instanceof UserSession) || (userSession = (UserSession) abstractC12990ll) == null) {
            return null;
        }
        return userSession.userId;
    }
}
