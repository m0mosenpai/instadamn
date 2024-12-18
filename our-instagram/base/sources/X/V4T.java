package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes11.dex */
public final class V4T extends AbstractC65806TuP {
    public boolean A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        UserSession userSession;
        boolean z;
        int i;
        C14360o3.A0B(context, 0);
        SearchEditText searchEditText = new SearchEditText(context, null, 0);
        AbstractC12990ll A0A = C6BQ.A0A(this.A01);
        if (A0A instanceof UserSession) {
            userSession = (UserSession) A0A;
        } else {
            userSession = null;
        }
        int A06 = AbstractC43594JPz.A06(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_1_winner_submission_height);
        searchEditText.setMinimumHeight(A06);
        searchEditText.setMinimumWidth(dimensionPixelSize);
        if (userSession != null) {
            z = C18U.A06(C06090Tz.A05, userSession, 36327950081407982L);
        } else {
            z = false;
        }
        searchEditText.A0P = true;
        SearchEditText.A02(searchEditText, true, z);
        SearchEditText.A01(searchEditText);
        searchEditText.setSingleLine();
        searchEditText.A08(true);
        AbstractC31173DnH.A0z(context, searchEditText, R.drawable.elevated_rounded_meta_ai_searchbar_background);
        searchEditText.setImeOptions(3);
        if (userSession != null) {
            i = AbstractC66179U2u.A00(userSession);
        } else {
            i = 2131972993;
        }
        searchEditText.setHint(i);
        searchEditText.setHintTextColor(context.getColor(R.color.ig_search_meta_ai_searchbar_hint_color));
        return searchEditText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4T(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A02 = c102884kP;
        this.A01 = c6fg;
    }

    public static final void A00(V4T v4t, String str) {
        C6FG c6fg;
        Context context;
        String A0R;
        if (AbstractC001900j.A0T(str)) {
            c6fg = v4t.A01;
            context = c6fg.A00;
            A0R = AbstractC111324zv.A00(2545);
        } else {
            String encode = android.net.Uri.encode(str);
            c6fg = v4t.A01;
            context = c6fg.A00;
            A0R = AnonymousClass001.A0R("instagram://direct_meta_ai_thread?prompt=", encode);
        }
        AbstractC41776Ies.A03(context, A0R);
        C102884kP c102884kP = v4t.A02;
        InterfaceC103384lE A0A = c102884kP.A0A();
        if (A0A != null) {
            AbstractC65702TsY.A1Q(c6fg, c102884kP, AbstractC31179DnN.A0I(c102884kP), A0A);
        }
    }
}
