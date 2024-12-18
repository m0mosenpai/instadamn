package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.See, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63179See {
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);
    public T51 A00;
    public InterfaceC65576TnA A01;
    public final AbstractC12990ll A03;
    public final List A04 = AbstractC166987dD.A1E();
    public final C83753oK A02 = new Object();

    public static void A00(AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI, String str, int i) {
        String str2;
        if (str == null) {
            if (i == 0) {
                str2 = enumC31713DwI != null ? enumC31713DwI.A01 : null;
                C14360o3.A0B(abstractC12990ll, 0);
                C63378Siq.A01(abstractC12990ll, str2);
                return;
            } else {
                str2 = enumC31713DwI != null ? enumC31713DwI.A01 : null;
                C14360o3.A0B(abstractC12990ll, 0);
                C63378Siq.A03(abstractC12990ll, str2);
                return;
            }
        }
        str2 = enumC31713DwI != null ? enumC31713DwI.A01 : null;
        C14360o3.A0B(abstractC12990ll, 0);
        C63378Siq.A02(abstractC12990ll, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.TkT] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.TkT] */
    public final /* synthetic */ void A01(Activity activity, HintRequest hintRequest, AbstractC1335861e abstractC1335861e, T51 t51, InterfaceC65457TkT interfaceC65457TkT, EnumC31713DwI enumC31713DwI) {
        if (Build.VERSION.SDK_INT < 31) {
            abstractC1335861e.getClass();
            C3U5.A03(hintRequest, "request must not be null");
            C64222T4w c64222T4w = ((RHC) abstractC1335861e.A05(SA2.A02)).A00;
            Context A03 = abstractC1335861e.A03();
            String str = c64222T4w.A00;
            C3U5.A03(A03, "context must not be null");
            C3U5.A03(hintRequest, "request must not be null");
            if (TextUtils.isEmpty(str)) {
                str = AbstractC62842STp.A00();
            } else {
                C3U5.A02(str);
            }
            ?? r4 = 2000;
            Intent putExtra = AbstractC58318PtA.A0E("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", str);
            Parcel obtain = Parcel.obtain();
            hintRequest.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
            PendingIntent activity2 = PendingIntent.getActivity(A03, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, putExtra, S79.A00 | 134217728);
            try {
                r4 = interfaceC65457TkT;
                AbstractC12990ll abstractC12990ll = this.A03;
                C60970Rcs c60970Rcs = new C60970Rcs(abstractC12990ll, r4, enumC31713DwI);
                List list = this.A04;
                synchronized (list) {
                    list.add(c60970Rcs);
                }
                activity.startIntentSenderForResult(activity2.getIntentSender(), ((AbstractC62658SKs) c60970Rcs).A00, null, 0, 0, 0);
                int A0A = AbstractC58323PtF.A0A(abstractC12990ll);
                boolean A1P = AbstractC167007dF.A1P(t51.A01, 10);
                C14360o3.A0B(abstractC12990ll, 0);
                C63378Siq.A00(null, abstractC12990ll, "bloks_reg", A0A, A1P);
            } catch (IntentSender.SendIntentException unused) {
                activity.runOnUiThread(new TQI(activity, r4, null));
                AbstractC12990ll abstractC12990ll2 = this.A03;
                C14360o3.A0B(abstractC12990ll2, 0);
                C63378Siq.A04(abstractC12990ll2, "bloks_reg", "get_signup_hint", "cannot_show_dialog");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.3oK, java.lang.Object] */
    public C63179See(AbstractC12990ll abstractC12990ll) {
        this.A03 = abstractC12990ll;
    }
}
