package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.7RE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RE implements C7QC {
    public final C7ZX A00;
    public final InterfaceC11380iw A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        return new C7S6(new C57012jc((ViewStub) layoutInflater.inflate(R.layout.message_comments_pill_stub, viewGroup, false)), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7S6 c7s6 = (C7S6) c7qd;
        C7BQ c7bq = (C7BQ) interfaceC129555tK;
        C14360o3.A0B(c7s6, 0);
        C14360o3.A0B(c7bq, 1);
        c7s6.A00(c7bq);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7S6 c7s6 = (C7S6) c7qd;
        if (c7s6 != null) {
            c7s6.A06.A02();
            c7s6.A05 = null;
        }
    }

    public C7RE(InterfaceC11380iw interfaceC11380iw, C7ZX c7zx) {
        this.A00 = c7zx;
        this.A01 = interfaceC11380iw;
    }
}
