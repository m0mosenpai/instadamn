package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ojd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55428Ojd implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ OX3 A03;
    public final /* synthetic */ C55011OVw A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public ViewOnClickListenerC55428Ojd(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, OX3 ox3, C55011OVw c55011OVw, String str, String str2) {
        this.A03 = ox3;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = c55011OVw;
        this.A05 = str;
        this.A06 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(141481683);
        OX3 ox3 = this.A03;
        OX3.A00(this.A00, this.A01, this.A02, ox3, this.A04, this.A05, this.A06, 1);
        C0f9.A0C(1436755540, A05);
    }
}
