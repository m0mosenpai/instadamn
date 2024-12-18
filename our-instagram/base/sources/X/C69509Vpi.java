package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.Vpi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69509Vpi {
    public final int A00(Context context, int i) {
        int i2;
        int i3;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 14) {
                            if (i != 19) {
                                if (i != 20) {
                                    if (i != 22) {
                                        if (i == 23) {
                                            i2 = R.attr.igds_color_photo_border;
                                        } else {
                                            throw AbstractC25230BEn.A0n("Invalid color type: ", i);
                                        }
                                    }
                                } else {
                                    i2 = R.attr.igds_color_controls;
                                }
                            } else {
                                i2 = R.attr.igds_color_primary_background;
                            }
                        } else {
                            i2 = R.attr.igds_color_separator;
                        }
                    } else {
                        i3 = R.color.activator_card_progress_bad;
                        return context.getColor(i3);
                    }
                }
                i2 = R.attr.igds_color_secondary_icon;
            } else {
                i2 = R.attr.igds_color_error_or_destructive;
            }
        } else {
            i2 = R.attr.igds_color_success;
        }
        i3 = AbstractC53242c7.A0H(context, i2);
        return context.getColor(i3);
    }
}
