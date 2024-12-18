package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3k5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81353k5 extends AbstractC81363k6 implements C3Y7 {
    public final UserSession A00;
    public final InterfaceC74323Vo A01;

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return null;
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
    }

    private C73203Pv A00() {
        int i;
        C5IV c5iv = this.A09;
        if (c5iv == null || (i = c5iv.A02) < 0) {
            return null;
        }
        C3OO A0V = this.A08.A0V(i);
        if (C18U.A06(C06090Tz.A05, this.A00, 36325695223248146L) && !(A0V instanceof C73203Pv)) {
            return null;
        }
        return (C73203Pv) A0V;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A08;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        C5IV c5iv = this.A09;
        if (c5iv == null) {
            return null;
        }
        return c5iv.A09;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        KeyEvent.Callback A0d;
        C5IV c5iv = this.A09;
        if (c5iv != null) {
            AbstractC70663Fe abstractC70663Fe = this.A08.A0D;
            int i = c5iv.A02;
            if (abstractC70663Fe != null && i >= 0 && (A0d = abstractC70663Fe.A0d(i)) != null) {
                return (InterfaceC74623Ww) A0d;
            }
            return null;
        }
        return null;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Vo] */
    public C81353k5(View view, UserSession userSession) {
        super(view);
        this.A01 = new Object();
        this.A00 = userSession;
    }

    @Override // X.C3Y7
    public final View BGa() {
        C73203Pv A00 = A00();
        if (A00 != null) {
            return A00.A0C;
        }
        return null;
    }

    @Override // X.C3Y7
    public final int CFi() {
        View BGa = BGa();
        if (BGa != null) {
            return BGa.getWidth();
        }
        return 0;
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        IgImageView igImageView;
        C73203Pv A00 = A00();
        if (A00 != null && (igImageView = A00.A0C) != null) {
            igImageView.A0D(interfaceC11380iw, null, imageUrl, z);
        }
    }
}
