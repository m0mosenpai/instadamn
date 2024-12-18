package com.instagram.direct.messagethread.messageactions.model;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.AbstractC31179DnN;
import X.C14360o3;
import X.C2EY;
import X.C47726L5n;
import X.LNL;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class MessageActionsViewModel implements Parcelable {
    public static final C47726L5n A0a = new Object();
    public static final Parcelable.Creator CREATOR = LNL.A00(19);
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public PointF A04;
    public Rect A05;
    public AiStudioLoggingData A06;
    public C2EY A07;
    public MessageIdentifier A08;
    public Boolean A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0L);
        while (A0u.hasNext()) {
            parcel.writeParcelable((Parcelable) A0u.next(), i);
        }
        Iterator A0u2 = AbstractC25231BEo.A0u(parcel, this.A0O);
        while (A0u2.hasNext()) {
            parcel.writeParcelable((Parcelable) A0u2.next(), i);
        }
        parcel.writeString(this.A0K);
        parcel.writeLong(this.A03);
        C2EY c2ey = this.A07;
        if (c2ey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, c2ey);
        }
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeStringList(this.A0N);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeInt(this.A0Z ? 1 : 0);
        AbstractC31179DnN.A0p(parcel, this.A09);
        Long l = this.A0C;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeStringList(this.A0M);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A0P ? 1 : 0);
        AbstractC167027dH.A0o(parcel, this.A0B, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A0A, 0, 1);
        parcel.writeParcelable(this.A06, i);
    }
}
