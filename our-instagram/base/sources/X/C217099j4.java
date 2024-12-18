package X;

import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Draft;
import java.lang.ref.WeakReference;

/* renamed from: X.9j4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217099j4 extends AbstractRunnableC14200nk {
    public final /* synthetic */ Draft A00;
    public final /* synthetic */ C189038Yt A01;
    public final /* synthetic */ WeakReference A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217099j4(Draft draft, C189038Yt c189038Yt, WeakReference weakReference) {
        super(1910247448, 3, false, false);
        this.A01 = c189038Yt;
        this.A00 = draft;
        this.A02 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189038Yt c189038Yt = this.A01;
        Draft draft = this.A00;
        WeakReference weakReference = this.A02;
        BCZ bcz = (BCZ) weakReference.get();
        if (bcz != null && bcz.CXY(draft)) {
            String str = draft.A03;
            if (str == null) {
                C0w9.A01(EnumC12410kj.A03, "DraftThumbnailLoader", "thumbnailImageFilePath in DraftThumbnailLoader::loadThumbnail is null");
                return;
            }
            BitmapFactory.Options options = c189038Yt.A01;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int i3 = c189038Yt.A00;
            int i4 = 1;
            while (i / i4 > i3 && i2 / i4 > i3) {
                i4 *= 2;
            }
            C1OG A0J = C25821No.A00().A0J(AbstractC81033jX.A01(AbstractC166987dD.A11(str)), null);
            A0J.A0I = false;
            A0J.A08 = new C22870A6q(draft, weakReference);
            A0J.A02(c189038Yt);
            A0J.A01 = i4;
            A0J.A01();
        }
    }
}
