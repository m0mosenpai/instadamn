package X;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.AQi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23199AQi implements View.OnClickListener {
    public final /* synthetic */ C187318Ry A00;

    public ViewOnClickListenerC23199AQi(C187318Ry c187318Ry) {
        this.A00 = c187318Ry;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1177967312);
        C187318Ry c187318Ry = this.A00;
        SwitchCompat switchCompat = c187318Ry.A05;
        if (switchCompat == null) {
            C14360o3.A0F("typeSelectorSwitch");
            throw C00O.createAndThrow();
        }
        switchCompat.performHapticFeedback(1);
        C22C A01 = AnonymousClass229.A01(c187318Ry.A0O);
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0C;
        C448124l c448124l = A01.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("CAROUSEL_CLIPS_TOGGLE_SWITCH");
            C448124l.A00(A08, c448124l);
            AbstractC167007dF.A14(A08, c448124l.A04);
            A08.A0M(enumC50631MWs, "surface");
            A08.A0a(c448124l.A0J());
            AbstractC167007dF.A13(A08);
            AbstractC167017dG.A1D(A08);
        }
        C0f9.A0C(1517821539, A05);
    }
}
