package X;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.layeredxma.LayeredXmaContentDefinition;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.direct.msys.impl.thread.MsysMessageListLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7KU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KU implements C7IY {
    public C7IM A00;
    public final Context A01;
    public final View.OnLongClickListener A02;
    public final C66362zD A03;
    public final UserSession A04;
    public final C49038LmQ A05;
    public final C98N A06;
    public final C7IN A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final Activity A0A;
    public final InterfaceC11380iw A0B;
    public final InterfaceC163587Tv A0C;
    public final C7ZX A0D;
    public final AnonymousClass988 A0E;
    public final C7IV A0F;
    public final InterfaceC163837Ux A0G;
    public final C7DK A0H;

    @Override // X.C7IY
    public final void E5L(List list) {
    }

    @Override // X.C7IY
    public final void E5M(List list) {
    }

    @Override // X.C7IY
    public final /* bridge */ /* synthetic */ C2UU AZT() {
        return this.A03;
    }

    @Override // X.C7IY
    public final MessageListLayoutManager BMX(RecyclerView recyclerView) {
        return new MsysMessageListLinearLayoutManager(this.A01, recyclerView);
    }

    @Override // X.C7IY
    public final void EVD(boolean z) {
        this.A03.A00 = z;
    }

    @Override // X.C7IY
    public final void FCY(C7IM c7im) {
        this.A00 = c7im;
    }

    /* JADX WARN: Type inference failed for: r11v90, types: [X.KGx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r36v0, types: [X.7RO, java.lang.Object] */
    public C7KU(Activity activity, View.OnLongClickListener onLongClickListener, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC163587Tv interfaceC163587Tv, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IV c7iv, C7IM c7im, InterfaceC163837Ux interfaceC163837Ux, C98N c98n, C7DK c7dk, C7IN c7in, boolean z) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c7zx, 3);
        this.A0A = activity;
        this.A04 = userSession;
        this.A0D = c7zx;
        this.A0E = anonymousClass988;
        this.A0B = interfaceC11380iw;
        this.A00 = c7im;
        this.A0H = c7dk;
        this.A0C = interfaceC163587Tv;
        this.A0F = c7iv;
        this.A07 = c7in;
        this.A06 = c98n;
        this.A02 = onLongClickListener;
        this.A0G = interfaceC163837Ux;
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A01 = applicationContext;
        this.A05 = new C49038LmQ(userSession, c7in);
        this.A08 = AbstractC09440dt.A01(new MHH(this, 35));
        this.A09 = AbstractC09440dt.A01(new MHH(this, 36));
        C7IM c7im2 = this.A00;
        Context context = this.A01;
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(new ContextThemeWrapper(context, c7im2.A01), R.style.DirectMessageBorderlessGroupedRedesign));
        C14360o3.A07(from);
        C7R8 c7r8 = new C7R8(c7zx, anonymousClass988);
        C7R9 c7r9 = new C7R9(interfaceC11380iw, userSession, c7zx);
        C79Y c79y = new C79Y(context, c7zx);
        C7RA c7ra = new C7RA(interfaceC11380iw, userSession, c7zx, anonymousClass988);
        C7RC c7rc = new C7RC(interfaceC11380iw, c7zx);
        C7RD c7rd = new C7RD(userSession);
        C7RE c7re = new C7RE(interfaceC11380iw, c7zx);
        C7RG c7rg = new C7RG(userSession, c7zx);
        C7RF c7rf = new C7RF(activity, userSession, c7zx);
        ?? obj = new Object();
        C7RL c7rl = new C7RL(userSession, c7zx);
        C7RP c7rp = new C7RP(userSession, c7zx);
        C7RH c7rh = new C7RH(c7zx);
        C7RJ c7rj = new C7RJ(activity, userSession, c7zx);
        C7RQ c7rq = new C7RQ(c7zx);
        C7RR c7rr = new C7RR(c7zx);
        C7RV c7rv = new C7RV(null, c7rq, null, null, new C7RK(c7zx), obj, anonymousClass988, null, c7rg, new C7RH(c7zx), c7rf, c7rl, c7r8, c7rr, c7r9, new C7RM(activity, userSession, c7zx), null, null, null, c7re, c7ra, c7rc, c7rd);
        C7RW A02 = c7rv.A02();
        C7RW A01 = c7rv.A01();
        C76I A00 = c7rv.A00();
        C79Z c79z = new C79Z(c7rq, null, c79y, obj, anonymousClass988, c7rp, c7rg, c7rh, c7rl, c7r8, c7rr, c7r9, c7rj, c7re, c7ra, c7rc, c7rd, true);
        C79Z c79z2 = new C79Z(c7rq, null, c79y, obj, anonymousClass988, c7rp, c7rg, c7rh, c7rl, c7r8, c7rr, c7r9, c7rj, c7re, c7ra, c7rc, c7rd, false);
        InterfaceC09390do interfaceC09390do = this.A09;
        C158677Ad A002 = C7AY.A00(context, interfaceC11380iw, userSession, c7zx, anonymousClass988, (C7AW) interfaceC09390do.getValue());
        C78Z c78z = new C78Z(c7zx, anonymousClass988);
        C75Y c75y = new C75Y(userSession, c7zx, anonymousClass988, C158747Ak.class);
        C1579977j c1579977j = new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false);
        C49131LoA A003 = AbstractC22707A0d.A00(userSession, c7zx, interfaceC163587Tv, anonymousClass988);
        C49114Lnr A004 = A0Z.A00(interfaceC11380iw, userSession, c7zx, anonymousClass988);
        C49130Lo9 c49130Lo9 = new C49130Lo9(context, interfaceC11380iw, userSession, c7zx);
        C49127Lo6 A005 = C49127Lo6.A00(interfaceC11380iw, c7zx, anonymousClass988);
        C158907Bc A006 = C158907Bc.A00(c7zx, anonymousClass988);
        C49112Lnp c49112Lnp = new C49112Lnp(interfaceC11380iw, c7zx, anonymousClass988);
        C49102Lnf c49102Lnf = new C49102Lnf(c7zx, anonymousClass988);
        AbstractC162927Rd abstractC162927Rd = new AbstractC162927Rd(A02, new C49120Lnx(interfaceC11380iw, c7zx, anonymousClass988));
        KIT kit = new KIT(context, c7zx, anonymousClass988);
        C1577676k c1577676k = new C1577676k(activity, interfaceC11380iw, userSession, new C159627Dy(interfaceC11380iw, userSession), new C1577476i(interfaceC11380iw, userSession), c7zx, anonymousClass988, c7im2, this.A06);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C219959nh(A01, new C49102Lnf(c7zx, anonymousClass988), KV2.class));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), c49102Lnf));
        arrayList.add(new AbstractC1584479e(c79z, c49130Lo9, c49102Lnf));
        arrayList.add(new AbstractC162927Rd(A02, C158907Bc.A00(c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A02, new C49106Lnj(interfaceC11380iw, c7zx, anonymousClass988)));
        arrayList.add(c75y);
        arrayList.add(abstractC162927Rd);
        C49038LmQ c49038LmQ = this.A05;
        arrayList.add(C45890KSt.A00(interfaceC11380iw, userSession, A02, c7zx, anonymousClass988, c49038LmQ));
        arrayList.add(new AbstractC162927Rd(A02, c1579977j));
        arrayList.add(new AbstractC162927Rd(A02, new C49101Lne(c7zx, anonymousClass988)));
        arrayList.add(new C1584379d(c79z, new C79T(userSession, c7zx, anonymousClass988), C158907Bc.A00(c7zx, anonymousClass988), C1584079a.class));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), null));
        arrayList.add(AbstractC1586379y.A00(activity, interfaceC11380iw, userSession, A02, c7zx, anonymousClass988));
        C14360o3.A0B(A004, 1);
        arrayList.add(new AbstractC162927Rd(A02, A004));
        C14360o3.A0B(A003, 1);
        arrayList.add(new AbstractC162927Rd(A02, A003));
        C45891KSu A007 = C45891KSu.A00(interfaceC11380iw, userSession, A02, c7zx, anonymousClass988, c49038LmQ);
        C14360o3.A0C(A007, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A007);
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), new C49109Lnm(interfaceC11380iw, userSession, c7zx)));
        arrayList.add(new C76Q(c79z, A002, C158907Bc.A00(c7zx, anonymousClass988), KV9.class));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), c78z));
        arrayList.add(new AnonymousClass767(A02, (C7AW) interfaceC09390do.getValue(), A002, AnonymousClass765.class));
        arrayList.add(new AbstractC162927Rd(A00, A002));
        arrayList.add(C76L.A00(context, interfaceC11380iw, userSession, c79z, c7zx, anonymousClass988));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), c1579977j));
        arrayList.add(new AbstractC1584479e(c79z, A003, A002));
        arrayList.add(new AbstractC1584479e(c79z, A004, A002));
        arrayList.add(new AbstractC162927Rd(A02, new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false)));
        arrayList.add(new AbstractC1584479e(c79z, new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C79T(userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, A006, A005));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A02, new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C79T(userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false)));
        arrayList.add(new AbstractC1584479e(c79z, new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A00, A005));
        arrayList.add(new AbstractC162927Rd(A02, new C49118Lnv(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A02, new C49108Lnl(interfaceC11380iw, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A01, new C49100Lnd(c7zx, anonymousClass988)));
        InterfaceC09390do interfaceC09390do2 = this.A08;
        arrayList.add(new C45889KSs(A02, (C49037LmP) interfaceC09390do2.getValue(), new C49119Lnw(interfaceC11380iw, userSession, c7zx, anonymousClass988, (C49037LmP) interfaceC09390do2.getValue()), KV7.class));
        arrayList.add(new C45888KSr(A02, (C49037LmP) interfaceC09390do2.getValue(), new C49119Lnw(interfaceC11380iw, userSession, c7zx, anonymousClass988, (C49037LmP) interfaceC09390do2.getValue())));
        arrayList.add(new AbstractC162927Rd(A02, new C49110Lnn(interfaceC11380iw, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A02, new C49121Lny(interfaceC11380iw, userSession, c7zx, anonymousClass988, c7dk, z)));
        arrayList.add(new AbstractC162927Rd(A02, new C163337Sw(c7zx, c7zx, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A00, c49112Lnp));
        arrayList.add(new AbstractC162927Rd(A02, new C49103Lng(c7zx, anonymousClass988)));
        arrayList.add(C77Y.A00(interfaceC11380iw, userSession, A02, c7zx, anonymousClass988, c7dk, z));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), c49112Lnp));
        arrayList.add(new AbstractC162927Rd(A02, new C49126Lo5(c7zx, anonymousClass988, A006)));
        arrayList.add(new AbstractC162927Rd(A02, new C49128Lo7(userSession, c7zx, A006)));
        arrayList.add(new AbstractC162927Rd(A02, new C49104Lnh(interfaceC11380iw, c7zx, anonymousClass988)));
        KIQ A008 = AbstractC46815KnA.A00(context, interfaceC11380iw, userSession, c75y, c7zx, anonymousClass988);
        C14360o3.A0C(A008, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A008);
        arrayList.add(new AbstractC162927Rd(A00, new C49117Lnu(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC162927Rd(A00, c78z));
        arrayList.add(new C7N8(interfaceC11380iw, userSession, c7zx));
        arrayList.add(new Object());
        arrayList.add(new C161817Mq(c7iv));
        arrayList.add(new C7NA(context, userSession, c7zx, anonymousClass988));
        arrayList.add(new JW4(context, interfaceC11380iw, userSession, c7zx, anonymousClass988, c7im2));
        arrayList.add(kit);
        arrayList.add(c1577676k);
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(AbstractC1575775r.A00(interfaceC11380iw, userSession, c79z, c7zx, anonymousClass988, c7dk, z));
        arrayList.add(C1581878d.A01.A00(interfaceC11380iw, userSession, c79z2, c7zx, anonymousClass988, c7dk, C1582078f.class, z));
        arrayList.add(C220059nr.A00.A00(interfaceC11380iw, userSession, c79z2, c7zx, anonymousClass988, c7dk, z));
        arrayList.add(AbstractC22706A0c.A00(context, interfaceC11380iw, userSession, c79z2, c7zx, anonymousClass988, c7dk, z));
        arrayList.add(C220049nq.A00.A00(interfaceC11380iw, userSession, c79z2, c7zx, interfaceC163587Tv, anonymousClass988, c7dk, z));
        arrayList.add(C220039np.A00.A00(interfaceC11380iw, userSession, c79z2, c7zx, anonymousClass988, c7dk, z));
        arrayList.add(C220029no.A00.A00(interfaceC11380iw, userSession, c79z2, c7zx, anonymousClass988, c7dk, z));
        arrayList.add(new AbstractC162927Rd(A02, new LayeredXmaContentDefinition(interfaceC11380iw, userSession, c7zx, anonymousClass988, false)));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), new LayeredXmaContentDefinition(interfaceC11380iw, userSession, c7zx, anonymousClass988, true)));
        arrayList.add(new AbstractC1584479e(c79z, A004, c78z));
        arrayList.add(new AbstractC1584479e(c79z, A003, c78z));
        arrayList.add(new AbstractC1584479e(c79z, c49130Lo9, c78z));
        C14360o3.A0B(interfaceC163587Tv, 3);
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), AbstractC22707A0d.A00(userSession, c7zx, interfaceC163587Tv, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), A0Z.A00(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        ?? obj2 = new Object();
        obj2.A00 = c7zx;
        arrayList.add(obj2);
        arrayList.add(new KHZ(c7zx));
        arrayList.add(new C45635KHy(c7zx, anonymousClass988));
        C220019nn A009 = AbstractC22710A0g.A00(interfaceC11380iw, userSession, c79z, c7zx, anonymousClass988, c7dk, z);
        C14360o3.A0C(A009, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A009);
        C220009nm A0010 = AbstractC22709A0f.A00(activity, interfaceC11380iw, userSession, c79z, c7zx, anonymousClass988, c7dk, z);
        C14360o3.A0C(A0010, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A0010);
        arrayList.add(new AbstractC1584479e(c79z, A0Z.A00(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C79T(userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, A0Z.A00(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, AbstractC22707A0d.A00(userSession, c7zx, interfaceC163587Tv, anonymousClass988), new C79T(userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, AbstractC22707A0d.A00(userSession, c7zx, interfaceC163587Tv, anonymousClass988), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, AbstractC22707A0d.A00(userSession, c7zx, interfaceC163587Tv, anonymousClass988), new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false)));
        arrayList.add(new AbstractC1584479e(c79z, AbstractC22707A0d.A00(userSession, c7zx, interfaceC163587Tv, anonymousClass988), new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, AbstractC22707A0d.A00(userSession, c7zx, interfaceC163587Tv, anonymousClass988), new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C49118Lnv(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C79T(userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C49118Lnv(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C49118Lnv(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false)));
        arrayList.add(new AbstractC1584479e(c79z, new C49118Lnv(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C49118Lnv(interfaceC11380iw, userSession, c7zx, anonymousClass988), new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false), new C79T(userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        C14360o3.A0B(c79z, 3);
        arrayList.add(new AbstractC1584479e(c79z, new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false), new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false)));
        arrayList.add(new AbstractC1584479e(c79z, new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false), new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false), new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988), new C79T(userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1579977j(userSession, c7zx, anonymousClass988, c7dk, false, false)));
        arrayList.add(new AbstractC1584479e(c79z, new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988), new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988), new C7RY(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(new AbstractC1584479e(c79z, new C1586479z(activity, interfaceC11380iw, userSession, c7zx, anonymousClass988), new C7T9(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        arrayList.add(AbstractC46824KnJ.A00(interfaceC11380iw, userSession, c7zx));
        arrayList.add(new AbstractC162927Rd(A02, new C49132LoB(interfaceC11380iw, userSession, null, c7zx, anonymousClass988, null, null, false)));
        arrayList.add(new AbstractC162927Rd(A02, LC4.A00(interfaceC11380iw, userSession, c7zx, anonymousClass988, false)));
        C45881KSk A0011 = AbstractC46799Kmu.A00(activity, interfaceC11380iw, userSession, A02, c7zx, anonymousClass988);
        C14360o3.A0C(A0011, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A0011);
        C14360o3.A0B(A002, 1);
        arrayList.add(new AbstractC162927Rd(A02, A002));
        C7R8 c7r82 = c7rv.A04;
        KSU A0012 = AbstractC22708A0e.A00(interfaceC11380iw, userSession, c75y, new C219969ni(c7r82), c7zx, anonymousClass988);
        C14360o3.A0C(A0012, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A0012);
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), new C49118Lnv(interfaceC11380iw, userSession, c7zx, anonymousClass988)));
        C45902KTf A0013 = AbstractC46819KnE.A00(interfaceC11380iw, c79z, c7zx, anonymousClass988);
        C14360o3.A0C(A0013, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A0013);
        C45873KSc A0014 = AbstractC46817KnC.A00(context, interfaceC11380iw, userSession, c75y, new C219969ni(c7r82), c7zx, anonymousClass988);
        C14360o3.A0C(A0014, "null cannot be cast to non-null type com.instagram.common.recyclerview.definition.RecyclerViewItemDefinition<*, *>");
        arrayList.add(A0014);
        arrayList.add(new AbstractC1584479e(c79z, C158907Bc.A00(c7zx, anonymousClass988), AbstractC46818KnD.A00(interfaceC11380iw, userSession, c7zx, anonymousClass988, false)));
        this.A03 = new C66362zD(from, this.A02, null, null, null, new C66462zN(arrayList), null, new MX3(C14120nc.A00(), MX3.A02), null, null, false);
    }
}
