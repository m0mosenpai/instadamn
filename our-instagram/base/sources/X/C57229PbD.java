package X;

import java.util.Map;

/* renamed from: X.PbD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57229PbD extends C03E implements InterfaceC16620sF {
    public static final C57229PbD A00 = new C57229PbD();

    public C57229PbD() {
        super(2, AbstractC54327Nzl.class, "rsysAppModelReducer", "rsysAppModelReducer(Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;Ljava/lang/Object;)Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C51732MtD c51732MtD = (C51732MtD) obj;
        boolean A1a = AbstractC167017dG.A1a(c51732MtD, obj2);
        if (obj2 instanceof AbstractC53622NnT) {
            Map map = c51732MtD.A01;
            C14360o3.A0B(map, A1a ? 1 : 0);
            return new C51732MtD((AbstractC53622NnT) obj2, map);
        }
        return c51732MtD;
    }
}
