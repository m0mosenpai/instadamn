package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Lu2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49489Lu2 implements InterfaceC58152PqH {
    @Override // X.InterfaceC58152PqH
    public void onButtonClick(View view) {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        String str;
        if (this instanceof KYM) {
            KYM kym = (KYM) this;
            if (kym.A08.A00) {
                C49043LmV c49043LmV = kym.A00;
                C7TG A00 = AbstractC165967bO.A00(c49043LmV.A05);
                C3o9 c3o9 = (C3o9) AbstractC31172DnG.A0y(c49043LmV.A0t);
                MessageIdentifier messageIdentifier = c49043LmV.A00;
                if (messageIdentifier != null) {
                    str = messageIdentifier.A01;
                } else {
                    str = null;
                }
                A00.A0L(c3o9, str, kym.A06, kym.A05, kym.A09);
            }
        }
    }
}
