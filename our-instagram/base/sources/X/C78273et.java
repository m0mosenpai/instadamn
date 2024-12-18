package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.facebook.common.dextricks.Constants;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* renamed from: X.3et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78273et implements InterfaceC77833eB {
    public static final C78273et A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0281, code lost:
    
        if (r9 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r1 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r1 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0281  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, android.view.View$OnTouchListener, X.2Xo] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23, types: [X.2YG, android.view.View$OnFocusChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.view.View$OnLongClickListener, java.lang.Object, X.2X2] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    @Override // X.InterfaceC77833eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object ADU(android.content.Context r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78273et.ADU(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (X.C78923fy.A07.A00((X.C78923fy) r2, (X.C78923fy) r1, r7, r8) != false) goto L14;
     */
    @Override // X.InterfaceC77833eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean Ek2(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.3es r5 = (X.C78263es) r5
            X.3es r6 = (X.C78263es) r6
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            boolean r0 = r6.A03
            r3 = 1
            if (r0 != 0) goto L2b
            X.2WC r2 = r5.A01
            X.2WC r1 = r6.A01
            if (r2 == r1) goto L36
            boolean r0 = r2 instanceof X.C78923fy
            if (r0 == 0) goto L2b
            boolean r0 = r1 instanceof X.C78923fy
            if (r0 == 0) goto L2b
            X.3g0 r0 = X.C78923fy.A07
            X.3fy r2 = (X.C78923fy) r2
            X.3fy r1 = (X.C78923fy) r1
            boolean r0 = r0.A00(r2, r1, r7, r8)
            if (r0 != 0) goto L35
        L2b:
            X.2X5 r1 = r5.A00
            X.2X5 r0 = r6.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L36
        L35:
            return r3
        L36:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78273et.Ek2(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        View view = (View) obj;
        C78263es c78263es = (C78263es) obj2;
        Number number = (Number) obj4;
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c78263es, 2);
        if (number != null) {
            C78253er c78253er = C2X5.A0f;
            C2X5 c2x5 = c78263es.A00;
            int intValue = number.intValue();
            boolean z = c2x5.A0c;
            boolean z2 = view instanceof ComponentHost;
            if (z2) {
                ((ComponentHost) view).A0J = true;
            }
            if (c2x5.A0P != null) {
                if ((intValue & 768) == 0) {
                    i = 0;
                } else {
                    i = 8;
                    if ((intValue & 256) == 256) {
                        i = 4;
                    }
                }
                view.setVisibility(i);
            }
            if (c2x5.A0K != null) {
                view.setOnClickListener(null);
                view.setClickable(false);
            }
            if (c2x5.A0N != null) {
                c78253er.A02(view);
            }
            if (c2x5.A0L != null) {
                c78253er.A01(view);
            }
            if (c2x5.A0O != null) {
                c78253er.A03(view);
            }
            if (c2x5.A0M != null && z2) {
                ((ComponentHost) view).A0A = null;
            }
            if ((c2x5.A07 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
                view.setId(-1);
            }
            if ((c2x5.A07 & Constants.LOAD_RESULT_PGO) != 0) {
                view.setTag(null);
            }
            SparseArray sparseArray = c2x5.A0I;
            if (z2) {
                ((ComponentHost) view).A02 = null;
            } else if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    view.setTag(sparseArray.keyAt(i2), null);
                }
            }
            if ((c2x5.A0E != null || c2x5.A0C != 0) && view.getStateListAnimator() != null) {
                view.getStateListAnimator().jumpToCurrentState();
                view.setStateListAnimator(null);
            }
            if (c2x5.A05 != 0.0f) {
                view.setElevation(0.0f);
            }
            if (c2x5.A06 != -16777216) {
                view.setOutlineAmbientShadowColor(-16777216);
            }
            if (c2x5.A0B != -16777216) {
                view.setOutlineSpotShadowColor(-16777216);
            }
            if (c2x5.A0J != null) {
                view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            if (c2x5.A0X) {
                view.setClipToOutline(false);
            }
            if (!c2x5.A0W && (view instanceof ViewGroup)) {
                ((ViewGroup) view).setClipChildren(true);
            }
            CharSequence charSequence = c2x5.A0Q;
            if (charSequence != null && charSequence.length() != 0) {
                view.setContentDescription(null);
            }
            String str = c2x5.A0T;
            if (str != null && str.length() != 0) {
                view.setTooltipText(null);
            }
            if ((c2x5.A07 & 2) != 0) {
                if (view.getScaleX() != 1.0f) {
                    view.setScaleX(1.0f);
                }
                if (view.getScaleY() != 1.0f) {
                    view.setScaleY(1.0f);
                }
            }
            if ((c2x5.A07 & 4) != 0 && view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
            }
            if ((c2x5.A07 & 8) != 0 && view.getRotation() != 0.0f) {
                view.setRotation(0.0f);
            }
            if ((c2x5.A07 & 16) != 0 && view.getRotationX() != 0.0f) {
                view.setRotationX(0.0f);
            }
            if ((c2x5.A07 & 32) != 0 && view.getRotationY() != 0.0f) {
                view.setRotationY(0.0f);
            }
            boolean z3 = true;
            if ((intValue & 1) != 1) {
                z3 = false;
            }
            view.setClickable(z3);
            boolean z4 = false;
            if ((intValue & 2) == 2) {
                z4 = true;
            }
            view.setLongClickable(z4);
            boolean z5 = false;
            if ((intValue & 4) == 4) {
                z5 = true;
            }
            view.setFocusable(z5);
            boolean z6 = false;
            if ((intValue & 8) == 8) {
                z6 = true;
            }
            view.setEnabled(z6);
            boolean z7 = false;
            if ((intValue & 16) == 16) {
                z7 = true;
            }
            view.setSelected(z7);
            boolean z8 = false;
            if ((intValue & 128) == 128) {
                z8 = true;
            }
            view.setKeyboardNavigationCluster(z8);
            if (c2x5.A08 != 0) {
                view.setImportantForAccessibility(0);
            }
            C78253er.A00(view);
            if (c2x5.A0Y) {
                if (c2x5.A0G != null) {
                    view.setBackground(null);
                }
                if (c2x5.A0H != null) {
                    view.setForeground(null);
                }
            }
            if (!z) {
                if (c2x5.A0G != null) {
                    view.setBackground(null);
                }
                if (c2x5.A0H != null) {
                    view.setForeground(null);
                }
                view.setLayoutDirection(2);
            }
            if ((intValue & 32) != 0) {
                int i3 = 1;
                if ((intValue & 64) == 64) {
                    i3 = 2;
                }
                view.setLayerType(i3, null);
            }
            if (z2) {
                ((ComponentHost) view).A0J = false;
            }
            List list = c2x5.A0V;
            if (list != null && !list.isEmpty()) {
                AbstractC010103p.A0H(view, C16930sl.A00);
                return;
            }
            return;
        }
        throw new IllegalStateException("Bind data should not be null");
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }
}
