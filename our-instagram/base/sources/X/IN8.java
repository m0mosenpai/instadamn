package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes7.dex */
public final class IN8 {
    public C31349DqE A00;
    public final C3O0 A01;
    public final Hj4 A02;
    public final Context A03;
    public final C41451vu A04;
    public final C38321qM A05;
    public final C146106i8 A06;
    public final UpcomingEvent A07;
    public final Integer A08;

    public IN8(Context context, C38321qM c38321qM, C146106i8 c146106i8, C3O0 c3o0, Hj4 hj4, UpcomingEvent upcomingEvent, Integer num) {
        C14360o3.A0B(c146106i8, 3);
        this.A03 = context;
        this.A01 = c3o0;
        this.A06 = c146106i8;
        this.A07 = upcomingEvent;
        this.A05 = c38321qM;
        this.A02 = hj4;
        this.A08 = num;
        this.A04 = C41451vu.A01;
    }

    public final void A00() {
        C146106i8 c146106i8 = this.A06;
        Integer num = this.A08;
        if (num != null) {
            c146106i8.A02 = num.intValue();
            c146106i8.A0R = true;
        }
        AbstractC25226BEj.A1N(this.A03, c146106i8, 2131963183);
        AbstractC31178DnM.A1N(this.A04, c146106i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.instagram.common.typedurl.ImageUrl] */
    public final void A01(boolean z) {
        EnumC142006bJ enumC142006bJ;
        ImageInfo BGx;
        C146106i8 c146106i8 = this.A06;
        Integer num = this.A08;
        if (num != null) {
            c146106i8.A02 = num.intValue();
            c146106i8.A0R = true;
        }
        ExtendedImageUrl extendedImageUrl = null;
        if (z) {
            C38321qM c38321qM = this.A05;
            if (c38321qM != null) {
                if (!c38321qM.Cff()) {
                    ?? A1S = c38321qM.A1S();
                    if (A1S != 0) {
                        extendedImageUrl = A1S;
                    }
                }
            }
            UpcomingEventMedia BQO = this.A07.BQO();
            if (BQO != null && (BGx = BQO.BGx()) != null) {
                extendedImageUrl = AbstractC40161tk.A02(BGx);
            }
        }
        c146106i8.A09 = extendedImageUrl;
        if (extendedImageUrl == null) {
            enumC142006bJ = EnumC142006bJ.A05;
        } else {
            enumC142006bJ = EnumC142006bJ.A06;
        }
        c146106i8.A0B = enumC142006bJ;
        Hj4 hj4 = this.A02;
        if (hj4 instanceof C39411Hav) {
            c146106i8.A0L = true;
            c146106i8.A0A(new C42690Iul(this, 2));
            c146106i8.A0D(BHX.A00(this.A03, ((C39411Hav) hj4).A00).toString());
        } else if (C14360o3.A0K(hj4, C39412Haw.A00)) {
            c146106i8.A0L = false;
        } else {
            throw B4Z.A00();
        }
        Context context = this.A03;
        int i = 2131972149;
        if (z) {
            i = 2131972150;
        }
        c146106i8.A0D = AbstractC166997dE.A0p(context, i);
        C31349DqE A00 = c146106i8.A00();
        AbstractC166997dE.A1O(this.A04, A00);
        this.A00 = A00;
    }
}
