package X;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.G0t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36324G0t implements InterfaceC69913Ca {
    public final int A00;
    public final Object A01;

    public static Object A00(C36324G0t c36324G0t, Object obj) {
        C14360o3.A0B(obj, 0);
        return c36324G0t.A01;
    }

    public C36324G0t(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69913Ca
    public final void CKE(Intent intent) {
        switch (this.A00) {
            case 0:
                if (intent.getAction() == null) {
                    return;
                }
                android.net.Uri A03 = AbstractC08820cl.A03(intent.getAction());
                if (A03.getScheme() == null) {
                    A03 = AbstractC08820cl.A03(AnonymousClass001.A0R("file://", intent.getAction()));
                }
                ((WDF) this.A01).A01(A03);
                return;
            case 1:
            default:
                return;
            case 2:
                C14360o3.A0B(intent, 0);
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                ((CSY) this.A01).A03.Ebi(action);
                return;
        }
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
        Activity activity;
        switch (this.A00) {
            case 1:
                activity = AbstractC31171DnF.A09(A00(this, file));
                AbstractC31171DnF.A1P(activity);
                break;
            case 2:
            case 3:
            default:
                return;
            case 4:
                WeakReference weakReference = ((C3BU) A00(this, file)).A04;
                if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                    return;
                }
                break;
            case 5:
                activity = (Activity) A00(this, file);
                break;
        }
        LJR.A02(activity, file, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        Activity A09;
        Activity activity;
        switch (this.A00) {
            case 0:
                WDF wdf = (WDF) this.A01;
                if (!AbstractC86593tX.A0o(wdf.A09, intent)) {
                    return;
                }
                Fragment fragment = wdf.A0A;
                if (fragment == null) {
                    activity = wdf.A08;
                    activity.getClass();
                    C12260kU.A08(activity, intent, i);
                    return;
                }
                C12260kU.A06(fragment, intent, i);
                return;
            case 1:
                A09 = AbstractC31171DnF.A09(A00(this, intent));
                AbstractC07840b2.A00(A09, intent, i);
                return;
            case 2:
                CSY csy = (CSY) A00(this, intent);
                if (!AbstractC86593tX.A0o(csy.A01, intent)) {
                    return;
                }
                csy.A03.Cgo(intent, i);
                return;
            case 3:
                activity = AbstractC31172DnG.A0C(A00(this, intent));
                C12260kU.A08(activity, intent, i);
                return;
            case 4:
                WeakReference weakReference = ((C3BU) A00(this, intent)).A03;
                if (weakReference == null || (fragment = (Fragment) weakReference.get()) == null) {
                    return;
                }
                C12260kU.A06(fragment, intent, i);
                return;
            case 5:
                A09 = (Activity) A00(this, intent);
                AbstractC07840b2.A00(A09, intent, i);
                return;
            default:
                ((ComponentActivity) A00(this, intent)).startActivityForResult(intent, i, AbstractC166987dD.A0b());
                return;
        }
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }
}
