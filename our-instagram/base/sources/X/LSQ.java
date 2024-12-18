package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class LSQ implements InterfaceC50417MNt {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public LSQ(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj4;
        this.A03 = obj3;
        this.A05 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        LK0 lk0;
        Object lgq;
        String message;
        LK0 A00;
        InterfaceC50417MNt lsd;
        C44827Jt1 c44827Jt1;
        AbstractC46349KfX c44808Jsf;
        AbstractC46542Kih abstractC46542Kih = (AbstractC46542Kih) obj;
        if (this.A00 != 0) {
            if (abstractC46542Kih instanceof C44826Jt0) {
                C44456JlO c44456JlO = (C44456JlO) this.A04;
                String str = (String) ((C44826Jt0) abstractC46542Kih).A00;
                L9M l9m = (L9M) this.A03;
                String str2 = this.A05;
                Object obj2 = this.A01;
                A00 = LK0.A00();
                try {
                } catch (UserRecoverableAuthException e) {
                    AbstractC46542Kih.A00(A00, e);
                }
                if (c44456JlO.A04.A08()) {
                    KPI kpi = c44456JlO.A03;
                    kpi.A05("GDRIVE_SETUP_UPLOAD_TO_GDRIVE_START");
                    C63286Sgl c63286Sgl = (C63286Sgl) AbstractC47205Kte.A04.getValue();
                    AbstractC167017dG.A1P(str2, str);
                    try {
                        c63286Sgl.A03(l9m, str2);
                        URLConnection openConnection = new java.net.URL("https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart").openConnection();
                        C14360o3.A0C(openConnection, AbstractC58317Pt9.A00(121));
                        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setRequestMethod("POST");
                        boolean z = false;
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(true);
                        C14360o3.A08(MRW.A00);
                        String str3 = l9m.A00.A00;
                        str3.getClass();
                        httpURLConnection.setRequestProperty("Authorization", AnonymousClass001.A0R("Bearer ", str3));
                        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=*****");
                        try {
                            try {
                                DataOutputStream dataOutputStream = new DataOutputStream(AbstractC09810fe.A01(httpURLConnection, 317528044));
                                dataOutputStream.writeBytes("--*****\r\n");
                                dataOutputStream.writeBytes("Content-Type: application/json\r\n\r\n");
                                dataOutputStream.writeBytes(AnonymousClass001.A0g("{\"name\": \"", str2, "\",\"parents\":[\"appDataFolder\"]}\r\n"));
                                dataOutputStream.writeBytes("--*****\r\n");
                                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"file\"\r\n\r\n");
                                dataOutputStream.writeBytes(str);
                                dataOutputStream.writeBytes("\r\n");
                                dataOutputStream.writeBytes("--*****--\r\n");
                                dataOutputStream.writeBytes("\r\n");
                                C0K8.A0D(AbstractC58317Pt9.A00(563), AnonymousClass001.A0R("response data for uploading :", C63286Sgl.A02(httpURLConnection, httpURLConnection.getResponseCode())));
                                if (httpURLConnection.getResponseCode() == 200) {
                                    z = true;
                                }
                                c44808Jsf = new C44809Jsg(Boolean.valueOf(z));
                            } catch (Throwable th) {
                                httpURLConnection.disconnect();
                                throw th;
                            }
                        } catch (IOException e2) {
                            c44808Jsf = new C44808Jsf(e2);
                        }
                        httpURLConnection.disconnect();
                    } catch (IOException e3) {
                        c44808Jsf = new C44808Jsf(e3);
                    }
                    if (c44808Jsf instanceof C44809Jsg) {
                        if (AbstractC166987dD.A1a(((C44809Jsg) c44808Jsf).A00)) {
                            kpi.A05("GDRIVE_SETUP_CREATE_VD_START");
                            M8M.A01(LFN.A00.A00(c44456JlO.A02), new C50365MLr(obj2, l9m, A00, str2, 36), 6);
                            lsd = new LS9(this.A02, 22);
                            A00.A04(lsd);
                            return;
                        }
                        c44827Jt1 = new C44827Jt1(new Exception());
                    } else if (c44808Jsf instanceof C44808Jsf) {
                        c44827Jt1 = new C44827Jt1((Exception) ((C44808Jsf) c44808Jsf).A00);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    C0K8.A0C("EncryptedBackupsGDriveSetupViewModel", "Cannot create VD, backup exists and not onboarded");
                    c44827Jt1 = new C44827Jt1(new Exception());
                }
                A00.A05(c44827Jt1);
                lsd = new LS9(this.A02, 22);
                A00.A04(lsd);
                return;
            }
            if (abstractC46542Kih instanceof C44827Jt1) {
                lk0 = (LK0) this.A02;
                lgq = new C44827Jt1(((C44827Jt1) abstractC46542Kih).A00);
                lk0.A05(lgq);
            }
            return;
        }
        if (abstractC46542Kih instanceof C44826Jt0) {
            L9V l9v = (L9V) ((C44826Jt0) abstractC46542Kih).A00;
            String str4 = l9v.A00;
            String str5 = l9v.A01;
            LGS lgs = (LGS) this.A02;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = lgs.A01;
            int i = lgs.A00;
            lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "generate_rc_and_vdid_success");
            C47683L3q c47683L3q = (C47683L3q) this.A04;
            C47217Ktq c47217Ktq = (C47217Ktq) this.A01;
            A00 = LK0.A00();
            C47218Ktr c47218Ktr = c47683L3q.A04;
            Integer num = c47683L3q.A05;
            String str6 = c47217Ktq.A00;
            C47940LFq c47940LFq = new C47940LFq(lgs, A00);
            C14360o3.A0B(num, 0);
            UUID A002 = C0HM.A00();
            C14360o3.A07(A002);
            String A19 = AbstractC166987dD.A19(A002);
            lightweightQuickPerformanceLogger.markerAnnotate(1021652080, i, "request_uuid", A19);
            lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "init_register_network_start");
            C47682L3p c47682L3p = c47218Ktr.A00;
            String A003 = AbstractC46548Kin.A00(num);
            L81 l81 = new L81(lgs, c47218Ktr, c47940LFq, num, str6, str5, str4, A19);
            C0CA A06 = JQ1.A06(A003, str5);
            C0CA.A00(A06, Integer.valueOf(c47682L3p.A03), "vesta_client_api_version");
            C0CA.A00(A06, A19, "request_uuid");
            try {
                LTI lti = (LTI) LAT.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
                AbstractC31173DnH.A1M(A06, lti.A00.A00, "request");
                lti.A02 = true;
                C1Dk A004 = lti.A00();
                C14360o3.A07(A004);
                try {
                    if (c47682L3p.A01) {
                        A004.setRequestPurpose(2);
                    }
                } catch (UnsupportedOperationException unused) {
                }
                try {
                    if (c47682L3p.A02) {
                        A004.setRetryPolicy(1).setNetworkTimeoutSeconds(c47682L3p.A00);
                    }
                } catch (UnsupportedOperationException unused2) {
                }
                c47682L3p.A04.ATW(new C48146LSv(l81, 5), new LTC(5, l81, c47682L3p), A004, c47682L3p.A05);
                String str7 = this.A05;
                LK0 A005 = LK0.A00();
                C47967LIb c47967LIb = c47683L3q.A03.A00;
                LK0 A006 = LK0.A00();
                if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
                    C47967LIb.A01(A006);
                } else {
                    K3W k3w = c47967LIb.A02;
                    C44176Jff c44176Jff = new C44176Jff(c47967LIb, A006, 0);
                    InterfaceExecutorC135866Co ASj = k3w.mMailboxApiHandleMetaProvider.ASj(2);
                    MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, c44176Jff);
                    AbstractC25231BEo.A1C(ASj, new LUF(k3w, A0I, str7, 2), A0I);
                }
                LK0.A02(A006, lgs, A005, 8);
                lsd = new LSD(9, this.A03, A005);
                A00.A04(lsd);
                return;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        String str8 = "Failed to generate recovery code";
        C0K8.A0C("VestaRegistrationClient", "Failed to generate recovery code");
        LGS lgs2 = (LGS) this.A02;
        C14360o3.A0C(abstractC46542Kih, "null cannot be cast to non-null type com.encryptedbackups.statemanager.model.ApiResult.Error<com.encryptedbackups.statemanager.model.GenerateRecoveryCodeAndVirtualDeviceIdResponse>");
        Exception exc = ((C44827Jt1) abstractC46542Kih).A00;
        if (exc != null && (message = exc.getMessage()) != null) {
            str8 = message;
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lgs2.A01;
        int i2 = lgs2.A00;
        lightweightQuickPerformanceLogger2.markerPoint(1021652080, i2, "generate_rc_and_vdid_failed");
        JQ0.A1D(lightweightQuickPerformanceLogger2, "generate_rc_and_vdid_error", str8, 1021652080, i2);
        lk0 = (LK0) this.A03;
        lgq = new LGQ(EnumC46211Kcn.A07, AbstractC166997dE.A0a());
        lk0.A05(lgq);
    }
}
