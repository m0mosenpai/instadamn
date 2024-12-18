package X;

import android.widget.BaseAdapter;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0fA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fA {
    public static void A00(BaseAdapter baseAdapter, int i) {
        ExternalProviders.A07.A07().A00(6, 19, i, 0L, 0);
        baseAdapter.notifyDataSetChanged();
    }

    public static void A01(BaseAdapter baseAdapter, int i) {
        ExternalProviders.A07.A07().A00(6, 19, i, 0L, 0);
        baseAdapter.notifyDataSetInvalidated();
    }
}
