package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.FkG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC35459FkG implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnDismissListenerC35459FkG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC77483dY interfaceC77483dY;
        switch (this.A00) {
            case 0:
                if (((C14510oO) this.A01).A00) {
                    return;
                }
                C18920wW c18920wW = (C18920wW) this.A02;
                Integer num = C05F.A01;
                C14360o3.A0B(c18920wW, 0);
                F1U.A00(c18920wW, new C57749Pjc(num, 49));
                return;
            case 1:
                AbstractC33619EtV abstractC33619EtV = ((EUR) this.A01).A00;
                if (abstractC33619EtV == null) {
                    return;
                }
                abstractC33619EtV.A00((EDA) this.A02);
                return;
            case 2:
            default:
                interfaceC77483dY = (InterfaceC77483dY) this.A01;
                if (interfaceC77483dY == null) {
                    return;
                }
                interfaceC77483dY.DHr((User) this.A02);
                return;
            case 3:
                interfaceC77483dY = (InterfaceC77483dY) this.A01;
                interfaceC77483dY.DHr((User) this.A02);
                return;
        }
    }
}
