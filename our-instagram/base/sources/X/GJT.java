package X;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes6.dex */
public final class GJT implements XBW {
    public final int A00;
    public final Object A01;

    public GJT(Context context, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = context;
        } else {
            this.A01 = context;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XBW
    public final void EL9(int i) {
        InterfaceC16820sZ interfaceC16820sZ;
        String str;
        Object obj;
        Activity activity;
        switch (this.A00) {
            case 0:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return;
            case 1:
                obj = (Context) this.A01;
                activity = (Activity) obj;
                activity.finish();
                return;
            case 2:
                Context context = (Context) this.A01;
                switch (i) {
                    case 0:
                        str = "Unknown";
                        break;
                    case 1:
                        str = "Bloks dismiss action";
                        break;
                    case 2:
                        str = "Android OS back";
                        break;
                    case 3:
                        str = "Swipe to dismiss";
                        break;
                    case 4:
                        str = "Tap outside to dismiss";
                        break;
                    case 5:
                        str = "Accessibility action";
                        break;
                    default:
                        str = "Native loading screen cancel button";
                        break;
                }
                C9GR.A09(context, AnonymousClass001.A0R("Native dismiss callback called ", str));
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                obj = this.A01;
                activity = (Activity) obj;
                activity.finish();
                return;
            case 4:
                activity = ((C35229FgM) this.A01).A0B;
                activity.finish();
                return;
            case 8:
                interfaceC16820sZ = ((CPZ) this.A01).A00.A04;
                interfaceC16820sZ.invoke();
                return;
        }
    }

    public GJT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
