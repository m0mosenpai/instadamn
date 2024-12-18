package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.tigon.iface.TigonRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23571Ct implements C1CT {
    @Override // X.C1CT
    public final void CjD(C74803Xr c74803Xr) {
        Map map;
        Object obj;
        C14360o3.A0B(c74803Xr, 0);
        InterfaceC74743Xi interfaceC74743Xi = c74803Xr.A02;
        TigonRequest tigonRequest = c74803Xr.A03;
        HashMap hashMap = null;
        C74703Xe c74703Xe = (C74703Xe) interfaceC74743Xi.BMN(AbstractC74763Xk.A04);
        if (c74703Xe == null) {
            C21A.A00();
            return;
        }
        interfaceC74743Xi.BMN(AbstractC74763Xk.A0D);
        Map map2 = c74703Xe.A01;
        C3Xt.A00(map2, TraceFieldType.StatusCode, -1);
        map2.get(TraceFieldType.Error);
        C3Xu c3Xu = (C3Xu) interfaceC74743Xi.BMN(AbstractC74763Xk.A08);
        ArrayList arrayList = new ArrayList();
        if (c3Xu != null) {
            Iterator it = c3Xu.A00.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                C14360o3.A07(it.next());
                arrayList.add(new C72538Xfr());
            }
        }
        C9BW c9bw = (C9BW) tigonRequest.getLayerInformation(C1S2.A02);
        if (c9bw != null && (map = (Map) c9bw.A00) != null && !map.isEmpty()) {
            hashMap = new HashMap();
            for (Map.Entry entry : C21A.A05.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (map.containsKey(key)) {
                    obj = map.get(key);
                } else if (map.containsKey(value)) {
                    obj = map.get(value);
                }
                hashMap.put(value, obj);
            }
        }
        C3Xt.A02(TraceFieldType.ConnectionAcquisitionEnd, map2);
        C3Xt.A02(TraceFieldType.TTFB, map2);
        C3Xt.A02(TraceFieldType.TTLB, map2);
        C3Xt.A00(map2, TraceFieldType.LocalPort, 0);
        tigonRequest.url();
        map2.get("request_friendly_name");
        map2.get(TraceFieldType.RangeRequest);
        C3Xt.A00(map2, TraceFieldType.ReqHeaderCompSize, 0);
        C3Xt.A00(map2, TraceFieldType.ReqBodySize, 0);
        C3Xt.A00(map2, TraceFieldType.RspHeaderCompSize, 0);
        C3Xt.A00(map2, TraceFieldType.RspBodyCompSize, 0);
        String str = (String) map2.get(TraceFieldType.NewSession);
        if (str != null) {
            C14360o3.A07(Boolean.valueOf(str));
        }
        C3Xt.A02(TraceFieldType.ServerRtx, map2);
        C3Xt.A02(TraceFieldType.ServerUpstreamLatency, map2);
        C3Xt.A02(TraceFieldType.FirstBodyByteFlushed, map2);
        C3Xt.A02(TraceFieldType.LastBodyByteFlushed, map2);
        map2.get(TraceFieldType.TransportType);
        map2.get(TraceFieldType.QuicServerCID);
        map2.get(TraceFieldType.QuicClientCID);
        String str2 = (String) map2.get(TraceFieldType.IsPushRequest);
        if (str2 != null) {
            C14360o3.A07(Boolean.valueOf(str2));
        }
        C3Xt.A02(TraceFieldType.HTTPStreamId, map2);
        C21A.A01(new C74823Xv(arrayList, hashMap));
    }
}
