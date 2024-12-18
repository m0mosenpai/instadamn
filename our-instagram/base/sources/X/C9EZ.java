package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.systrace.Systrace;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9EZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EZ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EZ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C7MW c7mw = (C7MW) this.A01;
                return new C7TF(c7mw.A03, c7mw.A06, c7mw.A07, c7mw.A33);
            case 1:
                return new C7TE(((C7MW) this.A01).A04);
            case 2:
                return new KHX(((C7MW) this.A01).A08);
            case 3:
                return new C161817Mq((C7IV) this.A01);
            case 4:
                C7MW c7mw2 = (C7MW) this.A01;
                return new C76Z(c7mw2.A04, c7mw2.A07, c7mw2.A08, c7mw2.A00);
            case 5:
                C7MW c7mw3 = (C7MW) this.A01;
                return new C7N8(c7mw3.A06, c7mw3.A07, c7mw3.A08);
            case 6:
                C7MW c7mw4 = (C7MW) this.A01;
                return new C75Y(c7mw4.A07, c7mw4.A08, c7mw4.A09, C158747Ak.class);
            case 7:
                C7MW c7mw5 = (C7MW) this.A01;
                return new C75Y(c7mw5.A07, c7mw5.A08, c7mw5.A09, KSE.class);
            case 8:
                C7MW c7mw6 = (C7MW) this.A01;
                return A0Z.A00(c7mw6.A06, c7mw6.A07, c7mw6.A08, c7mw6.A09);
            case 9:
                return ((C7RV) ((InterfaceC09390do) this.A01).getValue()).A01();
            case 10:
                return new C7RQ(((C7MW) this.A01).A08);
            case 11:
                return new C7RI(((C7MW) this.A01).A08);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C7MW c7mw7 = (C7MW) this.A01;
                C7ZX c7zx = c7mw7.A08;
                return new C7RT(c7mw7.A06, c7mw7.A07, c7zx);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C7MW c7mw8 = (C7MW) this.A01;
                return new C7RE(c7mw8.A06, c7mw8.A08);
            case 14:
                return ((C7RV) ((InterfaceC09390do) this.A01).getValue()).A02();
            case Process.SIGTERM /* 15 */:
                C7MW c7mw9 = (C7MW) this.A01;
                return new C79Y(c7mw9.A04, c7mw9.A08);
            case 16:
                return ((C7RV) ((InterfaceC09390do) this.A01).getValue()).A00();
            case 17:
                return new C7RD(((C7MW) this.A01).A07);
            case 18:
                return new C7RU(((C7MW) this.A01).A08);
            case Process.SIGSTOP /* 19 */:
                C7MW c7mw10 = (C7MW) this.A01;
                return new C7RP(c7mw10.A07, c7mw10.A08);
            case 20:
                C7MW c7mw11 = (C7MW) this.A01;
                return new C7RG(c7mw11.A07, c7mw11.A08);
            case 21:
                return new C7RH(((C7MW) this.A01).A08);
            case 22:
                C7MW c7mw12 = (C7MW) this.A01;
                return new C7RF(c7mw12.A03, c7mw12.A07, c7mw12.A08);
            case 23:
                C7MW c7mw13 = (C7MW) this.A01;
                return C49127Lo6.A00(c7mw13.A06, c7mw13.A08, c7mw13.A09);
            case 24:
                C7MW c7mw14 = (C7MW) this.A01;
                return new C7RL(c7mw14.A07, c7mw14.A08);
            case 25:
                return new C7RR(((C7MW) this.A01).A08);
            case 26:
                C7MW c7mw15 = (C7MW) this.A01;
                AnonymousClass988 anonymousClass988 = c7mw15.A09;
                return new C7RA(c7mw15.A06, c7mw15.A07, c7mw15.A08, anonymousClass988);
            case 27:
                C7MW c7mw16 = (C7MW) this.A01;
                return new C7RC(c7mw16.A06, c7mw16.A08);
            case 28:
                return C7MW.A00((C7MW) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return C7MW.A01((C7MW) this.A01);
            case 30:
                C7MW c7mw17 = (C7MW) this.A01;
                return new C49112Lnp(c7mw17.A06, c7mw17.A08, c7mw17.A09);
            case 31:
                return new C7RK(((C7MW) this.A01).A08);
            case 32:
                C7MW c7mw18 = (C7MW) this.A01;
                return new C49107Lnk(c7mw18.A06, c7mw18.A07, c7mw18.A08, c7mw18.A09);
            case 33:
                C7MW c7mw19 = (C7MW) this.A01;
                return new C7R9(c7mw19.A06, c7mw19.A07, c7mw19.A08);
            case 34:
                C7MW c7mw20 = (C7MW) this.A01;
                return new C7RJ(c7mw20.A03, c7mw20.A07, c7mw20.A08);
            case 35:
                C7MW c7mw21 = (C7MW) this.A01;
                return new C7RM(c7mw21.A03, c7mw21.A07, c7mw21.A08);
            case 36:
                C7MW c7mw22 = (C7MW) this.A01;
                Context context = c7mw22.A04;
                C7ZX c7zx2 = c7mw22.A08;
                UserSession userSession = c7mw22.A07;
                InterfaceC11380iw interfaceC11380iw = c7mw22.A06;
                C14360o3.A0B(interfaceC11380iw, 3);
                return new C49130Lo9(context, interfaceC11380iw, userSession, c7zx2);
            case 37:
                C7MW c7mw23 = (C7MW) this.A01;
                UserSession userSession2 = c7mw23.A07;
                C7ZX c7zx3 = c7mw23.A08;
                AnonymousClass988 anonymousClass9882 = c7mw23.A09;
                InterfaceC11380iw interfaceC11380iw2 = c7mw23.A06;
                C14360o3.A0B(interfaceC11380iw2, 3);
                return new C49116Lnt(interfaceC11380iw2, userSession2, c7zx3, AbstractC167027dH.A0J(c7zx3, anonymousClass9882));
            case 38:
                C7MW c7mw24 = (C7MW) this.A01;
                return new C7RS(c7mw24.A07, c7mw24.A08);
            case 39:
                C7MW c7mw25 = (C7MW) this.A01;
                return C158907Bc.A00(c7mw25.A08, c7mw25.A09);
            case 40:
                C7MW c7mw26 = (C7MW) this.A01;
                return new C7RN(c7mw26.A07, c7mw26.A08);
            case Seq.NULL_REFNUM /* 41 */:
                List A0R = AbstractC001900j.A0R(C18U.A04(C06090Tz.A05, ((C160767Ik) this.A01).A01, 36882048107020720L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A0R, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    List A0R2 = AbstractC001900j.A0R((String) it.next(), new String[]{":"}, 0);
                    linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) A0R2.get(0))), Integer.valueOf(Integer.parseInt((String) A0R2.get(1))));
                }
                return linkedHashMap;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new AnonymousClass795(((C160667Ia) this.A01).A0A);
            case 43:
                C160667Ia c160667Ia = (C160667Ia) this.A01;
                if (Systrace.A0E(1L)) {
                    C0fO.A01("ViewTypeMapper.map", 1593770994);
                }
                try {
                    C09530e4[] c09530e4Arr = new C09530e4[176];
                    System.arraycopy(new C09530e4[]{new C09530e4(15, new C09530e4(new JVN(c160667Ia, 46), C160667Ia.A02(c160667Ia).A1G)), new C09530e4(23, new C09530e4(new C50360MLm(c160667Ia, 7), C160667Ia.A02(c160667Ia).A1Y)), new C09530e4(70, new C09530e4(new C50360MLm(c160667Ia, 18), C160667Ia.A02(c160667Ia).A0Z)), new C09530e4(71, new C09530e4(new C50360MLm(c160667Ia, 29), C160667Ia.A02(c160667Ia).A0g)), new C09530e4(72, new C09530e4(new C50360MLm(c160667Ia, 40), C160667Ia.A02(c160667Ia).A0c)), new C09530e4(74, new C09530e4(new C50357MLj(c160667Ia, 1), C160667Ia.A02(c160667Ia).A0a)), new C09530e4(112, new C09530e4(new C50357MLj(c160667Ia, 12), C160667Ia.A02(c160667Ia).A0e)), new C09530e4(134, new C09530e4(new C50357MLj(c160667Ia, 23), C160667Ia.A02(c160667Ia).A0h)), new C09530e4(138, new C09530e4(new C50357MLj(c160667Ia, 34), C160667Ia.A02(c160667Ia).A0d)), new C09530e4(150, new C09530e4(new C50354MLg(c160667Ia, 19), C160667Ia.A02(c160667Ia).A0b)), new C09530e4(45, new C09530e4(new C50354MLg(c160667Ia, 30), C160667Ia.A02(c160667Ia).A26)), new C09530e4(Integer.valueOf(AbstractC62862SUj.MAX_FACTORIAL), new C09530e4(new C50354MLg(c160667Ia, 41), C160667Ia.A02(c160667Ia).A0Y)), new C09530e4(46, new C09530e4(new JVN(c160667Ia, 2), C160667Ia.A02(c160667Ia).A1h)), new C09530e4(116, new C09530e4(new JVN(c160667Ia, 13), C160667Ia.A02(c160667Ia).A0N)), new C09530e4(21, new C09530e4(new JVN(c160667Ia, 24), C160667Ia.A02(c160667Ia).A1I)), new C09530e4(13, new C09530e4(new JVN(c160667Ia, 35), C160667Ia.A02(c160667Ia).A1E)), new C09530e4(14, new C09530e4(new JVN(c160667Ia, 43), C160667Ia.A02(c160667Ia).A1F)), new C09530e4(78, new C09530e4(new JVN(c160667Ia, 44), C160667Ia.A02(c160667Ia).A1e)), new C09530e4(43, new C09530e4(new JVN(c160667Ia, 45), C160667Ia.A02(c160667Ia).A1A)), new C09530e4(115, new C09530e4(new JVN(c160667Ia, 47), C160667Ia.A02(c160667Ia).A1q)), new C09530e4(44, new C09530e4(new JVN(c160667Ia, 48), C160667Ia.A02(c160667Ia).A1f)), new C09530e4(27, new C09530e4(new JVN(c160667Ia, 49), C160667Ia.A02(c160667Ia).A1D)), new C09530e4(26, new C09530e4(new C50360MLm(c160667Ia, 0), C160667Ia.A02(c160667Ia).A1g)), new C09530e4(17, new C09530e4(new C50360MLm(c160667Ia, 1), C160667Ia.A02(c160667Ia).A1Q)), new C09530e4(20, new C09530e4(new C50360MLm(c160667Ia, 2), C160667Ia.A02(c160667Ia).A1R)), new C09530e4(30, new C09530e4(new C50360MLm(c160667Ia, 3), C160667Ia.A02(c160667Ia).A1j)), new C09530e4(7, new C09530e4(new C50360MLm(c160667Ia, 4), C160667Ia.A02(c160667Ia).A0w))}, 0, c09530e4Arr, 0, 27);
                    System.arraycopy(new C09530e4[]{new C09530e4(3, new C09530e4(new C50360MLm(c160667Ia, 5), C160667Ia.A02(c160667Ia).A0C)), new C09530e4(181, new C09530e4(new C50360MLm(c160667Ia, 6), C160667Ia.A02(c160667Ia).A24)), new C09530e4(182, new C09530e4(new C50360MLm(c160667Ia, 8), C160667Ia.A02(c160667Ia).A2Q)), new C09530e4(25, new C09530e4(new C50360MLm(c160667Ia, 9), C160667Ia.A02(c160667Ia).A1b)), new C09530e4(81, new C09530e4(new C50360MLm(c160667Ia, 10), C160667Ia.A02(c160667Ia).A1c)), new C09530e4(62, new C09530e4(new C50360MLm(c160667Ia, 11), C160667Ia.A02(c160667Ia).A2z)), new C09530e4(11, new C09530e4(new C50360MLm(c160667Ia, 12), C160667Ia.A02(c160667Ia).A1B)), new C09530e4(12, new C09530e4(new C50360MLm(c160667Ia, 13), C160667Ia.A02(c160667Ia).A1C)), new C09530e4(1, new C09530e4(new C50360MLm(c160667Ia, 14), C160667Ia.A02(c160667Ia).A0B)), new C09530e4(162, new C09530e4(new C50360MLm(c160667Ia, 15), C160667Ia.A02(c160667Ia).A16)), new C09530e4(58, new C09530e4(new C50360MLm(c160667Ia, 16), C160667Ia.A02(c160667Ia).A2Y)), new C09530e4(29, new C09530e4(new C50360MLm(c160667Ia, 17), C160667Ia.A02(c160667Ia).A1i)), new C09530e4(56, new C09530e4(new C50360MLm(c160667Ia, 19), C160667Ia.A02(c160667Ia).A2V)), new C09530e4(57, new C09530e4(new C50360MLm(c160667Ia, 20), C160667Ia.A02(c160667Ia).A2X)), new C09530e4(32, new C09530e4(new C50360MLm(c160667Ia, 21), C160667Ia.A02(c160667Ia).A1w)), new C09530e4(2, new C09530e4(new C50360MLm(c160667Ia, 22), C160667Ia.A02(c160667Ia).A02)), new C09530e4(18, new C09530e4(new C50360MLm(c160667Ia, 23), C160667Ia.A02(c160667Ia).A1u)), new C09530e4(19, new C09530e4(new C50360MLm(c160667Ia, 24), C160667Ia.A02(c160667Ia).A1v)), new C09530e4(61, new C09530e4(new C50360MLm(c160667Ia, 25), C160667Ia.A02(c160667Ia).A2q)), new C09530e4(31, new C09530e4(new C50360MLm(c160667Ia, 26), C160667Ia.A02(c160667Ia).A1r)), new C09530e4(54, new C09530e4(new C50360MLm(c160667Ia, 27), C160667Ia.A02(c160667Ia).A2N)), new C09530e4(8, new C09530e4(new C50360MLm(c160667Ia, 28), C160667Ia.A02(c160667Ia).A1t)), new C09530e4(4, new C09530e4(new C50360MLm(c160667Ia, 30), C160667Ia.A02(c160667Ia).A1s)), new C09530e4(102, new C09530e4(new C50360MLm(c160667Ia, 31), C160667Ia.A02(c160667Ia).A0I)), new C09530e4(104, new C09530e4(new C50360MLm(c160667Ia, 32), C160667Ia.A02(c160667Ia).A0F)), new C09530e4(141, new C09530e4(new C50360MLm(c160667Ia, 33), C160667Ia.A02(c160667Ia).A0L)), new C09530e4(142, new C09530e4(new C50360MLm(c160667Ia, 34), C160667Ia.A02(c160667Ia).A0J))}, 0, c09530e4Arr, 27, 27);
                    System.arraycopy(new C09530e4[]{new C09530e4(143, new C09530e4(new C50360MLm(c160667Ia, 35), C160667Ia.A02(c160667Ia).A0K)), new C09530e4(147, new C09530e4(new C50360MLm(c160667Ia, 36), C160667Ia.A02(c160667Ia).A0E)), new C09530e4(148, new C09530e4(new C50360MLm(c160667Ia, 37), C160667Ia.A02(c160667Ia).A0D)), new C09530e4(192, new C09530e4(new C50360MLm(c160667Ia, 38), C160667Ia.A02(c160667Ia).A0H)), new C09530e4(103, new C09530e4(new C50360MLm(c160667Ia, 39), C160667Ia.A02(c160667Ia).A11)), new C09530e4(106, new C09530e4(new C50360MLm(c160667Ia, 41), C160667Ia.A02(c160667Ia).A0z)), new C09530e4(108, new C09530e4(new C50360MLm(c160667Ia, 42), C160667Ia.A02(c160667Ia).A14)), new C09530e4(109, new C09530e4(new C50360MLm(c160667Ia, 43), C160667Ia.A02(c160667Ia).A12)), new C09530e4(110, new C09530e4(new C50360MLm(c160667Ia, 44), C160667Ia.A02(c160667Ia).A13)), new C09530e4(144, new C09530e4(new C50360MLm(c160667Ia, 45), C160667Ia.A02(c160667Ia).A0y)), new C09530e4(145, new C09530e4(new C50360MLm(c160667Ia, 46), C160667Ia.A02(c160667Ia).A0x)), new C09530e4(193, new C09530e4(new C50360MLm(c160667Ia, 47), C160667Ia.A02(c160667Ia).A10)), new C09530e4(22, new C09530e4(new C50360MLm(c160667Ia, 48), C160667Ia.A02(c160667Ia).A1U)), new C09530e4(5, new C09530e4(new C50360MLm(c160667Ia, 49), C160667Ia.A02(c160667Ia).A0M)), new C09530e4(39, new C09530e4(new C50357MLj(c160667Ia, 0), C160667Ia.A02(c160667Ia).A23)), new C09530e4(50, new C09530e4(new C50357MLj(c160667Ia, 2), C160667Ia.A02(c160667Ia).A2R)), new C09530e4(47, new C09530e4(new C50357MLj(c160667Ia, 3), C160667Ia.A02(c160667Ia).A2E)), new C09530e4(89, new C09530e4(new C50357MLj(c160667Ia, 4), C160667Ia.A02(c160667Ia).A2B)), new C09530e4(90, new C09530e4(new C50357MLj(c160667Ia, 5), C160667Ia.A02(c160667Ia).A27)), new C09530e4(49, new C09530e4(new C50357MLj(c160667Ia, 6), C160667Ia.A02(c160667Ia).A2L)), new C09530e4(85, new C09530e4(new C50357MLj(c160667Ia, 7), C160667Ia.A02(c160667Ia).A0i)), new C09530e4(48, new C09530e4(new C50357MLj(c160667Ia, 8), C160667Ia.A02(c160667Ia).A2G)), new C09530e4(77, new C09530e4(new C50357MLj(c160667Ia, 9), C160667Ia.A02(c160667Ia).A2C)), new C09530e4(83, new C09530e4(new C50357MLj(c160667Ia, 10), C160667Ia.A02(c160667Ia).A19)), new C09530e4(84, new C09530e4(new C50357MLj(c160667Ia, 11), C160667Ia.A02(c160667Ia).A2A)), new C09530e4(190, new C09530e4(new C50357MLj(c160667Ia, 13), C160667Ia.A02(c160667Ia).A2J)), new C09530e4(94, new C09530e4(new C50357MLj(c160667Ia, 14), C160667Ia.A02(c160667Ia).A2I))}, 0, c09530e4Arr, 54, 27);
                    System.arraycopy(new C09530e4[]{new C09530e4(95, new C09530e4(new C50357MLj(c160667Ia, 15), C160667Ia.A02(c160667Ia).A29)), new C09530e4(189, new C09530e4(new C50357MLj(c160667Ia, 16), C160667Ia.A02(c160667Ia).A28)), new C09530e4(82, new C09530e4(new C50357MLj(c160667Ia, 17), C160667Ia.A02(c160667Ia).A1n)), new C09530e4(111, new C09530e4(new C50357MLj(c160667Ia, 18), C160667Ia.A02(c160667Ia).A2O)), new C09530e4(107, new C09530e4(new C50357MLj(c160667Ia, 19), C160667Ia.A02(c160667Ia).A2P)), new C09530e4(97, new C09530e4(new C50357MLj(c160667Ia, 20), C160667Ia.A02(c160667Ia).A0t)), new C09530e4(171, new C09530e4(new C50357MLj(c160667Ia, 21), C160667Ia.A02(c160667Ia).A1V)), new C09530e4(180, new C09530e4(new C50357MLj(c160667Ia, 22), C160667Ia.A02(c160667Ia).A0j)), new C09530e4(183, new C09530e4(new C50357MLj(c160667Ia, 24), C160667Ia.A02(c160667Ia).A1H)), new C09530e4(172, new C09530e4(new C50357MLj(c160667Ia, 25), C160667Ia.A02(c160667Ia).A2K)), new C09530e4(174, new C09530e4(new C50357MLj(c160667Ia, 26), C160667Ia.A02(c160667Ia).A31)), new C09530e4(175, new C09530e4(new C50357MLj(c160667Ia, 27), C160667Ia.A02(c160667Ia).A2u)), new C09530e4(176, new C09530e4(new C50357MLj(c160667Ia, 28), C160667Ia.A02(c160667Ia).A2H)), new C09530e4(177, new C09530e4(new C50357MLj(c160667Ia, 29), C160667Ia.A02(c160667Ia).A0G)), new C09530e4(173, new C09530e4(new C50357MLj(c160667Ia, 30), C160667Ia.A02(c160667Ia).A2d)), new C09530e4(160, new C09530e4(new C50357MLj(c160667Ia, 31), C160667Ia.A02(c160667Ia).A0s)), new C09530e4(113, new C09530e4(new C50357MLj(c160667Ia, 32), C160667Ia.A02(c160667Ia).A0r)), new C09530e4(128, new C09530e4(new C50357MLj(c160667Ia, 33), C160667Ia.A02(c160667Ia).A0u)), new C09530e4(122, new C09530e4(new C50354MLg(c160667Ia, 9), C160667Ia.A02(c160667Ia).A0v)), new C09530e4(129, new C09530e4(new C50354MLg(c160667Ia, 10), C160667Ia.A02(c160667Ia).A0q)), new C09530e4(130, new C09530e4(new C50354MLg(c160667Ia, 11), C160667Ia.A02(c160667Ia).A0p)), new C09530e4(146, new C09530e4(new C50354MLg(c160667Ia, 12), C160667Ia.A02(c160667Ia).A0n)), new C09530e4(87, new C09530e4(new C50354MLg(c160667Ia, 13), C160667Ia.A02(c160667Ia).A2M)), new C09530e4(53, new C09530e4(new C50354MLg(c160667Ia, 14), C160667Ia.A02(c160667Ia).A2U)), new C09530e4(59, new C09530e4(new C50354MLg(c160667Ia, 15), C160667Ia.A02(c160667Ia).A2Z)), new C09530e4(51, new C09530e4(new C50354MLg(c160667Ia, 16), C160667Ia.A02(c160667Ia).A2S)), new C09530e4(37, new C09530e4(new C50354MLg(c160667Ia, 17), C160667Ia.A02(c160667Ia).A21))}, 0, c09530e4Arr, 81, 27);
                    System.arraycopy(new C09530e4[]{new C09530e4(35, new C09530e4(new C50354MLg(c160667Ia, 18), C160667Ia.A02(c160667Ia).A1z)), new C09530e4(34, new C09530e4(new C50354MLg(c160667Ia, 20), C160667Ia.A02(c160667Ia).A1y)), new C09530e4(68, new C09530e4(new C50354MLg(c160667Ia, 21), C160667Ia.A02(c160667Ia).A20)), new C09530e4(60, new C09530e4(new C50354MLg(c160667Ia, 22), C160667Ia.A02(c160667Ia).A2i)), new C09530e4(52, new C09530e4(new C50354MLg(c160667Ia, 23), C160667Ia.A02(c160667Ia).A2T)), new C09530e4(36, new C09530e4(new C50354MLg(c160667Ia, 24), C160667Ia.A02(c160667Ia).A0X)), new C09530e4(157, new C09530e4(new C50354MLg(c160667Ia, 25), C160667Ia.A02(c160667Ia).A1l)), new C09530e4(24, new C09530e4(new C50354MLg(c160667Ia, 26), C160667Ia.A02(c160667Ia).A15)), new C09530e4(6, new C09530e4(new C50354MLg(c160667Ia, 27), C160667Ia.A02(c160667Ia).A0P)), new C09530e4(65, new C09530e4(new C50354MLg(c160667Ia, 28), C160667Ia.A02(c160667Ia).A0l)), new C09530e4(184, new C09530e4(new C50354MLg(c160667Ia, 29), C160667Ia.A02(c160667Ia).A0o)), new C09530e4(75, new C09530e4(new C50354MLg(c160667Ia, 31), C160667Ia.A02(c160667Ia).A18)), new C09530e4(38, new C09530e4(new C50354MLg(c160667Ia, 32), C160667Ia.A02(c160667Ia).A0m)), new C09530e4(66, new C09530e4(new C50354MLg(c160667Ia, 33), C160667Ia.A02(c160667Ia).A0Q)), new C09530e4(91, new C09530e4(new C50354MLg(c160667Ia, 34), C160667Ia.A02(c160667Ia).A1k)), new C09530e4(114, new C09530e4(new C50354MLg(c160667Ia, 35), C160667Ia.A02(c160667Ia).A0A)), new C09530e4(55, new C09530e4(new C50354MLg(c160667Ia, 36), C160667Ia.A02(c160667Ia).A01)), new C09530e4(158, new C09530e4(new C50354MLg(c160667Ia, 37), C160667Ia.A02(c160667Ia).A0T)), new C09530e4(67, new C09530e4(new C50354MLg(c160667Ia, 38), C160667Ia.A02(c160667Ia).A1a)), new C09530e4(69, new C09530e4(new C50354MLg(c160667Ia, 39), C160667Ia.A02(c160667Ia).A0S)), new C09530e4(96, new C09530e4(new C50354MLg(c160667Ia, 40), C160667Ia.A02(c160667Ia).A0f)), new C09530e4(92, new C09530e4(new C50354MLg(c160667Ia, 42), C160667Ia.A02(c160667Ia).A1S)), new C09530e4(105, new C09530e4(new C50354MLg(c160667Ia, 43), C160667Ia.A02(c160667Ia).A1x)), new C09530e4(93, new C09530e4(new C50354MLg(c160667Ia, 44), C160667Ia.A02(c160667Ia).A0V)), new C09530e4(188, new C09530e4(new C50354MLg(c160667Ia, 45), C160667Ia.A02(c160667Ia).A0U)), new C09530e4(98, new C09530e4(new C50354MLg(c160667Ia, 46), C160667Ia.A02(c160667Ia).A22)), new C09530e4(99, new C09530e4(new C50354MLg(c160667Ia, 47), C160667Ia.A02(c160667Ia).A32))}, 0, c09530e4Arr, 108, 27);
                    System.arraycopy(new C09530e4[]{new C09530e4(100, new C09530e4(new C50354MLg(c160667Ia, 48), C160667Ia.A02(c160667Ia).A30)), new C09530e4(117, new C09530e4(new C50354MLg(c160667Ia, 49), C160667Ia.A02(c160667Ia).A2v)), new C09530e4(118, new C09530e4(new JVN(c160667Ia, 0), C160667Ia.A02(c160667Ia).A2t)), new C09530e4(139, new C09530e4(new JVN(c160667Ia, 1), C160667Ia.A02(c160667Ia).A2s)), new C09530e4(140, new C09530e4(new JVN(c160667Ia, 3), C160667Ia.A02(c160667Ia).A2r)), new C09530e4(119, new C09530e4(new JVN(c160667Ia, 4), C160667Ia.A02(c160667Ia).A2y)), new C09530e4(Integer.valueOf(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), new C09530e4(new JVN(c160667Ia, 5), C160667Ia.A02(c160667Ia).A2w)), new C09530e4(121, new C09530e4(new JVN(c160667Ia, 6), C160667Ia.A02(c160667Ia).A2x)), new C09530e4(123, new C09530e4(new JVN(c160667Ia, 7), C160667Ia.A02(c160667Ia).A1M)), new C09530e4(161, new C09530e4(new JVN(c160667Ia, 8), C160667Ia.A02(c160667Ia).A2F)), new C09530e4(124, new C09530e4(new JVN(c160667Ia, 9), C160667Ia.A02(c160667Ia).A1L)), new C09530e4(125, new C09530e4(new JVN(c160667Ia, 10), C160667Ia.A02(c160667Ia).A1P)), new C09530e4(126, new C09530e4(new JVN(c160667Ia, 11), C160667Ia.A02(c160667Ia).A1N)), new C09530e4(Integer.valueOf(StringTreeSet.MAX_SYMBOL_COUNT), new C09530e4(new JVN(c160667Ia, 12), C160667Ia.A02(c160667Ia).A1O)), new C09530e4(151, new C09530e4(new JVN(c160667Ia, 14), C160667Ia.A02(c160667Ia).A1K)), new C09530e4(152, new C09530e4(new JVN(c160667Ia, 15), C160667Ia.A02(c160667Ia).A1J)), new C09530e4(131, new C09530e4(new JVN(c160667Ia, 16), C160667Ia.A02(c160667Ia).A2e)), new C09530e4(132, new C09530e4(new JVN(c160667Ia, 17), C160667Ia.A02(c160667Ia).A2c)), new C09530e4(133, new C09530e4(new JVN(c160667Ia, 18), C160667Ia.A02(c160667Ia).A2h)), new C09530e4(153, new C09530e4(new JVN(c160667Ia, 19), C160667Ia.A02(c160667Ia).A2b)), new C09530e4(154, new C09530e4(new JVN(c160667Ia, 20), C160667Ia.A02(c160667Ia).A2a)), new C09530e4(135, new C09530e4(new JVN(c160667Ia, 21), C160667Ia.A02(c160667Ia).A2m)), new C09530e4(136, new C09530e4(new JVN(c160667Ia, 22), C160667Ia.A02(c160667Ia).A2l)), new C09530e4(137, new C09530e4(new JVN(c160667Ia, 23), C160667Ia.A02(c160667Ia).A2p)), new C09530e4(155, new C09530e4(new JVN(c160667Ia, 25), C160667Ia.A02(c160667Ia).A2k)), new C09530e4(156, new C09530e4(new JVN(c160667Ia, 26), C160667Ia.A02(c160667Ia).A2j)), new C09530e4(149, new C09530e4(new JVN(c160667Ia, 27), C160667Ia.A02(c160667Ia).A0W))}, 0, c09530e4Arr, 135, 27);
                    System.arraycopy(new C09530e4[]{new C09530e4(159, new C09530e4(new JVN(c160667Ia, 28), C160667Ia.A02(c160667Ia).A1W)), new C09530e4(166, new C09530e4(new JVN(c160667Ia, 29), C160667Ia.A02(c160667Ia).A2n)), new C09530e4(167, new C09530e4(new JVN(c160667Ia, 30), C160667Ia.A02(c160667Ia).A2o)), new C09530e4(165, new C09530e4(new JVN(c160667Ia, 31), C160667Ia.A02(c160667Ia).A2g)), new C09530e4(164, new C09530e4(new JVN(c160667Ia, 32), C160667Ia.A02(c160667Ia).A2f)), new C09530e4(163, new C09530e4(new JVN(c160667Ia, 33), C160667Ia.A02(c160667Ia).A0O)), new C09530e4(168, new C09530e4(new JVN(c160667Ia, 34), C160667Ia.A02(c160667Ia).A17)), new C09530e4(169, new C09530e4(new JVN(c160667Ia, 36), C160667Ia.A02(c160667Ia).A0k)), new C09530e4(178, new C09530e4(new JVN(c160667Ia, 37), C160667Ia.A02(c160667Ia).A0R)), new C09530e4(179, new C09530e4(new JVN(c160667Ia, 38), C160667Ia.A02(c160667Ia).A2W)), new C09530e4(185, new C09530e4(new JVN(c160667Ia, 39), C160667Ia.A02(c160667Ia).A2D)), new C09530e4(187, new C09530e4(new JVN(c160667Ia, 40), C160667Ia.A02(c160667Ia).A1X)), new C09530e4(186, new C09530e4(new JVN(c160667Ia, 41), C160667Ia.A02(c160667Ia).A1T)), new C09530e4(191, new C09530e4(new JVN(c160667Ia, 42), C160667Ia.A02(c160667Ia).A25))}, 0, c09530e4Arr, 162, 14);
                    LinkedHashMap A06 = AbstractC06930Yk.A06(c09530e4Arr);
                    if (!Systrace.A0E(1L)) {
                        return A06;
                    }
                    C0fO.A00(-1164752020);
                    return A06;
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-791807502);
                    }
                    throw th;
                }
            case 44:
                C160667Ia c160667Ia2 = (C160667Ia) this.A01;
                return AbstractC163367Sz.A00(c160667Ia2.A07, c160667Ia2.A0D);
            case 45:
                List A0R3 = AbstractC001900j.A0R(C18U.A04(C06090Tz.A05, ((C160677Ib) this.A01).A00, 36889568594625377L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                HashSet hashSet = new HashSet();
                Iterator it2 = A0R3.iterator();
                while (it2.hasNext()) {
                    Integer A0i = AbstractC003100w.A0i((String) it2.next());
                    if (A0i != null) {
                        hashSet.add(A0i);
                    }
                }
                return hashSet;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C1586179w(((C1585379o) this.A01).A00);
            case 47:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342154238987076056L));
            case 48:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342153294094270468L));
            default:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342154767268053766L));
        }
    }
}
