package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Lmi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49056Lmi implements InterfaceC50467MPv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C49131LoA A01;
    public final /* synthetic */ C49165Loi A02;
    public final /* synthetic */ GifUrlImpl A03;
    public final /* synthetic */ String A04;

    @Override // X.InterfaceC50467MPv
    public final void D6W(String str, boolean z) {
        C14360o3.A0B(str, 0);
        C49165Loi c49165Loi = this.A02;
        c49165Loi.A01 = null;
        C49131LoA.A00(this.A00, this.A01, c49165Loi, this.A03, str, this.A04);
    }

    public C49056Lmi(Context context, C49131LoA c49131LoA, C49165Loi c49165Loi, GifUrlImpl gifUrlImpl, String str) {
        this.A02 = c49165Loi;
        this.A01 = c49131LoA;
        this.A03 = gifUrlImpl;
        this.A00 = context;
        this.A04 = str;
    }

    @Override // X.InterfaceC50467MPv
    public final void onError(String str) {
        C0f5 AEp = C18950wb.A01.AEp("Error while fetching gif/sticker from Instamadillo media store", 817892914);
        AEp.ABW("error_message", str);
        AEp.report();
    }
}
