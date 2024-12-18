package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class LFA {
    public static final View A00(ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z, boolean z2) {
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.asset_grid_row_item, viewGroup, false);
        C1QY c1qy = LF3.A0C;
        C14360o3.A0A(inflate);
        inflate.setTag(new LF3(inflate, interfaceC11380iw, userSession));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (z) {
            Resources resources = viewGroup.getResources();
            int i = R.dimen.asset_picker_cell_margin;
            if (z2) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            layoutParams.setMarginEnd(resources.getDimensionPixelSize(i));
        }
        inflate.setLayoutParams(layoutParams);
        return inflate;
    }

    public final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, InterfaceC150196pR interfaceC150196pR, LF3 lf3, InterfaceC148316m1 interfaceC148316m1) {
        String name;
        String str;
        String str2;
        int i;
        String str3;
        EnumC150226pU enumC150226pU;
        int i2;
        ImageUrl CDO;
        ImageView.ScaleType scaleType;
        String str4;
        Drawable drawable;
        String str5;
        Context context;
        C55U c55u;
        C209809Pq A01;
        ImageView.ScaleType scaleType2;
        C194808jg c194808jg;
        KNG kng;
        Drawable drawable2;
        C74P c74p;
        C194808jg c194808jg2;
        Drawable drawable3;
        C74P c74p2;
        C194808jg c194808jg3;
        C74P c74p3;
        C194808jg c194808jg4;
        C74P c74p4;
        C194808jg c194808jg5;
        InterfaceC148316m1 interfaceC148316m12;
        C14360o3.A0B(lf3, 1);
        C14360o3.A0B(interfaceC148316m1, 3);
        if (interfaceC148316m1.CBc() != EnumC148326m2.A05 && (interfaceC148316m12 = lf3.A02) != null && Arrays.hashCode(new Object[]{interfaceC148316m12}) == Arrays.hashCode(new Object[]{interfaceC148316m1})) {
            return;
        }
        EnumC148326m2 CBc = interfaceC148316m1.CBc();
        int ordinal = CBc.ordinal();
        String str6 = "";
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    name = CBc.name();
                    str = "plus_button_id";
                } else {
                    throw B4Z.A00();
                }
            } else {
                C148276lx C0S = interfaceC148316m1.C0S();
                if (C0S == null) {
                    str = "";
                } else {
                    str = C0S.A0Z;
                    String name2 = C0S.A00().name();
                    if (name2 != null) {
                        str6 = name2;
                    }
                }
                name = str6;
            }
        } else {
            C148336m3 B1F = interfaceC148316m1.B1F();
            if (B1F != null && (str2 = B1F.A01) != null) {
                str6 = str2;
            }
            name = CBc.name();
            str = str6;
        }
        if (str.length() > 0 && name.length() > 0) {
            AnonymousClass229.A01(userSession).A01.A02(str, name);
        }
        boolean z = false;
        if (interfaceC148316m1.CBc() == EnumC148326m2.A04) {
            i = lf3.A04;
        } else {
            i = 0;
        }
        lf3.A08.A02();
        ConstrainedImageView constrainedImageView = lf3.A09;
        constrainedImageView.setPadding(i, i, i, i);
        constrainedImageView.setVisibility(AbstractC167007dF.A05(interfaceC148316m1.CLn() ? 1 : 0));
        ConstrainedImageView constrainedImageView2 = lf3.A0A;
        boolean z2 = interfaceC148316m1 instanceof KNG;
        if (z2) {
            Drawable drawable4 = constrainedImageView2.getDrawable();
            Drawable drawable5 = null;
            if ((drawable4 instanceof C194808jg) && (c194808jg5 = (C194808jg) drawable4) != null) {
                drawable5 = (Drawable) AbstractC001800i.A0A(c194808jg5.A05());
            }
            if ((drawable5 instanceof C74P) && (c74p4 = (C74P) drawable5) != null) {
                c74p4.A06();
            }
        } else {
            constrainedImageView2.A09();
        }
        constrainedImageView2.setPadding(i, i, i, i);
        constrainedImageView2.setVisibility(0);
        constrainedImageView2.setFocusable(true);
        Context context2 = constrainedImageView2.getContext();
        int ordinal2 = interfaceC148316m1.CBc().ordinal();
        if (ordinal2 != -1) {
            if (ordinal2 != 1) {
                if (ordinal2 != 0) {
                    if (ordinal2 == 2) {
                        Drawable drawable6 = context2.getDrawable(R.drawable.direct_large_avatar_button_background);
                        if (drawable6 != null) {
                            drawable6.setTint(context2.getColor(R.color.cds_white_a20));
                        }
                        constrainedImageView2.setScaleX(0.8f);
                        constrainedImageView2.setScaleY(0.8f);
                        constrainedImageView2.setImageResource(R.drawable.instagram_add_pano_outline_24);
                        AbstractC31177DnL.A0p(context2, constrainedImageView2, AbstractC53242c7.A0H(context2, R.attr.igds_color_primary_button_on_media));
                        constrainedImageView2.setBackground(drawable6);
                        constrainedImageView2.setPadding(37, 37, 37, 37);
                        InterfaceC19630xq interfaceC19630xq = C21B.A00(userSession).A00;
                        String A00 = AbstractC111324zv.A00(4795);
                        int i3 = interfaceC19630xq.getInt(A00, 0);
                        if (i3 < 3) {
                            Handler A0J = AbstractC167007dF.A0J();
                            A0J.postDelayed(new RunnableC71332Ws0(lf3), 500L);
                            A0J.postDelayed(new RunnableC71333Ws1(lf3), 650L);
                            AbstractC167007dF.A18(interfaceC19630xq, A00, i3 + 1);
                        }
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    C148276lx C0S2 = interfaceC148316m1.C0S();
                    if (C0S2 != null) {
                        Drawable drawable7 = constrainedImageView2.getDrawable();
                        String str7 = null;
                        if ((drawable7 instanceof C194808jg) && (c194808jg4 = (C194808jg) drawable7) != null) {
                            drawable = (Drawable) AbstractC001800i.A0A(c194808jg4.A05());
                        } else {
                            drawable = null;
                        }
                        if ((drawable instanceof C74P) && (c74p3 = (C74P) drawable) != null) {
                            str7 = c74p3.A0k;
                        }
                        C148276lx C0S3 = interfaceC148316m1.C0S();
                        if (C0S3 != null) {
                            str5 = C0S3.A0Z;
                        } else {
                            str5 = null;
                        }
                        if (C14360o3.A0K(str7, str5)) {
                            A01 = new C209809Pq(constrainedImageView2.getDrawable(), null, AbstractC166997dE.A0p(context2, 2131968671));
                        } else {
                            if (z2) {
                                context = new C52182aJ(context2, R.style.IgdsSemanticColorsDark);
                            } else {
                                context = context2;
                            }
                            C14360o3.A0A(context);
                            if (c1810981l != null) {
                                c55u = (C55U) c1810981l.A08.A00;
                            } else {
                                c55u = null;
                            }
                            interfaceC11380iw.getModuleName();
                            A01 = AbstractC209799Pp.A01(context, userSession, c55u, interfaceC150196pR, C0S2);
                        }
                        if (z2 && (kng = (KNG) interfaceC148316m1) != null) {
                            if (kng.A03) {
                                Bitmap decodeResource = BitmapFactory.decodeResource(context2.getResources(), R.drawable.magicmod__beta_backdrop_grid);
                                C14360o3.A07(decodeResource);
                                constrainedImageView2.setBackground(new C44338Jid(decodeResource, context2.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material)));
                                int A0E = AbstractC167017dG.A0E(context2);
                                constrainedImageView2.setPadding(A0E, A0E, A0E, A0E);
                                if (C18U.A06(C06090Tz.A05, userSession, 36323741013847623L)) {
                                    constrainedImageView2.A00 = 0.5625f;
                                    ComposeView composeView = lf3.A07;
                                    composeView.setVisibility(0);
                                    composeView.setContent(C5UA.A04(new C30192DRx(userSession, 17), -162120927, true));
                                }
                            }
                            EnumC46147Kbl enumC46147Kbl = kng.A00;
                            EnumC46147Kbl enumC46147Kbl2 = EnumC46147Kbl.A03;
                            IgImageView igImageView = lf3.A0B;
                            if (enumC46147Kbl != enumC46147Kbl2) {
                                igImageView.setVisibility(0);
                                ViewOnClickListenerC48066LPr.A00(igImageView, 23, kng, A01);
                                if (enumC46147Kbl == EnumC46147Kbl.A04) {
                                    z = true;
                                }
                                igImageView.setSelected(z);
                            } else {
                                igImageView.setVisibility(8);
                            }
                            boolean z3 = kng.A02;
                            Drawable drawable8 = A01.A00;
                            boolean z4 = drawable8 instanceof C194808jg;
                            if (z3) {
                                if (z4 && (c194808jg3 = (C194808jg) drawable8) != null) {
                                    drawable3 = (Drawable) AbstractC001800i.A0A(c194808jg3.A05());
                                } else {
                                    drawable3 = null;
                                }
                                if ((drawable3 instanceof C74P) && (c74p2 = (C74P) drawable3) != null) {
                                    c74p2.A05();
                                }
                            } else {
                                if (z4 && (c194808jg2 = (C194808jg) drawable8) != null) {
                                    drawable2 = (Drawable) AbstractC001800i.A0A(c194808jg2.A05());
                                } else {
                                    drawable2 = null;
                                }
                                if ((drawable2 instanceof C74P) && (c74p = (C74P) drawable2) != null) {
                                    c74p.A07();
                                }
                            }
                        }
                        Drawable drawable9 = A01.A00;
                        constrainedImageView2.setImageDrawable(drawable9);
                        if (z2) {
                            if ((drawable9 instanceof C194808jg) && (c194808jg = (C194808jg) drawable9) != null) {
                                AbstractC001800i.A0A(c194808jg.A05());
                            }
                            scaleType2 = ImageView.ScaleType.CENTER_INSIDE;
                        } else {
                            constrainedImageView2.setImageMatrix(null);
                            scaleType2 = ImageView.ScaleType.FIT_CENTER;
                        }
                        constrainedImageView2.setScaleType(scaleType2);
                        str4 = A01.A02;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                C148336m3 B1F2 = interfaceC148316m1.B1F();
                if (B1F2 != null) {
                    int i4 = B1F2.A00;
                    if (i4 < 0) {
                        i2 = -1;
                    } else {
                        i2 = i4 % 6;
                    }
                    int width = constrainedImageView2.getWidth() - (i * 2);
                    if (i2 >= 0 && width > 0) {
                        float f = width / lf3.A05;
                        Matrix matrix = lf3.A06;
                        matrix.reset();
                        matrix.setTranslate((-i2) * r1, 0.0f);
                        matrix.postScale(f, f);
                        CDO = AbstractC168787gC.A00(userSession, B1F2, lf3.A03);
                        constrainedImageView2.setImageMatrix(matrix);
                        scaleType = ImageView.ScaleType.MATRIX;
                    } else {
                        CDO = interfaceC148316m1.CDO();
                        constrainedImageView2.setImageMatrix(null);
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    }
                    constrainedImageView2.setScaleType(scaleType);
                    if (CDO != null) {
                        constrainedImageView2.setUrl(CDO, interfaceC11380iw);
                    }
                    str4 = B1F2.A02;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            constrainedImageView2.setContentDescription(str4);
        }
        lf3.A02 = interfaceC148316m1;
        lf3.A01 = interfaceC150196pR;
        if (interfaceC148316m1.CBc() == EnumC148326m2.A06) {
            C148276lx C0S4 = interfaceC148316m1.C0S();
            if (C0S4 != null) {
                enumC150226pU = C0S4.A00();
            } else {
                enumC150226pU = null;
            }
            if (enumC150226pU == EnumC150226pU.A0M) {
                return;
            }
        }
        int ordinal3 = interfaceC148316m1.CBc().ordinal();
        if (ordinal3 != 1) {
            if (ordinal3 != 0) {
                if (ordinal3 == 2) {
                    str3 = "plus_button_id";
                } else {
                    throw B4Z.A00();
                }
            } else {
                C148276lx C0S5 = interfaceC148316m1.C0S();
                if (C0S5 != null) {
                    str3 = C0S5.A0Z;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        } else {
            C148336m3 B1F3 = interfaceC148316m1.B1F();
            if (B1F3 != null) {
                str3 = B1F3.A01;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        new C66049Tym(constrainedImageView2, new ME3(str3, userSession, 22), AbstractC209779Pn.A00(userSession)).A00();
    }
}
