package X;

import android.graphics.drawable.Drawable;
import androidx.activity.ComponentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9R4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9R4 {
    public AnonymousClass195 A00;
    public final Drawable A01;
    public final Drawable A02;
    public final ComponentActivity A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final InterfaceC09390do A06;

    public C9R4(ComponentActivity componentActivity, UserSession userSession, IgTextView igTextView) {
        AbstractC167017dG.A1Q(componentActivity, igTextView);
        this.A03 = componentActivity;
        this.A04 = userSession;
        this.A05 = igTextView;
        this.A06 = new C60842q8(new B8Q(componentActivity, 17), new B8Q(this, 18), new B61(48, null, componentActivity), new C0YZ(C208779Ll.class));
        this.A01 = AbstractC166997dE.A0L(this.A05).getDrawable(R.drawable.rollcall_timer_background);
        this.A02 = AbstractC166997dE.A0L(this.A05).getDrawable(R.drawable.rollcall_timer_urgent_background);
    }
}
