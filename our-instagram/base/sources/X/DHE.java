package X;

import com.facebook.rsys.starrating.gen.StarRatingApi;

/* loaded from: classes5.dex */
public final class DHE extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHE(int i, long j) {
        super(1);
        this.A00 = i;
        this.A01 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C52000Myq c52000Myq = (C52000Myq) obj;
        C14360o3.A0B(c52000Myq, 0);
        StarRatingApi starRatingApi = c52000Myq.A07.A00;
        if (starRatingApi != null) {
            starRatingApi.submitStarRating(this.A00, null, Long.valueOf(this.A01));
        }
        return C0eB.A00;
    }
}
