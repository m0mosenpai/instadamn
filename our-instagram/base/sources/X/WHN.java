package X;

import android.content.DialogInterface;
import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WHN implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;

    public WHN(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.A00;
        Map map = userDetailFragment.A1F.A08;
        EnumC155546yj enumC155546yj = EnumC155546yj.A0R;
        C155576ym c155576ym = (C155576ym) map.get(enumC155546yj);
        if (c155576ym != null) {
            c155576ym.A00 = 2131962614;
        }
        C155536yi c155536yi = userDetailFragment.A1F;
        View view = userDetailFragment.mView;
        View view2 = userDetailFragment.A11.A01;
        Object obj = c155536yi.A08.get(enumC155546yj);
        if (obj != null) {
            C155536yi.A00(view, view2, (InterfaceC155566yl) obj, c155536yi);
            dialogInterface.dismiss();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
