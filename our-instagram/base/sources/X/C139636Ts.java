package X;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6Ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139636Ts {
    public TextView A00;
    public TextView A01;
    public IgProgressImageView A02;
    public MediaFrameLayout A03;
    public final FrameLayout A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;

    public final MediaFrameLayout A00() {
        MediaFrameLayout mediaFrameLayout = this.A03;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout;
        }
        C14360o3.A0F("mediaCardContainer");
        throw C00O.createAndThrow();
    }

    public final void A01() {
        if (this.A03 != null) {
            A00().setVisibility(8);
        }
    }

    public C139636Ts(FrameLayout frameLayout, InterfaceC56392iX interfaceC56392iX, InterfaceC56392iX interfaceC56392iX2) {
        this.A04 = frameLayout;
        this.A06 = interfaceC56392iX;
        this.A05 = interfaceC56392iX2;
    }
}
