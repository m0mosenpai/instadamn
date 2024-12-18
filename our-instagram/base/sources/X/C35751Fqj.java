package X;

import android.content.DialogInterface;
import android.widget.RadioGroup;
import java.util.List;

/* renamed from: X.Fqj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35751Fqj implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ EnumC47122Ee A00;
    public final /* synthetic */ FPR A01;
    public final /* synthetic */ C33234ElT A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public C35751Fqj(EnumC47122Ee enumC47122Ee, FPR fpr, C33234ElT c33234ElT, String str, List list, boolean z) {
        this.A02 = c33234ElT;
        this.A04 = list;
        this.A03 = str;
        this.A00 = enumC47122Ee;
        this.A05 = z;
        this.A01 = fpr;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        final String str = ((C35124FeR) this.A04.get(i)).A02;
        final C33234ElT c33234ElT = this.A02;
        if (AbstractC31178DnM.A1X(C06090Tz.A05, c33234ElT.A02, 36314201890753009L)) {
            final String str2 = this.A03;
            if ("video_call".equals(str2) && str.equals("off")) {
                final EnumC47122Ee enumC47122Ee = this.A00;
                final boolean z = this.A05;
                final FPR fpr = this.A01;
                C193328hC A0O = AbstractC31175DnJ.A0O(c33234ElT);
                A0O.A0A(2131960825);
                A0O.A09(2131960824);
                A0O.A0J(new DialogInterface.OnClickListener() { // from class: X.Fii
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C33234ElT c33234ElT2 = c33234ElT;
                        String str3 = str;
                        String str4 = str2;
                        C33234ElT.A02(enumC47122Ee, fpr, c33234ElT2, str3, str4, z);
                    }
                }, 2131960826);
                A0O.A0H(DialogInterfaceOnClickListenerC35454FkB.A00(c33234ElT, 68), 2131960823);
                AbstractC166987dD.A1W(A0O);
                return;
            }
        }
        String str3 = this.A03;
        C33234ElT.A02(this.A00, this.A01, c33234ElT, str, str3, this.A05);
    }
}
