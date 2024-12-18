package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10920i8 extends AnonymousClass067 {
    public final Activity A00;
    public final Context A01;
    public final Handler A02;
    public final AbstractC10360h2 A03;

    public abstract LayoutInflater A02();

    public abstract void A03();

    public abstract boolean A04(String str);

    public AbstractC10920i8(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.A00 = fragmentActivity;
        this.A01 = fragmentActivity;
        this.A02 = handler;
        this.A03 = new AbstractC10360h2();
    }
}
