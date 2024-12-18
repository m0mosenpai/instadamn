package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7Va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163867Va implements InterfaceC163877Vb, InterfaceC163887Vc {
    public final /* synthetic */ AnonymousClass983 A00;

    public C163867Va(AnonymousClass983 anonymousClass983) {
        this.A00 = anonymousClass983;
    }

    public final void A00() {
        UserSession userSession;
        Context context;
        C3DN A01;
        C159737El A06 = AnonymousClass983.A06(this.A00);
        if (((Boolean) new C159357Cv(C159737El.A09(A06)).A01.getValue()).booleanValue() && (A01 = AbstractC161537Lo.A01((context = A06.A1R), (userSession = A06.A1Z))) != null) {
            C48661Lfo c48661Lfo = new C48661Lfo(A06, A01);
            C28501Zl c28501Zl = C28531Zo.A04.A02;
            DirectAvatarTrayFragmentConfig.StandaloneTray standaloneTray = DirectAvatarTrayFragmentConfig.StandaloneTray.A00;
            EnumC46186KcO enumC46186KcO = EnumC46186KcO.A03;
            ArrayList A0I = C159737El.A0I(A06);
            InterfaceC83713oG interfaceC83713oG = A06.A1z;
            C14360o3.A0B(interfaceC83713oG, 0);
            C45446KAh A012 = c28501Zl.A01(userSession, standaloneTray, c48661Lfo, enumC46186KcO, C159737El.A0A(A06), null, A0I, interfaceC83713oG instanceof InterfaceC2056098k);
            A06.A1C();
            C7IK c7ik = A06.A0U;
            if (c7ik != null) {
                A012.ADq(c7ik);
            }
            Activity activity = (Activity) AbstractC13320mI.A00(context, Activity.class);
            if (activity != null) {
                AbstractC161537Lo.A02(A012, C159737El.A07(activity, A06, C05F.A00));
            }
        }
    }

    public final void A01(final L51 l51) {
        final C160557Hp c160557Hp;
        C7IK c7ik;
        String str;
        Object obj;
        AbstractC159137Bz abstractC159137Bz;
        AbstractC160207Gg createCommandData;
        InterfaceC162057Np interfaceC162057Np;
        IgProgressImageView igProgressImageView;
        C159737El c159737El = this.A00.A0R;
        if (c159737El != null && (c160557Hp = c159737El.A0c) != null && (c7ik = c159737El.A0U) != null) {
            ViewGroup viewGroup = c160557Hp.A03;
            if (viewGroup == null) {
                viewGroup = (ViewGroup) c160557Hp.A0E.inflate();
                c160557Hp.A03 = viewGroup;
            }
            Context context = viewGroup.getContext();
            Resources resources = context.getResources();
            c160557Hp.A03.setPadding(0, 0, 0, resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material) - resources.getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material));
            c160557Hp.A05 = (TextView) c160557Hp.A03.requireViewById(R.id.quoted_message_info);
            c160557Hp.A06 = (TextView) c160557Hp.A03.requireViewById(R.id.quoted_message_subtitle);
            c160557Hp.A08 = (IgSimpleImageView) c160557Hp.A03.requireViewById(R.id.quoted_voice_message_indicator);
            c160557Hp.A04 = (FrameLayout) c160557Hp.A03.requireViewById(R.id.attachment_container);
            c160557Hp.A00 = c160557Hp.A03.requireViewById(R.id.progress_bar);
            Drawable drawable = c160557Hp.A08.getDrawable();
            drawable.getClass();
            Drawable findDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.reply_bar_voice_message_icon);
            findDrawableByLayerId.getClass();
            findDrawableByLayerId.setColorFilter(C3DY.A00(AbstractC53242c7.A0F(context, R.attr.glyphColorPrimary)));
            c160557Hp.A01 = c160557Hp.A03.requireViewById(R.id.close_reply_bar_icon);
            c160557Hp.A02 = c160557Hp.A03.requireViewById(R.id.reply_bar_divider);
            C160577Hr c160577Hr = c160557Hp.A0A;
            c160577Hr.A01 = (IgProgressImageView) c160557Hp.A03.requireViewById(R.id.quoted_media_message_thumbnail);
            C0fQ.A00(new View.OnClickListener() { // from class: X.LOn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C160557Hp c160557Hp2 = c160557Hp;
                    C47572Kzi c47572Kzi = l51.A02;
                    c160557Hp2.A0G.A00(c47572Kzi.A00, c47572Kzi.A01.A0F.A00);
                }
            }, c160557Hp.A01);
            C160557Hp.A00(c160557Hp);
            TextView textView = c160557Hp.A05;
            textView.getClass();
            textView.setText(l51.A06);
            C47572Kzi c47572Kzi = l51.A02;
            TextView textView2 = c160557Hp.A06;
            textView2.getClass();
            CharSequence charSequence = l51.A04;
            int i = 0;
            if (charSequence == null) {
                i = 8;
            }
            textView2.setVisibility(i);
            boolean z = l51.A08;
            TextView textView3 = c160557Hp.A06;
            int i2 = 1;
            if (z) {
                i2 = Integer.MAX_VALUE;
            }
            textView3.setMaxLines(i2);
            TextView textView4 = c160557Hp.A06;
            textView4.getClass();
            textView4.setText(charSequence);
            boolean z2 = l51.A07;
            ImageUrl imageUrl = l51.A01;
            if (z2) {
                long j = l51.A00;
                c160577Hr.A01(imageUrl, j);
                Integer num = l51.A05;
                if (num != null && (igProgressImageView = c160577Hr.A01) != null) {
                    Resources resources2 = igProgressImageView.getResources();
                    C14360o3.A07(resources2);
                    try {
                        float dimension = resources2.getDimension(R.dimen.abc_action_bar_elevation_material);
                        if (Float.valueOf(dimension) != null) {
                            igProgressImageView.setVisibility(0);
                            IgImageView igImageView = igProgressImageView.getIgImageView();
                            Context context2 = igProgressImageView.getContext();
                            igImageView.setColorFilter(context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_secondary_button_on_media_panavision_updated)), PorterDuff.Mode.SRC_OVER);
                            C74843Xy c74843Xy = new C74843Xy();
                            c74843Xy.A06(dimension);
                            AbstractC1580577p.A04(c74843Xy, igProgressImageView.getIgImageView());
                            igProgressImageView.A0A(new AjI(c160577Hr, igProgressImageView, num), R.id.listener_id_for_direct_gated_media_item_viewer_image_binding);
                            if (imageUrl != null) {
                                igProgressImageView.setExpiration(j);
                                if (num == C05F.A0C) {
                                    AbstractC158867Ay.A00(igProgressImageView.getIgImageView(), 1);
                                    C160577Hr.A00(imageUrl, c160577Hr);
                                } else {
                                    igProgressImageView.setMiniPreviewBlurRadius(6);
                                    C160577Hr.A00(new SimpleImageUrl(AnonymousClass001.A0R("preview:/", imageUrl.getUrl())), c160577Hr);
                                }
                            }
                        }
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } else {
                c160577Hr.A01(imageUrl, l51.A00);
            }
            FrameLayout frameLayout = c160557Hp.A04;
            frameLayout.getClass();
            frameLayout.setVisibility(8);
            View view = c160557Hp.A00;
            view.getClass();
            view.setVisibility(8);
            c160557Hp.A0B = z;
            AnonymousClass442 anonymousClass442 = c47572Kzi.A01;
            C159757En c159757En = c160557Hp.A0G;
            EnumC46202Kce enumC46202Kce = c47572Kzi.A00;
            C159737El c159737El2 = c159757En.A00;
            C7E0 c7e0 = c159737El2.A1w;
            if (c7e0 instanceof C159637Dz) {
                C159637Dz c159637Dz = (C159637Dz) c7e0;
                C14360o3.A0B(enumC46202Kce, 0);
                C7E4 c7e4 = c159637Dz.A0E;
                C2EE c2ee = c159637Dz.A02;
                if (enumC46202Kce == EnumC46202Kce.IMAGINE_ANIMATE && c2ee != null) {
                    UserSession userSession = c7e4.A01;
                    if (C7C4.A00.A00(c2ee, 1012) && AbstractC31268Doq.A09(userSession) && AbstractC31268Doq.A08(userSession) && C18U.A06(C06090Tz.A05, userSession, 36319368740412677L)) {
                        ComposerAutoCompleteTextView composerAutoCompleteTextView = c159737El2.A0b.A0S;
                        composerAutoCompleteTextView.setSelection(0);
                        composerAutoCompleteTextView.A04("animate this");
                        composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.length());
                    }
                }
                User A02 = AnonymousClass189.A00(c159737El2.A1Z).A02(anonymousClass442.A0U);
                if (A02 != null) {
                    str = AbstractC101904i3.A08(A02);
                } else {
                    str = "";
                }
                C14360o3.A0B(str, 0);
                Iterator it = c7e4.A00.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    obj = it.next();
                    InterfaceC159097Bv interfaceC159097Bv = (InterfaceC159097Bv) obj;
                    if ((interfaceC159097Bv instanceof InterfaceC162057Np) && (interfaceC162057Np = (InterfaceC162057Np) interfaceC159097Bv) != null && interfaceC162057Np.shouldPrependOnReply(str, enumC46202Kce)) {
                        break;
                    }
                }
                if ((obj instanceof AbstractC159137Bz) && (abstractC159137Bz = (AbstractC159137Bz) obj) != null && (createCommandData = abstractC159137Bz.createCommandData()) != null) {
                    createCommandData.A00 = true;
                    c159737El2.A0b.A04(createCommandData);
                }
            }
            c160557Hp.A09 = l51;
            c160557Hp.A03.setVisibility(0);
            c160557Hp.A03.measure(View.MeasureSpec.makeMeasureSpec(AbstractC13880nE.A0A(context), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
            c160557Hp.A01(c7ik);
            AbstractC125325le A01 = AbstractC125325le.A01(c160557Hp.A03, 0);
            A01.A0G();
            AbstractC125325le A0F = A01.A0F(true);
            A0F.A0T(c160557Hp.A03.getMeasuredHeight(), 0.0f);
            A0F.A04 = 0;
            A0F.A0H();
            C159737El.A0c(c159737El);
        }
    }

    public final void A02(MessageIdentifier messageIdentifier) {
        C159737El A06 = AnonymousClass983.A06(this.A00);
        DirectThreadKey A0A = C159737El.A0A(A06);
        if (A0A != null) {
            C25621Ms A04 = AbstractC47995LLh.A04(A06.A1Z, A0A, messageIdentifier, String.valueOf(C0HN.A00()), new ArrayList());
            A04.A0S(C32207EDg.class, C34793FUv.class);
            C1GJ.A03(A04.A0N());
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A0D = A06.A1R.getString(2131973835);
            c146106i8.A06();
            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
        }
    }

    public final void A03(MessageIdentifier messageIdentifier) {
        AnonymousClass983 anonymousClass983 = this.A00;
        AnonymousClass983.A06(anonymousClass983).A1N(anonymousClass983.A0u.requireActivity(), messageIdentifier, false);
    }

    @Override // X.InterfaceC163887Vc
    public final void ABM() {
        final C159737El A06 = AnonymousClass983.A06(this.A00);
        A06.A1G = A06.A1X();
        AbstractC125325le A00 = AbstractC125325le.A00(A06.A07);
        A00.A0G();
        A00.A0T(0.0f, A06.A07.getHeight());
        AbstractC125325le A0A = A00.A0A();
        A0A.A05 = new InterfaceC125355lh() { // from class: X.AmQ
            @Override // X.InterfaceC125355lh
            public final void onFinish() {
                C159737El.this.A07.setVisibility(4);
            }
        };
        A0A.A0H();
    }

    @Override // X.InterfaceC163877Vb
    public final void CMc() {
        AnonymousClass983.A06(this.A00).A19();
    }

    @Override // X.InterfaceC163877Vb
    public final boolean CXB() {
        return AnonymousClass983.A06(this.A00).A15;
    }

    @Override // X.InterfaceC163877Vb
    public final void El2() {
        AnonymousClass983.A06(this.A00).A1G();
    }
}
