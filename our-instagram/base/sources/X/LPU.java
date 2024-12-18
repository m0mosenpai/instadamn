package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes8.dex */
public final class LPU implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ L9S A05;
    public final /* synthetic */ String A06;

    public LPU(Activity activity, Context context, Bundle bundle, InterfaceC11380iw interfaceC11380iw, UserSession userSession, L9S l9s, String str) {
        this.A02 = bundle;
        this.A06 = str;
        this.A04 = userSession;
        this.A00 = activity;
        this.A01 = context;
        this.A05 = l9s;
        this.A03 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1195719193);
        Bundle bundle = this.A02;
        String str = this.A06;
        bundle.putString("target_user_id", str);
        AbstractC31176DnK.A0d(this.A00, bundle, this.A04, ModalActivity.class, "recs_from_friends_sender").A0C(this.A01);
        AbstractC003100w.A0k(10, str);
        this.A03.getModuleName();
        C0f9.A0C(1578127444, A05);
    }
}
