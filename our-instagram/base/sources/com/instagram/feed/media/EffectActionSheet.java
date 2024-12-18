package com.instagram.feed.media;

import X.AbstractC43623JRg;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes2.dex */
public final class EffectActionSheet extends C0T6 implements Parcelable, EffectActionSheetIntf {
    public static final Parcelable.Creator CREATOR = new C206139Av(95);
    public final List A00;
    public final List A01;

    public EffectActionSheet(List list, List list2) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(list2, 2);
        this.A00 = list;
        this.A01 = list2;
    }

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final EffectActionSheet F4Z() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EffectActionSheet) {
                EffectActionSheet effectActionSheet = (EffectActionSheet) obj;
                if (!C14360o3.A0K(this.A00, effectActionSheet.A00) || !C14360o3.A0K(this.A01, effectActionSheet.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A01);
    }

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final List BgC() {
        return this.A00;
    }

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final List BrM() {
        return this.A01;
    }

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAREffectActionSheet", AbstractC43623JRg.A00(this));
    }
}
