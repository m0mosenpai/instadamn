package X;

import android.content.Context;

/* renamed from: X.EkP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33178EkP extends AbstractC63478Snr {
    public final /* synthetic */ EKC A00;

    @Override // X.AbstractC63478Snr
    public final boolean A03(char c) {
        return (c == 9745 || c == 9989 || c == 10003 || c == 10004) ? false : true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33178EkP(Context context, EKC ekc) {
        super(context);
        this.A00 = ekc;
    }

    @Override // X.AbstractC63478Snr
    public final String A00() {
        return super.A00.getString(2131964636);
    }

    @Override // X.AbstractC63478Snr
    public final void A02(String str) {
        EKC ekc = this.A00;
        ekc.Eks(str, C05F.A0j);
        ekc.A0L.post(new GOT(ekc.A0D, ekc));
    }

    @Override // X.AbstractC63478Snr
    public final String A01(char c) {
        return String.valueOf(c).replaceAll("[\\u2611\\u2705\\u2713\\u2714]", "");
    }
}
