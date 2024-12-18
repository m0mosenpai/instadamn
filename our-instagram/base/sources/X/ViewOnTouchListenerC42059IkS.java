package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IkS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42059IkS implements View.OnTouchListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ InterfaceC144936gD A04;

    public ViewOnTouchListenerC42059IkS(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, InterfaceC144936gD interfaceC144936gD) {
        this.A04 = interfaceC144936gD;
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c41181vS;
        this.A01 = interfaceC11380iw;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A04.Dsv(this.A00, this.A01, this.A02, this.A03);
        }
        return true;
    }
}
