package X;

import android.content.Context;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WP4 implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public WP4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        VB3 vb3;
        EnumC166067ba enumC166067ba;
        C68964Vf2 c68964Vf2;
        Integer num;
        C70085W2h c70085W2h;
        switch (this.A00) {
            case 0:
                vb3 = (VB3) this.A01;
                if (i == 1) {
                    enumC166067ba = EnumC166067ba.A05;
                } else {
                    enumC166067ba = EnumC166067ba.A04;
                }
                vb3.A01 = enumC166067ba;
                break;
            case 1:
                vb3 = (VB3) this.A01;
                if (i != 0) {
                    if (i != 1) {
                        num = C05F.A0u;
                    } else {
                        num = C05F.A01;
                    }
                } else {
                    num = C05F.A00;
                }
                if (num == C05F.A0u) {
                    num = C05F.A00;
                }
                vb3.A02 = num;
                break;
            default:
                C68095VAp c68095VAp = (C68095VAp) this.A01;
                String valueOf = String.valueOf(i);
                Iterator it = c68095VAp.A00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c70085W2h = (C70085W2h) it.next();
                        if (C14360o3.A0K(c70085W2h.A00, valueOf)) {
                        }
                    } else {
                        Context context = c68095VAp.getContext();
                        C14360o3.A0A(context);
                        if (AbstractC72723Nt.A00(context)) {
                            c70085W2h = C70085W2h.A04;
                        } else {
                            c70085W2h = C70085W2h.A06;
                        }
                    }
                }
                int i2 = c70085W2h.A02;
                FragmentActivity requireActivity = c68095VAp.requireActivity();
                C14360o3.A0C(requireActivity, AbstractC58317Pt9.A00(7));
                ((IgFragmentActivity) requireActivity).setDefaultNightMode(i2);
                long j = -1;
                if (i2 != -1) {
                    if (i2 != 1) {
                        j = 2;
                    } else {
                        j = 1;
                    }
                }
                C18920wW A01 = AbstractC12220kQ.A01(null, (AbstractC12990ll) c68095VAp.A01.getValue());
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "dark_mode_in_app_toggled");
                if (A00.isSampled()) {
                    A00.A9K("in_app_dark_mode_setting", Long.valueOf(j));
                    A00.Cht();
                    return;
                }
                return;
        }
        if (AbstractC31178DnM.A1a(vb3.A03) || (c68964Vf2 = vb3.A00) == null) {
            return;
        }
        EnumC166067ba enumC166067ba2 = vb3.A01;
        Integer num2 = vb3.A02;
        AbstractC167017dG.A1N(enumC166067ba2, num2);
        c68964Vf2.A01.A0T(enumC166067ba2, num2);
        c68964Vf2.A00.onBackPressed();
    }
}
