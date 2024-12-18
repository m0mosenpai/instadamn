package X;

import android.graphics.RectF;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;

/* renamed from: X.MsD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51682MsD extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final IGTVBrandedContentTags A0F;
    public final IGTVShoppingMetadata A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
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
    public final boolean A0a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51682MsD) {
                C51682MsD c51682MsD = (C51682MsD) obj;
                if (this.A06 != c51682MsD.A06 || this.A0Y != c51682MsD.A0Y || !C14360o3.A0K(this.A0M, c51682MsD.A0M) || this.A08 != c51682MsD.A08 || this.A09 != c51682MsD.A09 || this.A07 != c51682MsD.A07 || this.A0B != c51682MsD.A0B || !C14360o3.A0K(this.A0L, c51682MsD.A0L) || !C14360o3.A0K(this.A0I, c51682MsD.A0I) || !C14360o3.A0K(this.A0K, c51682MsD.A0K) || this.A0X != c51682MsD.A0X || this.A04 != c51682MsD.A04 || this.A05 != c51682MsD.A05 || Float.compare(this.A00, c51682MsD.A00) != 0 || this.A0T != c51682MsD.A0T || this.A0P != c51682MsD.A0P || !C14360o3.A0K(this.A0H, c51682MsD.A0H) || this.A03 != c51682MsD.A03 || this.A02 != c51682MsD.A02 || this.A01 != c51682MsD.A01 || this.A0Q != c51682MsD.A0Q || this.A0W != c51682MsD.A0W || !C14360o3.A0K(this.A0D, c51682MsD.A0D) || !C14360o3.A0K(this.A0E, c51682MsD.A0E) || this.A0S != c51682MsD.A0S || !C14360o3.A0K(this.A0J, c51682MsD.A0J) || this.A0a != c51682MsD.A0a || this.A0N != c51682MsD.A0N || this.A0O != c51682MsD.A0O || this.A0R != c51682MsD.A0R || this.A0U != c51682MsD.A0U || this.A0V != c51682MsD.A0V || !C14360o3.A0K(this.A0F, c51682MsD.A0F) || this.A0Z != c51682MsD.A0Z || !C14360o3.A0K(this.A0G, c51682MsD.A0G) || this.A0A != c51682MsD.A0A || this.A0C != c51682MsD.A0C) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A0A, (AbstractC167007dF.A0D(this.A0Z, (AbstractC167007dF.A0D(this.A0V, AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0a, (AbstractC167007dF.A0D(this.A0S, (((AbstractC167007dF.A0D(this.A0W, AbstractC167007dF.A0D(this.A0Q, (((((((AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0T, AbstractC166997dE.A00((((AbstractC167007dF.A0D(this.A0X, (AbstractC166997dE.A0K(this.A0I, AbstractC166997dE.A0K(this.A0L, AbstractC167007dF.A07(this.A0B, (((((AbstractC166997dE.A0K(this.A0M, AbstractC167007dF.A0D(this.A0Y, this.A06 * 31)) + this.A08) * 31) + this.A09) * 31) + this.A07) * 31))) + AbstractC167017dG.A0O(this.A0K)) * 31) + this.A04) * 31) + this.A05) * 31, this.A00))) + AbstractC167017dG.A0O(this.A0H)) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31)) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31)))))) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC166997dE.A0I(this.A0G)) * 31);
        long j = this.A0C;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IGTVDraftEntity(id=");
        A1C.append(this.A06);
        A1C.append(", isUploading=");
        A1C.append(this.A0Y);
        A1C.append(", videoPath=");
        A1C.append(this.A0M);
        A1C.append(", origRotation=");
        A1C.append(this.A08);
        A1C.append(", origWidth=");
        A1C.append(this.A09);
        A1C.append(", origHeight=");
        A1C.append(this.A07);
        A1C.append(", duration=");
        A1C.append(this.A0B);
        A1C.append(", title=");
        A1C.append(this.A0L);
        A1C.append(AbstractC58317Pt9.A00(58));
        A1C.append(this.A0I);
        A1C.append(", seriesId=");
        A1C.append(this.A0K);
        A1C.append(", isUnifiedVideo=");
        A1C.append(this.A0X);
        A1C.append(", filterId=");
        A1C.append(this.A04);
        A1C.append(", filterStrength=");
        A1C.append(this.A05);
        A1C.append(", postCropAspectRatio=");
        A1C.append(this.A00);
        A1C.append(", isLandscapeSurface=");
        A1C.append(this.A0T);
        A1C.append(", isCoverImageCustom=");
        A1C.append(this.A0P);
        A1C.append(", coverImageFilePath=");
        A1C.append(this.A0H);
        A1C.append(", coverImageWidth=");
        A1C.append(this.A03);
        A1C.append(", coverImageHeight=");
        A1C.append(this.A02);
        A1C.append(", coverImageFromVideoTimeMs=");
        A1C.append(this.A01);
        A1C.append(", isCoverImageFromVideoEdited=");
        A1C.append(this.A0Q);
        A1C.append(", isPreviewEnabled=");
        A1C.append(this.A0W);
        A1C.append(", previewCropCoords=");
        A1C.append(this.A0D);
        A1C.append(", profileCropCoords=");
        A1C.append(this.A0E);
        A1C.append(", isInternal=");
        A1C.append(this.A0S);
        A1C.append(", groupDestinationUserId=");
        A1C.append(this.A0J);
        A1C.append(", shareToFacebook=");
        A1C.append(this.A0a);
        A1C.append(", areCaptionsEnabled=");
        A1C.append(this.A0N);
        A1C.append(", areCommentsDisabled=");
        A1C.append(this.A0O);
        A1C.append(", isFundedContentDeal=");
        A1C.append(this.A0R);
        A1C.append(", isLikeAndViewCountsDisabled=");
        A1C.append(this.A0U);
        A1C.append(", isPaidPartnership=");
        A1C.append(this.A0V);
        A1C.append(", brandedContentInfo=");
        A1C.append(this.A0F);
        A1C.append(", partnerBoostEnabled=");
        A1C.append(this.A0Z);
        A1C.append(", shoppingInfo=");
        A1C.append(this.A0G);
        A1C.append(", createdTimeMs=");
        A1C.append(this.A0A);
        A1C.append(", lastModifiedTimeMs=");
        A1C.append(this.A0C);
        return AbstractC167017dG.A0p(A1C);
    }

    public C51682MsD(RectF rectF, RectF rectF2, IGTVBrandedContentTags iGTVBrandedContentTags, IGTVShoppingMetadata iGTVShoppingMetadata, String str, String str2, String str3, String str4, String str5, String str6, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC25233BEq.A0y(3, str, str2, str3);
        this.A06 = i;
        this.A0Y = z;
        this.A0M = str;
        this.A08 = i2;
        this.A09 = i3;
        this.A07 = i4;
        this.A0B = j;
        this.A0L = str2;
        this.A0I = str3;
        this.A0K = str4;
        this.A0X = z2;
        this.A04 = i5;
        this.A05 = i6;
        this.A00 = f;
        this.A0T = z3;
        this.A0P = z4;
        this.A0H = str5;
        this.A03 = i7;
        this.A02 = i8;
        this.A01 = i9;
        this.A0Q = z5;
        this.A0W = z6;
        this.A0D = rectF;
        this.A0E = rectF2;
        this.A0S = z7;
        this.A0J = str6;
        this.A0a = z8;
        this.A0N = z9;
        this.A0O = z10;
        this.A0R = z11;
        this.A0U = z12;
        this.A0V = z13;
        this.A0F = iGTVBrandedContentTags;
        this.A0Z = z14;
        this.A0G = iGTVShoppingMetadata;
        this.A0A = j2;
        this.A0C = j3;
    }
}
