package X;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.26G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26G implements C26H {
    public long A00;

    /* JADX WARN: Type inference failed for: r10v0, types: [X.1F2, java.io.File] */
    @Override // X.C26H
    public final Map B3s(UserSession userSession, File file) {
        LinkedList linkedList;
        File file2;
        List emptyList;
        PrintWriter printWriter;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(file, 1);
        C1QT A00 = C1QS.A00(userSession);
        A00.flowMarkPoint(this.A00, "START_CAMERA_AR_BUG_REPORT_LOG_PROVIDER");
        C1XY c1xy = C1XZ.A00;
        if (c1xy == null) {
            linkedList = new LinkedList();
        } else {
            linkedList = new LinkedList();
            Map map = c1xy.A00;
            for (String str : map.keySet()) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.getPath());
                    sb.append('/');
                    sb.append(str);
                    sb.append(OptSvcAnalyticsStore.FILE_SUFFIX);
                    android.net.Uri A002 = C55077OaX.A00(new File(sb.toString()), (String) map.get(str));
                    if (A002 != null) {
                        String path = A002.getPath();
                        C14360o3.A0A(path);
                        linkedList.add(path);
                    }
                } catch (Exception e) {
                    C0w9.A03("AREngineServices::IgCameraARBugReportLogger", "Exception getting report data");
                    C0K8.A0F("AREngineServices::IgCameraARBugReportLogger", "Exception getting report data", e);
                }
            }
        }
        A00.flowMarkPoint(this.A00, "END_CAMERA_AR_BUG_REPORT_LOG_PROVIDER");
        A00.flowMarkPoint(this.A00, "START_IG_ARRD_BUG_REPORT_FILE_PROVIDER");
        synchronized (C149926ol.class) {
            C149926ol c149926ol = C149926ol.A00;
            if (c149926ol == null) {
                emptyList = Collections.emptyList();
            } else if (c149926ol.A00 != null) {
                ?? file3 = new File(file, "ar_delivery_debug.txt");
                try {
                    printWriter = new PrintWriter(new OutputStreamWriter(file3.CHy()));
                } catch (IOException unused) {
                    file2 = null;
                }
                try {
                    C149986or c149986or = c149926ol.A00;
                    C14360o3.A0A(c149986or);
                    StringBuilder sb2 = new StringBuilder();
                    synchronized (c149986or.A02) {
                        sb2.append("operation id: ");
                        sb2.append(c149986or.A00);
                        sb2.append("\n");
                        Map map2 = c149986or.A08;
                        java.util.Set<ARModelMetadataRequest> keySet = map2.keySet();
                        synchronized (map2) {
                            try {
                                for (ARModelMetadataRequest aRModelMetadataRequest : keySet) {
                                    sb2.append("Model name: ");
                                    sb2.append(aRModelMetadataRequest.mCapability.toServerValue());
                                    sb2.append(StringFormatUtil.formatStrLocaleSafe("\nModel version min/preferred: %d/%d", Integer.valueOf(aRModelMetadataRequest.mMinVersion), Integer.valueOf(aRModelMetadataRequest.mPreferredVersion)));
                                    sb2.append("\nModel states: ");
                                    C149986or.A00(sb2, (List) map2.get(aRModelMetadataRequest));
                                    Map map3 = (Map) c149986or.A06.get(aRModelMetadataRequest);
                                    if (map3 != null) {
                                        for (Map.Entry entry : map3.entrySet()) {
                                            sb2.append(StringFormatUtil.formatStrLocaleSafe("\n%s: %s", entry.getKey(), entry.getValue()));
                                        }
                                    }
                                    RkH rkH = (RkH) c149986or.A07.get(aRModelMetadataRequest);
                                    if (rkH != null) {
                                        sb2.append("\nEffect load exception: ");
                                        sb2.append(rkH.A00());
                                    }
                                    sb2.append("\n\n");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        Map map4 = c149986or.A05;
                        java.util.Set<ARRequestAsset> keySet2 = map4.keySet();
                        synchronized (map4) {
                            try {
                                for (ARRequestAsset aRRequestAsset : keySet2) {
                                    C174407pa c174407pa = aRRequestAsset.A02;
                                    sb2.append("Asset name: ");
                                    sb2.append(c174407pa.A0B);
                                    sb2.append("\nCache key: ");
                                    sb2.append(c174407pa.A08);
                                    String str2 = c174407pa.A0A;
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb2.append("\nInstance id: ");
                                        sb2.append(str2);
                                    }
                                    sb2.append("\nAsset type: ");
                                    ARAssetType aRAssetType = c174407pa.A02;
                                    Object obj = aRAssetType;
                                    if (aRAssetType == ARAssetType.SUPPORT) {
                                        obj = c174407pa.A00;
                                    } else if (aRAssetType == ARAssetType.EFFECT) {
                                        obj = c174407pa.A04;
                                    }
                                    sb2.append(obj);
                                    if (aRAssetType == ARAssetType.EFFECT) {
                                        sb2.append("\nRequired SDK Version: ");
                                        sb2.append(c174407pa.A0C);
                                    }
                                    sb2.append("\nCompression method: ");
                                    sb2.append(c174407pa.A03);
                                    sb2.append("\nAsset states: ");
                                    C149986or.A00(sb2, (List) map4.get(aRRequestAsset));
                                    Map map5 = (Map) c149986or.A03.get(aRRequestAsset);
                                    if (map5 != null) {
                                        for (Object obj2 : map5.keySet()) {
                                            sb2.append(StringFormatUtil.formatStrLocaleSafe("\n%s: %s", obj2, map5.get(obj2)));
                                        }
                                    }
                                    RkH rkH2 = (RkH) c149986or.A04.get(aRRequestAsset);
                                    if (rkH2 != null) {
                                        sb2.append("\nAsset load exception: ");
                                        sb2.append(rkH2.A00());
                                    }
                                    sb2.append("\n");
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    printWriter.print(sb2.toString());
                    printWriter.close();
                    file2 = file3;
                    if (file2 != null) {
                        emptyList = Collections.singletonList(android.net.Uri.fromFile(file2).getPath());
                    } else {
                        emptyList = Collections.emptyList();
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        C20I.A00(printWriter, th3);
                        throw th4;
                    }
                }
            } else {
                throw new IllegalStateException("DebugInfoController need to be set");
            }
            C14360o3.A07(emptyList);
        }
        linkedList.addAll(emptyList);
        A00.flowMarkPoint(this.A00, "END_IG_ARRD_BUG_REPORT_FILE_PROVIDER");
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((String) it.next()));
        }
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (Object obj3 : arrayList) {
            linkedHashMap.put(obj3, android.net.Uri.fromFile((File) obj3));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String name = ((File) entry2.getKey()).getName();
            C14360o3.A07(name);
            linkedHashMap2.put(name, entry2.getValue());
        }
        return linkedHashMap2;
    }

    @Override // X.C26H
    public final boolean CLD(UserSession userSession, String str) {
        return true;
    }

    @Override // X.C26H
    public final void Ega(long j) {
        this.A00 = j;
    }

    @Override // X.C26H
    public final String getTag() {
        return "CameraARLogsProvider";
    }
}
