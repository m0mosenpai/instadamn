package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fpf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC35705Fpf implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnLongClickListenerC35705Fpf(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.A00) {
            case 0:
                KDL kdl = (KDL) this.A02;
                InterfaceC09390do interfaceC09390do = kdl.A04;
                C7G0 c7g0 = (C7G0) interfaceC09390do.getValue();
                InterfaceC09390do interfaceC09390do2 = kdl.A06;
                DirectThreadKey directThreadKey = (DirectThreadKey) interfaceC09390do2.getValue();
                C83403nh c83403nh = (C83403nh) this.A01;
                boolean A1R = AbstractC167007dF.A1R(0, directThreadKey, c83403nh);
                C47794L9b c47794L9b = (C47794L9b) c7g0.A03.getValue();
                C2EY c2ey = C2EY.A1i;
                String A0i = c83403nh.A0i();
                String A0g = c83403nh.A0g();
                EnumC72433Xdd A00 = AbstractC34774FTx.A00(C2DU.A03((C2DU) C2JD.A00(c7g0.A01), directThreadKey));
                Integer num = null;
                String A002 = AbstractC111324zv.A00(1245);
                c47794L9b.A01(A00, c2ey, directThreadKey, A0i, A0g, null, null, A002);
                C8QJ c8qj = new C8QJ(kdl.requireContext(), AbstractC166987dD.A0r(kdl.A05), null, false);
                C70936Wkf c70936Wkf = new C70936Wkf(0);
                ArrayList A1E = AbstractC166987dD.A1E();
                TimeZone timeZone = MX0.A03;
                A1E.add(new C199928sw(null, null, null, c70936Wkf, null, AbstractC34087F2p.A00(kdl.requireContext(), TimeUnit.SECONDS.toMillis(AbstractC25232BEp.A0t(c83403nh.A1Q))), 0, 0, 0, false, false, false, false, A1R, false, false));
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC25226BEj.A1N(kdl.requireContext(), A0K, 2131972873);
                A0K.A02();
                Drawable drawable = kdl.requireContext().getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                if (drawable != null) {
                    A0K.A08(drawable, kdl.requireContext().getColor(AbstractC53242c7.A05(kdl.requireContext())));
                }
                String A0p = AbstractC166997dE.A0p(kdl.requireContext(), 2131972872);
                String A0p2 = AbstractC166997dE.A0p(AbstractC31173DnH.A07(kdl, new C199928sw(kdl.requireContext().getDrawable(R.drawable.instagram_direct_pano_outline_24), null, null, new C49482Ltv(A1R ? 1 : 0, A0K, kdl, c83403nh), null, A0p, 0, 0, 0, false, false, false, A1R, false, false, false), A1E), 2131956832);
                Drawable drawable2 = AbstractC31173DnH.A07(kdl, new C199928sw(kdl.requireContext().getDrawable(R.drawable.instagram_copy_pano_outline_24), null, null, new C49480Ltt(2, kdl, c83403nh), null, A0p2, 0, 0, 0, false, false, false, A1R, false, false, false), A1E).getDrawable(R.drawable.instagram_delete_pano_outline_24);
                C146106i8 A0K2 = AbstractC31171DnF.A0K();
                AbstractC25226BEj.A1N(kdl.requireContext(), A0K2, 2131972866);
                A0K2.A02();
                if (drawable2 != null) {
                    A0K2.A08(drawable2, kdl.requireContext().getColor(AbstractC53242c7.A05(kdl.requireContext())));
                }
                FPB fpb = new FPB(kdl.requireActivity());
                String A0p3 = AbstractC166997dE.A0p(kdl.requireContext(), 2131957640);
                A1E.add(new C199928sw(kdl.requireContext().getDrawable(R.drawable.instagram_delete_pano_outline_24), null, null, new G8C(0, c83403nh, fpb, kdl, A0K2), Integer.valueOf(AbstractC53242c7.A03(kdl.getContext())), A0p3, 0, 0, 0, false, A1R, false, A1R, false, false, false));
                c8qj.A02(A1E);
                C14360o3.A0A(view);
                c8qj.A01(view);
                C7G0 c7g02 = (C7G0) interfaceC09390do.getValue();
                DirectThreadKey directThreadKey2 = (DirectThreadKey) interfaceC09390do2.getValue();
                C14360o3.A0B(directThreadKey2, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7g02.A00, AbstractC43591JPw.A00(921));
                if (!A0f.isSampled()) {
                    return true;
                }
                C81663kb A03 = C2DU.A03((C2DU) C2JD.A00(c7g02.A01), directThreadKey2);
                InterfaceC02530Ab interfaceC02530Ab = null;
                if (A03 != null) {
                    num = Integer.valueOf(A03.C7g());
                }
                EnumC72424XdU[] values = EnumC72424XdU.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        EnumC72424XdU enumC72424XdU = values[i];
                        int i2 = (int) enumC72424XdU.A00;
                        if (num != null && i2 == num.intValue()) {
                            interfaceC02530Ab = enumC72424XdU;
                        } else {
                            i++;
                        }
                    }
                }
                AbstractC31171DnF.A1C(A0f, "long_press");
                A0f.AAP("menu_ui", AbstractC43591JPw.A00(325));
                AbstractC31171DnF.A1G(A0f, A002);
                AbstractC31171DnF.A1H(A0f, AbstractC43827JZq.A01(directThreadKey2));
                A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c2ey.toString());
                A0f.AAP("message_id", c83403nh.A0i());
                A0f.A8R(interfaceC02530Ab, "thread_subtype");
                A0f.AAP("client_context", c83403nh.A0g());
                A0f.Cht();
                return true;
            case 1:
                ((C8SB) this.A01).A07((C3OO) this.A02);
                return false;
            case 2:
                Fragment fragment = (Fragment) this.A01;
                String A0u = AbstractC31174DnI.A0u((TextView) this.A02);
                Context context = fragment.getContext();
                if (context == null) {
                    return true;
                }
                AbstractC13900nG.A01(context, A0u, null);
                C9GR.A07(context, 2131971230);
                return true;
            default:
                Context context2 = ((View) this.A01).getContext();
                C5SU c5su = new C5SU((Activity) context2, new C149686oL(context2.getString(2131969380)));
                c5su.A03((View) this.A02);
                c5su.A04 = new G9L(this, 2);
                AbstractC166997dE.A1P(c5su);
                return true;
        }
    }
}
