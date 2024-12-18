package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.FnH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35565FnH implements View.OnClickListener {
    public final /* synthetic */ C34963Fan A00;
    public final /* synthetic */ User A01;

    public ViewOnClickListenerC35565FnH(C34963Fan c34963Fan, User user) {
        this.A00 = c34963Fan;
        this.A01 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1279296900);
        C34451FGp c34451FGp = this.A00.A05;
        String id = this.A01.getId();
        C69453Af c69453Af = c34451FGp.A00;
        C69453Af.A03(c69453Af, id, c69453Af.getModuleName());
        C0f9.A0C(-213083956, A05);
    }
}
