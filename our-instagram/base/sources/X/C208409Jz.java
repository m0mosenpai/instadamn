package X;

import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.ar.core.effectcollection.EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2;

/* renamed from: X.9Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208409Jz implements InterfaceC19390xP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C208409Jz(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj3;
        this.A04 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC19390xP interfaceC19390xP;
        InterfaceC19960yQ effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2;
        if (this.A00 != 0) {
            interfaceC19390xP = (InterfaceC19390xP) this.A02;
            Object obj = this.A01;
            effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2 = new PVT(3, this.A04, this.A03, interfaceC19960yQ, obj);
        } else {
            interfaceC19390xP = (InterfaceC19390xP) this.A03;
            C172897n3 c172897n3 = (C172897n3) this.A01;
            effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2 = new EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2((C1807580d) this.A02, (EffectCollectionService) this.A04, c172897n3, interfaceC19960yQ);
        }
        return AbstractC167017dG.A0i(interfaceC23621Ds, interfaceC19390xP, effectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2);
    }
}
