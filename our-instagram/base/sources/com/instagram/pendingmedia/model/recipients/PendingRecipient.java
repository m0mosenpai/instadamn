package com.instagram.pendingmedia.model.recipients;

import X.AnonymousClass172;
import X.C06090Tz;
import X.C14360o3;
import X.C150866ql;
import X.C18U;
import X.C9Ay;
import X.EnumC222416a;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes2.dex */
public final class PendingRecipient implements Parcelable, AnonymousClass172 {
    public int A00;
    public int A01;
    public int A02;
    public ImageUrl A03;
    public FollowStatus A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final String A0f;
    public static final Parcelable.Creator CREATOR = new C9Ay(52);
    public static final ImageUrl A0g = new SimpleImageUrl("");

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PendingRecipient(User user) {
        this(A0g, FollowStatus.A08, null, null, null, null, null, "", "", null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Integer num;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C14360o3.A0B(user, 1);
        this.A0B = user.getId();
        this.A0C = user.getUsername();
        this.A03 = user.Bhu();
        String fullName = user.getFullName();
        this.A0A = fullName == null ? "" : fullName;
        this.A0b = user.isVerified();
        this.A0Z = user.isRestricted();
        this.A0J = user.CQf();
        this.A0P = user.A29();
        this.A0V = user.CYY();
        this.A0W = user.CYb();
        this.A07 = user.Bkb();
        this.A0a = user.Cey();
        Boolean CfN = user.A03.CfN();
        if (CfN != null) {
            z = CfN.booleanValue();
        } else {
            z = false;
        }
        this.A05 = Boolean.valueOf(z);
        this.A0K = user.CQw();
        this.A0L = user.isConnected();
        this.A01 = user.BJ8();
        Boolean CUD = user.A03.CUD();
        if (CUD != null) {
            z2 = CUD.booleanValue();
        } else {
            z2 = false;
        }
        this.A0N = z2;
        Boolean CX0 = user.A03.CX0();
        if (CX0 != null) {
            z3 = CX0.booleanValue();
        } else {
            z3 = true;
        }
        this.A0U = z3;
        this.A04 = user.B7L();
        this.A09 = user.A03.ArO();
        this.A08 = user.BTC();
        this.A02 = user.A04();
        Boolean CVe = user.A03.CVe();
        if (CVe != null) {
            z4 = CVe.booleanValue();
        } else {
            z4 = false;
        }
        this.A0S = z4;
        Boolean CVZ = user.A03.CVZ();
        if (CVZ != null) {
            z5 = CVZ.booleanValue();
        } else {
            z5 = false;
        }
        this.A0R = z5;
        this.A0d = user.A1Z();
        this.A00 = user.A00();
        this.A0O = user.A27();
        EnumC222416a A0I = user.A0I();
        if (A0I != null) {
            num = Integer.valueOf(A0I.A00);
        } else {
            num = null;
        }
        this.A06 = num;
        this.A0Q = false;
        Boolean CQ2 = user.A03.CQ2();
        if (CQ2 != null) {
            z6 = CQ2.booleanValue();
        } else {
            z6 = false;
        }
        this.A0I = z6;
        this.A0c = user.A2O();
        Boolean C4F = user.A03.C4F();
        if (C4F != null) {
            z7 = C4F.booleanValue();
        } else {
            z7 = false;
        }
        this.A0e = z7;
        Boolean BBO = user.A03.BBO();
        if (BBO != null) {
            z8 = BBO.booleanValue();
        } else {
            z8 = false;
        }
        this.A0G = z8;
        Boolean AwE = user.A03.AwE();
        if (AwE != null) {
            z9 = AwE.booleanValue();
        } else {
            z9 = false;
        }
        this.A0E = z9;
        Boolean AwD = user.A03.AwD();
        if (AwD != null) {
            z10 = AwD.booleanValue();
        } else {
            z10 = false;
        }
        this.A0D = z10;
        this.A0H = user.BJ8() == 2;
        this.A0Y = false;
        this.A0F = user.A1i();
        this.A0X = user.A1U();
        Boolean CRy = user.A03.CRy();
        if (CRy != null) {
            z11 = CRy.booleanValue();
        } else {
            z11 = false;
        }
        this.A0M = z11;
        Boolean CVq = user.A03.CVq();
        if (CVq != null) {
            z12 = CVq.booleanValue();
        } else {
            z12 = false;
        }
        this.A0T = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            PendingRecipient pendingRecipient = (PendingRecipient) obj;
            if (!C14360o3.A0K(this.A0B, pendingRecipient.A0B) || this.A0Y != pendingRecipient.A0Y) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C17B
    public final String getShortName() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        Integer num = this.A07;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.A0a ? 1 : 0);
        Boolean bool = this.A05;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A04, i);
        Long l = this.A08;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0O ? 1 : 0);
        Integer num2 = this.A06;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
    }

    @Override // X.AnonymousClass176
    public final FollowStatus B7L() {
        return this.A04;
    }

    @Override // X.AnonymousClass172
    public final String B8y() {
        return this.A0f;
    }

    @Override // X.C17G
    public final int BJ8() {
        return this.A01;
    }

    @Override // X.C17K
    public final Long BTC() {
        return this.A08;
    }

    @Override // X.AnonymousClass173
    public final ImageUrl Bhu() {
        return this.A03;
    }

    @Override // X.AnonymousClass175
    public final Integer Bkb() {
        return this.A07;
    }

    @Override // X.AnonymousClass174
    public final boolean CPk() {
        return this.A0H;
    }

    @Override // X.C17I
    public final boolean CQf() {
        return this.A0J;
    }

    @Override // X.C17A
    public final boolean CQw() {
        return this.A0K;
    }

    @Override // X.AnonymousClass178
    public final boolean CS0(C150866ql c150866ql) {
        if (this.A0M) {
            String str = this.A0B;
            if (str == null) {
                str = "";
            }
            UserSession userSession = c150866ql.A00;
            if (str.equals(userSession.userId) || C18U.A06(C06090Tz.A05, userSession, 36323672293912033L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C17H
    public final boolean CYY() {
        return this.A0V;
    }

    @Override // X.C17J
    public final boolean CYb() {
        return this.A0W;
    }

    @Override // X.AnonymousClass177
    public final boolean Cey() {
        return this.A0a;
    }

    @Override // X.C17F
    public final String getFullName() {
        return this.A0A;
    }

    @Override // X.C17D
    public final String getId() {
        String str = this.A0B;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.C17E
    public final String getUsername() {
        return this.A0C;
    }

    public final int hashCode() {
        String str = this.A0B;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.AnonymousClass172
    public final boolean isConnected() {
        return this.A0L;
    }

    @Override // X.AnonymousClass172
    public final boolean isRestricted() {
        return this.A0Z;
    }

    @Override // X.AnonymousClass172
    public final boolean isVerified() {
        return this.A0b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PendingRecipient(ImageUrl imageUrl, String str, String str2) {
        this(A0g, FollowStatus.A08, null, null, null, null, null, "", "", null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(imageUrl, 3);
        this.A0B = str;
        this.A0C = str2;
        this.A03 = imageUrl;
    }

    public PendingRecipient(ImageUrl imageUrl, FollowStatus followStatus, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28) {
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(imageUrl, 4);
        C14360o3.A0B(followStatus, 20);
        this.A0B = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A03 = imageUrl;
        this.A0b = z;
        this.A0Z = z2;
        this.A0J = z3;
        this.A0P = z4;
        this.A0V = z5;
        this.A0W = z6;
        this.A07 = num;
        this.A0a = z7;
        this.A05 = bool;
        this.A0K = z8;
        this.A0L = z9;
        this.A01 = i;
        this.A0N = z10;
        this.A0U = z11;
        this.A09 = str4;
        this.A04 = followStatus;
        this.A08 = l;
        this.A02 = i2;
        this.A0S = z12;
        this.A0R = z13;
        this.A0d = z14;
        this.A00 = i3;
        this.A0O = z15;
        this.A06 = num2;
        this.A0Q = z16;
        this.A0I = z17;
        this.A0c = z18;
        this.A0e = z19;
        this.A0G = z20;
        this.A0D = z21;
        this.A0E = z22;
        this.A0H = z23;
        this.A0Y = z24;
        this.A0F = z25;
        this.A0X = z26;
        this.A0M = z27;
        this.A0T = z28;
        this.A0f = str3.length() == 0 ? str2 : str3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PendingRecipient(String str) {
        this(A0g, FollowStatus.A08, null, null, null, null, null, "", "", null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        C14360o3.A0B(str, 1);
        this.A0B = str;
    }

    public PendingRecipient() {
        this(A0g, FollowStatus.A08, null, null, null, null, null, "", "", null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }
}
