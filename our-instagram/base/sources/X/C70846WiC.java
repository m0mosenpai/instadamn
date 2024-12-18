package X;

import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.WiC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70846WiC implements InterfaceC57132jo {
    public V6p A00;
    public final C57112jm A01;
    public final MediaMapFragment A02;
    public final MediaMapFragment A03;
    public final Wi6 A04;
    public final C70841Wi7 A05;
    public final java.util.Set A09 = new HashSet();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final java.util.Set A08 = new HashSet();

    public C70846WiC(UserSession userSession, C57112jm c57112jm, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2) {
        this.A01 = c57112jm;
        this.A03 = mediaMapFragment;
        this.A02 = mediaMapFragment2;
        this.A05 = new C70841Wi7(mediaMapFragment2);
        this.A04 = new Wi6(mediaMapFragment2);
        this.A00 = new V6p(C1BX.A00(AbstractC62752tE.A00(userSession, AbstractC111324zv.A00(2704))), mediaMapFragment2);
        c57112jm.A00 = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[SYNTHETIC] */
    @Override // X.InterfaceC57132jo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DiQ() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70846WiC.DiQ():void");
    }
}
