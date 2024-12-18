package X;

import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;

/* renamed from: X.DUo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30261DUo extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ ChallengeButtonInfo A02;
    public final /* synthetic */ ChallengeButtonInfo A03;
    public final /* synthetic */ ChallengeName A04;
    public final /* synthetic */ ChallengeState A05;
    public final /* synthetic */ InterfaceC16600sD A06;
    public final /* synthetic */ InterfaceC16600sD A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30261DUo(ChallengeButtonInfo challengeButtonInfo, ChallengeButtonInfo challengeButtonInfo2, ChallengeName challengeName, ChallengeState challengeState, InterfaceC16600sD interfaceC16600sD, InterfaceC16600sD interfaceC16600sD2, int i, long j) {
        super(2);
        this.A01 = j;
        this.A04 = challengeName;
        this.A05 = challengeState;
        this.A02 = challengeButtonInfo;
        this.A06 = interfaceC16600sD;
        this.A03 = challengeButtonInfo2;
        this.A07 = interfaceC16600sD2;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        long j = this.A01;
        ChallengeName challengeName = this.A04;
        ChallengeState challengeState = this.A05;
        AbstractC28392Cfv.A02(A0S, this.A02, this.A03, challengeName, challengeState, this.A06, this.A07, AbstractC25225BEi.A04(this.A00), j);
        return C0eB.A00;
    }
}
