package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115795Ls extends IgImageView {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115795Ls(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A05 = "file://unknown";
        this.A02 = -1;
        this.A03 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        setId(View.generateViewId());
        setVisibility(0);
    }

    public final void A0H(Float[] fArr, int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        this.A00 = fArr[0].floatValue();
        this.A01 = fArr[1].floatValue();
    }

    public final int getNewHeight() {
        return this.A02;
    }

    public final int getNewWidth() {
        return this.A03;
    }

    public final float getPositionX() {
        return this.A00;
    }

    public final float getPositionY() {
        return this.A01;
    }

    public final String getUrl() {
        return this.A05;
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2;
        String str;
        Drawable mutate;
        String str2;
        this.A04 = drawable;
        if (drawable != null) {
            if (drawable instanceof C89533yt) {
                ImageUrl imageUrl = ((C89533yt) drawable).A04;
                if (imageUrl != null) {
                    str2 = imageUrl.getUrl();
                } else {
                    str2 = null;
                }
                str = String.valueOf(str2);
            } else {
                Context context = getContext();
                C14360o3.A07(context);
                Drawable mutate2 = C85963sQ.A00(context).mutate();
                C14360o3.A07(mutate2);
                if (C5M5.A00(drawable, mutate2)) {
                    str = "file://verified_profile";
                } else {
                    Drawable drawable3 = context.getDrawable(R.drawable.play_icon);
                    if (drawable3 != null && (mutate = drawable3.mutate()) != null && C5M5.A00(drawable, mutate)) {
                        str = "file://play_icon";
                    } else {
                        Drawable drawable4 = context.getDrawable(R.drawable.instagram_app_whatsapp_pano_outline_24);
                        if (drawable4 != null) {
                            drawable2 = drawable4.mutate();
                        } else {
                            drawable2 = null;
                        }
                        int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text));
                        if (drawable2 != null) {
                            drawable2.setColorFilter(C3DY.A00(color));
                        }
                        if (C5M5.A00(drawable, drawable2)) {
                            str = "file://whatsapp_icon";
                        } else {
                            str = "file://unknown";
                        }
                    }
                }
            }
            this.A05 = str;
        }
    }
}
