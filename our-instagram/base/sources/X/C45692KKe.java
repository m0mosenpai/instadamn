package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrlBase;
import java.util.List;
import java.util.Map;

/* renamed from: X.KKe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45692KKe extends C5RN {
    public final Context A00;
    public final Integer A01;
    public final List A02;
    public final List A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D;

    public C45692KKe(Context context, List list, float f) {
        Integer num;
        Map map;
        C14360o3.A0B(list, 2);
        this.A00 = context;
        this.A03 = list;
        this.A02 = AbstractC166987dD.A1E();
        this.A0B = AbstractC16850sd.A0M(A03(context.getResources(), 0, f, R.dimen.canvas_colour_wheel_offset_y));
        this.A05 = AbstractC25233BEq.A0p(1, Integer.valueOf((int) (context.getResources().getDimension(R.dimen.alert_dialog_button_cell_height) * f)), A03(context.getResources(), 0, f, R.dimen.canvas_colour_wheel_offset_y));
        this.A0D = AbstractC25232BEp.A1F(2, Integer.valueOf((int) (AbstractC31173DnH.A00(context, R.dimen.alert_dialog_button_cell_height) * f)), A03(context.getResources(), 0, f, R.dimen.activation_card_icon_container_width), A03(context.getResources(), 1, f, R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
        this.A07 = AbstractC167017dG.A0u(3, Integer.valueOf((int) (context.getResources().getDimension(R.dimen.abc_dropdownitem_icon_width) * f)), A03(context.getResources(), 0, f, R.dimen.activation_card_icon_container_width), A03(context.getResources(), 1, f, R.dimen.action_button_settings_height), A03(context.getResources(), 2, f, R.dimen.abc_alert_dialog_button_dimen));
        this.A09 = AbstractC06930Yk.A06(A03(context.getResources(), 0, f, R.dimen.activation_card_icon_container_width), A03(context.getResources(), 1, f, R.dimen.action_button_settings_height), A03(context.getResources(), 2, f, R.dimen.abc_alert_dialog_button_dimen), A03(context.getResources(), 3, f, R.dimen.abc_dropdownitem_icon_width), A03(context.getResources(), 4, f, R.dimen.abc_dialog_padding_material));
        this.A0A = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1I();
        this.A0C = AbstractC166987dD.A1I();
        this.A06 = AbstractC166987dD.A1I();
        this.A08 = AbstractC166987dD.A1I();
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        num = C05F.A0Y;
                    } else {
                        num = C05F.A0N;
                    }
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        this.A01 = num;
        List list2 = this.A03;
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            ImageUrlBase imageUrlBase = (ImageUrlBase) obj;
            if (i < list2.size()) {
                int intValue = this.A01.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4) {
                                    map = this.A09;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                map = this.A07;
                            }
                        } else {
                            map = this.A0D;
                        }
                    } else {
                        map = this.A05;
                    }
                } else {
                    map = this.A0B;
                }
                Number number = (Number) AbstractC166997dE.A0m(map, i);
                if (number != null) {
                    C89533yt c89533yt = new C89533yt(imageUrlBase, "NoteChatPogAvatarDrawable", number.intValue(), 0, 0, this.A00.getColor(R.color.fds_transparent));
                    c89533yt.setCallback(this);
                    this.A02.add(c89533yt);
                }
            }
            i = i2;
        }
    }

    public static int A00(double d, double d2) {
        return C1H4.A00(d * d2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Map map;
        C14360o3.A0B(canvas, 0);
        int i = 0;
        for (Object obj : this.A02) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            Drawable drawable = (Drawable) obj;
            int intValue = this.A01.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                map = this.A08;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            map = this.A06;
                        }
                    } else {
                        map = this.A0C;
                    }
                } else {
                    map = this.A04;
                }
            } else {
                map = this.A0A;
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
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A0A.put(0, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.1786d), A01(rect, 0.1786d), A00(AbstractC166987dD.A00(rect), 0.821d), A01(rect, 0.821d)));
        Map map = this.A04;
        map.put(0, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.321d), A00(rect.height(), 0.036d), A00(AbstractC166987dD.A00(rect), 0.964d), A00(rect.height(), 0.679d)));
        map.put(1, AbstractC166987dD.A0V(A02(rect, 0.036d), A00(rect.height(), 0.593d), A00(AbstractC166987dD.A00(rect), 0.407d), A01(rect, 0.964d)));
        Map map2 = this.A0C;
        map2.put(0, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.436d), A00(rect.height(), 0.029d), A02(rect, 0.964d), A00(rect.height(), 0.557d)));
        map2.put(1, AbstractC166987dD.A0V(A02(rect, 0.036d), A00(rect.height(), 0.336d), A00(AbstractC166987dD.A00(rect), 0.464d), A00(rect.height(), 0.764d)));
        map2.put(2, AbstractC166987dD.A0V(A02(rect, 0.436d), A00(rect.height(), 0.593d), A00(AbstractC166987dD.A00(rect), 0.807d), A00(rect.height(), 0.964d)));
        Map map3 = this.A06;
        map3.put(0, AbstractC166987dD.A0V(A02(rect, 0.036d), A01(rect, 0.036d), A00(AbstractC166987dD.A00(rect), 0.564d), A01(rect, 0.564d)));
        map3.put(1, AbstractC166987dD.A0V(A02(rect, 0.564d), A00(rect.height(), 0.464d), A00(AbstractC166987dD.A00(rect), 0.964d), A00(rect.height(), 0.864d)));
        map3.put(2, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.179d), A00(rect.height(), 0.621d), A00(AbstractC166987dD.A00(rect), 0.521d), A00(rect.height(), 0.964d)));
        map3.put(3, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.65d), A00(rect.height(), 0.15d), A00(AbstractC166987dD.A00(rect), 0.879d), A00(rect.height(), 0.379d)));
        Map map4 = this.A08;
        map4.put(0, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.036d), A01(rect, 0.036d), A00(AbstractC166987dD.A00(rect), 0.564d), A01(rect, 0.564d)));
        map4.put(1, AbstractC166987dD.A0V(A02(rect, 0.564d), A00(rect.height(), 0.464d), A02(rect, 0.964d), A01(rect, 0.864d)));
        map4.put(2, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.179d), A01(rect, 0.621d), A02(rect, 0.521d), A01(rect, 0.964d)));
        map4.put(3, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.65d), A01(rect, 0.15d), A02(rect, 0.879d), A01(rect, 0.379d)));
        map4.put(4, AbstractC166987dD.A0V(A00(AbstractC166987dD.A00(rect), 0.014d), A01(rect, 0.564d), A00(AbstractC166987dD.A00(rect), 0.186d), A00(rect.height(), 0.736d)));
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A02;
    }

    public static int A01(Rect rect, double d) {
        return C1H4.A00(rect.height() * d);
    }

    public static int A02(Rect rect, double d) {
        return C1H4.A00(rect.width() * d);
    }

    public static C09530e4 A03(Resources resources, Object obj, float f, int i) {
        return new C09530e4(obj, Integer.valueOf((int) (resources.getDimension(i) * f)));
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        invalidateSelf();
    }
}
