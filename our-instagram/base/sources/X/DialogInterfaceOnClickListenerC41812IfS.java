package X;

import android.content.Context;
import android.content.DialogInterface;
import java.io.IOException;

/* renamed from: X.IfS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41812IfS implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public DialogInterfaceOnClickListenerC41812IfS(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A03 = obj;
        this.A05 = obj4;
        this.A01 = i;
        this.A04 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            HDJ hdj = (HDJ) this.A02;
            Integer num = (Integer) this.A03;
            Integer num2 = (Integer) this.A04;
            Context context = (Context) this.A05;
            int i2 = this.A01;
            try {
                String str = hdj.A0C;
                str.getClass();
                hdj.A09.A00(8);
                JIA jia = hdj.A08;
                java.util.Set set = hdj.A04.A0G;
                jia.CpI(new HGF(hdj, num2, str, hdj.A04.A0G, set.size()), num, "feed_photos_of_you", set);
                return;
            } catch (IOException unused) {
                C9GR.A0F(context, "media_action_io_exception", i2);
                return;
            }
        }
        C31338Dq3 c31338Dq3 = (C31338Dq3) this.A02;
        C31338Dq3.A02((Context) this.A03, (MUD) this.A04, c31338Dq3, (C5HW) this.A05, this.A01);
    }
}
