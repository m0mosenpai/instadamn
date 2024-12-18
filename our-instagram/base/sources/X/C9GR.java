package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

/* renamed from: X.9GR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9GR {
    public static Toast A00;
    public static WeakReference A01;

    public static final C210679Tk A02(Context context, CharSequence charSequence, String str, int i) {
        C210679Tk c210679Tk = null;
        if (!C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            C0K8.A0E(MSV.A00(794), "The toast should be created on main thread");
        } else {
            if (!(context instanceof Activity)) {
                if (context != null) {
                    context = context.getApplicationContext();
                    if (context == null) {
                        return null;
                    }
                }
            }
            if (charSequence != null && A0H(context)) {
                if (str != null) {
                    C41451vu.A01.E4s(new C3KE(charSequence.toString(), str));
                    C1KM c1km = C1KM.A09;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append((Object) charSequence);
                    A1C.append(':');
                    String A0x = AbstractC166997dE.A0x(str, A1C);
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    A1C2.append("toast: ");
                    A1C2.append((Object) charSequence);
                    A1C2.append(", cat: ");
                    c1km.A0L(A0x, AbstractC166997dE.A0x(str, A1C2), ((C1KP) C1KM.A00()).A01);
                }
                c210679Tk = C210679Tk.A01.A00(context, charSequence, i);
                if (Build.VERSION.SDK_INT < 30) {
                    c210679Tk.setGravity(17, 0, 0);
                    return c210679Tk;
                }
            }
        }
        return c210679Tk;
    }

    public static final void A04(Context context) {
        A01(context, null, 2131974293, 0);
    }

    public static final void A06(Context context, int i) {
        A01(context, null, i, 1);
    }

    public static final void A07(Context context, int i) {
        A01(context, null, i, 0);
    }

    public static final void A08(Context context, int i, int i2) {
        A01(context, null, i, i2);
    }

    public static final void A09(Context context, CharSequence charSequence) {
        A03(context, charSequence, null, 0);
    }

    public static final void A0F(Context context, String str, int i) {
        A01(context, str, i, 0);
    }

    public static final Toast A01(Context context, String str, int i, int i2) {
        if (context != null && A0H(context)) {
            return A03(context, context.getString(i), str, i2);
        }
        return null;
    }

    public static final C210679Tk A03(Context context, CharSequence charSequence, String str, int i) {
        boolean z;
        Toast toast;
        UserSession userSession;
        AnonymousClass925 anonymousClass925 = AnonymousClass926.A00;
        if (anonymousClass925 != null && (userSession = anonymousClass925.A00.A00) != null) {
            z = AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36325944331548185L).booleanValue();
        } else {
            z = false;
        }
        C210679Tk c210679Tk = null;
        Toast toast2 = A00;
        if (z) {
            if (toast2 != null) {
                toast2.cancel();
            }
            A00 = null;
            WeakReference weakReference = A01;
            if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
                toast.cancel();
            }
        } else if (toast2 != null) {
            toast2.cancel();
        }
        C210679Tk A02 = A02(context, charSequence, str, i);
        if (A02 != null) {
            A02.show();
            c210679Tk = A02;
        }
        if (z) {
            A01 = new WeakReference(c210679Tk);
            return c210679Tk;
        }
        A00 = c210679Tk;
        return c210679Tk;
    }

    @Deprecated(message = "Please refrain from using this unless you are trying to display a toast beyond fragment/activity detach")
    public static final void A0G(CharSequence charSequence) {
        A09(AbstractC12290kX.A00, charSequence);
    }

    public static final boolean A0H(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                return true;
            }
            return false;
        }
        if (context != null) {
            return true;
        }
        return false;
    }

    public static final Toast A00(Context context, CharSequence charSequence, String str, int i) {
        return A03(context, charSequence, str, i);
    }

    public static final void A05(Context context) {
        A07(context, 2131974293);
    }

    public static final void A0A(Context context, String str) {
        A01(context, str, 2131961880, 0);
    }

    public static final void A0B(Context context, String str) {
        A01(context, str, 2131974293, 0);
    }

    public static final void A0C(Context context, String str) {
        A01(context, str, 2131976159, 0);
    }

    public static final void A0D(Context context, String str) {
        A01(context, str, 2131968430, 0);
    }

    public static final void A0E(Context context, String str) {
        A01(context, str, 2131972429, 0);
    }
}
