package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;

/* renamed from: X.Clf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28693Clf implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C28693Clf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        C25820Bbb c25820Bbb;
        Integer num;
        String A00;
        switch (this.A00) {
            case 0:
                if (!z) {
                    return;
                }
                c25820Bbb = (C25820Bbb) ((C26767Bro) this.A01).A03.getValue();
                num = C05F.A00;
                break;
            case 1:
                if (!z) {
                    return;
                }
                c25820Bbb = (C25820Bbb) ((C26767Bro) this.A01).A03.getValue();
                num = C05F.A01;
                break;
            case 2:
                if (!z) {
                    return;
                }
                c25820Bbb = (C25820Bbb) ((C26767Bro) this.A01).A03.getValue();
                num = C05F.A0C;
                break;
            case 3:
                C27277C2c c27277C2c = (C27277C2c) this.A01;
                UserSession userSession = c27277C2c.A00;
                if (z) {
                    C14360o3.A0B(userSession, 0);
                    str = "fundraiser/enable_charity_profile_fundraiser/";
                } else {
                    C14360o3.A0B(userSession, 0);
                    str = "fundraiser/disable_charity_profile_fundraiser/";
                }
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0E = str;
                C1ON A0e = AbstractC25227BEk.A0e(A0c, H97.class, C41267IOi.class);
                A0e.A00 = new C39030HGg(this, 15);
                c27277C2c.A01.schedule(A0e);
                return;
            default:
                ((C50985Mfs) ((N5S) this.A01).A0B.getValue()).A01.A0B(Boolean.valueOf(AbstractC167007dF.A1M(z ? 1 : 0)));
                return;
        }
        C05A c05a = c25820Bbb.A01;
        if (num == ((C51756Mtf) c05a.getValue()).A00) {
            return;
        }
        int intValue = num.intValue();
        UserSession userSession2 = c25820Bbb.A00;
        if (intValue != 0) {
            if (intValue != 1) {
                AbstractC75343a1.A04(userSession2, false);
                AbstractC75343a1.A03(userSession2, false);
                A00 = "never";
            } else {
                AbstractC75343a1.A04(userSession2, false);
                AbstractC75343a1.A03(userSession2, true);
                A00 = "only_translated";
            }
        } else {
            AbstractC75343a1.A04(userSession2, true);
            A00 = AbstractC111324zv.A00(726);
        }
        AbstractC35091Fd2.A01(null, userSession2, "closed_captions_only_bottom_sheet", "video_subtitles_consumption_radio_selection", A00);
        do {
        } while (!c05a.AIi(c05a.getValue(), new C51756Mtf(25, num)));
    }
}
