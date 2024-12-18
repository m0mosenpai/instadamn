package com.meta.flytrap.attachment.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25236BEt;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C55344OhA;
import X.PVl;
import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class BugReportAttachment implements Parcelable {
    public final BugReportAttachmentMediaSource A00;
    public final BugReportAttachmentMediaType A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(50);
    public static final C3R9[] A05 = {null, null, (C3R9) BugReportAttachmentMediaType.A00.getValue(), (C3R9) BugReportAttachmentMediaSource.A00.getValue(), null};

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return PVl.A00;
        }
    }

    public BugReportAttachment(BugReportAttachmentMediaSource bugReportAttachmentMediaSource, BugReportAttachmentMediaType bugReportAttachmentMediaType, String str, String str2, boolean z) {
        AbstractC167027dH.A0a(1, str, str2, bugReportAttachmentMediaType, bugReportAttachmentMediaSource);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = bugReportAttachmentMediaType;
        this.A00 = bugReportAttachmentMediaSource;
        this.A04 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BugReportAttachment) {
                BugReportAttachment bugReportAttachment = (BugReportAttachment) obj;
                if (!C14360o3.A0K(this.A03, bugReportAttachment.A03) || !C14360o3.A0K(this.A02, bugReportAttachment.A02) || this.A01 != bugReportAttachment.A01 || this.A00 != bugReportAttachment.A00 || this.A04 != bugReportAttachment.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        AbstractC166997dE.A1I(parcel, this.A01);
        this.A00.writeToParcel(parcel, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03)))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BugReportAttachment(path=");
        A1C.append(this.A03);
        A1C.append(", generatorName=");
        A1C.append(this.A02);
        A1C.append(", mediaType=");
        A1C.append(this.A01);
        A1C.append(", mediaSource=");
        A1C.append(this.A00);
        A1C.append(", async=");
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }

    public /* synthetic */ BugReportAttachment(BugReportAttachmentMediaSource bugReportAttachmentMediaSource, BugReportAttachmentMediaType bugReportAttachmentMediaType, String str, String str2, int i, boolean z) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(PVl.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = bugReportAttachmentMediaType;
        this.A00 = bugReportAttachmentMediaSource;
        if ((i & 16) == 0) {
            this.A04 = true;
        } else {
            this.A04 = z;
        }
    }
}
