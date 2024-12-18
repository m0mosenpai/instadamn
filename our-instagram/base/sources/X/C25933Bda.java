package X;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bda, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25933Bda extends C3OO {
    public final Drawable A00;
    public final LinearLayout A01;
    public final UserSession A02;
    public final /* synthetic */ C27066Bwp A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25933Bda(LinearLayout linearLayout, UserSession userSession, C27066Bwp c27066Bwp) {
        super(linearLayout);
        C14360o3.A0B(userSession, 3);
        this.A03 = c27066Bwp;
        this.A01 = linearLayout;
        this.A02 = userSession;
        this.A00 = AbstractC162807Qr.A00();
    }
}
