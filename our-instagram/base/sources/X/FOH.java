package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class FOH {
    public Context A00;
    public User A03;
    public FO5 A04;
    public Integer A05;
    public EnumC193348hE A02 = EnumC193348hE.A06;
    public EnumC193348hE A01 = EnumC193348hE.A05;
    public final DialogInterface.OnClickListener A08 = new DialogInterfaceOnClickListenerC35319Fhu(this, 5);
    public final DialogInterface.OnClickListener A07 = new DialogInterfaceOnClickListenerC35319Fhu(this, 6);
    public final DialogInterface.OnClickListener A06 = new DialogInterfaceOnClickListenerC35319Fhu(this, 7);

    public FOH(Context context, User user, FO5 fo5, Integer num) {
        this.A00 = context;
        this.A03 = user;
        this.A05 = num;
        this.A04 = fo5;
    }
}
