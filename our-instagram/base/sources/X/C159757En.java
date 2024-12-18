package X;

import android.text.Editable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7En, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159757En {
    public final /* synthetic */ C159737El A00;

    public C159757En(C159737El c159737El) {
        this.A00 = c159737El;
    }

    public final void A00(EnumC46202Kce enumC46202Kce, String str) {
        C159737El c159737El = this.A00;
        C159737El.A0m(c159737El, true);
        C7EC c7ec = c159737El.A1e;
        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
        C14360o3.A0B(interfaceC83713oG, 0);
        C14360o3.A0B(enumC46202Kce, 1);
        C18920wW c18920wW = c7ec.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_quoted_reply_canceled");
        if (A00.isSampled()) {
            boolean A07 = AbstractC140946Yw.A07(interfaceC83713oG);
            String A02 = AbstractC92784Dr.A02(interfaceC83713oG);
            Long A01 = AbstractC92784Dr.A01(interfaceC83713oG);
            A00.AAP("action", enumC46202Kce.A00);
            A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A00.A7v("is_e2ee", Boolean.valueOf(A07));
            A00.AAP("open_thread_id", A02);
            A00.A9K("occamadillo_thread_id", A01);
            A00.Cht();
        }
        Editable text = c159737El.A0b.A0S.getText();
        for (A7L a7l : (A7L[]) text.getSpans(0, text.length(), A7L.class)) {
            if (a7l.A00.A00) {
                text.replace(text.getSpanStart(a7l), text.getSpanEnd(a7l), "");
            }
        }
    }
}
