package com.instagram.model.sharelater;

import X.C41856IgA;
import X.EnumC40111tc;
import X.EnumC76383bi;
import X.EnumC76753cN;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.model.mediatype.IgShareLaterMedia;
import com.instagram.model.venue.Venue;
import java.util.List;

/* loaded from: classes9.dex */
public class ShareLaterMedia implements IgShareLaterMedia {
    public static final Parcelable.Creator CREATOR = new C41856IgA(7);
    public MediaUploadMetadata A00;
    public EnumC76753cN A01;
    public EnumC40111tc A02;
    public Venue A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    @Override // X.InterfaceC914447a
    public final boolean CKm() {
        return false;
    }

    @Override // X.InterfaceC914447a
    public final boolean CL0() {
        return false;
    }

    @Override // X.InterfaceC914447a
    public final boolean Cq2() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC914447a
    public final EnumC76383bi AdS() {
        return EnumC76383bi.A06;
    }

    @Override // X.InterfaceC914447a
    public final MediaUploadMetadata BRy() {
        return this.A00;
    }

    @Override // X.InterfaceC914447a
    public final boolean BuB() {
        return this.A0A;
    }

    @Override // X.InterfaceC914447a
    public final boolean CKo() {
        return this.A08;
    }

    @Override // X.InterfaceC914447a
    public final boolean CUC() {
        return this.A07;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeBooleanArray(new boolean[]{this.A07});
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r3.A2K() == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShareLaterMedia(X.C38321qM r3) {
        /*
            r2 = this;
            r2.<init>()
            X.3qg r0 = r3.A1V()
            if (r0 == 0) goto L6a
            X.3qg r0 = r3.A1V()
            java.lang.String r0 = r0.A0e
        Lf:
            r2.A04 = r0
            java.lang.String r0 = r3.A38()
            if (r0 == 0) goto L67
            java.lang.String r0 = r3.A38()
        L1b:
            r2.A05 = r0
            r3.BRp()
            X.1tc r0 = r3.BRp()
            r2.A02 = r0
            com.instagram.model.venue.Venue r0 = r3.A27()
            r2.A03 = r0
            boolean r0 = r3.A4i()
            r2.A08 = r0
            X.1rF r0 = r3.A0C
            java.util.List r0 = r0.AtP()
            r2.A06 = r0
            boolean r0 = r3.A62()
            r2.A0A = r0
            java.lang.Double r0 = r3.A2J()
            if (r0 == 0) goto L4d
            java.lang.Double r1 = r3.A2K()
            r0 = 1
            if (r1 != 0) goto L4e
        L4d:
            r0 = 0
        L4e:
            r2.A09 = r0
            X.3cN r0 = r3.A1m()
            r2.A01 = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r1.<init>()
            r2.A00 = r1
            java.lang.String r0 = r3.A36()
            r1.A03 = r0
            r3.A5W()
            return
        L67:
            java.lang.String r0 = ""
            goto L1b
        L6a:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.sharelater.ShareLaterMedia.<init>(X.1qM):void");
    }

    @Override // X.InterfaceC914447a
    public final void EU4(boolean z) {
        this.A07 = z;
    }
}
