package com.instagram.tagging.api.model;

import X.AbstractC38048Gob;
import X.C55344OhA;
import X.EnumC53230NgS;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import java.util.List;

/* loaded from: classes2.dex */
public final class MediaSuggestedProductTag extends Tag {
    public static final Parcelable.Creator CREATOR = new C55344OhA(2);
    public PointF A00;
    public EnumC53230NgS A01;
    public List A02;

    public final Product A07() {
        List list = this.A02;
        if (list != null && !list.isEmpty()) {
            return AbstractC38048Gob.A01(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A01);
        }
        return null;
    }

    public final Float A08() {
        List list = this.A02;
        if (list != null && !list.isEmpty()) {
            return Float.valueOf(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A00);
        }
        return null;
    }

    @Override // com.instagram.tagging.model.Tag, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01.A00);
    }
}
