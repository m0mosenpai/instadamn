package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ClP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLongClickListenerC28677ClP implements View.OnLongClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public ViewOnLongClickListenerC28677ClP(Activity activity, UserSession userSession, String str, List list, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = list;
        this.A02 = str;
        this.A04 = interfaceC16820sZ;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        AbstractC13880nE.A0O(view);
        C7JA.A01(this.A00, this.A01, this.A02, null, this.A03, this.A04);
        return true;
    }
}
