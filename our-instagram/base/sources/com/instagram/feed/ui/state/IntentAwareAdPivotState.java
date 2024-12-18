package com.instagram.feed.ui.state;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C1M3;
import X.C38606Gy9;
import X.InterfaceC75123Zc;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class IntentAwareAdPivotState implements Parcelable, InterfaceC75123Zc {
    public static final Parcelable.Creator CREATOR = new LNL(74);
    public int A00;
    public int A01;
    public C38606Gy9 A04;
    public String A06;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A02 = -1;
    public Parcelable A03 = new Object();
    public final String A0E = C1M3.A00().A00;
    public String A05 = "";
    public final List A0F = AbstractC166987dD.A1E();
    public final Map A0H = AbstractC166987dD.A1I();
    public boolean A0C = true;
    public Map A07 = AbstractC166987dD.A1I();
    public boolean A0D = true;
    public final Map A0G = AbstractC166987dD.A1I();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(1);
    }

    public final List A00(String str) {
        if (str != null) {
            Map map = this.A0H;
            if (!map.containsKey(str)) {
                map.put(str, AbstractC166987dD.A1E());
            }
            List list = (List) map.get(str);
            if (list != null) {
                return list;
            }
        }
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLI() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLj() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        return this.A02;
    }
}
