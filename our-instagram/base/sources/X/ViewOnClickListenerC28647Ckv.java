package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.Ckv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28647Ckv implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C206189Bb A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public ViewOnClickListenerC28647Ckv(Context context, C206189Bb c206189Bb, UserSession userSession, User user) {
        this.A00 = context;
        this.A03 = user;
        this.A01 = c206189Bb;
        this.A02 = userSession;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ProductType productType;
        int A05 = C0f9.A05(-1757462867);
        Context context = this.A00;
        User user = this.A03;
        String username = user.getUsername();
        if (this.A01.A01) {
            productType = ProductType.CLIPS;
        } else {
            productType = ProductType.FEED;
        }
        AbstractC35234FgS.A02(context, null, productType, username);
        AbstractC99684dl.A00(this.A02).A00(Long.parseLong(user.getId()));
        C0f9.A0C(1366608844, A05);
    }
}
