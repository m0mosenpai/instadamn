package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.M6v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50032M6v implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C49114Lnr A02;
    public final /* synthetic */ C49156LoZ A03;
    public final /* synthetic */ GifUrlImpl A04;
    public final /* synthetic */ String A05;

    public RunnableC50032M6v(Context context, C49114Lnr c49114Lnr, C49156LoZ c49156LoZ, GifUrlImpl gifUrlImpl, String str, int i) {
        this.A02 = c49114Lnr;
        this.A03 = c49156LoZ;
        this.A04 = gifUrlImpl;
        this.A01 = context;
        this.A05 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C49114Lnr c49114Lnr = this.A02;
        C49156LoZ c49156LoZ = this.A03;
        GifUrlImpl gifUrlImpl = this.A04;
        c49156LoZ.A03.setImageDrawable(AbstractC46825KnK.A00(this.A01, c49114Lnr.A00, gifUrlImpl, Integer.valueOf(this.A00), this.A05));
    }
}
