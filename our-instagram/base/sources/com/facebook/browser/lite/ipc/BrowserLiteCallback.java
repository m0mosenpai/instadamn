package com.facebook.browser.lite.ipc;

import android.os.Bundle;
import android.os.IInterface;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface BrowserLiteCallback extends IInterface {
    void AEI(Bundle bundle, ZonePolicy zonePolicy, String str, Map map);

    void AV0(AutofillContactDataCallback autofillContactDataCallback);

    void AV1(AutofillScriptCallback autofillScriptCallback);

    PrefetchCacheEntry BfX(String str);

    ArrayList BfY();

    void CJW(String str);

    void CJX(String str, String str2);

    int CJt(String str);

    boolean CJz(Bundle bundle, ZonePolicy zonePolicy, String str);

    boolean CKB(String str);

    boolean CKK(String str, String str2);

    void CKL(Bundle bundle);

    void Cgs(String str);

    void CiX(long j, String str, String str2, Map map);

    void CiY(long j, String str, String str2, Map map);

    void Cjh(Bundle bundle, String str, String str2, boolean z);

    void CkG(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4);

    void CkU(Bundle bundle, String str, String str2, long j, boolean z);

    void Clr(Bundle bundle, Map map);

    String CoI(String str);

    void CyU(AutofillOptOutCallback autofillOptOutCallback, String str);

    void D80(String str, Bundle bundle);

    void DEm(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map);

    void DHR();

    void DL0(String str, List list);

    void DL2(Bundle bundle, IABBloksGraphQLCallback iABBloksGraphQLCallback, String str, String str2, String str3);

    void DL3(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy);

    void DL4(Bundle bundle, IABExpandableFooterCallback iABExpandableFooterCallback, String str, String str2, String str3, String str4, boolean z);

    void DL5(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3);

    void DL6(Bundle bundle, IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback, String str, String str2, String str3, String str4, List list);

    void DL7(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3);

    void DO3(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback);

    void DXU(int i, String str, Bundle bundle);

    void DXX(Bundle bundle, String str, int i, long j);

    void DXe(Bundle bundle, String str, String str2);

    void DXr(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z);

    void Dcx(Map map);

    void DhA(Bundle bundle, ZonePolicy zonePolicy, String str);

    void Dkq();

    void DxW(String str, Bundle bundle);

    void Dxb(Bundle bundle, Map map);

    void E2w(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback);

    void EIW(Bundle bundle, long[] jArr);

    void EUK();

    void Epk();
}
