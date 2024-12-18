package X;

import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.filelogging.gen.LogFile;
import com.facebook.rsys.filelogging.gen.LogFileStats;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedHashMap;

/* renamed from: X.MzI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52014MzI extends LargeLogUploadProxy {
    public final InterfaceC02550Ad A00;
    public final InterfaceC58100PpP A01;
    public final boolean A02 = true;
    public final Context A03;

    public C52014MzI(Context context, InterfaceC02550Ad interfaceC02550Ad, InterfaceC58100PpP interfaceC58100PpP) {
        this.A03 = context;
        this.A01 = interfaceC58100PpP;
        this.A00 = interfaceC02550Ad;
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public final void setStructuredLogger(McfReference mcfReference) {
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public final void uploadConsoleLog(String str, String str2) {
        A00(str, str2, 0, AbstractC167007dF.A1R(0, str, str2) ? 1 : 0, "ringbuffer.txt", "text/plain");
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public final void uploadOnDemand(byte[] bArr) {
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public final void uploadRtcEventLog(String str, String str2) {
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        A00(str, str2, A1a ? 1 : 0, 2, "rtc-event-log.log", AbstractC58317Pt9.A00(9));
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public final void uploadSdpLog(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        A00(str, str2, 2, 3, "sdp.txt", "text/plain");
    }

    private final void A00(String str, String str2, int i, int i2, String str3, String str4) {
        EnumC53327Ni6 enumC53327Ni6;
        BufferedReader bufferedReader;
        StringBuilder A11 = AbstractC166997dE.A11(this.A03.getCacheDir().getAbsolutePath());
        A11.append("/RsysLogs/");
        A11.append(str2);
        A11.append('/');
        File A112 = AbstractC166987dD.A11(AbstractC166997dE.A0x(str3, A11));
        boolean exists = A112.exists();
        C18920wW c18920wW = (C18920wW) this.A00;
        C12180kM c12180kM = c18920wW.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c12180kM, "rtc_large_log_upload");
        if (A00.isSampled()) {
            AbstractC166997dE.A1N(A00, "log_type", i);
            int i3 = 3;
            if (exists) {
                i3 = 7;
            }
            AbstractC166997dE.A1N(A00, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, i3);
            AbstractC166997dE.A1N(A00, "requestor", 1);
            A00.AAP("shared_call_id", str);
            A00.AAP("local_call_id", str2);
            A00.Cht();
        }
        if (exists) {
            try {
                C55191Odx c55191Odx = new C55191Odx(A112, str4);
                LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("x-rp-rtc-logtype", String.valueOf(i2)));
                boolean z = this.A02;
                if (z) {
                    A07.put("ig_rp_rtc_log_ondemand", "true");
                }
                C55086Oai c55086Oai = new C55086Oai();
                c55086Oai.A07 = A07;
                if (!z) {
                    enumC53327Ni6 = EnumC53327Ni6.A1A;
                    C14360o3.A0B(enumC53327Ni6, 0);
                } else {
                    c55086Oai.A06 = "i.instagram.com";
                    enumC53327Ni6 = EnumC53327Ni6.A0d;
                    C14360o3.A0B(enumC53327Ni6, 0);
                }
                c55086Oai.A01 = enumC53327Ni6;
                C54993OUc c54993OUc = new C54993OUc(c55086Oai);
                LogFileStats logFileStats = null;
                if (i == 0) {
                    try {
                        Reader inputStreamReader = new InputStreamReader(new FileInputStream(A112), C15W.A05);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader = new BufferedReader(inputStreamReader, 8192);
                        }
                        try {
                            String readLine = bufferedReader.readLine();
                            while (true) {
                                if (readLine != null) {
                                    LogFileStats createLogFileStats = LogFile.CProxy.createLogFileStats(readLine);
                                    if (createLogFileStats == null) {
                                        readLine = bufferedReader.readLine();
                                    } else {
                                        bufferedReader.close();
                                        logFileStats = createLogFileStats;
                                        break;
                                    }
                                } else {
                                    bufferedReader.close();
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C20I.A00(bufferedReader, th);
                                throw th2;
                            }
                        }
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                this.A01.En2(c54993OUc, c55191Odx, new C55652Ond(logFileStats, this, str, str2, i));
            } catch (VIA unused2) {
                InterfaceC02590Ai A002 = c18920wW.A00(c12180kM, "rtc_large_log_upload");
                if (A002.isSampled()) {
                    if (i != Integer.MIN_VALUE) {
                        AbstractC166997dE.A1N(A002, "log_type", i);
                    } else {
                        A002.AAP("log_type", null);
                    }
                    AbstractC166997dE.A1N(A002, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 5);
                    AbstractC166997dE.A1N(A002, "requestor", 1);
                    A002.AAP("shared_call_id", str);
                    A002.AAP("local_call_id", str2);
                    A002.Cht();
                }
            }
        }
    }
}
