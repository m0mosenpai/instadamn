package com.facebook.react;

import X.AbstractC166987dD;
import X.InterfaceC65356Tik;
import X.SX2;
import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class DebugCorePackage$$ReactModuleInfoProvider implements InterfaceC65356Tik {
    @Override // X.InterfaceC65356Tik
    public final Map Bkd() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(NativeJSCHeapCaptureSpec.NAME, new SX2(NativeJSCHeapCaptureSpec.NAME, "com.facebook.react.devsupport.JSCHeapCapture", false, true, false, true));
        return A1G;
    }
}
