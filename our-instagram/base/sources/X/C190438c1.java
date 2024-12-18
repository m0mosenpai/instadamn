package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.8c1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190438c1 {
    public final UserSession A00;
    public final IgdsSwitch A01;

    public C190438c1(View view, UserSession userSession, int i) {
        C14360o3.A0B(view, 2);
        this.A00 = userSession;
        view.setVisibility(0);
        View requireViewById = view.requireViewById(R.id.sticker_setting_toggle_text);
        C14360o3.A07(requireViewById);
        ((TextView) requireViewById).setText(i);
        IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.sticker_setting_toggle);
        this.A01 = igdsSwitch;
        igdsSwitch.A07 = new InterfaceC190658cN() { // from class: X.7vB
            @Override // X.InterfaceC190658cN
            public final boolean onToggle(boolean z) {
                int i2;
                UserSession userSession2 = C190438c1.this.A00;
                AbstractC23021Ah.A00(userSession2).A1C(z);
                C22C A01 = AnonymousClass229.A01(userSession2);
                if (z) {
                    i2 = 806;
                } else {
                    i2 = 807;
                }
                A01.A1R(EnumC50631MWs.A0J, MSV.A00(i2));
                return true;
            }
        };
    }
}
