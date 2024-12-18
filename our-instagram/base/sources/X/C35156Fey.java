package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fey, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35156Fey {
    public static final C35156Fey A00 = new Object();

    public final void A01(Context context, View view, EnumC27427C8u enumC27427C8u, String str, InterfaceC16820sZ interfaceC16820sZ) {
        int i;
        C14360o3.A0B(view, 1);
        view.findViewById(R.id.inspiration_hub_empty_error_state).setVisibility(0);
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.icon);
        int ordinal = enumC27427C8u.ordinal();
        if (ordinal != 0) {
            i = R.drawable.instagram_music_outline_96;
            if (ordinal != 1) {
                i = R.drawable.instagram_users_outline_96;
            }
        } else {
            i = R.drawable.instagram_reels_outline_96;
        }
        A08.setImageResource(i);
        AbstractC31173DnH.A19(context.getResources(), AbstractC166987dD.A0e(view, R.id.title), 2131961762);
        AbstractC31173DnH.A19(context.getResources(), AbstractC166987dD.A0e(view, R.id.subtitle), 2131961761);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.action);
        A0e.setVisibility(0);
        if (str == null) {
            str = AbstractC166997dE.A0q(context.getResources(), 2131961757);
        }
        A0e.setText(str);
        ViewOnClickListenerC35679FpE.A01(A0e, 58, interfaceC16820sZ);
    }

    public final void A02(Context context, View view, EnumC27427C8u enumC27427C8u, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        int i;
        C14360o3.A0B(view, 1);
        if (!AbstractC15820qc.A0F(context) && z) {
            C146106i8 A0Y = AbstractC31174DnI.A0Y();
            AbstractC25226BEj.A1N(context, A0Y, 2131968427);
            A0Y.A02();
            A0Y.A07(R.drawable.instagram_info_pano_outline_24);
            A0Y.A06();
            AbstractC31175DnJ.A0l(context, A0Y, 2131968429);
            A0Y.A0L = true;
            G97.A00(A0Y, interfaceC16820sZ, 1);
            AbstractC31178DnM.A1S(A0Y);
            return;
        }
        view.findViewById(R.id.inspiration_hub_empty_error_state).setVisibility(0);
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.icon);
        int ordinal = enumC27427C8u.ordinal();
        if (ordinal != 0) {
            i = R.drawable.instagram_music_outline_96;
            if (ordinal != 1) {
                i = R.drawable.instagram_users_outline_96;
            }
        } else {
            i = R.drawable.instagram_reels_outline_96;
        }
        A08.setImageResource(i);
        AbstractC31173DnH.A19(context.getResources(), AbstractC166987dD.A0e(view, R.id.title), 2131961904);
        AbstractC31173DnH.A19(context.getResources(), AbstractC166987dD.A0e(view, R.id.subtitle), 2131961903);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.action);
        A0e.setVisibility(0);
        AbstractC31173DnH.A19(context.getResources(), A0e, 2131961902);
        ViewOnClickListenerC35679FpE.A01(A0e, 59, interfaceC16820sZ);
    }

    public static final void A00(Activity activity, C22P c22p, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        INH A0C = AbstractC86593tX.A0C(c22p);
        A0C.A0n = A1V;
        A0C.A01(C128535rM.A00);
        A0C.A01(C208509Kk.A00);
        A0C.A01(C81S.A00);
        AbstractC41671Ic3.A00(activity, A0C.A00(), abstractC59962oe, c22p, userSession);
    }
}
