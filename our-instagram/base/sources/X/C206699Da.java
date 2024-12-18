package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.igsignals.core.IgSignalsExampleData;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206699Da extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206699Da(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        Object obj2 = this.A02;
        String str = this.A03;
        Object obj3 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new C206699Da(obj2, obj3, str, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206699Da) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        C120295cS A08;
        EnumC40111tc enumC40111tc;
        ShareType shareType;
        C22P c22p;
        int i = this.A00;
        AbstractC09560e7.A00(obj);
        switch (i) {
            case 0:
                AnonymousClass495 anonymousClass495 = (AnonymousClass495) this.A02;
                String str2 = this.A03;
                C9BN c9bn = (C9BN) this.A01;
                InterfaceC94594Nm interfaceC94594Nm = (InterfaceC94594Nm) c9bn.A02;
                InterfaceC09390do interfaceC09390do = anonymousClass495.A01;
                C1MM c1mm = (C1MM) interfaceC09390do.getValue();
                if (interfaceC94594Nm == null) {
                    c1mm.remove(str2);
                } else {
                    OutputStream write = c1mm.write(str2);
                    try {
                        AnonymousClass494 anonymousClass494 = anonymousClass495.A00;
                        C14360o3.A0A(write);
                        C14360o3.A0B(write, 0);
                        try {
                            if (anonymousClass494.A00 && (interfaceC94594Nm instanceof C94584Nl)) {
                                C94584Nl c94584Nl = (C94584Nl) interfaceC94594Nm;
                                C14360o3.A0B(c94584Nl, 1);
                                A08 = AbstractC221915u.A00.A08(write);
                                C206409Bx c206409Bx = c94584Nl.A00;
                                A08.A0d();
                                List<C94524Nf> list = (List) c206409Bx.A00;
                                if (list != null) {
                                    C16V.A03(A08, "promotions");
                                    for (C94524Nf c94524Nf : list) {
                                        if (c94524Nf != null) {
                                            A08.A0d();
                                            C4NJ c4nj = c94524Nf.A01;
                                            if (c4nj != null) {
                                                A08.A0r("quick_promotion");
                                                C4NI.A00(A08, c4nj);
                                            }
                                            A08.A0a();
                                        }
                                    }
                                    A08.A0Z();
                                }
                                String str3 = c206409Bx.A01;
                                if (str3 != null) {
                                    A08.A0S("bloksVersionId", str3);
                                }
                            } else {
                                if (interfaceC94594Nm instanceof C23473Aak) {
                                    C23473Aak c23473Aak = (C23473Aak) interfaceC94594Nm;
                                    C14360o3.A0B(c23473Aak, 1);
                                    A08 = AbstractC221915u.A00.A08(write);
                                    MUD mud = c23473Aak.A00;
                                    A08.A0d();
                                    String str4 = mud.A02;
                                    if (str4 != null) {
                                        A08.A0S("userId", str4);
                                    }
                                    C4OV c4ov = (C4OV) mud.A00;
                                    if (c4ov != null) {
                                        A08.A0r("qpResponse");
                                        C4OY.A00(A08, c4ov);
                                    }
                                    String str5 = mud.A01;
                                    if (str5 != null) {
                                        A08.A0S("bloksVersionId", str5);
                                    }
                                }
                                write.close();
                            }
                            A08.A0a();
                            A08.close();
                            write.close();
                        } finally {
                        }
                    } finally {
                    }
                }
                long j = c9bn.A01;
                C14360o3.A0B(str2, 0);
                String A0R = AnonymousClass001.A0R(str2, "/lastFetchTime");
                C59792oM c59792oM = ((C59812oO) interfaceC09390do.getValue()).A00;
                Long valueOf = Long.valueOf(j);
                C14360o3.A0B(A0R, 0);
                C14360o3.A0B(valueOf, 1);
                c59792oM.A00.A04(A0R, valueOf, "metadata");
                return C0eB.A00;
            case 1:
                C108284uF c108284uF = (C108284uF) this.A02;
                InterfaceC108204u7 interfaceC108204u7 = c108284uF.A00;
                if (interfaceC108204u7 != null) {
                    String str6 = this.A03;
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                    IgSignalsExampleData EKW = interfaceC108204u7.EKW(str6);
                    if (EKW != null) {
                        C52C c52c = (C52C) c108284uF.A07.invoke(str6, new Double(EKW.A00), EKW.A03, new Long(EKW.A01));
                        c52c.A00 = c108284uF;
                        c52c.A01 = EKW.A04;
                        Map map = c52c.A06;
                        List list2 = EKW.A05;
                        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(list2, 10));
                        if (A0L < 16) {
                            A0L = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                        for (Object obj2 : list2) {
                            WD2 wd2 = ((IgSignalsModelPrediction) obj2).A02;
                            if (wd2 == null || (str = wd2.A00()) == null) {
                                str = NetInfoModule.CONNECTION_TYPE_NONE;
                            }
                            linkedHashMap.put(str, obj2);
                        }
                        map.putAll(linkedHashMap);
                        interfaceC16660sJ.invoke(c52c);
                    }
                }
                return C0eB.A00;
            default:
                C40121td c40121td = (C40121td) this.A02;
                String str7 = c40121td.A01.token;
                String str8 = this.A03;
                C47Z c47z = (C47Z) this.A01;
                if (c47z == null || (enumC40111tc = c47z.A1G) == null) {
                    enumC40111tc = EnumC40111tc.A0Z;
                }
                if (c47z == null || (shareType = c47z.A0D()) == null) {
                    shareType = ShareType.A0b;
                }
                if (c47z != null) {
                    c22p = c47z.A0i;
                } else {
                    c22p = null;
                }
                C45107Jxb c45107Jxb = new C45107Jxb(c22p, enumC40111tc, shareType, str7, str8, "user post", -1);
                InterfaceC09390do interfaceC09390do2 = c40121td.A09;
                C2L1 c2l1 = (C2L1) interfaceC09390do2.getValue();
                String str9 = c45107Jxb.A04;
                c2l1.A05(AnonymousClass001.A0R("PENDING_MEDIA_UPLOAD-", str9));
                ((C2L1) interfaceC09390do2.getValue()).A05(AnonymousClass001.A0R("PENDING_MEDIA_NETWORK-", str9));
                return C0eB.A00;
        }
    }
}
