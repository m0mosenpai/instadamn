package com.instagram.discovery.related.model;

import X.AnonymousClass001;
import X.C05F;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class RelatedItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(67);
    public int A00;
    public ImageUrl A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Integer A00() {
        Integer num = this.A02;
        if (num == null) {
            String str = this.A04;
            switch (str.hashCode()) {
                case 3599307:
                    if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
                        num = C05F.A0C;
                        break;
                    }
                    num = C05F.A0N;
                    break;
                case 697547724:
                    if (str.equals("hashtag")) {
                        num = C05F.A00;
                        break;
                    }
                    num = C05F.A0N;
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        num = C05F.A01;
                        break;
                    }
                    num = C05F.A0N;
                    break;
                default:
                    num = C05F.A0N;
                    break;
            }
            this.A02 = num;
        }
        return num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public final String A01() {
        if (A00().intValue() != 0) {
            return this.A05;
        }
        return AnonymousClass001.A0R("#", this.A05);
    }
}
