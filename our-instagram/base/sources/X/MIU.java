package X;

import com.facebookpay.logging.LoggingContext;
import com.instagram.barcelona.creation.voiceclips.model.TranscriptionToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class MIU extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIU(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A06 = str;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A01 = j;
        this.A04 = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ?? r1;
        AnonymousClass583 anonymousClass583;
        int A07;
        if (this.A00 != 0) {
            C137576Ld c137576Ld = (C137576Ld) obj;
            C14360o3.A0B(c137576Ld, 0);
            C127055oj c127055oj = (C127055oj) this.A03;
            if (c127055oj != null) {
                anonymousClass583 = c127055oj.A04.A07;
            } else {
                anonymousClass583 = null;
            }
            int i = 0;
            boolean A1X = AbstractC167007dF.A1X(anonymousClass583, AnonymousClass583.Rtl);
            int A0A = AbstractC167007dF.A0A(this.A06);
            List<TranscriptionToken> list = (List) this.A05;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (TranscriptionToken transcriptionToken : list) {
                int A0A2 = AbstractC167007dF.A0A(transcriptionToken.A02);
                if (c127055oj != null) {
                    int i2 = i;
                    int i3 = (i + A0A2) - 1;
                    C127035oh c127035oh = c127055oj.A03;
                    int i4 = transcriptionToken.A01;
                    int A06 = c127035oh.A06(i2);
                    int A062 = c127035oh.A06(i3);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    int i5 = c127035oh.A02;
                    if (i5 == 0) {
                        A07 = 0;
                    } else {
                        A07 = c127035oh.A07(i5 - 1, false);
                    }
                    while (A06 <= A062 && i2 < A07) {
                        int A072 = c127035oh.A07(A06, false) - 1;
                        if (A06 == A062 && A072 > i3) {
                            A072 = i3;
                        }
                        float f = ((((A072 - i2) + 1) / A0A2) * (transcriptionToken.A00 - r0)) + i4;
                        C114205Dh A05 = c127055oj.A05(i2);
                        C114205Dh A052 = c127055oj.A05(A072);
                        float f2 = A052.A01;
                        float min = Math.min(new float[]{A05.A01, f2}[0], f2);
                        float f3 = A052.A02;
                        float max = Math.max(new float[]{A05.A02, f3}[0], f3);
                        float f4 = A052.A03;
                        float min2 = Math.min(new float[]{A05.A03, f4}[0], f4);
                        float f5 = A052.A00;
                        int i6 = (int) f;
                        A1E.add(new C51752Mtb(new C114205Dh(min, min2, max, Math.max(new float[]{A05.A00, f5}[0], f5)), i4, i6, 4));
                        A06++;
                        i2 = A072 + 1;
                        i4 = i6;
                    }
                    i += A0A2 + A0A;
                    A0q.add(A1E);
                } else {
                    throw AbstractC25227BEk.A0n();
                }
            }
            return c137576Ld.A00(new C29915DHd((InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A04, AbstractC133095zb.A00(AbstractC06950Ym.A1F(A0q)), this.A01, A1X));
        }
        C25531Mh c25531Mh = (C25531Mh) obj;
        ?? c0Zx = new C0Zx();
        LoggingContext loggingContext = (LoggingContext) this.A05;
        AbstractC43594JPz.A1E(c0Zx, loggingContext);
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A05("credential_id", Long.valueOf(this.A01));
        JQ1.A0e(c0Zx2, c0Zx, this.A03);
        List list2 = (List) this.A02;
        if (list2 != null) {
            r1 = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), r1);
            }
        } else {
            r1 = C16930sl.A00;
        }
        c0Zx.A07("container_ids", r1);
        AbstractC43593JPy.A1L(c0Zx, loggingContext);
        AbstractC43592JPx.A1N(c0Zx, this.A06);
        AbstractC43592JPx.A1M(c25531Mh, c0Zx);
        AbstractC43593JPy.A1M(c25531Mh, this.A04);
        return c25531Mh;
    }
}
