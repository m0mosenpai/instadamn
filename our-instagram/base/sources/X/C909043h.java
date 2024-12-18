package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.43h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C909043h extends C3OO implements C33R {
    public Activity A00;
    public C85083qw A01;
    public C75113Zb A02;
    public boolean A03;
    public ViewStub A04;
    public C41L A05;
    public final View A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909043h(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A06 = view;
        this.A05 = (C41L) view.requireViewById(R.id.carousel_page_indicator);
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C9BH c9bh;
        InterfaceC16620sF interfaceC16620sF;
        C14360o3.A0B(c75113Zb, 0);
        if (A00() != null) {
            if (i != 4) {
                if (i != 16) {
                    if (i != 38) {
                        if (i != 47) {
                            if (i == 54) {
                                C41L A00 = A00();
                                if (A00 != null) {
                                    A00.setDarkMode(false);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            return;
                        }
                        C41L A002 = A00();
                        if (A002 != null) {
                            A002.A0B = false;
                            C41L A003 = A00();
                            if (A003 != null) {
                                A003.A01 = 0.0f;
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    C41L A004 = A00();
                    if (A004 != null) {
                        A004.setPageCount(c75113Zb.A04);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                C85083qw c85083qw = this.A01;
                if (c85083qw == null || !c85083qw.A07) {
                    return;
                }
                C41L A005 = A00();
                if (A005 != null) {
                    C116785Qh c116785Qh = new C116785Qh(A005);
                    C85083qw c85083qw2 = this.A01;
                    if (c85083qw2 == null || (c9bh = c85083qw2.A01) == null || (interfaceC16620sF = (InterfaceC16620sF) c9bh.A00) == null) {
                        return;
                    }
                    interfaceC16620sF.invoke(this.A00, c116785Qh);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C41L A006 = A00();
            if (A006 != null) {
                A006.setCurrentPage(c75113Zb.A02);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final C41L A00() {
        C41L c41l = this.A05;
        if (c41l == null) {
            ViewStub viewStub = this.A04;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.pageindicator.PageIndicator");
                C41L c41l2 = (C41L) inflate;
                this.A05 = c41l2;
                this.A03 = true;
                return c41l2;
            }
            throw new IllegalStateException("Either mCarouselIndicator or mCarouselIndicatorStub should be non-null");
        }
        return c41l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909043h(ViewStub viewStub, View view) {
        super(view);
        C14360o3.A0B(viewStub, 2);
        this.A06 = view;
        this.A04 = viewStub;
    }
}
