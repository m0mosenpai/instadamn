package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

/* renamed from: X.FyQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36212FyQ implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final UserSession A04;
    public final DirectShareTarget A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C36212FyQ(UserSession userSession, DirectShareTarget directShareTarget, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        StringBuilder A1C;
        C14360o3.A0B(directShareTarget, 2);
        this.A04 = userSession;
        this.A05 = directShareTarget;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A0B = z;
        this.A0D = z2;
        this.A0E = z3;
        this.A01 = i4;
        this.A0F = z4;
        this.A0C = z5;
        this.A08 = z6;
        this.A07 = z7;
        this.A0A = z8;
        this.A09 = z9;
        String A02 = AnonymousClass001.A02(i3, i, "-RELATIVE-", "-SECTION-");
        C3o9 A06 = AbstractC140946Yw.A06(AbstractC31171DnF.A0O(directShareTarget));
        if (A06 != null) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("THREAD-");
            A1C.append(A06);
        } else {
            ArrayList A1F = AbstractC166987dD.A1F(directShareTarget.A0B());
            C01T.A1C(A1F);
            A1C = AbstractC166987dD.A1C();
            A1C.append("RECIPIENTS_ID-");
            A1C.append(AbstractC31175DnJ.A0a(":", A1F));
        }
        this.A06 = AbstractC166997dE.A0x(A02, A1C);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36212FyQ c36212FyQ = (C36212FyQ) obj;
        C14360o3.A0B(c36212FyQ, 0);
        if (C14360o3.A0K(this.A04, c36212FyQ.A04) && C14360o3.A0K(this.A05, c36212FyQ.A05) && this.A03 == c36212FyQ.A03 && this.A00 == c36212FyQ.A00 && this.A02 == c36212FyQ.A02 && this.A0B == c36212FyQ.A0B && this.A0D == c36212FyQ.A0D && this.A0E == c36212FyQ.A0E && this.A01 == c36212FyQ.A01 && this.A0F == c36212FyQ.A0F && this.A0C == c36212FyQ.A0C && this.A08 == c36212FyQ.A08 && this.A07 == c36212FyQ.A07 && this.A09 == c36212FyQ.A09 && this.A0A == c36212FyQ.A0A) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }
}
