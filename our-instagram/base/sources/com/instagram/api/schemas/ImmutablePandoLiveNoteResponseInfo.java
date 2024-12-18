package com.instagram.api.schemas;

import X.AbstractC06950Ym;
import X.AbstractC136426Fv;
import X.AbstractC38851rI;
import X.AbstractC40046HpY;
import X.C14360o3;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ImmutablePandoLiveNoteResponseInfo extends C17T implements LiveNoteResponseInfoIntf {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(12);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final List C3T() {
        return null;
    }

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final LiveNoteResponseInfo Ew0(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1946775069, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A08, 10));
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
                Parcelable.Creator creator = User.CREATOR;
                C14360o3.A0A(immutablePandoUserDict);
                arrayList2.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
            }
            arrayList = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(c1dy.A00((User) it2.next()));
            }
        } else {
            arrayList = null;
        }
        return new LiveNoteResponseInfo(arrayList, A03(953406264));
    }

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40046HpY.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final long C8b() {
        return A03(953406264);
    }
}
