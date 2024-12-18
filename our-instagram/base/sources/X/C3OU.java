package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3OU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3OU {
    public static final C72943Ou A00(Context context, ViewGroup viewGroup, UserSession userSession) {
        int i;
        View A00;
        C72943Ou c72943Ou;
        C14360o3.A0B(userSession, 0);
        LayoutInflater from = LayoutInflater.from(context);
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36321988667451327L)) {
            i = R.layout.reel_item_story_unit_one_by_one;
        } else {
            if (((int) C18U.A01(c06090Tz, userSession, 36604880988279968L)) > 0) {
                C14360o3.A0A(from);
                A00 = C50802Vb.A00(from, null, viewGroup, R.layout.reel_item_story_unit, 0, false, true);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(A00);
                C14360o3.A0B(A00, 1);
                c72943Ou = new C72943Ou(A00);
                c72943Ou.A00 = userSession;
                if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36321988667451327L) && A00.findViewById(R.id.media_preview_one_by_one) != null) {
                    c72943Ou.A01 = (IgImageView) A00.requireViewById(R.id.media_preview_one_by_one);
                }
                A00.setTag(c72943Ou);
                return c72943Ou;
            }
            i = R.layout.reel_item_story_unit;
        }
        A00 = from.inflate(i, viewGroup, false);
        int i22 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(A00);
        C14360o3.A0B(A00, 1);
        c72943Ou = new C72943Ou(A00);
        c72943Ou.A00 = userSession;
        if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36321988667451327L)) {
            c72943Ou.A01 = (IgImageView) A00.requireViewById(R.id.media_preview_one_by_one);
        }
        A00.setTag(c72943Ou);
        return c72943Ou;
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, C80673iw c80673iw, ImageUrl imageUrl, String str, int i) {
        C1OG A0J = C25821No.A00().A0J(imageUrl, interfaceC11380iw.getModuleName());
        A0J.A0I = false;
        A0J.A01 = 1;
        A0J.A02 = i;
        A0J.A0E = false;
        A0J.A0M = false;
        A0J.A04 = c80673iw;
        A0J.A09 = str;
        A0J.A0O = false;
        A0J.A0L = false;
        A0J.A0J = true;
        A0J.A00().E7X();
    }

    public static final void A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3G4 c3g4, C3G4 c3g42, final C72943Ou c72943Ou, InterfaceC64002vL interfaceC64002vL, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        IgImageView igImageView;
        ImageUrl A07;
        String str;
        ImageUrl A00;
        int i2;
        Object obj;
        View view;
        Runnable d2p;
        long j;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c72943Ou, 2);
        C14360o3.A0B(c3g4, 3);
        C14360o3.A0B(interfaceC64002vL, 6);
        C14360o3.A0B(list, 7);
        C14360o3.A0B(interfaceC11380iw, 9);
        C3P5.A00(context, new View.OnClickListener() { // from class: X.3P4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int A05 = C0f9.A05(-91907930);
                View.OnClickListener onClickListener = ((C3P2) C72943Ou.this.A03.getHolder().A03.getValue()).A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view2);
                }
                C0f9.A0C(-586983554, A05);
            }
        }, interfaceC11380iw, userSession, c3g4, c72943Ou.A02, interfaceC64002vL, list, i, z3);
        RecyclerReelAvatarView recyclerReelAvatarView = c72943Ou.A03;
        recyclerReelAvatarView.A00(interfaceC11380iw, userSession, c3g4, c3g42, interfaceC64002vL, i, z, z2, z3, z4);
        Reel reel = c3g4.A03;
        if (reel.A1a) {
            boolean A06 = c3g4.A06(userSession);
            C9E7 c9e7 = new C9E7(userSession, 34);
            if (A06) {
                obj = c9e7.invoke();
            } else {
                obj = null;
            }
            Reel reel2 = (Reel) obj;
            if (reel2 != null && !reel2.A16(userSession)) {
                boolean A062 = C18U.A06(C06090Tz.A05, userSession, 36327653728795395L);
                C54606OAh c54606OAh = (C54606OAh) userSession.A01(C54606OAh.class, new C57527Pg1(userSession, 22));
                if (c54606OAh.A02) {
                    j = c54606OAh.A01.getLong(MSV.A00(1367), 0L);
                } else {
                    j = c54606OAh.A00;
                }
                C72933Ot holder = recyclerReelAvatarView.getHolder();
                InterfaceC09390do interfaceC09390do = holder.A05;
                if (((InterfaceC56392iX) interfaceC09390do.getValue()).CGb() == 8 && System.currentTimeMillis() > j + TimeUnit.HOURS.toMillis(1L)) {
                    InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) interfaceC09390do.getValue();
                    view = interfaceC56392iX.getView();
                    View findViewById = view.findViewById(R.id.memory_badge_second_card);
                    C14360o3.A07(findViewById);
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    d2p = new D2Y(view, (ImageView) ((InterfaceC56392iX) holder.A09.getValue()).getView(), interfaceC11380iw, userSession, (IgImageView) findViewById, interfaceC56392iX, reel2, c54606OAh, c72943Ou, interfaceC64002vL, A062);
                    view.post(d2p);
                } else if (A062) {
                    ((InterfaceC56392iX) holder.A09.getValue()).setVisibility(8);
                    InterfaceC56392iX interfaceC56392iX2 = (InterfaceC56392iX) interfaceC09390do.getValue();
                    interfaceC56392iX2.EZv(C23714Aen.A00);
                    interfaceC56392iX2.setVisibility(0);
                    AbstractC27699CJs.A00(((InterfaceC56392iX) interfaceC09390do.getValue()).getView(), interfaceC11380iw, userSession, reel2, interfaceC64002vL, true);
                }
            } else {
                InterfaceC56392iX interfaceC56392iX3 = (InterfaceC56392iX) recyclerReelAvatarView.getHolder().A05.getValue();
                if (interfaceC56392iX3.CGb() == 0) {
                    view = interfaceC56392iX3.getView();
                    ImageView imageView = (ImageView) ((InterfaceC56392iX) recyclerReelAvatarView.getHolder().A09.getValue()).getView();
                    imageView.setVisibility(8);
                    d2p = new D2P(view, imageView, userSession, interfaceC56392iX3);
                    view.post(d2p);
                }
            }
        } else {
            ((InterfaceC56392iX) recyclerReelAvatarView.getHolder().A05.getValue()).setVisibility(8);
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321988667123643L)) {
            C80673iw c80673iw = null;
            if (!c3g4.A06(userSession)) {
                C41181vS A09 = reel.A09(userSession);
                if (A09 != null) {
                    C38321qM c38321qM = A09.A0b;
                    if (c38321qM != null) {
                        if (c38321qM.A5n()) {
                            SimpleImageUrl simpleImageUrl = new SimpleImageUrl(AnonymousClass001.A0R("preview:/", c38321qM.BU6()));
                            A09.A02();
                            A02(interfaceC11380iw, null, simpleImageUrl, null, 6);
                        } else {
                            c80673iw = new C80673iw();
                            str = c38321qM.BU6();
                        }
                    } else {
                        str = null;
                    }
                    A00 = A09.A07(context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width));
                    if (A00 != null) {
                        i2 = 3;
                        A09.A02();
                        A02(interfaceC11380iw, c80673iw, A00, str, i2);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                C42557Isb c42557Isb = reel.A0E;
                if (c42557Isb != null) {
                    if (c42557Isb.A00.getPreview() != null) {
                        c80673iw = new C80673iw();
                        str = c42557Isb.A00.getPreview();
                    } else {
                        str = null;
                    }
                    A00 = c42557Isb.A00();
                    i2 = 3;
                    A02(interfaceC11380iw, c80673iw, A00, str, i2);
                }
            }
        }
        if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36321988667451327L) && (igImageView = c72943Ou.A01) != null) {
            if (reel.A0t()) {
                igImageView.setImageDrawable(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{Color.parseColor("#FFD400"), Color.parseColor("#FF7000"), Color.parseColor("#FF0067"), Color.parseColor("#E700CB")}));
                return;
            }
            if (C3P8.A01(userSession, c3g4)) {
                igImageView.setBackgroundColor(context.getColor(R.color.context_line_color));
                return;
            }
            if (!c3g4.A06(userSession)) {
                C41181vS A092 = reel.A09(userSession);
                if (A092 != null) {
                    C38321qM c38321qM2 = A092.A0b;
                    if (c38321qM2 != null) {
                        if (c38321qM2.A5n()) {
                            igImageView.A04 = 6;
                            igImageView.A05 = A092.A02();
                            A07 = new SimpleImageUrl(AnonymousClass001.A0R("preview:/", c38321qM2.BU6()));
                            igImageView.setUrl(A07, interfaceC11380iw);
                            return;
                        }
                        igImageView.A0A = new C80673iw();
                        igImageView.A0K = c38321qM2.BU6();
                    }
                    A07 = A092.A07(context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width));
                    if (A07 == null) {
                        return;
                    }
                    C14360o3.A0A(igImageView);
                    igImageView.setUrl(A07, interfaceC11380iw);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C42557Isb c42557Isb2 = reel.A0E;
            if (c42557Isb2 == null) {
                return;
            }
            C14360o3.A0A(igImageView);
            igImageView.A0A = new C80673iw();
            igImageView.A0K = c42557Isb2.A00.getPreview();
            igImageView.setUrl(c42557Isb2.A00(), interfaceC11380iw);
            igImageView.setTag(R.id.key_media_id, c42557Isb2.getId());
        }
    }
}
