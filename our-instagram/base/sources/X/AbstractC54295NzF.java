package X;

import android.content.Context;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.NzF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54295NzF {
    public static final void A00(IgdsBottomButtonLayout igdsBottomButtonLayout, OCY ocy) {
        Context A06 = AbstractC31173DnH.A06(igdsBottomButtonLayout, 0);
        igdsBottomButtonLayout.setPrimaryAction(A06.getString(ocy.A00), ocy.A02);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        igdsBottomButtonLayout.setSecondaryAction(A06.getString(ocy.A01), new ViewOnClickListenerC55463OkI(ocy, 18));
    }
}
