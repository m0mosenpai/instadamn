package X;

import java.lang.ref.WeakReference;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class WYD implements C4SK {
    public WeakReference A00;
    public final C95804So A01;
    public final C4T2 A02;
    public final Integer A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.4So] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.4T2, X.0Zx] */
    public WYD(C4AN c4an, WeakReference weakReference) {
        String str;
        C14360o3.A0B(c4an, 1);
        this.A00 = weakReference;
        ?? c0Zx = new C0Zx();
        c0Zx.A05("media_id", Long.valueOf(AbstractC68330VMq.A00(c4an.A0G)));
        c0Zx.A01(EnumC95784Sm.ORGANIC, AbstractC43591JPw.A00(484));
        c0Zx.A06(AbstractC111324zv.A00(4231), MediaStreamTrack.VIDEO_TRACK_KIND);
        c0Zx.A06("player_format", "inline");
        c0Zx.A06(AbstractC111324zv.A00(5060), c4an.A0A);
        c0Zx.A06("player_suborigin", c4an.A0B);
        this.A01 = c0Zx;
        this.A03 = C05F.A08;
        ?? c0Zx2 = new C0Zx();
        C4AK c4ak = c4an.A07;
        if (c4ak != null) {
            int ordinal = c4ak.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2) {
                    str = "progressive";
                }
            } else {
                str = "dash";
            }
            c0Zx2.A06(AbstractC43591JPw.A00(1396), str);
            this.A02 = c0Zx2;
        }
        str = null;
        c0Zx2.A06(AbstractC43591JPw.A00(1396), str);
        this.A02 = c0Zx2;
    }

    @Override // X.C4SK
    public final C95224Qi BOk() {
        return null;
    }

    @Override // X.C4SK
    public final Integer BTX() {
        return this.A03;
    }

    @Override // X.C4SK
    public final C95804So BoM() {
        return this.A01;
    }

    @Override // X.C4SK
    public final /* synthetic */ C4T2 BHi(String str) {
        return null;
    }

    @Override // X.C4SK
    public final /* synthetic */ C0eB EW8(C4T2 c4t2, String str) {
        return null;
    }
}
