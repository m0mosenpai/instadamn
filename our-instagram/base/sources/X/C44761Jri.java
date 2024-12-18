package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Iterator;

/* renamed from: X.Jri, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44761Jri extends C3OO {
    public final Context A00;
    public final FrameLayout A01;
    public final C45510KCz A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44761Jri(FrameLayout frameLayout, C45510KCz c45510KCz) {
        super(frameLayout);
        C14360o3.A0B(frameLayout, 1);
        this.A01 = frameLayout;
        this.A02 = c45510KCz;
        this.A00 = AbstractC166997dE.A0L(frameLayout);
    }

    public final C45696KKz A00() {
        Object next;
        Iterator it = AbstractC224517h.A06(MLL.A00, new C011003y(this.A01)).iterator();
        if (!it.hasNext()) {
            next = null;
            return (C45696KKz) next;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return (C45696KKz) next;
    }

    public final void A01() {
        this.itemView.post(new M2E(this));
    }
}
