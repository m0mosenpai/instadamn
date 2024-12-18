package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.DoB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31228DoB extends C0T6 {
    public final int A00;
    public final int A01;
    public final JUM A02;
    public final DirectShareTarget A03;
    public final C3o9 A04;
    public final Long A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C31228DoB(JUM jum, DirectShareTarget directShareTarget, C3o9 c3o9, Long l, String str, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C14360o3.A0B(list, 3);
        this.A0F = z;
        this.A04 = c3o9;
        this.A07 = list;
        this.A00 = i;
        this.A0B = z2;
        this.A0G = z3;
        this.A01 = i2;
        this.A06 = str;
        this.A0A = z4;
        this.A0D = z5;
        this.A08 = z6;
        this.A0C = z7;
        this.A09 = z8;
        this.A0E = z9;
        this.A05 = l;
        this.A03 = directShareTarget;
        this.A02 = jum;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31228DoB) {
                C31228DoB c31228DoB = (C31228DoB) obj;
                if (this.A0F != c31228DoB.A0F || !C14360o3.A0K(this.A04, c31228DoB.A04) || !C14360o3.A0K(this.A07, c31228DoB.A07) || this.A00 != c31228DoB.A00 || this.A0B != c31228DoB.A0B || this.A0G != c31228DoB.A0G || this.A01 != c31228DoB.A01 || !C14360o3.A0K(this.A06, c31228DoB.A06) || this.A0A != c31228DoB.A0A || this.A0D != c31228DoB.A0D || this.A08 != c31228DoB.A08 || this.A0C != c31228DoB.A0C || this.A09 != c31228DoB.A09 || this.A0E != c31228DoB.A0E || !C14360o3.A0K(this.A05, c31228DoB.A05) || !C14360o3.A0K(this.A03, c31228DoB.A03) || !C14360o3.A0K(this.A02, c31228DoB.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A03, (AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0A, (((AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0B, (AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A04, AbstractC25225BEi.A08(this.A0F))) + this.A00) * 31)) + this.A01) * 31) + AbstractC167017dG.A0O(this.A06)) * 31)))))) + AbstractC166997dE.A0I(this.A05)) * 31));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MultiThreadActionsViewModel(isUnread=");
        A1C.append(this.A0F);
        A1C.append(", unifiedThreadKey=");
        A1C.append(this.A04);
        A1C.append(", members=");
        A1C.append(this.A07);
        A1C.append(", threadLabel=");
        A1C.append(this.A00);
        A1C.append(", isMuted=");
        A1C.append(this.A0B);
        A1C.append(", isVideoCallMuted=");
        A1C.append(this.A0G);
        A1C.append(", threadSubtype=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(3366));
        A1C.append(this.A06);
        A1C.append(AbstractC111324zv.A00(3389));
        A1C.append(this.A0A);
        A1C.append(AbstractC111324zv.A00(3394));
        A1C.append(this.A0D);
        A1C.append(AbstractC111324zv.A00(1426));
        A1C.append(this.A08);
        A1C.append(", isPending=");
        A1C.append(this.A0C);
        A1C.append(AbstractC111324zv.A00(3387));
        A1C.append(this.A09);
        A1C.append(", isReactionsMuted=");
        A1C.append(this.A0E);
        A1C.append(", lastReceivedThreadMessageTimestampUs=");
        A1C.append(this.A05);
        A1C.append(", shareTarget=");
        A1C.append(this.A03);
        A1C.append(", threadAvatarViewModel=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
