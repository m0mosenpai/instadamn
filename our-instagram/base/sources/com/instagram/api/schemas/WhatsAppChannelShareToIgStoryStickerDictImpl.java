package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class WhatsAppChannelShareToIgStoryStickerDictImpl extends C0T6 implements Parcelable, WhatsAppChannelShareToIgStoryStickerDict {
    public static final Parcelable.Creator CREATOR = new C41857IgB(84);
    public final String A00;

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDict
    public final WhatsAppChannelShareToIgStoryStickerDictImpl F3w() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof WhatsAppChannelShareToIgStoryStickerDictImpl) && C14360o3.A0K(this.A00, ((WhatsAppChannelShareToIgStoryStickerDictImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDict
    public final String AdO() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = this.A00;
        if (str != null) {
            A1I.put("attribution_url", str);
        }
        return new TreeUpdaterJNI("XDTWhatsAppChannelShareToIgStoryStickerDict", AbstractC06930Yk.A0B(A1I));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public WhatsAppChannelShareToIgStoryStickerDictImpl(String str) {
        this.A00 = str;
    }
}
