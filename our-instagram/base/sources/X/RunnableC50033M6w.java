package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.M6w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50033M6w implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C49131LoA A01;
    public final /* synthetic */ C49165Loi A02;
    public final /* synthetic */ GifUrlImpl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public RunnableC50033M6w(Context context, C49131LoA c49131LoA, C49165Loi c49165Loi, GifUrlImpl gifUrlImpl, String str, String str2) {
        this.A05 = str;
        this.A03 = gifUrlImpl;
        this.A00 = context;
        this.A04 = str2;
        this.A01 = c49131LoA;
        this.A02 = c49165Loi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A05;
        GifUrlImpl gifUrlImpl = this.A03;
        GifUrlImpl gifUrlImpl2 = new GifUrlImpl(str, gifUrlImpl.A03.floatValue(), gifUrlImpl.A02.floatValue());
        this.A02.A04.setImageDrawable(AbstractC46825KnK.A00(this.A00, this.A01.A00, gifUrlImpl2, null, this.A04));
    }
}
