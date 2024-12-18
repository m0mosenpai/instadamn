package X;

import android.os.Parcelable;

/* renamed from: X.60R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60R implements InterfaceC75123Zc {
    public String A02;
    public boolean A04;
    public Parcelable A01 = new Object();
    public String A03 = "";
    public int A00 = -1;
    public int A05 = -1;
    public int A06 = -1;

    @Override // X.InterfaceC75123Zc
    public final int BLI() {
        return this.A05;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLj() {
        return this.A06;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        return this.A00;
    }

    public final void A00(int i) {
        this.A05 = i;
    }

    public final void A01(int i) {
        this.A06 = i;
    }
}
