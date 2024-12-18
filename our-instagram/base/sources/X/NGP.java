package X;

import android.content.Context;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class NGP extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InlineAddHighlightFragment A01;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC58138Pq3 interfaceC58138Pq3 = this.A01.mDelegate;
        if (interfaceC58138Pq3 != null) {
            final ImageUrl AsN = interfaceC58138Pq3.AsN(this.A00);
            C11T.A02(new Runnable() { // from class: X.PPl
                @Override // java.lang.Runnable
                public final void run() {
                    NGP ngp = NGP.this;
                    ImageUrl imageUrl = AsN;
                    if (imageUrl != null) {
                        InlineAddHighlightFragment.A03(ngp.A01, imageUrl);
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGP(Context context, InlineAddHighlightFragment inlineAddHighlightFragment) {
        super(1868702979);
        this.A01 = inlineAddHighlightFragment;
        this.A00 = context;
    }
}
