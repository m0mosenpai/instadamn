package com.instagram.contentnotes.domain.uistate;

import X.AbstractC111324zv;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C51756Mtf;
import X.C9IS;
import X.InterfaceC86523tQ;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SocialContextBubbleUiState extends C0T6 implements Parcelable, InterfaceC86523tQ {
    public static final Parcelable.Creator CREATOR = new C206139Av(63);
    public final int A00;
    public final C51756Mtf A01;
    public final SocialContextType A02;
    public final ImageUrl A03;
    public final User A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;
    public final List A0G;

    public SocialContextBubbleUiState(C51756Mtf c51756Mtf, SocialContextType socialContextType, ImageUrl imageUrl, User user, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(imageUrl, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(user, 4);
        C14360o3.A0B(str3, 6);
        C14360o3.A0B(socialContextType, 10);
        C14360o3.A0B(num, 13);
        C14360o3.A0B(list2, 16);
        C14360o3.A0B(c51756Mtf, 17);
        this.A06 = str;
        this.A03 = imageUrl;
        this.A09 = str2;
        this.A04 = user;
        this.A00 = i;
        this.A0F = str3;
        this.A0G = list;
        this.A0B = z;
        this.A0C = z2;
        this.A02 = socialContextType;
        this.A07 = str4;
        this.A08 = str5;
        this.A05 = num;
        this.A0E = z3;
        this.A0D = z4;
        this.A0A = list2;
        this.A01 = c51756Mtf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SocialContextBubbleUiState) {
                SocialContextBubbleUiState socialContextBubbleUiState = (SocialContextBubbleUiState) obj;
                if (!C14360o3.A0K(this.A06, socialContextBubbleUiState.A06) || !C14360o3.A0K(this.A03, socialContextBubbleUiState.A03) || !C14360o3.A0K(this.A09, socialContextBubbleUiState.A09) || !C14360o3.A0K(this.A04, socialContextBubbleUiState.A04) || this.A00 != socialContextBubbleUiState.A00 || !C14360o3.A0K(this.A0F, socialContextBubbleUiState.A0F) || !C14360o3.A0K(this.A0G, socialContextBubbleUiState.A0G) || this.A0B != socialContextBubbleUiState.A0B || this.A0C != socialContextBubbleUiState.A0C || this.A02 != socialContextBubbleUiState.A02 || !C14360o3.A0K(this.A07, socialContextBubbleUiState.A07) || !C14360o3.A0K(this.A08, socialContextBubbleUiState.A08) || this.A05 != socialContextBubbleUiState.A05 || this.A0E != socialContextBubbleUiState.A0E || this.A0D != socialContextBubbleUiState.A0D || !C14360o3.A0K(this.A0A, socialContextBubbleUiState.A0A) || !C14360o3.A0K(this.A01, socialContextBubbleUiState.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0F);
        List list = this.A0G;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(C9IS.A00(this.A05));
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        List list2 = this.A0A;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeValue(it2.next());
        }
        parcel.writeValue(this.A01);
    }

    @Override // X.InterfaceC86523tQ
    public final ImageUrl AeB() {
        return this.A03;
    }

    @Override // X.InterfaceC86523tQ
    public final List BaQ() {
        return this.A0G;
    }

    @Override // X.InterfaceC86523tQ
    public final int getIndex() {
        return this.A00;
    }

    @Override // X.InterfaceC86523tQ
    public final String getUserId() {
        return this.A09;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((this.A06.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A0F.hashCode()) * 31) + this.A0G.hashCode()) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A0C) {
            i3 = 1231;
        }
        int hashCode3 = (((i2 + i3) * 31) + this.A02.hashCode()) * 31;
        String str = this.A07;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode3 + hashCode) * 31;
        String str2 = this.A08;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        int i6 = (i5 + i4) * 31;
        Integer num = this.A05;
        int hashCode4 = (i6 + C9IS.A00(num).hashCode() + num.intValue()) * 31;
        int i7 = 1237;
        if (this.A0E) {
            i7 = 1231;
        }
        int i8 = (hashCode4 + i7) * 31;
        int i9 = 1237;
        if (this.A0D) {
            i9 = 1231;
        }
        return ((((i8 + i9) * 31) + this.A0A.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("SocialContextBubbleUiState(mediaId=");
        sb.append(this.A06);
        sb.append(AbstractC111324zv.A00(1399));
        sb.append(this.A03);
        sb.append(MSV.A00(137));
        sb.append(this.A09);
        sb.append(", user=");
        sb.append(this.A04);
        sb.append(", index=");
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(1395));
        sb.append(this.A0F);
        sb.append(AbstractC111324zv.A00(1440));
        sb.append(this.A0G);
        sb.append(", disableDragging=");
        sb.append(this.A0B);
        sb.append(", disableTapping=");
        sb.append(this.A0C);
        sb.append(", socialContextType=");
        sb.append(this.A02);
        sb.append(", socialContextActionData=");
        sb.append(this.A07);
        sb.append(", socialContextActionId=");
        sb.append(this.A08);
        sb.append(", placement=");
        Integer num = this.A05;
        if (num != null) {
            str = C9IS.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", isTranslated=");
        sb.append(this.A0E);
        sb.append(", isCommentLiked=");
        sb.append(this.A0D);
        sb.append(", carouselChildCommentMention=");
        sb.append(this.A0A);
        sb.append(", socialContextActions=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
