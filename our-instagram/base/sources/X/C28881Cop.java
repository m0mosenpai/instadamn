package X;

import android.os.Bundle;
import com.instagram.api.schemas.Challenge;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.Cop, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28881Cop implements C06Z {
    public final /* synthetic */ CQS A00;

    public C28881Cop(CQS cqs) {
        this.A00 = cqs;
    }

    @Override // X.C06Z
    public final void DIA(String str, Bundle bundle) {
        CQS cqs;
        C141796aw A00;
        InterfaceC16620sF A02;
        Badge.ChallengeBadge challengeBadge;
        C14360o3.A0B(bundle, 1);
        if (bundle.getBoolean(AbstractC43591JPw.A00(714))) {
            CQS cqs2 = this.A00;
            if (cqs2 != null) {
                Challenge challenge = (Challenge) bundle.getParcelable(AbstractC43591JPw.A00(553));
                if (challenge != null) {
                    challengeBadge = CYO.A01(challenge, false);
                } else {
                    challengeBadge = null;
                }
                C25876Bcb c25876Bcb = cqs2.A00;
                A00 = AbstractC141776au.A00(c25876Bcb);
                A02 = new PZO(challengeBadge, c25876Bcb, null, 8, cqs2.A01);
            } else {
                return;
            }
        } else {
            if (!bundle.getBoolean(AbstractC43591JPw.A00(682)) || (cqs = this.A00) == null) {
                return;
            }
            C25876Bcb c25876Bcb2 = cqs.A00;
            A00 = AbstractC141776au.A00(c25876Bcb2);
            A02 = D4z.A02(c25876Bcb2, null, 18);
        }
        AbstractC166987dD.A1Z(A02, A00);
    }
}
