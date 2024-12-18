package X;

import android.app.Application;

/* loaded from: classes9.dex */
public final class PVJ implements InterfaceC19390xP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public PVJ(Application application, C50858Mdp c50858Mdp, InterfaceC19390xP interfaceC19390xP, int i) {
        this.A00 = i;
        this.A02 = interfaceC19390xP;
        switch (i) {
            case 3:
            case 4:
                this.A03 = c50858Mdp;
                this.A01 = application;
                break;
            default:
                this.A01 = application;
                this.A03 = c50858Mdp;
                break;
        }
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC19390xP interfaceC19390xP;
        InterfaceC19960yQ c208369Jv;
        Object obj;
        Object obj2;
        int i;
        C50858Mdp c50858Mdp;
        Application application;
        int i2;
        switch (this.A00) {
            case 0:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                c208369Jv = new C208369Jv(1, this.A03, this.A01, interfaceC19960yQ);
                break;
            case 1:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                c208369Jv = new C44071Jdw(5, this.A01, this.A03, interfaceC19960yQ);
                break;
            case 2:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                obj = this.A03;
                obj2 = this.A01;
                i = 1;
                c208369Jv = new C57113PVc(i, obj2, obj, interfaceC19960yQ);
                break;
            case 3:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                c50858Mdp = (C50858Mdp) this.A03;
                application = (Application) this.A01;
                i2 = 2;
                c208369Jv = new C57113PVc(application, c50858Mdp, interfaceC19960yQ, i2);
                break;
            case 4:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                c50858Mdp = (C50858Mdp) this.A03;
                application = (Application) this.A01;
                i2 = 3;
                c208369Jv = new C57113PVc(application, c50858Mdp, interfaceC19960yQ, i2);
                break;
            case 5:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                c208369Jv = new C57113PVc((Application) this.A01, (C50858Mdp) this.A03, interfaceC19960yQ, 4);
                break;
            case 6:
                interfaceC19390xP = (InterfaceC19390xP) this.A03;
                c208369Jv = new C31319Dpf(6, this.A01, interfaceC19960yQ, this.A02);
                break;
            case 7:
                interfaceC19390xP = (InterfaceC19390xP) this.A03;
                c208369Jv = new C57113PVc(6, this.A01, interfaceC19960yQ, this.A02);
                break;
            default:
                interfaceC19390xP = (InterfaceC19390xP) this.A02;
                obj = this.A03;
                obj2 = this.A01;
                i = 10;
                c208369Jv = new C57113PVc(i, obj2, obj, interfaceC19960yQ);
                break;
        }
        return AbstractC167017dG.A0i(interfaceC23621Ds, interfaceC19390xP, c208369Jv);
    }

    public PVJ(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }
}
