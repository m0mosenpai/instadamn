package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iil, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41954Iil implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;

    public ViewOnClickListenerC41954Iil(UserSession userSession, Context context, FragmentActivity fragmentActivity) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = fragmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1325681712);
        C37855Gl9.A07(this.A02, this.A00, this.A01);
        C0f9.A0C(389273835, A05);
    }
}
