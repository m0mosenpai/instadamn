package com.facebook.rti.push.service;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC37303Gc4;
import X.C0K8;
import X.C0f9;
import X.C14360o3;
import X.EnumC74203Uz;
import X.InterfaceC65499TlN;
import X.T1Z;
import android.content.Context;
import android.os.Bundle;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class FbnsAIDLService extends IFbnsAIDLService.Stub {
    public final Context A00;
    public final Map A01;

    public /* synthetic */ FbnsAIDLService(Context context, InterfaceC65499TlN interfaceC65499TlN, InterfaceC65499TlN interfaceC65499TlN2) {
        int A03 = C0f9.A03(426944757);
        HashMap A1G = AbstractC166987dD.A1G();
        this.A01 = A1G;
        EnumC74203Uz enumC74203Uz = EnumC74203Uz.GET_PREF_BASED_CONFIG;
        InterfaceC65499TlN interfaceC65499TlN3 = T1Z.A02;
        A1G.put(enumC74203Uz, interfaceC65499TlN3);
        A1G.put(EnumC74203Uz.SET_PREF_BASED_CONFIG, interfaceC65499TlN3);
        EnumC74203Uz enumC74203Uz2 = EnumC74203Uz.GET_ANALYTICS_CONFIG;
        InterfaceC65499TlN interfaceC65499TlN4 = T1Z.A01;
        A1G.put(enumC74203Uz2, interfaceC65499TlN4);
        A1G.put(EnumC74203Uz.SET_ANALYTICS_CONFIG, interfaceC65499TlN4);
        EnumC74203Uz enumC74203Uz3 = EnumC74203Uz.GET_PREF_IDS;
        InterfaceC65499TlN interfaceC65499TlN5 = T1Z.A03;
        A1G.put(enumC74203Uz3, interfaceC65499TlN5);
        A1G.put(EnumC74203Uz.SET_PREF_IDS, interfaceC65499TlN5);
        this.A00 = context;
        A1G.put(EnumC74203Uz.GET_APPS_STATISTICS, interfaceC65499TlN);
        A1G.put(EnumC74203Uz.GET_FLYTRAP_REPORT, interfaceC65499TlN2);
        C0f9.A0A(-393220584, A03);
        C0f9.A0A(181612027, C0f9.A03(-450747708));
    }

    private InterfaceC65499TlN A00(FbnsAIDLRequest fbnsAIDLRequest, boolean z) {
        IllegalArgumentException A12;
        int i;
        int i2;
        int A03 = C0f9.A03(1757836597);
        if (fbnsAIDLRequest != null && (i2 = fbnsAIDLRequest.A00) >= 0) {
            EnumC74203Uz enumC74203Uz = (EnumC74203Uz) AbstractC166997dE.A0m(EnumC74203Uz.A02, i2);
            if (enumC74203Uz == null) {
                enumC74203Uz = EnumC74203Uz.NOT_EXIST;
            }
            if (enumC74203Uz != EnumC74203Uz.NOT_EXIST) {
                if (enumC74203Uz.A01 == z) {
                    InterfaceC65499TlN interfaceC65499TlN = (InterfaceC65499TlN) this.A01.get(enumC74203Uz);
                    if (interfaceC65499TlN != null) {
                        C0f9.A0A(143105443, A03);
                        return interfaceC65499TlN;
                    }
                    A12 = AbstractC37303Gc4.A0M(enumC74203Uz, "FbnsService does not implement operation ", AbstractC166987dD.A1C());
                    i = 1761423386;
                } else {
                    C0K8.A0C("FbnsAIDLService", "FbnsAIDLOperation incorrect return type");
                    A12 = AbstractC166987dD.A12("FbnsService operation incorrect return type");
                    i = -2746196;
                }
            } else {
                A12 = AbstractC166987dD.A12("FbnsService operation not found");
                i = -783403537;
            }
        } else {
            C0K8.A0C("FbnsAIDLService", "Invalid FbnsAIDLRequest");
            A12 = AbstractC166987dD.A12("FbnsService received invalid FbnsAIDLRequest");
            i = 47240374;
        }
        C0f9.A0A(i, A03);
        throw A12;
    }

    @Override // com.facebook.push.fbns.ipc.IFbnsAIDLService
    public final FbnsAIDLResult E7P(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = C0f9.A03(91810972);
        InterfaceC65499TlN A00 = A00(fbnsAIDLRequest, true);
        Context context = this.A00;
        Bundle bundle = ((FbnsAIDLResult) fbnsAIDLRequest).A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
            C14360o3.A08(bundle);
        }
        FbnsAIDLResult fbnsAIDLResult = new FbnsAIDLResult(A00.AQ4(context, bundle));
        C0f9.A0A(576271924, A03);
        return fbnsAIDLResult;
    }

    @Override // com.facebook.push.fbns.ipc.IFbnsAIDLService
    public final void FA1(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = C0f9.A03(812821291);
        InterfaceC65499TlN A00 = A00(fbnsAIDLRequest, false);
        Context context = this.A00;
        Bundle bundle = ((FbnsAIDLResult) fbnsAIDLRequest).A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
            C14360o3.A08(bundle);
        }
        A00.AQA(context, bundle);
        C0f9.A0A(283333045, A03);
    }
}
