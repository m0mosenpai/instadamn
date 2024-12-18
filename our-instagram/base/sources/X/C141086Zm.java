package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.reels.viewer.attribution.model.ReelAttributionModel;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141086Zm extends C6ZL {
    public final Context A00;
    public final UserSession A01;
    public final ReelHeaderAttributionType A02;
    public final C41181vS A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;
    public final String A06;
    public final List A07;

    public C141086Zm(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A04 = c6eI;
        this.A03 = c41181vS;
        this.A05 = interfaceC144596ff;
        this.A01 = userSession;
        String string = context.getString(2131953239);
        C14360o3.A07(string);
        this.A06 = string;
        ReelHeaderAttributionType reelHeaderAttributionType = ReelHeaderAttributionType.A0F;
        this.A02 = reelHeaderAttributionType;
        List singletonList = Collections.singletonList(new ReelAttributionModel(reelHeaderAttributionType));
        C14360o3.A07(singletonList);
        this.A07 = singletonList;
    }
}
