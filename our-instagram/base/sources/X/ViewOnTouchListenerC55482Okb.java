package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Okb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55482Okb implements View.OnTouchListener {
    public final /* synthetic */ C168717g5 A00;
    public final /* synthetic */ User A01;

    public ViewOnTouchListenerC55482Okb(C168717g5 c168717g5, User user) {
        this.A00 = c168717g5;
        this.A01 = user;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C168717g5 c168717g5 = this.A00;
            User user = this.A01;
            C169267gz c169267gz = c168717g5.A02;
            if (c169267gz != null) {
                N6J n6j = c169267gz.A00;
                NK9 nk9 = N6J.A06(n6j).A0I;
                ArrayList A1N = AbstractC16960so.A1N(user);
                C05A c05a = nk9.A05;
                List A1A = MSW.A1A(c05a);
                A1N.addAll(A1A);
                C14360o3.A0B(A1A, 0);
                ArrayList A0i = AbstractC167007dF.A0i(A1A);
                Iterator it = A1A.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(A0i, it);
                }
                ArrayList A0i2 = AbstractC167007dF.A0i(A1N);
                Iterator it2 = A1N.iterator();
                while (it2.hasNext()) {
                    AbstractC167017dG.A1V(A0i2, it2);
                }
                C14360o3.A0B(A0i, 0);
                if (A0i.size() != A0i2.size() || !A0i.containsAll(A0i2) || !A0i2.containsAll(A0i)) {
                    c05a.Egh(AbstractC001800i.A0a(A1N));
                }
                if (N6J.A06(n6j).A0I.A00 != null) {
                    OFX ofx = n6j.A06;
                    if (ofx != null) {
                        ofx.A0A.A0C.clear();
                        OFX ofx2 = n6j.A06;
                        if (ofx2 != null) {
                            IgAutoCompleteTextView igAutoCompleteTextView = ofx2.A0A;
                            igAutoCompleteTextView.A0C.add(new O7V(n6j, user));
                            return false;
                        }
                    }
                    C14360o3.A0F("viewHolder");
                    throw C00O.createAndThrow();
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
