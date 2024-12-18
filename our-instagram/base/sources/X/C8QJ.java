package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8QJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QJ extends PopupWindow {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r4 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8QJ(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.Integer r10, boolean r11) {
        /*
            r7 = this;
            r6 = 1
            X.C14360o3.A0B(r8, r6)
            r3 = 2
            X.C14360o3.A0B(r9, r3)
            r0 = -2
            r7.<init>(r0, r0)
            r7.A00 = r8
            r7.A01 = r9
            r7.A02 = r11
            X.0oc r5 = X.C14650od.A02
            boolean r4 = X.C14640oc.A08()
            r7.A03 = r4
            r2 = 0
            if (r4 == 0) goto Lb6
            if (r11 == 0) goto Lb3
            android.content.Context r0 = X.AbstractC53172bz.A01(r8)
        L23:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624664(0x7f0e02d8, float:1.8876514E38)
        L2a:
            android.view.View r0 = r1.inflate(r0, r2)
            r7.setContentView(r0)
            r7.setFocusable(r6)
            android.view.View r0 = r7.getContentView()
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L93
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L93
            if (r11 == 0) goto L55
            if (r4 != 0) goto L97
            r1.mutate()
            r0 = 2131100284(0x7f06027c, float:1.7812945E38)
            int r0 = r8.getColor(r0)
            r1.setColor(r0)
        L55:
            r0 = 1106247680(0x41f00000, float:30.0)
            r7.setElevation(r0)
            if (r10 == 0) goto L83
            android.view.View r1 = r7.getContentView()
            int r0 = r10.intValue()
            r1.setBackgroundResource(r0)
            if (r4 == 0) goto L83
            android.view.View r2 = r7.getContentView()
            boolean r0 = r2 instanceof com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout
            if (r0 == 0) goto L83
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout r2 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout) r2
            if (r2 == 0) goto L83
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setCornerRadius(r0)
        L83:
            r7.setInputMethodMode(r3)
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L92
            r0 = 2132018048(0x7f140380, float:1.9674392E38)
            r7.setAnimationStyle(r0)
        L92:
            return
        L93:
            if (r11 == 0) goto L55
            if (r4 == 0) goto L55
        L97:
            android.view.View r0 = r7.getContentView()
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.Drawable r2 = r0.mutate()
            X.C14360o3.A07(r2)
            r0 = 2131100414(0x7f0602fe, float:1.7813209E38)
            int r1 = r8.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            goto L55
        Lb3:
            r0 = r8
            goto L23
        Lb6:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131624660(0x7f0e02d4, float:1.8876506E38)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8QJ.<init>(android.content.Context, com.instagram.common.session.UserSession, java.lang.Integer, boolean):void");
    }

    public final void A01(View view) {
        int i;
        int i2;
        C14360o3.A0B(view, 0);
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        Context context = this.A00;
        int i5 = context.getResources().getDisplayMetrics().widthPixels;
        int i6 = context.getResources().getDisplayMetrics().heightPixels;
        int i7 = measuredWidth + i3;
        if (i7 <= i5 && view.getHeight() + i4 + measuredHeight <= i6) {
            if (C14650od.A02.A0J()) {
                setAnimationStyle(R.style.PrismContextMenuAnimationTopLeft);
            }
        } else {
            if (i7 <= i5 && view.getHeight() + i4 + measuredHeight > i6) {
                i2 = -(view.getHeight() + measuredHeight);
                if (C14650od.A02.A0J()) {
                    setAnimationStyle(R.style.PrismContextMenuAnimationBottomLeft);
                }
                i = 0;
            } else if (i7 > i5 && view.getHeight() + i4 + measuredHeight <= i6) {
                i = -(measuredWidth - view.getWidth());
                if (C14650od.A02.A0J()) {
                    setAnimationStyle(R.style.PrismContextMenuAnimationTopRight);
                }
                i2 = 0;
            } else if (i7 > i5 && i4 + view.getHeight() + measuredHeight > i6) {
                i = -(measuredWidth - view.getWidth());
                i2 = -(view.getHeight() + measuredHeight);
                if (C14650od.A02.A0J()) {
                    setAnimationStyle(R.style.PrismContextMenuAnimationBottomRight);
                }
            }
            showAsDropDown(view, i, i2, 0);
        }
        i = 0;
        i2 = 0;
        showAsDropDown(view, i, i2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.3Fc, java.lang.Object] */
    public final void A02(List list) {
        C2UU c200488tr;
        Integer num;
        Integer num2;
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList(list);
        Context context = this.A00;
        if (AbstractC56862jK.A00(context)) {
            String string = context.getString(2131960994);
            C14360o3.A07(string);
            arrayList.add(new C199928sw(null, null, null, new C23945Ajf(this), null, string, 0, 0, 0, false, false, false, true, false, false, false));
        }
        RecyclerView recyclerView = (RecyclerView) getContentView().requireViewById(R.id.context_menu_options_list);
        Context context2 = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context2));
        if (this.A03) {
            C14360o3.A07(context2);
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C199928sw c199928sw = (C199928sw) it.next();
                String str = c199928sw.A08;
                Drawable drawable = c199928sw.A03;
                InterfaceC199918sv interfaceC199918sv = c199928sw.A06;
                boolean z = c199928sw.A0E;
                Integer num3 = c199928sw.A07;
                UQ7 uq7 = c199928sw.A05;
                boolean z2 = !c199928sw.A09;
                if (z) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A00;
                }
                if (c199928sw.A0D) {
                    num2 = C05F.A01;
                } else {
                    num2 = C05F.A00;
                }
                arrayList2.add(new C199968t0(drawable, uq7, interfaceC199918sv, num3, num3, num3, num, num2, str, z, z2, c199928sw.A0F));
            }
            c200488tr = new C199208rN(context2, this, arrayList2, this.A02);
        } else {
            C14360o3.A07(context2);
            c200488tr = new C200488tr(context2, this, arrayList, this.A02);
        }
        recyclerView.setAdapter(c200488tr);
        recyclerView.A10(new Object());
        recyclerView.A10(new AbstractC70653Fc() { // from class: X.8rP
            public final RectF A00 = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, 0.0f, 0.0f);

            @Override // X.AbstractC70653Fc
            public final void onDraw(Canvas canvas, RecyclerView recyclerView2, C3F5 c3f5) {
                C14360o3.A0B(canvas, 0);
                C14360o3.A0B(recyclerView2, 1);
                C14360o3.A0B(c3f5, 2);
                RectF rectF = this.A00;
                RectF rectF2 = new RectF(rectF);
                Rect rect = new Rect();
                int childCount = recyclerView2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.A0D(recyclerView2.getChildAt(i), rect);
                    rectF2.left = Math.min(rectF2.left, rect.left);
                    rectF2.top = Math.min(rectF2.top, rect.top);
                    rectF2.right = Math.max(rectF2.right, rect.right);
                    rectF2.bottom = Math.max(rectF2.bottom, rect.bottom);
                }
                if (!rectF2.equals(rectF)) {
                    Path path = new Path();
                    path.addRoundRect(rectF2, 0.0f, 0.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                }
            }
        });
    }

    public final C09530e4 A00() {
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new C09530e4(Integer.valueOf(getContentView().getMeasuredWidth()), Integer.valueOf(getContentView().getMeasuredHeight()));
    }
}
