package com.instagram.react.modules.base;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC24481Hr;
import X.AbstractC25225BEi;
import X.AbstractC25230BEn;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.AnonymousClass963;
import X.C05F;
import X.C0K8;
import X.C14360o3;
import X.C1Ee;
import X.C1GJ;
import X.C1JO;
import X.C1OK;
import X.C1ON;
import X.C1QW;
import X.C23781El;
import X.C26371Ps;
import X.C26561Ql;
import X.C37821Gkb;
import X.C908342w;
import X.InterfaceC25601Mq;
import X.InterfaceC26421Px;
import X.InterfaceC65542TmH;
import X.InterfaceC65657Tqj;
import X.R3M;
import X.TFB;
import X.TFD;
import X.TFP;
import X.TG6;
import X.TUW;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.common.io.Closeables;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

@ReactModule(name = "Networking")
/* loaded from: classes10.dex */
public class IgNetworkingModule extends NativeNetworkingAndroidSpec implements InterfaceC65542TmH {
    public static final String CONTENT_LENGTH_HEADER_NAME = "content-length";
    public static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    public static final String MODULE_NAME = "Networking";
    public static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    public static final String REQUEST_BODY_KEY_STRING = "string";
    public static final String REQUEST_BODY_KEY_URI = "uri";
    public static final Class TAG = IgNetworkingModule.class;
    public final Object mEnqueuedRequestMonitor;
    public final SparseArray mEnqueuedRequests;
    public final InterfaceC25601Mq mResponseHandler;
    public final AbstractC12990ll mSession;

    public static void buildSimpleRequest(C26371Ps c26371Ps, C23781El[] c23781ElArr, String str) {
        String str2 = null;
        if (c23781ElArr != null) {
            for (C23781El c23781El : c23781ElArr) {
                if (c23781El.A00.equalsIgnoreCase(CONTENT_TYPE_HEADER_NAME)) {
                    str2 = c23781El.A01;
                } else {
                    c26371Ps.A06.add(c23781El);
                }
            }
            if (str2 != null) {
                c26371Ps.A00 = new TFP(str, str2);
                return;
            }
        }
        throw AbstractC166987dD.A12("Payload is set but no content-type header specified");
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d) {
        C1OK removeRequest = removeRequest((int) d);
        if (removeRequest != null) {
            removeRequest.A00();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void clearCookies(Callback callback) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Networking";
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2) {
        int i = (int) d;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3);
        } catch (Exception e) {
            C0K8.A05(TAG, "Error while preparing request", e);
            onRequestError(i, e.getMessage());
        }
    }

    public static void addAllHeaders(C26371Ps c26371Ps, C23781El[] c23781ElArr) {
        if (c23781ElArr != null) {
            for (C23781El c23781El : c23781ElArr) {
                C14360o3.A0B(c23781El, 0);
                c26371Ps.A06.add(c23781El);
            }
        }
    }

    private void buildMultipartRequest(C26371Ps c26371Ps, C23781El[] c23781ElArr, ReadableArray readableArray) {
        C1Ee c1Ee = new C1Ee();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("fieldName");
            if (string != null) {
                if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                    c1Ee.A05(string, map.getString(REQUEST_BODY_KEY_STRING));
                } else if (map.hasKey("uri")) {
                    String string2 = map.getString("uri");
                    String string3 = map.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String string4 = map.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (string3 != null && string4 != null && string2 != null) {
                        Uri A03 = AbstractC08820cl.A03(string2);
                        ContentResolver contentResolver = AbstractC58321PtD.A0b(this).getContentResolver();
                        c1Ee.A00.put(string, new TFB(contentResolver, A03, string3, string4, getBinaryContentLength(contentResolver, A03)));
                    } else {
                        throw AbstractC166987dD.A12("Incomplete payload for URI formData part");
                    }
                } else {
                    throw AbstractC166987dD.A12("Unrecognized FormData part.");
                }
            } else {
                throw AbstractC25230BEn.A0n("Attribute 'name' missing for formData part at index ", i);
            }
        }
        addAllHeaders(c26371Ps, c23781ElArr);
        InterfaceC26421Px A00 = c1Ee.A00(true);
        if (A00 != null) {
            c26371Ps.A03(CONTENT_LENGTH_HEADER_NAME, String.valueOf(A00.getContentLength()));
            c26371Ps.A00 = A00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1QW buildRequest(String str, String str2, ReadableArray readableArray, ReadableMap readableMap) {
        C26371Ps c26371Ps = new C26371Ps(new C1JO(this.mSession));
        C23781El[] extractHeaders = extractHeaders(readableArray);
        if ("GET".equalsIgnoreCase(str)) {
            c26371Ps.A01(C05F.A0N);
            c26371Ps.A02(str2);
            addAllHeaders(c26371Ps, extractHeaders);
        } else if ("POST".equalsIgnoreCase(str)) {
            c26371Ps.A01(C05F.A01);
            c26371Ps.A02(str2);
            if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                buildSimpleRequest(c26371Ps, extractHeaders, readableMap.getString(REQUEST_BODY_KEY_STRING));
            } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                buildMultipartRequest(c26371Ps, extractHeaders, readableMap.getArray(REQUEST_BODY_KEY_FORMDATA));
            } else {
                throw AbstractC166987dD.A12("Unsupported POST data type");
            }
        } else {
            throw AbstractC167007dF.A0c("Unsupported HTTP request method ", str);
        }
        return c26371Ps.A00();
    }

    public static C23781El[] extractHeaders(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList A17 = AbstractC25225BEi.A17(readableArray.size());
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                AbstractC58319PtB.A1I(array.getString(0), array.getString(1), A17);
            } else {
                throw new RuntimeException("Unexpected structure of headers array");
            }
        }
        return (C23781El[]) A17.toArray(new C23781El[A17.size()]);
    }

    public static long getBinaryContentLength(ContentResolver contentResolver, Uri uri) {
        long j;
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream != null) {
                j = openInputStream.available();
            } else {
                j = -1;
            }
            Closeables.A01(openInputStream);
            return j;
        } catch (IOException unused) {
            return -1L;
        }
    }

    private void onDataReceived(int i, String str) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushString(str);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didReceiveNetworkData", writableNativeArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequestError(int i, String str) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushString(str);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didCompleteNetworkResponse", writableNativeArray);
        }
    }

    private void onResponseReceived(int i, TFD tfd) {
        InterfaceC65657Tqj translateHeaders = translateHeaders(tfd.A02);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushInt(tfd.A00);
        writableNativeArray.pushMap(translateHeaders);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didReceiveNetworkResponse", writableNativeArray);
        }
    }

    private void registerRequest(int i, C1OK c1ok) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, c1ok);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1OK removeRequest(int i) {
        C1OK c1ok;
        synchronized (this.mEnqueuedRequestMonitor) {
            SparseArray sparseArray = this.mEnqueuedRequests;
            c1ok = (C1OK) sparseArray.get(i);
            sparseArray.remove(i);
        }
        return c1ok;
    }

    private void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3) {
        C1OK c1ok = new C1OK();
        C908342w A02 = AbstractC24481Hr.A06.A00(new TUW(readableArray, readableMap, this, str, str2), -12, 2, false, true).A02(new C26561Ql(c1ok.A00), 565, 2, true, true).A02(this.mResponseHandler, 566, 2, false, true);
        registerRequest(i, c1ok);
        C1ON A00 = AnonymousClass963.A00(A02);
        A00.A00 = new C37821Gkb(this, str3, i, 0);
        C1GJ.A03(A00);
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                C1OK c1ok = (C1OK) this.mEnqueuedRequests.valueAt(i);
                if (c1ok != null) {
                    c1ok.A00();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    public IgNetworkingModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mEnqueuedRequestMonitor = AbstractC58318PtA.A0b();
        this.mEnqueuedRequests = AbstractC58318PtA.A0G();
        this.mResponseHandler = new TG6(this, 2);
        this.mSession = abstractC12990ll;
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A03(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    public static byte[] inputStreamToByteArray(InputStream inputStream) {
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                A0U.write(bArr, 0, read);
            } else {
                return A0U.toByteArray();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequestSuccess(int i, TFD tfd, String str) {
        String str2;
        onResponseReceived(i, tfd);
        if (str.equals("text")) {
            str2 = AbstractC58318PtA.A0m(AbstractC58318PtA.A0u(), tfd.A01);
        } else if (str.equals("base64")) {
            str2 = Base64.encodeToString(tfd.A01, 2);
        } else {
            str2 = "";
        }
        onDataReceived(i, str2);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushNull();
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didCompleteNetworkResponse", writableNativeArray);
        }
    }

    public static InterfaceC65657Tqj translateHeaders(C23781El[] c23781ElArr) {
        String str;
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        for (C23781El c23781El : c23781ElArr) {
            String str2 = c23781El.A00;
            if (A0c.hasKey(str2)) {
                str = AnonymousClass001.A0g(A0c.getString(str2), ", ", c23781El.A01);
            } else {
                str = c23781El.A01;
            }
            A0c.putString(str2, str);
        }
        return A0c;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        AbstractC58321PtD.A0b(this).A0A(this);
    }
}
