package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* renamed from: X.MbK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50754MbK extends Handler {
    public final BrowserLiteCallbackService A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        String str2;
        C2A1 c2a1;
        EnumC49762Qj enumC49762Qj;
        try {
            BrowserLiteCallbackService browserLiteCallbackService = this.A00;
            UserSession A0Q = MSW.A0Q(browserLiteCallbackService);
            int i = message.what;
            if (i != 0) {
                String A00 = AbstractC58317Pt9.A00(858);
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                int i2 = message.arg1;
                                String str3 = null;
                                if (i2 == 2) {
                                    str3 = "back";
                                } else if (i2 == 1) {
                                    str3 = "up";
                                }
                                boolean z2 = message.getData().getBoolean(A00, true);
                                Object obj = message.obj;
                                obj.getClass();
                                String str4 = (String) obj;
                                C14360o3.A0B(str4, 2);
                                C55782hJ A002 = C55772hI.A00(A0Q);
                                A002.A0F = z2;
                                A002.A0C(new TGD(str4, null), str3, 0);
                                return;
                            }
                            throw AbstractC31175DnJ.A0U("Illegal action specified: ", i);
                        }
                        Object obj2 = message.obj;
                        if (obj2 == null || !AbstractC166987dD.A1a(obj2)) {
                            z = false;
                        }
                        C38272GsH c38272GsH = C38272GsH.A00;
                        if (!z) {
                            C38272GsH.A01(Hd0.A02);
                        }
                        boolean z3 = C218914p.A05;
                        if (!z) {
                            C11T.A06(AbstractC111324zv.A00(1817));
                            C218914p.A04 = true;
                            Handler handler = C218914p.A07;
                            Runnable runnable = C218914p.A0A;
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        }
                        C1VE c1ve = C1VE.A02;
                        if (c1ve != null) {
                            c2a1 = IgTimeInAppActivityListener.A00(c1ve.A00, A0Q).A04;
                            enumC49762Qj = EnumC49762Qj.BACKGROUND;
                            c2a1.A01(enumC49762Qj);
                            return;
                        }
                        return;
                    }
                } else {
                    C12260kU.A0E(browserLiteCallbackService, Intent.createChooser(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", (String) message.obj).setType("text/plain"), browserLiteCallbackService.getString(R.string.res_0x7f130071_name_removed)).addFlags(276824064));
                }
                Bundle data = message.getData();
                String string = data.getString("moduleName");
                if (string == null) {
                    C0w9.A03("IAB Logging", "Error getting null module name");
                    return;
                }
                if (data.getString("url") != null) {
                    str2 = data.getString("url");
                } else {
                    str2 = "";
                }
                boolean z4 = data.getBoolean(A00, true);
                if (!C18U.A06(C06090Tz.A05, A0Q, 36318183325505537L)) {
                    OSB.A00(A0Q, str2, string, z4);
                }
                C38272GsH.A01(Hd0.A03);
                C218914p.A02();
                C1VE c1ve2 = C1VE.A02;
                if (c1ve2 != null) {
                    c2a1 = IgTimeInAppActivityListener.A00(c1ve2.A00, A0Q).A04;
                    enumC49762Qj = EnumC49762Qj.FOREGROUND;
                    c2a1.A01(enumC49762Qj);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            obj3.getClass();
            AbstractC13900nG.A00(browserLiteCallbackService, (String) obj3);
            C9GR.A07(browserLiteCallbackService, R.string.res_0x7f13006e_name_removed);
        } catch (Throwable th) {
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "Error on loadUserSession: empty message";
            }
            C0w9.A03("UITaskHandler", str);
        }
    }

    public HandlerC50754MbK(BrowserLiteCallbackService browserLiteCallbackService) {
        super(Looper.getMainLooper());
        this.A00 = browserLiteCallbackService;
    }
}
