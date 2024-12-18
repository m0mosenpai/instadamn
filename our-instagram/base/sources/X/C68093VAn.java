package X;

import android.content.Context;
import android.widget.Adapter;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.VAn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68093VAn extends AbstractC674232h {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C67969V4i A01;

    @Override // X.AbstractC674232h
    public final void A01(Adapter adapter, int i) {
        C71133Gz c71133Gz;
        V2M v2m;
        ImageInfo imageInfo;
        Object item = adapter.getItem(i);
        if (item != null) {
            XLM xlm = (XLM) item;
            int ordinal = xlm.CBa().ordinal();
            if (ordinal != 2) {
                if (ordinal != 7) {
                    if (ordinal == 3) {
                        c71133Gz = this.A01.A01;
                        if (c71133Gz != null) {
                            imageInfo = ((V2P) xlm).A00;
                            c71133Gz.A01(AbstractC40161tk.A01(this.A00, imageInfo));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    return;
                }
                XLM xlm2 = (XLM) ((V2O) xlm).A00.A00.get(0);
                C14360o3.A0C(xlm2, AbstractC111324zv.A00(482));
                v2m = (V2M) xlm2;
                c71133Gz = this.A01.A01;
                if (c71133Gz == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                c71133Gz = this.A01.A01;
                if (c71133Gz != null) {
                    v2m = (V2M) xlm;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            imageInfo = v2m.A01;
            c71133Gz.A01(AbstractC40161tk.A01(this.A00, imageInfo));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68093VAn(Context context, C67969V4i c67969V4i) {
        super(3);
        this.A01 = c67969V4i;
        this.A00 = context;
    }
}
