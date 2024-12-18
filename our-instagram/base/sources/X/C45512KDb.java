package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KDb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45512KDb extends C53Z {
    public static final String __redex_internal_original_name = "ShhModeUserEducationFragment";
    public C7IM A00;
    public LinearLayout A01;
    public TextView A02;
    public Boolean A03;
    public boolean A04;
    public final List A05 = AbstractC166987dD.A1E();

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this);
    }

    public static final void A00(C45512KDb c45512KDb) {
        C7IM c7im = c45512KDb.A00;
        LinearLayout linearLayout = c45512KDb.A01;
        if (linearLayout != null && c7im != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(c45512KDb.getContext(), c7im.A07.A0E);
            linearLayout.setBackgroundColor(AbstractC53242c7.A0F(contextThemeWrapper, R.attr.elevatedBackgroundColor));
            TextView textView = c45512KDb.A02;
            if (textView != null) {
                textView.setTextColor(AbstractC53242c7.A0F(contextThemeWrapper, R.attr.textColorPrimary));
            }
            for (C47761L7h c47761L7h : c45512KDb.A05) {
                TextView textView2 = c47761L7h.A03;
                if (textView2 != null) {
                    textView2.setTextColor(AbstractC53242c7.A0F(contextThemeWrapper, R.attr.textColorPrimary));
                }
                TextView textView3 = c47761L7h.A02;
                if (textView3 != null) {
                    textView3.setTextColor(AbstractC53242c7.A0F(contextThemeWrapper, R.attr.textColorSecondary));
                }
                ImageView imageView = c47761L7h.A01;
                if (imageView != null) {
                    imageView.setColorFilter(AbstractC53242c7.A0F(contextThemeWrapper, R.attr.textColorPrimary));
                }
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "shh_mode_user_education";
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnCreate(Bundle bundle) {
        super.afterOnCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getBoolean("IS_SHH_REPLAY_ENABLED");
        this.A03 = AbstractC31174DnI.A0n(requireArguments, "IS_CUTOVER_THREAD");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(994613104);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.layout_shh_user_education, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.A01 = linearLayout;
        this.A02 = AbstractC166997dE.A0T(linearLayout, R.id.education_title);
        C47761L7h A00 = AbstractC46823KnI.A00(requireContext());
        int i = 2131973894;
        int i2 = 2131973892;
        if (this.A04) {
            i = 2131973895;
            i2 = 2131973893;
        }
        A00.A00(i, i2, R.drawable.instagram_eye_pano_outline_24);
        List list = this.A05;
        list.add(A00);
        C47761L7h A002 = AbstractC46823KnI.A00(requireContext());
        UserSession session = getSession();
        Boolean bool = this.A03;
        if (bool != null) {
            z = bool.booleanValue();
        }
        C14360o3.A0B(session, 0);
        int i3 = 2131973910;
        if (AbstractC31236DoJ.A02(session, z)) {
            i3 = 2131973909;
        }
        A002.A00(i3, 2131973908, R.drawable.up_arrow);
        list.add(A002);
        C47761L7h A003 = AbstractC46823KnI.A00(requireContext());
        A003.A00(2131973907, 2131973906, R.drawable.instagram_users_pano_outline_24);
        list.add(A003);
        C47761L7h A004 = AbstractC46823KnI.A00(requireContext());
        A004.A00(2131973905, 2131973904, R.drawable.instagram_shield_pano_outline_24);
        list.add(A004);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView(((C47761L7h) it.next()).A00);
        }
        C0f9.A09(1423715474, A02);
        return linearLayout;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-279420231);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        C0f9.A09(-459373808, A02);
    }
}
