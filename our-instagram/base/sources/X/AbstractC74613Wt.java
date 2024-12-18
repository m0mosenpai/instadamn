package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74613Wt {
    public static final View A00(Context context, ViewGroup viewGroup, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(fragmentActivity, 4);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_collection_top_main_bottom_three_media_group, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.main_media);
        C14360o3.A07(requireViewById);
        inflate.setTag(new C3Y6(inflate, interfaceC11380iw, userSession, new C3Y1(fragmentActivity, context, (ViewGroup) requireViewById, userSession)));
        return inflate;
    }
}
