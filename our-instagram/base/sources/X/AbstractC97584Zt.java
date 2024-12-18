package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97584Zt {
    public static final C55942hf A00 = C55942hf.A03(5.0d, 10.0d);

    public static void A00(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C97564Zr c97564Zr, C4Zp c4Zp, InterfaceC97544Zo interfaceC97544Zo, C141596ac c141596ac) {
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            String id = c38321qM.getId();
            String A002 = AbstractC86623ta.A00(c38321qM.A2P());
            boolean CdW = c38321qM.CdW();
            List BlY = c41181vS.BlY(EnumC75383a5.A0x);
            float A003 = c41181vS.A00();
            C1NB c1nb = c41551w4.A0H.A0W;
            c1nb.getClass();
            String id2 = c1nb.getId();
            id2.getClass();
            A01(userSession, c41181vS, c97564Zr, c4Zp, interfaceC97544Zo, c141596ac, id, A002, id2, BlY, A003, CdW, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.CTB, java.lang.Object] */
    public static void A02(C84823qW c84823qW, C4Zp c4Zp, float f, boolean z) {
        C84823qW c84823qW2;
        int i;
        View view;
        LinearLayout linearLayout;
        ViewGroup viewGroup = c4Zp.A02;
        if (viewGroup != null && (view = (View) viewGroup.getParent()) != null) {
            if (z) {
                TextView textView = c4Zp.A05;
                if (textView != null && (linearLayout = c4Zp.A04) != null) {
                    ViewGroup viewGroup2 = c4Zp.A02;
                    int width = view.getWidth();
                    int height = view.getHeight();
                    int dimensionPixelSize = viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    if (((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin <= 0) {
                        AbstractC13880nE.A0U(textView, linearLayout.getHeight() + dimensionPixelSize);
                    }
                    Rect rect = new Rect();
                    AbstractC138846Qp.A01(rect, c84823qW, f, width, height);
                    int width2 = linearLayout.getWidth();
                    int height2 = linearLayout.getHeight();
                    float width3 = rect.width() / width2;
                    int height3 = linearLayout.getHeight() + dimensionPixelSize + textView.getHeight();
                    float f2 = height2;
                    float height4 = rect.height() / f2;
                    float exactCenterX = rect.exactCenterX() - (viewGroup2.getWidth() / 2.0f);
                    float exactCenterY = rect.exactCenterY();
                    float f3 = height3 - (f2 / 2.0f);
                    float f4 = exactCenterY - f3;
                    if (((int) f4) + height3 > height) {
                        f4 = height - height3;
                    }
                    viewGroup2.setX(exactCenterX);
                    viewGroup2.setY(f4);
                    float max = Math.max(width3, height4);
                    viewGroup2.setScaleX(max);
                    viewGroup2.setScaleY(max);
                    viewGroup2.setPivotX(viewGroup2.getWidth() / 2.0f);
                    viewGroup2.setPivotY(f3);
                    viewGroup2.setRotation(c84823qW.A01 * 360.0f);
                }
            } else {
                ViewGroup viewGroup3 = c4Zp.A02;
                int width4 = view.getWidth();
                int height5 = view.getHeight();
                C138436Oz c138436Oz = C138436Oz.A00;
                C14360o3.A0B(viewGroup3, 0);
                C138436Oz.A04(viewGroup3, c84823qW, f, width4, height5, true);
            }
        }
        if (c4Zp.A0B != null && (c84823qW2 = c4Zp.A09) != null && c4Zp.A02 != null) {
            C101394gx A0D = c84823qW2.A0D();
            Context context = c4Zp.A02.getContext();
            TextView textView2 = c4Zp.A05;
            int i2 = 0;
            if (textView2 != null) {
                i = textView2.getHeight();
            } else {
                i = 0;
            }
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            LinearLayout linearLayout2 = c4Zp.A04;
            if (linearLayout2 != null) {
                i2 = linearLayout2.getHeight();
            }
            float A01 = AbstractC13880nE.A01(context, c4Zp.A02.getX() + (c4Zp.A02.getWidth() / 2.0f));
            float A012 = AbstractC13880nE.A01(context, c4Zp.A02.getY() + (c4Zp.A02.getHeight() / 2.0f));
            float radians = (float) Math.toRadians(c4Zp.A02.getRotation());
            C141596ac c141596ac = c4Zp.A0B;
            A0D.getClass();
            String A002 = AbstractC37865GlK.A00(A0D);
            float A013 = AbstractC13880nE.A01(context, c4Zp.A02.getWidth());
            float f5 = i2 + dimensionPixelSize2 + i;
            float scaleX = c4Zp.A02.getScaleX();
            float scaleY = c4Zp.A02.getScaleY();
            Map map = c141596ac.A0Z;
            if (map == null) {
                map = new HashMap();
                c141596ac.A0Z = map;
            }
            ?? obj = new Object();
            obj.A07 = A002;
            obj.A08 = "poll";
            obj.A06 = A013;
            obj.A02 = f5;
            obj.A00 = A01;
            obj.A01 = A012;
            obj.A03 = radians;
            obj.A04 = scaleX;
            obj.A05 = scaleY;
            map.put(A002, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x035b, code lost:
    
        if (r32.CdW() == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.instagram.common.session.UserSession r31, X.C41181vS r32, X.C97564Zr r33, final X.C4Zp r34, X.InterfaceC97544Zo r35, X.C141596ac r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.List r40, final float r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97584Zt.A01(com.instagram.common.session.UserSession, X.1vS, X.4Zr, X.4Zp, X.4Zo, X.6ac, java.lang.String, java.lang.String, java.lang.String, java.util.List, float, boolean, boolean):void");
    }
}
