package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.OnV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55644OnV implements InterfaceC1128057m {
    public final View A00;

    @Override // X.InterfaceC1128057m
    public final InterfaceC16820sZ COm(AbstractC1127657i abstractC1127657i) {
        ViewOnAttachStateChangeListenerC55359OiL viewOnAttachStateChangeListenerC55359OiL = new ViewOnAttachStateChangeListenerC55359OiL(0, new Object(), abstractC1127657i, this);
        abstractC1127657i.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC55359OiL);
        C55547Olh c55547Olh = new C55547Olh(abstractC1127657i);
        AbstractC105064oM.A00(abstractC1127657i).A00.add(c55547Olh);
        return new C57261Pbj(8, viewOnAttachStateChangeListenerC55359OiL, c55547Olh, abstractC1127657i);
    }

    public C55644OnV(Window window) {
        View decorView = window.getDecorView();
        C14360o3.A07(decorView);
        this.A00 = decorView;
    }
}
