package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PKE implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PKE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C141796aw A00;
        int i;
        AbstractC52922bZ abstractC52922bZ;
        switch (this.A00) {
            case 0:
                C46h c46h = (C46h) obj;
                if ((c46h instanceof C4JL) && ((C40791um) c46h.A03()).isOk()) {
                    AbstractC52922bZ abstractC52922bZ2 = (AbstractC52922bZ) this.A02;
                    A00 = AbstractC141776au.A00(abstractC52922bZ2);
                    i = 34;
                    abstractC52922bZ = abstractC52922bZ2;
                } else {
                    C51638MrV c51638MrV = (C51638MrV) this.A01;
                    if (c51638MrV != null) {
                        c51638MrV.A00 = "enabled";
                    }
                    C51016MgO c51016MgO = (C51016MgO) this.A02;
                    c51016MgO.A03.A0B(c51638MrV);
                    A00 = AbstractC141776au.A00(c51016MgO);
                    i = 35;
                    abstractC52922bZ = c51016MgO;
                }
                PZF.A02(abstractC52922bZ, A00, i);
                return;
            case 1:
                C46h c46h2 = (C46h) obj;
                if (!(c46h2 instanceof C4JL) || ((AnonymousClass435) c46h2.A03()).A01 == null) {
                    return;
                }
                Object obj2 = ((AnonymousClass435) c46h2.A03()).A01;
                if (obj2 != null) {
                    ImmutableList A02 = ((AbstractC907342m) obj2).A02("pay_financial_entity_by_admin", C51553Mpd.class);
                    C14360o3.A07(A02);
                    Object obj3 = this.A02;
                    Iterator<E> it = A02.iterator();
                    Enum r3 = null;
                    AbstractC907342m abstractC907342m = null;
                    while (true) {
                        boolean z = false;
                        if (it.hasNext()) {
                            AbstractC907342m abstractC907342m2 = (AbstractC907342m) it.next();
                            ImmutableList A022 = abstractC907342m2.A02("payees", C51551Mpb.class);
                            if (A022 != null && !A022.isEmpty()) {
                                ImmutableList A023 = abstractC907342m2.A02("payees", C51551Mpb.class);
                                C14360o3.A07(A023);
                                Iterator<E> it2 = A023.iterator();
                                while (it2.hasNext()) {
                                    if (((AbstractC907342m) it2.next()).A04("subtype", EnumC53330NiA.A0A) == obj3) {
                                        abstractC907342m = abstractC907342m2;
                                    }
                                }
                            }
                        } else {
                            if (abstractC907342m == null) {
                                ((InterfaceC16610sE) this.A01).invoke(false, false, null);
                                return;
                            }
                            ImmutableList A024 = abstractC907342m.A02("payout_hold", C51552Mpc.class);
                            if (A024 != null) {
                                Iterator<E> it3 = A024.iterator();
                                while (it3.hasNext()) {
                                    AbstractC907342m abstractC907342m3 = (AbstractC907342m) it3.next();
                                    EnumC53329Ni9 enumC53329Ni9 = EnumC53329Ni9.A04;
                                    if (abstractC907342m3.A04("external_reason_code", enumC53329Ni9) == EnumC53329Ni9.A03 || abstractC907342m3.A04("external_reason_code", enumC53329Ni9) == EnumC53329Ni9.A02) {
                                        r3 = abstractC907342m3.A04("external_reason_code", enumC53329Ni9);
                                        z = true;
                                    }
                                }
                            }
                            ((InterfaceC16610sE) this.A01).invoke(true, Boolean.valueOf(z), r3);
                            return;
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
                break;
            default:
                ((C41761wQ) this.A02).A01();
                AbstractC25225BEi.A1U(this.A01, obj);
                return;
        }
    }
}
