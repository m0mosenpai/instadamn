package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.HEe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38976HEe extends C2US implements InterfaceC65242xM {
    public final HFR A00;
    public final InterfaceC62602sz A01;
    public final C65842yM A02;
    public final ArrayList A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C41186IKz A07;

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38976HEe(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41186IKz c41186IKz, InterfaceC62602sz interfaceC62602sz) {
        super(false);
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        C14360o3.A0B(c41186IKz, 5);
        this.A04 = context;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A01 = interfaceC62602sz;
        this.A07 = c41186IKz;
        this.A03 = AbstractC166987dD.A1E();
        C65842yM c65842yM = new C65842yM(context);
        this.A02 = c65842yM;
        HFR hfr = new HFR(context, interfaceC11380iw, userSession, c41186IKz);
        this.A00 = hfr;
        init(c65842yM, hfr);
    }

    @Override // X.C2UT
    public final void updateListView() {
        notifyDataSetChangedSmart();
    }
}
