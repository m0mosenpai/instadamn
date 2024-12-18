package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.LeY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48596LeY implements MSD, MOO {
    public static final C55942hf A0R = C55942hf.A00();
    public static final String __redex_internal_original_name = "CutoutStickerGalleryController";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public IgTextView A03;
    public IgTextView A04;
    public C47809L9r A05;
    public C48298LYw A06;
    public C195838lR A07;
    public C189058Yv A08;
    public Integer A09;
    public final int A0A;
    public final int A0B;
    public final Activity A0C;
    public final Context A0D;
    public final ViewStub A0E;
    public final AbstractC018607g A0F;
    public final GridLayoutManager A0G;
    public final InterfaceC11380iw A0H;
    public final UserSession A0I;
    public final Integer A0J;
    public final java.util.Set A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final InterfaceC186098Nd A0P;
    public final String A0Q;

    public C48596LeY(Activity activity, Context context, ViewStub viewStub, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC186098Nd interfaceC186098Nd, Integer num, Integer num2, int i, boolean z, boolean z2) {
        C14360o3.A0B(viewStub, 1);
        C14360o3.A0B(userSession, 4);
        AbstractC167017dG.A1T(interfaceC11380iw, abstractC018607g);
        C14360o3.A0B(interfaceC186098Nd, 9);
        this.A0E = viewStub;
        this.A0C = activity;
        this.A0D = context;
        this.A0I = userSession;
        this.A0H = interfaceC11380iw;
        this.A0F = abstractC018607g;
        this.A0A = i;
        this.A0P = interfaceC186098Nd;
        this.A09 = num;
        this.A0O = z;
        this.A0J = num2;
        this.A0N = z2;
        this.A0G = new GridLayoutManager(context, 3);
        this.A0K = AbstractC31171DnF.A0l();
        this.A0L = MHQ.A00(this, 17);
        this.A0M = MHQ.A00(this, 18);
        this.A0B = AbstractC167017dG.A07(context);
        this.A0Q = "cutout-sticker-controller";
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MOO
    public final void DNt(Medium medium) {
        Integer num;
        if (this.A0O) {
            this.A0P.DSY(medium);
            return;
        }
        C8EV c8ev = (C8EV) this.A0L.getValue();
        if (medium.A05()) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        Integer num2 = this.A09;
        C14360o3.A0B(num, 0);
        C8EV.A00(c8ev, C05F.A0Y, num, num2, null, "gallery_media_selected");
        this.A0P.D93(medium, this.A09);
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    public static final void A02(C48596LeY c48596LeY) {
        String str;
        if (c48596LeY.A00 == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "CutoutStickerGalleryController: Gallery container is null", 245701013);
        }
        if (c48596LeY.A00 != null) {
            View view = c48596LeY.A01;
            if (view == null) {
                str = "overlayContainer";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            AbstractC125325le A0n = AbstractC43592JPx.A0n(view);
            A0n.A03 = 8;
            AbstractC125325le A0E = A0n.A0E(A0R);
            A0E.A0K(r2.getBottom());
            C44065Jdq.A00(A0E, c48596LeY, 5);
        }
        IgTextView igTextView = c48596LeY.A03;
        if (igTextView == null) {
            str = "folderMenu";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        igTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.instagram_chevron_down_outline_16, 0);
        c48596LeY.A05 = null;
    }

    public static final void A03(C48596LeY c48596LeY) {
        KNU knu;
        C47809L9r c47809L9r = c48596LeY.A05;
        if (c47809L9r != null && (knu = c47809L9r.A01) != null && knu.onBackPressed()) {
            return;
        }
        if (c48596LeY.A05 != null) {
            A02(c48596LeY);
        } else {
            if (c48596LeY.A0O) {
                return;
            }
            c48596LeY.A0P.D92();
            C8EV.A00((C8EV) c48596LeY.A0L.getValue(), C05F.A0Y, null, c48596LeY.A09, null, "gallery_back_button_tapped");
        }
    }

    public static final void A04(C48596LeY c48596LeY) {
        String str;
        C195838lR c195838lR = c48596LeY.A07;
        if (c195838lR != null) {
            c195838lR.A00();
        }
        c48596LeY.A07 = null;
        View view = c48596LeY.A00;
        if (view != null) {
            str = "folderMenu";
            c48596LeY.A01(view);
            c48596LeY.A00(view);
            IgTextView igTextView = c48596LeY.A03;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C189058Yv c189058Yv = c48596LeY.A08;
        if (c189058Yv == null) {
            str = "mediaLoaderController";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c189058Yv.A07();
    }

    public static final void A05(C48596LeY c48596LeY, int i) {
        C189058Yv c189058Yv = c48596LeY.A08;
        String str = "mediaLoaderController";
        if (c189058Yv != null) {
            c189058Yv.A0C(i);
            IgTextView igTextView = c48596LeY.A03;
            if (igTextView == null) {
                str = "folderMenu";
            } else {
                C189058Yv c189058Yv2 = c48596LeY.A08;
                if (c189058Yv2 != null) {
                    igTextView.setText(c189058Yv2.A01.A03);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A06(C48596LeY c48596LeY, boolean z, boolean z2) {
        View view = c48596LeY.A00;
        if (view != null && AbstractC93174Ft.A03(AbstractC166997dE.A0L(view))) {
            A04(c48596LeY);
            return;
        }
        if (!z) {
            return;
        }
        C48298LYw c48298LYw = c48596LeY.A06;
        if (c48298LYw == null) {
            c48298LYw = new C48298LYw(c48596LeY.A0C);
            c48596LeY.A06 = c48298LYw;
        }
        C43603JQj c43603JQj = new C43603JQj(c48596LeY, 3);
        C43603JQj c43603JQj2 = new C43603JQj(c48596LeY, 4);
        if (c48298LYw.A03) {
            return;
        }
        if (!c48298LYw.A02) {
            Activity activity = c48298LYw.A04;
            if (AbstractC93174Ft.A00(AbstractC23451Ch.A02(activity, AbstractC93174Ft.A05(activity))) == EnumC172127lh.A04) {
                c48298LYw.A02 = true;
            }
        }
        if (c48298LYw.A02) {
            if (z2) {
                WGH.A06(c48298LYw.A04, null);
                return;
            } else {
                c43603JQj2.invoke();
                return;
            }
        }
        c48298LYw.A03 = true;
        c48298LYw.A01 = c43603JQj;
        c48298LYw.A00 = c43603JQj2;
        AbstractC93174Ft.A01(c48298LYw.A04, c48298LYw);
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0K;
    }

    @Override // X.MSD
    public final boolean CJQ() {
        if (this.A0N) {
            A03(this);
            return true;
        }
        return false;
    }

    @Override // X.MSD
    public final void E2K() {
        EnumC188968Ym enumC188968Ym;
        String str;
        View view = this.A00;
        if (view == null) {
            view = this.A0E.inflate();
            if (this.A09 == C05F.A15) {
                Context context = view.getContext();
                AbstractC31172DnG.A1B(context, view, AbstractC53242c7.A0H(context, R.attr.igds_color_media_background));
            }
            this.A01 = view.requireViewById(R.id.cutout_sticker_gallery_overlay_container);
            boolean z = this.A0O;
            if (z) {
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
                View view2 = this.A01;
                if (view2 == null) {
                    str = "overlayContainer";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC31177DnL.A0x(view2, view2.getPaddingLeft(), 0);
                AbstractC31172DnG.A1B(view.getContext(), view, R.color.grey_9);
            }
            if (this.A0N) {
                Context context2 = view.getContext();
                AbstractC31172DnG.A1B(context2, view, AbstractC53242c7.A0H(context2, R.attr.igds_color_media_background));
            }
            int i = (this.A0A - (this.A0B * 2)) / 3;
            int A01 = C1H4.A01(i / 0.5625f);
            UserSession userSession = this.A0I;
            Context context3 = this.A0D;
            C8SF c8sf = new C8SF(context3, userSession, C05F.A00, i, A01, false);
            Jo5 jo5 = new Jo5(c8sf, this, this.A0J, A01, false);
            jo5.setHasStableIds(true);
            C188958Yl c188958Yl = new C188958Yl(this.A0F, c8sf);
            if (AbstractC167007dF.A1Z(this.A0M)) {
                enumC188968Ym = EnumC188968Ym.A02;
            } else {
                enumC188968Ym = EnumC188968Ym.A04;
            }
            c188958Yl.A03 = enumC188968Ym;
            c188958Yl.A09 = true;
            this.A08 = new C189058Yv(context3, null, jo5, new C189028Ys(c188958Yl));
            A01(view);
            A00(view);
            RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.cutout_sticker_grid_recycler_view);
            this.A02 = A0G;
            str = "recyclerView";
            if (A0G != null) {
                A0G.setAdapter(jo5);
                RecyclerView recyclerView = this.A02;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(this.A0G);
                    RecyclerView recyclerView2 = this.A02;
                    if (recyclerView2 != null) {
                        C44286Jhc.A00(recyclerView2, this, 4);
                        RecyclerView recyclerView3 = this.A02;
                        if (recyclerView3 != null) {
                            recyclerView3.setOverScrollMode(2);
                            if (!z) {
                                this.A0K.add(view);
                            }
                            this.A00 = view;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        view.setVisibility(0);
        A06(this, true, false);
    }

    @Override // X.MSD
    public final void close() {
        AbstractC167007dF.A0x(this.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0Q;
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        return AbstractC110854yx.A02(this.A0G);
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A03(this.A0G);
    }

    private final void A00(View view) {
        String str;
        View A0S = AbstractC166997dE.A0S(view, R.id.cutout_stickery_gallery_back_button);
        if (this.A0O) {
            A0S.setVisibility(8);
        } else {
            A0S.setVisibility(0);
            ViewOnClickListenerC48064LPp.A00(A0S, 68, this);
        }
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.cutout_sticker_gallery_folder_menu);
        this.A03 = A0X;
        if (A0X == null) {
            str = "folderMenu";
        } else {
            KKp.A01(AbstractC43592JPx.A0U(A0X), this, 8);
            C189058Yv c189058Yv = this.A08;
            if (c189058Yv == null) {
                str = "mediaLoaderController";
            } else {
                A05(this, c189058Yv.A01.A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A01(View view) {
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.cutout_sticker_gallery_sub_title_label);
        this.A04 = A0X;
        if (this.A0O) {
            if (A0X != null) {
                A0X.setVisibility(8);
                TextView A0N = AbstractC167007dF.A0N(view, R.id.cutout_sticker_gallery_title_label);
                AbstractC31173DnH.A12(this.A0D, A0N, 2131955257);
                A0N.setTypeface(null, 1);
                return;
            }
        } else if (A0X != null) {
            A0X.setVisibility(0);
            IgTextView igTextView = this.A04;
            if (igTextView != null) {
                Context context = this.A0D;
                int i = 2131957419;
                if (AbstractC167007dF.A1Z(this.A0M)) {
                    i = 2131957420;
                }
                AbstractC31173DnH.A12(context, igTextView, i);
                return;
            }
        }
        C14360o3.A0F("subtitleView");
        throw C00O.createAndThrow();
    }
}
