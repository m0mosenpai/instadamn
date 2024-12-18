package com.instagram.potato.data.mediarepository;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC06930Yk;
import X.AbstractC09560e7;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC25232BEp;
import X.AbstractC25234BEr;
import X.AbstractC40691uc;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.B4Z;
import X.C09530e4;
import X.C0eB;
import X.C14360o3;
import X.C194848jk;
import X.C1DS;
import X.C1DU;
import X.C1DV;
import X.C1DW;
import X.C1DY;
import X.C1JX;
import X.C1Q;
import X.C26215Bif;
import X.C2JM;
import X.C2JS;
import X.C37761pD;
import X.C38321qM;
import X.C38801rC;
import X.C3NX;
import X.C3NY;
import X.C60023Qsj;
import X.C60024Qsk;
import X.C60025Qsl;
import X.C60036Qsw;
import X.CPI;
import X.H4C;
import X.HYF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC31134DmH;
import X.InterfaceC31135DmI;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.potato.data.mediarepository.PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1", f = "PotatoMediaRepository.kt", i = {0, 0}, l = {StringTreeSet.PAYLOAD_MASK}, m = "invokeSuspend", n = {"mediaId", "potatoContainer"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ImmutableList A04;
    public final /* synthetic */ C38321qM A05;
    public final /* synthetic */ HYF A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1(ImmutableList immutableList, C38321qM c38321qM, HYF hyf, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(1, interfaceC23621Ds);
        this.A05 = c38321qM;
        this.A06 = hyf;
        this.A03 = i;
        this.A04 = immutableList;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1(this.A04, this.A05, this.A06, interfaceC23621Ds, this.A03);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((PotatoMediaRepository$fetchNextPageOfPotatoMedia$1$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        ImmutableList immutableList;
        String str;
        InterfaceC31135DmI interfaceC31135DmI;
        ImmutableList optionalCompactedTreeListField;
        Object c26215Bif;
        String str2;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            InterfaceC31135DmI interfaceC31135DmI2 = (InterfaceC31135DmI) this.A02;
            Object obj3 = this.A01;
            AbstractC09560e7.A00(obj2);
            interfaceC31135DmI = interfaceC31135DmI2;
            str = obj3;
        } else {
            AbstractC09560e7.A00(obj2);
            C38321qM c38321qM = this.A05;
            String id = c38321qM.getId();
            InterfaceC31135DmI BfC = c38321qM.A0C.BfC();
            if (id != null && !AbstractC001900j.A0T(id) && BfC != null) {
                HYF hyf = this.A06;
                String str3 = (String) hyf.A03.get(id);
                CPI cpi = hyf.A02;
                int i = this.A03;
                if (str3 == null) {
                    immutableList = this.A04;
                } else {
                    immutableList = null;
                }
                this.A01 = id;
                this.A02 = BfC;
                this.A00 = 1;
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A04("container_id", id);
                A0b.A03(AbstractC111324zv.A00(494), Integer.valueOf(i));
                A0b.A04("max_id", str3);
                A0b.A05("excluded_media_ids", immutableList);
                obj2 = AbstractC40691uc.A01(cpi.A00).A04(new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "GetPotatoMediaForContainer", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60025Qsl.class, false, null, 0, null, "xdt_get_potato_media_items", AbstractC166987dD.A1E()), this);
                interfaceC31135DmI = BfC;
                str = id;
                if (obj2 == c1jx) {
                    return c1jx;
                }
            }
            return C0eB.A00;
        }
        C3NY c3ny = (C3NY) obj2;
        HYF hyf2 = this.A06;
        C38321qM c38321qM2 = this.A05;
        if (c3ny instanceof C3NX) {
            C2JS A18 = AbstractC25232BEp.A18(c3ny);
            if (A18 != null) {
                String A00 = AbstractC58317Pt9.A00(1056);
                C2JS requiredTreeField = A18.getRequiredTreeField(0, A00, C60024Qsk.class, 1224172882);
                if (requiredTreeField != null && requiredTreeField.getCoercedBooleanField(0, AbstractC58317Pt9.A00(285))) {
                    Map map = hyf2.A03;
                    C2JS requiredTreeField2 = A18.getRequiredTreeField(0, A00, C60024Qsk.class, 1224172882);
                    if (requiredTreeField2 != null) {
                        str2 = requiredTreeField2.getOptionalStringField(1, AbstractC111324zv.A00(237));
                    } else {
                        str2 = null;
                    }
                    map.put(str, str2);
                }
                C2JS A05 = A18.A05(C60024Qsk.class, A00, 1224172882);
                if (A05 != null && (optionalCompactedTreeListField = A05.getOptionalCompactedTreeListField(2, DialogModule.KEY_ITEMS, C60023Qsj.class, -1742646919)) != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator<E> it = optionalCompactedTreeListField.iterator();
                    while (it.hasNext()) {
                        C2JS A01 = AbstractC25225BEi.A0l(it).A01(C60036Qsw.class, -1693558332);
                        if (A01 != null) {
                            A1E.add(A01);
                        }
                    }
                    ArrayList A0i = AbstractC167007dF.A0i(A1E);
                    Iterator it2 = A1E.iterator();
                    while (it2.hasNext()) {
                        TreeJNI treeJNI = (TreeJNI) it2.next();
                        C1DU A002 = C1DS.A00(hyf2.A01);
                        AtomicBoolean atomicBoolean = C38321qM.A0i;
                        A0i.add(C38801rC.A00(new C1DY((C1DV) A002, (Set) AbstractC166987dD.A1H(), false), (ImmutablePandoMediaDict) treeJNI.reinterpret(ImmutablePandoMediaDict.class)));
                    }
                    if (!A0i.isEmpty()) {
                        C14360o3.A0B(interfaceC31135DmI, 1);
                        int AdR = interfaceC31135DmI.AdR();
                        List Aqg = interfaceC31135DmI.Aqg();
                        Long B3E = interfaceC31135DmI.B3E();
                        int BQa = interfaceC31135DmI.BQa();
                        interfaceC31135DmI.Bfu();
                        InterfaceC31134DmH Bie = interfaceC31135DmI.Bie();
                        int C2Z = interfaceC31135DmI.C2Z();
                        ArrayList A0S = AbstractC001800i.A0S(A0i, interfaceC31135DmI.Bfu());
                        TreeUpdaterJNI treeUpdaterJNI = null;
                        new C1DY((C1DV) new C37761pD(null), 6, false);
                        if (interfaceC31135DmI instanceof C1Q) {
                            C09530e4 A1L = AbstractC166987dD.A1L("audience", Integer.valueOf(AdR));
                            C09530e4 A1L2 = AbstractC166987dD.A1L(AbstractC111324zv.A00(195), Aqg);
                            C09530e4 A1L3 = AbstractC166987dD.A1L(AbstractC58317Pt9.A00(26), B3E);
                            C09530e4 A1L4 = AbstractC166987dD.A1L("media_count", Integer.valueOf(BQa));
                            ArrayList A0i2 = AbstractC167007dF.A0i(A0S);
                            Iterator it3 = A0S.iterator();
                            while (it3.hasNext()) {
                                A0i2.add(((C38321qM) it3.next()).A1D());
                            }
                            C09530e4 A1L5 = AbstractC166987dD.A1L(AbstractC111324zv.A00(72), A0i2);
                            if (Bie != null) {
                                treeUpdaterJNI = Bie.F7o();
                            }
                            TreeJNI treeJNI2 = (TreeJNI) interfaceC31135DmI;
                            c26215Bif = AbstractC25234BEr.A0P(treeJNI2, AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, AbstractC166987dD.A1L(AbstractC43591JPw.A00(50), treeUpdaterJNI), AbstractC166987dD.A1L(AbstractC111324zv.A00(271), Integer.valueOf(C2Z)))).applyToTree(treeJNI2);
                            C14360o3.A07(c26215Bif);
                        } else {
                            H4C h4c = null;
                            C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
                            if (Bie != null) {
                                h4c = Bie.EwR(c1dy);
                            }
                            c26215Bif = new C26215Bif(h4c, B3E, Aqg, A0S, AdR, BQa, C2Z);
                        }
                        c38321qM2.A0C.EbE((InterfaceC31135DmI) c26215Bif);
                        C1DW.A00(hyf2.A01).A01(c38321qM2, true, false);
                    }
                }
            }
        } else if (!(c3ny instanceof C194848jk)) {
            throw B4Z.A00();
        }
        return C0eB.A00;
    }
}
