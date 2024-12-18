package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RD implements C7QC {
    public final UserSession A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        return new C7S3(AbstractC56372iV.A01(layoutInflater.inflate(R.layout.sticker_reaction_pill, viewGroup, false), false, false));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7S3 c7s3 = (C7S3) c7qd;
        C14360o3.A0B(c7s3, 0);
        if (interfaceC129555tK != null) {
            c7s3.A00.getView();
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7S3 c7s3 = (C7S3) c7qd;
        if (c7s3 != null) {
            c7s3.A01.A00 = null;
        }
    }

    public C7RD(UserSession userSession) {
        this.A00 = userSession;
    }
}
