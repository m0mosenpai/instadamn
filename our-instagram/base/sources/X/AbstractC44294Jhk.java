package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.gallery.Medium;

/* renamed from: X.Jhk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44294Jhk {
    public static final CharSequence A00(Context context, Medium medium, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        C14360o3.A0B(context, 0);
        if (z) {
            i3 = 2131963051;
        } else {
            i3 = 2131963110;
            if (z2) {
                i3 = 2131963145;
            }
        }
        String string = context.getString(i3);
        C14360o3.A07(string);
        if (z3 && i >= 0) {
            String string2 = context.getString(2131963104, Integer.valueOf(i + 1), Integer.valueOf(i2));
            C14360o3.A07(string2);
            string = AnonymousClass001.A0T(string2, string, ' ');
        }
        if (medium != null) {
            StringBuilder sb = new StringBuilder(string);
            AbstractC56932jR.A09(context.getString(2131957531, C23831Eq.A03(context, (int) ((medium.A0C * 1000) / 1000))), sb, true);
            return sb;
        }
        return string;
    }

    public static final void A01(Context context, boolean z) {
        String str;
        Resources A0M = AbstractC166997dE.A0M(context);
        int i = 2131962085;
        if (z) {
            i = 2131962086;
        }
        String string = A0M.getString(i);
        if (z) {
            str = "failed_to_load_video_toast";
        } else {
            str = "failed_to_load_photo_toast";
        }
        C9GR.A00(context, string, str, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r0.isValid() != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(com.instagram.ui.widget.mediapicker.MediaPickerItemView r10, X.InterfaceC16820sZ r11) {
        /*
            r9 = 0
            X.C14360o3.A0B(r10, r9)
            r2 = 1
            android.content.Context r8 = X.AbstractC166997dE.A0L(r10)
            boolean r7 = r10.A0A
            com.instagram.common.gallery.model.GalleryItem r0 = r10.A04
            if (r0 == 0) goto L55
            java.lang.Integer r1 = r0.A09
        L11:
            java.lang.Integer r0 = X.C05F.A0N
            r6 = 0
            boolean r5 = X.AbstractC167007dF.A1X(r1, r0)
            X.8IT r0 = r10.A03
            if (r0 == 0) goto L23
            boolean r0 = r0.isValid()
            r4 = 1
            if (r0 == r2) goto L24
        L23:
            r4 = 0
        L24:
            X.8IT r0 = r10.A03
            if (r0 == 0) goto L53
            boolean r3 = r0.Cff()
        L2c:
            android.graphics.Bitmap r0 = r10.A00
            if (r0 == 0) goto L31
            r6 = 1
        L31:
            X.Ji1 r0 = r10.A07
            int r2 = X.AbstractC25227BEk.A05(r0, r9)
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L51
            if (r2 == r9) goto L51
        L3d:
            r0 = 0
            if (r7 != 0) goto L47
            if (r5 != 0) goto L47
            if (r4 != 0) goto L48
            A01(r8, r3)
        L47:
            return r0
        L48:
            if (r1 == 0) goto L47
            if (r6 == 0) goto L47
            boolean r0 = X.AbstractC25231BEo.A1b(r11)
            return r0
        L51:
            r1 = 0
            goto L3d
        L53:
            r3 = 0
            goto L2c
        L55:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC44294Jhk.A02(com.instagram.ui.widget.mediapicker.MediaPickerItemView, X.0sZ):boolean");
    }
}
