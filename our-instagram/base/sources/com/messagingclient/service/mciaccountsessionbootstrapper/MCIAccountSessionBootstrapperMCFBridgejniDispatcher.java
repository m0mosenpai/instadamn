package com.messagingclient.service.mciaccountsessionbootstrapper;

import X.C09170dP;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class MCIAccountSessionBootstrapperMCFBridgejniDispatcher {
    public static native void MCIAccountSessionBootstrapAuxDBsNative(AccountSession accountSession, NativeHolder nativeHolder, NativeHolder nativeHolder2, NativeHolder nativeHolder3, String str, NetworkSession networkSession, NativeHolder nativeHolder4);

    public static native boolean MCIAccountSessionBootstrapIsMainDBNeededNative(AccountSession accountSession, NativeHolder nativeHolder);

    public static native AccountSession MCIAccountSessionCreateAndBootstrapNative(NativeHolder nativeHolder, int i, AuthData authData, NativeHolder nativeHolder2, NativeHolder nativeHolder3, NotificationCenter notificationCenter, NativeHolder nativeHolder4, String str, NetworkSession networkSession, NativeHolder nativeHolder5);

    public static native void MCIAccountSessionLogoutNative(AccountSession accountSession);

    public static native void MCIAccountSessionShutdownNative(AccountSession accountSession);

    static {
        C09170dP.A0C("MCIAccountSessionBootstrapperMCFBridgejni");
    }
}
