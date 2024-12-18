package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import java.util.List;
import java.util.Map;

/* renamed from: X.9hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216209hd extends C5RN {
    public final Context A00;
    public final UserSession A01;
    public final Integer A02;
    public final List A03;
    public final List A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final Paint A0F;
    public final Paint A0G;

    public static int A00(double d, double d2) {
        return C1H4.A00(d * d2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Map map;
        C14360o3.A0B(canvas, 0);
        if (!C4AC.A09(this.A01) || this.A0D) {
            float A02 = AbstractC166987dD.A02(AbstractC166997dE.A0G(this));
            float min = Math.min(new float[]{AbstractC166997dE.A0H(this), A02}[0], A02);
            canvas.drawCircle(AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this), min - 1.0f, this.A0F);
            canvas.drawCircle(AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this), min, this.A0G);
        }
        int i = 0;
        for (Object obj : this.A03) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            Drawable drawable = (Drawable) obj;
            int intValue = this.A02.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            map = this.A07;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        map = this.A0B;
                    }
                } else {
                    map = this.A05;
                }
            } else {
                map = this.A09;
            }
            Rect rect = (Rect) AbstractC166997dE.A0m(map, i);
            if (rect != null) {
                drawable.setBounds(rect);
                drawable.draw(canvas);
            }
            i = i2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect A03;
        Rect A032;
        Rect A033;
        int A00;
        int A002;
        int A003;
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        UserSession userSession = this.A01;
        if (C4AC.A09(userSession) && this.A0D) {
            this.A09.put(0, AbstractC166987dD.A0V(A02(rect, 0.208d), A01(rect, 0.208d), A02(rect, 0.791d), A01(rect, 0.791d)));
            A03 = AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.115d), A00(rect.height(), 0.149d), A02(rect, 0.115d), A01(rect, 0.149d));
            A032 = AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.543d), A00(rect.height(), 0.512d), A00(AbstractC166987dD.A00(rect), 0.1d), A01(rect, 0.1d));
            A033 = AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.613d), A00(rect.height(), 0.216d), A00(AbstractC166987dD.A00(rect), 0.027d), A01(rect, 0.216d));
            A00 = A00(AbstractC166987dD.A00(rect), 0.317d);
            A002 = A00(rect.height(), 0.648d);
            A003 = A00(AbstractC166987dD.A00(rect), 0.473d);
        } else {
            boolean A09 = C4AC.A09(userSession);
            Map map = this.A09;
            double A004 = AbstractC166987dD.A00(rect);
            if (A09) {
                map.put(0, AbstractC166987dD.A0V(A00(A004, 0.081d), A01(rect, 0.081d), A02(rect, 0.081d), A01(rect, 0.081d)));
                A03 = A03(rect.height() * 0.27d, A00(AbstractC166987dD.A00(rect), 0.04d), A00(rect.height(), 0.162d), A00(AbstractC166987dD.A00(rect), 0.392d));
                A032 = A03(rect.height() * 0.973d, A00(AbstractC166987dD.A00(rect), 0.554d), A00(rect.height(), 0.595d), A00(AbstractC166987dD.A00(rect), 0.932d));
                A033 = A03(rect.height() * 0.432d, A00(AbstractC166987dD.A00(rect), 0.649d), A00(rect.height(), 0.243d), A00(AbstractC166987dD.A00(rect), 0.027d));
                A00 = A00(AbstractC166987dD.A00(rect), 0.283d);
                A002 = A00(rect.height(), 0.757d);
                A003 = A00(AbstractC166987dD.A00(rect), 0.473d);
            } else {
                map.put(0, AbstractC166987dD.A0V(A00(A004, 0.208d), A01(rect, 0.208d), A02(rect, 0.791d), A01(rect, 0.791d)));
                Map map2 = this.A05;
                map2.put(0, A03(rect.height() * 0.625d, A00(AbstractC166987dD.A00(rect), 0.194d), A00(rect.height(), 0.236d), A00(AbstractC166987dD.A00(rect), 0.583d)));
                map2.put(1, A03(rect.height() * 0.819d, A00(AbstractC166987dD.A00(rect), 0.541d), A00(rect.height(), 0.514d), A00(AbstractC166987dD.A00(rect), 0.846d)));
                Map map3 = this.A0B;
                map3.put(0, A03(rect.height() * 0.555d, A02(rect, 0.236d), A00(rect.height(), 0.166d), A02(rect, 0.625d)));
                map3.put(1, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.583d), A00(rect.height(), 0.444d), A00(AbstractC166987dD.A00(rect), 0.888d), A01(rect, 0.888d)));
                map3.put(2, A03(rect.height() * 0.833d, A00(AbstractC166987dD.A00(rect), 0.277d), A00(rect.height(), 0.583d), A00(AbstractC166987dD.A00(rect), 0.527d)));
                Map map4 = this.A07;
                map4.put(0, A03(rect.height() * 0.541d, A00(AbstractC166987dD.A00(rect), 0.18d), A00(rect.height(), 0.152d), A00(AbstractC166987dD.A00(rect), 0.569d)));
                map4.put(1, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.597d), A00(rect.height(), 0.319d), A00(AbstractC166987dD.A00(rect), 0.875d), A01(rect, 0.597d)));
                map4.put(2, A03(rect.height() * 0.847d, A00(AbstractC166987dD.A00(rect), 0.263d), A01(rect, 0.597d), A00(AbstractC166987dD.A00(rect), 0.513d)));
                map4.put(3, AbstractC166987dD.A0V(A02(rect, 0.569d), A00(rect.height(), 0.652d), A00(AbstractC166987dD.A00(rect), 0.736d), A01(rect, 0.819d)));
                return;
            }
        }
        Rect A034 = A03(rect.height() * 0.0d, A00, A002, A003);
        Map map5 = this.A05;
        map5.put(0, A03);
        map5.put(1, A032);
        Map map6 = this.A0B;
        map6.put(0, A03);
        map6.put(1, A032);
        map6.put(2, A033);
        Map map7 = this.A07;
        map7.put(0, A03);
        map7.put(1, A032);
        map7.put(2, A033);
        map7.put(3, A034);
    }

    public C216209hd(Context context, UserSession userSession, List list, boolean z, boolean z2) {
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        Resources resources3;
        int i3;
        Resources resources4;
        int i4;
        Resources resources5;
        int i5;
        Resources resources6;
        int i6;
        Integer num;
        Context context2;
        int i7;
        Map map;
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = list;
        this.A0D = z;
        this.A0E = z2;
        this.A03 = AbstractC166987dD.A1E();
        if (C4AC.A09(userSession) && !z) {
            resources = context.getResources();
            i = R.dimen.action_bar_plus_shadow_height;
        } else {
            resources = context.getResources();
            i = R.dimen.account_group_management_title_text_horizontal_padding;
        }
        float dimension = resources.getDimension(i);
        if (C4AC.A09(userSession) && z) {
            resources2 = context.getResources();
            i2 = R.dimen.audition_flow_picker_subtitle_margin_bottom;
        } else {
            boolean A09 = C4AC.A09(userSession);
            resources2 = context.getResources();
            i2 = R.dimen.add_account_icon_circle_radius;
            if (A09) {
                i2 = R.dimen.account_group_management_title_text_horizontal_padding;
            }
        }
        float dimension2 = resources2.getDimension(i2);
        if (C4AC.A09(userSession) && z) {
            resources3 = context.getResources();
            i3 = R.dimen.prompt_facepilev2_stacked_pog_avatar_large_width;
        } else {
            boolean A092 = C4AC.A09(userSession);
            resources3 = context.getResources();
            i3 = R.dimen.ai_agent_share_profile_sticker_padding;
            if (A092) {
                i3 = R.dimen.add_account_icon_circle_radius;
            }
        }
        float dimension3 = resources3.getDimension(i3);
        if (C4AC.A09(userSession) && z) {
            resources4 = context.getResources();
            i4 = R.dimen.abc_select_dialog_padding_start_material;
        } else {
            boolean A093 = C4AC.A09(userSession);
            resources4 = context.getResources();
            i4 = R.dimen.abc_dialog_padding_top_material;
            if (A093) {
                i4 = R.dimen.abc_dialog_padding_material;
            }
        }
        float dimension4 = resources4.getDimension(i4);
        if (C4AC.A09(userSession) && z) {
            resources5 = context.getResources();
            i5 = R.dimen.ad4ad_button_bottom_margin;
        } else {
            boolean A094 = C4AC.A09(userSession);
            resources5 = context.getResources();
            i5 = R.dimen.account_discovery_bottom_gap;
            if (A094) {
                i5 = R.dimen.abc_dialog_padding_top_material;
            }
        }
        float dimension5 = resources5.getDimension(i5);
        if (C4AC.A09(userSession) && z) {
            resources6 = context.getResources();
            i6 = R.dimen.prompt_facepilev2_stacked_pog_avatar_large_width;
        } else {
            boolean A095 = C4AC.A09(userSession);
            resources6 = context.getResources();
            i6 = R.dimen.abc_select_dialog_padding_start_material;
            if (A095) {
                i6 = R.dimen.add_account_icon_circle_radius;
            }
        }
        float dimension6 = resources6.getDimension(i6);
        this.A0A = AbstractC16850sd.A0M(AbstractC167007dF.A0o(0, (int) (dimension * 1.0f)));
        Integer valueOf = Integer.valueOf((int) (dimension2 * 1.0f));
        C09530e4 A1L = AbstractC166987dD.A1L(0, valueOf);
        Integer valueOf2 = Integer.valueOf((int) (dimension3 * 1.0f));
        this.A06 = AbstractC06930Yk.A06(A1L, AbstractC166987dD.A1L(1, valueOf2));
        C09530e4 A1L2 = AbstractC166987dD.A1L(0, valueOf);
        C09530e4 A1L3 = AbstractC166987dD.A1L(1, valueOf2);
        Integer valueOf3 = Integer.valueOf((int) (dimension4 * 1.0f));
        this.A0C = AbstractC06930Yk.A06(AbstractC167007dF.A1b(2, valueOf3, A1L2, A1L3));
        this.A08 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(0, valueOf), AbstractC167007dF.A0o(1, (int) (dimension6 * 1.0f)), AbstractC166987dD.A1L(2, valueOf3), AbstractC167007dF.A0o(3, (int) (dimension5 * 1.0f)));
        this.A09 = AbstractC166987dD.A1I();
        this.A05 = AbstractC166987dD.A1I();
        this.A0B = AbstractC166987dD.A1I();
        this.A07 = AbstractC166987dD.A1I();
        Paint A0S = AbstractC166987dD.A0S(1);
        AbstractC166987dD.A1N(context, A0S, R.color.igds_secondary_background);
        AbstractC166987dD.A1R(A0S);
        this.A0F = A0S;
        Paint A0S2 = AbstractC166987dD.A0S(1);
        AbstractC166987dD.A1N(context, A0S2, R.color.igds_photo_border);
        A0S2.setStyle(Paint.Style.STROKE);
        this.A0G = A0S2;
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A0C;
                }
            }
            num = C05F.A01;
        } else {
            if (!z2) {
                num = C05F.A00;
            }
            num = C05F.A01;
        }
        this.A02 = num;
        List list2 = this.A04;
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            ImageUrlBase imageUrlBase = (ImageUrlBase) obj;
            if (i8 < list2.size()) {
                int intValue = this.A02.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue == 3) {
                                map = this.A08;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            map = this.A0C;
                        }
                    } else {
                        map = this.A06;
                    }
                } else {
                    map = this.A0A;
                }
                Number number = (Number) AbstractC166997dE.A0m(map, i8);
                if (number != null) {
                    C89533yt c89533yt = new C89533yt(imageUrlBase, "PromptNotePogAvatarDrawable", number.intValue(), 0, 0, this.A00.getColor(R.color.fds_transparent));
                    c89533yt.setCallback(this);
                    this.A03.add(c89533yt);
                }
            }
            i8 = i9;
        }
        if (this.A0E) {
            if (C4AC.A09(this.A01) && !this.A0D) {
                context2 = this.A00;
                i7 = R.drawable.prompt_pog_avatar_plus_icon_facepile_v2;
            } else {
                context2 = this.A00;
                i7 = R.drawable.prompt_pog_avatar_plus_icon;
            }
            Drawable drawable = context2.getDrawable(i7);
            if (drawable != null) {
                this.A03.add(drawable);
            }
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A03;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        invalidateSelf();
    }

    public static int A01(Rect rect, double d) {
        return C1H4.A00(rect.height() * d);
    }

    public static int A02(Rect rect, double d) {
        return C1H4.A00(rect.width() * d);
    }

    public static Rect A03(double d, int i, int i2, int i3) {
        return new Rect(i, i2, i3, C1H4.A00(d));
    }
}
