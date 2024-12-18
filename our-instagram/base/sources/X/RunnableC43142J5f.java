package X;

import android.app.Activity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.J5f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43142J5f implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ IgTextView A02;
    public final /* synthetic */ String A03;

    public RunnableC43142J5f(Activity activity, PromoteData promoteData, IgTextView igTextView, String str) {
        this.A00 = activity;
        this.A03 = str;
        this.A02 = igTextView;
        this.A01 = promoteData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU c5su = new C5SU(this.A00, new C149686oL(this.A03));
        c5su.A02();
        c5su.A00 = 5000;
        c5su.A03(this.A02);
        c5su.A0A = true;
        c5su.A04 = new C39149HLd(0);
        c5su.A00().A07(this.A01.A0y);
    }
}
