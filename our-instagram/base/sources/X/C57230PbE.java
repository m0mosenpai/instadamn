package X;

import java.util.LinkedHashMap;

/* renamed from: X.PbE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57230PbE extends C03E implements InterfaceC16620sF {
    public static final C57230PbE A00 = new C57230PbE();

    public C57230PbE() {
        super(2, AbstractC54327Nzl.class, "rpReducerAggregator", "rpReducerAggregator(Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;Ljava/lang/Object;)Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        C51732MtD c51732MtD = (C51732MtD) obj;
        AbstractC167017dG.A1N(c51732MtD, obj2);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C14360o3.A07(AbstractC54329Nzn.A00);
        Object A002 = c51732MtD.A00(O1U.class);
        if (A002 == null) {
            obj3 = null;
            if (!(obj2 instanceof C54953OSd)) {
                if (obj2 instanceof O1U) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            obj3 = C51994Myc.A00;
        } else if (A002 instanceof O1U) {
            O1U o1u = (O1U) A002;
            if (!(obj2 instanceof C54953OSd)) {
                obj3 = o1u;
                if (obj2 instanceof O1U) {
                    if (o1u != null) {
                        if (o1u.A00) {
                            OXE oxe = OXE.A00;
                            StringBuilder A11 = AbstractC166997dE.A11("MultiCallState update received while in terminal state. Update: ");
                            A11.append(obj2);
                            oxe.A00("MultiCallReducer", AbstractC167017dG.A0n(o1u, " | current: ", A11));
                            obj3 = o1u;
                        } else {
                            obj3 = obj2;
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            obj3 = C51994Myc.A00;
        } else {
            throw AbstractC166987dD.A14("Incorrect class passed to reducer.  Relying on RpStore to maintain class<>instance map - check this c ode");
        }
        A1I.put(O1U.class, obj3);
        return new C51732MtD(c51732MtD.A00, AbstractC06930Yk.A0B(A1I));
    }
}
