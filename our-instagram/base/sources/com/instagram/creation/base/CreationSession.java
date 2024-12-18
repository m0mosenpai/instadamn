package com.instagram.creation.base;

import X.AbstractC12120kG;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC37304Gc5;
import X.C05F;
import X.C14360o3;
import X.C5L6;
import X.EnumC69983Ch;
import X.LNM;
import X.MSW;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.people.PeopleTag;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class CreationSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(35);
    public float A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public Rect A04;
    public C5L6 A05;
    public C5L6 A06;
    public MediaSession A07;
    public LocationSignalPackage A08;
    public MediaCaptureConfig A09;
    public EnumC69983Ch A0A;
    public PendingRecipient A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public ArrayList A0N;
    public final HashMap A0O;
    public final HashMap A0P;
    public final List A0Q;
    public final Map A0R;

    public final void A06() {
        this.A02 = -1;
        this.A03 = null;
        this.A04 = null;
        List list = this.A0E;
        list.clear();
        this.A07 = null;
        this.A0H = false;
        this.A0N.clear();
        this.A05 = this.A06;
        this.A01 = 0;
        this.A0I = false;
        this.A0D = null;
        list.clear();
        this.A07 = null;
        this.A0H = false;
        this.A0C = null;
        this.A00 = 0.0f;
        this.A0H = false;
    }

    public final void A07(String str, String str2, boolean z) {
        MediaSession photoSession;
        if (z) {
            C14360o3.A0B(str, 0);
            photoSession = new VideoSession(str, str2);
        } else {
            C14360o3.A0B(str, 0);
            photoSession = new PhotoSession(str, str2);
        }
        this.A0E.add(photoSession);
        this.A07 = photoSession;
        HashMap hashMap = this.A0O;
        if (!hashMap.isEmpty() && !hashMap.containsKey(str)) {
            this.A0H = true;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotoSession A02() {
        MediaSession mediaSession = this.A07;
        if (mediaSession == null) {
            return null;
        }
        if (mediaSession.Btq() == C05F.A01 && this.A0C != null) {
            for (MediaSession mediaSession2 : this.A0E) {
                if (mediaSession2.Btq() == C05F.A00) {
                    break;
                }
            }
        }
        mediaSession2 = this.A07;
        if (mediaSession2.Btq() != C05F.A00) {
            return null;
        }
        return (PhotoSession) mediaSession2;
    }

    public final PhotoSession A03(String str) {
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            if (A0R.Btq() == C05F.A00 && str.equals(A0R.B6E())) {
                return (PhotoSession) A0R;
            }
        }
        return null;
    }

    public final VideoSession A04() {
        MediaSession mediaSession = this.A07;
        if (mediaSession != null && mediaSession.Btq() == C05F.A01) {
            return (VideoSession) mediaSession;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        EnumC69983Ch enumC69983Ch = this.A0A;
        enumC69983Ch.getClass();
        parcel.writeInt(enumC69983Ch.ordinal());
        parcel.writeParcelable(this.A09, i);
        parcel.writeInt(this.A02);
        parcel.writeTypedList(this.A0N);
        parcel.writeByte(this.A0K ? (byte) 1 : (byte) 0);
        C5L6 c5l6 = this.A05;
        if (c5l6 == null) {
            c5l6 = C5L6.A0E;
        }
        parcel.writeInt(c5l6.A01);
        C5L6 c5l62 = this.A06;
        c5l62.getClass();
        parcel.writeInt(c5l62.A01);
        parcel.writeInt(this.A01);
        List list = this.A0E;
        parcel.writeList(list);
        MediaSession mediaSession = this.A07;
        if (mediaSession != null) {
            i2 = list.indexOf(mediaSession);
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0I ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0C);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A0M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0J ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0L ? (byte) 1 : (byte) 0);
        HashMap hashMap = this.A0P;
        parcel.writeInt(hashMap.size());
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            parcel.writeString((String) AbstractC167027dH.A0O(parcel, A14));
        }
        parcel.writeParcelable(this.A0B, i);
    }

    public CreationSession(Parcel parcel) {
        C5L6 c5l6;
        C5L6 c5l62;
        MediaSession mediaSession;
        this.A0E = AbstractC166987dD.A1E();
        this.A0N = AbstractC166987dD.A1E();
        this.A0Q = AbstractC166987dD.A1E();
        this.A0O = AbstractC166987dD.A1G();
        this.A0P = AbstractC166987dD.A1G();
        this.A00 = 1.0f;
        this.A0R = AbstractC166987dD.A1G();
        this.A0A = EnumC69983Ch.values()[parcel.readInt()];
        this.A09 = (MediaCaptureConfig) AbstractC37304Gc5.A04(parcel, MediaCaptureConfig.class);
        this.A02 = parcel.readInt();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(PeopleTag.CREATOR);
        createTypedArrayList.getClass();
        this.A0N = createTypedArrayList;
        this.A0K = AbstractC167007dF.A1P(parcel.readByte(), 1);
        int readInt = parcel.readInt();
        C5L6[] c5l6Arr = C5L6.A05;
        int length = c5l6Arr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                c5l6 = c5l6Arr[i];
                if (c5l6.A01 == readInt) {
                    break;
                } else {
                    i++;
                }
            } else {
                c5l6 = C5L6.A0E;
                break;
            }
        }
        this.A05 = c5l6;
        int readInt2 = parcel.readInt();
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                c5l62 = c5l6Arr[i2];
                if (c5l62.A01 == readInt2) {
                    break;
                } else {
                    i2++;
                }
            } else {
                c5l62 = C5L6.A0E;
                break;
            }
        }
        this.A06 = c5l62;
        this.A01 = parcel.readInt();
        this.A0E = parcel.readArrayList(MediaSession.class.getClassLoader());
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            mediaSession = (MediaSession) this.A0E.get(readInt3);
        } else {
            mediaSession = null;
        }
        this.A07 = mediaSession;
        this.A0D = parcel.readString();
        this.A0I = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A0C = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A0M = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A0J = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A0F = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A0G = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A0L = parcel.readByte() == 1;
        int readInt4 = parcel.readInt();
        for (int i3 = 0; i3 < readInt4; i3++) {
            this.A0P.put(parcel.readString(), parcel.readString());
        }
        this.A0B = (PendingRecipient) AbstractC37304Gc5.A04(parcel, PendingRecipient.class);
    }

    public final int A00() {
        VideoSession A04;
        CropInfo cropInfo;
        PhotoSession A02 = A02();
        if ((A02 != null && (cropInfo = A02.A05) != null) || ((A04 = A04()) != null && (cropInfo = A04.A0C) != null)) {
            return cropInfo.A00;
        }
        AbstractC12120kG.A01("CreationSession_getOriginalHeight()", "Unable to get height");
        return 0;
    }

    public final int A01() {
        VideoSession A04;
        CropInfo cropInfo;
        PhotoSession A02 = A02();
        if ((A02 != null && (cropInfo = A02.A05) != null) || ((A04 = A04()) != null && (cropInfo = A04.A0C) != null)) {
            return cropInfo.A01;
        }
        AbstractC12120kG.A01("CreationSession_getOriginalWidth()", "Unable to get width");
        return 0;
    }

    public final List A05() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            if (A0R.Btq() == C05F.A00) {
                A1E.add(A0R);
            }
        }
        return Collections.unmodifiableList(A1E);
    }

    public CreationSession() {
        this.A0E = AbstractC166987dD.A1E();
        this.A0N = AbstractC166987dD.A1E();
        this.A0Q = AbstractC166987dD.A1E();
        this.A0O = AbstractC166987dD.A1G();
        this.A0P = AbstractC166987dD.A1G();
        this.A00 = 1.0f;
        this.A0R = AbstractC166987dD.A1G();
        A06();
        this.A06 = C5L6.A0E;
    }
}
