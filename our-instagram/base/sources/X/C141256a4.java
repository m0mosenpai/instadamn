package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141256a4 extends C6ZL {
    public final InterfaceC11380iw A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;
    public final User A05;
    public final String A06;
    public final Context A07;

    public C141256a4(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        User user;
        String str;
        this.A03 = c6eI;
        this.A07 = context;
        this.A02 = c41181vS;
        this.A04 = interfaceC144596ff;
        this.A00 = interfaceC11380iw;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            user = c38321qM.A0C.BoV();
        } else {
            user = null;
        }
        this.A05 = user;
        Resources resources = context.getResources();
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        String string = resources.getString(2131962958, str);
        C14360o3.A07(string);
        this.A06 = string;
        this.A01 = ReelHeaderAttributionType.A0g;
    }
}
