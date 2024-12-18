package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cj3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC28571Cj3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public DialogInterfaceOnDismissListenerC28571Cj3(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = str;
        this.A03 = interfaceC16820sZ;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        UserSession userSession = this.A01;
        C22C A01 = AnonymousClass229.A01(userSession);
        A01.A1R(((C22F) A01).A04.A0C, "META_CLOUD_ALBUM_NUX_DISMISS");
        AbstractC208329Jr.A07(this.A00, userSession, C05F.A01, this.A02);
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
