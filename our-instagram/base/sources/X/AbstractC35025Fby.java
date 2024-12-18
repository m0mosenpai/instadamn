package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.Fby, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35025Fby {
    public Activity A00;
    public Context A01;
    public SparseArray A02;
    public Window A03;
    public Fragment A04;
    public String A05;
    public List A06;
    public final AbstractC12990ll A07;

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c1, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0186, code lost:
    
        if (r10.equals("Facebook") != false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map A02() {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35025Fby.A02():java.util.Map");
    }

    public AbstractC35025Fby(Fragment fragment, AbstractC12990ll abstractC12990ll) {
        Window window;
        this.A07 = abstractC12990ll;
        this.A04 = fragment;
        this.A01 = fragment.getContext();
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        this.A03 = window;
        this.A05 = "ig_default";
        this.A00 = null;
    }

    public void A03() {
        AbstractC34209F7h.A00().A01(this.A03);
    }

    public AbstractC35025Fby(Activity activity, AbstractC12990ll abstractC12990ll) {
        this.A07 = abstractC12990ll;
        this.A03 = activity.getWindow();
        this.A05 = "ig_default";
        this.A00 = activity;
        this.A01 = activity.getApplicationContext();
        this.A04 = null;
    }
}
