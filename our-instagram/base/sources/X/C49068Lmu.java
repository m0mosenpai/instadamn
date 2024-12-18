package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Lmu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49068Lmu implements InterfaceC50432MOm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C49118Lnv A03;
    public final /* synthetic */ C49160Lod A04;
    public final /* synthetic */ String A05;

    public C49068Lmu(Context context, ImageUrl imageUrl, C49118Lnv c49118Lnv, C49160Lod c49160Lod, String str, int i) {
        this.A04 = c49160Lod;
        this.A02 = imageUrl;
        this.A01 = context;
        this.A05 = str;
        this.A03 = c49118Lnv;
        this.A00 = i;
    }

    @Override // X.InterfaceC50432MOm
    public final void D6U(Object obj) {
        C14360o3.A0B(obj, 0);
        C49160Lod c49160Lod = this.A04;
        c49160Lod.A00 = null;
        ImageUrl imageUrl = this.A02;
        c49160Lod.A03.setImageDrawable(AbstractC46825KnK.A00(this.A01, this.A03.A01, new GifUrlImpl((String) obj, imageUrl.getWidth(), imageUrl.getHeight()), Integer.valueOf(this.A00), this.A05));
    }
}
