package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.3k4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81343k4 implements C3Y7 {
    public final View A00;
    public final IgImageView A01;
    public final SegmentedProgressBar A02;
    public final C75113Zb A03;
    public final C73203Pv A04;
    public final BRU A05;

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

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A01.setUrl(imageUrl, interfaceC11380iw);
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A05;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final View BQt() {
        View view = this.A04.itemView;
        C14360o3.A06(view);
        return view;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A03;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        KeyEvent.Callback callback = this.A04.itemView;
        C14360o3.A0C(callback, "null cannot be cast to non-null type com.instagram.ui.widget.videocontainer.TextureViewContainer");
        return (InterfaceC74623Ww) callback;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A01.getWidth();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.BRU, java.lang.Object] */
    public C81343k4(C75113Zb c75113Zb, C73203Pv c73203Pv) {
        SegmentedProgressBar segmentedProgressBar;
        this.A04 = c73203Pv;
        this.A03 = c75113Zb;
        View view = c73203Pv.itemView;
        C14360o3.A06(view);
        this.A00 = view;
        IgImageView igImageView = c73203Pv.A0C;
        C14360o3.A06(igImageView);
        this.A01 = igImageView;
        NSE nse = c73203Pv.A0H;
        if (nse != null) {
            segmentedProgressBar = (SegmentedProgressBar) nse.A02.getValue();
        } else {
            segmentedProgressBar = null;
        }
        this.A02 = segmentedProgressBar;
        this.A05 = new Object();
    }
}
