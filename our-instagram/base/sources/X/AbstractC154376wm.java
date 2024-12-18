package X;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;

/* renamed from: X.6wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154376wm {
    public static final InterfaceC154386wo A00(ViewGroup viewGroup, String str, int i) {
        int i2;
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            i2 = R.layout.profile_icon_tab_view_layout;
        } else if (str.equals("text")) {
            i2 = R.layout.profile_text_tab_view_layout;
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0R("Could not create tab view for tab view type ", str));
        }
        KeyEvent.Callback inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.profile.intf.tabs.ProfileTabView");
        InterfaceC154386wo interfaceC154386wo = (InterfaceC154386wo) inflate;
        interfaceC154386wo.setActiveColor(i);
        return interfaceC154386wo;
    }
}
