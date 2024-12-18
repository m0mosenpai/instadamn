package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public final class FNO {
    public final Context A00;
    public final UserSession A01;
    public final IgTextView A02;
    public final IgdsButton A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;

    public FNO(Context context, UserSession userSession, IgTextView igTextView, IgdsButton igdsButton, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC167017dG.A1T(interfaceC16820sZ, interfaceC16820sZ2);
        this.A03 = igdsButton;
        this.A02 = igTextView;
        this.A01 = userSession;
        this.A00 = context;
        this.A05 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        C7F3 c7f3 = new C7F3(userSession);
        c7f3.A07(EnumC33519Ers.A0I);
        if (igdsButton != null) {
            ViewOnClickListenerC35683FpI.A00(igdsButton, 37, c7f3, this);
        }
    }
}
