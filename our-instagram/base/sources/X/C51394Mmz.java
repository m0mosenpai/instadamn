package X;

import android.media.audiofx.AcousticEchoCanceler;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Mmz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51394Mmz extends AbstractC65852TvD {
    public final int A00;
    public final Object A01;

    public C51394Mmz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        PCJ pcj;
        C51906Mwo c51906Mwo;
        boolean z;
        C52689NTa c52689NTa;
        C51865Mw9 c51865Mw9;
        C51630MrN c51630MrN;
        C51265Mko A00;
        PCJ pcj2;
        C51906Mwo c51906Mwo2;
        OHM ohm;
        String str;
        Integer num;
        C51630MrN c51630MrN2;
        C51630MrN c51630MrN3;
        switch (this.A00) {
            case 0:
                AbstractC52562NNi abstractC52562NNi = (AbstractC52562NNi) this.A01;
                ViewPager2 viewPager2 = abstractC52562NNi.A00;
                if (viewPager2 == null) {
                    return;
                }
                viewPager2.post(new RunnableC57003PQt(abstractC52562NNi, i));
                return;
            case 1:
                PCQ pcq = (PCQ) this.A01;
                Integer num2 = pcq.A02;
                if (num2 != null && (A00 = PCQ.A00(pcq, num2.intValue())) != null && (c51906Mwo2 = (pcj2 = A00.A00).A01) != null && c51906Mwo2.A0N) {
                    pcj2.A00();
                }
                OHM ohm2 = pcq.A00;
                if (ohm2 != null && (c51865Mw9 = (c52689NTa = ohm2.A00).A00) != null && (c51630MrN = c51865Mw9.A00) != null) {
                    InterfaceC58104PpT interfaceC58104PpT = c51630MrN.A00;
                    String str2 = c51630MrN.A05;
                    Integer num3 = c51630MrN.A02;
                    if (interfaceC58104PpT != null && str2 != null && (num3 == null || num3.intValue() != i)) {
                        c52689NTa.A0Q.A03(new PF4(0L, 0L, Integer.valueOf(i)));
                    }
                }
                C51265Mko A002 = PCQ.A00(pcq, i);
                if (A002 != null && (c51906Mwo = (pcj = A002.A00).A01) != null && c51906Mwo.A0N) {
                    C51906Mwo c51906Mwo3 = pcq.A01;
                    if (c51906Mwo3 == null) {
                        C14360o3.A0F("boundViewModel");
                        throw C00O.createAndThrow();
                    }
                    boolean z2 = c51906Mwo3.A0Q;
                    InterfaceC58104PpT interfaceC58104PpT2 = c51906Mwo.A05;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append(pcj.A04.userId);
                    A1C.append('_');
                    String A0v = AbstractC166997dE.A0v(UUID.randomUUID(), A1C);
                    PJO pjo = pcj.A05;
                    MediaFrameLayout mediaFrameLayout = pcj.A08;
                    String moduleName = pcj.A03.getModuleName();
                    C46088Kam A003 = AbstractC47100Krv.A00(A0v);
                    OT1 ot1 = pcj.A07;
                    try {
                        z = AcousticEchoCanceler.isAvailable();
                    } catch (NullPointerException unused) {
                        z = false;
                    }
                    pjo.A01(interfaceC58104PpT2, mediaFrameLayout, A003, null, null, moduleName, 0, z, ot1.A00.isSpeakerphoneOn(), !z2);
                    C5TA c5ta = pjo.A01;
                    if (c5ta != null) {
                        c5ta.A0B("resume", false);
                    }
                }
                pcq.A02 = Integer.valueOf(i);
                return;
            default:
                PEV pev = (PEV) this.A01;
                if (i < pev.A06.size()) {
                    InterfaceC58104PpT interfaceC58104PpT3 = ((C51906Mwo) pev.A06.get(i)).A05;
                    if ((interfaceC58104PpT3 instanceof C51768MuY) && pev.A06.size() > 1) {
                        if (i >= 0) {
                            if (!pev.A07 && (ohm = pev.A00) != null) {
                                C52689NTa c52689NTa2 = ohm.A00;
                                C51865Mw9 c51865Mw92 = c52689NTa2.A00;
                                String str3 = null;
                                if (c51865Mw92 != null && (c51630MrN3 = c51865Mw92.A00) != null) {
                                    str = c51630MrN3.A05;
                                } else {
                                    str = null;
                                }
                                List list = c52689NTa2.A02;
                                if (list != null) {
                                    if (i < list.size() && str != null) {
                                        InterfaceC58104PpT interfaceC58104PpT4 = (InterfaceC58104PpT) list.get(i);
                                        C55177Odh c55177Odh = c52689NTa2.A0Q;
                                        C51865Mw9 c51865Mw93 = c52689NTa2.A00;
                                        if (c51865Mw93 != null && (c51630MrN2 = c51865Mw93.A00) != null) {
                                            num = c51630MrN2.A02;
                                        } else {
                                            num = null;
                                        }
                                        c55177Odh.A04(new PF5(interfaceC58104PpT4, num, str), 500L);
                                        C55095Ob6 c55095Ob6 = c52689NTa2.A0W;
                                        boolean z3 = c52689NTa2.A08;
                                        C14360o3.A0B(interfaceC58104PpT4, 0);
                                        OI6 oi6 = c55095Ob6.A04;
                                        String Ar1 = interfaceC58104PpT4.Ar1();
                                        oi6.A00(new PA7(C55095Ob6.A00(interfaceC58104PpT4), C55095Ob6.A01(interfaceC58104PpT4, null), Ar1));
                                        if (!z3) {
                                            C55133Obx c55133Obx = c55095Ob6.A03;
                                            EnumC53379NjU enumC53379NjU = EnumC53379NjU.A0F;
                                            EnumC53376NjR enumC53376NjR = EnumC53376NjR.REELS;
                                            String A0L = AbstractC001900j.A0L(Ar1, "_", Ar1);
                                            EnumC53343Nit A004 = C55129Obq.A00(interfaceC58104PpT4.Ar7());
                                            EnumC53369NjK enumC53369NjK = EnumC53369NjK.REELS;
                                            C25531Mh A005 = C55133Obx.A00(c55133Obx);
                                            if (AbstractC25226BEj.A1Z(A005)) {
                                                MSZ.A1C(enumC53379NjU, A005, null);
                                                A005.A0R("server_info", C55133Obx.A01(enumC53376NjR, A005, c55133Obx));
                                                C55133Obx.A02(A004, enumC53369NjK, A005, c55133Obx, A0L);
                                            }
                                        }
                                    }
                                    C51865Mw9 c51865Mw94 = c52689NTa2.A00;
                                    if (c51865Mw94 != null) {
                                        str3 = c51865Mw94.A01;
                                    }
                                    if (i == list.size() - 2 && str3 != null) {
                                        c52689NTa2.A0S.A00(((InterfaceC58104PpT) list.get(i)).Ar1());
                                    }
                                }
                            }
                            Integer num4 = pev.A05;
                            if (num4 == null || num4.intValue() != i) {
                                InterfaceC58295Psn A006 = PEV.A00(pev, num4);
                                if (A006 != null) {
                                    A006.Eok("hide");
                                }
                                InterfaceC58295Psn A007 = PEV.A00(pev, pev.A05);
                                if (A007 != null) {
                                    A007.Eh4(null);
                                }
                                InterfaceC58295Psn A008 = PEV.A00(pev, Integer.valueOf(i));
                                if (A008 != null) {
                                    A008.Eh4(pev.A00);
                                    A008.E4Z(interfaceC58104PpT3, pev.A04, null);
                                }
                            }
                            pev.A07 = false;
                        }
                        pev.A05 = Integer.valueOf(i);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
