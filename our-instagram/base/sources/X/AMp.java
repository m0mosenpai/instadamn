package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class AMp {
    public int A00;
    public int A01;
    public ValueAnimator A02;
    public ImageView A03;
    public IgTextView A04;
    public C194808jg A05;
    public C194808jg A06;
    public C148276lx A07;
    public MusicAssetModel A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public final View A0F;
    public final ViewGroup A0G;
    public final C07X A0H;
    public final UserSession A0I;
    public final C189988bH A0J;
    public final C189858b4 A0K;
    public final InterfaceC189968bF A0L;
    public final C218259kx A0M;
    public final A8U A0N;
    public final C23031Ai A0O;
    public final WeakReference A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final ViewGroup A0U;
    public final InterfaceC11380iw A0V;

    public AMp(ViewGroup viewGroup, C07X c07x, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C189988bH c189988bH, InterfaceC189968bF interfaceC189968bF, WeakReference weakReference) {
        EnumC143276dS enumC143276dS;
        this.A0I = userSession;
        this.A0P = weakReference;
        this.A0H = c07x;
        this.A0U = viewGroup;
        this.A0L = interfaceC189968bF;
        this.A0V = interfaceC11380iw;
        this.A0J = c189988bH;
        ViewGroup viewGroup2 = (ViewGroup) AbstractC166997dE.A0S(viewGroup, R.id.sticker_edit_container);
        this.A0G = viewGroup2;
        View A0S = AbstractC166997dE.A0S(viewGroup2, R.id.sticker_preview_view);
        this.A0F = A0S;
        this.A0O = AbstractC23021Ah.A00(userSession);
        this.A0N = new A8U(A0S, new A63(this));
        this.A0S = AbstractC09440dt.A01(new C57528Pg2(this, 1));
        this.A0Q = AbstractC09440dt.A01(new C57526Pg0(this, 49));
        this.A0T = AbstractC09440dt.A00(EnumC09460dv.A02, new C57528Pg2(this, 2));
        this.A0R = AbstractC09440dt.A01(new C57528Pg2(this, 0));
        this.A00 = 1;
        Context context = viewGroup2.getContext();
        ArrayList arrayList = C189858b4.A02;
        C14360o3.A0A(context);
        this.A0K = new C189858b4(context);
        C14360o3.A07(context);
        C218259kx c218259kx = new C218259kx(context, viewGroup2, interfaceC11380iw, new C8C0(context, viewGroup2.requireViewById(R.id.sticker_picker_container_stub), c07x, null, userSession, null, targetViewSizeProvider, null, null, null, null, null, R.drawable.floating_button_background, false, true, false), new A62(this));
        this.A0M = c218259kx;
        ((C8J9) c218259kx).A01.A0A(c218259kx, false);
        if (interfaceC189968bF.CQQ()) {
            C07X c07x2 = this.A0H;
            C07S c07s = C07S.STARTED;
            C57312k6 A00 = C07Y.A00(c07x2);
            PZP pzp = new PZP(c07x2, c07s, this, null, 37);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC23641Du.A05(anonymousClass191, pzp, A00);
            C07X c07x3 = this.A0H;
            AbstractC23641Du.A05(anonymousClass191, new PZP(c07x3, c07s, this, null, 36), C07Y.A00(c07x3));
            if (C14360o3.A0K(C20Y.A00(userSession).A01.A00, C125535lz.A00)) {
                C44540Jmk c44540Jmk = (C44540Jmk) this.A0S.getValue();
                if (c44540Jmk != null) {
                    if (c44540Jmk.A02.intValue() == 0) {
                        EnumC143286dT enumC143286dT = EnumC143286dT.A0F;
                        UserSession userSession2 = c44540Jmk.A00;
                        if (C18U.A06(AbstractC166997dE.A0U(userSession2), userSession2, 36315876928261792L)) {
                            enumC143276dS = EnumC143276dS.A0S;
                        } else {
                            enumC143276dS = EnumC143276dS.A0T;
                        }
                        AbstractC23641Du.A05(anonymousClass191, new C57166PZk(enumC143276dS, c44540Jmk, enumC143286dT, null, 30), AbstractC141776au.A00(c44540Jmk));
                    } else {
                        throw B4Z.A00();
                    }
                }
                C44540Jmk c44540Jmk2 = (C44540Jmk) this.A0S.getValue();
                if (c44540Jmk2 != null) {
                    c44540Jmk2.A02();
                }
            }
        }
    }

    public static final void A06(AMp aMp) {
        Context context;
        Resources resources;
        int i = 0;
        aMp.A0B = false;
        ImageView imageView = aMp.A03;
        if (imageView != null) {
            Context A0L = AbstractC166997dE.A0L(aMp.A0G);
            C51721Msy c51721Msy = new C51721Msy(null, 0, false, false, false);
            UserSession userSession = aMp.A0I;
            ImageView imageView2 = aMp.A03;
            if (imageView2 != null && (context = imageView2.getContext()) != null && (resources = context.getResources()) != null) {
                i = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
            }
            imageView.setImageDrawable(new C44370Jj9(A0L, c51721Msy, userSession, i));
        }
        ImageView imageView3 = aMp.A03;
        if (imageView3 != null) {
            imageView3.invalidate();
        }
        A03(aMp);
    }

    public static final C194808jg A00(C148276lx c148276lx, AMp aMp) {
        aMp.A0E = ((C148286ly) c148276lx.A0O.get(0)).A0M;
        Context context = aMp.A0G.getContext();
        UserSession userSession = aMp.A0I;
        C148286ly c148286ly = (C148286ly) AbstractC001800i.A0O(c148276lx.A0O, 0);
        if (c148286ly != null) {
            c148286ly.A0c = AbstractC43591JPw.A00(698);
        }
        return C194808jg.A00(context, null, null, userSession, c148276lx, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final BEc A01(Drawable drawable) {
        boolean z = drawable instanceof C5RO;
        Object obj = drawable;
        if (z) {
            obj = ((C5RO) drawable).Afg();
        }
        if (obj instanceof BEc) {
            return (BEc) obj;
        }
        throw AbstractC166987dD.A14("Check failed.");
    }

    public static final void A02(AMp aMp) {
        InterfaceC02590Ai A0f;
        int i;
        C44370Jj9 c44370Jj9;
        ImageView imageView = aMp.A03;
        Drawable drawable = null;
        if (imageView != null) {
            drawable = imageView.getDrawable();
        }
        if ((drawable instanceof C44370Jj9) && (c44370Jj9 = (C44370Jj9) drawable) != null) {
            boolean z = aMp.A0B;
            C51721Msy c51721Msy = c44370Jj9.A01;
            if (z != c51721Msy.A04) {
                c44370Jj9.A01 = new C51721Msy(c51721Msy.A01, 0, c51721Msy.A03, c51721Msy.A02, z);
                c44370Jj9.invalidateSelf();
            }
        }
        C22C A01 = AnonymousClass229.A01(aMp.A0I);
        boolean z2 = aMp.A0B;
        C449524z c449524z = A01.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C18920wW c18920wW = c449524z.A01;
        if (z2) {
            A0f = AbstractC166987dD.A0f(c18920wW, "toggle_avatar_on_event");
            i = 381;
        } else {
            A0f = AbstractC166987dD.A0f(c18920wW, "toggle_avatar_off_event");
            i = 380;
        }
        C25531Mh c25531Mh = new C25531Mh(A0f, i);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "music_sticker");
            c25531Mh.A0S("recipient_ids", A1E);
            c25531Mh.Cht();
        }
    }

    public static final void A03(AMp aMp) {
        AbstractC166987dD.A0d(aMp.A0R).setVisibility(8);
        IgTextView igTextView = aMp.A04;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
    }

    public static final void A04(AMp aMp) {
        boolean A00 = AbstractC150256pZ.A00(aMp.A0I);
        InterfaceC09390do interfaceC09390do = aMp.A0S;
        C44540Jmk c44540Jmk = (C44540Jmk) interfaceC09390do.getValue();
        if (A00) {
            if (c44540Jmk != null) {
                AbstractC166987dD.A1Z(new C57158PZc(c44540Jmk, null, 9), AbstractC141776au.A00(c44540Jmk));
                return;
            }
            return;
        }
        if (c44540Jmk != null) {
            c44540Jmk.A02();
        }
        C44540Jmk c44540Jmk2 = (C44540Jmk) interfaceC09390do.getValue();
        if (c44540Jmk2 == null) {
            return;
        }
        c44540Jmk2.A01();
    }

    public static final void A05(AMp aMp) {
        AbstractC210529Sr abstractC210529Sr;
        C194808jg c194808jg = aMp.A06;
        if (c194808jg != null) {
            BEc A09 = AbstractC101614hW.A09(c194808jg);
            if ((A09 instanceof AbstractC210529Sr) && (abstractC210529Sr = (AbstractC210529Sr) A09) != null) {
                MusicOverlayStickerModel BVf = aMp.A0L.BVf();
                if (BVf != null) {
                    abstractC210529Sr.DUc(BVf);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    public static final void A07(AMp aMp) {
        InterfaceC09390do interfaceC09390do = aMp.A0R;
        AbstractC166987dD.A0d(interfaceC09390do).setVisibility(0);
        aMp.A00 = AbstractC101614hW.A00((IgSimpleImageView) interfaceC09390do.getValue(), aMp.A04, AbstractC101614hW.A08(aMp.A0O, aMp.A0A), aMp.A0B);
        ((ImageView) interfaceC09390do.getValue()).setImageDrawable(aMp.A05);
        View A0d = AbstractC166987dD.A0d(interfaceC09390do);
        String str = aMp.A0E;
        if (str == null) {
            str = AbstractC166997dE.A0p(AbstractC166987dD.A0d(interfaceC09390do).getContext(), 2131967929);
        }
        A0d.setContentDescription(str);
        if (!aMp.A0D) {
            IgTextView igTextView = (IgTextView) aMp.A0G.findViewById(R.id.avatar_sticker_preview_view_helper);
            aMp.A04 = igTextView;
            if (igTextView != null) {
                igTextView.setVisibility(0);
                igTextView.setAlpha(1.0f);
                aMp.A0D = true;
                igTextView.postDelayed(new RunnableC24701Awh(igTextView, aMp), 3000L);
            }
        }
    }

    public static final void A08(AMp aMp) {
        AbstractC210529Sr abstractC210529Sr;
        C194808jg c194808jg = aMp.A06;
        if (c194808jg != null) {
            int i = aMp.A01;
            BEc A09 = AbstractC101614hW.A09(c194808jg);
            if ((A09 instanceof AbstractC210529Sr) && (abstractC210529Sr = (AbstractC210529Sr) A09) != null) {
                MusicOverlayStickerModel musicOverlayStickerModel = abstractC210529Sr.A01;
                int A0K = i - AbstractC167017dG.A0K(musicOverlayStickerModel.A0K);
                Integer num = musicOverlayStickerModel.A0O;
                if (num != null) {
                    num.intValue();
                }
                abstractC210529Sr.A00 = A0K;
                abstractC210529Sr.invalidateSelf();
            }
        }
    }
}
