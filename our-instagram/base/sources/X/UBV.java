package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UBV extends FrameLayout {
    public static final /* synthetic */ C0YR[] A02 = {new AnonymousClass013(UBV.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Lcom/facebookpay/widget/style/Icon;", 0)};
    public ImageView A00;
    public final InterfaceC16530ry A01;

    public UBV(Context context) {
        super(context, null, 0);
        this.A01 = new X6J(this, 55);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_right_add_on_icon, (ViewGroup) this, false));
        setFocusable(false);
        setImportantForAccessibility(2);
        this.A00 = (ImageView) findViewById(R.id.list_cell_right_add_on_icon);
    }

    public final VET getIcon() {
        return (VET) this.A01.CES(this, A02[0]);
    }

    public final void setIcon(VET vet) {
        AbstractC31171DnF.A1S(this, vet, this.A01, A02, 0);
    }
}
