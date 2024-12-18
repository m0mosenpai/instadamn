package X;

import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gly, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37901Gly extends AbstractRunnableC14200nk {
    public final /* synthetic */ AudioPageAssetModel A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C37813GkT A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37901Gly(AudioPageAssetModel audioPageAssetModel, UserSession userSession, C37813GkT c37813GkT, String str, String str2) {
        super(607231408, 5, true, false);
        this.A02 = c37813GkT;
        this.A04 = str;
        this.A00 = audioPageAssetModel;
        this.A01 = userSession;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37813GkT.A00(this.A00, this.A01, this.A02, this.A04, this.A03);
    }
}
