package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65772yF extends AbstractC65632xz {
    public C33P A00;
    public InterfaceC63392uM A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C61252qn A05;
    public final C64032vO A06;
    public final C65782yG A07;
    public final C63972vI A08;

    public C65772yF(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C61252qn c61252qn, C64032vO c64032vO, C63972vI c63972vI) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c61252qn, 4);
        C14360o3.A0B(c63972vI, 5);
        C14360o3.A0B(c64032vO, 6);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = c61252qn;
        this.A08 = c63972vI;
        this.A06 = c64032vO;
        this.A07 = new C65782yG(context);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "ReelNetego";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((C1121854m) obj).A00.getId().hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        C1121854m c1121854m = (C1121854m) obj;
        AbstractC81363k6 abstractC81363k6 = (AbstractC81363k6) view.getTag();
        if (abstractC81363k6 != null) {
            Context context = this.A02;
            UserSession userSession = this.A04;
            C61252qn c61252qn = this.A05;
            C63972vI c63972vI = this.A08;
            AbstractC69533An abstractC69533An = (AbstractC69533An) abstractC81363k6.A08.A0A;
            if (abstractC69533An != null) {
                C124115jQ c124115jQ = abstractC81363k6.A0A;
                if (c124115jQ != null) {
                    c61252qn.A0H(c124115jQ);
                }
                if (AbstractC124105jP.A01(c61252qn, c1121854m)) {
                    C124115jQ c124115jQ2 = new C124115jQ(context, userSession, abstractC69533An, c63972vI, c1121854m);
                    abstractC81363k6.A0A = c124115jQ2;
                    c61252qn.A0G(c124115jQ2);
                }
            }
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        AbstractC81363k6 abstractC81363k6 = (AbstractC81363k6) view.getTag();
        if (abstractC81363k6 != null) {
            C61252qn c61252qn = this.A05;
            C124115jQ c124115jQ = abstractC81363k6.A0A;
            if (c124115jQ != null) {
                c61252qn.A0H(c124115jQ);
            }
        }
        C63972vI.A03(this.A08);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (((java.lang.Boolean) r3.A1E.CES(r3, X.C17280tP.A4G[129(0x81, float:1.81E-43)])).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04d8  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r39, android.view.View r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65772yF.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        String str;
        C1121854m c1121854m = (C1121854m) obj;
        C5IV c5iv = (C5IV) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c1121854m, 1);
        C14360o3.A0B(c5iv, 2);
        if (c1121854m.A00().intValue() != 1) {
            anonymousClass306.A7a(2);
        } else {
            anonymousClass306.A7a(0);
            InterfaceC63392uM interfaceC63392uM = this.A01;
            if (interfaceC63392uM != null) {
                C101274gj c101274gj = c1121854m.A00;
                Integer num = c101274gj.A00.A05;
                if (num != null) {
                    str = num.toString();
                } else {
                    str = null;
                }
                if ("76".equals(str)) {
                    interfaceC63392uM.A9W(c101274gj, c5iv.A09);
                }
            }
        }
        this.A07.A00();
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Integer num;
        AbstractC81363k6 abstractC81363k6;
        LinearLayoutManager linearLayoutManager;
        String str;
        int A03 = C0f9.A03(55246085);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    num = C05F.A0C;
                } else {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                    C0f9.A0A(-2141875356, A03);
                    throw unsupportedOperationException;
                }
            } else {
                num = C05F.A0Y;
            }
        } else {
            num = C05F.A01;
        }
        Context context = this.A02;
        C63972vI c63972vI = this.A08;
        C65782yG c65782yG = this.A07;
        UserSession userSession = this.A04;
        C14360o3.A0C(c63972vI, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.stories_in_feed_tray, viewGroup, false);
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 36324222049464301L) && C18U.A06(c06090Tz, userSession, 36324222050381817L)) || (num == C05F.A0C && C18U.A06(c06090Tz, userSession, 36325257136714681L))) {
            abstractC81363k6 = new C124085jN(inflate);
        } else if (C18U.A06(c06090Tz, userSession, 36324222049464301L)) {
            abstractC81363k6 = new C81353k5(inflate, userSession);
        } else {
            abstractC81363k6 = new AbstractC81363k6(inflate);
        }
        inflate.setTag(abstractC81363k6);
        C69523Am c69523Am = new C69523Am(context, c63972vI, userSession, null, null, c63972vI, num, false);
        c69523Am.A05 = c65782yG;
        RecyclerView recyclerView = abstractC81363k6.A08;
        recyclerView.setAdapter(c69523Am);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36325257136714681L);
        C14360o3.A0B(context, 0);
        recyclerView.A10(new C70643Fb(context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material)));
        if (A06) {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        } else {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        }
        linearLayoutManager.A12(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        abstractC81363k6.A04.setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.igdsPrimaryBackground));
        C92724Dh c92724Dh = new C92724Dh(context, c63972vI, userSession, c69523Am, num);
        if (num == C05F.A0C) {
            str = AbstractC111324zv.A00(4573);
        } else {
            str = null;
        }
        new C92734Di(recyclerView, c63972vI, userSession, c92724Dh, str);
        AbstractC81363k6 abstractC81363k62 = (AbstractC81363k6) inflate.getTag();
        if (i == 0 || i == 2) {
            if (abstractC81363k62 != null) {
                RecyclerView recyclerView2 = abstractC81363k62.A08;
                C14360o3.A06(recyclerView2);
                C70783Fq recycledViewPool = recyclerView2.getRecycledViewPool();
                C14360o3.A07(recycledViewPool);
                C2UU c2uu = recyclerView2.A0A;
                for (int i2 = 0; i2 < 3; i2++) {
                    if (c2uu != null) {
                        C3OO createViewHolder = c2uu.createViewHolder(recyclerView2, 3);
                        if (createViewHolder.isRecyclable()) {
                            recycledViewPool.A03(createViewHolder);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C0f9.A0A(1636396228, A03);
        return inflate;
    }
}
