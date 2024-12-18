package X;

import android.content.DialogInterface;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Off, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55266Off implements DialogInterface.OnClickListener {
    public final /* synthetic */ C148566mR A00;

    public DialogInterfaceOnClickListenerC55266Off(C148566mR c148566mR) {
        this.A00 = c148566mR;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C148566mR c148566mR = this.A00;
        c148566mR.A00 = true;
        C55122Obj A01 = AbstractC55178Odj.A01(c148566mR.A03);
        A01.A02.getClass();
        if (A01.A04) {
            Reel reel = A01.A02;
            List list = A01.A06;
            reel.A0X(list);
            A01.A02.A03 = AbstractC25225BEi.A0x(list, AbstractC25226BEj.A05(list)).A1B();
            Reel reel2 = A01.A02;
            String str = A01.A03;
            str.getClass();
            reel2.A0r = str;
            Reel reel3 = A01.A02;
            C54662OCo c54662OCo = A01.A01;
            c54662OCo.getClass();
            reel3.A0L = C55122Obj.A00(c54662OCo);
            Reel reel4 = A01.A02;
            C54662OCo c54662OCo2 = A01.A01;
            c54662OCo2.getClass();
            reel4.A0L = C55122Obj.A00(c54662OCo2);
            A01.A02 = null;
            A01.A04 = false;
        }
        c148566mR.A04.CqT();
    }
}
