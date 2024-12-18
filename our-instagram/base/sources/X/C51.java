package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* loaded from: classes5.dex */
public final class C51 extends C25370BKn implements C3Y7 {
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
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Vo] */
    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return new Object();
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        SimpleVideoLayout simpleVideoLayout = this.A05;
        if (simpleVideoLayout == null) {
            return new SimpleVideoLayout(AbstractC166997dE.A0L(this.A09), null, 0);
        }
        return simpleVideoLayout;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A08.getWidth();
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A05;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A03;
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        IgImageView igImageView = this.A01;
        if (igImageView != null) {
            igImageView.setUrl(imageUrl, interfaceC11380iw);
        }
    }
}
