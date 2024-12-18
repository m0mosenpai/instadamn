package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import java.util.Locale;

/* renamed from: X.KGb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45587KGb extends AbstractC61132qb {
    public final UserSession A00;
    public final TFA A01;
    public final LLR A02;
    public final Locale A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        TFA tfa = this.A01;
        FriendMapRepository A00 = AbstractC92954Eo.A00(userSession);
        LLR llr = this.A02;
        java.util.Set set = AbstractC68636VYr.A00;
        Locale locale = this.A03;
        String str = null;
        if (locale != null) {
            str = locale.getCountry();
        }
        return new C45998KXm(userSession, tfa, llr, A00, AbstractC001800i.A0u(set, str));
    }

    public C45587KGb(UserSession userSession, TFA tfa, LLR llr, Locale locale) {
        AbstractC167017dG.A1P(userSession, tfa);
        this.A00 = userSession;
        this.A01 = tfa;
        this.A02 = llr;
        this.A03 = locale;
    }
}
