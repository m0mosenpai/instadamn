package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97644Zz {
    public static void A00(final UserSession userSession, InterfaceC41201vU interfaceC41201vU, InterfaceC97614Zw interfaceC97614Zw, final C97624Zx c97624Zx, boolean z) {
        boolean z2;
        int i;
        View inflate;
        final C84823qW A00 = AbstractC97594Zu.A00(interfaceC41201vU);
        Wm1 A01 = AbstractC97594Zu.A01(interfaceC41201vU);
        if (A00 != null && A01 != null) {
            C57702kj A002 = C57702kj.A00(userSession);
            Iterator it = A002.A06().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = A01.A02.A08;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str2.getClass();
                    if (str.contains(AnonymousClass001.A0g("_", str2, "_"))) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (c97624Zx.A01 == null) {
                View view = c97624Zx.A09.getView();
                c97624Zx.A01 = view;
                TextView textView = (TextView) view.findViewById(R.id.quiz_sticker_question);
                c97624Zx.A03 = textView;
                textView.getClass();
                C6QV.A02(textView);
                c97624Zx.A02 = (LinearLayout) c97624Zx.A01.findViewById(R.id.quiz_sticker_answer_list);
            }
            InterfaceC56392iX interfaceC56392iX = c97624Zx.A09;
            interfaceC56392iX.setVisibility(0);
            c97624Zx.A04 = interfaceC41201vU;
            c97624Zx.A07 = A01;
            c97624Zx.A05 = interfaceC97614Zw;
            URM urm = A01.A02;
            Integer num = urm.A03;
            if (num == null || (i = num.intValue()) == -1) {
                if (z2) {
                    Iterator it2 = A002.A06().iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        String str4 = urm.A08;
                        if (str4 == null) {
                            str4 = "";
                        }
                        str4.getClass();
                        if (str3.contains(AnonymousClass001.A0g("_", str4, "_"))) {
                            A002.A05(str3);
                        }
                    }
                }
                i = -1;
            }
            c97624Zx.A00 = i;
            TextView textView2 = c97624Zx.A03;
            textView2.getClass();
            Wm1 wm1 = c97624Zx.A07;
            wm1.getClass();
            textView2.setText(wm1.A01);
            c97624Zx.A03.setTextColor(AbstractC13950nL.A0C(c97624Zx.A07.A02.A0A, -1));
            int[] iArr = {AbstractC13950nL.A0C(c97624Zx.A07.A02.A09, -14277082), AbstractC13950nL.A0C(c97624Zx.A07.A02.A05, -14277082)};
            Drawable background = c97624Zx.A03.getBackground();
            background.getClass();
            ((GradientDrawable) background.mutate()).setColors(iArr);
            List list = c97624Zx.A07.A02.A0C;
            list.getClass();
            LinearLayout linearLayout = c97624Zx.A02;
            linearLayout.getClass();
            LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < c97624Zx.A02.getChildCount(); i2++) {
                arrayList.add(c97624Zx.A02.getChildAt(i2));
            }
            c97624Zx.A02.removeAllViews();
            ArrayList arrayList2 = c97624Zx.A08;
            arrayList2.clear();
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (!arrayList.isEmpty()) {
                    inflate = (View) arrayList.remove(0);
                } else {
                    inflate = from.inflate(R.layout.quiz_sticker_response_composer_answer_row, (ViewGroup) c97624Zx.A02, false);
                }
                inflate.getClass();
                arrayList2.add(new C41624IbE(inflate, (InterfaceC43540JLa) list.get(i3), c97624Zx.A06, iArr, i3));
                c97624Zx.A02.addView(inflate);
            }
            if (c97624Zx.A00 != -1) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    C41624IbE c41624IbE = (C41624IbE) arrayList2.get(i4);
                    boolean z3 = false;
                    if (i4 == c97624Zx.A00) {
                        z3 = true;
                    }
                    boolean z4 = false;
                    if (i4 == c97624Zx.A07.A00()) {
                        z4 = true;
                    }
                    c41624IbE.A01(z3, z4);
                    if (i4 == c97624Zx.A07.A00()) {
                        Drawable drawable = c41624IbE.A03;
                        int i5 = c41624IbE.A02;
                        C41624IbE.A00(drawable, i5);
                        View view2 = c41624IbE.A05;
                        TransitionDrawable transitionDrawable = c41624IbE.A04;
                        view2.setBackground(transitionDrawable);
                        c41624IbE.A06.setBackground(drawable);
                        c41624IbE.A07.setTextColor(i5);
                        transitionDrawable.startTransition(0);
                    }
                }
            }
            final View view3 = interfaceC56392iX.getView();
            ViewParent parent = view3.getParent();
            parent.getClass();
            final ViewGroup viewGroup = (ViewGroup) parent;
            if (z) {
                view3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.ClO
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view4, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                        C97624Zx c97624Zx2 = c97624Zx;
                        UserSession userSession2 = userSession;
                        C84823qW c84823qW = A00;
                        View view5 = view3;
                        ViewGroup viewGroup2 = viewGroup;
                        int width = viewGroup2.getWidth();
                        int height = viewGroup2.getHeight();
                        InterfaceC41201vU interfaceC41201vU2 = c97624Zx2.A04;
                        interfaceC41201vU2.getClass();
                        C138436Oz.A04(view5, c84823qW, interfaceC41201vU2.Ack(userSession2), width, height, false);
                    }
                });
                return;
            } else {
                AbstractC13880nE.A0r(view3, new Runnable() { // from class: X.D2S
                    @Override // java.lang.Runnable
                    public final void run() {
                        C97624Zx c97624Zx2 = c97624Zx;
                        UserSession userSession2 = userSession;
                        C84823qW c84823qW = A00;
                        View view4 = view3;
                        ViewGroup viewGroup2 = viewGroup;
                        int width = viewGroup2.getWidth();
                        int height = viewGroup2.getHeight();
                        InterfaceC41201vU interfaceC41201vU2 = c97624Zx2.A04;
                        interfaceC41201vU2.getClass();
                        C138436Oz.A04(view4, c84823qW, interfaceC41201vU2.Ack(userSession2), width, height, false);
                    }
                });
                return;
            }
        }
        c97624Zx.A09.setVisibility(8);
    }
}
