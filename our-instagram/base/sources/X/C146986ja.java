package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.6ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146986ja {
    public boolean A00;
    public final DialogInterface.OnDismissListener A01;
    public final DialogInterface.OnShowListener A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC146006hx A05;
    public final java.util.Set A06;

    public C146986ja(final DialogInterface.OnDismissListener onDismissListener, final DialogInterface.OnShowListener onShowListener, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC146006hx interfaceC146006hx) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC146006hx, 4);
        C14360o3.A0B(onDismissListener, 6);
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A05 = interfaceC146006hx;
        this.A02 = new DialogInterface.OnShowListener() { // from class: X.6jb
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.A00 = true;
                onShowListener.onShow(dialogInterface);
            }
        };
        this.A01 = new DialogInterface.OnDismissListener() { // from class: X.6jc
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.A00 = false;
                onDismissListener.onDismiss(dialogInterface);
            }
        };
        this.A06 = new HashSet();
    }
}
