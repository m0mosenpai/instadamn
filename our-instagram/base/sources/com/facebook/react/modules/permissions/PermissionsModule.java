package com.facebook.react.modules.permissions;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C0I2;
import X.C0I3;
import X.C14360o3;
import X.C62164S0l;
import X.C64136Szz;
import X.InterfaceC65494TlI;
import X.InterfaceC65622ToD;
import X.R3M;
import X.T00;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;

@ReactModule(name = NativePermissionsAndroidSpec.NAME)
/* loaded from: classes10.dex */
public final class PermissionsModule extends NativePermissionsAndroidSpec {
    public static final C62164S0l Companion = new Object();
    public static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public final String DENIED;
    public final String GRANTED;
    public final String NEVER_ASK_AGAIN;
    public final SparseArray callbacks;
    public int requestCode;

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray readableArray, InterfaceC65622ToD interfaceC65622ToD) {
        AbstractC167007dF.A1K(readableArray, interfaceC65622ToD);
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        ArrayList A1E = AbstractC166987dD.A1E();
        Context baseContext = AbstractC58321PtD.A0b(this).getBaseContext();
        int size = readableArray.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String string = readableArray.getString(i2);
            if (baseContext.checkSelfPermission(string) == 0) {
                A0c.putString(string, this.GRANTED);
                i++;
            } else {
                A1E.add(string);
            }
        }
        if (readableArray.size() == i) {
            interfaceC65622ToD.resolve(A0c);
            return;
        }
        try {
            InterfaceC65494TlI permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new T00(interfaceC65622ToD, A0c, this, A1E));
            permissionAwareActivity.EJF(this, AbstractC58319PtB.A1b(A1E, 0), this.requestCode);
            this.requestCode++;
        } catch (IllegalStateException e) {
            ((PromiseImpl) interfaceC65622ToD).reject(ERROR_INVALID_ACTIVITY, null, e, null);
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C14360o3.A0B(iArr, 2);
        try {
            Callback callback = (Callback) this.callbacks.get(i);
            if (callback != null) {
                callback.invoke(iArr, getPermissionAwareActivity());
                this.callbacks.remove(i);
            } else {
                C0I2.A09("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i));
            }
            if (this.callbacks.size() != 0) {
                return false;
            }
            return true;
        } catch (IllegalStateException e) {
            Object[] objArr = new Object[0];
            C0I3 c0i3 = C0I2.A00;
            if (!c0i3.isLoggable(6)) {
                return false;
            }
            c0i3.e("PermissionsModule", AbstractC58318PtA.A0k("Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", objArr), e);
            return false;
        }
    }

    public PermissionsModule(R3M r3m) {
        super(r3m);
        this.callbacks = AbstractC58318PtA.A0G();
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
    }

    private final InterfaceC65494TlI getPermissionAwareActivity() {
        ComponentCallbacks2 A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 != null) {
            if (A01 instanceof InterfaceC65494TlI) {
                return (InterfaceC65494TlI) A01;
            }
            throw AbstractC166987dD.A14("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        throw AbstractC166987dD.A14("Tried to use permissions API while not attached to an Activity.");
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String str, InterfaceC65622ToD interfaceC65622ToD) {
        AbstractC167017dG.A1N(str, interfaceC65622ToD);
        interfaceC65622ToD.resolve(Boolean.valueOf(AbstractC167007dF.A1N(AbstractC58321PtD.A0b(this).getBaseContext().checkSelfPermission(str))));
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String str, InterfaceC65622ToD interfaceC65622ToD) {
        AbstractC167017dG.A1N(str, interfaceC65622ToD);
        if (AbstractC58321PtD.A0b(this).getBaseContext().checkSelfPermission(str) == 0) {
            interfaceC65622ToD.resolve(this.GRANTED);
            return;
        }
        try {
            InterfaceC65494TlI permissionAwareActivity = getPermissionAwareActivity();
            SparseArray sparseArray = this.callbacks;
            int i = this.requestCode;
            sparseArray.put(i, new C64136Szz(interfaceC65622ToD, this, str));
            permissionAwareActivity.EJF(this, new String[]{str}, i);
            this.requestCode++;
        } catch (IllegalStateException e) {
            ((PromiseImpl) interfaceC65622ToD).reject(ERROR_INVALID_ACTIVITY, null, e, null);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String str, InterfaceC65622ToD interfaceC65622ToD) {
        AbstractC167017dG.A1N(str, interfaceC65622ToD);
        try {
            interfaceC65622ToD.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            ((PromiseImpl) interfaceC65622ToD).reject(ERROR_INVALID_ACTIVITY, null, e, null);
        }
    }
}
