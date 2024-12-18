package X;

import com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public abstract class ONE {
    public static final void A01(AbstractC53430NkJ abstractC53430NkJ, InterfaceC16660sJ interfaceC16660sJ, C14510oO c14510oO, C15370ps c15370ps, C15370ps c15370ps2) {
        if (!c14510oO.A00) {
            AbstractC25229BEm.A1R((AnonymousClass195) c15370ps.A00);
            AbstractC25228BEl.A1P(c15370ps2.A00);
            c14510oO.A00 = true;
            interfaceC16660sJ.invoke(abstractC53430NkJ);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0oO, java.lang.Object] */
    public static final Object A00(String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, long j) {
        Object c57533Pg7;
        int i;
        AbstractC53430NkJ c51981MyP;
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        C50358MLk c50358MLk = new C50358MLk(A0s, 12);
        C14360o3.A0B(str, 0);
        if (j != Long.MIN_VALUE && j <= 0) {
            throw AbstractC166987dD.A14(AnonymousClass001.A0Q("timeout must be a positive value or NEVER_TIME_OUT: ", j));
        }
        ?? obj = new Object();
        C15370ps A1F = AbstractC25225BEi.A1F();
        C15370ps A1F2 = AbstractC25225BEi.A1F();
        C57782Pk9 A00 = OZP.A00(str);
        C57782Pk9 c57782Pk9 = OZP.A00;
        if (C14360o3.A0K(A00, c57782Pk9)) {
            c51981MyP = C51982MyQ.A00;
        } else if (AbstractC25231BEo.A1a(A00.B9j().invoke(), interfaceC16660sJ2)) {
            c51981MyP = new C51981MyP(A00);
        } else {
            C57104PUt c57104PUt = new C57104PUt(new C43752JWo(0, A1F2, obj, A00, A1F, interfaceC16660sJ2, c50358MLk));
            C50358MLk c50358MLk2 = new C50358MLk(interfaceC16660sJ, 11);
            AbstractC09800fd.A01("RpStore.subscribe", -1133804133);
            try {
                if (A00.A07) {
                    synchronized (((PVr) A00).A01) {
                        if (A00.equals(c57782Pk9)) {
                            OXE.A00.A03("RpStore", "subscribe called on finalized RpStore. No updates will be provided.", null);
                            c57533Pg7 = AbstractC54327Nzl.A00;
                            i = -44480449;
                        } else {
                            C55736Op5 c55736Op5 = new C55736Op5(c57104PUt);
                            c50358MLk2.invoke(c55736Op5);
                            c55736Op5.A01(A00.A01);
                            ((Executor) A00.A02.getValue()).execute(new PPW(A00, c57104PUt));
                            c57533Pg7 = new C57533Pg7(19, c55736Op5, A00);
                            i = -1285750994;
                        }
                    }
                } else if (A00.equals(c57782Pk9)) {
                    OXE.A00.A03("RpStore", "subscribe called on finalized RpStore. No updates will be provided.", null);
                    c57533Pg7 = AbstractC54327Nzl.A00;
                    i = -1472487928;
                } else {
                    C55736Op5 c55736Op52 = new C55736Op5(c57104PUt);
                    c50358MLk2.invoke(c55736Op52);
                    ((Executor) A00.A02.getValue()).execute(new PPX(A00, c57104PUt));
                    A00.A00.invoke(new O1S(c55736Op52));
                    c57533Pg7 = new C57533Pg7(20, c55736Op52, A00);
                    i = 1679094487;
                }
                AbstractC09800fd.A00(i);
                A1F.A00 = c57533Pg7;
                if (j != Long.MIN_VALUE) {
                    A1F2.A00 = AbstractC25226BEj.A1L(new WaitForCallConditionKt$waitForCallCondition$3(A00, str, null, interfaceC16660sJ2, c50358MLk, obj, A1F2, A1F, j), AnonymousClass194.A02(new AnonymousClass197(null)));
                }
                return A0s.A0E();
            } catch (Throwable th) {
                AbstractC09800fd.A00(287722630);
                throw th;
            }
        }
        A01(c51981MyP, c50358MLk, obj, A1F2, A1F);
        return A0s.A0E();
    }
}
