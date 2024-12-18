package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.83k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1815783k {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final C2GS A05;
    public final C2GS A06;
    public final C38321qM A07;
    public final MusicOverlayStickerModel A08;
    public final User A09;
    public final User A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final UserSession A0H;

    public final void A00() {
        UserSession userSession = this.A0H;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        A002.A68.Egi(A002, true, C23031Ai.A8c[428]);
        this.A06.A0B(Float.valueOf(1.0f));
        this.A05.A0B(true);
        A00.A13("immersive_mentions_reshare_stickiness", true);
        this.A03 = true;
    }

    public final void A01() {
        UserSession userSession = this.A0H;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        A002.A68.Egi(A002, false, C23031Ai.A8c[428]);
        if (!C18U.A06(C06090Tz.A05, userSession, 36322924969339629L)) {
            this.A06.A0B(Float.valueOf(0.7f));
        }
        A00.A13("immersive_mentions_reshare_stickiness", false);
        this.A05.A0B(false);
        this.A03 = true;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.2GT, X.2GS] */
    public C1815783k(UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        List A3w;
        this.A0H = userSession;
        this.A07 = c38321qM;
        this.A0B = str;
        this.A02 = z;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            this.A0A = A2E;
            this.A09 = c38321qM.A0C.BAR();
            String A38 = c38321qM.A38();
            if (A38 != null) {
                this.A0C = A38;
                this.A04 = c38321qM.A0m();
                this.A0F = c38321qM.Cff();
                boolean z2 = true;
                if (!c38321qM.A53() && ((A3w = c38321qM.A3w(EnumC75383a5.A0q)) == null || A3w.isEmpty())) {
                    z2 = false;
                }
                this.A0D = z2;
                User A2E2 = c38321qM.A2E(userSession);
                this.A0E = A2E2 != null ? A2E2.A1g() : false;
                this.A06 = new C2GT(Float.valueOf(0.7f));
                this.A05 = new C2GT(Boolean.valueOf(AbstractC23021Ah.A00(userSession).A21()));
                this.A0G = AbstractC25351Lp.A03(userSession);
                Integer num = null;
                MusicOverlayStickerModel A03 = AbstractC101614hW.A03(null, c38321qM, null);
                if (A03 != null && !A03.A0t) {
                    C23000ABz c23000ABz = new C23000ABz(A03);
                    c23000ABz.A02 = MusicProduct.A0B;
                    c23000ABz.A0K = A03.A0K;
                    Integer num2 = A03.A0O;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        num = Integer.valueOf(intValue > 60000 ? 60000 : intValue);
                    }
                    c23000ABz.A0O = num;
                    this.A08 = c23000ABz.A00();
                    return;
                }
                this.A08 = null;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
