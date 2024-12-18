package X;

import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.LDk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47890LDk {
    public static final int[] A00 = {R.id.bottom_context, R.id.megaphone_social_context_facepile, R.id.megaphone_social_context_text, R.id.button_placeholder};

    public static final void A00(ViewStub viewStub, InterfaceC50487MQp interfaceC50487MQp, KXR kxr) {
        C14360o3.A0B(interfaceC50487MQp, 2);
        viewStub.setLayoutResource(R.layout.generic_v3_megaphone);
        viewStub.setOnInflateListener(new ViewStubOnInflateListenerC48088LQo(0, interfaceC50487MQp, kxr));
    }
}
