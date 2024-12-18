package X;

import android.content.res.Resources;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lo8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49129Lo8 implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC164977Zm A02;
    public final C162907Rb A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        boolean A01 = LC3.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A01) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -1;
        C44785Js6 c44785Js6 = new C44785Js6(inflate, userSession);
        this.A03.A00(c44785Js6);
        return c44785Js6;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A03.A01(c7qd);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        String str;
        CharSequence charSequence;
        C44785Js6 c44785Js6 = (C44785Js6) c7qd;
        C7SZ c7sz = (C7SZ) interfaceC129555tK;
        AbstractC167007dF.A1K(c44785Js6, c7sz);
        if (c7sz.A06) {
            c44785Js6.itemView.setVisibility(8);
            return;
        }
        List list = c44785Js6.A04;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((LGr) it.next()).A00.setVisibility(8);
        }
        c44785Js6.A03.setVisibility(8);
        List list2 = c7sz.A04;
        int min = Math.min(4, list2.size());
        for (int i = 0; i < min; i++) {
            LGr lGr = (LGr) list.get(i);
            KTK ktk = (KTK) list2.get(i);
            View view = lGr.A00;
            A00(view);
            Size A00 = A00(lGr.A0N);
            C47992LKj.A01(view, i, min, false);
            C47992LKj.A02(view, i, false);
            if (i == 0) {
                view.setRotation(0.0f);
                if (min == 3) {
                    AbstractC13880nE.A0U(view, AbstractC166997dE.A09(view.getResources()));
                }
            } else {
                float f = -4.0f;
                if (i % 2 == 0) {
                    f = 4.0f;
                }
                view.setRotation(f);
            }
            IgImageView A0V = AbstractC43592JPx.A0V(lGr.A0O);
            C14360o3.A0B(A0V, 0);
            C74843Xy c74843Xy = new C74843Xy();
            float A05 = AbstractC166997dE.A05(A0V.getResources());
            c74843Xy.A07(A05, A05, A05, A05);
            lGr.A03(A00, this.A00, AbstractC1580577p.A04(c74843Xy, A0V), ktk, this.A02.Arw());
            C1583678w c1583678w = ktk.A02.A0E;
            if (c1583678w != null) {
                charSequence = c1583678w.A03;
            } else {
                charSequence = null;
            }
            InterfaceC56392iX interfaceC56392iX = lGr.A0L;
            int i2 = 0;
            if (interfaceC56392iX.CWW() || ((charSequence != null && charSequence.length() != 0) || !LC3.A01(lGr.A01))) {
                ((TextView) interfaceC56392iX.getView()).setText(charSequence);
                View view2 = interfaceC56392iX.getView();
                if (charSequence == null || AbstractC001900j.A0T(charSequence)) {
                    i2 = 8;
                }
                view2.setVisibility(i2);
            }
            View view3 = lGr.A0D.getView();
            int A0A = AbstractC166997dE.A0A(view3.getResources());
            AbstractC13880nE.A0f(view3, A0A);
            AbstractC13880nE.A0e(view3, A0A);
            AbstractC31172DnG.A1T(lGr.A0G, 0);
            if (i == 0) {
                if (C18U.A06(C06090Tz.A05, this.A01, 36325214187041671L)) {
                    AbstractC31172DnG.A1T(lGr.A09, 0);
                    view.setVisibility(0);
                }
            }
            AbstractC31172DnG.A1T(lGr.A09, 8);
            view.setVisibility(0);
        }
        c44785Js6.itemView.setVisibility(0);
        this.A03.A02(c44785Js6, c7sz);
        UserSession userSession = this.A01;
        C48513LdA A002 = AbstractC46706KlP.A00(this.A00, userSession);
        int size = list2.size();
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36325214187041671L);
        KTK ktk2 = (KTK) AbstractC001800i.A0J(list2);
        if (ktk2 != null) {
            str = ktk2.A02.A0L.A00;
        } else {
            str = null;
        }
        String str2 = c7sz.A03;
        if (str == null) {
            return;
        }
        java.util.Set set = A002.A00;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        C48513LdA.A00(A002, null, "impression", str, str2, size, A06);
    }

    public C49129Lo8(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC164977Zm interfaceC164977Zm, C162907Rb c162907Rb) {
        this.A03 = c162907Rb;
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A02 = interfaceC164977Zm;
    }

    public static final Size A00(View view) {
        Resources resources = view.getResources();
        Size size = new Size(resources.getDimensionPixelSize(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height), resources.getDimensionPixelSize(R.dimen.direct_clips_stacks_message_height));
        view.getLayoutParams().width = size.getWidth();
        view.getLayoutParams().height = size.getHeight();
        return size;
    }
}
