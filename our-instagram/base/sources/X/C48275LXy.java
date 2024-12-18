package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.LXy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48275LXy implements MPZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C49114Lnr A02;
    public final /* synthetic */ C49156LoZ A03;
    public final /* synthetic */ GifUrlImpl A04;
    public final /* synthetic */ String A05;

    @Override // X.MPZ
    public final /* synthetic */ void DEI(String str, int i, String str2) {
        C14360o3.A0B(str, 1);
    }

    @Override // X.MPZ
    public final void DqE(String str, boolean z) {
        C14360o3.A0B(str, 0);
        GifUrlImpl gifUrlImpl = this.A04;
        GifUrlImpl gifUrlImpl2 = new GifUrlImpl(str, gifUrlImpl.A03.floatValue(), gifUrlImpl.A02.floatValue());
        C49156LoZ c49156LoZ = this.A03;
        c49156LoZ.A03.post(new RunnableC50032M6v(this.A01, this.A02, c49156LoZ, gifUrlImpl2, this.A05, this.A00));
    }

    public C48275LXy(Context context, C49114Lnr c49114Lnr, C49156LoZ c49156LoZ, GifUrlImpl gifUrlImpl, String str, int i) {
        this.A04 = gifUrlImpl;
        this.A03 = c49156LoZ;
        this.A02 = c49114Lnr;
        this.A01 = context;
        this.A05 = str;
        this.A00 = i;
    }
}
