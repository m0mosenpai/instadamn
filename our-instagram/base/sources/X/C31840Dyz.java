package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dyz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31840Dyz extends AbstractC52922bZ {
    public final UserSession A00;
    public final EnumC33357Eoq A01;
    public final C18A A02;
    public final String A03;

    public C31840Dyz(UserSession userSession, EnumC33357Eoq enumC33357Eoq, C18A c18a, String str) {
        AbstractC167027dH.A0a(1, userSession, str, enumC33357Eoq, c18a);
        this.A00 = userSession;
        this.A03 = str;
        this.A01 = enumC33357Eoq;
        this.A02 = c18a;
    }

    public static E98 A00(Object[] objArr, int i) {
        return new E98(new BHS(objArr, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    public final C32052E6e A01() {
        String str;
        int i;
        BHS A00;
        int i2;
        BHS A002;
        InterfaceC37092GWb e99;
        int i3;
        BHS A003;
        E98 A004;
        int i4;
        BHS A005;
        Object[] objArr;
        int i5;
        InterfaceC37092GWb e992;
        User A02 = this.A02.A02(this.A03);
        BHS bhs = null;
        if (A02 != null) {
            str = A02.getUsername();
        } else {
            str = "";
        }
        switch (this.A01.ordinal()) {
            case 0:
                i = R.drawable.ig_illustrations_illo_messages_refresh;
                A00 = BHS.A00(new Object[0], 2131974281);
                i2 = R.drawable.instagram_reactions_pano_outline_24;
                A002 = BHS.A00(new Object[0], 2131955085);
                e99 = new E99();
                i3 = R.drawable.instagram_users_pano_outline_24;
                A003 = BHS.A00(new Object[0], 2131974283);
                A004 = A00(new Object[0], 2131974282);
                i4 = R.drawable.instagram_shield_star_pano_outline_24;
                A005 = BHS.A00(new Object[0], 2131974285);
                objArr = new Object[0];
                i5 = 2131974284;
                e992 = A00(objArr, i5);
                return new C32052E6e(A00, A002, A003, A005, null, e99, A004, e992, i, i2, i3, i4);
            case 1:
                BHS A006 = BHS.A00(new Object[]{str}, 2131974362);
                BHS A007 = BHS.A00(new Object[0], 2131955085);
                E99 e993 = new E99();
                return new C32052E6e(A006, A007, BHS.A00(new Object[0], 2131974283), BHS.A00(new Object[0], 2131974364), null, e993, A00(new Object[0], 2131974282), A00(new Object[]{str}, 2131974363), R.drawable.ig_illustrations_illo_channels_social_refresh, R.drawable.instagram_reactions_pano_outline_24, R.drawable.instagram_users_pano_outline_24, R.drawable.instagram_shield_star_pano_outline_24);
            case 2:
                BHS A008 = BHS.A00(new Object[0], 2131954293);
                BHS A009 = BHS.A00(new Object[0], 2131954295);
                E98 A0010 = A00(new Object[0], 2131954294);
                BHS A0011 = BHS.A00(new Object[0], 2131954297);
                E98 A0012 = A00(new Object[0], 2131954296);
                BHS A0013 = BHS.A00(new Object[0], 2131954299);
                E98 A0014 = A00(new Object[0], 2131954298);
                if (C18U.A06(C06090Tz.A05, this.A00, 36320438183731709L)) {
                    bhs = BHS.A00(new Object[0], 2131954292);
                }
                return new C32052E6e(A008, A009, A0011, A0013, bhs, A0010, A0012, A0014, R.drawable.ig_illustrations_illo_channels_broadcast_refresh, R.drawable.instagram_media_account_pano_outline_24, R.drawable.instagram_reactions_pano_outline_24, R.drawable.instagram_app_messenger_pano_outline_24);
            case 3:
                BHS A0015 = BHS.A00(new Object[0], 2131954293);
                BHS A0016 = BHS.A00(new Object[0], 2131954295);
                E98 A0017 = A00(new Object[0], 2131954294);
                return new C32052E6e(A0015, A0016, BHS.A00(new Object[0], 2131954297), BHS.A00(new Object[0], 2131954299), null, A0017, A00(new Object[0], 2131974809), A00(new Object[0], 2131954298), R.drawable.ig_illustrations_illo_messages_refresh, R.drawable.instagram_media_account_pano_outline_24, R.drawable.instagram_reactions_pano_outline_24, R.drawable.instagram_app_messenger_pano_outline_24);
            case 4:
                i = R.drawable.ig_illustrations_illo_messages_refresh;
                A00 = BHS.A00(new Object[0], 2131963371);
                i2 = R.drawable.instagram_users_pano_outline_24;
                A002 = BHS.A00(new Object[0], 2131963368);
                e99 = A00(new Object[0], 2131963367);
                i3 = R.drawable.instagram_report_pano_outline_24;
                A003 = BHS.A00(new Object[0], 2131963370);
                A004 = A00(new Object[0], 2131963369);
                i4 = R.drawable.instagram_reactions_pano_outline_24;
                A005 = BHS.A00(new Object[0], 2131955085);
                e992 = new E99();
                return new C32052E6e(A00, A002, A003, A005, null, e99, A004, e992, i, i2, i3, i4);
            case 5:
                i = R.drawable.ig_illustrations_illo_messages_refresh;
                A00 = BHS.A00(new Object[0], 2131963376);
                i2 = R.drawable.instagram_reactions_pano_outline_24;
                A002 = BHS.A00(new Object[0], 2131955085);
                e99 = new E99();
                i3 = R.drawable.instagram_users_pano_outline_24;
                A003 = BHS.A00(new Object[0], 2131963373);
                A004 = A00(new Object[0], 2131963372);
                i4 = R.drawable.instagram_report_pano_outline_24;
                A005 = BHS.A00(new Object[0], 2131963375);
                objArr = new Object[0];
                i5 = 2131963374;
                e992 = A00(objArr, i5);
                return new C32052E6e(A00, A002, A003, A005, null, e99, A004, e992, i, i2, i3, i4);
            default:
                throw B4Z.A00();
        }
    }
}
