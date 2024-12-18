package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;

/* renamed from: X.8HD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HD {
    public Drawable A00;
    public C8X3 A01;
    public File A02;
    public final float A03;
    public final Activity A04;
    public final UserSession A05;
    public final C1810981l A06;
    public final C183688Ct A07;
    public final C8HE A08;
    public final InteractiveDrawableContainer A09;
    public final ViewGroup A0A;
    public final AbstractC59962oe A0B;
    public final TargetViewSizeProvider A0C;
    public final C1813982r A0D;
    public final C1814382v A0E;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.8HE] */
    public C8HD(ViewGroup viewGroup, C1810981l c1810981l, C183688Ct c183688Ct, TargetViewSizeProvider targetViewSizeProvider, C81J c81j, C1813982r c1813982r, C1814382v c1814382v, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(interactiveDrawableContainer, 4);
        C14360o3.A0B(c1810981l, 5);
        C14360o3.A0B(targetViewSizeProvider, 6);
        this.A0A = viewGroup;
        this.A07 = c183688Ct;
        this.A09 = interactiveDrawableContainer;
        this.A06 = c1810981l;
        this.A0C = targetViewSizeProvider;
        this.A0E = c1814382v;
        this.A0D = c1813982r;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        C14360o3.A07(abstractC59962oe);
        this.A0B = abstractC59962oe;
        UserSession userSession = c81j.A0S;
        this.A05 = userSession;
        Activity activity = c81j.A05;
        this.A04 = activity;
        this.A08 = new C8HF() { // from class: X.8HE
            @Override // X.C8HF
            public final void Dq8(C183978Ee c183978Ee) {
                C14360o3.A0B(c183978Ee, 0);
                C8X3 c8x3 = C8HD.this.A01;
                if (c8x3 != null) {
                    c8x3.A00.A00(new C198308pf(c183978Ee));
                }
            }

            @Override // X.C8HF
            public final void onFailure(Exception exc) {
            }
        };
        C14360o3.A07(activity);
        this.A03 = AbstractC13880nE.A00(activity, 260.0f);
        Object obj = c1810981l.A08.A00;
        C81Q c81q = C81Q.A00;
        C14360o3.A0K(obj, c81q);
        if (((java.util.Set) c1810981l.A07.A00).contains(c81q)) {
            C14360o3.A07(userSession);
            if (C18U.A06(C06090Tz.A05, userSession, 36324166214889407L)) {
                c1810981l.A0G(new C25003B3z(this));
            }
        }
    }
}
