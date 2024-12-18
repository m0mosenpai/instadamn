package com.instagram.feed.feeditem;

import X.AbstractC167017dG;
import X.C05F;
import X.C0w9;
import X.C14360o3;
import X.C1XV;
import X.E6U;
import X.InterfaceC39571se;
import X.InterfaceC73233Pz;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class SuggestedChannels implements Parcelable, InterfaceC73233Pz {
    public static final Parcelable.Creator CREATOR = new LNL(71);
    public final E6U A00;

    public SuggestedChannels(E6U e6u) {
        C14360o3.A0B(e6u, 1);
        this.A00 = e6u;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return null;
    }

    @Override // X.InterfaceC73233Pz
    public final /* synthetic */ Integer BWa() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeValue(this.A00);
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A00.A06;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = this.A00.A02;
        if (str == null) {
            C0w9.A03("SuggestedChannels", "SuggestedChannels Id is null at time of getId()");
            return AbstractC167017dG.A0j();
        }
        return str;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0b;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }
}
