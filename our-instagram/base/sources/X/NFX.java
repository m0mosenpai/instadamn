package X;

import android.graphics.Bitmap;
import android.view.Surface;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class NFX extends C2AG {
    public final /* synthetic */ C55142Ocx A00;

    @Override // X.C11R
    public final int getRunnableId() {
        return 512475589;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        C55142Ocx c55142Ocx = this.A00;
        c55142Ocx.A03();
        c55142Ocx.A05 = c55142Ocx.A0G;
        C0w9.A03("IgLiveImageStreamingController", AbstractC166997dE.A0y("failed to fetch image while streaming due to exception: ", exc));
    }

    public NFX(C55142Ocx c55142Ocx) {
        this.A00 = c55142Ocx;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Bitmap A0H;
        C55142Ocx c55142Ocx = this.A00;
        ImageUrl imageUrl = c55142Ocx.A09;
        if (imageUrl == null || (A0H = C25821No.A00().A0H(imageUrl, "IgLiveImageStreamingController")) == null) {
            c55142Ocx.A03();
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Fetched image bitmap is null with image url: ");
            A1C.append(c55142Ocx.A09);
            A1C.append(" and bitmap returned from cache is null: ");
            A1C.append(true);
            C0w9.A03("IgLiveImageStreamingController", A1C.toString());
            return c55142Ocx.A0G;
        }
        return A0H;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Surface surface;
        Bitmap bitmap = (Bitmap) obj;
        C14360o3.A0B(bitmap, 0);
        C55142Ocx c55142Ocx = this.A00;
        if (C14360o3.A0K(c55142Ocx.A05, c55142Ocx.A0G) && (surface = c55142Ocx.A07) != null) {
            c55142Ocx.A06 = surface;
        }
        c55142Ocx.A05 = bitmap;
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        super.onFinish();
        this.A00.A0D = false;
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onStart() {
        super.onStart();
        this.A00.A0D = true;
    }
}
