package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage;

/* loaded from: classes5.dex */
public abstract class CYE {
    public static final void A00(Bitmap bitmap, Fragment fragment, UserSession userSession, ImageUrl imageUrl, C183978Ee c183978Ee, String str, boolean z) {
        C183978Ee c183978Ee2 = c183978Ee.A0M;
        if (c183978Ee2 != null) {
            c183978Ee = c183978Ee2;
        }
        ContextualBackgroundSourceImage contextualBackgroundSourceImage = new ContextualBackgroundSourceImage(imageUrl, str, c183978Ee.A06());
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("ORIGINAL_IMAGE_DATA_ARG", contextualBackgroundSourceImage);
        A0b.putBoolean("IS_FOOTER_BELOW_MEDIA_ARG", z);
        C26790BsE c26790BsE = new C26790BsE();
        c26790BsE.setArguments(A0b);
        DH0 dh0 = new DH0(7, fragment, userSession);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DH4(new DH4(fragment, 25), 26));
        ((ContextualBackgroundViewModel) AbstractC25225BEi.A0a(new DH4(A00, 27), dh0, new DH0(6, null, A00), AbstractC25225BEi.A1D(ContextualBackgroundViewModel.class)).getValue()).A06.Egh(bitmap);
        ((C8XO) new C52942bb(fragment).A00(C8XO.class)).A02.A0B(new C8A8(c26790BsE));
    }

    public static final void A01(Fragment fragment, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A2C;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 471)) {
            interfaceC16820sZ.invoke();
            return;
        }
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        AbstractC167007dF.A1L(A002, A002.A2C, c0yrArr, 471, true);
        FragmentActivity requireActivity = fragment.requireActivity();
        DH4 dh4 = new DH4(interfaceC16820sZ, 24);
        Bundle A0b = AbstractC166987dD.A0b();
        C26842Bt4 c26842Bt4 = new C26842Bt4();
        c26842Bt4.setArguments(A0b);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0g = requireActivity.getString(2131956794);
        A0y.A0K = new ViewOnClickListenerC28667ClF(dh4, 39);
        A0y.A1J = true;
        A0y.A0v = true;
        A0y.A00().A02(requireActivity, c26842Bt4);
    }
}
