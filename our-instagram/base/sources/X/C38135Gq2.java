package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gq2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38135Gq2 {
    public C69533Vqx A00;
    public Long A01;
    public boolean A02;
    public boolean A03;
    public final C0JO A04;
    public final MTJ A05;
    public final UserSession A06;
    public final C38083GpC A07;
    public final C93Y A08;
    public final C37934GmW A09;
    public final C38082GpB A0A;
    public final C38136Gq3 A0B;
    public final C38126Gpt A0C;
    public final InterfaceC60442pS A0D;
    public final String A0E;
    public final String A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final boolean A0I;
    public final Context A0J;
    public final AbstractC018607g A0K;
    public final C38147GqE A0L;
    public final C61582rL A0M;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0JO, java.lang.Object] */
    public C38135Gq2(Context context, AbstractC018607g abstractC018607g, MTJ mtj, UserSession userSession, C38147GqE c38147GqE, C38083GpC c38083GpC, C93Y c93y, C37934GmW c37934GmW, C38082GpB c38082GpB, C38126Gpt c38126Gpt, InterfaceC60442pS interfaceC60442pS, C61582rL c61582rL, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 3);
        this.A0J = context;
        this.A0K = abstractC018607g;
        this.A06 = userSession;
        this.A0D = interfaceC60442pS;
        this.A09 = c37934GmW;
        this.A0E = str;
        this.A05 = mtj;
        this.A0I = z;
        this.A0F = str2;
        this.A07 = c38083GpC;
        this.A0C = c38126Gpt;
        this.A08 = c93y;
        this.A0M = c61582rL;
        this.A0L = c38147GqE;
        this.A0A = c38082GpB;
        this.A0H = AbstractC09440dt.A01(new C37053GUj(this, 9));
        this.A0G = AbstractC09440dt.A01(new C37053GUj(this, 8));
        this.A04 = new Object();
        this.A0B = new C38136Gq3(this);
    }

    public static final void A01(C38135Gq2 c38135Gq2, boolean z, boolean z2, boolean z3) {
        Integer num;
        InterfaceC669830p interfaceC669830p;
        if (c38135Gq2.A09.A03()) {
            C19280xC A00 = C19280xC.A00(c38135Gq2.A0D, "action_bar_feed_retry");
            C150856qj.A03(c38135Gq2.A0J, A00);
            AbstractC31173DnH.A1S(A00, c38135Gq2.A06);
        }
        if (!z3 && z2) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        C38147GqE c38147GqE = c38135Gq2.A0L;
        if (c38147GqE != null && AbstractC31178DnM.A1a(c38135Gq2.A0G) && (interfaceC669830p = c38147GqE.A00) != null) {
            interfaceC669830p.DrH();
        }
        A00(c38135Gq2, num, true, z, c38135Gq2.A0I, z2, z3);
    }

    public static final void A00(C38135Gq2 c38135Gq2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str;
        C93Y c93y = c38135Gq2.A08;
        String str2 = c38135Gq2.A0E;
        String moduleName = c38135Gq2.A0D.getModuleName();
        boolean z6 = c38135Gq2.A02;
        String str3 = c38135Gq2.A0F;
        if (z) {
            str = null;
        } else {
            str = c38135Gq2.A09.A05;
        }
        c38135Gq2.A09.A00(new C93Z(c93y, num, str2, moduleName, str, str3, 30720, z2, z, z4, z5, z3, z6));
    }

    public final void A02(boolean z) {
        C61582rL c61582rL = this.A0M;
        if (c61582rL != null) {
            c61582rL.A02();
        }
        if (!AbstractC153456vF.A02(this.A06) && !this.A09.A04()) {
            if (AbstractC37836Gkq.A00 == 0) {
                AbstractC37836Gkq.A00 = System.currentTimeMillis();
            }
            this.A0A.A05(true, true);
            A01(this, true, true, z);
        }
    }
}
