package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07980bI extends C0P5 {
    public InterfaceC07800ax A00 = null;
    public final C0OK A01;
    public final String A02;
    public final List A03;
    public final java.util.Set A04;

    public final void A0C(Context context, Intent intent) {
        if (intent.getPackage() == null && intent.getComponent() == null && intent.getSelector() == null) {
            StrictMode.noteSlowCall("Implicit intents using ScopedIntentLauncher queries all packages.");
        }
        C08020bN A07 = A07(context, intent);
        C0OK c0ok = this.A01;
        List<Intent> A0F = c0ok.A0F(context, intent, this.A02);
        if (!A0F.isEmpty()) {
            for (Intent intent2 : A0F) {
                A0E(context, intent, intent2, A07);
                try {
                    if (Build.VERSION.SDK_INT >= 34) {
                        BroadcastOptions makeBasic = BroadcastOptions.makeBasic();
                        makeBasic.setShareIdentityEnabled(c0ok.A0G());
                        context.sendBroadcast(intent2, null, makeBasic.toBundle());
                    } else {
                        context.sendBroadcast(intent2, null);
                    }
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof DeadObjectException)) {
                        throw e;
                    }
                }
            }
        }
    }

    public final void A0E(Context context, Intent intent, Intent intent2, C08020bN c08020bN) {
        if (context != null && c08020bN != null) {
            List<InterfaceC07990bJ> list = this.A03;
            if (!list.isEmpty()) {
                Intent intent3 = new Intent(intent);
                Intent intent4 = new Intent(intent2);
                for (InterfaceC07990bJ interfaceC07990bJ : list) {
                    try {
                        Integer A0E = this.A01.A0E();
                        if (interfaceC07990bJ.Ej2(context, intent3, A0E) || interfaceC07990bJ.Ej2(context, intent4, A0E)) {
                            interfaceC07990bJ.Cw5(context, intent3, intent4, c08020bN, A0E);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public final boolean A0F(Activity activity, Intent intent, int i) {
        if (activity == null) {
            return false;
        }
        C08020bN A07 = A07(activity, intent);
        C0OK c0ok = this.A01;
        Intent A0C = c0ok.A0C(activity, intent, this.A02);
        if (A0C == null) {
            return false;
        }
        A03(activity, this);
        A0E(activity, intent, A0C, A07);
        activity.startActivityForResult(A0C, i, A02(null, c0ok));
        return true;
    }

    public static Intent A00(Context context, Intent intent, C07980bI c07980bI) {
        Intent A0C = c07980bI.A01.A0C(context, intent, c07980bI.A02);
        if (A0C == null) {
            return null;
        }
        A03(context, c07980bI);
        return A0C;
    }

    public static Bundle A02(Bundle bundle, C0OK c0ok) {
        if (Build.VERSION.SDK_INT >= 34) {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            makeBasic.setShareIdentityEnabled(c0ok.A0G());
            Bundle bundle2 = makeBasic.toBundle();
            if (bundle == null) {
                return bundle2;
            }
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    public static void A03(Context context, C07980bI c07980bI) {
        if (context != null) {
            java.util.Set set = c07980bI.A04;
            if (!set.isEmpty()) {
                synchronized (set) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    public C07980bI A06(String str) {
        return new C07980bI(this.A01, str, this.A03, this.A04);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.0bN] */
    public final C08020bN A07(Context context, Intent intent) {
        if (context != null) {
            List list = this.A03;
            if (!list.isEmpty()) {
                if (TextUtils.isEmpty(intent.getStringExtra("MSF_INTENT_METADATA_ID"))) {
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    String encodeToString = Base64.encodeToString(bArr, 8);
                    long currentTimeMillis = System.currentTimeMillis();
                    String packageName = context.getPackageName();
                    intent.putExtra("MSF_INTENT_METADATA_ID", encodeToString);
                    intent.putExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", currentTimeMillis);
                    intent.putExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME", packageName);
                } else {
                    intent.getLongExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", -1L);
                    intent.getStringExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME");
                }
                ?? obj = new Object();
                new Intent(intent);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC07990bJ) it.next()).Ej2(context, intent, this.A01.A0E());
                    } catch (Exception unused) {
                    }
                }
                return obj;
            }
        }
        return null;
    }

    public C07980bI(C0OK c0ok, String str, List list, java.util.Set set) {
        this.A01 = c0ok;
        this.A04 = set;
        this.A03 = list;
        this.A02 = str;
    }

    @Override // X.C0P5
    public final boolean A04(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        C08020bN A07 = A07(context, intent);
        Intent A0D = this.A01.A0D(context, intent, this.A02);
        if (A0D == null) {
            return false;
        }
        A0E(context, intent, A0D, A07);
        return context.bindService(A0D, serviceConnection, 513);
    }

    public final ComponentName A05(Context context, Intent intent) {
        C08020bN A07 = A07(context, intent);
        Intent A0D = this.A01.A0D(context, intent, this.A02);
        if (A0D == null) {
            return null;
        }
        A0E(context, intent, A0D, A07);
        return context.startService(A0D);
    }

    public final void A08(Activity activity, Context context, Intent intent, View view) {
        C08020bN A07 = A07(context, intent);
        Intent A00 = A00(context, intent, this);
        if (A00 != null) {
            A0E(context, intent, A00, A07);
            C35204Ffw A002 = C35204Ffw.A00(activity, view);
            context.startActivity(A00, A02(A002.A02(), this.A01));
        }
    }

    public final void A09(Activity activity, Context context, Intent intent, C3AY... c3ayArr) {
        C08020bN A07 = A07(context, intent);
        Intent A00 = A00(context, intent, this);
        if (A00 != null) {
            A0E(context, intent, A00, A07);
            C35204Ffw A01 = C35204Ffw.A01(activity, c3ayArr);
            context.startActivity(A00, A02(A01.A02(), this.A01));
        }
    }

    public final void A0A(Activity activity, Intent intent, Fragment fragment, C3AY[] c3ayArr, int i) {
        Context context = fragment.getContext();
        C08020bN A07 = A07(context, intent);
        Intent A0C = this.A01.A0C(context, intent, this.A02);
        if (A0C != null) {
            A03(context, this);
            A0E(context, intent, A0C, A07);
            fragment.startActivityForResult(A0C, i, C35204Ffw.A01(activity, c3ayArr).A02());
        }
    }

    public final void A0B(Context context, Intent intent) {
        C08020bN A07 = A07(context, intent);
        Intent A0D = this.A01.A0D(context, intent, this.A02);
        if (A0D != null) {
            A0E(context, intent, A0D, A07);
            context.startForegroundService(A0D);
        }
    }

    public final void A0D(Context context, Intent intent) {
        C08020bN A07 = A07(context, intent);
        Intent A0D = this.A01.A0D(context, intent, this.A02);
        if (A0D != null) {
            A0E(context, intent, A0D, A07);
            context.stopService(A0D);
        }
    }

    public boolean A0G(Context context, Intent intent) {
        C08020bN A07 = A07(context, intent);
        Intent A00 = A00(context, intent, this);
        if (A00 == null) {
            return false;
        }
        if (C0P5.A01(context, intent)) {
            this.A01.A01.EH9("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        A0E(context, intent, A00, A07);
        context.startActivity(A00, A02(null, this.A01));
        return true;
    }

    public final boolean A0H(Intent intent, Fragment fragment, int i) {
        Context context = fragment.getContext();
        if (context == null) {
            return false;
        }
        C08020bN A07 = A07(context, intent);
        C0OK c0ok = this.A01;
        Intent A0C = c0ok.A0C(context, intent, this.A02);
        if (A0C == null) {
            return false;
        }
        A03(context, this);
        A0E(context, intent, A0C, A07);
        fragment.startActivityForResult(A0C, i, A02(null, c0ok));
        return true;
    }
}
