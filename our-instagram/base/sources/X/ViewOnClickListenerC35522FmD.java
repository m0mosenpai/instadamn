package X;

import android.view.View;
import com.instagram.ui.swipenavigation.PositionConfig;

/* renamed from: X.FmD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35522FmD implements View.OnClickListener {
    public final /* synthetic */ C34963Fan A00;

    public ViewOnClickListenerC35522FmD(C34963Fan c34963Fan) {
        this.A00 = c34963Fan;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-543082756);
        InterfaceC53892dT interfaceC53892dT = this.A00.A05.A00.A0R;
        if (interfaceC53892dT != null) {
            interfaceC53892dT.FBp(new PositionConfig(null, null, null, "your_story_dialog_option", null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
        }
        C0f9.A0C(742404384, A05);
    }
}
