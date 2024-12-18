package X;

import android.content.Context;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;

/* renamed from: X.GtG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38321GtG extends AbstractC52922bZ {
    public final C2GT A00;
    public final C05A A01;
    public final IGO A02;

    public C38321GtG(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        C14360o3.A0B(abstractC018607g, 1);
        this.A02 = new IGO(context, abstractC018607g, userSession);
        C008002u A00 = C10E.A00(new C38607GyA(AudioFilterType.A0A, C16930sl.A00));
        this.A01 = A00;
        this.A00 = AbstractC58232lf.A00(AnonymousClass191.A00, A00);
    }

    public final void A00(AudioFilterType audioFilterType, String str) {
        AudioFilterType audioFilterType2 = AudioFilterType.A0A;
        if (audioFilterType == audioFilterType2) {
            this.A01.Egh(new C38607GyA(audioFilterType2, C16930sl.A00));
            return;
        }
        IGO igo = this.A02;
        C37484Gf2 c37484Gf2 = new C37484Gf2(24, audioFilterType, this);
        C25621Ms A0q = AbstractC25228BEl.A0q(igo.A02);
        A0q.A0B("music/clips_with_audio_filters/");
        A0q.A06();
        A0q.A9s("filter_type", audioFilterType.A00);
        A0q.A0D("num_clips", 3);
        A0q.A9s("music_canonical_id", str);
        C1ON A0e = AbstractC25227BEk.A0e(A0q, C38872H9u.class, C41305IPu.class);
        Context context = igo.A00;
        AbstractC018607g abstractC018607g = igo.A01;
        A0e.A00 = c37484Gf2;
        C1GJ.A00(context, abstractC018607g, A0e);
    }
}
