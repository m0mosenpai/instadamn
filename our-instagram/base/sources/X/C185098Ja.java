package X;

import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185098Ja {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C8GG A05;

    public C185098Ja(Resources resources, AbstractC59962oe abstractC59962oe, UserSession userSession, C8GG c8gg) {
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = c8gg;
        this.A02 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    }
}
