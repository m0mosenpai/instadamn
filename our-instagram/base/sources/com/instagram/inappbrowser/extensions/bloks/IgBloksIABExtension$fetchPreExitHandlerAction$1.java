package com.instagram.inappbrowser.extensions.bloks;

import X.AbstractC23641Du;
import X.C0f9;
import X.C12L;
import X.C57312k6;
import X.C60961Rcj;
import X.C62862tP;
import X.InterfaceC11380iw;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class IgBloksIABExtension$fetchPreExitHandlerAction$1 extends Binder implements IABExtensionPreExitHandlerBloksCallback {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C57312k6 A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C60961Rcj A04;

    public IgBloksIABExtension$fetchPreExitHandlerAction$1() {
        int A03 = C0f9.A03(-217002676);
        attachInterface(this, "com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback");
        C0f9.A0A(1916570366, A03);
    }

    @Override // com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback
    public final void D1D(String str, String str2, String str3) {
        int A03 = C0f9.A03(1474555871);
        C60961Rcj c60961Rcj = this.A04;
        c60961Rcj.A01 = C62862tP.A04(this.A00, this.A02, this.A03);
        AbstractC23641Du.A05(C12L.A00.CPG(685945487, 3), new IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1(c60961Rcj, str, str2, str3, null), this.A01);
        C0f9.A0A(674862715, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-10104519, C0f9.A03(2071459936));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-1744412835);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback");
                if (i == 1) {
                    D1D(parcel.readString(), parcel.readString(), parcel.readString());
                    i3 = -469442307;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback");
                i3 = -1639223378;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(1512644758, A03);
        return onTransact;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgBloksIABExtension$fetchPreExitHandlerAction$1(FragmentActivity fragmentActivity, C57312k6 c57312k6, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C60961Rcj c60961Rcj) {
        this();
        this.A04 = c60961Rcj;
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = interfaceC11380iw;
        this.A01 = c57312k6;
        C0f9.A0A(893298217, C0f9.A03(-717623503));
    }
}
