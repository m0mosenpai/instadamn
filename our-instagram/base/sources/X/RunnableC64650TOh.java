package X;

import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.TOh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64650TOh implements Runnable {
    public final /* synthetic */ C64265T6o A00;
    public final /* synthetic */ C5KS A01;

    public RunnableC64650TOh(C64265T6o c64265T6o, C5KS c5ks) {
        this.A00 = c64265T6o;
        this.A01 = c5ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C64265T6o c64265T6o = this.A00;
            InterfaceC65267Tgx interfaceC65267Tgx = c64265T6o.A00;
            Object A06 = this.A01.A06();
            T7F t7f = (T7F) interfaceC65267Tgx;
            FirebaseInstanceId firebaseInstanceId = t7f.A00;
            String str = t7f.A01;
            String str2 = t7f.A02;
            String str3 = (String) A06;
            C62948SYq c62948SYq = FirebaseInstanceId.A08;
            String A05 = firebaseInstanceId.A04.A05();
            synchronized (c62948SYq) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put("token", str3);
                    A0q.put("appVersion", A05);
                    A0q.put("timestamp", currentTimeMillis);
                    String obj = A0q.toString();
                    if (obj != null) {
                        SharedPreferences.Editor edit = c62948SYq.A01.edit();
                        StringBuilder A15 = AbstractC58320PtC.A15(str2, AbstractC58319PtB.A05("") + 4 + AbstractC58319PtB.A05(str));
                        A15.append("");
                        A15.append("|T|");
                        A15.append(str);
                        edit.putString(MSZ.A0u("|", str2, A15), obj);
                        edit.commit();
                    }
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e);
                    android.util.Log.w("FirebaseInstanceId", MSZ.A0u("Failed to encode token: ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 24)));
                }
            }
            C5KS A0Y = AbstractC58319PtB.A0Y(new SC6(str3));
            Executor executor = AbstractC58437PvG.A01;
            A0Y.A04(c64265T6o, executor);
            A0Y.A0B(c64265T6o, executor);
            A0Y.A08(c64265T6o, executor);
        } catch (TXJ e2) {
            e = e2;
            boolean z = e.getCause() instanceof Exception;
            C64265T6o c64265T6o2 = this.A00;
            if (z) {
                e = (Exception) e.getCause();
            }
            c64265T6o2.onFailure(e);
        } catch (CancellationException unused) {
            this.A00.D1x();
        } catch (Exception e3) {
            this.A00.onFailure(e3);
        }
    }
}
