package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.84F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84F {
    public C1817984o A00;
    public final ClipsAudioStore A01;
    public final C84R A02;
    public final C84S A03;
    public final C1817884n A04;
    public final C84G A05;
    public final C1816984b A06;
    public final C14090nZ A07;
    public final C19L A08;

    public C84F(Context context, C12N c12n, UserSession userSession, C49602Pt c49602Pt) {
        C14360o3.A0B(c12n, 4);
        C19K A02 = AnonymousClass194.A02(((C12M) c12n).A04);
        this.A08 = A02;
        C14090nZ AOT = c12n.AOT(1335631354, 2);
        this.A07 = AOT;
        C84G c84g = new C84G();
        this.A05 = c84g;
        ClipsAudioStore clipsAudioStore = new ClipsAudioStore(context, userSession, c84g, c49602Pt, AOT, A02);
        this.A01 = clipsAudioStore;
        C84R c84r = new C84R();
        this.A02 = c84r;
        C84S c84s = new C84S(context, userSession, clipsAudioStore, c84g, c49602Pt, A02);
        this.A03 = c84s;
        this.A06 = new C1816984b(context, userSession, clipsAudioStore, c84r, c84s, c84g, c49602Pt, A02);
        this.A04 = new C1817884n(userSession);
        this.A00 = new C1817984o(c12n, userSession, c84g, A02);
    }

    public final void A00() {
        ClipsAudioStore clipsAudioStore = this.A01;
        clipsAudioStore.A05();
        C84K c84k = clipsAudioStore.A0A;
        Map map = c84k.A02;
        map.clear();
        C84K.A00(c84k, map);
        C05A c05a = clipsAudioStore.A0S;
        C16930sl c16930sl = C16930sl.A00;
        c05a.Egh(c16930sl);
        clipsAudioStore.A0I.Egh(new C84P(new LinkedHashMap(), new LinkedHashMap()));
        clipsAudioStore.A0T.Egh(null);
        clipsAudioStore.A0L.Egh(null);
        clipsAudioStore.A0K.Egh(null);
        C05A c05a2 = this.A05.A02;
        C14360o3.A0B(c05a2.getValue(), 0);
        C14360o3.A0B(c16930sl, 0);
        c05a2.Egh(new C84B(c16930sl, false));
        this.A00.A04.clear();
        AnonymousClass194.A05(null, this.A08);
    }
}
