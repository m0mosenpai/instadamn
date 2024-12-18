package X;

import android.content.Context;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQ7 extends C2US {
    public InterfaceC111194zh A00;
    public List A01;
    public final ER3 A02;
    public final SupportProfileDisplayOptionsFragment A03;

    public EQ7(Context context, SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment) {
        super(false);
        this.A03 = supportProfileDisplayOptionsFragment;
        ER3 er3 = new ER3(context, this);
        this.A02 = er3;
        this.A01 = AbstractC166987dD.A1E();
        AbstractC31173DnH.A1R(this, er3);
    }

    public final void A01(InterfaceC111194zh interfaceC111194zh) {
        boolean z;
        SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment = this.A03;
        EQ7 eq7 = supportProfileDisplayOptionsFragment.A02;
        eq7.A00 = interfaceC111194zh;
        A00(eq7);
        ActionButton actionButton = supportProfileDisplayOptionsFragment.A00;
        if (supportProfileDisplayOptionsFragment.A01 == null || (interfaceC111194zh.Amd() != null && !interfaceC111194zh.Amd().equals(supportProfileDisplayOptionsFragment.A01.Amd()))) {
            z = true;
        } else {
            z = false;
        }
        actionButton.setEnabled(z);
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public static final void A00(EQ7 eq7) {
        boolean z;
        eq7.clear();
        for (C32189ECk c32189ECk : eq7.A01) {
            InterfaceC111194zh interfaceC111194zh = eq7.A00;
            if (interfaceC111194zh != null) {
                boolean A0K = C14360o3.A0K(c32189ECk.A01, interfaceC111194zh.Amd());
                z = true;
                if (A0K) {
                    eq7.addModel(c32189ECk, Boolean.valueOf(z), eq7.A02);
                }
            }
            z = false;
            eq7.addModel(c32189ECk, Boolean.valueOf(z), eq7.A02);
        }
        eq7.notifyDataSetChanged();
    }
}
