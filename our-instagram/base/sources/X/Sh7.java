package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class Sh7 {
    public final Context A00;
    public final C74103Uo A01;
    public final C4N2 A02;

    public static C4N8 A00(Sh7 sh7) {
        return AbstractC58319PtB.A0V(sh7.A00, sh7.A01, "fbns_state");
    }

    public static C4N8 A01(Sh7 sh7) {
        return AbstractC58319PtB.A0V(sh7.A00, sh7.A01, "registrations");
    }

    public static boolean A02(C4N8 c4n8, SZ0 sz0, String str) {
        try {
            String A01 = sz0.A01();
            C91M ARA = c4n8.ARA();
            ARA.E7I(str, A01);
            ARA.AIb("RegistrationState", "PreferencesManager failed to store RegistrationCacheEntry");
            return true;
        } catch (JSONException e) {
            C0K8.A0G("RegistrationState", "RegistrationCacheEntry serialization failed", e);
            return false;
        }
    }

    public final String A03(String str) {
        AbstractC62803SRx.A00(!TextUtils.isEmpty(str));
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference(null);
        C4N7 c4n7 = (C4N7) A01(this);
        C14360o3.A0B(str, 0);
        String string = c4n7.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            countDownLatch.countDown();
        } else {
            try {
                SZ0 A00 = SZ0.A00(string);
                if (!A00.A04) {
                    long currentTimeMillis = System.currentTimeMillis();
                    atomicReference.set(A00.A03);
                    long longValue = A00.A00.longValue();
                    if (longValue + 86400000 < currentTimeMillis || longValue > currentTimeMillis) {
                        atomicReference.set(null);
                    }
                }
                countDownLatch.countDown();
            } catch (JSONException e) {
                C0K8.A0G("RegistrationState", "Parse failed", e);
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            C0K8.A0L("RegistrationState", "Waiting for latch was interrupted", e2, e2);
        }
        return (String) atomicReference.get();
    }

    public Sh7(Context context, C74103Uo c74103Uo, C4N2 c4n2, C3UV c3uv) {
        this.A02 = c4n2;
        this.A00 = context;
        this.A01 = c74103Uo;
        C4N8 A00 = A00(this);
        String string = ((C4N7) A00).getString("mqtt_version", "");
        String str = c3uv.A00;
        if (!string.equals(str)) {
            A05();
            C91M ARA = A00.ARA();
            ARA.E7I("mqtt_version", str);
            ARA.AIb("RegistrationState", "PreferencesManager failed to store current mqtt build number.");
        }
    }

    public final LinkedList A04() {
        CountDownLatch A15 = AbstractC58319PtB.A15();
        LinkedList A11 = AbstractC58318PtA.A11();
        Map all = ((C4N7) A01(this)).getAll();
        LinkedList A112 = AbstractC58318PtA.A11();
        Iterator A152 = AbstractC166997dE.A15(all);
        while (A152.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A152);
            try {
                A1K.getKey();
                A1K.getValue();
                SZ0 A00 = SZ0.A00(A1K.getValue().toString());
                if (!A00.A04) {
                    A112.add(A00);
                }
            } catch (JSONException e) {
                C0K8.A0G("RegistrationState", "Parse failed", e);
            }
        }
        A11.addAll(A112);
        A15.countDown();
        try {
            A15.await();
            return A11;
        } catch (InterruptedException e2) {
            C0K8.A0L("RegistrationState", "Waiting for latch was interrupted", e2, e2);
            return A11;
        }
    }

    public final void A05() {
        C4N8 A01 = A01(this);
        C4N7 c4n7 = (C4N7) A01;
        Map all = c4n7.getAll();
        C91M ARA = A01.ARA();
        Iterator A12 = AbstractC43593JPy.A12(all);
        while (A12.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A12);
            C14360o3.A0B(A1B, 0);
            String string = c4n7.getString(A1B, "");
            if (TextUtils.isEmpty(string)) {
                C0K8.A0O("RegistrationState", "invalid value for %s", A1B);
            } else {
                try {
                    SZ0 A00 = SZ0.A00(string);
                    A00.A03 = "";
                    A00.A00 = AbstractC31173DnH.A0g();
                    try {
                        ARA.E7I(A1B, A00.A01());
                    } catch (JSONException e) {
                        C0K8.A0G("RegistrationState", "RegistrationCacheEntry serialization failed", e);
                    }
                } catch (JSONException e2) {
                    C0K8.A0G("RegistrationState", "Parse failed", e2);
                    C0K8.A0O("RegistrationState", "invalid value for %s", A1B);
                }
            }
        }
        ARA.AIb("RegistrationState", "PreferencesManager failed to store RegistrationCacheEntry");
    }

    public final void A06(InterfaceC65370Tj2 interfaceC65370Tj2, String str) {
        AbstractC62803SRx.A00(AbstractC31171DnF.A1X(str));
        String string = ((C4N7) A01(this)).getString(str, "");
        if (TextUtils.isEmpty(string)) {
            interfaceC65370Tj2.Cwz(null);
            return;
        }
        try {
            interfaceC65370Tj2.Cwz(SZ0.A00(string).A01);
        } catch (JSONException e) {
            C0K8.A0G("RegistrationState", "Parse failed", e);
            interfaceC65370Tj2.Cwz(null);
        }
    }
}
