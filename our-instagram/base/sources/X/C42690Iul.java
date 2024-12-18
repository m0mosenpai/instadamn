package X;

import android.view.View;

/* renamed from: X.Iul, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42690Iul implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;

    public C42690Iul(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                C65867TvU c65867TvU = (C65867TvU) this.A01;
                AbstractC37304Gc5.A16(AbstractC166987dD.A0f(c65867TvU.A0T.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_not_interested_tap");
                c65867TvU.Dm1();
                return;
            case 1:
                IC2 ic2 = ((AnonymousClass308) this.A01).A08;
                if (ic2 == null) {
                    return;
                }
                C38P c38p = ic2.A00;
                C38084GpD c38084GpD = c38p.A08;
                if (c38084GpD == null) {
                    str = "exploreMultiHideLogger";
                } else {
                    AbstractC37304Gc5.A16(AbstractC166987dD.A0f(c38084GpD.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_not_interested_tap");
                    JPU jpu = c38p.A0B;
                    if (jpu == null) {
                        str = "headerController";
                    } else {
                        jpu.Dm1();
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                IN8 in8 = (IN8) this.A01;
                ((C39411Hav) in8.A02).A01.invoke(in8);
                return;
            case 3:
                ((C41210ILz) this.A01).A00();
                return;
            default:
                HL4.A03((HL4) this.A01, false);
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (2 - this.A00 == 0) {
            ((IN8) this.A01).A00 = null;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
