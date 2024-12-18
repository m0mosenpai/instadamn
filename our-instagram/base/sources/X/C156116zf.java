package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156116zf extends AbstractC33567Esf {
    public Integer A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C23031Ai A04;
    public final C156106ze A05;
    public final InterfaceC1119153d A06;
    public final User A07;
    public final boolean A08;

    public C156116zf(Context context, FragmentActivity fragmentActivity, UserSession userSession, C156106ze c156106ze, User user, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A07 = user;
        this.A08 = z;
        this.A02 = fragmentActivity;
        this.A05 = c156106ze;
        this.A00 = C05F.A0C;
        this.A06 = new InterfaceC1119153d() { // from class: X.6zg
            @Override // X.InterfaceC1119153d
            public final /* synthetic */ void D00() {
            }

            @Override // X.InterfaceC1119153d
            public final void Czx() {
                C1571673v c1571673v = C1571673v.A00;
                C156116zf c156116zf = C156116zf.this;
                UserSession userSession2 = c156116zf.A03;
                c1571673v.A0E(userSession2, EnumC1571773w.A05, C156116zf.A00(c156116zf.A00), "dismiss_highlights_nux_bottomsheet", userSession2.userId, null);
                c156116zf.A05.A00.A0E();
            }
        };
        this.A04 = AbstractC23021Ah.A00(userSession);
    }

    public static final List A01(String str) {
        try {
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            return AbstractC001800i.A0g((Iterable) c73773Sh.A00(str, AbstractC192158fG.A02(AbstractC15410pw.A01(List.class, new C18210v6(C05F.A00, AbstractC15410pw.A00(Integer.TYPE))), c73773Sh.A02)), new B0P());
        } catch (AnonymousClass403 unused) {
            return C16930sl.A00;
        }
    }

    public static final void A02(C156116zf c156116zf) {
        C1571673v c1571673v = C1571673v.A00;
        UserSession userSession = c156116zf.A03;
        c1571673v.A0E(userSession, EnumC1571773w.A05, A00(c156116zf.A00), "impression_highlights_nux_bottomsheet", userSession.userId, null);
    }

    public static final void A03(C156116zf c156116zf, boolean z) {
        String str;
        C1571673v c1571673v = C1571673v.A00;
        UserSession userSession = c156116zf.A03;
        String A00 = A00(c156116zf.A00);
        if (z) {
            str = "tap_highlights_nux_bottomsheet_primary_button";
        } else {
            str = "tap_highlights_nux_bottomsheet_secondary_button";
        }
        c1571673v.A0E(userSession, EnumC1571773w.A05, A00, str, userSession.userId, null);
    }

    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return "";
                }
                throw new RuntimeException();
            }
            return "highlights_in_grid_forced_migration_nux";
        }
        return "highlights_in_grid_opt_in_nux";
    }
}
