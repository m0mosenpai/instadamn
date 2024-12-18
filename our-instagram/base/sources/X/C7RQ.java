package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.facebook.R;

/* renamed from: X.7RQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RQ implements C7QC {
    public final InterfaceC165497ac A00;

    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADy(C7SK c7sk, C7BZ c7bz) {
        C14360o3.A0B(c7sk, 0);
        if (c7bz != null) {
            C57012jc c57012jc = c7sk.A00;
            c57012jc.A03(c7bz.A00);
            CompoundButton compoundButton = (CompoundButton) c57012jc.A01();
            boolean z = c7bz.A02;
            compoundButton.setChecked(z);
            c57012jc.A01().setSelected(z);
            C0fQ.A00(new ViewOnClickListenerC43685JTu(this, c7bz), c7sk.BKF());
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.bulk_selector_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7SK(new C57012jc((ViewStub) inflate));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SK c7sk = (C7SK) c7qd;
        if (c7sk != null) {
            c7sk.A00.A02();
        }
    }

    public C7RQ(InterfaceC165497ac interfaceC165497ac) {
        this.A00 = interfaceC165497ac;
    }
}
