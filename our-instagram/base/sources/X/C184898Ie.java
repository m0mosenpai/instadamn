package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;

/* renamed from: X.8Ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184898Ie {
    public Drawable A00;
    public C8X1 A01;
    public File A02;
    public final float A03;
    public final Activity A04;
    public final UserSession A05;
    public final C183688Ct A06;
    public final C184908If A07;
    public final InteractiveDrawableContainer A08;
    public final boolean A09;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8If] */
    public C184898Ie(C183688Ct c183688Ct, C81J c81j, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(interactiveDrawableContainer, 3);
        this.A06 = c183688Ct;
        this.A08 = interactiveDrawableContainer;
        this.A05 = c81j.A0S;
        Activity activity = c81j.A05;
        this.A04 = activity;
        this.A09 = c81j.A3E;
        this.A07 = new C8HF() { // from class: X.8If
            @Override // X.C8HF
            public final void Dq8(C183978Ee c183978Ee) {
                C14360o3.A0B(c183978Ee, 0);
                C8X1 c8x1 = C184898Ie.this.A01;
                if (c8x1 != null) {
                    c8x1.A00.A00(new C198308pf(c183978Ee));
                }
            }

            @Override // X.C8HF
            public final void onFailure(Exception exc) {
            }
        };
        C14360o3.A07(activity);
        this.A03 = AbstractC13880nE.A00(activity, 234.0f);
    }

    public static final int A00(Context context, int i) {
        try {
            return context.getResources().getDimensionPixelSize(i);
        } catch (Resources.NotFoundException unused) {
            AbstractC12120kG.A0I(AnonymousClass001.A0O("BirthdaySelfieCaptureController failed to find string resource for resource id ", i), null, AbstractC06930Yk.A0E());
            return 0;
        }
    }
}
