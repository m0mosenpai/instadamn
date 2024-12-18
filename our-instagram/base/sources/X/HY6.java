package X;

import android.content.Context;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class HY6 extends HJG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EnumC125775mS A01;
    public final /* synthetic */ C154756xQ A02;
    public final /* synthetic */ List A03;

    @Override // X.HJG, java.lang.Runnable
    public final void run() {
        UserDetailFragment userDetailFragment = this.A02.A00;
        List unmodifiableList = Collections.unmodifiableList(this.A03);
        UserDetailFragment.A0K(this.A00, this.A01, userDetailFragment, unmodifiableList, false, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HY6(Context context, EnumC125775mS enumC125775mS, C154756xQ c154756xQ, List list) {
        super(368025586, 2, false, true);
        this.A02 = c154756xQ;
        this.A03 = list;
        this.A01 = enumC125775mS;
        this.A00 = context;
    }
}
