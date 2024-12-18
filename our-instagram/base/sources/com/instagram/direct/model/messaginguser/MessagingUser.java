package com.instagram.direct.model.messaginguser;

import X.AnonymousClass565;
import X.C206139Av;
import X.C2I7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.user.model.User;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class MessagingUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(82);
    public final int A00;
    public final IGAIAgentType A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MessagingUser messagingUser = (MessagingUser) obj;
            if (this.A00 != messagingUser.A00 || !C2I7.A00(this.A03, messagingUser.A03) || !C2I7.A00(this.A02, messagingUser.A02) || !C2I7.A00(Boolean.valueOf(this.A04), Boolean.valueOf(messagingUser.A04)) || !C2I7.A00(this.A01, messagingUser.A01)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A01(long j) {
        Long l = this.A02;
        if (l != null && l.equals(Long.valueOf(j))) {
            return true;
        }
        return false;
    }

    public final boolean A02(MessagingUser messagingUser) {
        Object obj;
        Object obj2;
        int i = this.A00;
        int i2 = messagingUser.A00;
        if (i != i2) {
            return false;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            Object obj3 = this.A02;
            obj2 = messagingUser.A02;
            obj = obj3;
        } else {
            String str = this.A03;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String str2 = messagingUser.A03;
            boolean isEmpty = TextUtils.isEmpty(str2);
            obj2 = str2;
            obj = str;
            if (isEmpty) {
                return false;
            }
        }
        return C2I7.A00(obj, obj2);
    }

    public final boolean A03(String str) {
        if (this.A03.equals(str)) {
            return true;
        }
        try {
            return A01(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, Integer.valueOf(this.A00), Boolean.valueOf(this.A04), this.A01});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        Long l = this.A02;
        if (l == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        IGAIAgentType iGAIAgentType = this.A01;
        if (iGAIAgentType == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(iGAIAgentType.A00);
        }
    }

    public MessagingUser(Parcel parcel) {
        this.A03 = parcel.readString();
        if (parcel.readByte() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Long.valueOf(parcel.readLong());
        }
        this.A00 = parcel.readInt();
        this.A04 = parcel.readByte() == 1;
        this.A01 = parcel.readByte() != 0 ? AnonymousClass565.A00(parcel.readString()) : null;
    }

    public static MessagingUser A00(User user) {
        String id = user.getId();
        return new MessagingUser(user.A03.Aah(), user.BTC(), id, user.BJ8(), user.A1q());
    }

    public MessagingUser(IGAIAgentType iGAIAgentType, Long l, String str, int i, boolean z) {
        this.A03 = str;
        this.A02 = l;
        this.A00 = i;
        this.A04 = z;
        this.A01 = iGAIAgentType;
    }
}
