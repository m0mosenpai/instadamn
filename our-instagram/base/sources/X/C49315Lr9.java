package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Lr9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49315Lr9 implements InterfaceC37292Gbt {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC50445MOz A02;
    public final DirectShareTarget A03;
    public final String A04;
    public final String A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;
    public final boolean A08;

    @Override // X.InterfaceC57945Pmr
    public final int Bu9() {
        return 3;
    }

    @Override // X.InterfaceC37292Gbt
    public final boolean CLv(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        return C14360o3.A0K(this.A03, directShareTarget);
    }

    @Override // X.InterfaceC37292Gbt
    public final List Axe() {
        return AbstractC166987dD.A1J(this.A03);
    }

    @Override // X.InterfaceC37292Gbt
    public final void ENk() {
        if (this.A08) {
            DirectShareTarget directShareTarget = this.A03;
            if (directShareTarget.A01() instanceof InterfaceC2056098k) {
                C47954LGp A00 = AbstractC46924Kp5.A00(AbstractC166987dD.A0O(this.A00), this.A01);
                String str = this.A04;
                InterfaceC83713oG A01 = directShareTarget.A01();
                LLU.A06(A00.A02, A00.A00(str), A01, str);
                this.A02.DwB();
            }
        }
        String str2 = this.A04;
        UserSession userSession = this.A01;
        DirectShareTarget directShareTarget2 = this.A03;
        C7TM A002 = JX0.A00(userSession, directShareTarget2);
        boolean z = this.A07;
        A002.EOf(null, directShareTarget2, null, str2, "share_extension", null, z);
        String str3 = this.A05;
        if (str3 != null && str3.length() != 0) {
            JX0.A00(userSession, directShareTarget2).EOf(null, directShareTarget2, null, str3, "share_extension", null, z);
        }
        this.A02.DwB();
    }

    public C49315Lr9(Context context, UserSession userSession, InterfaceC50445MOz interfaceC50445MOz, DirectShareTarget directShareTarget, String str, String str2, boolean z, boolean z2) {
        AbstractC167017dG.A1R(userSession, str);
        C50171MDy c50171MDy = new C50171MDy(0, directShareTarget, userSession);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = directShareTarget;
        this.A02 = interfaceC50445MOz;
        this.A07 = z;
        this.A06 = c50171MDy;
        this.A08 = z2;
    }
}
