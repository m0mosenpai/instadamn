package com.instagram.ui.text;

import X.AbstractC63123SdR;
import X.AnonymousClass001;
import X.C0w9;
import X.C14360o3;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class TextShadow implements Parcelable {
    public static final TextShadow A03;
    public static final TextShadow A04;
    public int A00;
    public int A01;
    public int A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = R.dimen.group_mention_sticker_title_text_size_step;
        obj.A02 = R.dimen.group_mention_sticker_title_text_size_step;
        A03 = obj;
        ?? obj2 = new Object();
        obj2.A00 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        obj2.A01 = R.dimen.group_mention_sticker_title_text_size_step;
        obj2.A02 = R.dimen.group_mention_sticker_title_text_size_step;
        A04 = obj2;
    }

    public final float A00(Context context) {
        C14360o3.A0B(context, 0);
        try {
            return context.getResources().getDimensionPixelSize(this.A01);
        } catch (Resources.NotFoundException e) {
            C0w9.A03("TextShadow", AnonymousClass001.A0R("not able to find resources ", e.getMessage()));
            return 0.0f;
        }
    }

    public final float A01(Context context) {
        C14360o3.A0B(context, 0);
        try {
            return (float) Math.min(context.getResources().getDimensionPixelSize(this.A02), 25.0d);
        } catch (Resources.NotFoundException e) {
            C0w9.A03("TextShadow", AnonymousClass001.A0R("not able to find resources ", e.getMessage()));
            return 0.0f;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
