package com.facebook.react.devsupport;

import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.InterfaceC65219TgA;
import X.R3M;
import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;

@ReactModule(name = NativeJSCHeapCaptureSpec.NAME, needsEagerInit = true)
/* loaded from: classes10.dex */
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    public InterfaceC65219TgA mCaptureInProgress;

    /* loaded from: classes10.dex */
    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    @Override // com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec
    public synchronized void captureComplete(String str, String str2) {
    }

    public synchronized void captureHeap(String str, InterfaceC65219TgA interfaceC65219TgA) {
        File A11 = AbstractC166987dD.A11(AnonymousClass001.A0R(str, "/capture.json"));
        A11.delete();
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.A03(HeapCapture.class);
            if (heapCapture == null) {
                new Exception("Heap capture js module not registered.");
                throw AbstractC166987dD.A15("onFailure");
            }
            this.mCaptureInProgress = interfaceC65219TgA;
            heapCapture.captureHeap(A11.getPath());
        }
    }

    public JSCHeapCapture(R3M r3m) {
        super(r3m);
        this.mCaptureInProgress = null;
    }
}
