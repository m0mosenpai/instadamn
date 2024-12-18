package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.HGv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39045HGv extends AbstractC65806TuP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C42669IuQ A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C85993sW A04;

    @Override // X.AbstractC65806TuP, X.InterfaceC50822Vd
    public final int E4c() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39045HGv(Context context, C42669IuQ c42669IuQ, InterfaceC11380iw interfaceC11380iw, C6FG c6fg, C102884kP c102884kP, UserSession userSession, C85993sW c85993sW) {
        super(c6fg, c102884kP);
        this.A04 = c85993sW;
        this.A00 = context;
        this.A01 = c42669IuQ;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        return this.A04.A04(this.A00, null);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.P2W, X.2xQ, java.lang.Object] */
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        C38321qM c38321qM;
        C42669IuQ c42669IuQ = this.A01;
        AbstractC60592pi abstractC60592pi = c42669IuQ.A06;
        C6BQ.A0J(c6fg, abstractC60592pi);
        C6BQ.A0I(c6fg, abstractC60592pi);
        C55N c55n = (C55N) C102884kP.A00(c102884kP, 44);
        if (c55n != null && (c38321qM = c55n.A00) != null) {
            Context context = this.A00;
            UserSession userSession = this.A03;
            C85993sW c85993sW = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            C57112jm A0D = C6BQ.A0D(c6fg);
            if (c42669IuQ.A02 != null && c42669IuQ.A00 != null) {
                return null;
            }
            C81303k0 c81303k0 = (C81303k0) view.getTag();
            if (c81303k0 == null) {
                c81303k0 = c85993sW.A06(view, interfaceC11380iw);
            }
            c42669IuQ.A00 = c81303k0;
            ?? obj2 = new Object();
            obj2.A00 = c38321qM;
            InterfaceC60442pS interfaceC60442pS = c42669IuQ.A07;
            c42669IuQ.A02 = new C33P(context, userSession, interfaceC60442pS, obj2);
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            A0E.A0D(0);
            c42669IuQ.A01 = A0E;
            C79723hN A00 = new C79293ga(userSession, new Object(), c42669IuQ, C57332k8.A04(context, userSession), null).A00(context, c38321qM, interfaceC60442pS, A0E, c42669IuQ.A02);
            int position = A0E.getPosition();
            int A03 = C0f9.A03(-1909690864);
            C14360o3.A0B(interfaceC60442pS, 3);
            c85993sW.A07(interfaceC60442pS, null, A00, c81303k0, position, true);
            C0f9.A0A(-471273016, A03);
            c42669IuQ.A02.A07(c38321qM, c81303k0, A0E);
            C30E c30e = c42669IuQ.A02.A0G;
            c30e.A0P.add(c42669IuQ);
            c30e.A0R.add(c42669IuQ);
            C59072n8 A002 = C59062n7.A00(c38321qM, A0E, c38321qM.getId());
            A002.A00(new C42385Ipm(c38321qM, c81303k0, A0E, c42669IuQ.A02));
            C59062n7 A01 = A002.A01();
            if (A0D == null) {
                return null;
            }
            A0D.A05(c81303k0.A0T, A01);
            return null;
        }
        AbstractC25241Le.A02("IgFeedVideoBinderUtils", "Media alien object has no media");
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C81303k0 c81303k0;
        C42669IuQ c42669IuQ = this.A01;
        C6BQ.A0J(c6fg, c42669IuQ.A06);
        C33P c33p = c42669IuQ.A02;
        if (c33p != null) {
            c33p.A0G.A0R.remove(c42669IuQ);
        }
        C57112jm A0D = C6BQ.A0D(c6fg);
        if (A0D != null && (c81303k0 = c42669IuQ.A00) != null) {
            A0D.A04(c81303k0.A0T);
        }
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }
}
