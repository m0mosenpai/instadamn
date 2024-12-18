package X;

import android.view.View;
import java.util.List;

/* renamed from: X.Fnt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35602Fnt implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C72q A02;
    public final /* synthetic */ List A03;

    public ViewOnClickListenerC35602Fnt(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C72q c72q, List list) {
        this.A02 = c72q;
        this.A03 = list;
        this.A00 = interfaceC11380iw;
        this.A01 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(637417580);
        C72q c72q = this.A02;
        if (c72q != null) {
            List list = this.A03;
            if (list.size() == 1) {
                c72q.A02().D2l((C44Q) AbstractC166987dD.A16(list), this.A00, "user_profile_header");
            } else {
                GBV A02 = c72q.A02();
                EnumC33379EpC enumC33379EpC = EnumC33379EpC.A03;
                A02.A08(this.A00, this.A01, enumC33379EpC, null, false);
            }
        }
        C0f9.A0C(-886876199, A05);
    }
}
