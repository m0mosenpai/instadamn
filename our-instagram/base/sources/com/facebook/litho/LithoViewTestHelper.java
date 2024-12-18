package com.facebook.litho;

import X.AbstractC001900j;
import X.C14360o3;
import X.C28216CcF;
import X.C2YA;
import android.view.View;
import android.view.ViewParent;
import java.util.Deque;

/* loaded from: classes.dex */
public final class LithoViewTestHelper {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (r13.getVisibility() != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C2YA r15, com.facebook.litho.DebugComponentDescriptionHelper$ExtraDescription r16, java.lang.StringBuilder r17, int r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoViewTestHelper.A00(X.2YA, com.facebook.litho.DebugComponentDescriptionHelper$ExtraDescription, java.lang.StringBuilder, int, int, int, boolean, boolean):void");
    }

    public static final TestItem findTestItem(LithoView lithoView, String str) {
        C14360o3.A0B(lithoView, 0);
        Deque findTestItems = lithoView.findTestItems(str);
        if (findTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) findTestItems.getLast();
    }

    public static final Deque findTestItems(LithoView lithoView, String str) {
        C14360o3.A0B(lithoView, 0);
        C14360o3.A0B(str, 1);
        return lithoView.findTestItems(str);
    }

    public static final String rootInstanceToString(C2YA c2ya, boolean z, int i) {
        int i2 = i;
        if (c2ya == null) {
            return "";
        }
        BaseMountingView A01 = c2ya.A01();
        StringBuilder sb = new StringBuilder();
        if (z && A01 != null) {
            i2 = 3;
            for (ViewParent parent = A01.getParent(); parent != null; parent = parent.getParent()) {
                i2++;
            }
        }
        sb.append("\n");
        A00(c2ya, null, sb, i2, 0, 0, z, false);
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final String viewToString(BaseMountingView baseMountingView) {
        C14360o3.A0B(baseMountingView, 0);
        return AbstractC001900j.A0B(viewToString(baseMountingView, false)).toString();
    }

    public static final String viewToStringForE2E(View view, int i, boolean z, DebugComponentDescriptionHelper$ExtraDescription debugComponentDescriptionHelper$ExtraDescription) {
        C14360o3.A0B(view, 0);
        if (!(view instanceof BaseMountingView)) {
            return "";
        }
        C28216CcF c28216CcF = C2YA.A08;
        BaseMountingView baseMountingView = (BaseMountingView) view;
        C14360o3.A0B(baseMountingView, 0);
        C2YA A01 = c28216CcF.A01(baseMountingView.getCurrentLayoutState());
        if (A01 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        A00(A01, debugComponentDescriptionHelper$ExtraDescription, sb, i, 0, 0, true, z);
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final String viewToString(BaseMountingView baseMountingView, boolean z) {
        C14360o3.A0B(baseMountingView, 0);
        return rootInstanceToString(C2YA.A08.A01(baseMountingView.getCurrentLayoutState()), z, 0);
    }

    public static final String viewToStringForE2E(View view, int i, boolean z) {
        C14360o3.A0B(view, 0);
        return viewToStringForE2E(view, i, z, null);
    }
}
