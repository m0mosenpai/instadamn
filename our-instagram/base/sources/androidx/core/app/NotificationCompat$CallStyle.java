package androidx.core.app;

import X.AbstractC58497PwQ;
import X.AbstractC72869Xpo;
import X.AbstractC72875Xq9;
import X.XNA;
import X.Y0K;
import X.Y3h;
import X.Y3n;
import X.Y6w;
import X.YM2;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes12.dex */
public final class NotificationCompat$CallStyle extends AbstractC72869Xpo {
    public int A00;
    public PendingIntent A01;
    public PendingIntent A02;
    public PendingIntent A03;
    public Y3n A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public IconCompat A08;
    public CharSequence A09;

    public static Y0K A00(PendingIntent pendingIntent, NotificationCompat$CallStyle notificationCompat$CallStyle, Integer num, int i, int i2, int i3) {
        if (num == null) {
            num = Integer.valueOf(((AbstractC72869Xpo) notificationCompat$CallStyle).A00.A0E.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((AbstractC72869Xpo) notificationCompat$CallStyle).A00.A0E.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Y0K A01 = new Y3h(pendingIntent, IconCompat.A00(((AbstractC72869Xpo) notificationCompat$CallStyle).A00.A0E, i), spannableStringBuilder).A01();
        A01.A08.putBoolean("key_action_priority", true);
        return A01;
    }

    @Override // X.AbstractC72869Xpo
    public final void A05(YM2 ym2) {
        Resources resources;
        int i;
        CharSequence string;
        Notification.CallStyle A01;
        CharSequence charSequence = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = this.A00;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        Log.isLoggable("NotifCompat", 3);
                        return;
                    }
                    A01 = Y6w.A02(AbstractC72875Xq9.A00(this.A04), this.A03, this.A01);
                } else {
                    A01 = Y6w.A00(AbstractC72875Xq9.A00(this.A04), this.A03);
                }
            } else {
                A01 = Y6w.A01(AbstractC72875Xq9.A00(this.A04), this.A02, this.A01);
            }
            if (A01 == null) {
                return;
            }
            A01.setBuilder(((XNA) ym2).A04);
            Integer num = this.A05;
            if (num != null) {
                Y6w.A03(A01, num.intValue());
            }
            Integer num2 = this.A06;
            if (num2 != null) {
                Y6w.A04(A01, num2.intValue());
            }
            Y6w.A06(A01, this.A09);
            IconCompat iconCompat = this.A08;
            if (iconCompat != null) {
                Y6w.A05(A01, AbstractC58497PwQ.A00(super.A00.A0E, iconCompat));
            }
            Y6w.A07(A01, this.A07);
            return;
        }
        Notification.Builder builder = ((XNA) ym2).A04;
        Y3n y3n = this.A04;
        if (y3n != null) {
            charSequence = y3n.A01;
        }
        builder.setContentTitle(charSequence);
        Bundle bundle = super.A00.A0F;
        if (bundle == null || !bundle.containsKey("android.text") || (string = super.A00.A0F.getCharSequence("android.text")) == null) {
            int i3 = this.A00;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        string = null;
                    } else {
                        resources = super.A00.A0E.getResources();
                        i = 2131954501;
                    }
                } else {
                    resources = super.A00.A0E.getResources();
                    i = 2131954500;
                }
            } else {
                resources = super.A00.A0E.getResources();
                i = 2131954499;
            }
            string = resources.getString(i);
        }
        builder.setContentText(string);
        Y3n y3n2 = this.A04;
        if (y3n2 != null) {
            IconCompat iconCompat2 = y3n2.A00;
            if (iconCompat2 != null) {
                builder.setLargeIcon(AbstractC58497PwQ.A00(super.A00.A0E, iconCompat2));
            }
            builder.addPerson(AbstractC72875Xq9.A00(this.A04));
        }
        builder.setCategory("call");
    }

    @Override // X.AbstractC72869Xpo
    public final void A03(Bundle bundle) {
        super.A03(bundle);
        bundle.putInt("android.callType", this.A00);
        bundle.putBoolean("android.callIsVideo", this.A07);
        Y3n y3n = this.A04;
        if (y3n != null) {
            bundle.putParcelable("android.callPerson", AbstractC72875Xq9.A00(y3n));
        }
        IconCompat iconCompat = this.A08;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", AbstractC58497PwQ.A00(super.A00.A0E, iconCompat));
        }
        bundle.putCharSequence("android.verificationText", this.A09);
        bundle.putParcelable("android.answerIntent", this.A01);
        bundle.putParcelable("android.declineIntent", this.A02);
        bundle.putParcelable("android.hangUpIntent", this.A03);
        Integer num = this.A05;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.A06;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // X.AbstractC72869Xpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A04(r4)
            java.lang.String r0 = "android.callType"
            int r0 = r4.getInt(r0)
            r3.A00 = r0
            java.lang.String r0 = "android.callIsVideo"
            boolean r0 = r4.getBoolean(r0)
            r3.A07 = r0
            java.lang.String r1 = "android.callPerson"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L98
            android.os.Parcelable r0 = r4.getParcelable(r1)
            android.app.Person r0 = (android.app.Person) r0
            X.Y3n r0 = X.AbstractC72875Xq9.A01(r0)
        L25:
            r3.A04 = r0
        L27:
            java.lang.String r1 = "android.verificationIcon"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L87
            android.os.Parcelable r0 = r4.getParcelable(r1)
            androidx.core.graphics.drawable.IconCompat r0 = X.AbstractC58497PwQ.A01(r0)
        L37:
            r3.A08 = r0
        L39:
            java.lang.String r0 = "android.verificationText"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.A09 = r0
            java.lang.String r0 = "android.answerIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A01 = r0
            java.lang.String r0 = "android.declineIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A02 = r0
            java.lang.String r0 = "android.hangUpIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A03 = r0
            java.lang.String r1 = "android.answerColor"
            boolean r0 = r4.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L85
            int r0 = r4.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L70:
            r3.A05 = r0
            java.lang.String r1 = "android.declineColor"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L82
            int r0 = r4.getInt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L82:
            r3.A06 = r2
            return
        L85:
            r0 = r2
            goto L70
        L87:
            java.lang.String r1 = "android.verificationIconCompat"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L39
            android.os.Bundle r0 = r4.getBundle(r1)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r0)
            goto L37
        L98:
            java.lang.String r1 = "android.callPersonCompat"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L27
            android.os.Bundle r0 = r4.getBundle(r1)
            X.Y3n r0 = X.Y3n.A00(r0)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$CallStyle.A04(android.os.Bundle):void");
    }
}
