package X;

/* renamed from: X.Mms, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51387Mms extends AbstractC29601bb {
    public final /* synthetic */ C2PX A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "DELETE FROM audio_amplitudes WHERE audio_asset_id IN (SELECT audio_asset_id FROM (SELECT audio_asset_id, MAX(last_used_time_ms) AS last_used_time_ms FROM audio_amplitudes GROUP BY audio_asset_id ORDER BY last_used_time_ms) LIMIT (MAX(((SELECT COUNT(DISTINCT audio_asset_id) FROM audio_amplitudes) - ?), 0)))";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51387Mms(C1YP c1yp, C2PX c2px) {
        super(c1yp);
        this.A00 = c2px;
    }
}
