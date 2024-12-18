package X;

import android.view.View;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.ASn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23252ASn implements View.OnFocusChangeListener {
    public final /* synthetic */ C8LD A00;

    public ViewOnFocusChangeListenerC23252ASn(C8LD c8ld) {
        this.A00 = c8ld;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C8LD c8ld = this.A00;
        C8LD.A08(c8ld);
        ConstrainedEditText constrainedEditText = c8ld.A0D;
        constrainedEditText.getClass();
        AbstractC13880nE.A0u(constrainedEditText, new CallableC24924B0x(this, 7));
        if (z) {
            C8LD.A0H(c8ld, C05F.A0N);
            return;
        }
        if (!C8LD.A0I(c8ld)) {
            C6RB c6rb = c8ld.A0F;
            if (c6rb != null) {
                c8ld.A0c.A0Q(c6rb);
                c8ld.A0F = null;
            }
            C8LD.A05(c8ld);
            return;
        }
        ConstrainedEditText constrainedEditText2 = c8ld.A0D;
        constrainedEditText2.getClass();
        if (constrainedEditText2.isLaidOut()) {
            C8LD.A04(c8ld);
            return;
        }
        ConstrainedEditText constrainedEditText3 = c8ld.A0D;
        constrainedEditText3.getClass();
        constrainedEditText3.addOnLayoutChangeListener(new LQ9(this, 5));
    }
}
