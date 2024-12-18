package X;

import android.content.Context;
import android.widget.RemoteViews;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TGr implements C0JG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ RemoteViews A02;

    public TGr(Context context, RemoteViews remoteViews, int i) {
        this.A02 = remoteViews;
        this.A01 = context;
        this.A00 = i;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
        this.A02.setTextViewText(R.id.title_text, AbstractC167007dF.A0f(this.A01, C17060sy.A01.A01(userSession).getUsername(), this.A00));
        interfaceC03960Jm.AIn(null);
    }
}
