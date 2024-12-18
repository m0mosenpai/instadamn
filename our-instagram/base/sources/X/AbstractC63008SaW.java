package X;

import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SaW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63008SaW {
    public final SKL A00;

    public static final Map A00(SO2 so2) {
        C14360o3.A0B(so2, 0);
        return AbstractC06930Yk.A06(AbstractC166987dD.A1L("has_accepted_consent", Boolean.valueOf(so2.A00)), AbstractC166987dD.A1L("is_contact_opt_in", Boolean.valueOf(so2.A01)), AbstractC166987dD.A1L("is_payment_opt_in", Boolean.valueOf(so2.A02)), AbstractC166987dD.A1L("with_ads_disclosure", Boolean.valueOf(so2.A04)), AbstractC166987dD.A1L("has_shown_fbpay_occp_disclosure", Boolean.valueOf(!so2.A03)));
    }

    public final void A04() {
        InterfaceC65569Tn2 A01 = A01();
        SKL skl = this.A00;
        A01.E5D(skl.A00(), VRA.A00(skl.A00, false), new C64467TFd(), false);
    }

    public final InterfaceC65569Tn2 A01() {
        if (this instanceof QE1) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            BitSet bitSet = new BitSet(8);
            C16920sk A0E = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E, 0);
            A1I.put("logging_metadata", A0E);
            bitSet.set(4);
            AbstractC58322PtE.A1O("is_reoptin", false, bitSet, A1I);
            AbstractC58322PtE.A1N("has_accepted_consent", false, bitSet, A1I);
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 0);
            A1I.put("contacts", c16930sl);
            bitSet.set(1);
            A1I.put("cards", c16930sl);
            bitSet.set(0);
            C65036TcR c65036TcR = C65036TcR.A00;
            C14360o3.A0B(c65036TcR, 0);
            A1I.put("on_accept_payment", AbstractC58322PtE.A0e(c65036TcR, 33));
            bitSet.set(5);
            C64975Tb0 c64975Tb0 = C64975Tb0.A00;
            C14360o3.A0B(c64975Tb0, 0);
            A1I.put("on_decline", AbstractC58322PtE.A0e(c64975Tb0, 34));
            bitSet.set(6);
            C65111Tdm c65111Tdm = C65111Tdm.A00;
            C14360o3.A0B(c65111Tdm, 0);
            AbstractC58323PtF.A1M(c65111Tdm, A1I, 35);
            bitSet.set(7);
            AbstractC58323PtF.A1N(C65118Tdt.A00, A1I, 36);
            if (bitSet.nextClearBit(0) >= 8) {
                return new C63718SsY(AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E());
            }
            throw AbstractC31172DnG.A0v();
        }
        if (this instanceof QE0) {
            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
            BitSet bitSet2 = new BitSet(9);
            C16920sk A0E2 = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E2, 0);
            A1I2.put("settings", A0E2);
            bitSet2.set(8);
            C16920sk A0E3 = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E3, 0);
            AbstractC58322PtE.A1O("logging_metadata", A0E3, bitSet2, A1I2);
            A1I2.put("payment_save_action_type", "");
            bitSet2.set(7);
            A1I2.put("contact_info", null);
            C16920sk A0E4 = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E4, 0);
            A1I2.put("card_info", A0E4);
            bitSet2.set(0);
            C16920sk A0E5 = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E5, 0);
            A1I2.put("device_secrets", A0E5);
            bitSet2.set(1);
            AbstractC58322PtE.A1N("hybrid_prompt_enabled", true, bitSet2, A1I2);
            C65079TdC c65079TdC = C65079TdC.A00;
            C14360o3.A0B(c65079TdC, 0);
            A1I2.put("on_save_contact", AbstractC58322PtE.A0e(c65079TdC, 31));
            bitSet2.set(5);
            C65116Tdr c65116Tdr = C65116Tdr.A00;
            C14360o3.A0B(c65116Tdr, 0);
            A1I2.put("on_save_payment_completed", AbstractC58322PtE.A0e(c65116Tdr, 32));
            bitSet2.set(6);
            AbstractC58323PtF.A1M(C65110Tdl.A00, A1I2, 29);
            AbstractC58323PtF.A1N(C65117Tds.A00, A1I2, 30);
            C65035TcQ c65035TcQ = C65035TcQ.A00;
            C14360o3.A0B(c65035TcQ, 0);
            A1I2.put("on_decline", AbstractC58322PtE.A0e(c65035TcQ, 28));
            bitSet2.set(4);
            if (bitSet2.nextClearBit(0) >= 9) {
                return new C63717SsX(AbstractC06930Yk.A0B(A1I2), AbstractC06930Yk.A0E());
            }
            throw AbstractC31172DnG.A0v();
        }
        boolean z = this instanceof QE3;
        LinkedHashMap A1I3 = AbstractC166987dD.A1I();
        if (z) {
            BitSet bitSet3 = new BitSet(4);
            C16920sk A0E6 = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E6, 0);
            AbstractC58322PtE.A1O("settings", A0E6, bitSet3, A1I3);
            C16920sk A0E7 = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E7, 0);
            A1I3.put("contact", A0E7);
            bitSet3.set(0);
            A1I3.put("logging_metadata", AbstractC06930Yk.A0E());
            AbstractC58323PtF.A1M(C65109Tdk.A00, A1I3, 26);
            AbstractC58323PtF.A1N(C65115Tdq.A00, A1I3, 27);
            C65078TdB c65078TdB = C65078TdB.A00;
            C14360o3.A0B(c65078TdB, 0);
            A1I3.put("on_autofill_callback", AbstractC58322PtE.A0e(c65078TdB, 24));
            bitSet3.set(1);
            C65034TcP c65034TcP = C65034TcP.A00;
            C14360o3.A0B(c65034TcP, 0);
            AbstractC58322PtE.A1N("on_decline_callback", AbstractC58322PtE.A0e(c65034TcP, 25), bitSet3, A1I3);
            if (bitSet3.nextClearBit(0) >= 4) {
                return new C63716SsW(AbstractC06930Yk.A0B(A1I3), AbstractC06930Yk.A0E(), SandboxRepository.CACHE_TTL);
            }
            throw AbstractC31172DnG.A0v();
        }
        BitSet bitSet4 = new BitSet(5);
        C16920sk A0E8 = AbstractC06930Yk.A0E();
        C14360o3.A0B(A0E8, 0);
        A1I3.put("settings", A0E8);
        bitSet4.set(4);
        C16920sk A0E9 = AbstractC06930Yk.A0E();
        C14360o3.A0B(A0E9, 0);
        A1I3.put("contact", A0E9);
        bitSet4.set(0);
        C16920sk A0E10 = AbstractC06930Yk.A0E();
        C14360o3.A0B(A0E10, 0);
        A1I3.put("logging_metadata", A0E10);
        bitSet4.set(1);
        AbstractC58323PtF.A1M(C65108Tdj.A00, A1I3, 21);
        AbstractC58323PtF.A1N(C65114Tdp.A00, A1I3, 22);
        C65077TdA c65077TdA = C65077TdA.A00;
        C14360o3.A0B(c65077TdA, 0);
        AbstractC58322PtE.A1O("on_save_callback", AbstractC58322PtE.A0e(c65077TdA, 23), bitSet4, A1I3);
        C64974Taz c64974Taz = C64974Taz.A00;
        C14360o3.A0B(c64974Taz, 0);
        AbstractC58322PtE.A1N("on_decline_callback", AbstractC58322PtE.A0e(c64974Taz, 20), bitSet4, A1I3);
        if (bitSet4.nextClearBit(0) >= 5) {
            return new C63715SsV(AbstractC06930Yk.A0B(A1I3), AbstractC06930Yk.A0E(), SandboxRepository.CACHE_TTL);
        }
        throw AbstractC31172DnG.A0v();
    }

    public AbstractC63008SaW(SKL skl) {
        this.A00 = skl;
    }

    public final java.util.Set A02() {
        InterfaceC65569Tn2 A01 = A01();
        SKL skl = this.A00;
        return A01.Ajb(skl.A00(), VRA.A00(skl.A00, false));
    }

    public final void A03() {
        String str;
        InterfaceC19610xo A0e;
        String str2;
        InterfaceC65569Tn2 A01 = A01();
        SKL skl = this.A00;
        A01.COy(skl.A00(), VRA.A00(skl.A00, false));
        if (this instanceof QE1) {
            str = null;
            A0e = AbstractC31176DnK.A0e(((QE1) this).A00.A03.A00);
            str2 = "autofill_bloks_payment_usage_cache_key";
        } else if (this instanceof QE0) {
            str = null;
            A0e = AbstractC31176DnK.A0e(((QE0) this).A00.A03.A00);
            str2 = "autofill_bloks_payment_save_cache_key";
        } else if (this instanceof QE3) {
            str = null;
            A0e = AbstractC31176DnK.A0e(((QE3) this).A00.A03.A00);
            str2 = "autofill_bloks_contact_usage_cache_key";
        } else {
            str = null;
            A0e = AbstractC31176DnK.A0e(((QE2) this).A00.A03.A00);
            str2 = "autofill_bloks_contact_save_cache_key";
        }
        A0e.E7K(str2, str);
        A0e.apply();
    }
}
