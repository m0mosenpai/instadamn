package X;

import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;

/* renamed from: X.JmH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44511JmH extends AbstractC52922bZ {
    public final C2GT A00;
    public final DirectPollMessageOptionVotersRepository A01;

    public final void A00(boolean z, String str, String str2) {
        CharSequence charSequence;
        C14360o3.A0B(str, 1);
        if ((!z && ((charSequence = (CharSequence) this.A01.A00.getValue()) == null || charSequence.length() == 0)) || C14360o3.A0K(this.A01.A01.getValue(), KQH.A00)) {
            return;
        }
        AbstractC166987dD.A1Z(new C50114MAn(this, str, str2, null, 0, z), AbstractC141776au.A00(this));
    }

    public C44511JmH(DirectPollMessageOptionVotersRepository directPollMessageOptionVotersRepository) {
        this.A01 = directPollMessageOptionVotersRepository;
        this.A00 = AbstractC31172DnG.A0E(AbstractC43593JPy.A16(directPollMessageOptionVotersRepository.A02, directPollMessageOptionVotersRepository.A01, 23));
    }
}
