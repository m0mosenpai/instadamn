package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77703du {
    public static final SparseArray A00(EnumC77673dr enumC77673dr) {
        SparseArray sparseArray = new SparseArray(1);
        sparseArray.append(R.id.post_impression_view_tracking_node, enumC77673dr);
        return sparseArray;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00ee. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.LinkedHashMap A02(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77703du.A02(java.lang.String):java.util.LinkedHashMap");
    }

    public static final List A03(View view, EnumC77673dr enumC77673dr, C89553yv c89553yv) {
        Drawable drawable;
        C89533yt c89533yt;
        float[] fArr;
        List list;
        float intValue;
        C14360o3.A0B(c89553yv, 1);
        List list2 = c89553yv.A05;
        C17u A0C = C17s.A0C(0, list2.size());
        if (A0C.isEmpty()) {
            return C16930sl.A00;
        }
        Context context = view.getContext();
        view.getLocationOnScreen(new int[2]);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0C.iterator();
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            if (A00 >= 0 && A00 < list2.size()) {
                drawable = (Drawable) list2.get(A00);
            } else {
                drawable = null;
            }
            if ((drawable instanceof C89533yt) && (c89533yt = (C89533yt) drawable) != null) {
                C14360o3.A0A(context);
                C115795Ls c115795Ls = new C115795Ls(context);
                c115795Ls.setId(A00);
                if (A00 >= 0) {
                    if (A00 < c89553yv.A08.size()) {
                        float f = (c89553yv.A03 - c89553yv.A02) / 2.0f;
                        int intValue2 = c89553yv.A04.intValue();
                        float f2 = 0.0f;
                        if (intValue2 != 2) {
                            if (intValue2 != 1) {
                                if (intValue2 != 3) {
                                    if (intValue2 != 0) {
                                        intValue = 0.0f;
                                    } else {
                                        f2 = ((Number) c89553yv.A06.get(A00)).intValue() * 1.0f;
                                        if (A00 == list2.size() - 1) {
                                            f = 0.0f;
                                        }
                                        intValue = f;
                                    }
                                } else {
                                    if (A00 == list2.size() - 1) {
                                        f = 0.0f;
                                    }
                                    intValue = ((Number) r12.get(A00)).intValue() * 1.0f;
                                    f2 = f;
                                }
                                fArr = new float[]{f2, intValue};
                                Float[] fArr2 = {Float.valueOf(r4[0] + fArr[0]), Float.valueOf(r4[1] + fArr[1])};
                                int i = c89533yt.A01;
                                c115795Ls.A0H(fArr2, i, i);
                                c115795Ls.setImageDrawable(c89533yt);
                                A05(c115795Ls, enumC77673dr);
                                arrayList.add(c115795Ls);
                            } else {
                                list = c89553yv.A06;
                            }
                        } else {
                            list = c89553yv.A07;
                        }
                        f2 = ((Number) list.get(A00)).intValue() * 1.0f;
                        intValue = ((Number) r12.get(A00)).intValue() * 1.0f;
                        fArr = new float[]{f2, intValue};
                        Float[] fArr22 = {Float.valueOf(r4[0] + fArr[0]), Float.valueOf(r4[1] + fArr[1])};
                        int i2 = c89533yt.A01;
                        c115795Ls.A0H(fArr22, i2, i2);
                        c115795Ls.setImageDrawable(c89533yt);
                        A05(c115795Ls, enumC77673dr);
                        arrayList.add(c115795Ls);
                    }
                }
                fArr = new float[]{0.0f, 0.0f};
                Float[] fArr222 = {Float.valueOf(r4[0] + fArr[0]), Float.valueOf(r4[1] + fArr[1])};
                int i22 = c89533yt.A01;
                c115795Ls.A0H(fArr222, i22, i22);
                c115795Ls.setImageDrawable(c89533yt);
                A05(c115795Ls, enumC77673dr);
                arrayList.add(c115795Ls);
            }
        }
        return arrayList;
    }

    public static final void A05(View view, EnumC77673dr enumC77673dr) {
        C14360o3.A0B(view, 0);
        view.setTag(R.id.post_impression_view_tracking_node, enumC77673dr);
    }

    public static final String A01(Integer num) {
        if (num == null) {
            return "";
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "font_style_normal";
        }
        if (intValue == 1) {
            return "font_style_bold";
        }
        if (intValue == 3) {
            return "font_style_bold_italic";
        }
        return intValue == 2 ? "font_style_italic" : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r2.getTag(com.facebook.R.id.image_component_uri_tag) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(android.view.View r2) {
        /*
            boolean r0 = r2 instanceof android.widget.ImageView
            if (r0 == 0) goto Le
            r0 = 2131434585(0x7f0b1c59, float:1.8490988E38)
            java.lang.Object r1 = r2.getTag(r0)
            r0 = 1
            if (r1 != 0) goto Lf
        Le:
            r0 = 0
        Lf:
            r1 = 1
            if (r0 != 0) goto L22
            boolean r0 = r2 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L1d
            r0 = r2
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0C
            if (r0 != 0) goto L22
        L1d:
            boolean r0 = r2 instanceof X.C115795Ls
            if (r0 != 0) goto L22
            r1 = 0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77703du.A06(android.view.View):boolean");
    }

    public static final void A04(Spanned spanned, View view, EnumC77673dr enumC77673dr, List list) {
        Layout layout;
        C85973sR[] c85973sRArr = (C85973sR[]) spanned.getSpans(0, spanned.length(), C85973sR.class);
        C14360o3.A0A(c85973sRArr);
        if (c85973sRArr.length != 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Context context = view.getContext();
            int i = iArr[1];
            int height = view.getHeight();
            C0s6 c0s6 = new C0s6(c85973sRArr);
            while (c0s6.hasNext()) {
                DynamicDrawableSpan dynamicDrawableSpan = (DynamicDrawableSpan) c0s6.next();
                int intrinsicHeight = dynamicDrawableSpan.getDrawable().getIntrinsicHeight();
                int intrinsicWidth = dynamicDrawableSpan.getDrawable().getIntrinsicWidth();
                int spanStart = spanned.getSpanStart(dynamicDrawableSpan);
                float f = 0.0f;
                if ((view instanceof TextView) && (layout = ((TextView) view).getLayout()) != null) {
                    f = layout.getPrimaryHorizontal(spanStart);
                }
                Float[] fArr = {Float.valueOf(f), Float.valueOf((i + (height / 2.0f)) - (intrinsicHeight / 2.0f))};
                C14360o3.A0A(context);
                C115795Ls c115795Ls = new C115795Ls(context);
                c115795Ls.A0H(fArr, intrinsicWidth, intrinsicHeight);
                c115795Ls.setImageDrawable(dynamicDrawableSpan.getDrawable());
                A05(c115795Ls, enumC77673dr);
                list.add(c115795Ls);
            }
        }
    }
}
