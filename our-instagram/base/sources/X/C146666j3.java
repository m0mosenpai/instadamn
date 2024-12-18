package X;

import com.google.common.collect.MapMakerInternalMap;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6j3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146666j3 implements InterfaceC43071ya {
    public static final C142156bY A05 = new Object();
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final Map A03;
    public final Map A04;

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0385, code lost:
    
        if (r1 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x045c, code lost:
    
        if (r10 != null) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r21, X.InterfaceC57162jr r22) {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146666j3.ATP(X.2n7, X.2jr):void");
    }

    public C146666j3(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession);
        C18B c18b = new C18B();
        MapMakerInternalMap.Strength strength = MapMakerInternalMap.Strength.A01;
        c18b.A04(strength);
        c18b.A01();
        this.A04 = c18b.A00();
        C18B c18b2 = new C18B();
        c18b2.A04(strength);
        this.A03 = c18b2.A00();
    }
}
