package X;

import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3e6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77803e6 extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C77043cq A02;
    public final InterfaceC75453aC A03;
    public final C76853cX A04;
    public final long A05;
    public final String A06;

    private final C77943eM A03(C2Z1 c2z1, Reel reel, Reel reel2, long j) {
        RingSpec A05;
        EnumC77923eK enumC77923eK;
        C109054vU c109054vU;
        InterfaceC108984vN interfaceC108984vN;
        if (reel == null && reel2 == null) {
            return null;
        }
        if (reel != null) {
            C3PO A0E = reel.A0E();
            C105824pt c105824pt = reel.A0H;
            boolean z = true;
            if (c105824pt == null || (c109054vU = c105824pt.A02) == null || (interfaceC108984vN = c109054vU.A0A) == null || !interfaceC108984vN.CX2()) {
                z = false;
            }
            A05 = C3PP.A01(A0E, z);
        } else if (reel2 != null) {
            UserSession userSession = this.A00;
            A05 = reel2.A05(userSession);
            if (A05 == null) {
                A05 = C3PP.A00(userSession, reel2);
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        if (reel == null) {
            if (reel2 != null) {
                if (reel2.A16(this.A00)) {
                    enumC77923eK = EnumC77923eK.A03;
                    float A03 = AbstractC14670of.A03(AbstractC77363dM.A00(c2z1), R.dimen.album_preview_add_item_margin, R.dimen.afi_indicator_arrow_margin_top);
                    float A032 = AbstractC14670of.A03(AbstractC77363dM.A00(c2z1), R.dimen.album_preview_add_item_margin, R.dimen.account_recs_header_image_margin);
                    C75933ay c75933ay = C51722Yv.A02;
                    Integer num = C05F.A00;
                    return new C77943eM(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num, 0, j)), new C9CU(C05F.A01, 0, j)), new C9CV(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3)), new C9CV(num, EnumC77683ds.CENTER, 3)), A05, enumC77923eK, Float.valueOf(A03), Float.valueOf(A032));
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        enumC77923eK = EnumC77923eK.A02;
        float A033 = AbstractC14670of.A03(AbstractC77363dM.A00(c2z1), R.dimen.album_preview_add_item_margin, R.dimen.afi_indicator_arrow_margin_top);
        float A0322 = AbstractC14670of.A03(AbstractC77363dM.A00(c2z1), R.dimen.album_preview_add_item_margin, R.dimen.account_recs_header_image_margin);
        C75933ay c75933ay2 = C51722Yv.A02;
        Integer num2 = C05F.A00;
        return new C77943eM(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num2, 0, j)), new C9CU(C05F.A01, 0, j)), new C9CV(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3)), new C9CV(num2, EnumC77683ds.CENTER, 3)), A05, enumC77923eK, Float.valueOf(A033), Float.valueOf(A0322));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x013a, code lost:
    
        if (r11.A00.A03 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0506, code lost:
    
        if (r12 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0495  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r38) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77803e6.A0Y(X.3bS):X.2Vc");
    }

    public C77803e6(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C77043cq c77043cq, InterfaceC75453aC interfaceC75453aC, C76853cX c76853cX, String str, long j) {
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A03 = interfaceC75453aC;
        this.A04 = c76853cX;
        this.A02 = c77043cq;
        this.A06 = str;
        this.A05 = j;
    }
}
