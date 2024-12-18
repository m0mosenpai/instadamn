package X;

import android.view.View;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Oit, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55383Oit implements View.OnClickListener {
    public final /* synthetic */ UpcomingEvent A00;
    public final /* synthetic */ OCU A01;

    public ViewOnClickListenerC55383Oit(UpcomingEvent upcomingEvent, OCU ocu) {
        this.A01 = ocu;
        this.A00 = upcomingEvent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-155420106);
        OCU ocu = this.A01;
        UpcomingEvent upcomingEvent = this.A00;
        C69963Cf A00 = AbstractC69933Cc.A00(ocu.A00.requireContext(), ocu.A01, (InterfaceC69913Ca) ocu.A03.getValue());
        EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
        C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
        c43846JaA.A07 = true;
        c43846JaA.A0A = false;
        C69963Cf.A03(null, EnumC33447EqK.A0F, A00, new MediaCaptureConfig(c43846JaA), enumC69983Ch, upcomingEvent, null, null, -1, 10001, true, false);
        C0f9.A0C(1398752621, A05);
    }
}
