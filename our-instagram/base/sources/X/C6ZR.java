package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6ZR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZR extends C6ZL {
    public static final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public C5SW A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final C41181vS A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;
    public final String A06;
    public final java.util.Set A07;

    public C6ZR(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A01 = context;
        this.A07 = AbstractC16830sb.A07(ReelHeaderAttributionType.A0Y, ReelHeaderAttributionType.A0Q, ReelHeaderAttributionType.A0w);
        this.A04 = c6eI;
        this.A03 = c41181vS;
        this.A05 = interfaceC144596ff;
        this.A02 = interfaceC11380iw;
        int ordinal = A01().ordinal();
        String str = "wearable";
        if (ordinal != 47) {
            if (ordinal != 46) {
                if (ordinal != 45 && ordinal == 54) {
                    str = "iconic_entrypoints";
                }
            } else {
                str = "horizon_worlds";
            }
        } else {
            str = "meta_quest";
        }
        this.A06 = str;
    }
}
