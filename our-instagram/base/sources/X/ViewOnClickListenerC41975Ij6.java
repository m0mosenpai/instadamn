package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ij6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41975Ij6 implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC43547JLh A01;
    public final /* synthetic */ InterfaceC144586fe A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC41975Ij6(UserSession userSession, InterfaceC43547JLh interfaceC43547JLh, InterfaceC144586fe interfaceC144586fe, String str) {
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = interfaceC144586fe;
        this.A01 = interfaceC43547JLh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(638413533);
        AbstractC166987dD.A0f(AbstractC12220kQ.A01(AbstractC31171DnF.A0D(this.A03), this.A00), "ig_cg_click_story_donate_prompt").AAP("source_name", "STORY");
        this.A02.DBF(this.A01.AnG());
        C0f9.A0C(-661268143, A05);
    }
}
