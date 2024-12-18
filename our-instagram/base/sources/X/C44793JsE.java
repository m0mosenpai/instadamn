package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;

/* renamed from: X.JsE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44793JsE extends C3OO implements C3Y7 {
    public C75113Zb A00;
    public final View A01;
    public final C3W4 A02;
    public final IgProgressImageView A03;
    public final MediaActionsView A04;
    public final C86013sY A05;
    public final C86183sp A06;
    public final InterfaceC74623Ww A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44793JsE(View view, View view2, C3W4 c3w4, C86013sY c86013sY, IgProgressImageView igProgressImageView, MediaActionsView mediaActionsView, InterfaceC74623Ww interfaceC74623Ww) {
        super(view);
        AbstractC167007dF.A1G(igProgressImageView, 3, mediaActionsView);
        this.A01 = view2;
        this.A03 = igProgressImageView;
        this.A07 = interfaceC74623Ww;
        this.A04 = mediaActionsView;
        this.A02 = c3w4;
        this.A05 = c86013sY;
        this.A06 = new C86183sp(c86013sY);
        view.setTag(this);
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A04;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A03;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A00;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return this.A06;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A07;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A04.getWidth();
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        this.A03.A06(i);
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        this.A03.A09(interfaceC11380iw, imageUrl, z);
    }
}
