package com.facebook.common.downloadondemand.js.interfaces;

import X.AbstractC05810Sj;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C05F;
import X.C14360o3;
import X.C18C;
import X.C1M8;
import X.C209210o;
import X.C25191Kx;
import X.C2OD;
import X.C62423SAy;
import X.C62721SNl;
import X.C62881SVh;
import X.C63975Sx1;
import X.C63976Sx2;
import X.C63977Sx3;
import X.InterfaceC65203Tfm;
import X.InterfaceC65484Tl1;
import X.MSW;
import X.R3L;
import X.R3M;
import X.SDU;
import X.SDV;
import X.SLW;
import X.SO6;
import X.SXE;
import X.T8F;
import X.T8J;
import X.TRG;
import android.R;
import com.facebook.fbreact.specs.NativeSegmentFetcherSpec;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;

@ReactModule(name = "SegmentFetcher")
/* loaded from: classes10.dex */
public class JsSegmentFetcherModule extends NativeSegmentFetcherSpec {
    public static final String NAME = "SegmentFetcher";
    public final InterfaceC65203Tfm mJsSegmentFetcher;

    @Override // com.facebook.fbreact.specs.NativeSegmentFetcherSpec
    public void fetchSegment(double d, ReadableMap readableMap, Callback callback) {
        fetchSegmentInternal(d, readableMap, new C63977Sx3(this, callback, (int) d));
    }

    @Override // com.facebook.fbreact.specs.NativeSegmentFetcherSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SegmentFetcher";
    }

    private void fetchSegmentInternal(double d, ReadableMap readableMap, InterfaceC65484Tl1 interfaceC65484Tl1) {
        MarkerEditor markerEditor;
        ListenableFuture listenableFuture;
        String string = readableMap.getString("requestedModuleName");
        String string2 = readableMap.getString("segmentHash");
        InterfaceC65203Tfm interfaceC65203Tfm = this.mJsSegmentFetcher;
        C62721SNl c62721SNl = new C62721SNl(string, string2, (int) d);
        C63975Sx1 c63975Sx1 = (C63975Sx1) interfaceC65203Tfm;
        C14360o3.A0B(interfaceC65484Tl1, 1);
        SDV sdv = new SDV(c62721SNl, c63975Sx1.A01);
        SXE sxe = c63975Sx1.A00;
        String A0O = AnonymousClass001.A0O("hbc-seg-", c62721SNl.A00);
        int A00 = sxe.A06.A00();
        String str = null;
        C18C.A07(A0O, "resourceFlavor == null");
        C62881SVh c62881SVh = C62881SVh.A01;
        String str2 = c62721SNl.A02;
        if (str2 != null) {
            str = str2;
        }
        C62721SNl c62721SNl2 = sdv.A01;
        SLW slw = sdv.A00;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = slw.A02;
        if (lightweightQuickPerformanceLogger != null) {
            int i = slw.A00;
            lightweightQuickPerformanceLogger.markerStart(R.menu.webview_copy, i);
            markerEditor = lightweightQuickPerformanceLogger.withMarker(R.menu.webview_copy, i);
        } else {
            markerEditor = C209210o.A00;
        }
        markerEditor.annotate("bundle_name", "main.jsbundle");
        markerEditor.annotate("segment_id", c62721SNl2.A00);
        markerEditor.annotate("event_tag", "critical_path");
        markerEditor.annotate("is_metadataless", true);
        String str3 = c62721SNl2.A01;
        if (str3 != null) {
            markerEditor.annotate("requested_module_name", str3);
        }
        markerEditor.markerEditingCompleted();
        SO6 so6 = new SO6(c62881SVh, str, A0O, A00);
        ExecutorService executorService = c63975Sx1.A02;
        File A0w = MSW.A0w(MSW.A0w(sxe.A02.A02, String.valueOf(so6.A00)), AnonymousClass001.A0g(so6.A03, "__DELIM__", "main.jsbundle"));
        if (A0w.exists()) {
            listenableFuture = new C25191Kx(new SDU(A0w, C05F.A00));
        } else {
            C62423SAy c62423SAy = sxe.A01;
            TRG trg = new TRG(sxe, so6, executorService);
            ConcurrentMap concurrentMap = c62423SAy.A00;
            SO6 so62 = trg.A02;
            TRG trg2 = (TRG) concurrentMap.get(so62);
            if (trg2 == null && (trg2 = (TRG) concurrentMap.putIfAbsent(so62, trg)) == null) {
                C2OD.A03(new T8J(1, trg, c62423SAy), trg.A03, C1M8.A01);
                trg.A04.execute(trg);
            } else {
                trg = trg2;
            }
            listenableFuture = trg.A03;
        }
        C2OD.A03(new T8F(sdv, interfaceC65484Tl1), listenableFuture, C1M8.A01);
    }

    public static String getModuleName(ReadableMap readableMap) {
        return readableMap.getString("requestedModuleName");
    }

    public static String getSegmentHash(ReadableMap readableMap) {
        return readableMap.getString("segmentHash");
    }

    @Override // com.facebook.fbreact.specs.NativeSegmentFetcherSpec
    public void getSegment(double d, ReadableMap readableMap, Callback callback) {
        fetchSegmentInternal(d, readableMap, new C63976Sx2(callback));
    }

    public JsSegmentFetcherModule(R3M r3m, InterfaceC65203Tfm interfaceC65203Tfm) {
        super(r3m);
        this.mJsSegmentFetcher = interfaceC65203Tfm;
    }

    public static ReadableMap createJsErrorObject(Throwable th) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString(DialogModule.KEY_MESSAGE, th.toString());
        return A0c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerSegmentInReactContext(int i, String str, Callback callback) {
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            CatalystInstance catalystInstance = ((R3L) reactApplicationContextIfActiveOrWarn).A00;
            AbstractC05810Sj.A00(catalystInstance);
            catalystInstance.registerSegment(i, str);
            AbstractC05810Sj.A00(callback);
            callback.invoke(AbstractC58318PtA.A1b());
        }
    }
}
