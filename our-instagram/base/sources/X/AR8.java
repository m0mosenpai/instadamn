package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes4.dex */
public final class AR8 implements View.OnClickListener {
    public final /* synthetic */ N7B A00;

    public AR8(N7B n7b) {
        this.A00 = n7b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1537242073);
        N7B n7b = this.A00;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("camera_entry_point", C22P.A4o);
        A0b.putBoolean(AbstractC111324zv.A00(2025), true);
        C6XJ A02 = C6XJ.A02(n7b.requireActivity(), A0b, AbstractC166987dD.A0o(n7b.A01), TransparentModalActivity.class, "attribution_quick_camera_fragment");
        A02.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
        A02.A0C(n7b.requireActivity());
        C0f9.A0C(-1789833250, A05);
    }
}
