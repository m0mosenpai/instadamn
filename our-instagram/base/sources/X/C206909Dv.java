package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.9Dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206909Dv extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206909Dv(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.2y7, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                C691539b c691539b = (C691539b) this.A01;
                C691839e c691839e = (C691839e) c691539b.A07.A01.getValue();
                return new C691939f(c691539b.A02, c691539b.A03, c691839e, c691539b.A09, c691539b.A0A, c691539b.A0D, c691539b.A0M, false, c691539b.A0L);
            case 1:
                interfaceC09390do = ((C693739x) ((C65622xy) this.A01).A0E.getValue()).A0D;
                break;
            case 2:
                C65622xy c65622xy = (C65622xy) this.A01;
                return new C691439a(c65622xy.A04, c65622xy.A05, c65622xy.A06);
            case 3:
                return AbstractC65492xl.A00(((C65622xy) this.A01).A06);
            case 4:
                C693739x c693739x = (C693739x) this.A01;
                return new C692339j(c693739x.A05, (C691939f) c693739x.A0E.getValue());
            case 5:
                C693739x c693739x2 = (C693739x) this.A01;
                C691839e c691839e2 = (C691839e) c693739x2.A06.A01.getValue();
                return new C691939f(c693739x2.A01, c693739x2.A02, c691839e2, c693739x2.A08, c693739x2.A09, c693739x2.A0C, true, c693739x2.A0G, c693739x2.A0F);
            case 6:
                C691439a c691439a = (C691439a) this.A01;
                return new C41I(c691439a.A00, c691439a.A02);
            case 7:
                C691439a c691439a2 = (C691439a) this.A01;
                return new IGT(c691439a2.A00, c691439a2.A01, c691439a2.A02);
            case 8:
                C691439a c691439a3 = (C691439a) this.A01;
                return new CQY(c691439a3.A00, c691439a3.A02);
            case 9:
                C691439a c691439a4 = (C691439a) this.A01;
                return new C27864CQb(c691439a4.A01, c691439a4.A02);
            case 10:
                C692339j c692339j = (C692339j) this.A01;
                Object value = c692339j.A00.A03.getValue();
                C41A c41a = (C41A) c692339j.A01.A0C.getValue();
                C41J c41j = new C41J(c41a.A01, c41a, c41a.A04);
                c41j.A00 = new C30191DRw(value, 1);
                return c41j;
            case 11:
                C692339j c692339j2 = (C692339j) this.A01;
                IL1 il1 = (IL1) c692339j2.A01.A0U.getValue();
                C41127IIs c41127IIs = new C41127IIs(il1.A00, il1);
                C691439a c691439a5 = c692339j2.A00;
                Object value2 = c691439a5.A04.getValue();
                Object value3 = c691439a5.A05.getValue();
                C43359JEa c43359JEa = new C43359JEa(value2, 0);
                C43359JEa c43359JEa2 = new C43359JEa(value2, 1);
                C30750Dfn c30750Dfn = new C30750Dfn(value3, 18);
                c41127IIs.A00 = c43359JEa;
                c41127IIs.A01 = c43359JEa2;
                c41127IIs.A02 = c30750Dfn;
                return c41127IIs;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C692339j c692339j3 = (C692339j) this.A01;
                C27889CRa c27889CRa = new C27889CRa(((IL3) c692339j3.A01.A0Y.getValue()).A00);
                Object value4 = c692339j3.A00.A06.getValue();
                C30191DRw c30191DRw = new C30191DRw(value4, 2);
                C30191DRw c30191DRw2 = new C30191DRw(value4, 3);
                c27889CRa.A01 = c30191DRw;
                c27889CRa.A00 = c30191DRw2;
                return c27889CRa;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C691939f c691939f = (C691939f) this.A01;
                return new CU7(c691939f.A00, c691939f.A01);
            case 14:
                return new AB7(((C691939f) this.A01).A01.AZ4());
            case Process.SIGTERM /* 15 */:
                C691939f c691939f2 = (C691939f) this.A01;
                return new C89313yX(c691939f2.A00, c691939f2.A01.Ai6());
            case 16:
                C691939f c691939f3 = (C691939f) this.A01;
                return new JZe(c691939f3.A00, c691939f3.A01.AiF());
            case 17:
                C691939f c691939f4 = (C691939f) this.A01;
                UserSession userSession = c691939f4.A00;
                C57332k8 c57332k8 = c691939f4.A04;
                C1M1 c1m1 = c691939f4.A05;
                AnonymousClass419 anonymousClass419 = new AnonymousClass419(userSession);
                C79293ga c79293ga = (C79293ga) c691939f4.A0b.getValue();
                C25821No A00 = C25821No.A00();
                C14360o3.A07(A00);
                return new C41A(A00, userSession, anonymousClass419, c79293ga, c57332k8, c1m1);
            case 18:
                C691939f c691939f5 = (C691939f) this.A01;
                C77133cz A002 = c691939f5.A00();
                C77233d9 c77233d9 = (C77233d9) c691939f5.A0T.getValue();
                C79563h7 c79563h7 = (C79563h7) c691939f5.A0X.getValue();
                C89313yX c89313yX = (C89313yX) c691939f5.A0A.getValue();
                UserSession userSession2 = c691939f5.A00;
                boolean z = c691939f5.A0m;
                boolean z2 = c691939f5.A0n;
                InterfaceC686036x interfaceC686036x = c691939f5.A01;
                boolean z3 = c691939f5.A0l;
                return new C89323yY(userSession2, c89313yX, c77233d9, interfaceC686036x, A002, c79563h7, c691939f5.A04, (C693839y) c691939f5.A0R.getValue(), AbstractC65512xn.A00(userSession2), c691939f5.A05, z, z2, z3);
            case Process.SIGSTOP /* 19 */:
                C691939f c691939f6 = (C691939f) this.A01;
                C75563aN A01 = c691939f6.A01();
                C75583aP c75583aP = (C75583aP) c691939f6.A0a.getValue();
                C75623aT c75623aT = (C75623aT) c691939f6.A0N.getValue();
                UserSession userSession3 = c691939f6.A00;
                return new C75633aU(userSession3, c75623aT, A01, c75583aP, AbstractC65512xn.A00(userSession3));
            case 20:
                C691939f c691939f7 = (C691939f) this.A01;
                return new A90(c691939f7.A00, (C89323yY) c691939f7.A0D.getValue(), (C75633aU) c691939f7.A0E.getValue(), (C79293ga) c691939f7.A0b.getValue());
            case 21:
                return new C41744IeI(((C691939f) this.A01).A00);
            case 22:
                return new CUD(((C691939f) this.A01).A00);
            case 23:
                return new AB8(((C691939f) this.A01).A00);
            case 24:
                return new C22848A5r(((C691939f) this.A01).A01.Aqv());
            case 25:
                C691939f c691939f8 = (C691939f) this.A01;
                return new IM6(c691939f8.A03, c691939f8.A00, new CP4(c691939f8.A04), c691939f8.A01.B5X());
            case 26:
                C691939f c691939f9 = (C691939f) this.A01;
                UserSession userSession4 = c691939f9.A00;
                C4FX B5j = c691939f9.A01.B5j();
                C1M1 c1m12 = c691939f9.A05;
                return new C96464Vf(userSession4, B5j, (C79293ga) c691939f9.A0b.getValue(), c691939f9.A04, c1m12);
            case 27:
                C691939f c691939f10 = (C691939f) this.A01;
                return new C77263dC(c691939f10.A00, c691939f10.A01.B5k());
            case 28:
                C691939f c691939f11 = (C691939f) this.A01;
                return new C75623aT(c691939f11.A00, c691939f11.A01.BxQ());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C691939f c691939f12 = (C691939f) this.A01;
                return new C77293dF(c691939f12.A00, c691939f12.A04);
            case 30:
                return new C54473O5b(((C691939f) this.A01).A01.BFd());
            case 31:
                C691939f c691939f13 = (C691939f) this.A01;
                return new C77283dE(c691939f13.A00, c691939f13.A04, (C693839y) c691939f13.A0R.getValue());
            case 32:
                C693939z c693939z = C693839y.A02;
                C691939f c691939f14 = (C691939f) this.A01;
                return c693939z.A00(c691939f14.A00, c691939f14.A03);
            case 33:
                C691939f c691939f15 = (C691939f) this.A01;
                return new C5LQ(c691939f15.A00, c691939f15.A01.BS2());
            case 34:
                C691939f c691939f16 = (C691939f) this.A01;
                return new C77233d9(c691939f16.A00, c691939f16.A04);
            case 35:
                return new IL1(((C691939f) this.A01).A00);
            case 36:
                return new CP8(((C691939f) this.A01).A01.BQu());
            case 37:
                C691939f c691939f17 = (C691939f) this.A01;
                return new C75563aN(c691939f17.A00, c691939f17.A01.BQw(), c691939f17.A04, false);
            case 38:
                return new C37465Gej(((C691939f) this.A01).A00);
            case 39:
                return new C79563h7(((C691939f) this.A01).A00);
            case 40:
                interfaceC09390do = ((C691939f) this.A01).A02.A01;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                return new AB6(((C691939f) this.A01).A00);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C691939f c691939f18 = (C691939f) this.A01;
                UserSession userSession5 = c691939f18.A00;
                C1M1 c1m13 = c691939f18.A05;
                InterfaceC686036x interfaceC686036x2 = c691939f18.A01;
                return new C75583aP(userSession5, interfaceC686036x2.BDf(), interfaceC686036x2.BQw(), c1m13);
            case 43:
                C691939f c691939f19 = (C691939f) this.A01;
                return new C77133cz(c691939f19.A00, c691939f19.A01.BRt());
            case 44:
                C691939f c691939f20 = (C691939f) this.A01;
                return new C79293ga(c691939f20.A00, new Object(), c691939f20.A01.BS4(), c691939f20.A04, c691939f20.A05);
            case 45:
                C691939f c691939f21 = (C691939f) this.A01;
                return new C28361CfL(c691939f21.A00, c691939f21.A01.BfD());
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C691939f c691939f22 = (C691939f) this.A01;
                return new C76953ch(c691939f22.A00, c691939f22.A05);
            case 47:
                return new C22850A5t(((C691939f) this.A01).A00);
            case 48:
                InterfaceC686036x interfaceC686036x3 = ((C691939f) this.A01).A01;
                JG2 BRu = interfaceC686036x3.BRu();
                InterfaceC86963uC BRs = interfaceC686036x3.BRs();
                InterfaceC909343k BRw = interfaceC686036x3.BRw();
                InterfaceC75453aC BQw = interfaceC686036x3.BQw();
                InterfaceC79903hf BRv = interfaceC686036x3.BRv();
                InterfaceC60682pr Br6 = interfaceC686036x3.Br6();
                InterfaceC31076DlJ C56 = interfaceC686036x3.C56();
                return new CTA(interfaceC686036x3.Bs2(), interfaceC686036x3.C4d(), BRs, BRu, BRv, BRw, BQw, Br6, C56);
            default:
                C691939f c691939f23 = (C691939f) this.A01;
                return new C3z2(c691939f23.A00, c691939f23.A05);
        }
        return interfaceC09390do.getValue();
    }
}
