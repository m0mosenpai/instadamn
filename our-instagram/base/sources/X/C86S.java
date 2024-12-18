package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.SmartGalleryViewModel$dismissTransitionEvent$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.86S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86S extends AbstractC52922bZ {
    public Integer A00;
    public WeakReference A01;
    public final C2GT A02;
    public final C2GT A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C0UO A0D;
    public final C0UO A0E;
    public final C0UO A0F;
    public final UserSession A0G;
    public final C0UO A0H;

    public C86S(UserSession userSession) {
        this.A0G = userSession;
        C008002u c008002u = new C008002u(false);
        this.A07 = c008002u;
        this.A0D = c008002u;
        C008002u c008002u2 = new C008002u(0);
        this.A0A = c008002u2;
        this.A0F = AbstractC208910l.A02(c008002u2);
        C008002u A00 = C10E.A00(null);
        this.A0C = A00;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A05 = c24721Ip;
        C008002u c008002u3 = new C008002u(true);
        this.A0B = c008002u3;
        C24721Ip c24721Ip2 = new C24721Ip(0);
        this.A04 = c24721Ip2;
        this.A06 = AbstractC07080Za.A03(c24721Ip);
        this.A01 = new WeakReference(null);
        C008002u c008002u4 = new C008002u(C86T.A04);
        this.A08 = c008002u4;
        AnonymousClass059 A02 = AbstractC208910l.A02(c008002u4);
        this.A0H = A02;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A02);
        C008002u c008002u5 = new C008002u(false);
        this.A09 = c008002u5;
        this.A0E = AbstractC208910l.A02(c008002u5);
        this.A02 = AbstractC58232lf.A00(anonymousClass191, C10Q.A03(new SmartGalleryViewModel$dismissTransitionEvent$1(this, null), c008002u3, AbstractC07080Za.A03(c24721Ip2)));
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C9D3(this, null, 33), A00));
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C9D0(this, null, 29), A02));
    }

    public final void A01(List list) {
        C14360o3.A0B(list, 0);
        C05A c05a = this.A0C;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9NH c9nh = (C9NH) it.next();
            arrayList.add(new C206209Bd(c9nh.A01, c9nh.A00));
        }
        c05a.Egh(arrayList);
    }

    public final boolean A02(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (c55u instanceof C81V) {
            if (C18U.A06(C06090Tz.A05, this.A0G, 36328469772123693L)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A03(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (this.A0H.getValue() != C86T.A03 && !A02(c55u)) {
            return false;
        }
        return true;
    }

    public final void A00() {
        Object value;
        C86T c86t;
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
            int ordinal = ((C86T) value).ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        c86t = C86T.A03;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    c86t = C86T.A02;
                }
            } else {
                c86t = C86T.A04;
            }
        } while (!c05a.AIi(value, c86t));
    }
}
