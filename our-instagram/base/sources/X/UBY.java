package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UBY extends FrameLayout {
    public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass013(UBY.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Lcom/facebookpay/widget/style/Icon;", 0), new AnonymousClass013(UBY.class, "imageThumbnailUrl", "getImageThumbnailUrl()Ljava/lang/String;", 0)};
    public ImageView A00;
    public ImageView A01;
    public final int A02;
    public final InterfaceC16530ry A03;
    public final InterfaceC16530ry A04;

    public UBY(Context context) {
        super(context, null, 0);
        this.A02 = 5;
        this.A03 = new X6J(this, 50);
        this.A04 = new X6I(3, context, this);
        AbstractC43593JPy.A1B(this, -2);
        LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_icon, (ViewGroup) this, true);
        this.A00 = (ImageView) findViewById(R.id.list_cell_left_add_on_icon);
        this.A01 = (ImageView) findViewById(R.id.list_cell_left_add_on_icon_outline);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C2FP.A0A().A01(this.A02), AbstractC55922hc.A0e);
        AbstractC70177WFc.A00(obtainStyledAttributes, this, 18, R.style.FBPayUIListCellElement_AddOnContainer);
        obtainStyledAttributes.recycle();
    }

    public final int getFbpayWidgetStyleType() {
        return this.A02;
    }

    public final VET getIcon() {
        return (VET) this.A03.CES(this, A05[0]);
    }

    public final String getImageThumbnailUrl() {
        return MSX.A0j(this, this.A04, A05, 1);
    }

    public final void setIcon(VET vet) {
        AbstractC31171DnF.A1S(this, vet, this.A03, A05, 0);
    }

    public final void setImageThumbnailUrl(String str) {
        AbstractC31171DnF.A1S(this, str, this.A04, A05, 1);
    }

    public final void setImageViewBackground(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A01;
            String str = "imageViewOutline";
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                Rect rect = new Rect();
                if (drawable.getPadding(rect)) {
                    ImageView imageView2 = this.A00;
                    if (imageView2 == null) {
                        str = "imageView";
                    } else {
                        imageView2.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
                imageView.setVisibility(0);
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void setImageViewStyle(int i) {
        String str;
        ImageView imageView = this.A00;
        if (imageView == null) {
            str = "imageView";
        } else {
            AbstractC70177WFc.A05(imageView, i, false);
            ImageView imageView2 = this.A01;
            if (imageView2 == null) {
                str = "imageViewOutline";
            } else {
                AbstractC70177WFc.A05(imageView2, i, false);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
