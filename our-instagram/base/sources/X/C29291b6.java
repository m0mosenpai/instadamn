package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.List;

/* renamed from: X.1b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29291b6 implements InterfaceC29301b7 {
    public static final C0KV A04 = new C0KV() { // from class: X.1b8
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-440686245);
            int A032 = C0f9.A03(-1969947205);
            C29291b6 c29291b6 = new C29291b6(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(116590350, A032);
            C0f9.A0A(454490597, A03);
            return c29291b6;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final C34547FKh A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C29271b4 c29271b4 = (C29271b4) c1ow;
        List C7R = c29271b4.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        C47Z c47z = c29271b4.A07;
        if (c47z != null) {
            UserSession userSession = this.A00;
            PendingMediaStore A00 = C25A.A00(userSession);
            PendingMediaStoreSerializer A002 = AnonymousClass257.A00(userSession);
            String str = c47z.A35;
            LHD.A00(c19260xA, userSession, interfaceC37261GbE, c29271b4, new C49310Lr4(c19260xA, this, c29271b4), (DirectThreadKey) C7R.get(0), A00, A002, str);
            return;
        }
        A00(c19260xA, interfaceC37261GbE, this, c29271b4, false);
    }

    public C29291b6(final UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A02 = new C34547FKh(userSession, AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M91
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return AbstractC166997dE.A0c(C06090Tz.A05, C29291b6.this.A00, 2342172033036599256L);
            }
        }));
        this.A03 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M92
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C47779L8e(UserSession.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0147, code lost:
    
        if (r5 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if (r5.length() == 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C19260xA r78, X.InterfaceC37261GbE r79, X.C29291b6 r80, X.C29271b4 r81, boolean r82) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29291b6.A00(X.0xA, X.GbE, X.1b6, X.1b4, boolean):void");
    }
}
