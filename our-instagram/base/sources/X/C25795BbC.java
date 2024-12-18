package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BbC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25795BbC extends C04N {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CRS A01;
    public final /* synthetic */ InterfaceC24901Jp A02;

    @Override // X.C04N
    public final void A04(C04U c04u) {
        C14360o3.A0B(c04u, 0);
        CRS crs = this.A01;
        L5D l5d = crs.A01;
        View view = l5d.A03;
        C04U.A01(view, null);
        View view2 = l5d.A05;
        if (view2 == null) {
            view2 = view;
        }
        Drawable background = view2.getBackground();
        if (background != null) {
            background.setAlpha(0);
        }
        l5d.A01.setAlpha(0.0f);
        View view3 = l5d.A00;
        view3.setAlpha(0.0f);
        IgdsMediaButton igdsMediaButton = l5d.A09;
        igdsMediaButton.setAlpha(0.0f);
        float f = this.A00;
        igdsMediaButton.setTranslationY(f);
        view3.setTranslationY(f);
        C28213CcB c28213CcB = crs.A02;
        if (C28213CcB.A00(c28213CcB)) {
            Activity activity = c28213CcB.A01;
            activity.getWindow().setStatusBarColor(-1);
            if (!c28213CcB.A00) {
                AbstractC56402iY.A06(activity, true);
                c28213CcB.A00 = true;
            }
        }
        AbstractC25231BEo.A1G(null, this.A02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25795BbC(CRS crs, InterfaceC24901Jp interfaceC24901Jp, int i) {
        super(0);
        this.A01 = crs;
        this.A00 = i;
        this.A02 = interfaceC24901Jp;
    }

    @Override // X.C04N
    public final C04M A01(C04M c04m, C04U c04u) {
        AbstractC167017dG.A1N(c04u, c04m);
        CRS crs = this.A01;
        L5D l5d = crs.A01;
        View view = l5d.A05;
        if (view == null) {
            view = l5d.A03;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        l5d.A01.setAlpha(1.0f);
        l5d.A00.setAlpha(1.0f);
        l5d.A09.setAlpha(1.0f);
        C47527Kyu c47527Kyu = crs.A00;
        c47527Kyu.A00.A01(c47527Kyu.A01, null);
        return c04m;
    }

    @Override // X.C04N
    public final C011504d A02(C011504d c011504d, List list) {
        Object obj;
        AbstractC167017dG.A1N(c011504d, list);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if ((((C04U) obj).A00.A06() & 8) != 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C04U c04u = (C04U) obj;
        if (c04u != null) {
            float A05 = 1.0f - c04u.A00.A05();
            CRS crs = this.A01;
            L5D l5d = crs.A01;
            View view = l5d.A05;
            if (view == null) {
                view = l5d.A03;
            }
            Drawable background = view.getBackground();
            if (background != null) {
                background.setAlpha((int) (255.0f * A05));
            }
            l5d.A01.setAlpha(A05);
            View view2 = l5d.A00;
            view2.setAlpha(A05);
            IgdsMediaButton igdsMediaButton = l5d.A09;
            igdsMediaButton.setAlpha(A05);
            float A052 = this.A00 * c04u.A00.A05();
            igdsMediaButton.setTranslationY(A052);
            view2.setTranslationY(A052);
            crs.A02.A01(c04u.A00.A05());
        }
        return c011504d;
    }
}
