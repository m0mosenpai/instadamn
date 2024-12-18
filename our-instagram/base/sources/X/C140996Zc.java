package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.reels.viewer.attribution.model.ReelAttributionModel;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140996Zc extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;
    public final String A05;
    public final List A06;

    public C140996Zc(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A03 = c6eI;
        this.A02 = c41181vS;
        this.A04 = interfaceC144596ff;
        String string = context.getString(2131971958);
        C14360o3.A07(string);
        this.A05 = string;
        ReelHeaderAttributionType reelHeaderAttributionType = ReelHeaderAttributionType.A0d;
        this.A01 = reelHeaderAttributionType;
        List singletonList = Collections.singletonList(new ReelAttributionModel(reelHeaderAttributionType));
        C14360o3.A07(singletonList);
        this.A06 = singletonList;
    }
}
