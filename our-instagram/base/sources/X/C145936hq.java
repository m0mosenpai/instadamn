package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145936hq {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final Map A03;
    public final C145946hr A04;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6hr] */
    public C145936hq(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = new HashMap();
        this.A04 = new C1NJ() { // from class: X.6hr
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C145936hq.this.A03.remove(interfaceC59502nt.Ba1());
                DLog.d(DLogTag.CANVAS.INSTANCE, AnonymousClass001.A0R("Fetched ", VS4.A00(interfaceC59502nt.Ba1())), new Object[0]);
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C145936hq.this.A03.remove(interfaceC59502nt.Ba1());
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
            }
        };
    }

    public static final void A00(C145936hq c145936hq, ImageUrl imageUrl) {
        Map map = c145936hq.A03;
        String url = imageUrl.getUrl();
        if (!map.containsKey(url)) {
            C1OG A0J = C25821No.A00().A0J(imageUrl, c145936hq.A01.getModuleName());
            A0J.A0I = true;
            A0J.A0F = true;
            A0J.A02(c145936hq.A04);
            InterfaceC59502nt A00 = A0J.A00();
            map.put(url, A00);
            DLogTag.CANVAS canvas = DLogTag.CANVAS.INSTANCE;
            C14360o3.A07(url);
            DLog.d(canvas, AnonymousClass001.A0R("Enqueue ", VS4.A00(url)), new Object[0]);
            A00.E7X();
        }
    }
}
