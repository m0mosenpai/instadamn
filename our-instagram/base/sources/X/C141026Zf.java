package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6Zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141026Zf extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C3G2 A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;
    public final String A06;
    public final String A07;

    public static final String A00(C141026Zf c141026Zf) {
        InterfaceC107774tM BEB;
        List AZh;
        InterfaceC107754tK interfaceC107754tK;
        String title;
        C38321qM c38321qM = c141026Zf.A02.A0b;
        if (c38321qM == null || (BEB = c38321qM.A0C.BEB()) == null || (AZh = BEB.AZh()) == null || (interfaceC107754tK = (InterfaceC107754tK) AbstractC001800i.A0J(AZh)) == null || (title = interfaceC107754tK.getTitle()) == null) {
            return "";
        }
        return title;
    }

    public C141026Zf(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C3G2 c3g2, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A04 = c6eI;
        this.A02 = c41181vS;
        this.A05 = interfaceC144596ff;
        this.A03 = c3g2;
        String string = context.getString(2131971718, A00(this));
        C14360o3.A07(string);
        this.A07 = string;
        this.A01 = ReelHeaderAttributionType.A0P;
        this.A06 = "highlights";
    }
}
