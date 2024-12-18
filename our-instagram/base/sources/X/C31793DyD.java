package X;

import android.app.Application;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import fxcache.model.FxCalAccount;
import java.util.List;

/* renamed from: X.DyD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31793DyD extends C193578hc implements CallerContextable {
    public static final String __redex_internal_original_name = "MultipleLinksReorderingViewModel";
    public Integer A00;
    public final UserSession A01;
    public final InterfaceC06180Ui A02;
    public final C05A A03;

    private final boolean A00(User user) {
        List Ag2;
        InterfaceC81873l7 interfaceC81873l7;
        if (!AbstractC167007dF.A1T(user.A03.CTH())) {
            return false;
        }
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A06, userSession, 36322761760975337L) || (Ag2 = user.A03.Ag2()) == null || (interfaceC81873l7 = (InterfaceC81873l7) AbstractC001800i.A0J(Ag2)) == null || !interfaceC81873l7.CaK()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public /* synthetic */ C31793DyD(Application application, UserSession userSession) {
        super(application);
        List Ag2;
        InterfaceC81873l7 interfaceC81873l7;
        String BNQ;
        String title;
        String A00;
        int i;
        String A002;
        int i2;
        C33052EiB c33052EiB;
        InterfaceC110324y3 BNb;
        String name;
        User A10 = AbstractC166987dD.A10(userSession);
        this.A01 = userSession;
        List<InterfaceC81873l7> Ag22 = A10.A03.Ag2();
        ?? r5 = 0;
        if (A00(A10)) {
            if (Ag22 != null) {
                Ag22 = AbstractC001800i.A0c(Ag22, 1);
            } else {
                Ag22 = null;
            }
        }
        if (Ag22 != null) {
            r5 = AbstractC166987dD.A1E();
            for (InterfaceC81873l7 interfaceC81873l72 : Ag22) {
                if (interfaceC81873l72.BNW() == IgUserBioLinkTypeEnum.A05) {
                    BNQ = interfaceC81873l72.BNQ();
                    title = AbstractC166997dE.A0p(A0D().getApplicationContext(), 2131970201);
                    FxCalAccount A01 = AbstractC49092Nc.A00(this.A01).A01(CallerContext.A00(C31793DyD.class), "ig_android_linking_cache_igxfb_fb_profile_link");
                    A00 = (A01 == null || (A00 = A01.A06) == null) ? "'" : A00;
                    i = R.drawable.instagram_facebook_circle_pano_outline_24;
                } else {
                    String str = "";
                    if (interfaceC81873l72.BNW() == IgUserBioLinkTypeEnum.A07) {
                        InterfaceC81833l1 BNa = A10.A03.BNa();
                        BNQ = interfaceC81873l72.BNQ();
                        A002 = AbstractC166997dE.A0p(A0D().getApplicationContext(), 2131970200);
                        if (BNa != null && (BNb = BNa.BNb()) != null && (name = BNb.getName()) != null) {
                            str = name;
                        }
                        i2 = R.drawable.instagram_facebook_circle_pano_outline_24;
                    } else {
                        int length = interfaceC81873l72.getTitle().length();
                        BNQ = interfaceC81873l72.BNQ();
                        if (length == 0) {
                            A002 = FAG.A00(interfaceC81873l72);
                            i2 = R.drawable.instagram_link_pano_outline_24;
                        } else {
                            title = interfaceC81873l72.getTitle();
                            A00 = FAG.A00(interfaceC81873l72);
                            i = R.drawable.instagram_link_pano_outline_24;
                        }
                    }
                    c33052EiB = new C33052EiB(BNQ, A002, str, i2);
                    r5.add(c33052EiB);
                }
                c33052EiB = new C33052EiB(BNQ, title, A00, i);
                r5.add(c33052EiB);
            }
        }
        if (this.A00 == null) {
            this.A00 = Integer.valueOf(r5 != 0 ? r5.hashCode() : 0);
        }
        r5 = r5 == 0 ? C16930sl.A00 : r5;
        C33052EiB c33052EiB2 = null;
        if (A00(A10) && (Ag2 = A10.A03.Ag2()) != null && (interfaceC81873l7 = (InterfaceC81873l7) AbstractC001800i.A0J(Ag2)) != null) {
            int length2 = interfaceC81873l7.getTitle().length();
            String BNQ2 = interfaceC81873l7.BNQ();
            c33052EiB2 = length2 == 0 ? new C33052EiB(BNQ2, FAG.A00(interfaceC81873l7), "", R.drawable.instagram_link_pano_outline_24) : new C33052EiB(BNQ2, interfaceC81873l7.getTitle(), FAG.A00(interfaceC81873l7), R.drawable.instagram_link_pano_outline_24);
        }
        this.A03 = AbstractC25225BEi.A1H(new FMH(c33052EiB2, r5, null, false));
        this.A02 = C10M.A00(C05F.A00, 0, 0);
    }
}
