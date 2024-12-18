package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.hyperthrift.HyperThriftBase;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DHI extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHI(String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object A00;
        long j;
        C37644Ghd A002;
        switch (this.A00) {
            case 0:
            case 1:
                C51759Mti c51759Mti = (C51759Mti) obj;
                C14360o3.A0B(c51759Mti, 0);
                ((IGRTCSignalingCoordinator) c51759Mti.A01).handleMqttMessage(this.A01);
                return C0eB.A00;
            case 2:
                C38680GzL c38680GzL = (C38680GzL) obj;
                C14360o3.A0B(c38680GzL, 0);
                String str = this.A01;
                List list = (List) c38680GzL.A01;
                C14360o3.A0B(str, 0);
                C14360o3.A0B(list, 1);
                return new C38680GzL(str, list, true, false);
            case 3:
                C37783Gjy c37783Gjy = (C37783Gjy) obj;
                C14360o3.A0B(c37783Gjy, 0);
                return C37783Gjy.A00(null, c37783Gjy, this.A01, null, null, null, null, null, 7742, true, false, false, false);
            case 4:
                C26063Bfr c26063Bfr = (C26063Bfr) obj;
                C14360o3.A0B(c26063Bfr, 0);
                String str2 = this.A01;
                List list2 = (List) c26063Bfr.A02;
                java.util.Set set = (java.util.Set) c26063Bfr.A01;
                C14360o3.A0B(str2, 0);
                AbstractC167007dF.A1D(list2, 1, set);
                return new C26063Bfr(str2, list2, set, true, false, false);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                return this.A01;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                HyperThriftBase hyperThriftBase = (HyperThriftBase) obj;
                C14360o3.A0B(hyperThriftBase, 0);
                A00 = hyperThriftBase.A00(0);
                return Boolean.valueOf(C14360o3.A0K(A00, this.A01));
            case 14:
                C26041BfU c26041BfU = (C26041BfU) obj;
                C14360o3.A0B(c26041BfU, 0);
                return new C26041BfU(1, false, false, c26041BfU.A02, c26041BfU.A01, false, AbstractC25229BEm.A1Z(this.A01));
            case Process.SIGTERM /* 15 */:
                List A1C = AbstractC25228BEl.A1C(obj);
                String str3 = this.A01;
                Iterator it = A1C.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (C14360o3.A0K(((WallPostItem) next).Bez().A06, str3)) {
                            if (next != null) {
                                A1C.remove(next);
                            }
                        }
                    }
                }
                return C0eB.A00;
            case 16:
                BYS bys = (BYS) obj;
                C14360o3.A0B(bys, 0);
                EnumC72438Xdi enumC72438Xdi = EnumC72438Xdi.BELL_OFF;
                EnumC72394Xcg enumC72394Xcg = EnumC72394Xcg.A1W;
                EnumC27424C8r enumC27424C8r = EnumC27424C8r.FILLED;
                long A0K = AbstractC25230BEn.A0K();
                long A0D = AbstractC25229BEm.A0D();
                EnumC27423C8q enumC27423C8q = EnumC27423C8q.SIZE_16;
                C2Z1 c2z1 = bys.A00;
                Drawable drawable = new C29467Cyh(enumC72438Xdi, null, enumC27423C8q, enumC27424C8r, enumC72394Xcg).EKN(AbstractC77363dM.A00(c2z1), AbstractC28337CeP.A01(c2z1)).A01;
                int A0o = AbstractC25232BEp.A0o(c2z1, 16.0d);
                drawable.setBounds(0, 0, A0o, A0o);
                if (AbstractC25231BEo.A0M(c2z1).getConfiguration().getLayoutDirection() == 1) {
                    j = A0K;
                    A0K = A0D;
                } else {
                    j = A0D;
                }
                Q44 q44 = new Q44(new Rect(AbstractC25228BEl.A0A(c2z1, j), AbstractC25228BEl.A0A(c2z1, A0D), AbstractC25228BEl.A0A(c2z1, A0K), AbstractC25228BEl.A0A(c2z1, A0D)), drawable, 2);
                int length = bys.length();
                bys.append((CharSequence) " ");
                bys.setSpan(q44, length, bys.length(), 17);
                bys.append((CharSequence) this.A01);
                return C0eB.A00;
            case 17:
                BYS bys2 = (BYS) obj;
                C14360o3.A0B(bys2, 0);
                EnumC72394Xcg enumC72394Xcg2 = EnumC72394Xcg.A1M;
                String str4 = this.A01;
                C2Z1 c2z12 = bys2.A00;
                C28586CjR c28586CjR = new C28586CjR(AbstractC25232BEp.A0o(c2z12, 4.0d), AbstractC28379Cfi.A01(enumC72394Xcg2, AbstractC28337CeP.A01(c2z12)), AbstractC25232BEp.A0o(c2z12, 5.0d) / 2);
                int length2 = bys2.length();
                bys2.append((CharSequence) str4);
                bys2.setSpan(c28586CjR, length2, bys2.length(), 17);
                return C0eB.A00;
            case 18:
                CRC crc = (CRC) obj;
                C14360o3.A0B(crc, 0);
                crc.A01.A0Y(crc.A00, crc.A02);
                crc.A02.addAction(new C012804r(16, this.A01));
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                Product product = (Product) obj;
                C14360o3.A0B(product, 0);
                User user = product.A0B;
                if (user != null) {
                    A00 = AbstractC76433bn.A00(user);
                } else {
                    A00 = null;
                }
                return Boolean.valueOf(C14360o3.A0K(A00, this.A01));
            case 20:
                A002 = C37644Ghd.A00(null, null, null, AbstractC25228BEl.A0r(obj), null, null, null, null, this.A01, null, 0, 0, -268435457, 7, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                return A002;
        }
    }
}
