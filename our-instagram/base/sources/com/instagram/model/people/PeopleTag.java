package com.instagram.model.people;

import X.AbstractC13670mt;
import X.C14360o3;
import X.C17D;
import X.C9Ay;
import X.EnumC222416a;
import android.graphics.PointF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class PeopleTag extends Tag implements C17D {
    public static final Parcelable.Creator CREATOR = new C9Ay(24);
    public UserInfo A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    /* loaded from: classes2.dex */
    public class UserInfo implements TaggableModel {
        public static final Parcelable.Creator CREATOR = new C9Ay(25);
        public SellerShoppableFeedType A00;
        public ImageUrl A01;
        public String A02;
        public String A03;
        public String A04;
        public boolean A05;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UserInfo userInfo = (UserInfo) obj;
                if (!TextUtils.equals(this.A04, userInfo.A04) || !TextUtils.equals(this.A03, userInfo.A03)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.instagram.tagging.model.TaggableModel
        public final String getId() {
            return this.A03;
        }

        public final int hashCode() {
            return (this.A03.hashCode() * 31) + this.A04.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            parcel.writeString(this.A04);
            parcel.writeString(this.A02);
            parcel.writeParcelable(this.A01, i);
            parcel.writeInt(this.A05 ? 1 : 0);
        }

        public UserInfo(User user) {
            this.A04 = user.getUsername();
            this.A03 = user.getId();
            this.A02 = user.getFullName();
            this.A01 = user.Bhu();
            this.A05 = user.A1S();
            this.A00 = user.A0A();
        }

        public UserInfo() {
        }
    }

    public PeopleTag(Parcel parcel) {
        super(parcel, UserInfo.class.getClassLoader());
        boolean z = false;
        this.A03 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            this.A02 = parcel.readBoolean();
            z = parcel.readBoolean();
        } else {
            this.A02 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
        }
        this.A03 = z;
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readList(arrayList, String.class.getClassLoader());
    }

    public final User A07() {
        UserInfo userInfo = this.A00;
        User user = new User(userInfo.A03, userInfo.A04);
        user.A0q(this.A00.A02);
        if (!AbstractC13670mt.A0B(A08())) {
            String A08 = A08();
            C14360o3.A0B(A08, 0);
            user.A03.ERH(A08);
            user.A03.Ee4(true);
        }
        user.A0i(this.A00.A01);
        user.A03.EVZ(Boolean.valueOf(this.A00.A05));
        user.A03.Edb(this.A00.A00);
        return user;
    }

    public final String A08() {
        List list = this.A01;
        if (list != null && !list.isEmpty()) {
            return (String) this.A01.get(0);
        }
        return null;
    }

    @Override // com.instagram.tagging.model.Tag
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((PeopleTag) obj).A00);
        }
        return false;
    }

    @Override // com.instagram.tagging.model.Tag
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void A09(User user) {
        if (user.A0I() == EnumC222416a.A06) {
            List singletonList = Collections.singletonList(user.A03.getCategory());
            List list = this.A01;
            if (list == null) {
                list = new ArrayList();
                this.A01 = list;
            }
            list.clear();
            this.A01.addAll(singletonList);
        }
    }

    @Override // com.instagram.tagging.model.Tag, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = this.A02;
        if (i2 >= 29) {
            parcel.writeBoolean(z);
            parcel.writeBoolean(this.A03);
        } else {
            parcel.writeInt(z ? 1 : 0);
            parcel.writeInt(this.A03 ? 1 : 0);
        }
        parcel.writeList(this.A01);
    }

    public PeopleTag(PointF pointF, User user) {
        this.A03 = false;
        super.A00 = pointF;
        this.A00 = new UserInfo(user);
    }

    public PeopleTag(User user) {
        this.A03 = false;
        this.A00 = new UserInfo(user);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.instagram.model.people.PeopleTag$UserInfo] */
    public PeopleTag() {
        this.A03 = false;
        this.A00 = new Object();
    }
}
