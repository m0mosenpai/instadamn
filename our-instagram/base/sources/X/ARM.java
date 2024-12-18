package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes4.dex */
public final class ARM implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass693 A00;
    public final /* synthetic */ C88R A01;

    public ARM(AnonymousClass693 anonymousClass693, C88R c88r) {
        this.A01 = c88r;
        this.A00 = anonymousClass693;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(204553854);
        AnonymousClass693 anonymousClass693 = this.A00;
        if (anonymousClass693 != null) {
            anonymousClass693.E4S();
        }
        C88E c88e = this.A01.A0A.A00;
        if (c88e.A09()) {
            C88X A01 = c88e.A0H.A01();
            A01.getClass();
            ACt A012 = c88e.A01(A01);
            if (A012 instanceof C218089kg) {
                C218089kg c218089kg = (C218089kg) A012;
                c218089kg.A00 = (c218089kg.A00 + 1) % c218089kg.A04.size();
                c218089kg.A0A();
            } else if (A012 instanceof C218109ki) {
                C218109ki c218109ki = (C218109ki) A012;
                Drawable drawable = c218109ki.A02;
                if (drawable != null) {
                    c218109ki.A0B.A08(drawable);
                }
                int i = c218109ki.A00 + 1;
                List list = c218109ki.A05;
                list.getClass();
                c218109ki.A00 = i % list.size();
                A8Z A00 = C218109ki.A00(c218109ki);
                C88Y c88y = c218109ki.A0B;
                c88y.A0H(A00.A01);
                c88y.A0I("@");
                C218109ki.A01(c218109ki, A00);
            } else if (A012 instanceof C218019kZ) {
                C218019kZ c218019kZ = (C218019kZ) A012;
                int i2 = c218019kZ.A00 + 1;
                C22881A7b c22881A7b = c218019kZ.A01;
                c22881A7b.getClass();
                c218019kZ.A00 = i2 % c22881A7b.A01.size();
                C218019kZ.A00(C5GJ.CREATE_MODE_RANDOM_SELECTION, c218019kZ);
            } else if (A012 instanceof C218029ka) {
                C218029ka c218029ka = (C218029ka) A012;
                c218029ka.A00 = (c218029ka.A00 + 1) % c218029ka.A01.size();
                C218029ka.A00(C5GJ.CREATE_MODE_RANDOM_SELECTION, c218029ka);
            } else if (A012 instanceof C218039kb) {
                C218039kb c218039kb = (C218039kb) A012;
                int i3 = c218039kb.A00 + 1;
                C88X c88x = c218039kb.A01;
                c88x.getClass();
                List list2 = c88x.A0I;
                list2.getClass();
                c218039kb.A00 = i3 % list2.size();
                C218039kb.A00(C5GJ.CREATE_MODE_RANDOM_SELECTION, c218039kb);
            } else if (A012 instanceof C218059kd) {
                C218059kd c218059kd = (C218059kd) A012;
                C5GJ c5gj = C5GJ.CREATE_MODE_RANDOM_SELECTION;
                c218059kd.A00 = (c218059kd.A00 + 1) % c218059kd.A06.size();
                C218059kd.A00(c5gj, c218059kd);
            } else if (A012 instanceof C218009kY) {
                C218009kY c218009kY = (C218009kY) A012;
                if (!c218009kY.A04) {
                    AbstractC55215Oed.A03(c218009kY.A07, c218009kY.A08, "CREATE_MODE_SUGGESTED");
                    c218009kY.A04 = true;
                }
                int i4 = (c218009kY.A00 + 1) % c218009kY.A01;
                c218009kY.A00 = i4;
                if (i4 == 0) {
                    C88Y c88y2 = c218009kY.A09;
                    C14360o3.A0A(c88y2);
                    c88y2.A0A(c218009kY.A0D, C5GJ.CREATE_MODE_DIAL_SELECTION, C148276lx.A0q);
                } else {
                    List list3 = c218009kY.A02;
                    C14360o3.A0A(list3);
                    User user = (User) list3.get(i4 - 1);
                    Context context = c218009kY.A05;
                    C202438xN c202438xN = new C202438xN(context, c218009kY.A08, AbstractC209909Qc.A01(context, user, "CREATE_MODE_SUGGESTED"));
                    C88Y c88y3 = c218009kY.A09;
                    C14360o3.A0A(c88y3);
                    c88y3.A0A(c202438xN, C5GJ.CREATE_MODE_RANDOM_SELECTION, C148276lx.A0q);
                }
            } else if (A012 instanceof C218119kj) {
                C218119kj c218119kj = (C218119kj) A012;
                C5GJ c5gj2 = C5GJ.CREATE_MODE_RANDOM_SELECTION;
                int size = (c218119kj.A00 + 1) % c218119kj.A01.size();
                c218119kj.A00 = size;
                C218119kj.A00(c5gj2, c218119kj, (AlC) c218119kj.A01.get(size));
            }
            C22C A013 = AnonymousClass229.A01(c88e.A0C);
            A01.getId();
            C448724r c448724r = A013.A0F;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448724r.A01, "ig_camera_ui_tool_click");
            if (c448724r.A0P() && A0f.isSampled()) {
                A0f.A8R(C81X.A0n, "tool_type");
                A0f.AAP("legacy_falco_event_name", "IG_CAMERA_TAP_CREATE_RANDOM");
                C22M c22m = c448724r.A04;
                String str = c22m.A0L;
                if (str == null) {
                    str = "";
                }
                AbstractC166987dD.A1S(A0f, str);
                AbstractC166997dE.A1N(A0f, "camera_position", AbstractC167017dG.A0I(c22m));
                A0f.A9K("capture_format_index", AbstractC167007dF.A0d());
                AbstractC167007dF.A11(A0f, c448724r);
                AbstractC167017dG.A1A(c22m.A09, A0f);
                A0f.A8R(c22m.A0A, "media_type");
                AbstractC167017dG.A1B(A0f);
                A0f.A8R(c22m.A0C, "surface");
                A0f.AAP("discovery_session_id", c22m.A0O);
                A0f.AAP("search_session_id", c22m.A0P);
                AbstractC167017dG.A1C(A0f);
            }
        }
        C0f9.A0C(-1126813614, A05);
    }
}
