package X;

import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Iterator;

/* renamed from: X.2gW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55312gW implements InterfaceC55322gX {
    public static final SparseIntArray A02;
    public final SparseLongArray A00;
    public final UserFlowLogger A01;

    public C55312gW(UserFlowLogger userFlowLogger) {
        C14360o3.A0B(userFlowLogger, 1);
        this.A01 = userFlowLogger;
        this.A00 = new SparseLongArray(A02.size());
    }

    private final void A01(InterfaceC16660sJ interfaceC16660sJ) {
        try {
            SparseLongArray sparseLongArray = this.A00;
            int size = sparseLongArray.size();
            for (int i = 0; i < size; i++) {
                interfaceC16660sJ.invoke(Long.valueOf(sparseLongArray.valueAt(i)));
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            A01(interfaceC16660sJ);
        }
    }

    @Override // X.InterfaceC55322gX
    public final void AW0(String str, String str2) {
        A01(new C9GD(this, str, str2, 1));
    }

    @Override // X.InterfaceC55322gX
    public final void AWA(String str) {
        C14360o3.A0B(str, 0);
        A01(new C207409Ft(str, this, 7));
    }

    @Override // X.InterfaceC55322gX
    public final void AWE(String str, java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Trigger trigger = (Trigger) it.next();
            SparseIntArray sparseIntArray = A02;
            int ordinal = trigger.ordinal();
            if (sparseIntArray.get(ordinal) != 0) {
                if (A00(this, trigger) != 0) {
                    UserFlowLogger userFlowLogger = this.A01;
                    userFlowLogger.flowAnnotate(A00(this, trigger), "repeat_trigger_source", str);
                    userFlowLogger.flowMarkPoint(A00(this, trigger), AnonymousClass001.A0R("repeat_trigger_source_", str));
                } else {
                    UserFlowLogger userFlowLogger2 = this.A01;
                    long generateNewFlowId = userFlowLogger2.generateNewFlowId(sparseIntArray.get(ordinal));
                    this.A00.put(sparseIntArray.get(ordinal), generateNewFlowId);
                    userFlowLogger2.flowStart(generateNewFlowId, new UserFlowConfig(str, false));
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        sparseIntArray.put(0, 332019815);
        sparseIntArray.put(1, 332019202);
        sparseIntArray.put(2, 332008113);
        sparseIntArray.put(3, 332012281);
        sparseIntArray.put(4, 332006902);
        sparseIntArray.put(5, 332017383);
        sparseIntArray.put(6, 332009051);
        sparseIntArray.put(7, 332014186);
        sparseIntArray.put(8, 332010125);
        sparseIntArray.put(9, 332019702);
        sparseIntArray.put(10, 332013247);
        sparseIntArray.put(11, 332017962);
        sparseIntArray.put(12, 332016926);
        sparseIntArray.put(13, 332008904);
        sparseIntArray.put(14, 332011967);
        sparseIntArray.put(15, 332008792);
        sparseIntArray.put(16, 332011630);
        sparseIntArray.put(17, 332019257);
        sparseIntArray.put(18, 332014151);
        sparseIntArray.put(19, 332016107);
        sparseIntArray.put(20, 332018652);
        sparseIntArray.put(21, 332021310);
        sparseIntArray.put(22, 332018209);
        sparseIntArray.put(23, 332009254);
        sparseIntArray.put(24, 332015774);
        sparseIntArray.put(25, 332013269);
        sparseIntArray.put(26, 332013199);
        sparseIntArray.put(27, 332015341);
        sparseIntArray.put(28, 332017229);
        sparseIntArray.put(29, 332020201);
        sparseIntArray.put(30, 332016876);
        sparseIntArray.put(31, 332018011);
        sparseIntArray.put(32, 332021232);
        sparseIntArray.put(33, 332012055);
        sparseIntArray.put(34, 332007905);
        sparseIntArray.put(35, 332006825);
        sparseIntArray.put(36, 332020615);
        sparseIntArray.put(37, 332018946);
        sparseIntArray.put(38, 332014390);
        sparseIntArray.put(39, 332020582);
        sparseIntArray.put(40, 332007776);
        sparseIntArray.put(41, 332008111);
        sparseIntArray.put(42, 332011471);
        sparseIntArray.put(43, 332017140);
        sparseIntArray.put(44, 332020325);
        sparseIntArray.put(45, 332019700);
        sparseIntArray.put(46, 332009757);
        sparseIntArray.put(47, 332013845);
        sparseIntArray.put(48, 332008147);
        sparseIntArray.put(49, 332006892);
        sparseIntArray.put(50, 332016408);
        sparseIntArray.put(51, 332016196);
        sparseIntArray.put(52, 332012876);
        sparseIntArray.put(53, 332013530);
        sparseIntArray.put(54, 332012096);
        sparseIntArray.put(55, 332012563);
        sparseIntArray.put(56, 332006617);
        sparseIntArray.put(57, 332017793);
        sparseIntArray.put(58, 332008365);
        sparseIntArray.put(59, 332015089);
        sparseIntArray.put(60, 332010360);
        sparseIntArray.put(61, 332006652);
        sparseIntArray.put(62, 332011758);
        sparseIntArray.put(63, 332016293);
        sparseIntArray.put(64, 332018767);
        sparseIntArray.put(67, 332014732);
        sparseIntArray.put(68, 332014962);
        sparseIntArray.put(69, 332019364);
        sparseIntArray.put(70, 332015179);
        sparseIntArray.put(71, 332018074);
        sparseIntArray.put(72, 332011589);
        sparseIntArray.put(73, 332019183);
        sparseIntArray.put(74, 332021660);
        sparseIntArray.put(76, 332009244);
        sparseIntArray.put(77, 332016878);
        sparseIntArray.put(78, 332015018);
        sparseIntArray.put(79, 332020282);
        sparseIntArray.put(80, 332019725);
        sparseIntArray.put(81, 332015112);
        sparseIntArray.put(82, 332012435);
        sparseIntArray.put(83, 332009358);
        sparseIntArray.put(84, 332012872);
        sparseIntArray.put(85, 332009826);
        sparseIntArray.put(86, 332008142);
        sparseIntArray.put(87, 332011297);
        sparseIntArray.put(88, 332014830);
        sparseIntArray.put(89, 332013592);
        sparseIntArray.put(90, 332017224);
        sparseIntArray.put(91, 332006564);
        sparseIntArray.put(92, 332019391);
        sparseIntArray.put(93, 332009589);
        sparseIntArray.put(94, 332014470);
        sparseIntArray.put(95, 332016044);
        sparseIntArray.put(96, 332020961);
        sparseIntArray.put(97, 332008242);
        sparseIntArray.put(99, 332006787);
        sparseIntArray.put(100, 332020554);
        sparseIntArray.put(101, 332021168);
        sparseIntArray.put(103, 332011405);
        sparseIntArray.put(104, 332017168);
        sparseIntArray.put(105, 332015827);
        sparseIntArray.put(103, 332011405);
        sparseIntArray.put(109, 332014714);
        sparseIntArray.put(110, 332007106);
        sparseIntArray.put(111, 332009491);
        sparseIntArray.put(112, 332016212);
        sparseIntArray.put(113, 332020310);
        sparseIntArray.put(106, 332018194);
        sparseIntArray.put(115, 332021571);
        sparseIntArray.put(116, 332015091);
        sparseIntArray.put(118, 332014511);
        sparseIntArray.put(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, 332016378);
        sparseIntArray.put(121, 332016073);
        sparseIntArray.put(126, 332012463);
        sparseIntArray.put(125, 332020409);
    }

    public static final long A00(C55312gW c55312gW, Trigger trigger) {
        return c55312gW.A00.get(A02.get(trigger.ordinal()));
    }

    @Override // X.InterfaceC55322gX
    public final void AW3() {
        A01(new C206969Eb(this, 43));
        this.A00.clear();
    }

    @Override // X.InterfaceC55322gX
    public final void AW4(C4NL c4nl, String str, String str2) {
        for (Trigger trigger : c4nl.CB6()) {
            SparseIntArray sparseIntArray = A02;
            int ordinal = trigger.ordinal();
            if (sparseIntArray.get(ordinal) != 0 && A00(this, trigger) != 0) {
                UserFlowLogger userFlowLogger = this.A01;
                userFlowLogger.flowAnnotate(A00(this, trigger), "resolution", str2);
                userFlowLogger.flowEndCancel(A00(this, trigger), CancelReason.LOGIC_CONSTRAINT);
                this.A00.delete(sparseIntArray.get(ordinal));
            }
        }
    }

    @Override // X.InterfaceC55322gX
    public final void AW6(String str) {
        A01(new C207409Ft("fetch_callback_error", this, 6));
        this.A00.clear();
    }

    @Override // X.InterfaceC55322gX
    public final void AW8(C4NL c4nl, String str, String str2) {
        C14360o3.A0B(c4nl, 0);
        for (Trigger trigger : c4nl.CB6()) {
            SparseIntArray sparseIntArray = A02;
            int ordinal = trigger.ordinal();
            if (sparseIntArray.get(ordinal) != 0 && A00(this, trigger) != 0) {
                UserFlowLogger userFlowLogger = this.A01;
                userFlowLogger.flowAnnotate(A00(this, trigger), "resolution", "success");
                userFlowLogger.flowEndSuccess(A00(this, trigger));
                this.A00.delete(sparseIntArray.get(ordinal));
            }
        }
    }
}
