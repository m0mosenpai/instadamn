package X;

import android.widget.ImageView;
import com.instagram.api.schemas.CommentGiphyMediaInfo;

/* renamed from: X.M3z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49958M3z implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ C45487KCc A01;

    public RunnableC49958M3z(CommentGiphyMediaInfo commentGiphyMediaInfo, C45487KCc c45487KCc) {
        this.A01 = c45487KCc;
        this.A00 = commentGiphyMediaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45487KCc c45487KCc = this.A01;
        InterfaceC56392iX interfaceC56392iX = c45487KCc.A0L;
        if (interfaceC56392iX != null) {
            C74P A00 = AbstractC47851LBu.A00(interfaceC56392iX.getView(), this.A00, AbstractC166987dD.A0r(c45487KCc.A0i));
            if (A00 != null) {
                InterfaceC56392iX interfaceC56392iX2 = c45487KCc.A0L;
                if (interfaceC56392iX2 != null) {
                    ((ImageView) interfaceC56392iX2.getView()).setImageDrawable(A00);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("gifPogViewStub");
        throw C00O.createAndThrow();
    }
}
