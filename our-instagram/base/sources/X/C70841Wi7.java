package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import java.util.HashSet;

/* renamed from: X.Wi7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70841Wi7 implements InterfaceC43071ya {
    public final MediaMapFragment A00;
    public final HashSet A01 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        MediaMapPinPreview mediaMapPinPreview = (MediaMapPinPreview) c59062n7.A03;
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            HashSet hashSet = this.A01;
            if (!hashSet.contains(mediaMapPinPreview.A01)) {
                hashSet.add(mediaMapPinPreview.A01);
                MediaMapFragment mediaMapFragment = this.A00;
                int A0H = AbstractC166987dD.A0H(c59062n7.A04);
                WGA wga = mediaMapFragment.A0F;
                InterfaceC02590Ai A09 = AbstractC37302Gc3.A09(wga.A01, wga.A03);
                if (A09.isSampled()) {
                    A09.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, mediaMapPinPreview.A01);
                    AbstractC37300Gc1.A0l(A09, mediaMapPinPreview.A01);
                    AbstractC37301Gc2.A0x(A09, A0H / 3, A0H % 3);
                    AbstractC25234BEr.A11(A09, AbstractC111324zv.A00(205), AbstractC37301Gc2.A0g(A09));
                    A09.Cht();
                }
            }
        }
    }

    public C70841Wi7(MediaMapFragment mediaMapFragment) {
        this.A00 = mediaMapFragment;
    }
}
