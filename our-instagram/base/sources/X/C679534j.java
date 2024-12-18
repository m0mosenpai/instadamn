package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.34j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C679534j implements InterfaceC43071ya {
    public final Rect A00;
    public final Rect A01;
    public final UserSession A02;
    public final C679434i A03;
    public final C679334h A04;
    public final List A05;
    public final boolean A06;
    public final Map A07;

    public C679534j(UserSession userSession, C679434i c679434i, C679334h c679334h) {
        this();
        this.A05 = new ArrayList();
        this.A00 = new Rect();
        this.A01 = new Rect();
        this.A02 = userSession;
        this.A03 = c679434i;
        this.A04 = c679334h;
        this.A06 = true;
    }

    private void A00(Object obj, Object obj2, String str, double d, double d2, int i, long j) {
        C38321qM c38321qM = (C38321qM) obj;
        String A0F = AbstractC41071vF.A0F(this.A02, c38321qM);
        A0F.getClass();
        String A0u = AnonymousClass001.A0u(Integer.toHexString(A0F.hashCode()), c38321qM.getId(), str, Integer.toString(i));
        if (d2 < d) {
            Map map = this.A07;
            if (!map.containsKey(A0u)) {
                map.put(A0u, new C5ML(this, obj, j, ((C75113Zb) obj2).A0o()));
                return;
            }
        }
        if (d2 < d) {
            return;
        }
        Map map2 = this.A07;
        if (!map2.containsKey(A0u)) {
            return;
        }
        C5ML c5ml = (C5ML) map2.get(A0u);
        long j2 = j - c5ml.A00;
        boolean z = c5ml.A02;
        C679434i c679434i = this.A03;
        C30W c30w = c679434i.A01;
        InterfaceC60442pS interfaceC60442pS = c679434i.A02;
        UserSession userSession = c30w.A00;
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "viewability");
        A04.A0G(userSession, c38321qM);
        A04.A01 = j2 / 1000.0d;
        A04.A7Y = str;
        A04.A0U = i;
        A04.A1Z = Boolean.valueOf(z);
        C30X.A01(A04);
        C32U.A0I(c679434i.A00, A04, interfaceC60442pS, C05F.A01);
        map2.remove(A0u);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        int i;
        int i2;
        long BmE = interfaceC57162jr.BmE();
        Object obj = c59062n7.A03;
        C38321qM c38321qM = (C38321qM) obj;
        Object obj2 = c59062n7.A04;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        Rect rect = this.A00;
        interfaceC57162jr.BA8(rect, c59062n7);
        float height = rect.height();
        C679334h c679334h = this.A04;
        HashMap hashMap = c679334h.A0D;
        Number number = (Number) hashMap.get(c38321qM.getId());
        if (number == null) {
            Context context = c679334h.A08;
            UserSession userSession = c679334h.A09;
            InterfaceC60442pS interfaceC60442pS = c679334h.A0A;
            C76873cZ c76873cZ = new C76873cZ(context, userSession, c38321qM, c75113Zb, interfaceC60442pS.getModuleName(), true);
            int A0m = c679334h.A06 + ((int) (c679334h.A01 / c38321qM.A0m()));
            if (AbstractC75103Za.A0Q(c38321qM, c75113Zb.A03)) {
                i = c679334h.A03;
            } else {
                i = 0;
            }
            int i3 = A0m + i + c679334h.A07;
            C38321qM c38321qM2 = c38321qM;
            if (AbstractC75103Za.A0L(c38321qM, c75113Zb.A03)) {
                if (c38321qM.A5M()) {
                    c38321qM2 = c38321qM.A1e(c75113Zb.A03);
                }
                C57332k8 c57332k8 = c679334h.A0C;
                c38321qM2.getClass();
                C84923qg A1W = c38321qM2.A1W();
                A1W.getClass();
                i2 = c57332k8.A0C(context, A1W, AbstractC53242c7.A0F(context, R.attr.textColorBoldLink)).getHeight();
            } else {
                i2 = 0;
            }
            int i4 = i3 + i2;
            int i5 = 0;
            if (c76873cZ.A03) {
                Layout A0D = c679334h.A0C.A0D(context, c76873cZ.A00(), c679334h.A0B, c76873cZ.A04, false, false, false, AbstractC75103Za.A0I(c76873cZ.A00(), 0));
                C679334h.A00(A0D, c679334h);
                i5 = A0D.getHeight() + c679334h.A05;
            }
            int i6 = i4 + i5;
            int i7 = 0;
            if (c76873cZ.A07) {
                Iterator it = Collections.unmodifiableList(c76873cZ.A02).iterator();
                while (it.hasNext()) {
                    Layout A0D2 = c679334h.A0C.A0D(context, (C84923qg) it.next(), c679334h.A0B, c76873cZ.A04, false, false, false, false);
                    C679334h.A00(A0D2, c679334h);
                    i7 += A0D2.getHeight() + c679334h.A05;
                }
            }
            int i8 = i6 + i7;
            boolean z = c76873cZ.A08;
            int i9 = 0;
            if (z) {
                int i10 = c679334h.A00;
                if (i10 == 0) {
                    i10 = c679334h.A02;
                }
                i9 = c679334h.A05 + i10;
            }
            int i11 = i8 + i9;
            int i12 = 0;
            if ((c38321qM.A0C.CFm() != null && c38321qM.A0C.CFm().intValue() > 0) || c38321qM.A0w() > 0) {
                int i13 = c679334h.A00;
                if (i13 == 0) {
                    i13 = c679334h.A02;
                }
                i12 = i13 + c679334h.A05;
            }
            int i14 = i11 + i12 + c679334h.A04;
            if (c679334h.A0E) {
                C82713mZ A01 = C32U.A01(null, c38321qM, interfaceC60442pS, "viewability_test");
                A01.A0L = i14;
                C32U.A0H(userSession, A01, interfaceC60442pS);
            }
            number = Integer.valueOf(i14);
            hashMap.put(c38321qM.getId(), number);
        }
        float intValue = number.intValue();
        float f = height / intValue;
        if (this.A06) {
            List<Rect> list = this.A05;
            interfaceC57162jr.BA9(c59062n7, list);
            interfaceC57162jr.CGX(this.A01);
            float f2 = 0.0f;
            for (Rect rect2 : list) {
                f2 += rect2.width() * rect2.height();
            }
            f = f2 / (r9.width() * intValue);
        }
        double d = f;
        A00(obj, obj2, "feed_unit", d, 0.0d, 0, BmE);
        if (AbstractC41071vF.A0U(this.A02, c38321qM)) {
            A00(obj, obj2, "feed_unit", d, 0.5d, 50, BmE);
            A00(obj, obj2, "feed_unit", d, 0.99d, 100, BmE);
            interfaceC57162jr.BA8(rect, c59062n7);
            float height2 = rect.height();
            interfaceC57162jr.CGX(this.A01);
            double height3 = height2 / r2.height();
            A00(obj, obj2, "viewport", height3, 0.5d, 50, BmE);
            A00(obj, obj2, "viewport", height3, 0.99d, 100, BmE);
        }
    }

    public C679534j() {
        this.A07 = new HashMap();
    }
}
