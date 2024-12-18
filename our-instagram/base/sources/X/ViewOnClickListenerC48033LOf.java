package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LOf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48033LOf implements View.OnClickListener {
    public final /* synthetic */ C7S9 A00;
    public final /* synthetic */ MessageIdentifier A01;

    public ViewOnClickListenerC48033LOf(C7S9 c7s9, MessageIdentifier messageIdentifier) {
        this.A00 = c7s9;
        this.A01 = messageIdentifier;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1102083242);
        ((InterfaceC164967Zl) this.A00.A02).Eku(this.A01);
        C0f9.A0C(604562675, A05);
    }
}
