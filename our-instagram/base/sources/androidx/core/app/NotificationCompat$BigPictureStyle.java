package androidx.core.app;

import X.AbstractC58497PwQ;
import X.AbstractC72869Xpo;
import X.XNA;
import X.Y2S;
import X.YM2;
import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes12.dex */
public final class NotificationCompat$BigPictureStyle extends AbstractC72869Xpo {
    public IconCompat A00;
    public IconCompat A01;
    public boolean A02;
    public boolean A03;

    @Override // X.AbstractC72869Xpo
    public final void A05(YM2 ym2) {
        XNA xna = (XNA) ym2;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(xna.A04).setBigContentTitle(super.A01);
        IconCompat iconCompat = this.A01;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                Y2S.A01(bigContentTitle, AbstractC58497PwQ.A00(xna.A05, iconCompat));
            } else {
                int i = iconCompat.A02;
                if (i == -1) {
                    i = ((Icon) iconCompat.A06).getType();
                }
                if (i == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.A01.A05());
                }
            }
        }
        if (this.A02) {
            IconCompat iconCompat2 = this.A00;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(AbstractC58497PwQ.A00(xna.A05, iconCompat2));
            }
        }
        if (super.A03) {
            bigContentTitle.setSummaryText(super.A02);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            Y2S.A02(bigContentTitle, this.A03);
            Y2S.A00(bigContentTitle);
        }
    }

    @Override // X.AbstractC72869Xpo
    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // X.AbstractC72869Xpo
    public final void A04(Bundle bundle) {
        IconCompat iconCompat;
        IconCompat iconCompat2;
        super.A04(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            Parcelable parcelable = bundle.getParcelable("android.largeIcon.big");
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    iconCompat2 = AbstractC58497PwQ.A01(parcelable);
                } else if (parcelable instanceof Bitmap) {
                    iconCompat2 = IconCompat.A02((Bitmap) parcelable);
                }
                this.A00 = iconCompat2;
                this.A02 = true;
            }
            iconCompat2 = null;
            this.A00 = iconCompat2;
            this.A02 = true;
        }
        Parcelable parcelable2 = bundle.getParcelable("android.picture");
        if (parcelable2 == null) {
            parcelable2 = bundle.getParcelable("android.pictureIcon");
        }
        if (parcelable2 != null) {
            if (parcelable2 instanceof Icon) {
                iconCompat = AbstractC58497PwQ.A01(parcelable2);
            } else if (parcelable2 instanceof Bitmap) {
                iconCompat = IconCompat.A02((Bitmap) parcelable2);
            }
            this.A01 = iconCompat;
            this.A03 = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }
        iconCompat = null;
        this.A01 = iconCompat;
        this.A03 = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
