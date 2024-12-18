package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6oM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC149696oM implements C5ST {
    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ AbstractC117215Sg ANT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        C14360o3.A0B(viewGroup, 1);
        boolean A0G = C14640oc.A0G();
        int i = R.layout.tooltip_text;
        if (A0G) {
            i = R.layout.tooltip_text_prism;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return new C201248v6((TextView) inflate);
    }
}
