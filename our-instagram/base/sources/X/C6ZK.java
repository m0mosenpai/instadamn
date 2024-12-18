package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6ZK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZK extends C6ZL {
    public String A00;
    public List A01;
    public final Context A02;
    public final ReelHeaderAttributionType A03;
    public final C41181vS A04;
    public final C6eI A05;
    public final InterfaceC144596ff A06;
    public final String A07;

    public C6ZK(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A02 = context;
        this.A05 = c6eI;
        this.A04 = c41181vS;
        this.A06 = interfaceC144596ff;
        String string = context.getString(2131971858);
        C14360o3.A07(string);
        this.A07 = string;
        this.A03 = ReelHeaderAttributionType.A0Z;
    }
}
