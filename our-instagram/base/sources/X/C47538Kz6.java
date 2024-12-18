package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Kz6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47538Kz6 {
    public final C215249g0 A00;
    public final C3FQ A01;

    public C47538Kz6(Context context, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8NZ c8nz, C3FQ c3fq, int i, boolean z) {
        C14360o3.A0B(viewGroup, 3);
        this.A01 = c3fq;
        ViewGroup CFj = c3fq.CFj();
        C14360o3.A0C(CFj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        AbstractC31174DnI.A15(context, (RecyclerView) CFj);
        C215249g0 c215249g0 = new C215249g0(context, interfaceC11380iw, userSession, c1810981l, c8nz, i, z);
        this.A00 = c215249g0;
        C148336m3[] A07 = C148336m3.A04.A07(userSession);
        if (A07 != null) {
            List A1Q = AbstractC16960so.A1Q(Arrays.copyOf(A07, A07.length));
            List list = c215249g0.A0E;
            list.clear();
            list.addAll(A1Q);
            C215249g0.A01(c215249g0);
        }
        ViewParent CFj2 = c3fq.CFj();
        C14360o3.A0C(CFj2, "null cannot be cast to non-null type com.instagram.ui.customfadingedge.CustomFadingEdgeView");
        ((InterfaceC172617mW) CFj2).setBottomFadingEnabled(false);
        c3fq.EPJ(c215249g0);
        C1I2 c220579oh = new C220579oh(context, viewGroup, interfaceC11380iw, userSession, c215249g0, c3fq);
        c3fq.AI0();
        c3fq.AAJ(c220579oh);
    }
}
