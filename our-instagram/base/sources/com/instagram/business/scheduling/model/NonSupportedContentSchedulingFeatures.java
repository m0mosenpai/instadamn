package com.instagram.business.scheduling.model;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class NonSupportedContentSchedulingFeatures extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(91);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NonSupportedContentSchedulingFeatures) {
                NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures = (NonSupportedContentSchedulingFeatures) obj;
                if (this.A06 != nonSupportedContentSchedulingFeatures.A06 || this.A00 != nonSupportedContentSchedulingFeatures.A00 || this.A07 != nonSupportedContentSchedulingFeatures.A07 || this.A0C != nonSupportedContentSchedulingFeatures.A0C || this.A0F != nonSupportedContentSchedulingFeatures.A0F || this.A02 != nonSupportedContentSchedulingFeatures.A02 || this.A03 != nonSupportedContentSchedulingFeatures.A03 || this.A0G != nonSupportedContentSchedulingFeatures.A0G || this.A04 != nonSupportedContentSchedulingFeatures.A04 || this.A01 != nonSupportedContentSchedulingFeatures.A01 || this.A05 != nonSupportedContentSchedulingFeatures.A05 || this.A0E != nonSupportedContentSchedulingFeatures.A0E || this.A0D != nonSupportedContentSchedulingFeatures.A0D || this.A08 != nonSupportedContentSchedulingFeatures.A08 || this.A0B != nonSupportedContentSchedulingFeatures.A0B || this.A0A != nonSupportedContentSchedulingFeatures.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0A, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A00, AbstractC25225BEi.A08(this.A06))))))))))))))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r20 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NonSupportedContentSchedulingFeatures(boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r4 = this;
            r4.<init>()
            r4.A06 = r5
            r4.A00 = r6
            r4.A07 = r7
            r4.A0C = r8
            r4.A0F = r9
            r4.A02 = r10
            r4.A03 = r11
            r4.A0G = r12
            r4.A04 = r13
            r4.A01 = r14
            r4.A05 = r15
            r0 = r16
            r4.A0E = r0
            r3 = r17
            r4.A0D = r3
            r2 = r18
            r4.A08 = r2
            r0 = r19
            r4.A0B = r0
            r1 = r20
            r4.A0A = r1
            if (r5 != 0) goto L48
            if (r6 != 0) goto L48
            if (r7 != 0) goto L48
            if (r8 != 0) goto L48
            if (r9 != 0) goto L48
            if (r10 != 0) goto L48
            if (r11 != 0) goto L48
            if (r12 != 0) goto L48
            if (r13 != 0) goto L48
            if (r17 != 0) goto L48
            if (r18 != 0) goto L48
            if (r19 != 0) goto L48
            r0 = 0
            if (r20 == 0) goto L49
        L48:
            r0 = 1
        L49:
            r4.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NonSupportedContentSchedulingFeatures(hasFbSharingInfo=");
        A1C.append(this.A06);
        A1C.append(", hasBarcelonaSharingInfo=");
        A1C.append(this.A00);
        A1C.append(", hasFundraiser=");
        A1C.append(this.A07);
        A1C.append(", hasShoppingMetadata=");
        A1C.append(this.A0C);
        A1C.append(", hasUpcomingEvent=");
        A1C.append(this.A0F);
        A1C.append(", hasCollaboratorTagId=");
        A1C.append(this.A02);
        A1C.append(", hasCollaboratorTags=");
        A1C.append(this.A03);
        A1C.append(", hasBrandedContent=");
        A1C.append(this.A0G);
        A1C.append(", hasCustomMediaAudience=");
        A1C.append(this.A04);
        A1C.append(", hasCloseFriendsAudience=");
        A1C.append(this.A01);
        A1C.append(", hasExclusiveAudience=");
        A1C.append(this.A05);
        A1C.append(", hasTrialParams=");
        A1C.append(this.A0E);
        A1C.append(", hasTranslationAndDub=");
        A1C.append(this.A0D);
        A1C.append(", hasGenAiAttributionLabel=");
        A1C.append(this.A08);
        A1C.append(", hasPoll=");
        A1C.append(this.A0B);
        A1C.append(", hasOther=");
        return AbstractC25236BEt.A0a(A1C, this.A0A);
    }
}
