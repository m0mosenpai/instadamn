package X;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: X.2cP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C53412cP {
    public final Object[] A00 = new Object[2];
    public static final Class[] A07 = {Context.class, AttributeSet.class};
    public static final int[] A03 = {R.attr.onClick};
    public static final int[] A01 = {R.attr.accessibilityHeading};
    public static final int[] A02 = {R.attr.accessibilityPaneTitle};
    public static final int[] A04 = {R.attr.screenReaderFocusable};
    public static final String[] A05 = {"android.widget.", "android.view.", "android.webkit."};
    public static final C005001p A06 = new C005001p(0);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0151, code lost:
    
        if (r3 == null) goto L97;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A01(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53412cP.A01(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private View A00(Context context, String str, String str2) {
        String A0R;
        C005001p c005001p = A06;
        Constructor constructor = (Constructor) c005001p.get(str);
        if (constructor == null) {
            if (str2 == null) {
                A0R = str;
            } else {
                try {
                    A0R = AnonymousClass001.A0R(str2, str);
                } catch (Exception unused) {
                    return null;
                }
            }
            constructor = Class.forName(A0R, false, context.getClassLoader()).asSubclass(View.class).getConstructor(A07);
            c005001p.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.A00);
    }

    public UCq A05(Context context, AttributeSet attributeSet) {
        return new UCq(context, attributeSet);
    }

    public C3WF A06(Context context, AttributeSet attributeSet) {
        return new C3WF(context, attributeSet);
    }

    public UB7 A02(Context context, AttributeSet attributeSet) {
        return new UB7(context, attributeSet, com.facebook.R.attr.autoCompleteTextViewStyle);
    }

    public UBF A03(Context context, AttributeSet attributeSet) {
        return new UBF(context, attributeSet, com.facebook.R.attr.buttonStyle);
    }

    public UBJ A04(Context context, AttributeSet attributeSet) {
        return new UBJ(context, attributeSet, com.facebook.R.attr.checkboxStyle);
    }
}
