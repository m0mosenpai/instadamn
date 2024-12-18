package com.instagram.api.schemas;

import X.AbstractC06950Ym;
import X.AbstractC136426Fv;
import X.AbstractC38851rI;
import X.AbstractC40107Hqa;
import X.C14360o3;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ImmutablePandoNoteChatResponseInfo extends C17T implements NoteChatResponseInfo {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(25);

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final NoteChatResponseInfoImpl ExI(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return ExH(new C1DY(c1dv, 6, false));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final List ByV() {
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'socialContextUsers' field.");
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40107Hqa.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final String BAT() {
        return A0h(-689546283);
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final Integer BLo() {
        return getOptionalIntValueByHashCode(548468023);
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final int BXk() {
        return getIntValueByHashCode(-2045299360);
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final boolean CYL() {
        return getBooleanValueByHashCode(-613730481);
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final NoteChatResponseInfoImpl ExH(C1DY c1dy) {
        String A0h = A0h(-689546283);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-613730481);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(548468023);
        int intValueByHashCode = getIntValueByHashCode(-2045299360);
        List<ImmutablePandoUserDict> A0o = A0o(-1766928858, ImmutablePandoUserDict.class);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0o, 10));
        for (ImmutablePandoUserDict immutablePandoUserDict : A0o) {
            Parcelable.Creator creator = User.CREATOR;
            arrayList.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c1dy.A00((User) it.next()));
        }
        return new NoteChatResponseInfoImpl(optionalIntValueByHashCode, A0h, arrayList2, intValueByHashCode, booleanValueByHashCode);
    }
}
