package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC74623Ww {
    void addView(View view, int i);

    void addView(View view, int i, ViewGroup.LayoutParams layoutParams);

    void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams);

    void detachViewFromParent(View view);

    Context getContext();

    int getMeasuredHeight();

    int getMeasuredWidth();
}
