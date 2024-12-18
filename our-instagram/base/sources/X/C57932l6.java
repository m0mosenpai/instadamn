package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57932l6 {
    public Activity A00;
    public View A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A07;
    public final InterfaceC53942dY A08;
    public final C54212eX A09;
    public final boolean A0A;
    public final InterfaceC41501vz A05 = new InterfaceC42271xH() { // from class: X.2l7
        @Override // X.InterfaceC42271xH
        public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
            C3IL c3il = (C3IL) obj;
            boolean equals = MSV.A00(519).equals(c3il.A00);
            if (equals) {
                c3il.A04 = "user in main tab";
            }
            return equals;
        }

        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(62180385);
            int A032 = C0f9.A03(1168222393);
            UserSession userSession = C57932l6.this.A07;
            if (userSession != null) {
                AbstractC54332en.A00(userSession).A03();
            }
            C0f9.A0A(1542652593, A032);
            C0f9.A0A(-809568614, A03);
        }
    };
    public final InterfaceC41501vz A06 = new InterfaceC42271xH() { // from class: X.2l8
        @Override // X.InterfaceC42271xH
        public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
            C2AS c2as = (C2AS) obj;
            UserSession userSession = C57932l6.this.A07;
            if (userSession != null && C08730cb.A00(userSession).A00().equals(c2as.A00)) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(35889687);
            int A032 = C0f9.A03(2070477555);
            C57932l6.A00(C57932l6.this);
            C0f9.A0A(71753926, A032);
            C0f9.A0A(814656887, A03);
        }
    };
    public final InterfaceC41501vz A04 = new InterfaceC41501vz() { // from class: X.2l9
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(375525301);
            C3IM c3im = (C3IM) obj;
            int A032 = C0f9.A03(-802260985);
            C57932l6 c57932l6 = C57932l6.this;
            C57932l6.A00(c57932l6);
            if (c57932l6.A00 != null && !C1AD.A06(C06090Tz.A05, 18301740411523079L)) {
                User user = c3im.A00;
                List list = c3im.A01;
                list.addAll(c3im.A02);
                list.add(user.getId());
                java.util.Set stringSet = AbstractC19730y1.A00(AbstractC12960li.A00).A00.getStringSet(AbstractC111324zv.A00(1212), null);
                if (stringSet == null) {
                    stringSet = new HashSet();
                }
                stringSet.addAll(list);
                c57932l6.A02(user, stringSet);
            }
            C0f9.A0A(2098295126, A032);
            C0f9.A0A(1177302700, A03);
        }
    };

    public static void A00(final C57932l6 c57932l6) {
        IgImageView igImageView;
        View view = c57932l6.A01;
        if (view != null && (igImageView = (IgImageView) view.findViewById(R.id.tab_avatar)) != null) {
            igImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            UserSession userSession = c57932l6.A07;
            igImageView.setUrl(userSession, C17060sy.A01.A01(userSession).Bhu(), c57932l6.A03, C1WW.A04);
            igImageView.setVisibility(0);
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.5jX
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    if (view2 instanceof AbstractC58112lT) {
                        ((AbstractC58112lT) view2).A09();
                    }
                    return InstagramMainActivity.A0T((InstagramMainActivity) C57932l6.this.A08);
                }
            });
        }
    }

    public final void A01(Context context, Intent intent, String str, String str2, boolean z, boolean z2, boolean z3) {
        UserSession userSession = this.A07;
        String str3 = userSession.token;
        C14360o3.A0B(str3, 0);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str3);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        bundle.putBoolean(AbstractC111324zv.A00(268), z3);
        if (intent != null) {
            bundle.putParcelable(AbstractC111324zv.A00(444), intent);
        }
        bundle.putBoolean(AbstractC111324zv.A00(433), z);
        bundle.putBoolean(AbstractC111324zv.A00(434), z2);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0d = str;
        C189478aR A00 = c189448aO.A00();
        ENI eni = new ENI();
        eni.setArguments(bundle);
        A00.A03(context, eni);
        if ("long_press_tab_bar".equals(str2)) {
            C19740y2 A002 = AbstractC19730y1.A00(AbstractC12960li.A00);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD = A002.A00.ARD();
            ARD.E7G("preference_long_press_avatar_account_switcher_last_impression_time", currentTimeMillis);
            ARD.apply();
        }
    }

    public C57932l6(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC53942dY interfaceC53942dY, C54212eX c54212eX, String str, boolean z) {
        boolean z2;
        this.A07 = userSession;
        this.A02 = context;
        this.A03 = interfaceC11380iw;
        this.A09 = c54212eX;
        this.A0A = z;
        this.A08 = interfaceC53942dY;
        if (AbstractC57972lA.A00.contains(str)) {
            int BOZ = C0BQ.A00(userSession).BOZ();
            C17110t6 c17110t6 = (C17110t6) C0BQ.A00(userSession);
            if (BOZ > 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            c17110t6.A01 = z2;
        }
    }

    public final void A02(User user, java.util.Set set) {
        if (set.size() > 1 && !AbstractC19730y1.A00(AbstractC12960li.A00).A00.getBoolean("reg_existing_login_snackbar_shown", false)) {
            C36510G8i c36510G8i = new C36510G8i(this);
            Resources resources = this.A02.getResources();
            C14360o3.A0B(resources, 0);
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A0A(c36510G8i);
            c146106i8.A01();
            String string = resources.getString(2131967907);
            C14360o3.A07(string);
            c146106i8.A0G = string;
            c146106i8.A01 = 5000;
            c146106i8.A02 = resources.getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            c146106i8.A0B(EnumC142006bJ.A03);
            c146106i8.A09 = user.Bhu();
            int size = set.size() - 1;
            c146106i8.A0D = AbstractC07900bA.A02(resources, new String[]{user.getUsername(), String.valueOf(size)}, R.plurals.multiple_accounts_logged_in_snackbar_message, size);
            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
        }
        C18720vz c18720vz = AbstractC12960li.A00;
        InterfaceC19610xo ARD = AbstractC19730y1.A00(c18720vz).A00.ARD();
        ARD.E7L(AbstractC111324zv.A00(1212), null);
        ARD.apply();
        InterfaceC19610xo ARD2 = AbstractC19730y1.A00(c18720vz).A00.ARD();
        ARD2.E77(AbstractC111324zv.A00(2433), false);
        ARD2.apply();
    }
}
