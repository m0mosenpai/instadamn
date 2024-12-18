package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.R;
import com.facebook.react.uimanager.UIManagerHelper;

/* renamed from: X.Sk9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnKeyListenerC63430Sk9 implements DialogInterface.OnKeyListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnKeyListenerC63430Sk9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1O(dialogInterface, keyEvent);
                if (keyEvent.getAction() == 1) {
                    if (i != 4 && i != 111) {
                        Context context = ((View) this.A01).getContext();
                        C14360o3.A0C(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        Activity A01 = ((Q21) context).A01();
                        if (A01 != null) {
                            return A01.onKeyUp(i, keyEvent);
                        }
                        return false;
                    }
                    InterfaceC65230TgM interfaceC65230TgM = ((Q4V) this.A01).A02;
                    if (interfaceC65230TgM != null) {
                        C64143T0t c64143T0t = (C64143T0t) interfaceC65230TgM;
                        c64143T0t.A01.APn(new Sb5(UIManagerHelper.A00(c64143T0t.A00), c64143T0t.A02.getId()));
                        return true;
                    }
                    throw AbstractC166987dD.A14("onRequestClose callback must be set if back key is expected to close the modal");
                }
                return false;
            case 1:
                if (i == 4 && keyEvent.getRepeatCount() == 0) {
                    C58759Q7o c58759Q7o = (C58759Q7o) this.A01;
                    InterfaceC08430c6 A0O = c58759Q7o.getChildFragmentManager().A0O(R.id.auth_container_view);
                    if ((A0O instanceof InterfaceC65382TjF) && ((InterfaceC65382TjF) A0O).onBackPressed()) {
                        return true;
                    }
                    c58759Q7o.AVf(null, null, new RuntimeException());
                    return true;
                }
                return false;
            case 2:
                Activity activity = (Activity) this.A01;
                if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
                    activity.finish();
                    return false;
                }
                return false;
            default:
                if (i == 4) {
                    return true;
                }
                return false;
        }
    }
}
