package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.6jI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146806jI {
    public final Context A00;
    public final C57112jm A01;
    public final C146306iT A02;
    public final C146316iU A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public C146806jI(Context context, C57112jm c57112jm, C146306iT c146306iT, C146316iU c146316iU) {
        C14360o3.A0B(c57112jm, 2);
        this.A00 = context;
        this.A01 = c57112jm;
        this.A02 = c146306iT;
        this.A03 = c146316iU;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9EO(this, 49));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C9E9(this, 0));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C9E9(this, 1));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C9E9(this, 2));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C9E9(this, 3));
    }

    public final void A00(View view, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac) {
        C14360o3.A0B(c41181vS, 2);
        C57112jm c57112jm = this.A01;
        View findViewById = view.findViewById(R.id.reel_main_container);
        if (findViewById != null) {
            C6Q6 c6q6 = new C6Q6(c41181vS, c141596ac, c41551w4.A01(), true);
            String id = c41551w4.A0H.getId();
            C14360o3.A07(id);
            String A0b = AnonymousClass001.A0b(id, "_segment_", c41551w4.A01());
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(c41551w4, c6q6, A0b);
            c59072n8.A00((AbstractC64162vb) this.A05.getValue());
            c59072n8.A00((AbstractC64412w0) this.A06.getValue());
            if (C18U.A06(C06090Tz.A05, this.A02.A01, 36310439499399275L)) {
                c59072n8.A00((C6Q9) this.A07.getValue());
            }
            c59072n8.A00((AbstractC146716j9) this.A08.getValue());
            c57112jm.A05(findViewById, c59072n8.A01());
            return;
        }
        throw new IllegalStateException("Segment Viewpoint view is not in view hierarchy");
    }
}
