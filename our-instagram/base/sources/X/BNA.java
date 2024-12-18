package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class BNA extends AbstractC51572Yf {
    public final ClipsViewerConfig A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final InterfaceC31077DlK A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC31137Dmc A06;

    public BNA(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31077DlK interfaceC31077DlK, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc) {
        AbstractC25234BEr.A0k(2, userSession, interfaceC31077DlK, clipsViewerConfig, interfaceC31137Dmc);
        this.A01 = c120985dq;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A02 = c37644Ghd;
        this.A03 = interfaceC31077DlK;
        this.A00 = clipsViewerConfig;
        this.A06 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        String name;
        String str;
        Boolean bool;
        String id;
        EnumC37735GjA enumC37735GjA;
        C14360o3.A0B(c76223bS, 0);
        if (!AbstractC25463BOc.A01.get()) {
            return null;
        }
        AtomicInteger atomicInteger = AbstractC25463BOc.A02;
        atomicInteger.incrementAndGet();
        ConcurrentHashMap concurrentHashMap = AbstractC25463BOc.A00;
        C120985dq c120985dq = this.A01;
        int A0K = AbstractC167017dG.A0K((Number) concurrentHashMap.get(c120985dq.getId())) + 1;
        concurrentHashMap.put(c120985dq.getId(), Integer.valueOf(A0K));
        if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC25463BOc.A03.incrementAndGet();
            i = R.color.red_7;
        } else {
            i = R.color.black_40_transparent;
        }
        int A09 = AbstractC25228BEl.A09(c76223bS, R.color.design_dark_default_color_on_background);
        UserSession userSession = this.A05;
        User A092 = c120985dq.A09(userSession);
        if (A092 == null) {
            name = "unknown";
        } else {
            name = C57582kX.A00(userSession).A0N(A092).name();
        }
        if (c120985dq.A01 == EnumC129395t1.A0G) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                enumC37735GjA = AbstractC37655Gho.A00(c38321qM);
            } else {
                enumC37735GjA = null;
            }
            str = String.valueOf(enumC37735GjA);
        } else {
            str = "";
        }
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, DFB.A00);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0Q = AbstractC25233BEq.A0Q(C9CV.A00(null, C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), 48.0d);
        long A0L = AbstractC25230BEn.A0L();
        Integer num = C05F.A06;
        C51722Yv A002 = C9CU.A00(A0Q, num, 0, A0L);
        int A093 = AbstractC25228BEl.A09(c76223bS, i);
        Integer num2 = C05F.A00;
        C51722Yv A003 = C9CV.A00(A002, num2, AbstractC25225BEi.A0i(A093), 4);
        C2XE c2xe = c76223bS.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(c2xe, 1);
        C51722Yv A004 = C9CV.A00(null, num2, EnumC77683ds.CENTER, 3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(c2xe, "Debug Overlay", A09);
        C2XH c2xh = c2xe.A0D;
        C14360o3.A07(c2xh);
        AbstractC25230BEn.A1K(A0g, c2xh, 0, Float.floatToRawIntBits(18.0f) | 9221683186994511872L);
        A0g.A0T(typeface);
        AbstractC25234BEr.A19(A0g, c2xh, num2, A0D);
        A0g.A0b(false);
        A0g.A0N(0);
        A0g.A0E();
        AbstractC25233BEq.A1D(A004, A0g, false);
        A1E.add(A0g.A0A());
        A1E.add(A03(c76223bS, "Clip Metadata", A09));
        long floatToRawIntBits = Float.floatToRawIntBits(16.0f) | 9221683186994511872L;
        C77723dw A0g2 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("Clip Id: ", c120985dq.getId()), A09);
        AbstractC25230BEn.A1K(A0g2, c2xh, 0, floatToRawIntBits);
        A0g2.A0T(typeface);
        AbstractC25234BEr.A19(A0g2, c2xh, num2, A0D);
        AbstractC25234BEr.A1K(A0g2, A1E);
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && (id = c38321qM2.getId()) != null && !AbstractC001900j.A0T(id)) {
            C77723dw A0g3 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("Media Id: ", id), A09);
            AbstractC25230BEn.A1K(A0g3, c2xh, 0, floatToRawIntBits);
            A0g3.A0T(typeface);
            AbstractC25234BEr.A19(A0g3, c2xh, num2, A0D);
            AbstractC25234BEr.A1K(A0g3, A1E);
        }
        if (c120985dq.CdW()) {
            C77723dw A0g4 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("Ad id: ", AbstractC25226BEj.A1E(c120985dq)), A09);
            AbstractC25230BEn.A1K(A0g4, c2xh, 0, floatToRawIntBits);
            A0g4.A0T(typeface);
            AbstractC25234BEr.A19(A0g4, c2xh, num2, A0D);
            AbstractC25234BEr.A1K(A0g4, A1E);
        }
        C77723dw A0g5 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("Organic type: ", str), A09);
        AbstractC25230BEn.A1K(A0g5, c2xh, 0, floatToRawIntBits);
        A0g5.A0T(typeface);
        AbstractC25234BEr.A19(A0g5, c2xh, num2, A0D);
        AbstractC25234BEr.A1K(A0g5, A1E);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("isLiked: ");
        C38321qM c38321qM3 = c120985dq.A02;
        if (c38321qM3 != null) {
            bool = Boolean.valueOf(c38321qM3.A5l());
        } else {
            bool = null;
        }
        C77723dw A0g6 = AbstractC25233BEq.A0g(c2xe, AbstractC166997dE.A0v(bool, A1C), A09);
        AbstractC25230BEn.A1K(A0g6, c2xh, 0, floatToRawIntBits);
        A0g6.A0T(typeface);
        AbstractC25234BEr.A19(A0g6, c2xh, num2, A0D);
        AbstractC25234BEr.A1K(A0g6, A1E);
        C77723dw A0g7 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("isFollowing: ", name), A09);
        AbstractC25230BEn.A1K(A0g7, c2xh, 0, floatToRawIntBits);
        A0g7.A0T(typeface);
        AbstractC25234BEr.A19(A0g7, c2xh, num2, A0D);
        AbstractC25234BEr.A1K(A0g7, A1E);
        A1E.add(A03(c76223bS, "Performance", A09));
        C77723dw A0g8 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0O("all render count when this is called: ", atomicInteger.get()), A09);
        AbstractC25230BEn.A1K(A0g8, c2xh, 0, floatToRawIntBits);
        A0g8.A0T(typeface);
        AbstractC25234BEr.A19(A0g8, c2xh, num2, A0D);
        AbstractC25234BEr.A1K(A0g8, A1E);
        C77723dw A0g9 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0O("all render counts on UI thread count: ", AbstractC25463BOc.A03.get()), A09);
        AbstractC25230BEn.A1K(A0g9, c2xh, 0, floatToRawIntBits);
        A0g9.A0T(typeface);
        AbstractC25234BEr.A19(A0g9, c2xh, num2, A0D);
        AbstractC25234BEr.A1K(A0g9, A1E);
        C77723dw A0g10 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0O("render count for this media: ", A0K), A09);
        AbstractC25230BEn.A1K(A0g10, c2xh, 0, floatToRawIntBits);
        A0g10.A0T(typeface);
        AbstractC25234BEr.A19(A0g10, c2xh, num2, A0D);
        AbstractC25234BEr.A1K(A0g10, A1E);
        Drawable drawable = c2xh.A00.getDrawable(R.drawable.rounded_corner_background);
        if (drawable != null) {
            C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25233BEq.A0Z(AbstractC25233BEq.A0Z(C9CV.A00(null, num2, drawable, 4), num2, 80.0d, 0), num, 8.0d, 0), DRT.A00(A00, 4));
            String A005 = AbstractC111324zv.A00(680);
            long A0J = AbstractC25231BEo.A0J();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A005, 0);
            A0a.A0Q(-16777216);
            AbstractC25230BEn.A1K(A0a, c2xh, 0, A0J);
            AbstractC25234BEr.A0p(typeface, A0a, c2xh, A0D);
            AbstractC25234BEr.A1J(A0a, num2, false, true);
            A1E.add(AbstractC25227BEk.A0X(A0Y, A0a));
            C2WF c2wf = new C2WF(null, null, null, A1E, false);
            A003.A01(c2wf.A0a(), c76223bS.ArD());
            return c2wf;
        }
        throw AbstractC167007dF.A0c(AbstractC111324zv.A00(624), Integer.toHexString(R.drawable.rounded_corner_background));
    }

    public static final C51682Yq A03(C76223bS c76223bS, String str, int i) {
        long A0r = AbstractC25232BEp.A0r(18.0f);
        C75933ay c75933ay = C51722Yv.A02;
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A0D = AbstractC25234BEr.A0D(null, AbstractC25225BEi.A0n(C05F.A15, 0, A0J), 0, A0J);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c76223bS.A05, null, str, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, i, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0E();
        AbstractC25233BEq.A1D(A0D, A0a, false);
        return A0a.A0A();
    }
}
