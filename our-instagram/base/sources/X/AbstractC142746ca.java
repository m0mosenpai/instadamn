package X;

import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC142746ca {
    public static InterfaceC1118853a A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.6Wl, java.lang.Object, X.1vN] */
    public static final void A00() {
        InterfaceC1118853a interfaceC1118853a = A00;
        if (interfaceC1118853a != null) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
            C41551w4 c41551w4 = reelViewerFragment.A0a;
            c41551w4.getClass();
            Reel reel = c41551w4.A0H;
            InterfaceC147086jk interfaceC147086jk = reelViewerFragment.A0k;
            String id = reel.getId();
            C41551w4 c41551w42 = reelViewerFragment.A0a;
            c41551w42.getClass();
            interfaceC147086jk.DpL(c41551w42, id);
            C6Z1.A00(reelViewerFragment.getSession()).A01(reel);
            C41551w4 c41551w43 = reelViewerFragment.A0a;
            c41551w43.getClass();
            c41551w43.A0H.A1q = true;
            C25671My A002 = AbstractC25651Mw.A00(reelViewerFragment.getSession());
            Reel reel2 = reelViewerFragment.A0a.A0H;
            ?? obj = new Object();
            obj.A00 = reel2;
            A002.E4s(obj);
        }
    }
}
