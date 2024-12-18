package X;

import android.content.Context;
import android.util.TypedValue;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;

/* renamed from: X.FaV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34945FaV {
    public final Context A00;
    public final EnumC222416a A01;
    public final FBO A02;

    public static final C34966Faq A00(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, NAF naf, C34945FaV c34945FaV, String str, int i, boolean z) {
        String str2;
        C34966Faq c34966Faq = new C34966Faq(new ViewOnClickListenerC35671Fp6(str, naf, 16), i);
        c34966Faq.A05 = !z;
        if (directMessageInteropReachabilityOptions != null) {
            str2 = c34945FaV.A00.getString(directMessageInteropReachabilityOptions.A00);
        } else {
            str2 = "";
        }
        c34966Faq.A03 = str2;
        c34966Faq.A00 = TypedValue.applyDimension(1, 5.0f, AbstractC167007dF.A0K(c34945FaV.A00));
        return c34966Faq;
    }

    public C34945FaV(Context context, FBO fbo, EnumC222416a enumC222416a) {
        this.A00 = context;
        this.A01 = enumC222416a;
        this.A02 = fbo;
    }
}
