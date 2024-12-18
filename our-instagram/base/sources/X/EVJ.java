package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.discoverpeople.model.FindPeopleButtonOverride;

/* loaded from: classes6.dex */
public class EVJ extends AbstractC60592pi {
    public boolean A00;
    public final Fragment A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final EnumC72412Xd8 A05;
    public final GZY A06;
    public final String A07;
    public final String A08;
    public final InterfaceC41501vz A09;
    public final InterfaceC41501vz A0A;
    public final InterfaceC41501vz A0B;

    public EVJ(Fragment fragment, InterfaceC11380iw interfaceC11380iw, InterfaceC59992oh interfaceC59992oh, UserSession userSession, EnumC72412Xd8 enumC72412Xd8, GZY gzy) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = fragment;
        this.A03 = interfaceC11380iw;
        this.A05 = enumC72412Xd8;
        this.A06 = gzy;
        this.A02 = fragment.mParentFragment;
        this.A08 = "inline_upsell";
        this.A07 = "revised_inline_upsell";
        this.A09 = new C36155FxU(this, 23);
        this.A0A = new C36155FxU(this, 24);
        this.A0B = new C36155FxU(this, 25);
        interfaceC59992oh.registerLifecycleListener(this);
    }

    public final FindPeopleButtonOverride A00(Integer num) {
        String str;
        if (this instanceof C33283Ene) {
            C14360o3.A0B(num, 0);
            Bundle bundle = ((C33283Ene) this).A00.A00;
            if (bundle != null) {
                if (num.intValue() != 0) {
                    str = "CONTACTS";
                } else {
                    str = "FACEBOOK";
                }
                return (FindPeopleButtonOverride) bundle.getParcelable(str);
            }
            return null;
        }
        return null;
    }

    public final void A01() {
        String str;
        if (this instanceof C33284Enf) {
            C31542DtS c31542DtS = ((C33284Enf) this).A00.A0E;
            if (c31542DtS == null) {
                str = "followListAdapter";
            } else {
                C0fA.A00(c31542DtS, 1393977277);
                return;
            }
        } else if (this instanceof C33283Ene) {
            EQJ eqj = ((C33283Ene) this).A00.A01;
            if (eqj == null) {
                str = "explorePeopleAdapter";
            } else {
                eqj.notifyDataSetChanged();
                return;
            }
        } else if (this instanceof C33282End) {
            EQK eqk = ((C33282End) this).A00.A00;
            if (eqk == null) {
                str = "accountDiscoveryAdapter";
            } else {
                eqk.A00();
                return;
            }
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        C25671My A00 = AbstractC25651Mw.A00(this.A04);
        A00.A01(this.A09, C36114Fwo.class);
        A00.A01(this.A0A, C36070Fw6.class);
        A00.A01(this.A0B, C36066Fw2.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        C25671My A00 = AbstractC25651Mw.A00(this.A04);
        A00.A02(this.A09, C36114Fwo.class);
        A00.A02(this.A0A, C36070Fw6.class);
        A00.A02(this.A0B, C36066Fw2.class);
    }
}
