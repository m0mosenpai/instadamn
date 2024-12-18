package X;

import android.os.Parcel;

/* renamed from: X.TXd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64853TXd extends RuntimeException {
    public C64853TXd(Parcel parcel, String str) {
        super(AnonymousClass001.A0o(str, " Parcel: pos=", " size=", parcel.dataPosition(), parcel.dataSize()));
    }
}
