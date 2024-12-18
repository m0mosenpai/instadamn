package com.instagram.model.direct;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC38851rI;
import X.C0K8;
import X.C38321qM;
import X.C38801rC;
import X.C55343Oh9;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public class DirectSearchResharedContent implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(68);
    public UserSession A00;
    public C38321qM A01;
    public Set A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.direct.DirectSearchResult
    public final String AEL() {
        return StringFormatUtil.formatStrLocaleSafe("| %-30s |", MSV.A00(332));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.token);
        C38321qM c38321qM = this.A01;
        int i2 = 1;
        if (c38321qM == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (c38321qM != null) {
            C38801rC c38801rC = C38321qM.A0h;
            byte[] A0A = C38801rC.A0A(c38321qM);
            parcel.writeInt(A0A.length);
            parcel.writeByteArray(A0A);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            try {
                Parcelable.Creator creator = User.CREATOR;
                A1E.add(AbstractC38851rI.A07(A15));
            } catch (IOException e) {
                C0K8.A0F(MSV.A00(332), "Couldn't serialize user to string", e);
            }
        }
        parcel.writeList(ImmutableList.copyOf((Collection) A1E));
    }

    public DirectSearchResharedContent(UserSession userSession, C38321qM c38321qM, Set set) {
        this.A00 = userSession;
        this.A01 = c38321qM;
        this.A02 = set;
    }
}
