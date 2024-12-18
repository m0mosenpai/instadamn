package X;

import X.C08600cO;
import X.C0f9;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.facebook.assistant.stella.ipc.common.request.IpcRequest;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface$Stub$Proxy;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;
import com.instagram.direct.stella.api.IStellaDirectMessagingService;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.MZa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50682MZa implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C50682MZa(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(th, 0);
                AbstractC55065OaL abstractC55065OaL = (AbstractC55065OaL) this.A03;
                ScheduledExecutorService scheduledExecutorService = AbstractC55065OaL.A08;
                C0K8.A0F("MwaIpcServiceClient", "runIpcRequest error: instrumentation interface failure", th);
                Integer num = C05F.A0Q;
                if (th instanceof UnsupportedOperationException) {
                    num = C05F.A0P;
                    synchronized (abstractC55065OaL.A06) {
                        abstractC55065OaL.A02 = false;
                        abstractC55065OaL.A01 = new Object();
                    }
                }
                IpcRequest ipcRequest = (IpcRequest) this.A01;
                C52028N0a c52028N0a = ipcRequest.A00;
                String A0n = AbstractC167017dG.A0n(th, "RunIpcRequest error: ", AbstractC166987dD.A1C());
                if (31 - num.intValue() != 0) {
                    str = "failed_ipc_transport";
                } else {
                    str = "ipc_service_not_bound";
                }
                c52028N0a.A07(str, A0n, false);
                ((AbstractC25011Ke) this.A02).setException(th);
                AbstractC55065OaL.A00(ipcRequest, abstractC55065OaL);
                return;
            case 1:
                C14360o3.A0B(th, 0);
                OMi oMi = ((C55036OZi) this.A03).A04;
                oMi.A04(null);
                oMi.A00();
                O5R o5r = (O5R) this.A01;
                EnumC53331NiB enumC53331NiB = EnumC53331NiB.A07;
                List list = (List) this.A02;
                RuntimeException runtimeException = new RuntimeException("Unable to get nonce from provider", th);
                AbstractC001800i.A0S(AbstractC166987dD.A1J(enumC53331NiB), list);
                o5r.A00.setException(runtimeException);
                return;
            case 2:
                C14360o3.A0B(th, 0);
                if (th instanceof CancellationException) {
                    ((XP9) this.A02).Dfl();
                } else if (!((C6VU) this.A03).A02.A02) {
                    ((XP9) this.A02).Dfv(th);
                }
                ((XP3) this.A01).A00.A01(th);
                return;
            case 3:
            case 4:
            default:
                C14360o3.A0B(th, 0);
                StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                C1ZU.A00(stellaIpcDirectMessagingServiceClient.userSession, C05F.A0Y, th.toString());
                stellaIpcDirectMessagingServiceClient.onRequestFinished();
                return;
            case 5:
                ((AbstractC25011Ke) this.A01).set(C55055OaA.A00(EnumC53275NhD.A0K));
                AbstractC119915bp.A00((UserSession) this.A03).A00();
                return;
            case 6:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // X.C2JL
    public final void onSuccess(Object obj) {
        IpcRequest ipcRequest;
        AbstractC55065OaL abstractC55065OaL;
        String str;
        ImmutableMap immutableMap;
        C54500O6d c54500O6d;
        final StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient;
        String str2;
        String EIw;
        String str3;
        AbstractC25011Ke abstractC25011Ke;
        EnumC53275NhD enumC53275NhD;
        String A00;
        try {
            switch (this.A00) {
                case 0:
                    boolean z = true;
                    char c = 3;
                    try {
                        abstractC55065OaL = (AbstractC55065OaL) this.A03;
                        ScheduledExecutorService scheduledExecutorService = AbstractC55065OaL.A08;
                        ipcRequest = (IpcRequest) this.A01;
                        C52028N0a c52028N0a = ipcRequest.A00;
                        c52028N0a.A04("execution_start");
                        if (obj != null) {
                            SmartGlassesTunnelInterface$Stub$Proxy smartGlassesTunnelInterface$Stub$Proxy = (SmartGlassesTunnelInterface$Stub$Proxy) obj;
                            C14360o3.A0B(smartGlassesTunnelInterface$Stub$Proxy, 0);
                            JSONObject A0q = AbstractC31171DnF.A0q();
                            boolean z2 = ipcRequest instanceof C52045N0w;
                            if (z2) {
                                str = "contact_updates";
                            } else {
                                str = "call_state_updates";
                            }
                            A0q.put("action", str);
                            ImmutableMap immutableMap2 = ipcRequest.A01;
                            if (immutableMap2 != null) {
                                JSONObject A0q2 = AbstractC31171DnF.A0q();
                                for (Map.Entry entry : immutableMap2.entrySet()) {
                                    A0q2.put((String) entry.getKey(), entry.getValue());
                                }
                                A0q.put("header", A0q2);
                            }
                            if (z2) {
                                immutableMap = ((C52045N0w) ipcRequest).A00;
                            } else {
                                immutableMap = ((C52046N0x) ipcRequest).A00;
                            }
                            if (immutableMap != null) {
                                JSONObject A0q3 = AbstractC31171DnF.A0q();
                                for (Map.Entry entry2 : immutableMap.entrySet()) {
                                    A0q3.put((String) entry2.getKey(), entry2.getValue());
                                }
                                A0q.put("payload", A0q3);
                            }
                            String A19 = AbstractC166987dD.A19(A0q);
                            int A03 = C0f9.A03(975034657);
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface");
                                obtain.writeString(A19);
                                smartGlassesTunnelInterface$Stub$Proxy.A00.transact(1, obtain, obtain2, 0);
                                obtain2.readException();
                                String readString = obtain2.readString();
                                obtain2.recycle();
                                obtain.recycle();
                                C0f9.A0A(1930552472, A03);
                                C14360o3.A07(readString);
                                try {
                                    JSONObject jSONObject = new JSONObject(readString);
                                    AbstractC51451Mnx abstractC51451Mnx = (AbstractC51451Mnx) ipcRequest;
                                    if (jSONObject.optBoolean("success", false)) {
                                        Object A0E = C102274j2.A02().A0E(jSONObject.optString("result"), abstractC51451Mnx.A00);
                                        C14360o3.A07(A0E);
                                        c54500O6d = new C54500O6d(null, A0E);
                                    } else {
                                        c54500O6d = new C54500O6d(new C54754OHj(jSONObject.getInt(TraceFieldType.ErrorCode), jSONObject.optString("error_message")), null);
                                    }
                                    if (c54500O6d.A01 == null) {
                                        C54754OHj c54754OHj = c54500O6d.A00;
                                        if (c54754OHj != null) {
                                            c52028N0a.A07("failed_ipc_response", AnonymousClass001.A07(c54754OHj.A00, "Received error IPC response: ", c54754OHj.A01, " Code: "), true);
                                        } else {
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                    }
                                    ((SettableFuture) this.A02).set(c54500O6d);
                                } catch (Throwable th) {
                                    th = th;
                                    c = 3376;
                                    try {
                                        ipcRequest = (IpcRequest) this.A01;
                                        C52028N0a c52028N0a2 = ipcRequest.A00;
                                        String A0n = AbstractC167017dG.A0n(th, "Error executing IPC action: ", AbstractC166987dD.A1C());
                                        if (c != 3376) {
                                            z = false;
                                        }
                                        c52028N0a2.A07("failed_ipc_transport", A0n, z);
                                        abstractC55065OaL = (AbstractC55065OaL) this.A03;
                                        ScheduledExecutorService scheduledExecutorService2 = AbstractC55065OaL.A08;
                                        C0K8.A0F("MwaIpcServiceClient", "Error while executing ipc action", th);
                                        ((SettableFuture) this.A02).setException(th);
                                        AbstractC55065OaL.A00(ipcRequest, abstractC55065OaL);
                                        return;
                                    } catch (Throwable th2) {
                                        AbstractC55065OaL.A00((IpcRequest) this.A01, (AbstractC55065OaL) this.A03);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                obtain2.recycle();
                                obtain.recycle();
                                C0f9.A0A(-71080819, A03);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    AbstractC55065OaL.A00(ipcRequest, abstractC55065OaL);
                    return;
                case 1:
                    String str4 = (String) obj;
                    C55036OZi c55036OZi = (C55036OZi) this.A03;
                    c55036OZi.A04.A04(str4);
                    O5R o5r = (O5R) this.A01;
                    List list = (List) this.A02;
                    if (str4 == null) {
                        return;
                    }
                    C55036OZi.A00(c55036OZi, o5r, str4, list);
                    return;
                case 2:
                    XP3 xp3 = (XP3) this.A01;
                    if (obj == null) {
                        xp3.A00.A01(new C53401Njq("Keyframes drawable is null", null));
                        return;
                    } else {
                        xp3.A00.A00(obj);
                        return;
                    }
                case 3:
                    IStellaDirectMessagingService iStellaDirectMessagingService = (IStellaDirectMessagingService) obj;
                    try {
                        String A002 = ((OIP) this.A01).A00();
                        if (iStellaDirectMessagingService != null) {
                            str2 = iStellaDirectMessagingService.EIw(A002);
                        } else {
                            str2 = null;
                        }
                        ((SettableFuture) this.A02).set(str2);
                        stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                        if (stellaIpcDirectMessagingServiceClient.context != null && iStellaDirectMessagingService != null) {
                            iStellaDirectMessagingService.ED8(new ISendDirectMessageCallback.Stub() { // from class: com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient$runIpcRequest$1$1$onSuccess$1
                                {
                                    C0f9.A0A(-1068897720, C0f9.A03(-367001253));
                                }

                                @Override // com.instagram.direct.stella.api.ISendDirectMessageCallback
                                public final void DTG(String str5, boolean z3) {
                                    int A032 = C0f9.A03(-1879340024);
                                    C08600cO c08600cO = new C08600cO();
                                    c08600cO.A05(StellaIpcDirectMessagingServiceClient.FB_PERMISSION);
                                    c08600cO.A00().A02(StellaIpcDirectMessagingServiceClient.this.context, null, null);
                                    C0f9.A0A(637532806, A032);
                                }
                            });
                        }
                    } catch (RemoteException e) {
                        stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                        C1ZU.A00(stellaIpcDirectMessagingServiceClient.userSession, C05F.A0N, e.toString());
                    }
                    stellaIpcDirectMessagingServiceClient.onRequestFinished();
                    return;
                case 4:
                    IStellaDirectMessagingService iStellaDirectMessagingService2 = (IStellaDirectMessagingService) obj;
                    try {
                        String A003 = ((OIP) this.A01).A00();
                        if (iStellaDirectMessagingService2 != null && (EIw = iStellaDirectMessagingService2.EIw(A003)) != null) {
                            ((C05A) this.A02).Egh(EIw);
                        }
                        stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                        if (stellaIpcDirectMessagingServiceClient.context != null && iStellaDirectMessagingService2 != null) {
                            final C05A c05a = (C05A) this.A02;
                            iStellaDirectMessagingService2.ED8(new ISendDirectMessageCallback.Stub() { // from class: com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient$runIpcRequestAsFlow$1$1$onSuccess$1
                                {
                                    C0f9.A0A(-386107069, C0f9.A03(-1134883998));
                                }

                                @Override // com.instagram.direct.stella.api.ISendDirectMessageCallback
                                public final void DTG(String str5, boolean z3) {
                                    int A032 = C0f9.A03(783225169);
                                    C08600cO c08600cO = new C08600cO();
                                    c08600cO.A05(StellaIpcDirectMessagingServiceClient.FB_PERMISSION);
                                    c08600cO.A00().A02(StellaIpcDirectMessagingServiceClient.this.context, null, null);
                                    if (str5 != null) {
                                        c05a.Egh(str5);
                                    }
                                    C0f9.A0A(352786153, A032);
                                }
                            });
                        }
                    } catch (RemoteException e2) {
                        stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                        C1ZU.A00(stellaIpcDirectMessagingServiceClient.userSession, C05F.A0N, e2.toString());
                    }
                    stellaIpcDirectMessagingServiceClient.onRequestFinished();
                    return;
                case 5:
                    C09530e4 c09530e4 = (C09530e4) obj;
                    if (c09530e4 != null) {
                        if (AbstractC166987dD.A1a(c09530e4.A00)) {
                            String str5 = ((C31200Dnj) this.A02).A00;
                            abstractC25011Ke = (AbstractC25011Ke) this.A01;
                            JSONObject A0q4 = AbstractC31171DnF.A0q();
                            try {
                                A0q4.put("success", true);
                                if (str5 != null) {
                                    A0q4.putOpt("result", str5);
                                }
                            } catch (JSONException e3) {
                                MSX.A1P(e3);
                            }
                            A00 = AbstractC166987dD.A19(A0q4);
                            abstractC25011Ke.set(A00);
                            AbstractC119915bp.A00((UserSession) this.A03).A00();
                            return;
                        }
                        str3 = (String) c09530e4.A01;
                    } else {
                        str3 = null;
                    }
                    boolean A04 = AbstractC35240FgZ.A04(str3);
                    abstractC25011Ke = (AbstractC25011Ke) this.A01;
                    if (A04) {
                        enumC53275NhD = EnumC53275NhD.A0J;
                    } else {
                        enumC53275NhD = EnumC53275NhD.A0K;
                    }
                    A00 = C55055OaA.A00(enumC53275NhD);
                    abstractC25011Ke.set(A00);
                    AbstractC119915bp.A00((UserSession) this.A03).A00();
                    return;
                default:
                    ((View) this.A02).setVisibility(8);
                    AbstractC43592JPx.A1U(this.A01, 8);
                    ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A03;
                    clipsEditMetadataController.A0R = true;
                    C38321qM c38321qM = clipsEditMetadataController.A0D;
                    if (c38321qM != null) {
                        c38321qM.A0C.ERC(null);
                    }
                    clipsEditMetadataController.A0J().requestFocus();
                    ClipsEditMetadataController.A0C(clipsEditMetadataController);
                    return;
            }
        } catch (Throwable th5) {
            ((StellaIpcDirectMessagingServiceClient) this.A03).onRequestFinished();
            throw th5;
        }
    }
}
