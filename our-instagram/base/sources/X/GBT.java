package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class GBT implements AnonymousClass749 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final C73D A07;
    public final JLK A08;
    public final User A09;

    @Override // X.AnonymousClass749
    public final boolean BDo() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final Drawable BEl() {
        return null;
    }

    @Override // X.AnonymousClass749
    public final boolean Bwm() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final boolean CDe() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final /* synthetic */ void Der() {
    }

    @Override // X.AnonymousClass749
    public final void D3R(boolean z) {
        this.A07.DF8(this.A08, this.A09);
    }

    public GBT(Context context, UserSession userSession, C73D c73d, JLK jlk, User user) {
        String str;
        Long B24;
        InterfaceC09390do interfaceC09390do;
        String title;
        String A0f;
        String Ap3;
        this.A05 = context;
        this.A06 = userSession;
        this.A09 = user;
        this.A08 = jlk;
        this.A07 = c73d;
        ProductCollection AyL = jlk.AyL();
        this.A02 = (AyL == null || (Ap3 = AyL.Ap3()) == null) ? "" : Ap3;
        this.A01 = ProfileBannerType.A0A.A00;
        ProductCollection AyL2 = jlk.AyL();
        this.A04 = (AyL2 == null || (title = AyL2.getTitle()) == null || (A0f = AbstractC167007dF.A0f(context, title, 2131961995)) == null) ? "" : A0f;
        if (jlk.B24() != null && (B24 = jlk.B24()) != null) {
            int longValue = (int) B24.longValue();
            if (Integer.valueOf(longValue) != null && longValue != 0) {
                long millis = TimeUnit.SECONDS.toMillis(longValue);
                String A04 = MX0.A04("MMM d", millis);
                if (DateFormat.is24HourFormat(context)) {
                    interfaceC09390do = FEY.A01;
                } else {
                    Calendar calendar = (Calendar) AbstractC166987dD.A17(FEY.A00);
                    calendar.setTime(new Date(millis));
                    if (calendar.get(12) == 0) {
                        interfaceC09390do = FEY.A02;
                    } else {
                        interfaceC09390do = FEY.A03;
                    }
                }
                String format = ((java.text.DateFormat) interfaceC09390do.getValue()).format(new Date(millis));
                C14360o3.A07(format);
                str = AbstractC31174DnI.A0t(context, A04, AbstractC31172DnG.A16(C1Q2.A02(), format), 2131964478);
                C14360o3.A07(str);
                this.A03 = str;
                this.A00 = AbstractC25232BEp.A0t(jlk.B24());
            }
        }
        str = "";
        this.A03 = str;
        this.A00 = AbstractC25232BEp.A0t(jlk.B24());
    }

    @Override // X.AnonymousClass749
    public final String AZw() {
        return this.A01;
    }

    @Override // X.AnonymousClass749
    public final long B37() {
        return this.A00;
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_shopping_bag_pano_filled_24;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_expiring_discount";
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A02;
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return this.A03;
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A04;
    }
}
