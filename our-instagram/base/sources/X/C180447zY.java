package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C180447zY {
    public final EnumC180417zV A00;
    public final int A01;
    public final Integer A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;

    public void A00(UserSession userSession, C180677zv c180677zv) {
        int i = this.A01;
        Integer num = this.A02;
        boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        c180677zv.A06.setVisibility(8);
        IgSimpleImageView igSimpleImageView = c180677zv.A07;
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setImageResource(i);
        IgTextView igTextView = c180677zv.A08;
        if (num == null) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
            igTextView.setText(num.intValue());
            igTextView.setVisibility(0);
        }
        AbstractC180687zw.A00(c180677zv, interfaceC16820sZ, booleanValue);
    }

    public C180447zY(EnumC180417zV enumC180417zV, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        this.A01 = i;
        this.A02 = num;
        this.A00 = enumC180417zV;
        this.A04 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
    }
}
