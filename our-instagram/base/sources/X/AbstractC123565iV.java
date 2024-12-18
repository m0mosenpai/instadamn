package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.user.model.FollowStatus;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.5iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123565iV {
    public static final SpannableStringBuilder A01(Context context, RIXUCtaType rIXUCtaType, int i) {
        Resources resources;
        int i2;
        int i3;
        C14360o3.A0B(context, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (rIXUCtaType != RIXUCtaType.A06) {
            int ordinal = rIXUCtaType.ordinal();
            if (ordinal != 6) {
                i3 = R.drawable.spinsta_data_white;
                if (ordinal != 5) {
                    i3 = R.drawable.tray_play_icon;
                }
            } else {
                i3 = R.drawable.instagram_new_story_outline_12;
            }
            Drawable mutate = AbstractC13620mo.A00(context, i3).mutate();
            C14360o3.A07(mutate);
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            C85973sR c85973sR = new C85973sR(mutate);
            mutate.setColorFilter(C3DY.A00(context.getColor(i)));
            if (rIXUCtaType != RIXUCtaType.A09) {
                c85973sR.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                c85973sR.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
            }
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(c85973sR, 0, 1, 33);
        }
        int ordinal2 = rIXUCtaType.ordinal();
        if (ordinal2 != 6) {
            if (ordinal2 != 5) {
                resources = context.getResources();
                i2 = 2131968425;
                if (ordinal2 != 4) {
                    i2 = 2131968426;
                }
            } else {
                resources = context.getResources();
                i2 = 2131974548;
            }
        } else {
            resources = context.getResources();
            i2 = 2131968424;
        }
        spannableStringBuilder.append((CharSequence) resources.getString(i2));
        return spannableStringBuilder;
    }

    public static final String A03(String str) {
        List list;
        List list2;
        List A03 = new C11L("_").A03(str);
        if (!A03.isEmpty()) {
            ListIterator listIterator = A03.listIterator(A03.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = C16930sl.A00;
        String str2 = ((String[]) list.toArray(new String[0]))[0];
        if (AbstractC001900j.A0a(str2, ".", false)) {
            List A032 = new C11L("\\.").A03(str2);
            if (!A032.isEmpty()) {
                ListIterator listIterator2 = A032.listIterator(A032.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        list2 = AbstractC001800i.A0d(A032, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            }
            list2 = C16930sl.A00;
            return ((String[]) list2.toArray(new String[0]))[1];
        }
        return str2;
    }

    public static final int A00(Resources resources, Integer num, int i) {
        double d;
        int i2;
        int i3;
        int dimensionPixelSize;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.birthday_selfie_preview_margin_top);
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ig_logo_top_margin);
                    int i4 = i - dimensionPixelSize2;
                    int i5 = (int) ((i - (((i4 / dimensionPixelSize4) * dimensionPixelSize3) + dimensionPixelSize2)) / 2.5d);
                    int i6 = (int) ((i - (dimensionPixelSize2 + ((i4 / dimensionPixelSize) * dimensionPixelSize3))) / 2.25d);
                    if (dimensionPixelSize <= i5 && i5 <= dimensionPixelSize4) {
                        return i5;
                    }
                    if (dimensionPixelSize <= i6 && i6 <= dimensionPixelSize4) {
                        return i6;
                    }
                    if (i5 <= dimensionPixelSize4) {
                        if (i6 >= dimensionPixelSize) {
                            return Math.max(i5, dimensionPixelSize4);
                        }
                        return dimensionPixelSize;
                    }
                    return dimensionPixelSize4;
                }
                return resources.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
            }
            d = 1.8d;
            i2 = R.dimen.card_width_medium_large;
            i3 = R.dimen.eu_stamp_icon_size;
        } else {
            d = 1.7d;
            i2 = R.dimen.browser_error_screen_description_width;
            i3 = R.dimen.media_thumbnail_preview_item_height;
        }
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        int dimensionPixelSize7 = resources.getDimensionPixelSize(i2);
        dimensionPixelSize = resources.getDimensionPixelSize(i3);
        int i7 = (int) (((i - dimensionPixelSize5) - dimensionPixelSize6) / d);
        if (dimensionPixelSize <= i7 && i7 <= dimensionPixelSize7) {
            return i7;
        }
        if (i7 > dimensionPixelSize7) {
            return dimensionPixelSize7;
        }
        return dimensionPixelSize;
    }

    public static final EnumC33402EpZ A02(FollowStatus followStatus) {
        int ordinal = followStatus.ordinal();
        if (ordinal != 4) {
            if (ordinal != 3) {
                return null;
            }
            return EnumC33402EpZ.A0A;
        }
        return EnumC33402EpZ.A06;
    }
}
