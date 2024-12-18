package com.facebookpay.logging;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC37302Gc3;
import X.AbstractC43591JPw;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public final class LoggingContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(13);
    public final long A00;
    public final LoggingPolicy A01;
    public final String A02;
    public final Set A03;
    public final Set A04;
    public final boolean A05;

    public LoggingContext(LoggingPolicy loggingPolicy, String str, Set set, Set set2, long j, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = j;
        this.A01 = loggingPolicy;
        this.A03 = set;
        this.A04 = set2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingContext) {
                LoggingContext loggingContext = (LoggingContext) obj;
                if (!C14360o3.A0K(this.A02, loggingContext.A02) || this.A00 != loggingContext.A00 || !C14360o3.A0K(this.A01, loggingContext.A01) || !C14360o3.A0K(this.A03, loggingContext.A03) || !C14360o3.A0K(this.A04, loggingContext.A04) || this.A05 != loggingContext.A05) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        LoggingPolicy loggingPolicy = this.A01;
        if (loggingPolicy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loggingPolicy.writeToParcel(parcel, i);
        }
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A03);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
        Iterator A0h2 = AbstractC37302Gc3.A0h(parcel, this.A04);
        while (A0h2.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h2);
        }
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, (AbstractC25236BEt.A01(this.A00, this.A02.hashCode() * 31) + AbstractC167017dG.A0M(this.A01)) * 31));
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        return A0J + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoggingContext(sessionId=");
        sb.append(this.A02);
        sb.append(AbstractC43591JPw.A00(59));
        sb.append(this.A00);
        sb.append(", loggingPolicy=");
        sb.append(this.A01);
        sb.append(", eventSuppressionPolicy=");
        sb.append(this.A03);
        sb.append(", payloadFieldSuppressionPolicy=");
        sb.append(this.A04);
        sb.append(", disableLogging=");
        return AbstractC25236BEt.A0a(sb, this.A05);
    }
}
