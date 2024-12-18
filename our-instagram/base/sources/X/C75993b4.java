package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75993b4 {
    public static final C75993b4 A00 = new Object();

    public static final void A01(View view, View view2, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, String str, int i) {
        int min;
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(view2, 4);
        view.getHitRect(new Rect());
        if (view2.getTouchDelegate() == null) {
            Rect rect = new Rect();
            rect.left = Math.max(view.getLeft(), view2.getLeft());
            rect.right = Math.min(view.getRight(), view2.getRight());
            if (str.equals("cta_extension_tap_on_media")) {
                rect.top = Math.max(0, view2.getHeight() - i);
                min = view2.getHeight();
            } else {
                if (str.equals("cta_extension_tap_on_ufi")) {
                    rect.top = 0;
                    min = Math.min(view2.getHeight(), i);
                }
                view2.setTouchDelegate(new C38306Gsp(rect, view, view2, userSession, c38321qM, c75113Zb, str));
            }
            rect.bottom = min;
            view2.setTouchDelegate(new C38306Gsp(rect, view, view2, userSession, c38321qM, c75113Zb, str));
        }
    }

    public final boolean A05(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        String moduleName = interfaceC60442pS.getModuleName();
        if ((C14360o3.A0K(moduleName, "feed_timeline") || ((C14360o3.A0K(moduleName, "feed_contextual_chain") || C14360o3.A0K(moduleName, "feed_contextual_profile")) && C18U.A06(C06090Tz.A05, userSession, 36321026594776140L))) && ((c38321qM.CdW() || C18U.A06(C06090Tz.A05, userSession, 36321026594907213L)) && C18U.A06(C06090Tz.A05, userSession, 36321026594382920L))) {
            return true;
        }
        return false;
    }

    public static final boolean A02(int i) {
        if (i != EnumC65592xv.A06.ordinal() && i != EnumC65592xv.A07.ordinal() && i != EnumC65592xv.A0F.ordinal() && i != EnumC65592xv.A0Y.ordinal() && i != EnumC65592xv.A1Q.ordinal() && i != EnumC65592xv.A1T.ordinal() && i != EnumC65592xv.A10.ordinal() && i != EnumC65592xv.A11.ordinal() && i != EnumC65592xv.A1b.ordinal() && i != EnumC65592xv.A1c.ordinal() && i != EnumC65592xv.A1G.ordinal() && i != EnumC65592xv.A1H.ordinal() && i != EnumC65592xv.A08.ordinal() && i != EnumC65592xv.A0c.ordinal()) {
            return false;
        }
        return true;
    }

    public static final View A00(View view, int i) {
        RecyclerView recyclerView;
        AbstractC70663Fe abstractC70663Fe;
        int A0C;
        ViewParent parent = view.getParent();
        if (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null || (abstractC70663Fe = recyclerView.A0D) == null || (A0C = AbstractC70663Fe.A0C(view) + i) < 0 || A0C >= abstractC70663Fe.A0U()) {
            return null;
        }
        return abstractC70663Fe.A0d(A0C);
    }

    public final View A03(View view) {
        if (view.getTag(R.id.feed_cta_extra_tappable_target) == null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C14360o3.A07(childAt);
                    View A03 = A03(childAt);
                    if (A03 != null) {
                        return A03;
                    }
                }
            }
            return null;
        }
        return view;
    }

    public final ArrayList A04(View view) {
        ArrayList arrayList = new ArrayList();
        if (view.getTag(R.id.feed_cta_extra_tappable_target) != null) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C14360o3.A07(childAt);
                View A03 = A03(childAt);
                if (A03 != null) {
                    arrayList.addAll(A00.A04(A03));
                }
            }
        }
        return arrayList;
    }
}
