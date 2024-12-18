package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;

/* renamed from: X.8Ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184918Ig {
    public Drawable A00;
    public C8X2 A01;
    public File A02;
    public final float A03;
    public final Activity A04;
    public final UserSession A05;
    public final C183688Ct A06;
    public final C184928Ih A07;
    public final InteractiveDrawableContainer A08;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.8Ih] */
    public C184918Ig(C183688Ct c183688Ct, C81J c81j, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(interactiveDrawableContainer, 3);
        this.A06 = c183688Ct;
        this.A08 = interactiveDrawableContainer;
        this.A05 = c81j.A0S;
        Activity activity = c81j.A05;
        this.A04 = activity;
        this.A07 = new C8HF() { // from class: X.8Ih
            @Override // X.C8HF
            public final void Dq8(C183978Ee c183978Ee) {
                C14360o3.A0B(c183978Ee, 0);
                C8X2 c8x2 = C184918Ig.this.A01;
                if (c8x2 != null) {
                    c8x2.A00.A00(new C198308pf(c183978Ee));
                }
            }

            @Override // X.C8HF
            public final void onFailure(Exception exc) {
            }
        };
        C14360o3.A07(activity);
        this.A03 = AbstractC13880nE.A00(activity, 144.0f);
    }
}
