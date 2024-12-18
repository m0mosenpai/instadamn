package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

/* renamed from: X.NDj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52320NDj extends AbstractC61132qb {
    public final Fragment A00;
    public final MusicProduct A01;
    public final UserSession A02;
    public final C54428O3i A03;
    public final C54429O3j A04;
    public final String A05;
    public final String A06;

    public C52320NDj(Fragment fragment, MusicProduct musicProduct, UserSession userSession, C54428O3i c54428O3i, C54429O3j c54429O3j, String str, String str2) {
        AbstractC25234BEr.A0j(1, userSession, musicProduct, str, str2);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = musicProduct;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = c54428O3i;
        this.A04 = c54429O3j;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        MusicProduct musicProduct = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        C54693ODt c54693ODt = new C54693ODt(musicProduct, userSession, new O8E(), str, str2);
        Fragment fragment = this.A00;
        Context requireContext = fragment.requireContext();
        C08790ch A00 = AbstractC018607g.A00(fragment);
        C54428O3i c54428O3i = this.A03;
        OIV oiv = new OIV(new O8F(), new C54694ODu(requireContext, A00, musicProduct, userSession, c54428O3i, str));
        ODE ode = new ODE(musicProduct, new OAX(), new OFB(fragment.requireContext(), AbstractC018607g.A00(fragment), userSession, str2, str));
        C52678NSa A002 = CK4.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        return new MusicSearchQueryViewModel(userSession, c54428O3i, this.A04, new C54814OKp(null, AbstractC166997dE.A0i(c06090Tz, userSession, 36611009900714232L), AbstractC166997dE.A0i(c06090Tz, userSession, 36611009900779769L), C18U.A06(c06090Tz, userSession, 36329534924276104L)), c54693ODt, oiv, ode, A002, C36A.A00(musicProduct, userSession));
    }
}
