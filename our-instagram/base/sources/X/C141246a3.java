package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6a3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141246a3 extends C6ZL {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final ReelHeaderAttributionType A02;
    public final C84823qW A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;
    public final User A06;
    public final String A07;
    public final C41181vS A08;

    public C141246a3(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        C84823qW c84823qW;
        String str;
        H4U h4u;
        this.A00 = context;
        this.A04 = c6eI;
        this.A08 = c41181vS;
        this.A05 = interfaceC144596ff;
        this.A01 = interfaceC11380iw;
        List BlY = c41181vS.BlY(EnumC75383a5.A0v);
        User user = null;
        if (BlY != null) {
            c84823qW = (C84823qW) AbstractC001800i.A0J(BlY);
        } else {
            c84823qW = null;
        }
        this.A03 = c84823qW;
        if (c84823qW != null && (h4u = c84823qW.A0L) != null) {
            User user2 = h4u.A00;
            if (user2 != null) {
                user2.Bhu();
            }
            user = h4u.A00;
        }
        this.A06 = user;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        this.A07 = str;
        this.A02 = ReelHeaderAttributionType.A0l;
    }
}
