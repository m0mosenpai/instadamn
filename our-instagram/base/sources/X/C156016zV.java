package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.notifications.badging.ui.component.ToastingBadge;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.6zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156016zV implements InterfaceC156026zW {
    public int A00;
    public WeakReference A01;
    public final int A02;
    public final Context A03;
    public final C07X A04;
    public final UserSession A05;
    public final EnumC54222eY A06;
    public final EnumC125765mR A07;
    public final boolean A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    @Override // X.InterfaceC156026zW
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(str, 1);
        if (this.A08 && this.A07 == EnumC125765mR.A0B && this.A0A) {
            EnumC54222eY enumC54222eY = this.A06;
            Context context = viewGroup.getContext();
            View inflate = LayoutInflater.from(context).inflate(R.layout.profile_badged_tab, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
            ToastingBadge toastingBadge = (ToastingBadge) inflate;
            AbstractC56952jT.A03(toastingBadge, context.getString(2131975126));
            ((ProxyFrameLayout) toastingBadge).A01 = true;
            toastingBadge.setUseCase(enumC54222eY);
            toastingBadge.setLifecycleOwner(this.A04);
            C154416wr A00 = A00();
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) toastingBadge.findViewById(R.id.profile_tab_icon_view);
            if (colorFilterAlphaImageView != null) {
                Context context2 = this.A03;
                colorFilterAlphaImageView.setImageDrawable(C14740om.A02(context2.getDrawable(A00.A01), context2.getDrawable(A00.A02)));
                colorFilterAlphaImageView.setContentDescription(context2.getResources().getString(A00.A00));
                colorFilterAlphaImageView.setActiveColor(i);
            }
            return toastingBadge;
        }
        InterfaceC154386wo A002 = AbstractC154376wm.A00(viewGroup, str, i);
        this.A01 = new WeakReference(A002);
        C154416wr A003 = A00();
        A002.EJ3(A003.A03);
        Context context3 = this.A03;
        Drawable drawable = context3.getDrawable(A003.A01);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        String string = context3.getString(this.A02);
        C14360o3.A07(string);
        A002.setTitle(string);
        View view = A002.getView();
        view.setContentDescription(context3.getResources().getString(A003.A00));
        A01(this);
        A002.setActiveIcon(context3.getDrawable(A03()));
        return view;
    }

    @Override // X.InterfaceC156026zW
    public final void Dro(boolean z) {
    }

    @Override // X.InterfaceC156026zW
    public final void Drp() {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.6wr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.6wr, java.lang.Object] */
    private final C154416wr A00() {
        int A02;
        int A03;
        int i;
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                A02 = A02();
                A03 = A03();
                if (ordinal != 2) {
                    i = 2131970246;
                } else {
                    i = 2131970147;
                }
            } else {
                int A022 = A02();
                int A032 = A03();
                ?? obj = new Object();
                obj.A01 = A022;
                obj.A02 = A032;
                obj.A00 = 2131970254;
                obj.A03 = true;
                return obj;
            }
        } else {
            A02 = A02();
            A03 = A03();
            i = 2131970157;
        }
        ?? obj2 = new Object();
        obj2.A01 = A02;
        obj2.A02 = A03;
        obj2.A00 = i;
        obj2.A03 = false;
        return obj2;
    }

    public static final void A01(C156016zV c156016zV) {
        InterfaceC154386wo interfaceC154386wo;
        WeakReference weakReference = c156016zV.A01;
        if (weakReference != null && (interfaceC154386wo = (InterfaceC154386wo) weakReference.get()) != null) {
            interfaceC154386wo.setBadgeCount(c156016zV.A00);
            if (!c156016zV.A08 && EnumC125765mR.A0B == c156016zV.A07) {
                UserSession userSession = c156016zV.A05;
                C54392et A00 = AbstractC54332en.A00(userSession).A00();
                EnumC54222eY enumC54222eY = c156016zV.A06;
                int i = c156016zV.A00;
                C54432ex c54432ex = new C54432ex(enumC54222eY, null, i, i);
                EnumC58162lY enumC58162lY = EnumC58162lY.A0D;
                EnumC58122lU enumC58122lU = EnumC58122lU.A03;
                A00.A02(enumC58122lU, enumC58162lY, c54432ex);
                C54412ev A01 = AbstractC54332en.A00(userSession).A01();
                EnumC54222eY enumC54222eY2 = EnumC54222eY.A0b;
                int i2 = c156016zV.A00;
                C54432ex c54432ex2 = new C54432ex(enumC54222eY2, null, i2, i2);
                EnumC58162lY enumC58162lY2 = EnumC58162lY.A0F;
                C14360o3.A0B(enumC58162lY2, 0);
                A01.A02(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex2);
            }
        }
    }

    public final int A02() {
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return R.drawable.instagram_crown_pano_outline_24;
                }
                return R.drawable.instagram_reshare_pano_outline_24;
            }
            return R.drawable.instagram_tag_up_pano_outline_24;
        }
        if (!this.A0B) {
            return R.drawable.instagram_photo_grid_pano_outline_24;
        }
        return R.drawable.instagram_photo_grid_tall_pano_outline_24;
    }

    public final int A03() {
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return R.drawable.instagram_crown_pano_filled_24;
                }
                return R.drawable.instagram_reshare_pano_filled_24;
            }
            return R.drawable.instagram_tag_up_pano_filled_24;
        }
        if (!this.A0B) {
            return R.drawable.instagram_photo_grid_pano_filled_24;
        }
        return R.drawable.instagram_photo_grid_tall_pano_filled_24;
    }

    @Override // X.InterfaceC156026zW
    public final InterfaceC152836uD AMq(boolean z) {
        UserSession userSession = this.A05;
        EnumC125765mR enumC125765mR = this.A07;
        String C4o = C4o();
        String str = this.A09;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putSerializable("ProfileMediaTabFragment.profile_tab_mode", enumC125765mR);
        bundle.putSerializable("ProfileMediaTabFragment.profile_tab_identifier", C4o);
        bundle.putSerializable("ProfileMediaTabFragment.profile_source_media_id", str);
        ProfileMediaTabFragment profileMediaTabFragment = new ProfileMediaTabFragment();
        profileMediaTabFragment.setArguments(bundle);
        return profileMediaTabFragment;
    }

    @Override // X.InterfaceC156026zW
    public final String Abf() {
        return this.A07.A02;
    }

    @Override // X.InterfaceC156026zW
    public final String BN1() {
        return this.A07.A03;
    }

    @Override // X.InterfaceC156026zW
    public final EnumC125765mR BiA() {
        return this.A07;
    }

    @Override // X.InterfaceC156026zW
    public final String C4o() {
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return "profile_reposts";
                }
                return "profile_fan_club_grid";
            }
            return "profile_tagged_media_photos_of_you";
        }
        return "profile_media_grid";
    }

    @Override // X.InterfaceC156026zW
    public final String C4q() {
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return "tap_repost_grid";
                }
                return "tap_fan_club_tab";
            }
            return "tap_tagged_photos";
        }
        return "tap_grid_tab";
    }

    @Override // X.InterfaceC156026zW
    public final void Drv(boolean z) {
        if (EnumC125765mR.A0B == this.A07) {
            if (this.A08 && this.A0A) {
                AbstractC54342eo A00 = AbstractC54332en.A00(this.A05);
                EnumC54222eY enumC54222eY = this.A06;
                C14360o3.A0B(enumC54222eY, 0);
                ((C54702fS) A00).A00.A02(enumC54222eY);
                return;
            }
            UserSession userSession = this.A05;
            C54392et A002 = AbstractC54332en.A00(userSession).A00();
            EnumC54222eY enumC54222eY2 = this.A06;
            int i = this.A00;
            C54432ex c54432ex = new C54432ex(enumC54222eY2, null, i, i);
            EnumC58162lY enumC58162lY = EnumC58162lY.A0D;
            EnumC58122lU enumC58122lU = EnumC58122lU.A03;
            A002.A01(enumC58122lU, enumC58162lY, c54432ex);
            C54412ev A01 = AbstractC54332en.A00(userSession).A01();
            EnumC54222eY enumC54222eY3 = EnumC54222eY.A0b;
            int i2 = this.A00;
            C54432ex c54432ex2 = new C54432ex(enumC54222eY3, null, i2, i2);
            EnumC58162lY enumC58162lY2 = EnumC58162lY.A0F;
            C14360o3.A0B(enumC58162lY2, 0);
            A01.A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex2, false);
        }
    }

    public C156016zV(Context context, C07X c07x, UserSession userSession, EnumC125765mR enumC125765mR, String str, int i, boolean z) {
        EnumC54222eY enumC54222eY;
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = i;
        this.A07 = enumC125765mR;
        this.A0A = z;
        this.A09 = str;
        this.A04 = c07x;
        C54452ez A02 = AbstractC54332en.A00(userSession).A02();
        this.A08 = A02.A00();
        UserSession userSession2 = A02.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36310662837698780L)) {
            enumC54222eY = EnumC54222eY.A0o;
        } else {
            enumC54222eY = EnumC54222eY.A0a;
        }
        this.A06 = enumC54222eY;
        this.A0B = C18U.A06(c06090Tz, userSession, 36327348785723923L);
    }
}
