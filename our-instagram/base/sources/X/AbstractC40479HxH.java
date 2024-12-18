package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.HxH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40479HxH {
    /* JADX WARN: Type inference failed for: r15v0, types: [X.2pS, java.lang.Object] */
    public static final Object A00(C6FW c6fw) {
        EnumC39563HdZ enumC39563HdZ;
        C56352iT A00;
        C5SW A002;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A03;
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        Product A01 = AbstractC41287IPc.A01((C102884kP) A032);
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        C14360o3.A0C(A0A, AbstractC111324zv.A00(6));
        UserSession userSession = (UserSession) A0A;
        Fragment fragment = ((C62862tP) c6fg.A02).A02;
        ?? obj = new Object();
        C41121IIm A02 = AbstractC41652Ibk.A02(c6fg, userSession, AbstractC111324zv.A00(752));
        List list = c6fw.A00;
        if (list.size() > 3) {
            Object obj2 = list.get(3);
            Object obj3 = null;
            if (obj2 instanceof String) {
                obj3 = obj2;
            }
            enumC39563HdZ = (EnumC39563HdZ) EnumC39563HdZ.A01.get(obj3);
            if (enumC39563HdZ == null) {
                enumC39563HdZ = EnumC39563HdZ.A06;
            }
        } else {
            enumC39563HdZ = EnumC39563HdZ.A04;
        }
        InterfaceC19630xq A033 = C1AT.A01(userSession).A03(C1AV.A2Z);
        if (fragment == null || A02 == null || (A00 = Hx9.A00(C6BQ.A03(c6fg), c6fg)) == null) {
            return null;
        }
        ViewGroup viewGroup = A00.A0P;
        String A003 = AbstractC111324zv.A00(1);
        C14360o3.A0C(viewGroup, A003);
        View childAt = viewGroup.getChildAt(2);
        C14360o3.A0C(childAt, A003);
        View childAt2 = ((ViewGroup) childAt).getChildAt(0);
        C14360o3.A0C(childAt2, AbstractC111324zv.A00(4));
        ViewGroup viewGroup2 = (ViewGroup) childAt2;
        int ordinal = enumC39563HdZ.ordinal();
        int i = 3;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw B4Z.A00();
                }
            }
            View childAt3 = viewGroup2.getChildAt(i);
            C14360o3.A0C(childAt3, AbstractC111324zv.A00(34));
            ImageView imageView = (ImageView) childAt3;
            C14360o3.A07(c6fg.A00.getString(2131964682));
            String str = (String) c6fw.A03(2);
            Rect bounds = imageView.getDrawable().getBounds();
            C14360o3.A07(bounds);
            Context context = imageView.getContext();
            C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            C14360o3.A07(context);
            C5SU c5su = new C5SU((Activity) context, new C220539od(context, str));
            c5su.A04(imageView, 0, bounds.height() / 2, true);
            c5su.A01();
            c5su.A0F = true;
            c5su.A07(C5SV.A07);
            c5su.A04 = new C39151HLf(imageView, enumC39563HdZ, A02, userSession, obj, A01, str);
            c5su.A0A = true;
            A002 = c5su.A00();
            if (ordinal == 0 && ordinal == 1) {
                if (!A033.getBoolean("PRODUCT_NOTIFICATIONS_TOOLTIP", false)) {
                    A002.A07(null);
                }
                AbstractC31177DnL.A1N(A033, "PRODUCT_NOTIFICATIONS_TOOLTIP", true);
                return null;
            }
            A002.A07(null);
            return null;
        }
        i = 2;
        View childAt32 = viewGroup2.getChildAt(i);
        C14360o3.A0C(childAt32, AbstractC111324zv.A00(34));
        ImageView imageView2 = (ImageView) childAt32;
        C14360o3.A07(c6fg.A00.getString(2131964682));
        String str2 = (String) c6fw.A03(2);
        Rect bounds2 = imageView2.getDrawable().getBounds();
        C14360o3.A07(bounds2);
        Context context2 = imageView2.getContext();
        C14360o3.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
        C14360o3.A07(context2);
        C5SU c5su2 = new C5SU((Activity) context2, new C220539od(context2, str2));
        c5su2.A04(imageView2, 0, bounds2.height() / 2, true);
        c5su2.A01();
        c5su2.A0F = true;
        c5su2.A07(C5SV.A07);
        c5su2.A04 = new C39151HLf(imageView2, enumC39563HdZ, A02, userSession, obj, A01, str2);
        c5su2.A0A = true;
        A002 = c5su2.A00();
        if (ordinal == 0) {
        }
        A002.A07(null);
        return null;
    }
}
