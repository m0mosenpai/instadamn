package X;

import android.view.View;
import android.view.ViewStub;

@Deprecated
/* renamed from: X.2jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57012jc {
    public View A00;
    public ViewStub A01;
    public InterfaceC69513Al A02;

    public final int A00() {
        View view = this.A00;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public final View A01() {
        ViewStub viewStub;
        View view = this.A00;
        if (view == null && (viewStub = this.A01) != null) {
            view = viewStub.inflate();
            this.A00 = view;
            this.A01 = null;
        }
        InterfaceC69513Al interfaceC69513Al = this.A02;
        if (interfaceC69513Al != null && view != null) {
            interfaceC69513Al.DLu(view);
            this.A02 = null;
        }
        return this.A00;
    }

    public final void A02() {
        A03(8);
    }

    public final void A03(int i) {
        View A01;
        if (i == 8) {
            A01 = this.A00;
            if (A01 == null) {
                return;
            }
        } else {
            A01 = A01();
        }
        A01.setVisibility(i);
    }

    public final boolean A04() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    public C57012jc(ViewStub viewStub) {
        this.A01 = viewStub;
    }
}
