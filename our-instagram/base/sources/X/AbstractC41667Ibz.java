package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Ibz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41667Ibz {
    public static final View A00(Context context, ViewGroup viewGroup, boolean z) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(context), viewGroup, R.layout.layout_product_pivots, false);
        C38486Gw7 c38486Gw7 = new C38486Gw7(A0D);
        A0D.setTag(c38486Gw7);
        if (z) {
            AbstractC31172DnG.A1B(context, A0D, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_background));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A12(true);
        RecyclerView recyclerView = c38486Gw7.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        AbstractC37304Gc5.A0z(recyclerView, AbstractC167017dG.A0F(context), AbstractC167017dG.A0E(context));
        return A0D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (r0 != 1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r11, X.InterfaceC11380iw r12, com.instagram.common.session.UserSession r13, X.InterfaceC99144cb r14, X.IJ0 r15, X.InterfaceC64872wl r16, X.C38486Gw7 r17, java.lang.Integer r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41667Ibz.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.4cb, X.IJ0, X.2wl, X.Gw7, java.lang.Integer):void");
    }

    public static final void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC64872wl interfaceC64872wl, C38486Gw7 c38486Gw7, String str) {
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, userSession, interfaceC11380iw, c38486Gw7, interfaceC64872wl);
        C99114cY A00 = AbstractC99104cX.A00(userSession);
        C99134ca c99134ca = (C99134ca) A00.A00.get(str);
        if (c99134ca != null) {
            Map map = A00.A01;
            String Byk = c99134ca.Byk();
            IJ0 ij0 = (IJ0) map.get(Byk);
            if (ij0 == null) {
                ij0 = new IJ0(c99134ca, 0);
                map.put(Byk, ij0);
            }
            A01(context, interfaceC11380iw, userSession, c99134ca, ij0, interfaceC64872wl, c38486Gw7, null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
