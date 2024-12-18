package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35589Fng implements View.OnClickListener {
    public final /* synthetic */ EnumC33473Er8 A00;
    public final /* synthetic */ C7I9 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC35589Fng(EnumC33473Er8 enumC33473Er8, C7I9 c7i9, String str, String str2) {
        this.A01 = c7i9;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = enumC33473Er8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1703578637);
        C7I9 c7i9 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        C7I9.A00(this.A00, c7i9, str, str2);
        C35157Fez c35157Fez = C35157Fez.A00;
        FragmentActivity fragmentActivity = c7i9.A01;
        AbstractC31171DnF.A1P(fragmentActivity);
        c35157Fez.A02(fragmentActivity, c7i9.A02, c7i9.A03, AbstractC111324zv.A00(102), str, str2, null, "direct_thread_navbar_button", null);
        C0f9.A0C(-77231503, A05);
    }
}
