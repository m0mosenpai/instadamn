package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66132yp extends AbstractC65632xz {
    public C55452gl A00;
    public final UserSession A01;
    public final C66142yq A02;
    public final InterfaceC55362gb A03;
    public final C66072yj A04;
    public final Map A05;
    public final Map A06;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "FeedQuickPromotion";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        String str = ((C4NJ) obj).A0C;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 4;
    }

    public C66132yp(UserSession userSession, InterfaceC55362gb interfaceC55362gb, C66072yj c66072yj, Map map) {
        C66142yq c66142yq = new C66142yq();
        this.A01 = userSession;
        this.A03 = interfaceC55362gb;
        this.A04 = c66072yj;
        this.A02 = c66142yq;
        this.A05 = map;
        HashMap hashMap = new HashMap();
        this.A06 = hashMap;
        this.A00 = (C55452gl) C55452gl.A02.getValue();
        hashMap.put("condensed_megaphone", 1);
        hashMap.put("social_context_condensed_megaphone_ig", 1);
        hashMap.put("standard_megaphone_ig", 0);
        hashMap.put("social_context_standard_megaphone_ig", 0);
        hashMap.put("inline_editing_standard_megaphone_ig", 2);
        hashMap.put("standard_bloks_megaphone_ig", 3);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        String str;
        int i;
        C4NL c4nl = (C4NL) obj;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c4nl, 1);
        C4NJ c4nj = (C4NJ) c4nl;
        if (c4nj.A08.A00() != null) {
            str = "standard_bloks_megaphone_ig";
        } else {
            str = c4nj.A09.A00;
        }
        Number number = (Number) this.A06.get(str);
        if (number != null) {
            i = number.intValue();
        } else {
            i = 0;
        }
        anonymousClass306.A7a(i);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C3OO c3oo;
        int A03 = C0f9.A03(-147523636);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C4NJ c4nj = (C4NJ) obj;
        int A032 = C0f9.A03(-20171780);
        Object tag = view.getTag();
        if (tag instanceof C3OO) {
            c3oo = (C3OO) tag;
        } else {
            c3oo = null;
        }
        Context context = view.getContext();
        C14360o3.A07(context);
        C55452gl c55452gl = this.A00;
        java.util.Set CB6 = c4nj.CB6();
        String valueOf = String.valueOf(QuickPromotionSurface.A0C.A00);
        UserSession userSession = this.A01;
        C55462gm c55462gm = C55452gl.A01;
        C49I A00 = c55452gl.A00(context, userSession, null, valueOf, CB6);
        C66142yq c66142yq = this.A02;
        C14360o3.A0B(userSession, 0);
        AbstractC54912fq.A00();
        AbstractC31211Dnu.A00(userSession);
        if (c66142yq.A01.A00(new C94524Nf(c4nj), A00).A07) {
            view.setVisibility(0);
            C66072yj c66072yj = this.A04;
            Object obj3 = c66072yj.A00.get(i, c66072yj.A01);
            C14360o3.A07(obj3);
            InterfaceC66092yl interfaceC66092yl = (InterfaceC66092yl) obj3;
            C14360o3.A0C(interfaceC66092yl, "null cannot be cast to non-null type com.instagram.quickpromotion.ui.megaphone.MegaphoneViewBinder<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
            if (c3oo != null) {
                Map map = this.A05;
                InterfaceC55362gb interfaceC55362gb = this.A03;
                if (map != null) {
                    interfaceC66092yl.AE0(c3oo, interfaceC55362gb, c4nj, map);
                } else {
                    interfaceC66092yl.ADw(c3oo, interfaceC55362gb, c4nj);
                }
            }
        } else {
            view.setVisibility(8);
            if (c3oo instanceof C81383k8) {
                C81383k8 c81383k8 = (C81383k8) c3oo;
                c81383k8.A01.setVisibility(8);
                c81383k8.A03.setVisibility(8);
                c81383k8.A02.setVisibility(8);
            }
        }
        C0f9.A0A(510710182, A032);
        C0f9.A0A(-337618395, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1595238148);
        C14360o3.A0B(viewGroup, 1);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C66072yj c66072yj = this.A04;
        Object obj = c66072yj.A00.get(i, c66072yj.A01);
        C14360o3.A07(obj);
        C14360o3.A0A(from);
        View Csl = ((InterfaceC66092yl) obj).Csl(from, viewGroup);
        C0f9.A0A(-1123229947, A03);
        return Csl;
    }

    public C66132yp() {
    }
}
