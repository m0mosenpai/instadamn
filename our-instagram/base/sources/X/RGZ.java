package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class RGZ extends C61Q {
    public static final C61U A01;
    public static final C61S A02;
    public static final C61W A03;
    public final String A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.61U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.61S] */
    static {
        ?? obj = new Object();
        A02 = obj;
        ?? obj2 = new Object();
        A01 = obj2;
        A03 = new C61W(obj2, obj, "Auth.Api.Identity.SignIn.API");
    }

    public RGZ(Activity activity, C64218T4s c64218T4s) {
        super(activity, activity, c64218T4s, A03, C61Z.A02);
        this.A00 = AbstractC62842STp.A00();
    }

    public final SignInCredential A00(Intent intent) {
        SafeParcelable A00;
        SafeParcelable A002;
        if (intent != null) {
            Parcelable.Creator creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            if (byteArrayExtra == null) {
                A00 = null;
            } else {
                A00 = SafeParcelableSerializer.A00(creator, byteArrayExtra);
            }
            Status status = (Status) A00;
            if (status != null) {
                if (status.A00 <= 0) {
                    Parcelable.Creator creator2 = SignInCredential.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 == null) {
                        A002 = null;
                    } else {
                        A002 = SafeParcelableSerializer.A00(creator2, byteArrayExtra2);
                    }
                    SignInCredential signInCredential = (SignInCredential) A002;
                    if (signInCredential != null) {
                        return signInCredential;
                    }
                    throw new Rk3(Status.A06);
                }
                throw new Rk3(status);
            }
            throw new Rk3(Status.A04);
        }
        throw new Rk3(Status.A06);
    }

    public RGZ(Context context, C64218T4s c64218T4s) {
        super(context, c64218T4s, A03, C61Z.A02);
        this.A00 = AbstractC62842STp.A00();
    }
}
