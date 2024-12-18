package X;

import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureAnimatedMediaMessageMutationFactory;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes8.dex */
public final class MBf extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBf(C19260xA c19260xA, EnumC159397Cz enumC159397Cz, C83403nh c83403nh, InterfaceC37261GbE interfaceC37261GbE, C31501et c31501et, C31481er c31481er, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A01 = c31501et;
        this.A05 = c31481er;
        this.A06 = c83403nh;
        this.A08 = z;
        this.A03 = enumC159397Cz;
        this.A04 = interfaceC37261GbE;
        this.A07 = c19260xA;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A02) {
            case 0:
                C31501et c31501et = (C31501et) this.A01;
                C31481er c31481er = (C31481er) this.A05;
                C83403nh c83403nh = (C83403nh) this.A06;
                boolean z = this.A08;
                return new MBf((C19260xA) this.A07, (EnumC159397Cz) this.A03, c83403nh, (InterfaceC37261GbE) this.A04, c31501et, c31481er, interfaceC23621Ds, z);
            case 1:
                return new MBf(this.A03, this.A05, this.A06, this.A04, this.A07, interfaceC23621Ds, 1, this.A08);
            default:
                MBf mBf = new MBf(this.A03, this.A05, this.A06, this.A04, this.A07, interfaceC23621Ds, 2, this.A08);
                mBf.A01 = obj;
                return mBf;
        }
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        EnumC72392Xce enumC72392Xce;
        Object obj2 = obj;
        int i = this.A02;
        C1JX c1jx = C1JX.A02;
        switch (i) {
            case 0:
                if (this.A00 != 0) {
                    AbstractC09560e7.A00(obj2);
                } else {
                    AbstractC09560e7.A00(obj2);
                    C31501et c31501et = (C31501et) this.A01;
                    C31481er c31481er = (C31481er) this.A05;
                    C83403nh c83403nh = (C83403nh) this.A06;
                    boolean z = this.A08;
                    EnumC159397Cz enumC159397Cz = (EnumC159397Cz) this.A03;
                    this.A00 = 1;
                    if (c31481er.Ar9() == C2EY.A0K) {
                        obj2 = new DirectConfigureAnimatedMediaMessageMutationFactory(c31501et.A00).A00(enumC159397Cz, c83403nh, c31481er, this);
                    } else if (c31481er.Ar9() == C2EY.A1C) {
                        obj2 = new DirectConfigureMediaMessageMutationFactory(c31501et.A00).A03(enumC159397Cz, c83403nh, c31481er, this);
                    } else if (c83403nh.A1a()) {
                        obj2 = new DirectConfigureMediaCollectionMessageMutationFactory(c31501et.A00).A02(c83403nh, c31481er, this, z);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == c1jx) {
                        return c1jx;
                    }
                }
                C1OW c1ow = (C1OW) obj2;
                if (c1ow == null) {
                    ((InterfaceC37261GbE) this.A04).DUq(C114675Fx.A0L, null);
                } else {
                    C26141Ov A01 = C26141Ov.A01(((C31501et) this.A01).A00);
                    InterfaceC29301b7 interfaceC29301b7 = (InterfaceC29301b7) A01.A09.A01(c1ow.A02()).A04.getValue();
                    C14360o3.A07(interfaceC29301b7);
                    interfaceC29301b7.ENr((C19260xA) this.A07, (InterfaceC37261GbE) this.A04, c1ow);
                }
                return C0eB.A00;
            case 1:
                if (this.A00 != 0) {
                    enumC72392Xce = (EnumC72392Xce) this.A01;
                    AbstractC09560e7.A00(obj2);
                } else {
                    AbstractC09560e7.A00(obj2);
                    C09530e4 c09530e4 = (C09530e4) this.A05;
                    enumC72392Xce = (EnumC72392Xce) c09530e4.A00;
                    List list = (List) c09530e4.A01;
                    ((SettingsScreenViewModel) this.A03).A07((EnumC72365Xc1) this.A06, enumC72392Xce.name());
                    C47979LIr c47979LIr = (C47979LIr) this.A04;
                    C26082BgB A00 = c47979LIr.A00(enumC72392Xce);
                    SettingsSession settingsSession = (SettingsSession) this.A07;
                    boolean z2 = this.A08;
                    this.A01 = enumC72392Xce;
                    this.A00 = 1;
                    obj2 = UiStateKt.A01(A00, settingsSession, c47979LIr, list, this, z2);
                    if (obj2 == c1jx) {
                        return c1jx;
                    }
                }
                ((SettingsScreenViewModel) this.A03).A08((EnumC72365Xc1) this.A06, enumC72392Xce.name());
                return obj2;
            default:
                try {
                    if (this.A00 == 0) {
                        AbstractC09560e7.A00(obj2);
                        C19L c19l = (C19L) this.A01;
                        SettingsScreenViewModel settingsScreenViewModel = (SettingsScreenViewModel) this.A03;
                        EnumC72365Xc1 enumC72365Xc1 = (EnumC72365Xc1) this.A05;
                        settingsScreenViewModel.A0A(enumC72365Xc1, true);
                        List list2 = (List) this.A06;
                        Object obj3 = this.A04;
                        Object obj4 = this.A07;
                        boolean z3 = this.A08;
                        ArrayList A0q = AbstractC167017dG.A0q(list2);
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            A0q.add(AbstractC23641Du.A02(AnonymousClass191.A00, new MBf(settingsScreenViewModel, it.next(), enumC72365Xc1, obj3, obj4, (InterfaceC23621Ds) null, 1, AbstractC167007dF.A1M(z3 ? 1 : 0)), c19l));
                        }
                        this.A00 = 1;
                        obj2 = AbstractC918549n.A00(A0q, this);
                        if (obj2 == c1jx) {
                            return c1jx;
                        }
                    } else {
                        AbstractC09560e7.A00(obj2);
                    }
                    List list3 = (List) obj2;
                    ((SettingsScreenViewModel) this.A03).A09((EnumC72365Xc1) this.A05, null, true);
                    return new C2C(list3, false);
                } catch (CancellationException e) {
                    ((SettingsScreenViewModel) this.A03).A09((EnumC72365Xc1) this.A05, e.toString(), false);
                    throw e;
                }
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBf) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A05 = obj2;
        this.A06 = obj3;
        this.A04 = obj4;
        this.A07 = obj5;
        this.A08 = z;
    }
}
