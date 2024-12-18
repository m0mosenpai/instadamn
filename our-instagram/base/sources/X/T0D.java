package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.os.Build;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.lang.ref.WeakReference;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* loaded from: classes10.dex */
public final class T0D implements ReactInstanceManagerInspectorTarget.TargetDelegate {
    public WeakReference A00;

    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final Map getMetadata() {
        Context context;
        String str;
        String str2;
        C63343Shy c63343Shy = (C63343Shy) this.A00.get();
        if (c63343Shy != null) {
            context = c63343Shy.A05;
        } else {
            context = null;
        }
        String str3 = null;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = ((PackageItemInfo) applicationInfo).labelRes;
            str = context.getPackageName();
            if (i == 0) {
                str3 = ((PackageItemInfo) applicationInfo).nonLocalizedLabel.toString();
            } else {
                str3 = context.getString(i);
            }
        } else {
            str = null;
        }
        String str4 = Build.MODEL;
        Map map = STZ.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(map.get("major"));
        A1C.append(".");
        A1C.append(map.get("minor"));
        A1C.append(".");
        A1C.append(map.get("patch"));
        if (map.get("prerelease") != null) {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("-");
            str2 = AbstractC166997dE.A0v(map.get("prerelease"), A1C2);
        } else {
            str2 = "";
        }
        String A0x = AbstractC166997dE.A0x(str2, A1C);
        HashMap A12 = AbstractC31174DnI.A12("appDisplayName", str3);
        A12.put("appIdentifier", str);
        A12.put("platform", "android");
        A12.put("deviceName", str4);
        A12.put("reactNativeVersion", A0x);
        return A12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.TIY] */
    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        InspectorNetworkRequestListener inspectorNetworkRequestListener2;
        if (C62312S6h.A00 == null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            C62950SYs c62950SYs = new C62950SYs();
            List list = TIY.A0R;
            List list2 = TIY.A0Q;
            C62459SCm c62459SCm = new C62459SCm(SUL.A00);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                proxySelector = new ProxySelector();
            }
            InterfaceC65605Tnu interfaceC65605Tnu = InterfaceC65605Tnu.A00;
            SocketFactory socketFactory = SocketFactory.getDefault();
            TVx tVx = TVx.A00;
            C63201Sf4 c63201Sf4 = C63201Sf4.A02;
            InterfaceC65604Tnt interfaceC65604Tnt = InterfaceC65604Tnt.A00;
            C62458SCl c62458SCl = new C62458SCl();
            InterfaceC65606Tnv interfaceC65606Tnv = InterfaceC65606Tnv.A00;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            inspectorNetworkRequestListener2 = new TIY(proxySelector, list2, A1E, A1E2, list, socketFactory, tVx, interfaceC65604Tnt, interfaceC65604Tnt, c63201Sf4, c62458SCl, interfaceC65605Tnu, c62950SYs, interfaceC65606Tnv, c62459SCm, AbstractC63404SjZ.A02(timeUnit, 10L), AbstractC63404SjZ.A02(TimeUnit.MINUTES, 0L), AbstractC63404SjZ.A02(timeUnit, 10L));
            C62312S6h.A00 = inspectorNetworkRequestListener2;
        }
        try {
            inspectorNetworkRequestListener2 = inspectorNetworkRequestListener;
            C62999SaN c62999SaN = new C62999SaN();
            c62999SaN.A01(str);
            C62696SMk A00 = c62999SaN.A00();
            TIY tiy = C62312S6h.A00;
            TIU tiu = new TIU(tiy, A00, false);
            tiu.A00 = new C63026Saw(tiy, tiu);
            tiu.A00(new TWH(inspectorNetworkRequestListener2));
        } catch (IllegalArgumentException unused) {
            inspectorNetworkRequestListener2.onError(AnonymousClass001.A0R("Not a valid URL: ", str));
        }
    }

    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final void onReload() {
        C63255SgD.A01(new Runnable() { // from class: X.TKT
            @Override // java.lang.Runnable
            public final void run() {
                T0D.this.A00.get();
            }
        });
    }

    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final void onSetPausedInDebuggerMessage(String str) {
        this.A00.get();
    }
}
