package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.IiF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41922IiF implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass428 A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ User A02;

    public ViewOnClickListenerC41922IiF(AnonymousClass428 anonymousClass428, InterfaceC60442pS interfaceC60442pS, User user) {
        this.A00 = anonymousClass428;
        this.A02 = user;
        this.A01 = interfaceC60442pS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-836605832);
        this.A00.D3Q(this.A02.getId(), this.A01.getModuleName());
        C0f9.A0C(749367693, A05);
    }
}
