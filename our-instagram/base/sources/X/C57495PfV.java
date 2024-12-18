package X;

import android.app.Notification;
import android.content.Context;
import com.facebook.R;

/* renamed from: X.PfV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57495PfV extends C0YY implements InterfaceC16820sZ {
    public static final C57495PfV A00 = new C57495PfV();

    public C57495PfV() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        XN9 xn9 = new XN9(context, "ig_other");
        xn9.A0C("IG FOS Easy Dogfooding");
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification = xn9.A0A;
        notification.when = currentTimeMillis;
        xn9.A0i = true;
        XN9.A02(xn9, 2, true);
        xn9.A04(R.drawable.notification_icon);
        xn9.A0d = true;
        xn9.A0e = true;
        xn9.A05 = 1;
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0D = true;
        xn9.A0C = c04750Mt.A01(context, (int) System.currentTimeMillis(), 268435456);
        MSZ.A0z(OZO.A00("OFF", 1), xn9, "Turn Off", R.drawable.notification_icon);
        MSZ.A0z(OZO.A00("PAID_BALANCE", 2), xn9, "Paid Balance", R.drawable.notification_icon);
        MSZ.A0z(OZO.A00("ZERO_BALANCE", 3), xn9, "Zero Balance", R.drawable.notification_icon);
        notification.deleteIntent = OZO.A00("delete", 4);
        return xn9;
    }
}
