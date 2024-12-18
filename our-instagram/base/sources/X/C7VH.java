package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.7VH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VH extends C7VI {
    public View A00;
    public C7AC A01;
    public C7J6 A02;
    public C7U0 A03;
    public final InterfaceC09390do A04;
    public final boolean A05;
    public final AbstractC59962oe A06;
    public final InterfaceC11380iw A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7VH(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C7VG c7vg, boolean z) {
        super(c7vg);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A06 = abstractC59962oe;
        this.A07 = interfaceC11380iw;
        this.A05 = z;
        this.A04 = new C60842q8(new C206949Dz(this, 42), new C206949Dz(this, 43), C149636oG.A00, new C0YZ(C7VJ.class));
    }

    public static final void A00(Context context, C7VH c7vh, C7AC c7ac, C7U0 c7u0) {
        C7VJ c7vj = (C7VJ) c7vh.A04.getValue();
        C14360o3.A0B(context, 0);
        InterfaceC163817Uv BDF = c7u0.BDF();
        C160847Is c160847Is = (C160847Is) BDF.Avf().getValue();
        if (c160847Is == null) {
            c160847Is = BDF.BHl();
        }
        C7AM A00 = C7VJ.A00(context, c7vj, c160847Is);
        if (A00 != null) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("PrebindThreadHeader", -909695730);
            }
            try {
                c7ac.A02(A00);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-403983821);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1289817609);
                }
                throw th;
            }
        }
    }

    public static final void A01(C7VH c7vh) {
        View view = c7vh.A00;
        String str = "parent";
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.direct_thread_header);
            viewGroup.setVisibility(0);
            Context context = viewGroup.getContext();
            View view2 = c7vh.A00;
            if (view2 != null) {
                LayoutInflater from = LayoutInflater.from(view2.getContext());
                C14360o3.A07(from);
                View A00 = C50802Vb.A00(from, null, viewGroup, R.layout.layout_direct_thread_header, 0, true, true);
                C7VG c7vg = ((C7VI) c7vh).A00;
                UserSession userSession = c7vg.A00;
                InterfaceC11380iw interfaceC11380iw = c7vh.A07;
                C7U0 c7u0 = c7vh.A03;
                str = "clientInfra";
                if (c7u0 != null) {
                    C7AB c7ab = new C7AB(interfaceC11380iw, userSession, c7u0);
                    AbstractC59962oe abstractC59962oe = c7vh.A06;
                    C7J6 c7j6 = c7vh.A02;
                    if (c7j6 == null) {
                        str = "actionBarListener";
                    } else {
                        c7vh.A01 = new C7AC(A00, abstractC59962oe, interfaceC11380iw, userSession, c7ab, c7j6);
                        C14360o3.A0A(context);
                        C7U0 c7u02 = c7vh.A03;
                        if (c7u02 != null) {
                            C7AC c7ac = c7vh.A01;
                            if (c7ac == null) {
                                str = "viewHolder";
                            } else {
                                A00(context, c7vh, c7ac, c7u02);
                                C07S c07s = C07S.STARTED;
                                C07X c07x = (C07X) c7vg.A01.invoke();
                                C57312k6 A002 = C07Y.A00(c07x);
                                C9DM c9dm = new C9DM(c07s, context, c7vh, c07x, (InterfaceC23621Ds) null, 12);
                                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dm, A002);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
