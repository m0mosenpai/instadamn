package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.ml.remotepresence.RpModelDownloadManager;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class Ft6 implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Ft6(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        if (this.A00 != 0) {
            C31535DtK.A0C((C31535DtK) this.A02);
        } else {
            C14360o3.A0B(th, 0);
            ((RpModelDownloadManager) this.A02).A04((C125025l8) this.A01, th);
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        YFT yft;
        C9JQ c9jq;
        String str;
        if (this.A00 != 0) {
            Object obj2 = (C2JT) obj;
            C31535DtK c31535DtK = (C31535DtK) this.A02;
            if (!c31535DtK.A0W) {
                c31535DtK.A0W = true;
                if (c31535DtK.getContext() != null) {
                    if (obj2 == null) {
                        C31535DtK.A0C(c31535DtK);
                    } else {
                        C32123E9w c32123E9w = c31535DtK.A0I;
                        if (c32123E9w == null) {
                            str = "perfLogger";
                        } else {
                            ((MTJ) c32123E9w).A00.A02();
                            if (obj2 instanceof C67489Ump) {
                                UserSession A03 = C31535DtK.A03(c31535DtK);
                                C2JS c2js = (C2JS) obj2;
                                String A00 = AbstractC111324zv.A00(1376);
                                C67500Un0 A0E = ((C67548Unm) c2js.A05(C67548Unm.class, A00, -1988999570)).A0E();
                                C14360o3.A07(A0E);
                                yft = new C33299Enu(A03, A0E);
                                Integer num = C05F.A0C;
                                UserSession A032 = C31535DtK.A03(c31535DtK);
                                C67500Un0 A0E2 = ((C67548Unm) c2js.A05(C67548Unm.class, A00, -1988999570)).A0E();
                                C14360o3.A07(A0E2);
                                c9jq = new C9JQ(num, null, null, ((C67548Unm) c2js.A05(C67548Unm.class, A00, -1988999570)).A0E().A0C("next_max_id"), null, null, new C33299Enu(A032, A0E2).getItems(), null, false, false, true);
                            } else {
                                yft = null;
                                c9jq = null;
                            }
                            if (obj2 instanceof C67547Unl) {
                                UserSession A033 = C31535DtK.A03(c31535DtK);
                                C67547Unl c67547Unl = (C67547Unl) obj2;
                                C67494Umu A0E3 = c67547Unl.A0E().A0E();
                                C14360o3.A07(A0E3);
                                yft = new C33298Ent(A033, A0E3);
                                Integer num2 = C05F.A0C;
                                UserSession A034 = C31535DtK.A03(c31535DtK);
                                C67494Umu A0E4 = c67547Unl.A0E().A0E();
                                C14360o3.A07(A0E4);
                                c9jq = new C9JQ(num2, null, null, c67547Unl.A0E().A0E().A0C("next_max_id"), null, null, new C33298Ent(A034, A0E4).getItems(), null, false, false, true);
                            }
                            C31535DtK.A0H(c31535DtK, "");
                            if (yft != null) {
                                C31535DtK.A0G(c31535DtK, yft, "");
                            }
                            if (c9jq != null) {
                                FNH fnh = c31535DtK.A0F;
                                if (fnh == null) {
                                    str = "followListFragmentQueryManager";
                                } else {
                                    fnh.A03.AA4(c9jq, "");
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                FQ7 fq7 = (FQ7) c31535DtK.A0t.getValue();
                Object obj3 = this.A01;
                ConcurrentHashMap concurrentHashMap = fq7.A02;
                if (concurrentHashMap.containsKey(obj3)) {
                    concurrentHashMap.remove(obj3);
                    return;
                }
                return;
            }
            return;
        }
        ((RpModelDownloadManager) this.A02).A03((ImmutableMap) obj, (C125025l8) this.A01);
    }
}
