package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U21 {
    public final C18920wW A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final Map A05;
    public final java.util.Set A06;

    public U21(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1R(userSession, str);
        this.A01 = str;
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A04 = new ArrayList();
        this.A06 = new LinkedHashSet();
        this.A05 = new LinkedHashMap();
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
