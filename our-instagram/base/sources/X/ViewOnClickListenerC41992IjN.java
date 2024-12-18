package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.IjN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41992IjN implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C30E A04;

    public ViewOnClickListenerC41992IjN(Activity activity, Context context, UserSession userSession, C38321qM c38321qM, C30E c30e) {
        this.A04 = c30e;
        this.A03 = c38321qM;
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C9C1 AuC;
        int A05 = C0f9.A05(10038193);
        C30E c30e = this.A04;
        C4QW c4qw = c30e.A05;
        if (c4qw != null && (AuC = c4qw.AuC()) != null) {
            C38921HBt c38921HBt = new C38921HBt();
            Bundle A0b = AbstractC166987dD.A0b();
            ArrayList<String> A1F = AbstractC166987dD.A1F(AbstractC001800i.A0X((Iterable) AuC.A01));
            A1F.add(0, null);
            A0b.putString("selected_audio_language_key", AuC.A02);
            A0b.putStringArrayList("available_audio_languages_key", A1F);
            A0b.putString("media_id", this.A03.A2u());
            A0b.putBoolean("is_self_view", false);
            c38921HBt.setArguments(A0b);
            c38921HBt.A01 = new J2Y(c30e);
            C189448aO A0y = AbstractC25225BEi.A0y(this.A02);
            AbstractC25226BEj.A1M(this.A01, A0y, 2131972090);
            C189478aR A00 = F86.A00(C3DN.A00.A00(this.A00));
            if (A00 != null) {
                A00.A0F(c38921HBt, A0y);
            }
        }
        C0f9.A0C(-1900329925, A05);
    }
}
