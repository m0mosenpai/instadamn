package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8IE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IE {
    public Y1s A00;
    public C174757qB A01;
    public RunnableC24343Aqm A02;
    public C177677v1 A03;
    public C8XV A04;
    public InterfaceC184638He A05;
    public File A06;
    public File A07;
    public boolean A08;
    public final long A09;
    public final Activity A0A;
    public final AbstractC184688Hj A0F;
    public final C1815283f A0G;
    public final UserSession A0H;
    public final C1810981l A0I;
    public final C8ID A0J;
    public final C184658Hg A0K;
    public final C184848Hz A0L;
    public final AnonymousClass835 A0M;
    public final C1821786b A0N;
    public final AnonymousClass840 A0O;
    public final C8C0 A0P;
    public final C8FG A0Q;
    public final C8GE A0R;
    public final InterfaceC1810081c A0S;
    public final AnonymousClass856 A0T;
    public final AnonymousClass825 A0U;
    public final ShutterButton A0V;
    public final C8IC A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final C8HG A0a;
    public final C1821585z A0b;
    public final boolean A0c;
    public final C20030yX A0B = new C005001p(0);
    public final C20030yX A0C = new C005001p(0);
    public final AbstractC184688Hj A0E = new C8IF(this);
    public final AbstractC184688Hj A0D = new C8IG(this);

    /* JADX WARN: Type inference failed for: r0v12, types: [X.8Hq, java.lang.Object] */
    public final void A07(C195868lW c195868lW) {
        Product A03;
        String str;
        C174757qB c174757qB;
        c195868lW.A19 = true;
        C1815283f c1815283f = this.A0G;
        CameraAREffect A01 = c1815283f.A00().A01();
        if (A01 != null) {
            Integer num = null;
            try {
                c174757qB = this.A01;
            } catch (C6M2 unused) {
            }
            if (c174757qB != null && c174757qB.CWZ()) {
                num = Integer.valueOf(this.A01.A07());
                if (num != null) {
                    c195868lW.A0f = AbstractC196798n9.A00(num);
                }
            }
            c195868lW.A0P = A01;
            c195868lW.A0g = AbstractC197018nW.A00(this.A0I.A0A());
            c195868lW.A0j = c1815283f.A00().A02();
            C1821585z c1821585z = this.A0b;
            if (this.A0c && c1821585z != null && (A03 = c1821585z.A03()) != null) {
                String str2 = A03.A0H;
                User user = A03.A0B;
                if (user == null || (str = AbstractC76433bn.A00(user)) == null) {
                    str = "";
                }
                C14360o3.A0B(str2, 1);
                ?? obj = new Object();
                obj.A01 = str2;
                obj.A00 = str;
                c195868lW.A0W = obj;
            }
            if (A01.A0f) {
                c195868lW.A12.add(EnumC223259tC.A0X.toString());
            }
        }
    }

    public static String A00(C8IE c8ie) {
        StringBuilder sb = new StringBuilder();
        sb.append("camera_destination ");
        sb.append(c8ie.A0I.A08.A00);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, X.ABh] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.A9K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, X.ABh] */
    public static void A01(final C8IE c8ie) {
        String str;
        String str2;
        ShutterButton shutterButton = c8ie.A0V;
        shutterButton.setButtonActionsEnabled(true);
        c8ie.A0a.A00().Dzj();
        c8ie.A05 = null;
        if (c8ie.A07 != null) {
            if (c8ie.A06 == null) {
                C174757qB c174757qB = c8ie.A01;
                c174757qB.getClass();
                if (c174757qB.A0T()) {
                    return;
                }
            }
            C184658Hg c184658Hg = c8ie.A0K;
            boolean z = c184658Hg.A05;
            C174757qB c174757qB2 = c8ie.A01;
            c174757qB2.getClass();
            if (!c174757qB2.A0V() && !z) {
                UserSession userSession = c8ie.A0H;
                AbstractC183338Bg.A00(userSession).A0F("recording_starting_1");
                if (A04(c8ie)) {
                    if (shutterButton.A0i.A0A) {
                        C1814983c c1814983c = c8ie.A0G.A00().A05.A0M;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("captureType", "tap");
                            jSONObject.put("platform", "android");
                            C1814983c.A00(c1814983c, jSONObject);
                        } catch (JSONException e) {
                            if (e.getMessage() != null) {
                                str2 = e.getMessage();
                            } else {
                                str2 = "";
                            }
                            AbstractC12120kG.A01("PlatformEventsController::fireCaptureTypeTapEvent", str2);
                        }
                    }
                    C1814983c c1814983c2 = c8ie.A0G.A00().A05.A0M;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("action", "play_effect");
                        jSONObject2.put("platform", "android");
                        C1814983c.A00(c1814983c2, jSONObject2);
                    } catch (JSONException e2) {
                        if (e2.getMessage() != null) {
                            str = e2.getMessage();
                        } else {
                            str = "";
                        }
                        AbstractC12120kG.A01("PlatformEventsController::firePlayEffectEvent", str);
                    }
                }
                boolean z2 = !c8ie.A0Z;
                ?? obj = new Object();
                C22826A4v c22826A4v = C23106AGs.A07;
                File file = c8ie.A07;
                file.getClass();
                obj.A00(c22826A4v, file);
                C22826A4v c22826A4v2 = C23106AGs.A0B;
                obj.A00(c22826A4v2, false);
                if (c8ie.A01.A0T()) {
                    ?? obj2 = new Object();
                    File file2 = c8ie.A06;
                    file2.getClass();
                    obj2.A00(c22826A4v, file2);
                    obj2.A00(c22826A4v2, false);
                    obj.A00(C23106AGs.A06, new C23106AGs(obj2));
                    if (c8ie.A0I.A08.A00 instanceof C81V) {
                        obj.A00(c22826A4v2, true);
                    }
                    c8ie.A0J.A00.A0s.setEnabled(false);
                }
                C196518mh A01 = C174757qB.A01(c8ie.A01);
                if ((A01 != null && A01.A01 != EnumC222819sM.A03) || c8ie.A03()) {
                    obj.A00(C23106AGs.A0C, 2);
                }
                final C23106AGs c23106AGs = new C23106AGs(obj);
                final ?? obj3 = new Object();
                obj3.A00 = Boolean.valueOf(z2);
                Object obj4 = c8ie.A0I.A08.A00;
                if (obj4 == C81T.A00) {
                    obj3.A04 = 32000;
                    obj3.A03 = 5;
                }
                if (obj4 == C208509Kk.A00) {
                    Activity activity = c8ie.A0A;
                    if (AbstractC195898lZ.A00(activity.getApplicationContext(), userSession) && c8ie.A03()) {
                        C14360o3.A0B(userSession, 0);
                        if (C18U.A06(C06090Tz.A05, userSession, 36319750988635807L)) {
                            C37101o8.A00(AbstractC195888lY.A00()).A00(activity.getApplicationContext(), userSession, new C24067Am6(obj3, c8ie), "IgCameraViewRecordingController");
                        }
                    }
                }
                if (!c184658Hg.A0B(new Runnable() { // from class: X.Axi
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8IE c8ie2 = c8ie;
                        C23106AGs c23106AGs2 = c23106AGs;
                        A9K a9k = obj3;
                        AbstractC183338Bg.A00(c8ie2.A0H).A0F("recording_starting_oc");
                        C174757qB c174757qB3 = c8ie2.A01;
                        c174757qB3.getClass();
                        c174757qB3.A0E(new AGu(a9k), c8ie2.A0E, c8ie2.A0F, c8ie2.A0D, c23106AGs2);
                    }
                })) {
                    return;
                }
                AbstractC183338Bg.A00(userSession).A0F("recording_wait_for_flash");
                return;
            }
            String format = String.format("isRecordingVideo() isRecordingVideo=%s mAwaitingFakeSelfieFlash=%s", Boolean.valueOf(c8ie.A01.A0V()), Boolean.valueOf(z));
            HashMap hashMap = new HashMap();
            hashMap.put("IgCameraViewRecordingController", format);
            hashMap.put("Already recording", ((InterfaceC179747yO) c8ie.A01.A0G.A01(InterfaceC179747yO.A00)).C06());
            AbstractC12120kG.A0I("IgCameraViewRecordingController", null, hashMap);
            AbstractC183338Bg.A00(c8ie.A0H).A0N("Already recording", A00(c8ie));
        }
    }

    public static void A02(C8IE c8ie, String str) {
        String str2;
        ShutterButton shutterButton = c8ie.A0V;
        shutterButton.setEnabled(true);
        shutterButton.setButtonActionsEnabled(true);
        InterfaceC184638He interfaceC184638He = c8ie.A05;
        if (interfaceC184638He != null) {
            str2 = interfaceC184638He.getName();
        } else {
            str2 = "";
        }
        shutterButton.A04(CancelReason.USER_CANCELLED, AnonymousClass001.A0g(str, " - ", str2));
        C8IC c8ic = c8ie.A0W;
        C0fX.A00(c8ic, c8ic.A03);
        c8ic.A00 = -1L;
        if (A04(c8ie)) {
            if (c8ie.A0X) {
                AnonymousClass835 anonymousClass835 = c8ie.A0M;
                anonymousClass835.getClass();
                anonymousClass835.setEnabled(true);
                anonymousClass835.EPa(1.0f);
            }
            c8ie.A08 = false;
        }
        if (c8ie.A05 != null) {
            c8ie.A05 = null;
            c8ie.A04.A03();
        } else {
            c8ie.A04.A03();
            C174757qB c174757qB = c8ie.A01;
            c174757qB.getClass();
            c174757qB.A0R(C05F.A01);
        }
        c8ie.A0S.E4u(new Object());
    }

    private boolean A03() {
        C190298bn A01 = C190298bn.A03.A01(this.A0H);
        if (A01 == null || !A01.A00().A0K()) {
            return false;
        }
        C1810981l c1810981l = this.A0I;
        if (AbstractC190348bs.A00((C55U) c1810981l.A08.A00, (java.util.Set) c1810981l.A09.A00)) {
            return false;
        }
        return true;
    }

    public static boolean A04(C8IE c8ie) {
        CameraAREffect cameraAREffect = c8ie.A0G.A00().A05.A09;
        if (cameraAREffect != null && cameraAREffect.A0i) {
            return true;
        }
        return false;
    }

    public final void A05() {
        boolean z = false;
        if (this.A0I.A08.A00 == C81S.A00) {
            z = true;
        }
        C193328hC c193328hC = new C193328hC(this.A0A);
        int i = 2131976635;
        if (z) {
            i = 2131965605;
        }
        c193328hC.A0A(i);
        int i2 = 2131976634;
        if (z) {
            i2 = 2131965604;
        }
        c193328hC.A09(i2);
        c193328hC.A0F(new DialogInterface.OnClickListener() { // from class: X.ANa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.getClass();
                dialogInterface.dismiss();
            }
        });
        C0fJ.A00(c193328hC.A02());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C177447ue r8) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8IE.A06(X.7ue):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, X.0yX] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.01p, X.0yX] */
    public C8IE(Activity activity, C1815283f c1815283f, UserSession userSession, C1810981l c1810981l, C1828689h c1828689h, C8ID c8id, C184658Hg c184658Hg, C184848Hz c184848Hz, AnonymousClass835 anonymousClass835, C1821786b c1821786b, AnonymousClass840 anonymousClass840, C8C0 c8c0, C8FG c8fg, C8GE c8ge, C8HG c8hg, InterfaceC1810081c interfaceC1810081c, AnonymousClass856 anonymousClass856, AnonymousClass825 anonymousClass825, C1821585z c1821585z, ShutterButton shutterButton, C8IC c8ic, long j, boolean z, boolean z2, boolean z3) {
        this.A0H = userSession;
        this.A0A = activity;
        this.A0I = c1810981l;
        this.A0S = interfaceC1810081c;
        this.A0V = shutterButton;
        this.A0W = c8ic;
        this.A0G = c1815283f;
        this.A0K = c184658Hg;
        this.A0N = c1821786b;
        this.A0P = c8c0;
        this.A0O = anonymousClass840;
        this.A0R = c8ge;
        this.A0T = anonymousClass856;
        this.A0U = anonymousClass825;
        this.A0X = z;
        this.A0c = z2;
        this.A0Y = z3;
        this.A09 = j;
        this.A0M = anonymousClass835;
        this.A0a = c8hg;
        C8IH c8ih = new C8IH(this);
        C14360o3.A0B(userSession, 1);
        this.A0F = new C8II(userSession, c1828689h, c8ih, z3);
        this.A0Q = c8fg;
        this.A0b = c1821585z;
        this.A0L = c184848Hz;
        this.A0J = c8id;
        this.A0Z = C6PX.A00(activity);
    }
}
