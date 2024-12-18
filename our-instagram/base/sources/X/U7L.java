package X;

import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes11.dex */
public final class U7L implements Callable {
    public Object A00;
    public final int A01;
    public final Object A02;

    public U7L(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.A01) {
            case 0:
                try {
                    InterfaceC71998XEm interfaceC71998XEm = (InterfaceC71998XEm) ((Future) this.A02).get();
                    if (interfaceC71998XEm != null) {
                        interfaceC71998XEm.release();
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    AbstractC58318PtA.A1F(((WG8) this.A00).A0D, th, 7);
                    return null;
                }
            case 1:
                InterfaceC71998XEm interfaceC71998XEm2 = (InterfaceC71998XEm) ((Future) this.A02).get();
                try {
                    AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "scheduleReleaseDemuxDecodeWrapper: demuxDecodeWrapper.release", new Object[0]);
                    interfaceC71998XEm2.release();
                    return null;
                } catch (Throwable th2) {
                    AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "scheduleReleaseDemuxDecodeWrapper: Throwable=%s", th2);
                    throw new Exception("async release failed", th2);
                }
            case 2:
                ((AbstractC68258VJv) this.A02).A00((List) this.A00);
                return C0eB.A00;
            case 3:
                U7H u7h = (U7H) this.A02;
                U7K u7k = U7H.A04;
                u7h.A02.set(true);
                Object A03 = u7h.A03((Object[]) this.A00);
                AbstractC58318PtA.A1F(U7H.A04, new U7J(u7h, A03), 1);
                return A03;
            default:
                FilmstripTimelineView filmstripTimelineView = ((C23805AgG) this.A02).A05;
                if (filmstripTimelineView == null) {
                    C14360o3.A0F("trimmerTimelineView");
                    throw C00O.createAndThrow();
                }
                C22952A9w c22952A9w = (C22952A9w) this.A00;
                filmstripTimelineView.A01(c22952A9w.A00, c22952A9w.A01);
                return true;
        }
    }

    public U7L(U7H u7h) {
        this.A01 = 3;
        this.A02 = u7h;
    }
}
