package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.HxG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40478HxG {
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0iw, java.lang.Object] */
    public static final HHK A00(C6FQ c6fq, C6FW c6fw) {
        C56352iT A00;
        ViewGroup viewGroup;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A03;
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        C14360o3.A0C(A0A, AbstractC111324zv.A00(6));
        UserSession userSession = (UserSession) A0A;
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A032;
        Product A01 = AbstractC41287IPc.A01(c102884kP);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 2);
        Fragment fragment = ((C62862tP) c6fg.A02).A02;
        if (fragment == null || (A00 = Hx9.A00(fragment.requireActivity(), c6fg)) == null) {
            return null;
        }
        View view = fragment.mView;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        View childAt = ((ViewGroup) view).getChildAt(2);
        if (!(childAt instanceof FrameLayout) || (viewGroup = (ViewGroup) childAt) == null) {
            return null;
        }
        ViewGroup viewGroup2 = A00.A0P;
        if (!(viewGroup2 instanceof FrameLayout)) {
            return null;
        }
        View childAt2 = viewGroup2.getChildAt(1);
        if (!(childAt2 instanceof FrameLayout)) {
            return null;
        }
        View childAt3 = ((ViewGroup) childAt2).getChildAt(0);
        if (!(childAt3 instanceof LinearLayout)) {
            return null;
        }
        View childAt4 = ((ViewGroup) childAt3).getChildAt(2);
        if (!(childAt4 instanceof ImageView) || childAt4 == null) {
            return null;
        }
        HHK hhk = new HHK(c6fg.A00, fragment, new Object(), userSession);
        C684336g c684336g = hhk.A09;
        c684336g.A03(hhk);
        c684336g.A02(hhk);
        hhk.A01 = new J17(c6fg, c6fq, c102884kP, A0I);
        hhk.A01(childAt4, viewGroup, A01);
        return hhk;
    }
}
