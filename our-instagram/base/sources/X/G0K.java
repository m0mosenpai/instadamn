package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes6.dex */
public final class G0K implements XCU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession = this.A02;
        AbstractC34836FWt.A00(this.A00, this.A01, userSession, this.A03, (File) obj, this.A05, this.A04);
    }

    public G0K(Activity activity, Fragment fragment, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = c38321qM;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        Activity activity = this.A00;
        AbstractC63248Sg4.A01(this.A01.mFragmentManager);
        C9GR.A0B(activity, "openStoryCreationFlow_something_went_wrong");
    }
}
