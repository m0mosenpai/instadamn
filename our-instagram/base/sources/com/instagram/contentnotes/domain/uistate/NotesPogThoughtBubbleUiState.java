package com.instagram.contentnotes.domain.uistate;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC25236BEt;
import X.AbstractC43591JPw;
import X.BS3;
import X.BS4;
import X.C0T6;
import X.C14360o3;
import X.InterfaceC86523tQ;
import X.JX7;
import X.LNM;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class NotesPogThoughtBubbleUiState extends C0T6 implements Parcelable, InterfaceC86523tQ {
    public static final Parcelable.Creator CREATOR = new LNM(33);
    public final int A00;
    public final int A01;
    public final NoteCustomTheme A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final NoteTextContent A05;
    public final User A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotesPogThoughtBubbleUiState) {
                NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = (NotesPogThoughtBubbleUiState) obj;
                if (!C14360o3.A0K(this.A0F, notesPogThoughtBubbleUiState.A0F) || !C14360o3.A0K(this.A05, notesPogThoughtBubbleUiState.A05) || !C14360o3.A0K(this.A03, notesPogThoughtBubbleUiState.A03) || this.A0N != notesPogThoughtBubbleUiState.A0N || !C14360o3.A0K(this.A0J, notesPogThoughtBubbleUiState.A0J) || !C14360o3.A0K(this.A0H, notesPogThoughtBubbleUiState.A0H) || !C14360o3.A0K(this.A07, notesPogThoughtBubbleUiState.A07) || !C14360o3.A0K(this.A06, notesPogThoughtBubbleUiState.A06) || this.A0P != notesPogThoughtBubbleUiState.A0P || !C14360o3.A0K(this.A0B, notesPogThoughtBubbleUiState.A0B) || this.A00 != notesPogThoughtBubbleUiState.A00 || !C14360o3.A0K(this.A0C, notesPogThoughtBubbleUiState.A0C) || this.A0A != notesPogThoughtBubbleUiState.A0A || !C14360o3.A0K(this.A0D, notesPogThoughtBubbleUiState.A0D) || !C14360o3.A0K(this.A0I, notesPogThoughtBubbleUiState.A0I) || !C14360o3.A0K(this.A0L, notesPogThoughtBubbleUiState.A0L) || !C14360o3.A0K(this.A0K, notesPogThoughtBubbleUiState.A0K) || this.A0M != notesPogThoughtBubbleUiState.A0M || this.A0S != notesPogThoughtBubbleUiState.A0S || this.A08 != notesPogThoughtBubbleUiState.A08 || this.A0Q != notesPogThoughtBubbleUiState.A0Q || !C14360o3.A0K(this.A0E, notesPogThoughtBubbleUiState.A0E) || !C14360o3.A0K(this.A04, notesPogThoughtBubbleUiState.A04) || this.A01 != notesPogThoughtBubbleUiState.A01 || this.A0R != notesPogThoughtBubbleUiState.A0R || this.A09 != notesPogThoughtBubbleUiState.A09 || this.A0T != notesPogThoughtBubbleUiState.A0T || this.A0Z != notesPogThoughtBubbleUiState.A0Z || this.A0X != notesPogThoughtBubbleUiState.A0X || this.A0U != notesPogThoughtBubbleUiState.A0U || this.A0V != notesPogThoughtBubbleUiState.A0V || this.A0O != notesPogThoughtBubbleUiState.A0O || this.A0Y != notesPogThoughtBubbleUiState.A0Y || this.A0W != notesPogThoughtBubbleUiState.A0W || !C14360o3.A0K(this.A02, notesPogThoughtBubbleUiState.A02) || !C14360o3.A0K(this.A0G, notesPogThoughtBubbleUiState.A0G)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0H);
        AbstractC167027dH.A0o(parcel, this.A07, 0, 1);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0P ? 1 : 0);
        Long l = this.A0B;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeString(BS3.A00(this.A0A));
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0I);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0L);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        Iterator A0u2 = AbstractC25231BEo.A0u(parcel, this.A0K);
        while (A0u2.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u2, i);
        }
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeString(JX7.A00(this.A08));
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeString(BS4.A00(this.A09));
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0G);
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A0C, (((AbstractC167007dF.A0D(this.A0P, AbstractC166997dE.A0J(this.A06, (AbstractC166997dE.A0K(this.A0H, AbstractC166997dE.A0K(this.A0J, AbstractC167007dF.A0D(this.A0N, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0J(this.A0F)))))) + AbstractC167017dG.A0M(this.A07)) * 31)) + AbstractC167017dG.A0M(this.A0B)) * 31) + this.A00) * 31);
        Integer num = this.A0A;
        int A0D = AbstractC167007dF.A0D(this.A0S, AbstractC167007dF.A0D(this.A0M, AbstractC166997dE.A0J(this.A0K, AbstractC166997dE.A0J(this.A0L, (((AbstractC167017dG.A0L(num, BS3.A00(num), A0K) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31))));
        Integer num2 = this.A08;
        int A0D2 = AbstractC167007dF.A0D(this.A0R, (((((AbstractC167007dF.A0D(this.A0Q, AbstractC167017dG.A0L(num2, JX7.A00(num2), A0D)) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A01) * 31);
        Integer num3 = this.A09;
        return ((AbstractC167007dF.A0D(this.A0W, AbstractC167007dF.A0D(this.A0Y, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0V, AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A0X, AbstractC167007dF.A0D(this.A0Z, AbstractC167007dF.A0D(this.A0T, AbstractC167017dG.A0L(num3, BS4.A00(num3), A0D2))))))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A0G);
    }

    @Override // X.InterfaceC86523tQ
    public final ImageUrl AeB() {
        return this.A03;
    }

    @Override // X.InterfaceC86523tQ
    public final List BaQ() {
        return this.A0L;
    }

    @Override // X.InterfaceC86523tQ
    public final int getIndex() {
        return this.A00;
    }

    @Override // X.InterfaceC86523tQ
    public final String getUserId() {
        return this.A0J;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NotesPogThoughtBubbleUiState(mediaId=");
        A1C.append(this.A0F);
        A1C.append(", textContent=");
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(1399));
        A1C.append(this.A03);
        A1C.append(", canReply=");
        A1C.append(this.A0N);
        A1C.append(", userId=");
        A1C.append(this.A0J);
        A1C.append(", noteId=");
        A1C.append(this.A0H);
        A1C.append(MSV.A00(285));
        A1C.append(this.A07);
        A1C.append(AbstractC43591JPw.A00(234));
        A1C.append(this.A06);
        A1C.append(", hasTranslation=");
        A1C.append(this.A0P);
        A1C.append(MSV.A00(621));
        A1C.append(this.A0B);
        A1C.append(", index=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(1395));
        A1C.append(this.A0C);
        A1C.append(", renderLocation=");
        Integer num = this.A0A;
        if (num != null) {
            str = BS3.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(AbstractC111324zv.A00(280));
        A1C.append(this.A0D);
        A1C.append(AbstractC111324zv.A00(576));
        A1C.append(this.A0I);
        A1C.append(AbstractC111324zv.A00(1440));
        A1C.append(this.A0L);
        A1C.append(", likersList=");
        A1C.append(this.A0K);
        A1C.append(", canLikeNote=");
        A1C.append(this.A0M);
        A1C.append(", likeAffordanceEnabled=");
        A1C.append(this.A0S);
        A1C.append(", mimicryNoteType=");
        Integer num2 = this.A08;
        if (num2 != null) {
            str2 = JX7.A00(num2);
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", isReelsViewer=");
        A1C.append(this.A0Q);
        A1C.append(", mediaCode=");
        A1C.append(this.A0E);
        A1C.append(AbstractC111324zv.A00(1442));
        A1C.append(this.A04);
        A1C.append(", mediaPosition=");
        A1C.append(this.A01);
        A1C.append(", isVideoMedia=");
        A1C.append(this.A0R);
        A1C.append(", nuxType=");
        Integer num3 = this.A09;
        if (num3 != null) {
            str3 = BS4.A00(num3);
        } else {
            str3 = "null";
        }
        A1C.append(str3);
        A1C.append(", useEnlargedStyling=");
        A1C.append(this.A0T);
        A1C.append(", useSmallerProfilePics=");
        A1C.append(this.A0Z);
        A1C.append(", useIconicSmoothedStyling=");
        A1C.append(this.A0X);
        A1C.append(", useIconicAnimation=");
        A1C.append(this.A0U);
        A1C.append(", useIconicNeumorphism=");
        A1C.append(this.A0V);
        A1C.append(", hasIconicShadow=");
        A1C.append(this.A0O);
        A1C.append(", useIconicSwRendering=");
        A1C.append(this.A0Y);
        A1C.append(", useIconicPseudoShadow=");
        A1C.append(this.A0W);
        A1C.append(", customTheme=");
        A1C.append(this.A02);
        A1C.append(", mimicryOriginalAuthorId=");
        return AbstractC25236BEt.A0Y(this.A0G, A1C);
    }

    public NotesPogThoughtBubbleUiState(NoteCustomTheme noteCustomTheme, ImageUrl imageUrl, ImageUrl imageUrl2, NoteTextContent noteTextContent, User user, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC167027dH.A13(str, noteTextContent, imageUrl);
        AbstractC167017dG.A1T(str2, str3);
        AbstractC25229BEm.A1L(user, 8, str4);
        AbstractC25233BEq.A0z(13, num2, list, list2);
        C14360o3.A0B(num3, 20);
        C14360o3.A0B(num4, 26);
        this.A0F = str;
        this.A05 = noteTextContent;
        this.A03 = imageUrl;
        this.A0N = z;
        this.A0J = str2;
        this.A0H = str3;
        this.A07 = num;
        this.A06 = user;
        this.A0P = z2;
        this.A0B = l;
        this.A00 = i;
        this.A0C = str4;
        this.A0A = num2;
        this.A0D = str5;
        this.A0I = str6;
        this.A0L = list;
        this.A0K = list2;
        this.A0M = z3;
        this.A0S = z4;
        this.A08 = num3;
        this.A0Q = z5;
        this.A0E = str7;
        this.A04 = imageUrl2;
        this.A01 = i2;
        this.A0R = z6;
        this.A09 = num4;
        this.A0T = z7;
        this.A0Z = z8;
        this.A0X = z9;
        this.A0U = z10;
        this.A0V = z11;
        this.A0O = z12;
        this.A0Y = z13;
        this.A0W = z14;
        this.A02 = noteCustomTheme;
        this.A0G = str8;
    }
}
