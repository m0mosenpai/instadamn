package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.N7o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52179N7o extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC37145GYg {
    public static final String __redex_internal_original_name = "BrandedContentAddBrandPartnersSeeAllFragment";
    public InterfaceC57924PmU A00;
    public List A03 = AbstractC166987dD.A1E();
    public List A02 = C16930sl.A00;
    public String A01 = "feed";
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37145GYg
    public final void Cs2(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C14360o3.A0B(user, 0);
        AbstractC167027dH.A13(userSession, fragmentActivity, str);
        if (C4A4.A02(userSession)) {
            InterfaceC57924PmU interfaceC57924PmU = this.A00;
            if (interfaceC57924PmU == null) {
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
            this.A02 = interfaceC57924PmU.DFF(new C54380O1m(this), user);
            A00();
            return;
        }
        F0C.A00(fragmentActivity, userSession, user, str);
    }

    @Override // X.InterfaceC37145GYg
    public final void DY5(User user) {
        C14360o3.A0B(user, 0);
        InterfaceC57924PmU interfaceC57924PmU = this.A00;
        if (interfaceC57924PmU == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        this.A02 = interfaceC57924PmU.DFF(new C54380O1m(this), user);
        A00();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (r0 == false) goto L4;
     */
    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            super.onViewCreated(r7, r8)
            r0 = 2131427510(0x7f0b00b6, float:1.8476638E38)
            android.view.ViewStub r0 = X.AbstractC167007dF.A0M(r7, r0)
            android.view.View r2 = r0.inflate()
            r0 = 2131427517(0x7f0b00bd, float:1.8476652E38)
            android.view.View r1 = r2.requireViewById(r0)
            r0 = 39
            X.ViewOnClickListenerC55467OkM.A00(r1, r0, r6)
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            int r1 = X.AbstractC31177DnL.A01(r2, r0)
            r0 = 2131440847(0x7f0b34cf, float:1.8503689E38)
            X.AbstractC31172DnG.A1J(r7, r0, r1)
            r0 = 2131431456(0x7f0b1020, float:1.8484642E38)
            android.widget.TextView r5 = X.AbstractC166997dE.A0T(r7, r0)
            r5.setVisibility(r3)
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            X.0do r0 = r6.A04
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            java.lang.String r2 = "BrandedContentAddBrandPartnersSeeAllFragment"
            java.lang.String r1 = r6.A01
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto L62;
                case 3496474: goto L6c;
                case 109770997: goto L58;
                default: goto L4a;
            }
        L4a:
            r1 = 2131954162(0x7f1309f2, float:1.9544815E38)
        L4d:
            android.text.SpannableStringBuilder r0 = X.AbstractC55199Oe9.A02(r4, r3, r2, r1)
            X.AbstractC31176DnK.A1G(r5, r0)
            r6.A00()
            return
        L58:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131954166(0x7f1309f6, float:1.9544824E38)
            goto L75
        L62:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131954163(0x7f1309f3, float:1.9544817E38)
            goto L75
        L6c:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131954165(0x7f1309f5, float:1.9544822E38)
        L75:
            if (r0 != 0) goto L4d
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52179N7o.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A00() {
        EnumC99704do enumC99704do;
        C32091E8p c32091E8p;
        List<User> list = this.A03;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (User user : list) {
            if (C4A4.A02(AbstractC166987dD.A0r(this.A04))) {
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                c32091E8p = new C32091E8p(null, objArr, objArr2, user, C05F.A0Y, 1788, false, true);
            } else {
                Integer num = C05F.A0N;
                boolean z = false;
                int i = 2131952265;
                if (this.A02.contains(user)) {
                    i = 2131969455;
                }
                BHS A0G = MSX.A0G(i);
                if (this.A02.contains(user)) {
                    enumC99704do = EnumC99704do.A06;
                } else {
                    enumC99704do = EnumC99704do.A03;
                }
                c32091E8p = new C32091E8p(A0G, null, enumC99704do, user, num, 2032, z, z);
            }
            A0q.add(c32091E8p);
        }
        A0B(A0q);
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EXW(this, this, this, AbstractC166987dD.A0r(this.A04)));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57614PhQ.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25231BEo.A0c(requireActivity(), this.A04).A06();
        return true;
    }
}
