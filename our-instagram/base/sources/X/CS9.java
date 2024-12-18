package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class CS9 {
    public final UserSession A00;
    public final EnumC193878i8 A01;
    public final String A02;
    public final ConcurrentHashMap.KeySetView A03;

    public CS9(UserSession userSession, EnumC193878i8 enumC193878i8, String str) {
        AbstractC167017dG.A1P(str, enumC193878i8);
        this.A02 = str;
        this.A01 = enumC193878i8;
        this.A00 = userSession;
        this.A03 = ConcurrentHashMap.newKeySet();
    }
}
