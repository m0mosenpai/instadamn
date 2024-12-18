package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public final class AQG implements View.OnClickListener {
    public final /* synthetic */ C88R A00;

    public AQG(C88R c88r) {
        this.A00 = c88r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.9f8, androidx.fragment.app.Fragment, X.2oe] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.fragment.app.Fragment, X.53Z, X.9fY] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.9fb, androidx.fragment.app.Fragment, X.53Z] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        C214979fZ c214979fZ;
        C189478aR c189478aR;
        int A05 = C0f9.A05(-329048552);
        C88E c88e = this.A00.A0A.A00;
        if (c88e.A09()) {
            C88X A01 = c88e.A0H.A01();
            A01.getClass();
            ACt A012 = c88e.A01(A01);
            if (A012 instanceof C218089kg) {
                C218089kg c218089kg = (C218089kg) A012;
                ?? c53z = new C53Z();
                c53z.A00 = c218089kg;
                Bundle A0b = AbstractC166987dD.A0b();
                List list = c218089kg.A04;
                C14360o3.A0C(list, "null cannot be cast to non-null type java.io.Serializable");
                A0b.putSerializable("CanvasTemplatesBottomSheetFragment.TEMPLATES_LIST", (Serializable) list);
                AM2 am2 = c218089kg.A08.A00.A01.A07.A00().A0B;
                am2.getClass();
                A0b.putParcelable("CanvasTemplatesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME", am2.A03());
                c53z.setArguments(A0b);
                C189478aR A00 = AbstractC226449z1.A00(c218089kg.A06, c218089kg.A07).A00();
                context = c218089kg.A05;
                c189478aR = A00;
                c214979fZ = c53z;
            } else if (A012 instanceof C218049kc) {
                C218049kc c218049kc = (C218049kc) A012;
                ?? abstractC59962oe = new AbstractC59962oe();
                abstractC59962oe.A00 = new A5N(c218049kc);
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putSerializable("CanvasMentionBottomSheetFragment.MEDIA_LIST", (Serializable) c218049kc.A04);
                abstractC59962oe.setArguments(A0b2);
                C189478aR A002 = AbstractC226449z1.A00(c218049kc.A06, c218049kc.A07).A00();
                context = c218049kc.A05;
                c189478aR = A002;
                c214979fZ = abstractC59962oe;
            } else if (A012 instanceof C218059kd) {
                C218059kd c218059kd = (C218059kd) A012;
                C214979fZ c214979fZ2 = new C214979fZ();
                c214979fZ2.A00 = c218059kd;
                Bundle A0b3 = AbstractC166987dD.A0b();
                A0b3.putSerializable("CanvasTemplatesBottomSheetFragment.MEMORIES_LIST", (Serializable) c218059kd.A06);
                A0b3.putSerializable("CanvasMemoriesBottomSheetFragment.ARG_MEDIUM_MAP", c218059kd.A0C);
                AM2 am22 = c218059kd.A0A.A00.A01.A07.A00().A0B;
                am22.getClass();
                A0b3.putParcelable("CanvasMemoriesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME", am22.A03());
                c214979fZ2.setArguments(A0b3);
                C189478aR A003 = AbstractC226449z1.A00(c218059kd.A02, c218059kd.A08).A00();
                context = c218059kd.A07;
                c189478aR = A003;
                c214979fZ = c214979fZ2;
            } else if (A012 instanceof C218119kj) {
                C218119kj c218119kj = (C218119kj) A012;
                ?? c53z2 = new C53Z();
                Bundle A0b4 = AbstractC166987dD.A0b();
                UserSession userSession = c218119kj.A05;
                A0b4.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                c53z2.setArguments(A0b4);
                c53z2.A00 = new A5J(c218119kj);
                AbstractC226449z1.A00(c218119kj.A04, userSession).A00().A03(c218119kj.A03, c53z2);
                AbstractC25651Mw.A00(userSession).A01(c218119kj, C42243InT.class);
            }
            c189478aR.A03(context, c214979fZ);
        }
        C0f9.A0C(1223363782, A05);
    }
}
