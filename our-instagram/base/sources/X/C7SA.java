package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7SA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SA implements C7QD {
    public final C57012jc A00;
    public final InterfaceC165097Zy A01;

    public final void A00(final C158897Bb c158897Bb) {
        C57012jc c57012jc = this.A00;
        c57012jc.A03(0);
        ImageView imageView = (ImageView) c57012jc.A01();
        imageView.setBackgroundColor(c158897Bb.A01);
        imageView.setImageTintList(ColorStateList.valueOf(c158897Bb.A02));
        final DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(c158897Bb.A03, c158897Bb.A04, null);
        C0fQ.A00(new View.OnClickListener() { // from class: X.76G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-498789471);
                InterfaceC165097Zy interfaceC165097Zy = C7SA.this.A01;
                if (!((InterfaceC165507ad) interfaceC165097Zy).CQu()) {
                    DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
                    C158897Bb c158897Bb2 = c158897Bb;
                    interfaceC165097Zy.AWb(c158897Bb2.A03, directMessageIdentifier2, c158897Bb2.A00, c158897Bb2.A05);
                }
                C0f9.A0C(1336012694, A05);
            }
        }, imageView);
    }

    @Override // X.C7QD
    public final View BKF() {
        View view;
        C57012jc c57012jc = this.A00;
        if (c57012jc.A00 != null) {
            view = c57012jc.A01();
        } else {
            view = c57012jc.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7SA(C57012jc c57012jc, InterfaceC165097Zy interfaceC165097Zy) {
        this.A00 = c57012jc;
        this.A01 = interfaceC165097Zy;
    }
}
