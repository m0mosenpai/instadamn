package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.WTd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70375WTd implements InterfaceC71968XDa {
    public final C69704Vtz A00;
    public final int A01;
    public final C70394WTw A02;
    public final UserSession A03;
    public final MQD A04;
    public final Map A05 = new HashMap();

    @Override // X.InterfaceC71968XDa
    public final void ADe(C71196Wpl c71196Wpl, VZu vZu) {
        ((KYY) vZu.A00).invalidateDrawable(null);
    }

    @Override // X.InterfaceC71968XDa
    public final VZu ALm(C71196Wpl c71196Wpl, int i) {
        String name;
        LinkedList A04 = c71196Wpl.A04();
        Collections.sort(A04, new C65903Tw9(12));
        Object peek = A04.peek();
        peek.getClass();
        MediaMapPin mediaMapPin = (MediaMapPin) peek;
        Venue A00 = AbstractC69973Vyo.A00(mediaMapPin.A09);
        if (A00.A00.getShortName() != null) {
            name = A00.A00.getShortName();
        } else {
            name = A00.A00.getName();
        }
        C70394WTw c70394WTw = this.A02;
        String str = mediaMapPin.A0D;
        ImageUrl A002 = mediaMapPin.A00();
        String A01 = AbstractC69973Vyo.A01(mediaMapPin);
        double d = c71196Wpl.A03().A00;
        double d2 = c71196Wpl.A03().A01;
        AbstractC13880nE.A04(c70394WTw.A0G, 64);
        KYY kyy = new KYY(null, c71196Wpl, c70394WTw, A002, this.A04, str, A01, name, d, d2, this.A01, AbstractC167007dF.A1W(mediaMapPin.A08), AbstractC167007dF.A1W(mediaMapPin.A03), false);
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            this.A05.put(it.next(), new WeakReference(kyy));
        }
        return new VZu(kyy);
    }

    @Override // X.InterfaceC71968XDa
    public final void Aon(WFW wfw, C2TB c2tb, Collection collection, float f) {
        this.A00.A00(wfw, c2tb, collection, new HashMap());
    }

    public C70375WTd(C70394WTw c70394WTw, UserSession userSession, MQD mqd, Collection collection, int i, int i2) {
        this.A02 = c70394WTw;
        this.A04 = mqd;
        this.A01 = i;
        this.A00 = new C69704Vtz(null, collection, i2);
        this.A03 = userSession;
    }

    @Override // X.InterfaceC71968XDa
    public final void EF8(C71196Wpl c71196Wpl) {
        Iterator it = c71196Wpl.A04().iterator();
        while (it.hasNext()) {
            this.A05.remove(it.next());
        }
    }
}
