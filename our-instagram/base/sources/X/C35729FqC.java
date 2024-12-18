package X;

import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;

/* renamed from: X.FqC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35729FqC implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C35729FqC(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.A00) {
            case 0:
                N5U n5u = (N5U) this.A01;
                N5U.A00(n5u).A00(AbstractC58317Pt9.A00(15), z);
                N5U.A09(n5u, this.A02, z);
                N5U.A05(n5u);
                return;
            case 1:
                if (this.A02 == z) {
                    return;
                }
                if (z) {
                    C33230ElN c33230ElN = (C33230ElN) this.A01;
                    Bundle bundle = c33230ElN.A00;
                    if (bundle != null) {
                        if (bundle.getBoolean("is_two_factor_enabled")) {
                            AbstractC12990ll A0o = AbstractC166987dD.A0o(c33230ElN.A05);
                            Bundle bundle2 = c33230ElN.A00;
                            if (bundle2 != null) {
                                AbstractC32533EUj.A00(c33230ElN.getParentFragmentManager(), c33230ElN, AbstractC35192Ffk.A00(A0o, AbstractC31180DnO.A0a(bundle2), AbstractC31180DnO.A0c(c33230ElN)), 5);
                                return;
                            }
                        } else {
                            AbstractC35179FfW.A03();
                            Bundle bundle3 = c33230ElN.A00;
                            if (bundle3 != null) {
                                bundle3.putBoolean("ARG_IS_ENABLING_WHATSAPP", true);
                                EK3 ek3 = new EK3();
                                AbstractC31179DnN.A0y(ek3, AbstractC31173DnH.A0J(bundle3, ek3, c33230ElN), c33230ElN.A05);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F("twoFacResponseBundle");
                    throw C00O.createAndThrow();
                }
                Fragment fragment = (Fragment) this.A01;
                C14360o3.A0A(compoundButton);
                C193328hC A0O = AbstractC31175DnJ.A0O(fragment);
                A0O.A0A(2131976018);
                A0O.A09(2131976017);
                A0O.A0L(DialogInterfaceOnClickListenerC35453FkA.A00(fragment, 59), 2131976002);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35453FkA.A00(compoundButton, 60), A0O);
                return;
            default:
                if (this.A02) {
                    NAF naf = (NAF) this.A01;
                    C34997FbU c34997FbU = naf.A08;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34997FbU.A00, "instagram_waverly_ig_event");
                    A0f.A7v("attempted_toggle_value", C34997FbU.A00(A0f, c34997FbU, "tap_component", z));
                    A0f.AAP("message_controls_settings_version", "v2");
                    A0f.Cht();
                    C56142Ow4 c56142Ow4 = naf.A0D;
                    c56142Ow4.A00 = C9GR.A01(naf.A05, null, 2131966434, 1);
                    c56142Ow4.A01(c34997FbU, z);
                    naf.A02 = false;
                    naf.A0E.A00();
                    return;
                }
                return;
        }
    }
}
