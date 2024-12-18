package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.7RC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RC implements C7QC {
    public final InterfaceC165337aM A00;
    public final InterfaceC11380iw A01;

    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADy(C7DA c7da, C7S0 c7s0) {
        C14360o3.A0B(c7s0, 0);
        if (c7da != null) {
            c7s0.A03(this.A01, c7da);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        return new C7S0(new C57012jc((ViewStub) layoutInflater.inflate(R.layout.message_reactions_pill_stub, viewGroup, false)), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7S1 c7s1 = (C7S1) c7qd;
        if (c7s1 != null) {
            c7s1.A02();
        }
    }

    public C7RC(InterfaceC11380iw interfaceC11380iw, InterfaceC165337aM interfaceC165337aM) {
        this.A00 = interfaceC165337aM;
        this.A01 = interfaceC11380iw;
    }
}
